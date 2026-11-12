package defpackage;

import com.typesafe.config.ConfigSyntax;

/* JADX INFO: loaded from: classes6.dex */
public final class lc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigSyntax f24891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24892b;
    public final boolean c;
    public final yb4 d;
    public final ClassLoader e;

    public lc4(ConfigSyntax configSyntax, String str, boolean z, yb4 yb4Var, ClassLoader classLoader) {
        this.f24891a = configSyntax;
        this.f24892b = str;
        this.c = z;
        this.d = yb4Var;
        this.e = classLoader;
    }

    public static lc4 b() {
        return new lc4(null, null, true, null, null);
    }

    public lc4 a(yb4 yb4Var) {
        yb4 yb4Var2 = this.d;
        if (yb4Var2 == yb4Var) {
            return this;
        }
        return yb4Var2 != null ? j(yb4Var2.e(yb4Var)) : j(yb4Var);
    }

    public boolean c() {
        return this.c;
    }

    public ClassLoader d() {
        ClassLoader classLoader = this.e;
        return classLoader == null ? Thread.currentThread().getContextClassLoader() : classLoader;
    }

    public yb4 e() {
        return this.d;
    }

    public String f() {
        return this.f24892b;
    }

    public ConfigSyntax g() {
        return this.f24891a;
    }

    public lc4 h(boolean z) {
        return this.c == z ? this : new lc4(this.f24891a, this.f24892b, z, this.d, this.e);
    }

    public lc4 i(ClassLoader classLoader) {
        return this.e == classLoader ? this : new lc4(this.f24891a, this.f24892b, this.c, this.d, classLoader);
    }

    public lc4 j(yb4 yb4Var) {
        return this.d == yb4Var ? this : new lc4(this.f24891a, this.f24892b, this.c, yb4Var, this.e);
    }

    public lc4 k(String str) {
        String str2 = this.f24892b;
        if (str2 == str) {
            return this;
        }
        return (str2 == null || str == null || !str2.equals(str)) ? new lc4(this.f24891a, str, this.c, this.d, this.e) : this;
    }

    public lc4 l(ConfigSyntax configSyntax) {
        return this.f24891a == configSyntax ? this : new lc4(configSyntax, this.f24892b, this.c, this.d, this.e);
    }
}
