package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class nx5 implements qnp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f28536a;

    public nx5(Resources resources) {
        this.f28536a = (Resources) rk1.e(resources);
    }

    public static int i(Format format) {
        int iL = ayf.l(format.l);
        if (iL != -1) {
            return iL;
        }
        if (ayf.o(format.i) != null) {
            return 2;
        }
        if (ayf.c(format.i) != null) {
            return 1;
        }
        if (format.q == -1 && format.f7818r == -1) {
            return (format.y == -1 && format.z == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // defpackage.qnp
    public String a(Format format) {
        String strJ;
        int i = i(format);
        if (i == 2) {
            strJ = j(h(format), g(format), c(format));
        } else {
            strJ = i == 1 ? j(e(format), b(format), c(format)) : e(format);
        }
        return strJ.length() == 0 ? this.f28536a.getString(g2j.D) : strJ;
    }

    public final String b(Format format) {
        int i = format.y;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f28536a.getString(g2j.q);
        }
        if (i == 2) {
            return this.f28536a.getString(g2j.z);
        }
        if (i == 6 || i == 7) {
            return this.f28536a.getString(g2j.B);
        }
        return i != 8 ? this.f28536a.getString(g2j.A) : this.f28536a.getString(g2j.C);
    }

    public final String c(Format format) {
        int i = format.h;
        return i == -1 ? "" : this.f28536a.getString(g2j.p, Float.valueOf(i / 1000000.0f));
    }

    public final String d(Format format) {
        return TextUtils.isEmpty(format.f7816b) ? "" : format.f7816b;
    }

    public final String e(Format format) {
        String strJ = j(f(format), h(format));
        return TextUtils.isEmpty(strJ) ? d(format) : strJ;
    }

    public final String f(Format format) {
        String str = format.c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (wlq.f38110a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    public final String g(Format format) {
        int i = format.q;
        int i2 = format.f7818r;
        return (i == -1 || i2 == -1) ? "" : this.f28536a.getString(g2j.f18506r, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final String h(Format format) {
        String string = (format.e & 2) != 0 ? this.f28536a.getString(g2j.s) : "";
        if ((format.e & 4) != 0) {
            string = j(string, this.f28536a.getString(g2j.v));
        }
        if ((format.e & 8) != 0) {
            string = j(string, this.f28536a.getString(g2j.u));
        }
        return (format.e & 1088) != 0 ? j(string, this.f28536a.getString(g2j.t)) : string;
    }

    public final String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f28536a.getString(g2j.o, string, str);
            }
        }
        return string;
    }
}
