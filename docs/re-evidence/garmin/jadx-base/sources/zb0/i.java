package zb0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000f\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceDetailsViewModel$getDevice$1", f = "DeviceDetailsViewModel.kt", l = {27, 28}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<androidx.lifecycle.t0<sd2.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f203530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f203531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f203532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, long j8, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f203531c = gVar;
        this.f203532d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f203531c, this.f203532d, dVar);
        iVar.f203530b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<sd2.f> t0Var, t13.d<? super Unit> dVar) {
        return ((i) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f203530b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203529a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f203530b = t0Var;
            this.f203529a = 1;
            if (this.f203531c.y4(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(this.f203532d, null);
        this.f203530b = null;
        this.f203529a = 2;
    }
}
