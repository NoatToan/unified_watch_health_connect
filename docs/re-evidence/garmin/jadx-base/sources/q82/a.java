package q82;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import t13.d;
import t82.f;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: q82.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.ui.patterns.pager.range.PagerRangeControlKt$PagerRangeControl$1$1$1", f = "PagerRangeControl.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class C2699a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q82.b f143358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2699a(q82.b bVar, d<? super C2699a> dVar) {
            super(2, dVar);
            this.f143358b = bVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C2699a(this.f143358b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2699a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143357a;
            if (i14 == 0) {
                r.b(obj);
                this.f143357a = 1;
                if (this.f143358b.c(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.ui.patterns.pager.range.PagerRangeControlKt$PagerRangeControl$1$1$2", f = "PagerRangeControl.kt", l = {39}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q82.b f143360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q82.b bVar, d<? super b> dVar) {
            super(2, dVar);
            this.f143360b = bVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f143360b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143359a;
            if (i14 == 0) {
                r.b(obj);
                this.f143359a = 1;
                if (this.f143360b.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143361a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.BACKWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f143361a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, q82.b bVar, b92.a aVar, m mVar, int i14, int i15) {
        int i16;
        b92.a aVar2;
        int i17;
        b92.a aVar3;
        bVar.getClass();
        o0 o0VarE = mVar.E(-2094337325);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(bVar) ? 32 : 16);
        int i19 = i15 & 4;
        if (i19 != 0) {
            i17 = i18 | 384;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i17 = i18 | (o0VarE.B(aVar2) ? 256 : 128);
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            b92.a aVar4 = i19 != 0 ? null : aVar2;
            x1 x1Var = n.f135158a;
            p1 p1VarB = bVar.b(o0VarE, (i17 >> 3) & 14);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            String str = ((q82.b.a) p1VarB.getF182175a()).f143362a;
            t82.e eVar = new t82.e(!((q82.b.a) p1VarB.getF182175a()).f143363b, !((q82.b.a) p1VarB.getF182175a()).f143364c);
            boolean zB = o0VarE.B(b0Var) | ((i17 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new ph1.d(10, b0Var, bVar);
                o0VarE.K(objQ2);
            }
            l lVar = (l) objQ2;
            int i24 = b92.a.f16960b;
            t82.d.b(rVar, str, eVar, aVar4, lVar, o0VarE, (i17 & 14) | ((i17 << 3) & 7168));
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(rVar, bVar, aVar3, i14, i15, 20);
        }
    }
}
