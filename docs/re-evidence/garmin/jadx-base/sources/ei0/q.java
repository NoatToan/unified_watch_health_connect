package ei0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lhi0/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$getContactsByPhone$2", f = "FollowRepoImpl.kt", l = {293}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<hi0.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f64296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f64297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(e eVar, List<String> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f64295b = eVar;
        this.f64296c = list;
        this.f64297d = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f64295b, this.f64296c, this.f64297d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<hi0.m>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64294a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        pz0.d dVar = this.f64295b.f64199c;
        List<String> listS0 = p13.h0.S0(this.f64296c, 1000);
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f64297d;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        o53.i0<c83.a0<hi0.m>> i0VarG = dVar.g(listS0, arrayList);
        this.f64294a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
