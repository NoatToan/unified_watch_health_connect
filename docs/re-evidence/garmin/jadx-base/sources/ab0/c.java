package ab0;

import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import y80.s0;
import z80.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.ProfileSetupViewModel$profileComplete$1", f = "ProfileSetupViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f2529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f2531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, d<? super c> dVar) {
        super(2, dVar);
        this.f2531c = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f2531c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        l lVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2530b;
        a aVar2 = this.f2531c;
        if (i14 == 0) {
            r.b(obj);
            l lVar3 = aVar2.f2519l;
            if (lVar3 != null && (lVar = (l) aVar2.f2518k.f150540a.getValue()) != null) {
                aVar2.f2515h.k(null, Boolean.TRUE);
                s0 s0Var = aVar2.f2511d;
                Set<String> set = aVar2.f2521n;
                this.f2529a = lVar;
                this.f2530b = 1;
                if (s0Var.b(lVar3, lVar, set, this) == aVar) {
                    return aVar;
                }
                lVar2 = lVar;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar2 = this.f2529a;
        r.b(obj);
        Boolean bool = lVar2.f203081j;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            f12.l.f68084a.getClass();
            f12.l.a.a().v4(zBooleanValue);
        }
        aVar2.f2515h.k(null, Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
