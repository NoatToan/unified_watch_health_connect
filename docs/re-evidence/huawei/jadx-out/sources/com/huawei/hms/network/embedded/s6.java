package com.huawei.hms.network.embedded;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class s6 {
    public static final s6 n = new a().c().a();
    public static final s6 o = new a().f().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15337c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    @Nullable
    public String m;

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String strM = m();
        this.m = strM;
        return strM;
    }

    public int l() {
        return this.d;
    }

    public boolean k() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }

    public boolean i() {
        return this.f15336b;
    }

    public boolean h() {
        return this.f15335a;
    }

    public boolean g() {
        return this.g;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15340c = -1;
        public int d = -1;
        public int e = -1;
        public boolean f;
        public boolean g;
        public boolean h;

        public a f() {
            this.f = true;
            return this;
        }

        public a e() {
            this.g = true;
            return this;
        }

        public a d() {
            this.f15339b = true;
            return this;
        }

        public a c(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i);
        }

        public a c() {
            this.f15338a = true;
            return this;
        }

        public a b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public a b() {
            this.h = true;
            return this;
        }

        public s6 a() {
            return new s6(this);
        }

        public a a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f15340c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i);
        }
    }

    public int f() {
        return this.i;
    }

    public int e() {
        return this.h;
    }

    public int d() {
        return this.f15337c;
    }

    public boolean c() {
        return this.f;
    }

    public boolean b() {
        return this.e;
    }

    public boolean a() {
        return this.l;
    }

    private String m() {
        StringBuilder sb = new StringBuilder();
        if (this.f15335a) {
            sb.append("no-cache, ");
        }
        if (this.f15336b) {
            sb.append("no-store, ");
        }
        if (this.f15337c != -1) {
            sb.append("max-age=");
            sb.append(this.f15337c);
            sb.append(", ");
        }
        if (this.d != -1) {
            sb.append("s-maxage=");
            sb.append(this.d);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138 A[SYNTHETIC] */
    public static s6 a(j7 j7Var) {
        int i;
        int iA;
        String strTrim;
        boolean z;
        int iA2;
        String strTrim2;
        int iD = j7Var.d();
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iA3 = -1;
        int iA4 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iA5 = -1;
        int iA6 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        for (int i2 = 0; i2 < iD; i2++) {
            String strA = j7Var.a(i2);
            String strB = j7Var.b(i2);
            if (strA.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strB;
                }
                for (i = 0; i < strB.length(); i = iA2) {
                    iA = i9.a(strB, i, "=,;");
                    strTrim = strB.substring(i, iA).trim();
                    if (iA != strB.length() || strB.charAt(iA) == ',' || strB.charAt(iA) == ';') {
                        z = true;
                        iA2 = iA + 1;
                        strTrim2 = null;
                    } else {
                        int iB = i9.b(strB, iA + 1);
                        if (iB >= strB.length() || strB.charAt(iB) != '\"') {
                            z = true;
                            iA2 = i9.a(strB, iB, ",;");
                            strTrim2 = strB.substring(iB, iA2).trim();
                        } else {
                            int i3 = iB + 1;
                            int iA7 = i9.a(strB, i3, "\"");
                            strTrim2 = strB.substring(i3, iA7);
                            z = true;
                            iA2 = iA7 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim)) {
                        z3 = z;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z4 = z;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iA3 = i9.a(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iA4 = i9.a(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z5 = z;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z6 = z;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z7 = z;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iA5 = i9.a(strTrim2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iA6 = i9.a(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z8 = z;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z9 = z;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z10 = z;
                        }
                    }
                }
            } else {
                if (strA.equalsIgnoreCase("Pragma")) {
                }
            }
            z2 = false;
            while (i < strB.length()) {
                iA = i9.a(strB, i, "=,;");
                strTrim = strB.substring(i, iA).trim();
                if (iA != strB.length()) {
                    z = true;
                    iA2 = iA + 1;
                    strTrim2 = null;
                } else {
                    z = true;
                    iA2 = iA + 1;
                    strTrim2 = null;
                }
                if ("no-cache".equalsIgnoreCase(strTrim)) {
                    z3 = z;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z4 = z;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iA3 = i9.a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iA4 = i9.a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z5 = z;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z6 = z;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z7 = z;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iA5 = i9.a(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iA6 = i9.a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z8 = z;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z9 = z;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z10 = z;
                    }
                }
            }
        }
        return new s6(z3, z4, iA3, iA4, z5, z6, z7, iA5, iA6, z8, z9, z10, !z2 ? null : str);
    }

    public s6(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f15335a = z;
        this.f15336b = z2;
        this.f15337c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public s6(a aVar) {
        this.f15335a = aVar.f15338a;
        this.f15336b = aVar.f15339b;
        this.f15337c = aVar.f15340c;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f;
        this.k = aVar.g;
        this.l = aVar.h;
    }
}
