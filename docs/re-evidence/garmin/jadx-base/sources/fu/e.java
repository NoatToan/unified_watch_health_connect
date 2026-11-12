package fu;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.api.FitnessStatsActivityDomainRepo$getFitnessStatsActivities$2", f = "FitnessStatsDomainAPI.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f73486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f73487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f73488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f73486b = fVar;
        this.f73487c = str;
        this.f73488d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f73486b, this.f73487c, this.f73488d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f73485a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        d dVar = this.f73486b.f73489a;
        fy1.i.f73924a.getClass();
        List<String> list = (List) fy1.i.f73928e.getValue();
        this.f73485a = 1;
        Object objA = dVar.a(this.f73487c, this.f73488d, null, list, true, false, this);
        return objA == aVar ? aVar : objA;
    }
}
