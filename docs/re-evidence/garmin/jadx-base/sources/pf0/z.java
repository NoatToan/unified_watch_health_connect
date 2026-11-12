package pf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgViewModel$checkSetupComplete$1", f = "EcgViewModel.kt", l = {56, 61, 62}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f137550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f137551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f137552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f137553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f137555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f137556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0<g3<gf0.g>> f137557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f137558i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y0<g3<gf0.g>> y0Var, y yVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f137557h = y0Var;
        this.f137558i = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f137557h, this.f137558i, dVar);
        zVar.f137556g = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:8:0x0026, B:38:0x00c0, B:42:0x00cf, B:44:0x00ec, B:45:0x00f4, B:15:0x0044, B:28:0x0097, B:34:0x00a6, B:16:0x004c, B:22:0x006d, B:24:0x0083, B:19:0x005e), top: B:50:0x0016 }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        boolean zBooleanValue;
        boolean zH;
        boolean z14;
        boolean z15;
        Object objF4;
        boolean z16;
        int i14;
        Object objB4;
        boolean z17;
        boolean z18;
        boolean z19;
        gf0.g gVar;
        boolean z24;
        b0 b0Var = (b0) this.f137556g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f137555f;
        y0<g3<gf0.g>> y0Var = this.f137557h;
        y yVar = this.f137558i;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                y0Var.j(g3.a.c(g3.f35298f));
                this.f137556g = b0Var;
                this.f137555f = 1;
                int i16 = y.f137544h;
                objQ = yVar.f125784a.q(this);
                if (objQ == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                o13.r.b(obj);
                objQ = obj;
            } else {
                if (i15 == 2) {
                    zBooleanValue = this.f137553d;
                    boolean z25 = this.f137552c;
                    zH = this.f137551b;
                    boolean z26 = this.f137550a;
                    o13.r.b(obj);
                    z15 = z26;
                    z14 = z25;
                    objF4 = obj;
                    if (((Boolean) objF4).booleanValue()) {
                        z16 = zBooleanValue;
                        i14 = 1;
                    } else {
                        z16 = zBooleanValue;
                        i14 = 0;
                    }
                    this.f137556g = b0Var;
                    this.f137550a = z15;
                    this.f137551b = zH;
                    this.f137552c = z14;
                    this.f137553d = z16;
                    this.f137554e = i14;
                    this.f137555f = 3;
                    int i17 = y.f137544h;
                    objB4 = yVar.B4(this);
                    if (objB4 != aVar) {
                        z17 = z16;
                        z18 = z14;
                        z19 = zH;
                    }
                    return aVar;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i18 = this.f137554e;
                boolean z27 = this.f137553d;
                boolean z28 = this.f137552c;
                boolean z29 = this.f137551b;
                o13.r.b(obj);
                z17 = z27;
                z18 = z28;
                z19 = z29;
                i14 = i18;
                objB4 = obj;
            }
            boolean zBooleanValue2 = ((Boolean) objB4).booleanValue();
            if (i14 != 0) {
                z24 = true;
            } else {
                z24 = false;
            }
            gVar = new gf0.g(z19, z18, z17, z24, zBooleanValue2);
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "EcgViewModel", "[checkSetupComplete] " + gVar);
            if (gVar.f77067d) {
                int i19 = y.f137544h;
                yVar.getClass();
                nf0.d.x4();
            }
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(gVar));
            return Unit.INSTANCE;
            zBooleanValue = ((Boolean) objQ).booleanValue();
            yVar.getClass();
            zH = d1.h(q92.x.DI_CONNECT_UPLOAD, true);
            z14 = !d1.k();
            if (zBooleanValue) {
                z15 = zBooleanValue;
                z16 = zBooleanValue;
                i14 = 1;
                this.f137556g = b0Var;
                this.f137550a = z15;
                this.f137551b = zH;
                this.f137552c = z14;
                this.f137553d = z16;
                this.f137554e = i14;
                this.f137555f = 3;
                int i110 = y.f137544h;
                objB4 = yVar.B4(this);
                if (objB4 != aVar) {
                    z17 = z16;
                    z18 = z14;
                    z19 = zH;
                    boolean zBooleanValue3 = ((Boolean) objB4).booleanValue();
                    if (i14 != 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    gVar = new gf0.g(z19, z18, z17, z24, zBooleanValue3);
                    i2.f36769a.getClass();
                    i2.a.b(a2.ONBOARDING, "EcgViewModel", "[checkSetupComplete] " + gVar);
                    if (gVar.f77067d) {
                        int i111 = y.f137544h;
                        yVar.getClass();
                        nf0.d.x4();
                    }
                    g3.f35298f.getClass();
                    y0Var.j(g3.a.d(gVar));
                    return Unit.INSTANCE;
                }
            } else {
                this.f137556g = b0Var;
                this.f137550a = zBooleanValue;
                this.f137551b = zH;
                this.f137552c = z14;
                this.f137553d = zBooleanValue;
                this.f137555f = 2;
                objF4 = yVar.F4(this);
                if (objF4 != aVar) {
                    z15 = zBooleanValue;
                    if (((Boolean) objF4).booleanValue()) {
                        z16 = zBooleanValue;
                        i14 = 1;
                    } else {
                        z16 = zBooleanValue;
                        i14 = 0;
                    }
                    this.f137556g = b0Var;
                    this.f137550a = z15;
                    this.f137551b = zH;
                    this.f137552c = z14;
                    this.f137553d = z16;
                    this.f137554e = i14;
                    this.f137555f = 3;
                    int i112 = y.f137544h;
                    objB4 = yVar.B4(this);
                    if (objB4 != aVar) {
                        z17 = z16;
                        z18 = z14;
                        z19 = zH;
                        boolean zBooleanValue4 = ((Boolean) objB4).booleanValue();
                        if (i14 != 0) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        gVar = new gf0.g(z19, z18, z17, z24, zBooleanValue4);
                        i2.f36769a.getClass();
                        i2.a.b(a2.ONBOARDING, "EcgViewModel", "[checkSetupComplete] " + gVar);
                        if (gVar.f77067d) {
                            int i113 = y.f137544h;
                            yVar.getClass();
                            nf0.d.x4();
                        }
                        g3.f35298f.getClass();
                        y0Var.j(g3.a.d(gVar));
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        } catch (Exception e4) {
            a2 a2Var = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[checkSetupComplete] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EcgViewModel", strD);
            y0Var.j(g3.a.a(g3.f35298f, null, e4, null, null, 13));
        }
    }
}
