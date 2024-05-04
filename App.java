package exemple;

/**
 * كلاس يحتوي على دالة لحساب المجموع.
 */
public class App {
    
    /**
     * تقوم هذه الدالة بحساب مجموع مصفوفة من الأعداد الصحيحة.
     *
     * @param numbers مصفوفة تحتوي على الأعداد التي سيتم جمعها.
     * @return المجموع الكلي للأعداد في المصفوفة.
     * @throws NullPointerException إذا كانت المصفوفة المعطاة تساوي null.
     */
    public static int calculateSum(int[] numbers) {
        // تحقق من أن المصفوفة ليست فارغة
        if (numbers == null) {
            throw new NullPointerException("مصفوفة الأعداد لا يمكن أن تكون null");
        }

        // حساب المجموع
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
