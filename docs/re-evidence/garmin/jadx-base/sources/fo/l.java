package fo;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListScreenKt$ActivitiesListScreen$1$2$2$1", f = "ActivitiesListScreen.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f72392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p1<Boolean> p1Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f72392b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f72392b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72391a;
        p1<Boolean> p1Var = this.f72392b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (p1Var.getF182175a().booleanValue()) {
                e53.c.a aVar2 = e53.c.f63094b;
                long jF = e53.e.f(5000L, e53.f.MILLISECONDS);
                this.f72391a = 1;
                if (m0.c(jF, this) == aVar) {
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
        p1Var.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
