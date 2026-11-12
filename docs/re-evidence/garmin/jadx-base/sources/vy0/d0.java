package vy0;

import android.os.Bundle;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import uy0.l1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreViewModel$updateSearching$1", f = "MoreViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f180702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f180703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a0 a0Var, boolean z14, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f180702a = a0Var;
        this.f180703b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f180702a, this.f180703b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a0 a0Var = this.f180702a;
        p2 p2Var = a0Var.f180679g;
        do {
            value = p2Var.getValue();
            ((g0) value).getClass();
            z14 = this.f180703b;
        } while (!p2Var.b(value, new g0(z14, "")));
        if (z14) {
            l1 l1Var = a0Var.f180677e;
            l1Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("Screen", "MainMenu");
            bundle.putString("Action", "TappedSearch");
            ((ht.a) l1Var.f173230c.getValue()).getClass();
            ht.a.a(bundle, "UserAction");
        }
        return Unit.INSTANCE;
    }
}
