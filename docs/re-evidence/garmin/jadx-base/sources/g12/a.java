package g12;

import androidx.lifecycle.t0;
import m12.z;
import o13.u;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/t0;", "Lo13/u;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$e;", "Lj12/k;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.ProfileAboutViewModel$getUserProfileAbout$1", f = "ProfileAboutViewModel.kt", l = {22, 23, 24}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<t0<u<? extends com.garmin.android.library.backgroundtaskmanagement.b.c, ? extends com.garmin.android.library.backgroundtaskmanagement.b.e, ? extends j12.k>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f74872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f74874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f74875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f74876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k22.a f74877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, k22.a aVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f74875d = cVar;
        this.f74876e = str;
        this.f74877f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f74875d, this.f74876e, this.f74877f, dVar);
        aVar.f74874c = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(t0<u<? extends com.garmin.android.library.backgroundtaskmanagement.b.c, ? extends com.garmin.android.library.backgroundtaskmanagement.b.e, ? extends j12.k>> t0Var, t13.d<? super Unit> dVar) {
        return ((a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u uVar;
        t0 t0Var = (t0) this.f74874c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f74873b;
        String str = this.f74876e;
        c cVar = this.f74875d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                uVar = this.f74872a;
                o13.r.b(obj);
                this.f74874c = null;
                this.f74872a = null;
                this.f74873b = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        k12.d dVar = cVar.f74881a;
        this.f74874c = t0Var;
        this.f74873b = 1;
        dVar.getClass();
        z zVar = new z(str);
        o53.s sVarB = gl.b.b();
        zVar.f115915m = sVarB;
        sVarB.J(new kp2.a(zVar, 19));
        com.garmin.android.library.backgroundtaskmanagement.c.d(zVar, null);
        o53.s sVar = zVar.f115915m;
        if (sVar == null) {
            p005kotlin.jvm.internal.s.m("deferredResult");
            throw null;
        }
        obj = sVar.C(this);
        if (obj != aVar) {
        }
        return aVar;
        uVar = (u) obj;
        j12.k kVar = (j12.k) uVar.f128607c;
        j12.c lastUsedDevice = kVar != null ? kVar.getLastUsedDevice() : null;
        this.f74874c = t0Var;
        this.f74872a = uVar;
        this.f74873b = 2;
        cVar.getClass();
        x53.c cVar2 = s0.f129406a;
        if (ge1.b.e0(x53.b.f189152a, new b(lastUsedDevice, str, this.f74877f, null), this) != aVar) {
            this.f74874c = null;
            this.f74872a = null;
            this.f74873b = 3;
        }
        return aVar;
    }
}
