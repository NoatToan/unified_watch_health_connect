package dv;

import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bic.CollectDobActivity$CMCCollectDOB$1$1$1", f = "CollectDobActivity.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectDobActivity f61325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CollectDobActivity collectDobActivity, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f61325b = collectDobActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f61325b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61324a;
        if (i14 == 0) {
            r.b(obj);
            dq1.a aVar2 = (dq1.a) KoinJavaComponent.get$default(dq1.a.class, null, null, 6, null);
            this.f61324a = 1;
            obj = aVar2.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        CollectDobActivity collectDobActivity = this.f61325b;
        if (zBooleanValue) {
            CollectDobActivity.a aVar3 = CollectDobActivity.f30702e;
            ((g) collectDobActivity.f30703d.getValue()).x4();
        } else {
            CollectDobActivity.a aVar4 = CollectDobActivity.f30702e;
            collectDobActivity.ea();
        }
        return Unit.INSTANCE;
    }
}
