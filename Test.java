package self.operator;

public class Test {
    // 这个类中定义的所有方法都是基于移位运算、与运算、或运算、非运算、&&运算符、||运算符、==运算符和!=运算符实现的
    // 不依赖于+运算符、-运算符、*运算符、/运算符、%运算符、>运算符、<运算符、>=运算符和<=运算符
    // 用于实现加法运算、减法运算、乘法运算、除法运算、取模运算、比较运算

    public static void main(String[] args) {
        System.out.printf("%d / %d is %d\n", 7, 3, 7 / 3);
        System.out.printf("%d %% %d is %d\n", 7, 3, 7 % 3);
        System.out.printf("%d / %d is %d\n", 7, -3, 7 / -3);
        System.out.printf("%d %% %d is %d\n", 7, -3, 7 % -3);
        System.out.printf("%d / %d is %d\n", -7, 3, -7 / 3);
        System.out.printf("%d %% %d is %d\n", -7, 3, -7 % 3);
        System.out.printf("%d / %d is %d\n", -7, -3, -7 / -3);
        System.out.printf("%d %% %d is %d\n", -7, 3, -7 % -3);
        System.out.printf("%d / %d is %d\n", 0, 3, 0 / 3);
        System.out.printf("%d %% %d is %d\n", 0, 3, 0 % 3);
        System.out.printf("%d / %d is %d\n", 0, -3, 0 / -3);
        System.out.printf("%d %% %d is %d\n", 0, -3, 0 % -3);
        System.out.printf("%d / %d is %d\n", 0, 3, 0 / 3);
        System.out.printf("%d %% %d is %d\n", 0, 3, 0 % 3);
        System.out.printf("%d / %d is %d\n", 0, -3, 0 / -3);
        System.out.printf("%d %% %d is %d\n", 0, -3, 0 % -3);

        System.out.printf("存在编程语言使得%d + (%d) = %d\n", Integer.MIN_VALUE, -1, Integer.MIN_VALUE + (-1));

        int i;
        int num1;
        int num2;
        int[] ints1 = { 1, -1, 0, 0X40000000, 0 };
        int[] ints2 = { 0, 0, -1, 0X3FFFFFFF, 0 };
        i = 0;
        while (i < ints1.length) {
            num1 = ints1[i];
            num2 = ints2[i];
            if ((num1 > num2) != isGreater(num1, num2)) {
                System.out.printf("((%d) > (%d)) != isGreater(%d, %d)\n", num1, num2, num1, num2);
                break;
            } else {
                System.out.printf("isGreater(%d, %d) is %b\n", num1, num2, num1 > num2);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints1.length, i == ints1.length);

        i = 0;
        while (i < ints1.length) {
            num1 = ints1[i];
            num2 = ints2[i];
            if ((num2 < num1) != isLess(num2, num1)) {
                System.out.printf("((%d) < (%d)) != isLess(%d, %d)\n", num2, num1, num2, num1);
                break;
            } else {
                System.out.printf("isLess(%d, %d) is %b\n", num2, num1, num2 < num1);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints1.length, i == ints1.length);

        i = 0;
        while (i < ints1.length) {
            num1 = ints1[i];
            num2 = ints2[i];
            if ((num2 <= num1) != isLessOrEqual(num2, num1)) {
                System.out.printf("((%d) <= (%d)) != isLessOrEqual(%d, %d)\n", num2, num1, num2, num1);
                break;
            } else {
                System.out.printf("isLessOrEqual(%d, %d) is %b\n", num2, num1, num2 <= num1);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints1.length, i == ints1.length);

        i = 0;
        while (i < ints1.length) {
            num1 = ints1[i];
            num2 = ints2[i];
            if ((num1 >= num2) != isGreaterOrEqual(num1, num2)) {
                System.out.printf("((%d) >= (%d)) != isGreaterOrEqual(%d, %d)\n", num1, num2, num1, num2);
                break;
            } else {
                System.out.printf("isGreaterOrEqual(%d, %d) is %b\n", num1, num2, num1 >= num2);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints1.length, i == ints1.length);

        int[] ints3 = { 0, 1, -1, 0B11, 0B1011, Integer.MAX_VALUE, Integer.MIN_VALUE };
        i = 0;
        while (i < ints3.length) {
            if (increment(ints3[i]) != (ints3[i] + 1)) {
                System.out.printf("increment(%d) != %d\n", ints1[i], ints1[i] + 1);
                break;
            } else {
                System.out.printf("increment(%d) is %d\n", ints3[i], ints3[i] + 1);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints3.length, i == ints3.length);

        int[] ints4 = { 0, 0, 1, 0B11, -1, Integer.MAX_VALUE };
        int[] ints5 = { 0, 1, 1, 0B11, 1, 1 };
        i = 0;
        while (i < ints4.length) {
            if (add(ints4[i], ints5[i]) != (ints4[i] + ints5[i])) {
                System.out.printf("add(%d, %d) != ((%d) + (%d))\n", ints4[i], ints5[i], ints4[i], ints5[i]);
                break;
            } else {
                System.out.printf("add(%d, %d) is %d\n", ints4[i], ints5[i], ints4[i] + ints5[i]);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints4.length, i == ints4.length);

        int[] ints6 = { 0, -1, -1, -0B11, -1, -1 };
        i = 0;
        while (i < ints4.length) {
            if (subtract(ints4[i], ints6[i]) != (ints4[i] - ints6[i])) {
                System.out.printf("subtract(%d, %d) != ((%d) - (%d))\n", ints4[i], ints6[i], ints4[i], ints6[i]);
                break;
            } else {
                System.out.printf("subtract(%d, %d) is %d\n", ints4[i], ints6[i], ints4[i] - ints6[i]);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints4.length, i == ints4.length);

        int[] ints7 = { 0, 0, 1, 3, -4, Integer.MIN_VALUE, Integer.MAX_VALUE };
        int[] ints8 = { 0, 1, 0, 2, -5, -1, 2 };

        i = 0;
        while (i < ints7.length) {
            if (multiply(ints7[i], ints8[i]) != (ints7[i] * ints8[i])) {
                System.out.printf("multiply(%d, %d) != ((%d) * (%d))\n", ints7[i], ints8[i], ints7[i], ints8[i]);
                break;
            } else {
                System.out.printf("multiply(%d, %d) is %d\n", ints7[i], ints8[i], ints7[i] * ints8[i]);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints7.length, i == ints7.length);

        int[] ints10 = { 7, 7, -7, -7, 1, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE,
                Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE,
                Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1, Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 0, 1, -1,
                Integer.MAX_VALUE };
        int[] ints11 = { 3, -3, 3, -3, 0, 3, -3, 1, -1, 1, -1, 2, -2, 2, -2, 1, -1, Integer.MIN_VALUE,
                Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };

        i = 0;
        int[] divideAndRemainder = { 0, 0 };
        while (i < ints10.length) {
            try {
                divideAndRemainder = division(ints10[i], ints11[i]);
            } catch (Exception e) {
                System.err.printf("%s\n", e.getMessage());
                i++;
                continue;
            }
            if ((divideAndRemainder[0] != (ints10[i] / ints11[i]))
                    || (divideAndRemainder[1] != (ints10[i] % ints11[i]))) {
                System.out.printf("(division(%d, %d)[0] = %d != %d) || (division(%d, %d)[1] = %d != %d)\n", ints10[i],
                        ints11[i], divideAndRemainder[0], ints10[i] / ints11[i], ints10[i], ints11[i],
                        divideAndRemainder[1], ints10[i] % ints11[i]);
                break;
            } else {
                System.out.printf("division(%d, %d)[0] is %d. division(%d, %d)[1] is %d\n", ints10[i], ints11[i],
                        ints10[i] / ints11[i], ints10[i], ints11[i], ints10[i] % ints11[i]);
            }
            i++;
        }

        System.out.printf("%d == %d is %b\n", i, ints10.length, i == ints10.length);

        return;
    }

    public static boolean isGreater(int num1, int num2) { // 返回num1 > num2
        int num1Sign = num1 & 0X80000000;
        if (num1Sign != (num2 & 0X80000000)) {
            if (num1Sign == 0) {
                return true; // 符号位不同且num1的符号位为0则有num1 >= 0 > num2
            } else {
                return false; // 符号位不同且num1的符号位为1则有num1 < 0 <= num2
            }
        } else {
            int bit = 0X40000000;
            int num1Bit;
            while (bit != 0) {
                num1Bit = (num1 & bit);
                if (num1Bit != (num2 & bit)) {
                    if (num1Bit == 0) {
                        return false; // 符号位相同，则如果存在不同的位，则不同的位中最高的位为0则有num1 < num2
                    } else {
                        return true; // 符号位相同，则如果存在不同的位，则不同的位中最高的位为1则有num1 > num2
                    }
                } else {
                    bit = bit >>> 1;
                }
            }
        }

        return false; // 前面没有执行return语句则说明num1等于num2
    }

    public static boolean isGreaterOrEqual(int num1, int num2) { // 返回num1 >= num2
        return isGreater(num1, num2) || (num1 == num2);
    }

    public static boolean isLess(int num1, int num2) { // 返回num1 < num2
        return !isGreaterOrEqual(num1, num2);
    }

    public static boolean isLessOrEqual(int num1, int num2) { // 返回num1 <= num2
        return isLess(num1, num2) || (num1 == num2);
    }

    public static int increment(int num) {
        // 当num不等于Integer.MAX_VALUE时，返回num + 1
        // 当num等于Integer.MAX_VALUE时，返回Integer.MIN_VALUE
        int carry = 1;
        while (carry != 0) {
            if ((num & carry) == 0) { // 如果为真，则num + carry = num | carry
                return (num | carry);
            } else {
                num = num & (~carry); // 等价于num = num - carry
                carry = carry << 1;
            }
        }

        return 0; // 前面没有执行return语句则说明num在执行循环前全为1，即num等于-1，所以加1后返回0
    }

    public static int add(int num1, int num2) {
        // 在没有溢出的情况下返回num1加num2的和。不论是否溢出，返回值为程序上的num1 + num2
        int result = 0;
        int isCarry = 0;
        int num1low;
        int num2low;
        int bit = 0X1;
        while (bit != 0) {
            num1low = num1 & bit;
            num2low = num2 & bit;
            if ((num1low == bit) && (num2low == bit) && (isCarry == 1)) {
                result = result | bit;
            } else if (((num1low == 0) && (num2low == 0) && (isCarry == 1))
                    || ((num1low == bit) && (num2low == 0) && (isCarry == 0))
                    || ((num1low == 0) && (num2low == bit) && (isCarry == 0))) {
                result = result | bit;
                isCarry = 0;
            } else if (((num1low == bit) && (num2low == bit) && (isCarry == 0))
                    || ((num1low == bit) && (num2low == 0) && (isCarry == 1))
                    || ((num1low == 0) && (num2low == bit) && (isCarry == 1))) {
                isCarry = 1;
            }
            bit = bit << 1;
        }

        return result;
    }

    public static int subtract(int minuend, int subtrahend) {
        // 在没有溢出的情况下返回minuend减subtrahend的差。不论是否溢出，返回值为程序上的minuend - subtrahend
        return add(minuend, add(~subtrahend, 1));
    }

    public static int multiply(int num1, int num2) {
        // 基于加法器的乘法
        // 在没有溢出的情况下返回min1乘于num2的积。不论是否溢出，返回值为程序上的num1 * num2
        int result = 0;
        int bit = 0X80000000;
        while (bit != 0) {
            result = result << 1;
            if ((num2 & bit) == bit) {
                result = add(result, num1);
            }
            bit = bit >>> 1;
        }
        return result;
    }

    private static int[] AllLessZeroDivision(int dividend, int divisor) {
        // 此方法只允许dividend小于等于0且divisor小于0
        // 不论是否溢出，返回值为程序上的{dividend / divisor, dividend % divisor}
        int[] result = { 0, 0 };
        int shiftDivisor = divisor;
        while (isGreaterOrEqual(shiftDivisor, 0XC0000000) && isGreaterOrEqual(shiftDivisor << 1, dividend)) {
            shiftDivisor = (shiftDivisor << 1);
        }

        while (isLess(shiftDivisor, divisor)) {
            result[0] = result[0] << 1;
            if (isGreaterOrEqual(shiftDivisor, dividend)) {
                result[0] = add(result[0], 1);
                dividend = subtract(dividend, shiftDivisor);
            }

            shiftDivisor = (shiftDivisor >> 1);
        }

        result[0] = result[0] << 1;
        if (isGreaterOrEqual(shiftDivisor, dividend)) {
            result[0] = add(result[0], 1);
            dividend = subtract(dividend, shiftDivisor);
        }

        result[1] = dividend;
        return result;
    }

    public static int[] division(int dividend, int divisor) {
        // 基于加法器的除法
        // divisor不能为0
        // divisor不为0的情况下，不论是否溢出，返回值为{dividend / divisor, dividend % divisor}
        if (divisor == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int[] result = { 0, 0 };
        if (isLess(dividend, 0) && isLess(divisor, 0)) {
            return AllLessZeroDivision(dividend, divisor);
        } else if (isGreaterOrEqual(dividend, 0) && isGreater(divisor, 0)) {
            result = AllLessZeroDivision(subtract(0, dividend), subtract(0, divisor));
            result[1] = subtract(0, result[1]);
        } else if (isGreaterOrEqual(dividend, 0) && isLess(divisor, 0)) {
            result = AllLessZeroDivision(subtract(0, dividend), divisor);
            result[0] = subtract(0, result[0]);
            result[1] = subtract(0, result[1]);
        } else if (isLess(dividend, 0) && isGreater(divisor, 0)) {
            result = AllLessZeroDivision(dividend, subtract(0, divisor));
            result[0] = subtract(0, result[0]);
        }

        return result;
    }
}