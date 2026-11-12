package sm1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$checkPerformanceDevice$1", f = "SleepReportsViewModel.kt", l = {485}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f160257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f160258c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$checkPerformanceDevice$1$1", f = "SleepReportsViewModel.kt", l = {486}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f160260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f160261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, s sVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160260b = j8;
            this.f160261c = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160260b, this.f160261c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160259a;
            long j8 = this.f160260b;
            if (i14 == 0) {
                o13.r.b(obj);
                pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
                String strValueOf = String.valueOf(j8);
                this.f160259a = 1;
                obj = jVarA.g(strValueOf, this);
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
            s sVar = this.f160261c;
            if (z14) {
                if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getAcuteChronicWorkloadRatioCapable(), Boolean.TRUE)) {
                    sVar.A4(true);
                } else {
                    t60.a aVar2 = s.f160180t;
                    sVar.getClass();
                    ge1.b.T(v1.a(sVar), null, null, new v(sVar, j8, null), 3);
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                t60.a aVar3 = s.f160180t;
                sVar.getClass();
                ge1.b.T(v1.a(sVar), null, null, new v(sVar, j8, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j8, s sVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f160257b = j8;
        this.f160258c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f160257b, this.f160258c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160256a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f160257b, this.f160258c, null);
            this.f160256a = 1;
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
