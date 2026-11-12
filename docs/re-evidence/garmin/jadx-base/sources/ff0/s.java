package ff0;

import c83.a0;
import com.garmin.android.apps.connectmobile.v2;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgRepositoryImpl$getActivitySummary$deviceInfoResult$1", f = "EcgRepositoryImpl.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super a0<Long>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f71107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2<gf0.b> f71108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, v2<gf0.b> v2Var, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f71107b = vVar;
        this.f71108c = v2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f71107b, this.f71108c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Long>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71106a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<Long>> i0VarA = this.f71107b.f71115b.a(String.valueOf(((gf0.b) ((v2.b) this.f71108c).f47386a).getSummary().getHealthDeviceId()));
        this.f71106a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
