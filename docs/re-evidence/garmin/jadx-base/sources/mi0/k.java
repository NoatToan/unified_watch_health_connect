package mi0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$updateFollowerQuery$1", f = "OthersFriendListViewModel.kt", l = {211}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f118981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f118982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, String str, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f118981b = jVar;
        this.f118982c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f118981b, this.f118982c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118980a;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = this.f118981b.f118908l;
            this.f118980a = 1;
            p2Var.setValue(this.f118982c);
            if (Unit.INSTANCE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
