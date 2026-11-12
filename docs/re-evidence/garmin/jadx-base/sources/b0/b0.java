package b0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f13853c = new b0(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f13854d = new b0(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f13855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f13856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f13857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f13858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f13859i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13861b;

    static {
        new b0(2, 10);
        f13855e = new b0(3, 10);
        f13856f = new b0(4, 10);
        f13857g = new b0(5, 10);
        f13858h = new b0(6, 10);
        f13859i = new b0(6, 8);
    }

    public b0(int i14, int i15) {
        this.f13860a = i14;
        this.f13861b = i15;
    }

    public final boolean a() {
        return b() && this.f13860a != 1 && this.f13861b == 10;
    }

    public final boolean b() {
        int i14 = this.f13860a;
        return (i14 == 0 || i14 == 2 || this.f13861b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f13860a == b0Var.f13860a && this.f13861b == b0Var.f13861b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13860a ^ 1000003) * 1000003) ^ this.f13861b;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("DynamicRange@");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("{encoding=");
        switch (this.f13860a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb3.append(str);
        sb3.append(", bitDepth=");
        return am.j.q(sb3, this.f13861b, StringSubstitutor.DEFAULT_VAR_END);
    }
}
