package h10;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.group.service.model.GroupSearchResultDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupSearchResultDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.GroupsViewModel$searchForGroups$1", f = "GroupsViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super v2<? extends GroupSearchResultDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f80792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f80793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f80796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, int i14, int i15, boolean z14, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f80792b = oVar;
        this.f80793c = str;
        this.f80794d = i14;
        this.f80795e = i15;
        this.f80796f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f80792b, this.f80793c, this.f80794d, this.f80795e, this.f80796f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends GroupSearchResultDTO>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80791a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ym0.a aVar2 = this.f80792b.f80798b;
        this.f80791a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new p0(aVar2, this.f80793c, this.f80794d, this.f80795e, this.f80796f, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
