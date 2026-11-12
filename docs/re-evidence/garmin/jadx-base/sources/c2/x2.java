package c2;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f22930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f22931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f22932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s3 f22933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s3 f22934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s3 f22935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s3 f22936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s3 f22937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s3 f22938i;

    static {
        k0.f22721d.getClass();
        i0 i0Var = i0.Horizontal;
        f22930a = new k0(i0Var, 1.0f, "fillMaxWidth");
        i0 i0Var2 = i0.Vertical;
        f22931b = new k0(i0Var2, 1.0f, "fillMaxHeight");
        i0 i0Var3 = i0.Both;
        f22932c = new k0(i0Var3, 1.0f, "fillMaxSize");
        s3.a aVar = s3.f22873f;
        h4.d.f81522a.getClass();
        h4.g.a aVar2 = h4.d.a.f81537o;
        aVar.getClass();
        f22933d = new s3(i0Var, false, new h(aVar2, 1), aVar2, "wrapContentWidth");
        h4.g.a aVar3 = h4.d.a.f81536n;
        f22934e = new s3(i0Var, false, new h(aVar3, 1), aVar3, "wrapContentWidth");
        h4.g.b bVar = h4.d.a.f81534l;
        f22935f = new s3(i0Var2, false, new i(bVar, 1), bVar, "wrapContentHeight");
        h4.g.b bVar2 = h4.d.a.f81533k;
        f22936g = new s3(i0Var2, false, new i(bVar2, 1), bVar2, "wrapContentHeight");
        h4.g gVar = h4.d.a.f81528f;
        int i14 = 26;
        f22937h = new s3(i0Var3, false, new a61.d(gVar, i14), gVar, "wrapContentSize");
        h4.g gVar2 = h4.d.a.f81524b;
        f22938i = new s3(i0Var3, false, new a61.d(gVar2, i14), gVar2, "wrapContentSize");
    }

    public static final h4.r a(h4.r rVar, float f14, float f15) {
        return rVar.then(new f3(f14, f15, null));
    }

    public static h4.r b(h4.r rVar, float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        return a(rVar, f14, f15);
    }

    public static final h4.r c(h4.r rVar, float f14) {
        k0 k0Var;
        if (f14 == 1.0f) {
            k0Var = f22931b;
        } else {
            k0.f22721d.getClass();
            k0Var = new k0(i0.Vertical, f14, "fillMaxHeight");
        }
        return rVar.then(k0Var);
    }

    public static final h4.r d(h4.r rVar, float f14) {
        k0 k0Var;
        if (f14 == 1.0f) {
            k0Var = f22932c;
        } else {
            k0.f22721d.getClass();
            k0Var = new k0(i0.Both, f14, "fillMaxSize");
        }
        return rVar.then(k0Var);
    }

    public static final h4.r f(h4.r rVar, float f14) {
        k0 k0Var;
        if (f14 == 1.0f) {
            k0Var = f22930a;
        } else {
            k0.f22721d.getClass();
            k0Var = new k0(i0.Horizontal, f14, "fillMaxWidth");
        }
        return rVar.then(k0Var);
    }

    public static final h4.r h(h4.r rVar, float f14) {
        return rVar.then(new w2(0.0f, f14, 0.0f, f14, true, kotlin.k2.f91249a, 5, null));
    }

    public static final h4.r i(h4.r rVar, float f14, float f15) {
        return rVar.then(new w2(0.0f, f14, 0.0f, f15, true, kotlin.k2.f91249a, 5, null));
    }

    public static h4.r j(h4.r rVar, float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        return i(rVar, f14, f15);
    }

    public static final h4.r k(h4.r rVar, float f14) {
        return rVar.then(new w2(0.0f, f14, 0.0f, f14, false, kotlin.k2.f91249a, 5, null));
    }

    public static h4.r l(h4.r rVar, float f14) {
        g6.f.f75994b.getClass();
        return rVar.then(new w2(0.0f, f14, 0.0f, g6.f.f75996d, false, kotlin.k2.f91249a, 5, null));
    }

    public static final h4.r m(h4.r rVar, float f14) {
        return rVar.then(new w2(f14, f14, f14, f14, false, kotlin.k2.f91249a, null));
    }

    public static final h4.r n(h4.r rVar, float f14, float f15) {
        return rVar.then(new w2(f14, f15, f14, f15, false, kotlin.k2.f91249a, null));
    }

    public static h4.r o(h4.r rVar, float f14, float f15, float f16, float f17, int i14) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        float f18 = f14;
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        float f19 = f15;
        if ((i14 & 4) != 0) {
            g6.f.f75994b.getClass();
            f16 = g6.f.f75996d;
        }
        float f22 = f16;
        if ((i14 & 8) != 0) {
            g6.f.f75994b.getClass();
            f17 = g6.f.f75996d;
        }
        return rVar.then(new w2(f18, f19, f22, f17, false, kotlin.k2.f91249a, null));
    }

    public static final h4.r p(h4.r rVar, float f14) {
        return rVar.then(new w2(f14, 0.0f, f14, 0.0f, false, kotlin.k2.f91249a, 10, null));
    }

    public static final h4.r q(h4.r rVar, float f14) {
        return rVar.then(new w2(f14, f14, f14, f14, true, kotlin.k2.f91249a, null));
    }

    public static final h4.r r(h4.r rVar, float f14, float f15) {
        return rVar.then(new w2(f14, f15, f14, f15, true, kotlin.k2.f91249a, null));
    }

    public static final h4.r s(h4.r rVar, float f14, float f15, float f16, float f17) {
        return rVar.then(new w2(f14, f15, f16, f17, true, kotlin.k2.f91249a, null));
    }

    public static h4.r t(h4.r rVar, float f14, float f15, float f16, int i14) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        if ((i14 & 4) != 0) {
            g6.f.f75994b.getClass();
            f16 = g6.f.f75996d;
        }
        g6.f.f75994b.getClass();
        return s(rVar, f14, f15, f16, g6.f.f75996d);
    }

    public static final h4.r u(h4.r rVar, float f14) {
        return rVar.then(new w2(f14, 0.0f, f14, 0.0f, true, kotlin.k2.f91249a, 10, null));
    }

    public static final h4.r v(h4.r rVar, float f14, float f15) {
        return rVar.then(new w2(f14, 0.0f, f15, 0.0f, true, kotlin.k2.f91249a, 10, null));
    }

    public static h4.r w(h4.r rVar, float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        return v(rVar, f14, f15);
    }

    public static h4.r x(h4.r rVar, h4.d.c cVar, int i14) {
        s3 s3Var;
        if ((i14 & 1) != 0) {
            h4.d.f81522a.getClass();
            cVar = h4.d.a.f81534l;
        }
        h4.d.c cVar2 = cVar;
        boolean z14 = (i14 & 2) == 0;
        h4.d.f81522a.getClass();
        if (p005kotlin.jvm.internal.s.g(cVar2, h4.d.a.f81534l) && !z14) {
            s3Var = f22935f;
        } else if (!p005kotlin.jvm.internal.s.g(cVar2, h4.d.a.f81533k) || z14) {
            s3.f22873f.getClass();
            s3Var = new s3(i0.Vertical, z14, new i(cVar2, 1), cVar2, "wrapContentHeight");
        } else {
            s3Var = f22936g;
        }
        return rVar.then(s3Var);
    }

    public static h4.r y(h4.r rVar, h4.d dVar, int i14) {
        s3 s3Var;
        if ((i14 & 1) != 0) {
            h4.d.f81522a.getClass();
            dVar = h4.d.a.f81528f;
        }
        h4.d dVar2 = dVar;
        boolean z14 = (i14 & 2) == 0;
        h4.d.f81522a.getClass();
        if (p005kotlin.jvm.internal.s.g(dVar2, h4.d.a.f81528f) && !z14) {
            s3Var = f22937h;
        } else if (!p005kotlin.jvm.internal.s.g(dVar2, h4.d.a.f81524b) || z14) {
            s3.f22873f.getClass();
            s3Var = new s3(i0.Both, z14, new a61.d(dVar2, 26), dVar2, "wrapContentSize");
        } else {
            s3Var = f22938i;
        }
        return rVar.then(s3Var);
    }

    public static h4.r z(h4.r rVar, h4.d.b bVar, int i14) {
        s3 s3Var;
        if ((i14 & 1) != 0) {
            h4.d.f81522a.getClass();
            bVar = h4.d.a.f81537o;
        }
        h4.d.b bVar2 = bVar;
        boolean z14 = (i14 & 2) == 0;
        h4.d.f81522a.getClass();
        if (p005kotlin.jvm.internal.s.g(bVar2, h4.d.a.f81537o) && !z14) {
            s3Var = f22933d;
        } else if (!p005kotlin.jvm.internal.s.g(bVar2, h4.d.a.f81536n) || z14) {
            s3.f22873f.getClass();
            s3Var = new s3(i0.Horizontal, z14, new h(bVar2, 1), bVar2, "wrapContentWidth");
        } else {
            s3Var = f22934e;
        }
        return rVar.then(s3Var);
    }
}
