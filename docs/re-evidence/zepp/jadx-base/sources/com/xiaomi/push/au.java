package com.xiaomi.push;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes22.dex */
public final class au {

    public static final class a extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean i;
        private boolean k;
        private boolean m;
        private boolean o;
        private boolean q;
        private boolean s;
        private boolean u;
        private int b = 0;
        private long d = 0;
        private String f = "";
        private String h = "";
        private String j = "";
        private String l = "";
        private String n = "";
        private int p = 1;
        private int r = 0;
        private int t = 0;
        private String v = "";
        private int w = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.w < 0) {
                b();
            }
            return this.w;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public long m3511a() {
            return this.d;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public a m3512a() {
            this.k = false;
            this.l = "";
            return this;
        }

        public a a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        public a a(long j) {
            this.c = true;
            this.d = j;
            return this;
        }

        @Override // com.xiaomi.push.e
        public a a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                switch (iM3577a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.b());
                        break;
                    case 16:
                        a(bVar.m3578a());
                        break;
                    case 26:
                        a(bVar.m3580a());
                        break;
                    case 34:
                        b(bVar.m3580a());
                        break;
                    case 42:
                        c(bVar.m3580a());
                        break;
                    case 50:
                        d(bVar.m3580a());
                        break;
                    case 58:
                        e(bVar.m3580a());
                        break;
                    case 64:
                        b(bVar.b());
                        break;
                    case 72:
                        c(bVar.b());
                        break;
                    case 80:
                        d(bVar.b());
                        break;
                    case 90:
                        f(bVar.m3580a());
                        break;
                    default:
                        if (!a(bVar, iM3577a)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }

        public a a(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3513a() {
            return this.f;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3514a()) {
                cVar.m3618a(1, c());
            }
            if (m3516b()) {
                cVar.m3619a(2, m3511a());
            }
            if (m3518c()) {
                cVar.m3622a(3, m3513a());
            }
            if (m3520d()) {
                cVar.m3622a(4, m3515b());
            }
            if (m3522e()) {
                cVar.m3622a(5, m3517c());
            }
            if (m3524f()) {
                cVar.m3622a(6, m3519d());
            }
            if (g()) {
                cVar.m3622a(7, m3521e());
            }
            if (h()) {
                cVar.m3618a(8, d());
            }
            if (i()) {
                cVar.m3618a(9, e());
            }
            if (j()) {
                cVar.m3618a(10, f());
            }
            if (k()) {
                cVar.m3622a(11, m3523f());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3514a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3514a() ? 0 + com.xiaomi.push.c.a(1, c()) : 0;
            if (m3516b()) {
                iA += com.xiaomi.push.c.a(2, m3511a());
            }
            if (m3518c()) {
                iA += com.xiaomi.push.c.a(3, m3513a());
            }
            if (m3520d()) {
                iA += com.xiaomi.push.c.a(4, m3515b());
            }
            if (m3522e()) {
                iA += com.xiaomi.push.c.a(5, m3517c());
            }
            if (m3524f()) {
                iA += com.xiaomi.push.c.a(6, m3519d());
            }
            if (g()) {
                iA += com.xiaomi.push.c.a(7, m3521e());
            }
            if (h()) {
                iA += com.xiaomi.push.c.a(8, d());
            }
            if (i()) {
                iA += com.xiaomi.push.c.a(9, e());
            }
            if (j()) {
                iA += com.xiaomi.push.c.a(10, f());
            }
            if (k()) {
                iA += com.xiaomi.push.c.a(11, m3523f());
            }
            this.w = iA;
            return iA;
        }

        public a b(int i) {
            this.o = true;
            this.p = i;
            return this;
        }

        public a b(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m3515b() {
            return this.h;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3516b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public a c(int i) {
            this.q = true;
            this.r = i;
            return this;
        }

        public a c(String str) {
            this.i = true;
            this.j = str;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public String m3517c() {
            return this.j;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3518c() {
            return this.e;
        }

        public int d() {
            return this.p;
        }

        public a d(int i) {
            this.s = true;
            this.t = i;
            return this;
        }

        public a d(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public String m3519d() {
            return this.l;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m3520d() {
            return this.g;
        }

        public int e() {
            return this.r;
        }

        public a e(String str) {
            this.m = true;
            this.n = str;
            return this;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public String m3521e() {
            return this.n;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m3522e() {
            return this.i;
        }

        public int f() {
            return this.t;
        }

        public a f(String str) {
            this.u = true;
            this.v = str;
            return this;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public String m3523f() {
            return this.v;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public boolean m3524f() {
            return this.k;
        }

        public boolean g() {
            return this.m;
        }

        public boolean h() {
            return this.o;
        }

        public boolean i() {
            return this.q;
        }

        public boolean j() {
            return this.s;
        }

        public boolean k() {
            return this.u;
        }
    }

    public static final class b extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean b = false;
        private int d = 0;
        private int f = 0;
        private int h = 0;
        private int i = -1;

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.i < 0) {
                b();
            }
            return this.i;
        }

        public b a(int i) {
            this.c = true;
            this.d = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public b a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 8) {
                    a(bVar.m3583a());
                } else if (iM3577a == 24) {
                    a(bVar.b());
                } else if (iM3577a == 32) {
                    b(bVar.b());
                } else if (iM3577a == 40) {
                    c(bVar.b());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public b a(boolean z) {
            this.a = true;
            this.b = z;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3526b()) {
                cVar.m3623a(1, m3525a());
            }
            if (m3527c()) {
                cVar.m3618a(3, c());
            }
            if (m3528d()) {
                cVar.m3618a(4, d());
            }
            if (m3529e()) {
                cVar.m3618a(5, e());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3525a() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3526b() ? 0 + com.xiaomi.push.c.a(1, m3525a()) : 0;
            if (m3527c()) {
                iA += com.xiaomi.push.c.a(3, c());
            }
            if (m3528d()) {
                iA += com.xiaomi.push.c.a(4, d());
            }
            if (m3529e()) {
                iA += com.xiaomi.push.c.a(5, e());
            }
            this.i = iA;
            return iA;
        }

        public b b(int i) {
            this.e = true;
            this.f = i;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3526b() {
            return this.a;
        }

        public int c() {
            return this.d;
        }

        public b c(int i) {
            this.g = true;
            this.h = i;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3527c() {
            return this.c;
        }

        public int d() {
            return this.f;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m3528d() {
            return this.e;
        }

        public int e() {
            return this.h;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m3529e() {
            return this.g;
        }
    }

    public static final class c extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean i;
        private boolean k;
        private String b = "";
        private String d = "";
        private String f = "";
        private String h = "";
        private String j = "";
        private String l = "";
        private int m = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.m < 0) {
                b();
            }
            return this.m;
        }

        @Override // com.xiaomi.push.e
        public c a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 10) {
                    a(bVar.m3580a());
                } else if (iM3577a == 18) {
                    b(bVar.m3580a());
                } else if (iM3577a == 26) {
                    c(bVar.m3580a());
                } else if (iM3577a == 34) {
                    d(bVar.m3580a());
                } else if (iM3577a == 42) {
                    e(bVar.m3580a());
                } else if (iM3577a == 50) {
                    f(bVar.m3580a());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public c a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3530a() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3531a()) {
                cVar.m3622a(1, m3530a());
            }
            if (m3533b()) {
                cVar.m3622a(2, m3532b());
            }
            if (m3534c()) {
                cVar.m3622a(3, c());
            }
            if (m3535d()) {
                cVar.m3622a(4, d());
            }
            if (m3536e()) {
                cVar.m3622a(5, e());
            }
            if (m3537f()) {
                cVar.m3622a(6, f());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3531a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3531a() ? 0 + com.xiaomi.push.c.a(1, m3530a()) : 0;
            if (m3533b()) {
                iA += com.xiaomi.push.c.a(2, m3532b());
            }
            if (m3534c()) {
                iA += com.xiaomi.push.c.a(3, c());
            }
            if (m3535d()) {
                iA += com.xiaomi.push.c.a(4, d());
            }
            if (m3536e()) {
                iA += com.xiaomi.push.c.a(5, e());
            }
            if (m3537f()) {
                iA += com.xiaomi.push.c.a(6, f());
            }
            this.m = iA;
            return iA;
        }

        public c b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m3532b() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3533b() {
            return this.c;
        }

        public c c(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public String c() {
            return this.f;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3534c() {
            return this.e;
        }

        public c d(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public String d() {
            return this.h;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m3535d() {
            return this.g;
        }

        public c e(String str) {
            this.i = true;
            this.j = str;
            return this;
        }

        public String e() {
            return this.j;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m3536e() {
            return this.i;
        }

        public c f(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        public String f() {
            return this.l;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public boolean m3537f() {
            return this.k;
        }
    }

    public static final class d extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean b = false;
        private String d = "";
        private String f = "";
        private String h = "";
        private int i = -1;

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.i < 0) {
                b();
            }
            return this.i;
        }

        @Override // com.xiaomi.push.e
        public d a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 8) {
                    a(bVar.m3583a());
                } else if (iM3577a == 18) {
                    a(bVar.m3580a());
                } else if (iM3577a == 26) {
                    b(bVar.m3580a());
                } else if (iM3577a == 34) {
                    c(bVar.m3580a());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public d a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public d a(boolean z) {
            this.a = true;
            this.b = z;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3538a() {
            return this.d;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3541b()) {
                cVar.m3623a(1, m3539a());
            }
            if (m3542c()) {
                cVar.m3622a(2, m3538a());
            }
            if (d()) {
                cVar.m3622a(3, m3540b());
            }
            if (e()) {
                cVar.m3622a(4, c());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3539a() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3541b() ? 0 + com.xiaomi.push.c.a(1, m3539a()) : 0;
            if (m3542c()) {
                iA += com.xiaomi.push.c.a(2, m3538a());
            }
            if (d()) {
                iA += com.xiaomi.push.c.a(3, m3540b());
            }
            if (e()) {
                iA += com.xiaomi.push.c.a(4, c());
            }
            this.i = iA;
            return iA;
        }

        public d b(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m3540b() {
            return this.f;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3541b() {
            return this.a;
        }

        public d c(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public String c() {
            return this.h;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3542c() {
            return this.c;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return this.g;
        }
    }

    public static final class e extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean i;
        private boolean k;
        private boolean m;
        private boolean o;
        private boolean q;
        private boolean s;
        private int b = 0;
        private String d = "";
        private String f = "";
        private String h = "";
        private int j = 0;
        private String l = "";
        private String n = "";
        private String p = "";
        private b r = null;
        private int t = 0;
        private int u = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.u < 0) {
                b();
            }
            return this.u;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public b m3543a() {
            return this.r;
        }

        public e a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        public e a(b bVar) {
            Objects.requireNonNull(bVar);
            this.q = true;
            this.r = bVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public e a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                switch (iM3577a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.c());
                        break;
                    case 18:
                        a(bVar.m3580a());
                        break;
                    case 26:
                        b(bVar.m3580a());
                        break;
                    case 34:
                        c(bVar.m3580a());
                        break;
                    case 40:
                        b(bVar.b());
                        break;
                    case 50:
                        d(bVar.m3580a());
                        break;
                    case 58:
                        e(bVar.m3580a());
                        break;
                    case 66:
                        f(bVar.m3580a());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.b());
                        break;
                    default:
                        if (!a(bVar, iM3577a)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }

        public e a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3544a() {
            return this.d;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3545a()) {
                cVar.m3631b(1, c());
            }
            if (m3547b()) {
                cVar.m3622a(2, m3544a());
            }
            if (m3549c()) {
                cVar.m3622a(3, m3546b());
            }
            if (m3551d()) {
                cVar.m3622a(4, m3548c());
            }
            if (m3553e()) {
                cVar.m3618a(5, d());
            }
            if (m3554f()) {
                cVar.m3622a(6, m3550d());
            }
            if (g()) {
                cVar.m3622a(7, m3552e());
            }
            if (h()) {
                cVar.m3622a(8, f());
            }
            if (i()) {
                cVar.m3621a(9, (com.xiaomi.push.e) m3543a());
            }
            if (j()) {
                cVar.m3618a(10, e());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3545a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iB = m3545a() ? 0 + com.xiaomi.push.c.b(1, c()) : 0;
            if (m3547b()) {
                iB += com.xiaomi.push.c.a(2, m3544a());
            }
            if (m3549c()) {
                iB += com.xiaomi.push.c.a(3, m3546b());
            }
            if (m3551d()) {
                iB += com.xiaomi.push.c.a(4, m3548c());
            }
            if (m3553e()) {
                iB += com.xiaomi.push.c.a(5, d());
            }
            if (m3554f()) {
                iB += com.xiaomi.push.c.a(6, m3550d());
            }
            if (g()) {
                iB += com.xiaomi.push.c.a(7, m3552e());
            }
            if (h()) {
                iB += com.xiaomi.push.c.a(8, f());
            }
            if (i()) {
                iB += com.xiaomi.push.c.a(9, (com.xiaomi.push.e) m3543a());
            }
            if (j()) {
                iB += com.xiaomi.push.c.a(10, e());
            }
            this.u = iB;
            return iB;
        }

        public e b(int i) {
            this.i = true;
            this.j = i;
            return this;
        }

        public e b(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m3546b() {
            return this.f;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3547b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public e c(int i) {
            this.s = true;
            this.t = i;
            return this;
        }

        public e c(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public String m3548c() {
            return this.h;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3549c() {
            return this.e;
        }

        public int d() {
            return this.j;
        }

        public e d(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public String m3550d() {
            return this.l;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m3551d() {
            return this.g;
        }

        public int e() {
            return this.t;
        }

        public e e(String str) {
            this.m = true;
            this.n = str;
            return this;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public String m3552e() {
            return this.n;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m3553e() {
            return this.i;
        }

        public e f(String str) {
            this.o = true;
            this.p = str;
            return this;
        }

        public String f() {
            return this.p;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public boolean m3554f() {
            return this.k;
        }

        public boolean g() {
            return this.m;
        }

        public boolean h() {
            return this.o;
        }

        public boolean i() {
            return this.q;
        }

        public boolean j() {
            return this.s;
        }
    }

    public static final class f extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private String b = "";
        private String d = "";
        private b f = null;
        private int g = -1;

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.g < 0) {
                b();
            }
            return this.g;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public b m3555a() {
            return this.f;
        }

        public f a(b bVar) {
            Objects.requireNonNull(bVar);
            this.e = true;
            this.f = bVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public f a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 10) {
                    a(bVar.m3580a());
                } else if (iM3577a == 18) {
                    b(bVar.m3580a());
                } else if (iM3577a == 26) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public f a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3556a() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3557a()) {
                cVar.m3622a(1, m3556a());
            }
            if (m3559b()) {
                cVar.m3622a(2, m3558b());
            }
            if (c()) {
                cVar.m3621a(3, (com.xiaomi.push.e) m3555a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3557a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3557a() ? 0 + com.xiaomi.push.c.a(1, m3556a()) : 0;
            if (m3559b()) {
                iA += com.xiaomi.push.c.a(2, m3558b());
            }
            if (c()) {
                iA += com.xiaomi.push.c.a(3, (com.xiaomi.push.e) m3555a());
            }
            this.g = iA;
            return iA;
        }

        public f b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m3558b() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3559b() {
            return this.c;
        }

        public boolean c() {
            return this.e;
        }
    }

    public static final class g extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private boolean e;
        private String b = "";
        private String d = "";
        private String f = "";
        private int g = -1;

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.g < 0) {
                b();
            }
            return this.g;
        }

        @Override // com.xiaomi.push.e
        public g a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 10) {
                    a(bVar.m3580a());
                } else if (iM3577a == 18) {
                    b(bVar.m3580a());
                } else if (iM3577a == 26) {
                    c(bVar.m3580a());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public g a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3560a() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3561a()) {
                cVar.m3622a(1, m3560a());
            }
            if (m3563b()) {
                cVar.m3622a(2, m3562b());
            }
            if (m3564c()) {
                cVar.m3622a(3, c());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3561a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3561a() ? 0 + com.xiaomi.push.c.a(1, m3560a()) : 0;
            if (m3563b()) {
                iA += com.xiaomi.push.c.a(2, m3562b());
            }
            if (m3564c()) {
                iA += com.xiaomi.push.c.a(3, c());
            }
            this.g = iA;
            return iA;
        }

        public g b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m3562b() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3563b() {
            return this.c;
        }

        public g c(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public String c() {
            return this.f;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3564c() {
            return this.e;
        }
    }

    public static final class h extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private int b = 0;
        private String d = "";
        private int e = -1;

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        public h a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public h a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 8) {
                    a(bVar.b());
                } else if (iM3577a == 18) {
                    a(bVar.m3580a());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public h a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m3565a() {
            return this.d;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3566a()) {
                cVar.m3618a(1, c());
            }
            if (m3567b()) {
                cVar.m3622a(2, m3565a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3566a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3566a() ? 0 + com.xiaomi.push.c.a(1, c()) : 0;
            if (m3567b()) {
                iA += com.xiaomi.push.c.a(2, m3565a());
            }
            this.e = iA;
            return iA;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3567b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }
    }

    public static final class i extends com.xiaomi.push.e {
        private boolean a;
        private com.xiaomi.push.a b = com.xiaomi.push.a.a;
        private int c = -1;

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.c < 0) {
                b();
            }
            return this.c;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m3568a() {
            return this.b;
        }

        public i a(com.xiaomi.push.a aVar) {
            this.a = true;
            this.b = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public i a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 10) {
                    a(bVar.m3579a());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3569a()) {
                cVar.m3620a(1, m3568a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3569a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3569a() ? 0 + com.xiaomi.push.c.a(1, m3568a()) : 0;
            this.c = iA;
            return iA;
        }
    }

    public static final class j extends com.xiaomi.push.e {
        private boolean a;
        private boolean c;
        private com.xiaomi.push.a b = com.xiaomi.push.a.a;
        private b d = null;
        private int e = -1;

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m3570a() {
            return this.b;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public b m3571a() {
            return this.d;
        }

        public j a(com.xiaomi.push.a aVar) {
            this.a = true;
            this.b = aVar;
            return this;
        }

        public j a(b bVar) {
            Objects.requireNonNull(bVar);
            this.c = true;
            this.d = bVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public j a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 10) {
                    a(bVar.m3579a());
                } else if (iM3577a == 18) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m3572a()) {
                cVar.m3620a(1, m3570a());
            }
            if (m3573b()) {
                cVar.m3621a(2, (com.xiaomi.push.e) m3571a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3572a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m3572a() ? 0 + com.xiaomi.push.c.a(1, m3570a()) : 0;
            if (m3573b()) {
                iA += com.xiaomi.push.c.a(2, (com.xiaomi.push.e) m3571a());
            }
            this.e = iA;
            return iA;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3573b() {
            return this.c;
        }
    }
}
