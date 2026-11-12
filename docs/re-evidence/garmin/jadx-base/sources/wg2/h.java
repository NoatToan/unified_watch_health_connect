package wg2;

import e23.p;
import e23.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.s;
import r53.u1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$registerLiveActivityListener$1", f = "SessionStateViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f185195b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "bluetoothOn", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$registerLiveActivityListener$1$1", f = "SessionStateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ of2.b0 f185196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f185197b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(dVar);
            aVar.f185196a = b0Var;
            aVar.f185197b = zBooleanValue;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            of2.b0 b0Var = this.f185196a;
            boolean z14 = this.f185197b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.valueOf(!z14 || (b0Var != null && da2.d.b().f58886a.f111646e.a(b0Var.f131745b.getF92746j()).length == 0));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "disconnected", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$registerLiveActivityListener$1$2", f = "SessionStateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f185198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f185199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f185199b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f185199b, dVar);
            bVar.f185198a = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z14 = this.f185198a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = this.f185199b.f185150e;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.valueOf(z14)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f185195b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f185195b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185194a;
        if (i14 == 0) {
            r.b(obj);
            int i15 = g.f185145o;
            g gVar = this.f185195b;
            u1 u1Var = new u1(gVar.x4().f71482f, gVar.f185152g, new a(null));
            b bVar = new b(gVar, null);
            this.f185194a = 1;
            if (s.k(u1Var, bVar, this) == aVar) {
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
