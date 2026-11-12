package w51;

import i3.fe;
import l72.d3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesScreenKt$PendingActivitiesScreen$2$1", f = "PendingActivitiesScreen.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f182306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<w> f182308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f182309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f182310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x3<w> x3Var, fe feVar, h0 h0Var, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f182308c = x3Var;
        this.f182309d = feVar;
        this.f182310e = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f182308c, this.f182309d, this.f182310e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182307b;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f182308c.getF182175a().f182448d;
            if (fVar != null) {
                String str = fVar.f182255a;
                h0 h0Var2 = this.f182310e;
                this.f182306a = h0Var2;
                this.f182307b = 1;
                if (d3.c(this.f182309d, str, null, this) == aVar) {
                    return aVar;
                }
                h0Var = h0Var2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h0Var = this.f182306a;
        o13.r.b(obj);
        p2 p2Var = h0Var.f182267b;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, w.a((w) value, false, false, null, null, false, 55)));
        return Unit.INSTANCE;
    }
}
