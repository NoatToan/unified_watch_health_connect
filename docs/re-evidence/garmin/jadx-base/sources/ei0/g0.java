package ei0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lhi0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$searchFollower$2", f = "FollowRepoImpl.kt", l = {317}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends hi0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f64222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f64223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f64224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f64225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<p0> f64226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(e eVar, String str, String str2, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, Integer num, Integer num2, List<? extends p0> list2, t13.d<? super g0> dVar) {
        super(1, dVar);
        this.f64220b = eVar;
        this.f64221c = str;
        this.f64222d = str2;
        this.f64223e = list;
        this.f64224f = num;
        this.f64225g = num2;
        this.f64226h = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g0(this.f64220b, this.f64221c, this.f64222d, this.f64223e, this.f64224f, this.f64225g, this.f64226h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends hi0.a>>> dVar) {
        return ((g0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64219a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c cVar = this.f64220b.f64197a;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f64223e;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        List<p0> list2 = this.f64226h;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((p0) it3.next()).name());
        }
        o53.i0<c83.a0<List<hi0.a>>> i0VarO = cVar.o(this.f64221c, this.f64222d, arrayList, this.f64224f, this.f64225g, arrayList2);
        this.f64219a = 1;
        Object objAwait = i0VarO.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
