package ei0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lhi0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$searchFollowing$2", f = "FollowRepoImpl.kt", l = {336}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends hi0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f64233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f64234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f64235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f64236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<p0> f64237h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(e eVar, String str, String str2, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, Integer num, Integer num2, List<? extends p0> list2, t13.d<? super h0> dVar) {
        super(1, dVar);
        this.f64231b = eVar;
        this.f64232c = str;
        this.f64233d = str2;
        this.f64234e = list;
        this.f64235f = num;
        this.f64236g = num2;
        this.f64237h = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h0(this.f64231b, this.f64232c, this.f64233d, this.f64234e, this.f64235f, this.f64236g, this.f64237h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends hi0.a>>> dVar) {
        return ((h0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64230a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c cVar = this.f64231b.f64197a;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f64234e;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        List<p0> list2 = this.f64237h;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((p0) it3.next()).name());
        }
        o53.i0<c83.a0<List<hi0.a>>> i0VarU = cVar.u(this.f64232c, this.f64233d, arrayList, this.f64235f, this.f64236g, arrayList2);
        this.f64230a = 1;
        Object objAwait = i0VarU.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
