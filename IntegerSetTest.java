package Lip;

public class IntegerSetTest {
    public static void main(String[] args) {
        System.out.println("--- Starting IntegerSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        // Test 1: สร้าง, เพิ่ม, เรียงลำดับข้อมูล
        System.out.println("\n--- Test 1: Add and Sort ---");
        IntegerSet set1 = new IntegerSet();
        set1.add(30);
        set1.add(50);
        set1.add(70);
        String expected1 = "[30, 50, 70]";
        if (set1.toString().equals(expected1)) {
            System.out.println("PASSED: Add and Sorting works.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected1 + " but got " + set1.toString());
            failed++;
        }

        // Test 2: เพิ่มข้อมูลซ้ำ
        System.out.println("\n--- Test 2: Add Duplicate ---");
        set1.add(50);
        if (set1.size() == 3) {
            System.out.println("PASSED: Adding Duplicate does not change size.");
            passed++;
        } else {
            System.out.println("FAILED: Size should be 3 but got " + set1.size());
            failed++;
        }

        // Test 3: ลบข้อมูล
        System.out.println("\n--- Test 3: Remove element ---");
        set1.remove(30);
        String expected2 = "[50, 70]";
        if (set1.toString().equals(expected2)) {
            System.out.println("PASSED: Remove works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected2 + " but got " + set1.toString());
            failed++;
        }
        // Test 4: ตรวจสอบข้อมูล
        System.out.println("\n--- Test 4: contains() ---");
        if (set1.contains(50) && !set1.contains(100)) {
            System.out.println("PASSED: contains() works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: contains() check failed.");
            failed++;
        }

        // Summary
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
        
    }
}