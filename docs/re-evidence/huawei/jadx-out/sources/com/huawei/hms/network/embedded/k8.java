package com.huawei.hms.network.embedded;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final t7 f15008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final v7 f15009b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t7 f15011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v7 f15012c;
        public Date d;
        public String e;
        public Date f;
        public String g;
        public Date h;
        public long i;
        public long j;
        public String k;
        public int l;

        public k8 a() {
            k8 k8VarD = d();
            return (k8VarD.f15008a == null || !this.f15011b.c().k()) ? k8VarD : new k8(null, null);
        }

        private boolean e() {
            return this.f15012c.t().d() == -1 && this.h == null;
        }

        private k8 d() {
            String str;
            if (this.f15012c == null) {
                return new k8(this.f15011b, null);
            }
            if ((!this.f15011b.g() || this.f15012c.x() != null) && k8.a(this.f15012c, this.f15011b)) {
                s6 s6VarC = this.f15011b.c();
                if (s6VarC.h() || a(this.f15011b)) {
                    return new k8(this.f15011b, null);
                }
                s6 s6VarT = this.f15012c.t();
                long jB = b();
                long jC = c();
                if (s6VarC.d() != -1) {
                    jC = Math.min(jC, TimeUnit.SECONDS.toMillis(s6VarC.d()));
                }
                long millis = 0;
                long millis2 = s6VarC.f() != -1 ? TimeUnit.SECONDS.toMillis(s6VarC.f()) : 0L;
                if (!s6VarT.g() && s6VarC.e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(s6VarC.e());
                }
                if (!s6VarT.h()) {
                    long j = millis2 + jB;
                    if (j < millis + jC) {
                        v7.a aVarD = this.f15012c.D();
                        if (j >= jC) {
                            aVarD.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jB > 86400000 && e()) {
                            aVarD.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new k8(null, aVarD.a());
                    }
                }
                String str2 = this.k;
                if (str2 != null) {
                    str = r1.b.n;
                } else {
                    if (this.f != null) {
                        str2 = this.g;
                    } else {
                        if (this.d == null) {
                            return new k8(this.f15011b, null);
                        }
                        str2 = this.e;
                    }
                    str = r1.b.o;
                }
                j7.a aVarC = this.f15011b.e().c();
                c8.f14676a.a(aVarC, str, str2);
                return new k8(this.f15011b.i().a(aVarC.a()).a(), this.f15012c);
            }
            return new k8(this.f15011b, null);
        }

        private long c() {
            s6 s6VarT = this.f15012c.t();
            if (s6VarT.d() != -1) {
                return TimeUnit.SECONDS.toMillis(s6VarT.d());
            }
            if (this.h != null) {
                Date date = this.d;
                long time = this.h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f != null && this.f15012c.H().k().o() == null) {
                Date date2 = this.d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private long b() {
            Date date = this.d;
            long jMax = date != null ? Math.max(0L, this.j - date.getTime()) : 0L;
            int i = this.l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.j;
            return jMax + (j - this.i) + (this.f15010a - j);
        }

        public static boolean a(t7 t7Var) {
            return (t7Var.a(r1.b.o) == null && t7Var.a(r1.b.n) == null) ? false : true;
        }

        public a(long j, t7 t7Var, v7 v7Var) {
            this.l = -1;
            this.f15010a = j;
            this.f15011b = t7Var;
            this.f15012c = v7Var;
            if (v7Var != null) {
                this.i = v7Var.I();
                this.j = v7Var.G();
                j7 j7VarY = v7Var.y();
                int iD = j7VarY.d();
                for (int i = 0; i < iD; i++) {
                    String strA = j7VarY.a(i);
                    String strB = j7VarY.b(i);
                    if ("Date".equalsIgnoreCase(strA)) {
                        this.d = h9.a(strB);
                        this.e = strB;
                    } else if ("Expires".equalsIgnoreCase(strA)) {
                        this.h = h9.a(strB);
                    } else if ("Last-Modified".equalsIgnoreCase(strA)) {
                        this.f = h9.a(strB);
                        this.g = strB;
                    } else if ("ETag".equalsIgnoreCase(strA)) {
                        this.k = strB;
                    } else if ("Age".equalsIgnoreCase(strA)) {
                        this.l = i9.a(strB, -1);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.t().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(v7 v7Var, t7 t7Var) {
        int iW = v7Var.w();
        if (iW != 200 && iW != 410 && iW != 414 && iW != 501 && iW != 203 && iW != 204) {
            if (iW != 307) {
                if (iW != 308 && iW != 404 && iW != 405) {
                    switch (iW) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (v7Var.b("Expires") == null) {
                if (v7Var.t().d() == -1) {
                    if (!v7Var.t().c()) {
                    }
                }
            }
        }
        return (v7Var.t().i() || t7Var.c().i()) ? false : true;
    }

    public k8(t7 t7Var, v7 v7Var) {
        this.f15008a = t7Var;
        this.f15009b = v7Var;
    }
}
