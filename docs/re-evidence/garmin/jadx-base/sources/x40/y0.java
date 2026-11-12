package x40;

import com.google.android.exoplayer2.audio.WavUtil;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "La50/g;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$outAndBack$3", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.q<r53.j<? super a50.g>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f188815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l0 l0Var, t13.d<? super y0> dVar) {
        super(3, dVar);
        this.f188815a = l0Var;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super a50.g> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new y0(this.f188815a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f188815a.F;
        p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, null, 0, false, false, false, false, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE));
        return Unit.INSTANCE;
    }
}
