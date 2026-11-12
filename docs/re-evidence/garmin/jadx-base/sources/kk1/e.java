package kk1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.details.ThirdPartyAppDetailsViewModel$disconnectApp$2", f = "ThirdPartyAppDetailsViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f105143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f105143b = gVar;
        this.f105144c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f105143b, this.f105144c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        boolean z14;
        p2 p2Var;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105142a;
        g gVar = this.f105143b;
        if (i14 == 0) {
            r.b(obj);
            s92.g gVar2 = gVar.f105152f;
            if (gVar2 != null) {
                o oVar = gVar.f105147a;
                this.f105142a = 1;
                obj = oVar.w(this.f105144c, gVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                zBooleanValue = false;
            }
            z14 = zBooleanValue;
            p2Var = gVar.f105154h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, j.a((j) value, false, !z14, null, z14, 28)));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        z14 = zBooleanValue;
        p2Var = gVar.f105154h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, j.a((j) value, false, !z14, null, z14, 28)));
        return Unit.INSTANCE;
    }
}
