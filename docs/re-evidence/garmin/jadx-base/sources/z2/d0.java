package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f201550a = a.f201551a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz2/d0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f201551a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c0 f201552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f201553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c0 f201554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c0 f201555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c0 f201556f;

        /* JADX INFO: renamed from: z2.d0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C3762a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3762a f201557a = new C3762a();

            @Override // z2.e
            public final long a(z zVar, int i14) {
                String str = zVar.f201853f.f157280a.f157265a.f157138b;
                return og.a.l(g8.i.y(i14, str), g8.i.x(i14, str));
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f201558a = new b();

            @Override // z2.e
            public final long a(z zVar, int i14) {
                return zVar.f201853f.l(i14);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [z2.c0] */
        /* JADX WARN: Type inference failed for: r0v2, types: [z2.c0] */
        /* JADX WARN: Type inference failed for: r0v3, types: [z2.c0] */
        /* JADX WARN: Type inference failed for: r0v4, types: [z2.c0] */
        /* JADX WARN: Type inference failed for: r0v5, types: [z2.c0] */
        static {
            final int i14 = 0;
            f201552b = new d0() { // from class: z2.c0
                @Override // z2.d0
                public final b0 a(y0 y0Var) {
                    b0.a aVarB;
                    b0.a aVarB2;
                    boolean z14 = true;
                    switch (i14) {
                        case 0:
                            d0.a aVar = d0.a.f201551a;
                            return new b0(y0Var.i().a(y0Var.i().f201850c), y0Var.h().a(y0Var.h().f201851d), y0Var.c() == g.CROSSED);
                        case 1:
                            return f0.e(d0.a.f201552b.a(y0Var), y0Var);
                        case 2:
                            d0.a aVar2 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.b.f201558a);
                        case 3:
                            d0.a aVar3 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.C3762a.f201557a);
                        default:
                            d0.a aVar4 = d0.a.f201551a;
                            b0 b0VarG = y0Var.g();
                            if (b0VarG == null) {
                                return d0.a.f201554d.a(y0Var);
                            }
                            b0.a aVar5 = b0VarG.f201524b;
                            b0.a aVar6 = b0VarG.f201523a;
                            if (y0Var.a()) {
                                aVarB2 = f0.b(y0Var, y0Var.i(), aVar6);
                                aVarB = aVar5;
                                aVar5 = aVar6;
                                aVar6 = aVarB2;
                            } else {
                                aVarB = f0.b(y0Var, y0Var.h(), aVar5);
                                aVarB2 = aVarB;
                            }
                            if (p005kotlin.jvm.internal.s.g(aVarB2, aVar5)) {
                                return b0VarG;
                            }
                            if (y0Var.c() != g.CROSSED && (y0Var.c() != g.COLLAPSED || aVar6.f201527b <= aVarB.f201527b)) {
                                z14 = false;
                            }
                            return f0.e(new b0(aVar6, aVarB, z14), y0Var);
                    }
                }
            };
            final int i15 = 1;
            f201553c = new d0() { // from class: z2.c0
                @Override // z2.d0
                public final b0 a(y0 y0Var) {
                    b0.a aVarB;
                    b0.a aVarB2;
                    boolean z14 = true;
                    switch (i15) {
                        case 0:
                            d0.a aVar = d0.a.f201551a;
                            return new b0(y0Var.i().a(y0Var.i().f201850c), y0Var.h().a(y0Var.h().f201851d), y0Var.c() == g.CROSSED);
                        case 1:
                            return f0.e(d0.a.f201552b.a(y0Var), y0Var);
                        case 2:
                            d0.a aVar2 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.b.f201558a);
                        case 3:
                            d0.a aVar3 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.C3762a.f201557a);
                        default:
                            d0.a aVar4 = d0.a.f201551a;
                            b0 b0VarG = y0Var.g();
                            if (b0VarG == null) {
                                return d0.a.f201554d.a(y0Var);
                            }
                            b0.a aVar5 = b0VarG.f201524b;
                            b0.a aVar6 = b0VarG.f201523a;
                            if (y0Var.a()) {
                                aVarB2 = f0.b(y0Var, y0Var.i(), aVar6);
                                aVarB = aVar5;
                                aVar5 = aVar6;
                                aVar6 = aVarB2;
                            } else {
                                aVarB = f0.b(y0Var, y0Var.h(), aVar5);
                                aVarB2 = aVarB;
                            }
                            if (p005kotlin.jvm.internal.s.g(aVarB2, aVar5)) {
                                return b0VarG;
                            }
                            if (y0Var.c() != g.CROSSED && (y0Var.c() != g.COLLAPSED || aVar6.f201527b <= aVarB.f201527b)) {
                                z14 = false;
                            }
                            return f0.e(new b0(aVar6, aVarB, z14), y0Var);
                    }
                }
            };
            final int i16 = 2;
            f201554d = new d0() { // from class: z2.c0
                @Override // z2.d0
                public final b0 a(y0 y0Var) {
                    b0.a aVarB;
                    b0.a aVarB2;
                    boolean z14 = true;
                    switch (i16) {
                        case 0:
                            d0.a aVar = d0.a.f201551a;
                            return new b0(y0Var.i().a(y0Var.i().f201850c), y0Var.h().a(y0Var.h().f201851d), y0Var.c() == g.CROSSED);
                        case 1:
                            return f0.e(d0.a.f201552b.a(y0Var), y0Var);
                        case 2:
                            d0.a aVar2 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.b.f201558a);
                        case 3:
                            d0.a aVar3 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.C3762a.f201557a);
                        default:
                            d0.a aVar4 = d0.a.f201551a;
                            b0 b0VarG = y0Var.g();
                            if (b0VarG == null) {
                                return d0.a.f201554d.a(y0Var);
                            }
                            b0.a aVar5 = b0VarG.f201524b;
                            b0.a aVar6 = b0VarG.f201523a;
                            if (y0Var.a()) {
                                aVarB2 = f0.b(y0Var, y0Var.i(), aVar6);
                                aVarB = aVar5;
                                aVar5 = aVar6;
                                aVar6 = aVarB2;
                            } else {
                                aVarB = f0.b(y0Var, y0Var.h(), aVar5);
                                aVarB2 = aVarB;
                            }
                            if (p005kotlin.jvm.internal.s.g(aVarB2, aVar5)) {
                                return b0VarG;
                            }
                            if (y0Var.c() != g.CROSSED && (y0Var.c() != g.COLLAPSED || aVar6.f201527b <= aVarB.f201527b)) {
                                z14 = false;
                            }
                            return f0.e(new b0(aVar6, aVarB, z14), y0Var);
                    }
                }
            };
            final int i17 = 3;
            f201555e = new d0() { // from class: z2.c0
                @Override // z2.d0
                public final b0 a(y0 y0Var) {
                    b0.a aVarB;
                    b0.a aVarB2;
                    boolean z14 = true;
                    switch (i17) {
                        case 0:
                            d0.a aVar = d0.a.f201551a;
                            return new b0(y0Var.i().a(y0Var.i().f201850c), y0Var.h().a(y0Var.h().f201851d), y0Var.c() == g.CROSSED);
                        case 1:
                            return f0.e(d0.a.f201552b.a(y0Var), y0Var);
                        case 2:
                            d0.a aVar2 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.b.f201558a);
                        case 3:
                            d0.a aVar3 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.C3762a.f201557a);
                        default:
                            d0.a aVar4 = d0.a.f201551a;
                            b0 b0VarG = y0Var.g();
                            if (b0VarG == null) {
                                return d0.a.f201554d.a(y0Var);
                            }
                            b0.a aVar5 = b0VarG.f201524b;
                            b0.a aVar6 = b0VarG.f201523a;
                            if (y0Var.a()) {
                                aVarB2 = f0.b(y0Var, y0Var.i(), aVar6);
                                aVarB = aVar5;
                                aVar5 = aVar6;
                                aVar6 = aVarB2;
                            } else {
                                aVarB = f0.b(y0Var, y0Var.h(), aVar5);
                                aVarB2 = aVarB;
                            }
                            if (p005kotlin.jvm.internal.s.g(aVarB2, aVar5)) {
                                return b0VarG;
                            }
                            if (y0Var.c() != g.CROSSED && (y0Var.c() != g.COLLAPSED || aVar6.f201527b <= aVarB.f201527b)) {
                                z14 = false;
                            }
                            return f0.e(new b0(aVar6, aVarB, z14), y0Var);
                    }
                }
            };
            final int i18 = 4;
            f201556f = new d0() { // from class: z2.c0
                @Override // z2.d0
                public final b0 a(y0 y0Var) {
                    b0.a aVarB;
                    b0.a aVarB2;
                    boolean z14 = true;
                    switch (i18) {
                        case 0:
                            d0.a aVar = d0.a.f201551a;
                            return new b0(y0Var.i().a(y0Var.i().f201850c), y0Var.h().a(y0Var.h().f201851d), y0Var.c() == g.CROSSED);
                        case 1:
                            return f0.e(d0.a.f201552b.a(y0Var), y0Var);
                        case 2:
                            d0.a aVar2 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.b.f201558a);
                        case 3:
                            d0.a aVar3 = d0.a.f201551a;
                            return f0.a(y0Var, d0.a.C3762a.f201557a);
                        default:
                            d0.a aVar4 = d0.a.f201551a;
                            b0 b0VarG = y0Var.g();
                            if (b0VarG == null) {
                                return d0.a.f201554d.a(y0Var);
                            }
                            b0.a aVar5 = b0VarG.f201524b;
                            b0.a aVar6 = b0VarG.f201523a;
                            if (y0Var.a()) {
                                aVarB2 = f0.b(y0Var, y0Var.i(), aVar6);
                                aVarB = aVar5;
                                aVar5 = aVar6;
                                aVar6 = aVarB2;
                            } else {
                                aVarB = f0.b(y0Var, y0Var.h(), aVar5);
                                aVarB2 = aVarB;
                            }
                            if (p005kotlin.jvm.internal.s.g(aVarB2, aVar5)) {
                                return b0VarG;
                            }
                            if (y0Var.c() != g.CROSSED && (y0Var.c() != g.COLLAPSED || aVar6.f201527b <= aVarB.f201527b)) {
                                z14 = false;
                            }
                            return f0.e(new b0(aVar6, aVarB, z14), y0Var);
                    }
                }
            };
        }

        private a() {
        }
    }

    b0 a(y0 y0Var);
}
