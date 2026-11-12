package ei0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lhi0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$getFollowRequestList$2", f = "FollowRepoImpl.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<hi0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f64308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f64309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f64310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<p0> f64311f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(e eVar, Integer num, Integer num2, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, List<? extends p0> list2, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f64307b = eVar;
        this.f64308c = num;
        this.f64309d = num2;
        this.f64310e = list;
        this.f64311f = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f64307b, this.f64308c, this.f64309d, this.f64310e, this.f64311f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<hi0.k>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64306a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c cVar = this.f64307b.f64197a;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f64310e;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        List<p0> list2 = this.f64311f;
        if (list2 != null) {
            arrayList = new ArrayList(p13.y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((p0) it3.next()).f64293a);
            }
        } else {
            arrayList = null;
        }
        o53.i0<c83.a0<hi0.k>> i0VarM = cVar.m(this.f64308c, this.f64309d, arrayList2, arrayList);
        this.f64306a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
