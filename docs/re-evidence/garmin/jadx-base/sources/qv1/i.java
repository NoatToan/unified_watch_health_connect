package qv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getFBTPlanByID$1", f = "FBTProgressReportViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f148158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f148159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uv1.c f148160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.e f148161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, long j8, uv1.c cVar, pi0.e eVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f148158c = bVar;
        this.f148159d = j8;
        this.f148160e = cVar;
        this.f148161f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f148158c, this.f148159d, this.f148160e, this.f148161f, dVar);
        iVar.f148157b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        b0 b0Var = (b0) this.f148157b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f148156a;
        b bVar = this.f148158c;
        if (i14 == 0) {
            r.b(obj);
            bVar.f147942i.k(null, new vv1.c(Boolean.TRUE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 2147483646, null));
            kv1.b bVar2 = bVar.f147936c;
            this.f148157b = b0Var;
            this.f148156a = 1;
            objC = bVar2.c(this.f148159d, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objC = obj;
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            bVar.L4((m) ((v2.b) v2Var).f47386a, this.f148160e, this.f148161f);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while getting training plan dto ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTProgressReportViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
