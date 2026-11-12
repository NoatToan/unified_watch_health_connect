package p003ji0;

import e23.p;
import kotlin.m3;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.follow.presentation.common.TabbedHorizontalPagerKt$TabbedHorizontalPager$2$1", f = "TabbedHorizontalPager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m4.q f98808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f98809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m4.q qVar, m3 m3Var, d<? super q> dVar) {
        super(2, dVar);
        this.f98808a = qVar;
        this.f98809b = m3Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new q(this.f98808a, this.f98809b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f98808a.y(false);
        m3 m3Var = this.f98809b;
        if (m3Var != null) {
            m3Var.hide();
        }
        return Unit.INSTANCE;
    }
}
