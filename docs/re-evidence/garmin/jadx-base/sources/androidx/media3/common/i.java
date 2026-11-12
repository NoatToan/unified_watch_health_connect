package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f8308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f8309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f8310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f8311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f8312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f8313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f8314n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8321g;

    static {
        b bVar = new b();
        bVar.f8322a = 1;
        bVar.f8323b = 2;
        bVar.f8324c = 3;
        f8308h = bVar.a();
        b bVar2 = new b();
        bVar2.f8322a = 1;
        bVar2.f8323b = 1;
        bVar2.f8324c = 2;
        bVar2.a();
        int i14 = fa.z.f70071a;
        f8309i = Integer.toString(0, 36);
        f8310j = Integer.toString(1, 36);
        f8311k = Integer.toString(2, 36);
        f8312l = Integer.toString(3, 36);
        f8313m = Integer.toString(4, 36);
        f8314n = Integer.toString(5, 36);
    }

    private i(int i14, int i15, int i16, byte[] bArr, int i17, int i18) {
        this.f8315a = i14;
        this.f8316b = i15;
        this.f8317c = i16;
        this.f8318d = bArr;
        this.f8319e = i17;
        this.f8320f = i18;
    }

    public static String a(int i14) {
        if (i14 == -1) {
            return "Unset color range";
        }
        if (i14 != 1) {
            return i14 != 2 ? am.j.h(i14, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i14) {
        if (i14 == -1) {
            return "Unset color space";
        }
        if (i14 == 6) {
            return "BT2020";
        }
        if (i14 != 1) {
            return i14 != 2 ? am.j.h(i14, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i14) {
        if (i14 == -1) {
            return "Unset color transfer";
        }
        if (i14 == 10) {
            return "Gamma 2.2";
        }
        if (i14 == 1) {
            return "Linear";
        }
        if (i14 == 2) {
            return "sRGB";
        }
        if (i14 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i14 != 6) {
            return i14 != 7 ? am.j.h(i14, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static i d(Bundle bundle) {
        return new i(bundle.getInt(f8309i, -1), bundle.getInt(f8310j, -1), bundle.getInt(f8311k, -1), bundle.getByteArray(f8312l), bundle.getInt(f8313m, -1), bundle.getInt(f8314n, -1));
    }

    public static boolean f(i iVar) {
        if (iVar == null) {
            return true;
        }
        int i14 = iVar.f8315a;
        if (i14 != -1 && i14 != 1 && i14 != 2) {
            return false;
        }
        int i15 = iVar.f8316b;
        if (i15 != -1 && i15 != 2) {
            return false;
        }
        int i16 = iVar.f8317c;
        if ((i16 != -1 && i16 != 3) || iVar.f8318d != null) {
            return false;
        }
        int i17 = iVar.f8320f;
        if (i17 != -1 && i17 != 8) {
            return false;
        }
        int i18 = iVar.f8319e;
        return i18 == -1 || i18 == 8;
    }

    public static int g(int i14) {
        if (i14 == 1) {
            return 1;
        }
        if (i14 != 9) {
            return (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int h(int i14) {
        if (i14 == 1) {
            return 3;
        }
        if (i14 == 4) {
            return 10;
        }
        if (i14 == 13) {
            return 2;
        }
        if (i14 == 16) {
            return 6;
        }
        if (i14 != 18) {
            return (i14 == 6 || i14 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean e() {
        return (this.f8315a == -1 || this.f8316b == -1 || this.f8317c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f8315a == iVar.f8315a && this.f8316b == iVar.f8316b && this.f8317c == iVar.f8317c && Arrays.equals(this.f8318d, iVar.f8318d) && this.f8319e == iVar.f8319e && this.f8320f == iVar.f8320f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8321g == 0) {
            this.f8321g = ((((Arrays.hashCode(this.f8318d) + ((((((527 + this.f8315a) * 31) + this.f8316b) * 31) + this.f8317c) * 31)) * 31) + this.f8319e) * 31) + this.f8320f;
        }
        return this.f8321g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColorInfo(");
        sb3.append(b(this.f8315a));
        sb3.append(", ");
        sb3.append(a(this.f8316b));
        sb3.append(", ");
        sb3.append(c(this.f8317c));
        sb3.append(", ");
        sb3.append(this.f8318d != null);
        sb3.append(", ");
        int i14 = this.f8319e;
        sb3.append(i14 != -1 ? androidx.core.view.j.f(i14, "bit Luma") : "NA");
        sb3.append(", ");
        int i15 = this.f8320f;
        return am.j.o(i15 != -1 ? androidx.core.view.j.f(i15, "bit Chroma") : "NA", ")", sb3);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f8325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8327f;

        private b(i iVar) {
            this.f8322a = iVar.f8315a;
            this.f8323b = iVar.f8316b;
            this.f8324c = iVar.f8317c;
            this.f8325d = iVar.f8318d;
            this.f8326e = iVar.f8319e;
            this.f8327f = iVar.f8320f;
        }

        public final i a() {
            return new i(this.f8322a, this.f8323b, this.f8324c, this.f8325d, this.f8326e, this.f8327f);
        }

        public b() {
            this.f8322a = -1;
            this.f8323b = -1;
            this.f8324c = -1;
            this.f8326e = -1;
            this.f8327f = -1;
        }
    }
}
