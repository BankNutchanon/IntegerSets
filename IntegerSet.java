package Lip;
import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer>Number; //Rep

    // RI:
    //  - Numbers must not contain duplicate characters.
    //  - characters in Numbers must be sorted in ascending order.
    //
    // AF:
    //  - AF(Numbers) = the set of characters in the string Numbers.



    //สร้าง Instance ของ IntegerSet ซึ่งเริ่มต้นเป็นเซตว่าง
    
    public IntegerSet(){
        Number = new ArrayList<>();
    }
    /**
     * ตรวจสอบว่า RI ถูกต้องหรือไม่
     * หากไม่ถูกต้อง (มีค่าซ้ำ หรือไม่เรียงจากน้อยไปมาก) จะโยน RuntimeException
     */
    private void checkRep(){ 
        if (Number == null) {
            throw new RuntimeException("Number null.");
        }
        if (Number.size()>1) {
            for (int i = 0; i < Number.size() - 1; i++) {
                if (Number.get(i) >= Number.get(i + 1)) {
                throw new RuntimeException("RI violated: duplicates or not sorted.");
                }
            }
        }
        
    }
    /* เพิ่มค่าจำนวนเต็ม x เข้าไปในเซต
     * หาก x เป็น null หรือมีอยู่แล้วในเซต จะไม่ทำอะไร
     * ค่าที่เพิ่มจะถูกใส่ในตำแหน่งที่เหมาะสมให้ยังคงเรียงจากน้อยไปมาก
     *  x จำนวนเต็มที่จะเพิ่ม
     */
     public void add(Integer x) {       
             if (x == null) return;        
             if (contains(x)) return;           

             int index = 0;
        while (index < Number.size() && Number.get(index) < x) {
                index++;                         
    }

             Number.add(index, x);               
             checkRep();   
        }
     public String toString(){
            return Number.toString();
     }   
    /**
     * ลบค่า x ออกจากเซต หากไม่มีอยู่จะไม่ทำอะไร
     * @param x จำนวนเต็มที่ต้องการลบ
     */
        public void remove(Integer x) { //ลบเลขออกจากเซต
            Number.remove(x);       
             checkRep();  
        }
    /**
     * ตรวจสอบว่าเซตมีค่า x หรือไม่
     * @param x ค่าที่ต้องการตรวจสอบ
     * @return true ถ้ามีค่า x อยู่ในเซต, false ถ้าไม่พบ
     */
 public boolean contains(Integer x) { 
             return Number.contains(x); 
    }
    /**
     * คืนขนาดของเซต (จำนวนสมาชิก)
     *
     * @return จำนวนสมาชิกในเซต
     */
    public int size(){
        return Number.size();
    }
}