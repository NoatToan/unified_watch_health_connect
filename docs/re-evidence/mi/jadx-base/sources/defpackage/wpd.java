package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class wpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38213a = new a();

    public static class a implements cl9 {
        @Override // defpackage.cl9
        public boolean a(Field field, Method method) {
            qsd qsdVar = (qsd) method.getAnnotation(qsd.class);
            return qsdVar == null || !qsdVar.value();
        }
    }

    public static String a(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String b(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[2] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }
}
