package ne0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.UpdateDogStatusUseCase$invoke$2", f = "UpdateDogStatusUseCase.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f125443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f125444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je0.j f125445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, long j8, je0.j jVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f125443b = f0Var;
        this.f125444c = j8;
        this.f125445d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f125443b, this.f125444c, this.f125445d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125442a;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = this.f125443b.f125450a;
            je0.t tVar = new je0.t(this.f125445d.f98544a);
            this.f125442a = 1;
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.u(wVar, this.f125444c, tVar, null), this);
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
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
