package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes4.dex */
public class ov5 implements l4d.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29717b;
    public static final int c;
    public static final byte[] d;
    public static final int e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f29718k;
    public static final String[] l;
    public static final int m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29719a = bhd.a(21, 20, c, e, 6, i, f29718k, m);

    static {
        byte[] bArr = {-1, -40, -1};
        f29717b = bArr;
        c = bArr.length;
        byte[] bArr2 = {-119, SettingsModule.VALUE_TYPE_FLAG, 78, 71, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10, 26, 10};
        d = bArr2;
        e = bArr2.length;
        f = n4d.a("GIF87a");
        g = n4d.a("GIF89a");
        byte[] bArrA = n4d.a("BM");
        h = bArrA;
        i = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        j = bArr3;
        f29718k = bArr3.length;
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
        l = strArr;
        m = n4d.a("ftyp" + strArr[0]).length;
    }

    public static l4d c(byte[] bArr, int i2) {
        b6i.b(icr.h(bArr, 0, i2));
        if (icr.g(bArr, 0)) {
            return pv5.f;
        }
        if (icr.f(bArr, 0)) {
            return pv5.g;
        }
        if (!icr.c(bArr, 0, i2)) {
            return l4d.c;
        }
        if (icr.b(bArr, 0)) {
            return pv5.j;
        }
        return icr.d(bArr, 0) ? pv5.i : pv5.h;
    }

    public static boolean d(byte[] bArr, int i2) {
        byte[] bArr2 = h;
        if (i2 < bArr2.length) {
            return false;
        }
        return n4d.c(bArr, bArr2);
    }

    public static boolean e(byte[] bArr, int i2) {
        if (i2 < 6) {
            return false;
        }
        return n4d.c(bArr, f) || n4d.c(bArr, g);
    }

    public static boolean f(byte[] bArr, int i2) {
        if (i2 < m || bArr[3] < 8) {
            return false;
        }
        for (String str : l) {
            if (n4d.b(bArr, bArr.length, n4d.a("ftyp" + str), m) > -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(byte[] bArr, int i2) {
        byte[] bArr2 = j;
        if (i2 < bArr2.length) {
            return false;
        }
        return n4d.c(bArr, bArr2);
    }

    public static boolean h(byte[] bArr, int i2) {
        byte[] bArr2 = f29717b;
        return i2 >= bArr2.length && n4d.c(bArr, bArr2);
    }

    public static boolean i(byte[] bArr, int i2) {
        byte[] bArr2 = d;
        return i2 >= bArr2.length && n4d.c(bArr, bArr2);
    }

    @Override // l4d.a
    public final l4d a(byte[] bArr, int i2) {
        b6i.g(bArr);
        if (icr.h(bArr, 0, i2)) {
            return c(bArr, i2);
        }
        if (h(bArr, i2)) {
            return pv5.f30818a;
        }
        if (i(bArr, i2)) {
            return pv5.f30819b;
        }
        if (e(bArr, i2)) {
            return pv5.c;
        }
        if (d(bArr, i2)) {
            return pv5.d;
        }
        if (g(bArr, i2)) {
            return pv5.e;
        }
        return f(bArr, i2) ? pv5.f30820k : l4d.c;
    }

    @Override // l4d.a
    public int b() {
        return this.f29719a;
    }
}
