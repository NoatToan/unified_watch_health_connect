package mi0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$updateFollowingQuery$1", f = "OthersFriendListViewModel.kt", l = {217}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f118984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f118985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, String str, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f118984b = jVar;
        this.f118985c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f118984b, this.f118985c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118983a;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = this.f118984b.f118911o;
            this.f118983a = 1;
            p2Var.setValue(this.f118985c);
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
