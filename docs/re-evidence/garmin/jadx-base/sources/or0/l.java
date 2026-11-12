package or0;

import android.app.Activity;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.x1;
import r53.c2;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsScreenKt$IntensityMinutesReportsScreen$1$2$1$2$1$1", f = "IntensityMinutesReportsScreen.kt", l = {173}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f133355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f133356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o82.g f133357d;

        /* JADX INFO: renamed from: or0.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "currentPageInterval", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsScreenKt$IntensityMinutesReportsScreen$1$2$1$2$1$1$2", f = "IntensityMinutesReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2533a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f133358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f133359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o82.g f133360c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2533a(m mVar, o82.g gVar, t13.d<? super C2533a> dVar) {
                super(2, dVar);
                this.f133359b = mVar;
                this.f133360c = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2533a c2533a = new C2533a(this.f133359b, this.f133360c, dVar);
                c2533a.f133358a = obj;
                return c2533a;
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((C2533a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object value2;
                o82.a aVar = (o82.a) this.f133358a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                m mVar = this.f133359b;
                mVar.getClass();
                p2 p2Var = mVar.f133367f;
                o82.g gVar = this.f133360c;
                gVar.getClass();
                aVar.getClass();
                int i14 = m.b.f133373a[gVar.ordinal()];
                if (i14 == 1 || i14 == 2) {
                    boolean z14 = aVar.f130843a.compareTo(mVar.f133365d) >= 0 && aVar.f130844b.compareTo(mVar.f133366e) <= 0;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, q.a((q) value, false, z14, null, null, 0, null, 61)));
                } else {
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, q.a((q) value2, false, false, null, null, 0, null, 61)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n82.f fVar, m mVar, o82.g gVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133355b = fVar;
            this.f133356c = mVar;
            this.f133357d = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133355b, this.f133356c, this.f133357d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133354a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new d52.p(this.f133355b, 9));
                C2533a c2533a = new C2533a(this.f133356c, this.f133357d, null);
                this.f133354a = 1;
                if (s.k(c2VarS, c2533a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133361a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f133361a = iArr;
        }
    }

    public static final void a(Activity activity, m mVar, e23.a<Unit> aVar, p3.m mVar2, int i14) {
        mVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar2.E(1973213528);
        int i15 = (o0VarE.r(activity) ? 4 : 2) | i14 | (o0VarE.r(mVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-1637847922, new k(mVar, aVar, activity), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(activity, mVar, aVar, i14);
        }
    }
}
