package defpackage;

import androidx.room.FtsOptions;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.TextTransform;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes4.dex */
public class m7p {
    public final yej C;
    public int e;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25852a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f25853b = Float.NaN;
    public boolean c = false;
    public boolean d = true;
    public boolean f = false;
    public int h = -1;
    public int i = -1;
    public float j = -1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f25854k = -1.0f;
    public float l = Float.NaN;
    public int m = 0;
    public int n = 1;
    public int o = 0;
    public TextTransform p = TextTransform.UNSET;
    public float q = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f25855r = 0.0f;
    public float s = 1.0f;
    public int t = 1426063360;
    public boolean u = false;
    public boolean v = false;
    public boolean w = true;
    public int x = -1;
    public int y = -1;
    public String z = null;
    public boolean A = false;
    public float B = Float.NaN;

    public m7p(yej yejVar) {
        this.C = yejVar;
        v(f("numberOfLines", -1));
        u(e("lineHeight", -1.0f));
        t(e("letterSpacing", Float.NaN));
        l(a("allowFontScaling", true));
        w(i("textAlign"));
        p(e("fontSize", -1.0f));
        n(yejVar.f("color") ? Integer.valueOf(yejVar.c("color", 0)) : null);
        n(yejVar.f("foregroundColor") ? Integer.valueOf(yejVar.c("foregroundColor", 0)) : null);
        m(yejVar.f("backgroundColor") ? Integer.valueOf(yejVar.c("backgroundColor", 0)) : null);
        o(i("fontFamily"));
        r(i("fontWeight"));
        q(i("fontStyle"));
        s(a("includeFontPadding", true));
        y(i("textDecorationLine"));
        x(i("textBreakStrategy"));
        A(yejVar.f("textShadowOffset") ? yejVar.d("textShadowOffset") : null);
        B(f("textShadowRadius", 1));
        z(f("textShadowColor", 1426063360));
        C(i("textTransform"));
    }

    public static int k(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public void A(ReadableMap readableMap) {
        this.q = 0.0f;
        this.f25855r = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.q = exh.b(readableMap.getDouble("width"));
            }
            if (!readableMap.hasKey("height") || readableMap.isNull("height")) {
                return;
            }
            this.f25855r = exh.b(readableMap.getDouble("height"));
        }
    }

    public void B(float f) {
        if (f != this.s) {
            this.s = f;
        }
    }

    public void C(String str) {
        if (str == null || "none".equals(str)) {
            this.p = TextTransform.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.p = TextTransform.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.p = TextTransform.LOWERCASE;
        } else {
            if ("capitalize".equals(str)) {
                this.p = TextTransform.CAPITALIZE;
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
    }

    public final boolean a(String str, boolean z) {
        return this.C.f(str) ? this.C.a(str, z) : z;
    }

    public float b() {
        return g("paddingBottom");
    }

    public float c() {
        if (!Float.isNaN(this.f25852a) && !Float.isNaN(this.B)) {
            float f = this.B;
            if (f > this.f25852a) {
                return f;
            }
        }
        return this.f25852a;
    }

    public float d() {
        return g("paddingEnd");
    }

    public final float e(String str, float f) {
        return this.C.f(str) ? this.C.b(str, f) : f;
    }

    public final int f(String str, int i) {
        return this.C.f(str) ? this.C.c(str, i) : i;
    }

    public final float g(String str) {
        return this.C.f("padding") ? exh.c(e("padding", 0.0f)) : exh.c(e(str, 0.0f));
    }

    public float h() {
        return g("paddingStart");
    }

    public final String i(String str) {
        if (this.C.f(str)) {
            return this.C.e(str);
        }
        return null;
    }

    public float j() {
        return g("paddingTop");
    }

    public void l(boolean z) {
        if (z != this.d) {
            this.d = z;
            p(this.j);
            u(this.f25854k);
            t(this.l);
        }
    }

    public void m(Integer num) {
        boolean z = num != null;
        this.f = z;
        if (z) {
            this.g = num.intValue();
        }
    }

    public void n(Integer num) {
        boolean z = num != null;
        this.c = z;
        if (z) {
            this.e = num.intValue();
        }
    }

    public void o(String str) {
        this.z = str;
    }

    public void p(float f) {
        this.j = f;
        if (f != -1.0f) {
            f = (float) (this.d ? Math.ceil(exh.d(f)) : Math.ceil(exh.c(f)));
        }
        this.i = (int) f;
    }

    public void q(String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        if (i != this.x) {
            this.x = i;
        }
    }

    public void r(String str) {
        int i = -1;
        int iK = str != null ? k(str) : -1;
        if (iK >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (iK != -1 && iK < 500)) {
            i = 0;
        }
        if (i != this.y) {
            this.y = i;
        }
    }

    public void s(boolean z) {
        this.w = z;
    }

    public void t(float f) {
        this.l = f;
        this.f25853b = this.d ? exh.d(f) : exh.c(f);
    }

    public void u(float f) {
        this.f25854k = f;
        if (f == -1.0f) {
            this.f25852a = Float.NaN;
        } else {
            this.f25852a = this.d ? exh.d(f) : exh.c(f);
        }
    }

    public void v(int i) {
        if (i == 0) {
            i = -1;
        }
        this.h = i;
    }

    public void w(String str) {
        if ("justify".equals(str)) {
            this.o = 1;
            this.m = 3;
            return;
        }
        this.o = 0;
        if (str == null || "auto".equals(str)) {
            this.m = 0;
            return;
        }
        if ("left".equals(str)) {
            this.m = 3;
            return;
        }
        if (TSMAuthContants.PARAM_KEY_RIGHT.equals(str)) {
            this.m = 5;
        } else {
            if ("center".equals(str)) {
                this.m = 1;
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
        }
    }

    public void x(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.n = 1;
            return;
        }
        if (FtsOptions.TOKENIZER_SIMPLE.equals(str)) {
            this.n = 0;
        } else {
            if ("balanced".equals(str)) {
                this.n = 2;
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        }
    }

    public void y(String str) {
        this.u = false;
        this.v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.v = true;
                }
            }
        }
    }

    public void z(int i) {
        if (i != this.t) {
            this.t = i;
        }
    }
}
