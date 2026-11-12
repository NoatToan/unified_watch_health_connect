package hl1;

import java.util.Set;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityScreenKt$SelectActivityScreen$1$1", f = "SelectActivityScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<f> f84412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.s<zf2.d, Boolean, Boolean, Boolean, Boolean, Unit> f84413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f84414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(x3<f> x3Var, e23.s<? super zf2.d, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, Unit> sVar, n nVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f84412a = x3Var;
        this.f84413b = sVar;
        this.f84414c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f84412a, this.f84413b, this.f84414c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x3<f> x3Var = this.f84412a;
        zf2.d dVar = x3Var.getF182175a().f84390g;
        if (dVar != null && !x3Var.getF182175a().f84391h) {
            boolean zContains = x3Var.getF182175a().f84389f.contains(dVar);
            n nVar = this.f84414c;
            nVar.getClass();
            fl1.m mVar = nVar.f84420f;
            Set<String> set = nVar.f84428n;
            mVar.getClass();
            this.f84413b.invoke(dVar, Boolean.valueOf(fl1.m.a(set, dVar)), Boolean.valueOf(zContains), Boolean.TRUE, Boolean.valueOf(x3Var.getF182175a().f84392i));
            nVar.z4(null);
        }
        return Unit.INSTANCE;
    }
}
