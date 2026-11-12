package gk1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.google.GoogleHealthConnectViewModel$checkPermissions$1", f = "GoogleHealthConnectViewModel.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f77739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f77741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f77741c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f77741c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c2 c2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77740b;
        e eVar = this.f77741c;
        if (i14 == 0) {
            r.b(obj);
            c2 c2Var2 = eVar.f77744c;
            com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar2 = eVar.f77742a;
            this.f77739a = c2Var2;
            this.f77740b = 1;
            Object objN = aVar2.n(this);
            if (objN == aVar) {
                return aVar;
            }
            c2Var = c2Var2;
            obj = objN;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2Var = this.f77739a;
            r.b(obj);
        }
        c2Var.setValue(obj);
        eVar.f77745d.setValue(Boolean.valueOf(eVar.f77742a.f()));
        return Unit.INSTANCE;
    }
}
