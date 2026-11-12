package k12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$getUserProfilePrivacyV2$2", f = "UsersRepo.kt", l = {252}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.userprofile.model.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f102393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f102394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(d dVar, String str, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, t13.d<? super y> dVar2) {
        super(1, dVar2);
        this.f102392b = dVar;
        this.f102393c = str;
        this.f102394d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f102392b, this.f102393c, this.f102394d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.userprofile.model.r>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102391a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        eo1.a aVar2 = this.f102392b.f102317b;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f102394d;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        i0<c83.a0<com.garmin.android.apps.connectmobile.userprofile.model.r>> i0VarE = aVar2.e(this.f102393c, arrayList);
        this.f102391a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
