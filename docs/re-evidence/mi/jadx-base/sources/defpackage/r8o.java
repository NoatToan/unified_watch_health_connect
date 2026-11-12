package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class r8o {
    public static StackTraceElement[] a(StackTraceElement[] stackTraceElementArr, int i) {
        int length = stackTraceElementArr.length;
        if (i > 0) {
            length = Math.min(i, length);
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, length);
        return stackTraceElementArr2;
    }

    public static StackTraceElement[] b(StackTraceElement[] stackTraceElementArr, String str, int i) {
        return a(c(stackTraceElementArr, str), i);
    }

    public static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int length = stackTraceElementArr.length;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            String className = stackTraceElementArr[i2].getClassName();
            if (str != null && className.startsWith(str)) {
                i = i2 + 1;
                int i3 = length - i;
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i3];
                System.arraycopy(stackTraceElementArr, i, stackTraceElementArr2, 0, i3);
                return stackTraceElementArr2;
            }
        }
        i = 0;
        int i4 = length - i;
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr, i, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }
}
