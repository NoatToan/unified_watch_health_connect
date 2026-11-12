package sm1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$addNap$1", f = "SleepReportsViewModel.kt", l = {524}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f160241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.b f160242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<km1.b, Unit> f160243d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$addNap$1$1", f = "SleepReportsViewModel.kt", l = {525}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f160245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ km1.b f160246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<km1.b, Unit> f160247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s sVar, km1.b bVar, e23.l<? super km1.b, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160245b = sVar;
            this.f160246c = bVar;
            this.f160247d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160245b, this.f160246c, this.f160247d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160244a;
            km1.b bVar = this.f160246c;
            s sVar = this.f160245b;
            if (i14 == 0) {
                o13.r.b(obj);
                nm1.a aVar2 = sVar.f160181a;
                this.f160244a = 1;
                obj = aVar2.a(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            e23.l<km1.b, Unit> lVar = this.f160247d;
            if (z14) {
                u82.a aVar3 = sVar.f160192l;
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                aVar3.i(new o82.a(g22.k.z(dateTimeNow).b(), null, 2, null), true);
                lVar.invoke(bVar);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                lVar.invoke(null);
            }
            sVar.z4(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(s sVar, km1.b bVar, e23.l<? super km1.b, Unit> lVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f160241b = sVar;
        this.f160242c = bVar;
        this.f160243d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f160241b, this.f160242c, this.f160243d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160240a;
        if (i14 == 0) {
            o13.r.b(obj);
            s sVar = this.f160241b;
            sVar.z4(true);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(sVar, this.f160242c, this.f160243d, null);
            this.f160240a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
