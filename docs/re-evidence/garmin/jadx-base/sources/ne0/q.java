package ne0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetAnimalProfileUseCase$invoke$2", f = "GetAnimalProfileUseCase.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f125511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f125512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, long j8, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f125511b = rVar;
        this.f125512c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f125511b, this.f125512c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125510a;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = this.f125511b.f125513a;
            this.f125510a = 1;
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.j(wVar, this.f125512c, null), this);
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
        if (v2Var instanceof v2.b) {
            return Boolean.valueOf(((je0.c) ((v2.b) v2Var).f47386a).f98481a);
        }
        if (v2Var instanceof v2.a) {
            q2.u("Failed to get animal profile");
            return null;
        }
        u0.r();
        return null;
    }
}
