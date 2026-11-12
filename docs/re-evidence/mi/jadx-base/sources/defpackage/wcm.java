package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class wcm implements uta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yb4 f37849a;

    public interface a {
        mc4 a(String str, lc4 lc4Var);
    }

    public static class b implements uta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yb4 f37850a;

        public b(yb4 yb4Var) {
            this.f37850a = yb4Var;
        }

        @Override // defpackage.zb4
        public ic4 a(xb4 xb4Var, String str) {
            yb4 yb4Var = this.f37850a;
            return yb4Var instanceof zb4 ? ((zb4) yb4Var).a(xb4Var, str) : wcm.i(xb4Var, str);
        }

        @Override // defpackage.bc4
        public ic4 b(xb4 xb4Var, URL url) {
            yb4 yb4Var = this.f37850a;
            return yb4Var instanceof bc4 ? ((bc4) yb4Var).b(xb4Var, url) : wcm.j(xb4Var, url);
        }

        @Override // defpackage.ac4
        public ic4 c(xb4 xb4Var, File file) {
            yb4 yb4Var = this.f37850a;
            return yb4Var instanceof ac4 ? ((ac4) yb4Var).c(xb4Var, file) : wcm.h(xb4Var, file);
        }

        @Override // defpackage.yb4
        public ic4 d(xb4 xb4Var, String str) {
            return this.f37850a.d(xb4Var, str);
        }

        @Override // defpackage.yb4
        public yb4 e(yb4 yb4Var) {
            return this;
        }
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xb4 f37851a;

        public c(xb4 xb4Var) {
            this.f37851a = xb4Var;
        }

        @Override // wcm.a
        public mc4 a(String str, lc4 lc4Var) {
            mc4 mc4VarB = this.f37851a.b(str);
            if (mc4VarB != null) {
                return mc4VarB;
            }
            return skh.m(str, "include was not found: '" + str + "'", lc4Var);
        }
    }

    public wcm(yb4 yb4Var) {
        this.f37849a = yb4Var;
    }

    public static lc4 f(lc4 lc4Var) {
        return lc4Var.l(null).k(null).h(true);
    }

    public static ic4 g(a aVar, String str, lc4 lc4Var) {
        boolean z;
        if (str.endsWith(".conf") || str.endsWith(".json") || str.endsWith(".properties")) {
            mc4 mc4VarA = aVar.a(str, lc4Var);
            return mc4VarA.b(mc4VarA.a().h(lc4Var.c()));
        }
        mc4 mc4VarA2 = aVar.a(str + ".conf", lc4Var);
        mc4 mc4VarA3 = aVar.a(str + ".json", lc4Var);
        mc4 mc4VarA4 = aVar.a(str + ".properties", lc4Var);
        ArrayList arrayList = new ArrayList();
        ConfigSyntax configSyntaxG = lc4Var.g();
        ic4 ic4VarB0 = ncm.B0(ocm.r(str));
        boolean z2 = true;
        if (configSyntaxG == null || configSyntaxG == ConfigSyntax.CONF) {
            try {
                ic4VarB0 = mc4VarA2.b(mc4VarA2.a().h(false).l(ConfigSyntax.CONF));
                z = true;
            } catch (ConfigException.IO e) {
                arrayList.add(e);
                z = false;
            }
        } else {
            z = false;
        }
        if (configSyntaxG == null || configSyntaxG == ConfigSyntax.JSON) {
            try {
                ic4VarB0 = ic4VarB0.e(mc4VarA3.b(mc4VarA3.a().h(false).l(ConfigSyntax.JSON)));
                z = true;
            } catch (ConfigException.IO e2) {
                arrayList.add(e2);
            }
        }
        if (configSyntaxG == null || configSyntaxG == ConfigSyntax.PROPERTIES) {
            try {
                ic4VarB0 = ic4VarB0.e(mc4VarA4.b(mc4VarA4.a().h(false).l(ConfigSyntax.PROPERTIES)));
            } catch (ConfigException.IO e3) {
                arrayList.add(e3);
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (lc4Var.c() || z2) {
            if (z2 || !vb4.s()) {
                return ic4VarB0;
            }
            vb4.r("Did not find '" + str + "' with any extension (.conf, .json, .properties); but '" + str + "' is allowed to be missing. Exceptions from load attempts should have been logged above.");
            return ic4VarB0;
        }
        if (vb4.s()) {
            vb4.r("Did not find '" + str + "' with any extension (.conf, .json, .properties); exceptions should have been logged above.");
        }
        if (arrayList.isEmpty()) {
            throw new ConfigException.BugOrBroken("should not be reached: nothing found but no exceptions thrown");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((ConfigException.IO) it.next()).getMessage());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        throw new ConfigException.IO(ocm.r(str), sb.toString(), (Throwable) arrayList.get(0));
    }

    public static ic4 h(xb4 xb4Var, File file) {
        return com.typesafe.config.a.h(file, xb4Var.a()).w();
    }

    public static ic4 i(xb4 xb4Var, String str) {
        return com.typesafe.config.a.k(str, xb4Var.a()).w();
    }

    public static ic4 j(xb4 xb4Var, URL url) {
        return com.typesafe.config.a.l(url, xb4Var.a()).w();
    }

    public static ic4 k(xb4 xb4Var, String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        return url != null ? j(xb4Var, url) : g(new c(xb4Var), str, xb4Var.a());
    }

    public static uta l(yb4 yb4Var) {
        return yb4Var instanceof uta ? (uta) yb4Var : new b(yb4Var);
    }

    @Override // defpackage.zb4
    public ic4 a(xb4 xb4Var, String str) {
        ic4 ic4VarI = i(xb4Var, str);
        yb4 yb4Var = this.f37849a;
        return (yb4Var == null || !(yb4Var instanceof zb4)) ? ic4VarI : ic4VarI.e(((zb4) yb4Var).a(xb4Var, str));
    }

    @Override // defpackage.bc4
    public ic4 b(xb4 xb4Var, URL url) {
        ic4 ic4VarJ = j(xb4Var, url);
        yb4 yb4Var = this.f37849a;
        return (yb4Var == null || !(yb4Var instanceof bc4)) ? ic4VarJ : ic4VarJ.e(((bc4) yb4Var).b(xb4Var, url));
    }

    @Override // defpackage.ac4
    public ic4 c(xb4 xb4Var, File file) {
        ic4 ic4VarH = h(xb4Var, file);
        yb4 yb4Var = this.f37849a;
        return (yb4Var == null || !(yb4Var instanceof ac4)) ? ic4VarH : ic4VarH.e(((ac4) yb4Var).c(xb4Var, file));
    }

    @Override // defpackage.yb4
    public ic4 d(xb4 xb4Var, String str) {
        ic4 ic4VarK = k(xb4Var, str);
        yb4 yb4Var = this.f37849a;
        return yb4Var != null ? ic4VarK.e(yb4Var.d(xb4Var, str)) : ic4VarK;
    }

    @Override // defpackage.yb4
    public yb4 e(yb4 yb4Var) {
        if (this == yb4Var) {
            throw new ConfigException.BugOrBroken("trying to create includer cycle");
        }
        yb4 yb4Var2 = this.f37849a;
        if (yb4Var2 == yb4Var) {
            return this;
        }
        return yb4Var2 != null ? new wcm(yb4Var2.e(yb4Var)) : new wcm(yb4Var);
    }
}
