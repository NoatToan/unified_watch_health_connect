package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class j4h extends yk8 {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
