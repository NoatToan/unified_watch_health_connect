package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpc {
    public static byte[] e() {
        return eeq.c(eeq.d(1) + eeq.d(0));
    }

    public static byte[] c(long j, long j2) {
        String str = ("" + eeq.d(1)) + eeq.d(0);
        if (j != 0) {
            String str2 = (str + eeq.d(3) + eeq.d(4)) + eeq.c(j);
            if (j2 != 0) {
                str = (str2 + eeq.d(4) + eeq.d(4)) + eeq.c(j2);
            } else {
                str = str2;
            }
        }
        return eeq.c(str);
    }

    public static byte[] a(int i) {
        return eeq.c(((("" + eeq.d(129)) + eeq.d(4)) + eeq.d(2)) + eeq.d(2) + eeq.e(i));
    }

    public static byte[] d(int i, int i2) {
        return eeq.c(((((("" + eeq.d(129)) + eeq.d(8)) + eeq.d(2)) + eeq.d(2) + eeq.e(i)) + eeq.d(3)) + eeq.d(2) + eeq.e(i2));
    }

    public static byte[] a(long j, long j2) {
        String str = eeq.d(129) + eeq.d(0);
        if (j != 0) {
            String str2 = (str + eeq.d(3) + eeq.d(4)) + eeq.c(j);
            if (j2 != 0) {
                str = (str2 + eeq.d(4) + eeq.d(4)) + eeq.c(j2);
            } else {
                str = str2;
            }
        }
        return eeq.c(str);
    }

    public static byte[] b(int i) {
        return eeq.c(((("" + eeq.d(129)) + eeq.d(4)) + eeq.d(2)) + eeq.d(2) + eeq.e(i));
    }

    public static byte[] d(long j, long j2) {
        String str = eeq.d(129) + eeq.d(0);
        if (j != 0) {
            String str2 = (str + eeq.d(3) + eeq.d(4)) + eeq.c(j);
            if (j2 != 0) {
                str = (str2 + eeq.d(4) + eeq.d(4)) + eeq.c(j2);
            } else {
                str = str2;
            }
        }
        return eeq.c(str);
    }

    public static byte[] c(int i) {
        return eeq.c(((("" + eeq.d(129)) + eeq.d(4)) + eeq.d(2)) + eeq.d(2) + eeq.e(i));
    }

    public static byte[] e(List<mhl> list) {
        StringBuffer stringBuffer = new StringBuffer(16);
        int i = 0;
        for (mhl mhlVar : list) {
            stringBuffer.append(eeq.d(2));
            stringBuffer.append(eeq.d(5));
            stringBuffer.append(eeq.d(mhlVar.b()));
            stringBuffer.append(eeq.d(mhlVar.c()));
            stringBuffer.append(eeq.e(mhlVar.e()));
            stringBuffer.append(eeq.d(mhlVar.a()));
            i += 7;
        }
        return eeq.c(eeq.d(129) + eeq.d(i) + stringBuffer.toString());
    }

    public static byte[] a() {
        return eeq.c(eeq.d(1) + eeq.d(1) + eeq.d(1));
    }
}
