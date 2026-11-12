package yv0;

import android.os.Bundle;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import t60.g;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.logging.presentation.component.upsell.LifestyleLoggingCrossSellingItemKt$LifestyleLoggingCrossSellingItem$1$1", f = "LifestyleLoggingCrossSellingItem.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f199837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, d<? super a> dVar) {
        super(2, dVar);
        this.f199837a = gVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f199837a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        g gVar = this.f199837a;
        gVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("Screen", gVar.f162711a);
        bundle.putBoolean("ShowCrossSellingBanner", true);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "ShowCrossSellingBanner");
        return Unit.INSTANCE;
    }
}
