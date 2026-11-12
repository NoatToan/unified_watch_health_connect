package mi0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$updateSearchQuery$1", f = "FriendDiscoverListViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f118763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f118764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f118763b = cVar;
        this.f118764c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f118763b, this.f118764c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118762a;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = this.f118763b.f118712d;
            this.f118762a = 1;
            p2Var.setValue(this.f118764c);
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
