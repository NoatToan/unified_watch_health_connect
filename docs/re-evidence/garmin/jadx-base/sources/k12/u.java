package k12;

import ei0.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/q;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$getUserBasicInfoV3$2", f = "UsersRepo.kt", l = {273}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.userprofile.model.q>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f102381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f102382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<p0> f102383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(d dVar, String str, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, List<? extends p0> list2, t13.d<? super u> dVar2) {
        super(1, dVar2);
        this.f102380b = dVar;
        this.f102381c = str;
        this.f102382d = list;
        this.f102383e = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f102380b, this.f102381c, this.f102382d, this.f102383e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.userprofile.model.q>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102379a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i12.b bVar = this.f102380b.f102316a;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f102382d;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        List<p0> list2 = this.f102383e;
        if (list2 != null) {
            arrayList = new ArrayList(p13.y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((p0) it3.next()).f64293a);
            }
        } else {
            arrayList = null;
        }
        this.f102379a = 1;
        Object objP = bVar.p(this.f102381c, arrayList2, arrayList, this);
        return objP == aVar ? aVar : objP;
    }
}
