package xz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestViewModel$declineGroupInvitation$1", f = "InboxRequestViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f192850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f192851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f192852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p pVar, long j8, Long l14, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f192850b = pVar;
        this.f192851c = j8;
        this.f192852d = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f192850b, this.f192851c, this.f192852d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192849a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        jm0.b bVar = this.f192850b.f192818g;
        this.f192849a = 1;
        Object objZ = bVar.z(this.f192851c, this.f192852d, this);
        return objZ == aVar ? aVar : objZ;
    }
}
