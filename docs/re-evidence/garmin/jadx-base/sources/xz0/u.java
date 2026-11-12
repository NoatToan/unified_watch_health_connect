package xz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestViewModel$cancelGroupMemberRequest$1", f = "InboxRequestViewModel.kt", l = {185}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f192843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f192844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f192845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, long j8, long j14, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f192843b = pVar;
        this.f192844c = j8;
        this.f192845d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f192843b, this.f192844c, this.f192845d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192842a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        jm0.b bVar = this.f192843b.f192818g;
        this.f192842a = 1;
        Object objR = bVar.r(this.f192844c, this.f192845d, this);
        return objR == aVar ? aVar : objR;
    }
}
