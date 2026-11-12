package cg1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.SegmentViewModel$removeFavorite$1", f = "SegmentViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.l<t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f27124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, String str, t13.d<? super a0> dVar) {
        super(1, dVar);
        this.f27124b = c0Var;
        this.f27125c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a0(this.f27124b, this.f27125c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends String>> dVar) {
        return ((a0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27123a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yf1.b bVar = this.f27124b.f27136b;
        this.f27123a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new yf1.h(bVar, this.f27125c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
