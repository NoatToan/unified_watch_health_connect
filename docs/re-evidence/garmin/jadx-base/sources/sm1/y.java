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
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$editNap$1", f = "SleepReportsViewModel.kt", l = {543}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f160271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f160272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f160273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km1.b f160274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<km1.b, Unit> f160275f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$editNap$1$1", f = "SleepReportsViewModel.kt", l = {544}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f160277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f160278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f160279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ km1.b f160280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.l<km1.b, Unit> f160281f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s sVar, Long l14, Long l15, km1.b bVar, e23.l<? super km1.b, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160277b = sVar;
            this.f160278c = l14;
            this.f160279d = l15;
            this.f160280e = bVar;
            this.f160281f = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160277b, this.f160278c, this.f160279d, this.f160280e, this.f160281f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160276a;
            s sVar = this.f160277b;
            if (i14 == 0) {
                o13.r.b(obj);
                nm1.a aVar3 = sVar.f160181a;
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                long jLongValue = this.f160278c.longValue();
                long jLongValue2 = this.f160279d.longValue();
                this.f160276a = 1;
                aVar = this;
                obj = aVar3.d(dateTimeNow, jLongValue, jLongValue2, this.f160280e, aVar);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                aVar = this;
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            e23.l<km1.b, Unit> lVar = aVar.f160281f;
            if (z14) {
                u82.a aVar4 = sVar.f160192l;
                DateTime dateTimeNow2 = DateTime.now();
                dateTimeNow2.getClass();
                aVar4.i(new o82.a(g22.k.z(dateTimeNow2).b(), null, 2, null), true);
                lVar.invoke(aVar.f160280e);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                lVar.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(s sVar, Long l14, Long l15, km1.b bVar, e23.l<? super km1.b, Unit> lVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f160271b = sVar;
        this.f160272c = l14;
        this.f160273d = l15;
        this.f160274e = bVar;
        this.f160275f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f160271b, this.f160272c, this.f160273d, this.f160274e, this.f160275f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160270a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f160271b, this.f160272c, this.f160273d, this.f160274e, this.f160275f, null);
            this.f160270a = 1;
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
