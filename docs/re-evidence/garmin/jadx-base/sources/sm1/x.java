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
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$deleteNap$1", f = "SleepReportsViewModel.kt", l = {560}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f160263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f160264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f160265d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$deleteNap$1$1", f = "SleepReportsViewModel.kt", l = {561}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f160267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f160268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f160269d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s sVar, Long l14, e23.l<? super Boolean, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160267b = sVar;
            this.f160268c = l14;
            this.f160269d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160267b, this.f160268c, this.f160269d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160266a;
            s sVar = this.f160267b;
            if (i14 == 0) {
                o13.r.b(obj);
                nm1.a aVar2 = sVar.f160181a;
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                long jLongValue = this.f160268c.longValue();
                this.f160266a = 1;
                obj = aVar2.c(dateTimeNow, jLongValue, this);
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
            e23.l<Boolean, Unit> lVar = this.f160269d;
            if (z14) {
                u82.a aVar3 = sVar.f160192l;
                DateTime dateTimeNow2 = DateTime.now();
                dateTimeNow2.getClass();
                aVar3.i(new o82.a(g22.k.z(dateTimeNow2).b(), null, 2, null), true);
                lVar.invoke(Boolean.TRUE);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                lVar.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(s sVar, Long l14, e23.l<? super Boolean, Unit> lVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f160263b = sVar;
        this.f160264c = l14;
        this.f160265d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f160263b, this.f160264c, this.f160265d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160262a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f160263b, this.f160264c, this.f160265d, null);
            this.f160262a = 1;
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
