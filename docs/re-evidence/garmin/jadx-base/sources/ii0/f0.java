package ii0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.k2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.OthersFriendListKt$OthersFriendList$isQueryLoading$2$1", f = "OthersFriendList.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<k2<Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f93599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc.d<li0.d0> f93600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zc.d<li0.d0> dVar, t13.d<? super f0> dVar2) {
        super(2, dVar2);
        this.f93600c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f93600c, dVar);
        f0Var.f93599b = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(k2<Boolean> k2Var, t13.d<? super Unit> dVar) {
        return ((f0) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        k2 k2Var = (k2) this.f93599b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93598a;
        zc.d<li0.d0> dVar = this.f93600c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (dVar.d().f196390f) {
                k2Var.setValue(Boolean.FALSE);
            } else {
                this.f93599b = k2Var;
                this.f93598a = 1;
                if (o53.m0.b(500L, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k2Var.setValue(Boolean.valueOf(!dVar.d().f196390f));
        return Unit.INSTANCE;
    }
}
