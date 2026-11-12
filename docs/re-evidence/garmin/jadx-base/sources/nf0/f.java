package nf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel$createAndAuthorizeGHSAccount$1", f = "GHSAccountViewModel.kt", l = {116, 117, 122, 127}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qu.c f125789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f125791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f125792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Boolean>> f125793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, y0<g3<Boolean>> y0Var, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f125792d = dVar;
        this.f125793e = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f125792d, this.f125793e, dVar);
        fVar.f125791c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:8:0x0021, B:41:0x00c9, B:42:0x00e6, B:15:0x0033, B:36:0x0098, B:38:0x00b6, B:18:0x0039, B:31:0x006f, B:33:0x0077, B:43:0x00f7, B:19:0x003d, B:25:0x0052, B:27:0x0058, B:22:0x0044), top: B:48:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: Exception -> 0x0026, PHI: r4 r15
      0x0098: PHI (r4v9 qu.c) = (r4v8 qu.c), (r4v12 qu.c) binds: [B:34:0x0095, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r15v19 java.lang.Object) = (r15v18 java.lang.Object), (r15v0 java.lang.Object) binds: [B:34:0x0095, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0026, blocks: (B:8:0x0021, B:41:0x00c9, B:42:0x00e6, B:15:0x0033, B:36:0x0098, B:38:0x00b6, B:18:0x0039, B:31:0x006f, B:33:0x0077, B:43:0x00f7, B:19:0x003d, B:25:0x0052, B:27:0x0058, B:22:0x0044), top: B:48:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:8:0x0021, B:41:0x00c9, B:42:0x00e6, B:15:0x0033, B:36:0x0098, B:38:0x00b6, B:18:0x0039, B:31:0x006f, B:33:0x0077, B:43:0x00f7, B:19:0x003d, B:25:0x0052, B:27:0x0058, B:22:0x0044), top: B:48:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:8:0x0021, B:41:0x00c9, B:42:0x00e6, B:15:0x0033, B:36:0x0098, B:38:0x00b6, B:18:0x0039, B:31:0x006f, B:33:0x0077, B:43:0x00f7, B:19:0x003d, B:25:0x0052, B:27:0x0058, B:22:0x0044), top: B:48:0x0017 }] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r15 == r3) goto L40;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0098, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qu.c cVar;
        boolean zBooleanValue;
        o53.b0 b0Var = (o53.b0) this.f125791c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125790b;
        y0<g3<Boolean>> y0Var = this.f125793e;
        d dVar = this.f125792d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ff0.i iVar = dVar.f125784a;
                this.f125791c = b0Var;
                this.f125790b = 1;
                obj = iVar.b(this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    cVar = this.f125789a;
                    o13.r.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        a2 a2Var = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "GHSAccountViewModel", "[createGHSAccount] MFA token valid");
                        dVar.getClass();
                        d.x4();
                        this.f125791c = b0Var;
                        this.f125789a = cVar;
                        this.f125790b = 3;
                        obj = dVar.f125784a.q(this);
                        if (obj == aVar) {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            i2.f36769a.getClass();
                            i2.a.b(a2.ONBOARDING, "GHSAccountViewModel", "[createGHSAccount] account created=" + zBooleanValue);
                            if (!zBooleanValue) {
                                ff0.i iVar2 = dVar.f125784a;
                                String str = ((qu.c.C2781c) cVar).f147865a;
                                this.f125791c = b0Var;
                                this.f125789a = null;
                                this.f125790b = 4;
                                obj = iVar2.n(str, this);
                            }
                            g3.a aVar2 = g3.f35298f;
                            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                            aVar2.getClass();
                            y0Var.j(g3.a.d(boolValueOf));
                        }
                        return aVar;
                    }
                    a2 a2Var2 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "GHSAccountViewModel", "[createGHSAccount] invalid MFA Token");
                    g3.f35298f.getClass();
                    y0Var.j(g3.a.d(null));
                    return Unit.INSTANCE;
                }
                if (i14 == 3) {
                    cVar = this.f125789a;
                    o13.r.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    i2.f36769a.getClass();
                    i2.a.b(a2.ONBOARDING, "GHSAccountViewModel", "[createGHSAccount] account created=" + zBooleanValue);
                    if (!zBooleanValue) {
                        ff0.i iVar3 = dVar.f125784a;
                        String str2 = ((qu.c.C2781c) cVar).f147865a;
                        this.f125791c = b0Var;
                        this.f125789a = null;
                        this.f125790b = 4;
                        obj = iVar3.n(str2, this);
                    }
                    g3.a aVar3 = g3.f35298f;
                    Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                    aVar3.getClass();
                    y0Var.j(g3.a.d(boolValueOf2));
                    return Unit.INSTANCE;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            String str3 = (String) obj;
            boolean zD = g22.n.d(str3);
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "GHSAccountViewModel", "[createGHSAccount] created account=" + str3);
            zBooleanValue = zD;
            g3.a aVar4 = g3.f35298f;
            Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
            aVar4.getClass();
            y0Var.j(g3.a.d(boolValueOf3));
            return Unit.INSTANCE;
            qu.c cVar2 = (qu.c) obj;
            if (cVar2 instanceof qu.c.C2781c) {
                String str4 = ((qu.c.C2781c) cVar2).f147865a;
                this.f125791c = b0Var;
                this.f125789a = cVar2;
                this.f125790b = 2;
                int i15 = d.f125783b;
                Object objE4 = dVar.E4(str4, this);
                if (objE4 != aVar) {
                    cVar = cVar2;
                    obj = objE4;
                    if (((Boolean) obj).booleanValue()) {
                        a2 a2Var3 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "GHSAccountViewModel", "[createGHSAccount] MFA token valid");
                        dVar.getClass();
                        d.x4();
                        this.f125791c = b0Var;
                        this.f125789a = cVar;
                        this.f125790b = 3;
                        obj = dVar.f125784a.q(this);
                        if (obj == aVar) {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            i2.f36769a.getClass();
                            i2.a.b(a2.ONBOARDING, "GHSAccountViewModel", "[createGHSAccount] account created=" + zBooleanValue);
                            if (!zBooleanValue) {
                                ff0.i iVar4 = dVar.f125784a;
                                String str5 = ((qu.c.C2781c) cVar).f147865a;
                                this.f125791c = b0Var;
                                this.f125789a = null;
                                this.f125790b = 4;
                                obj = iVar4.n(str5, this);
                            }
                            g3.a aVar5 = g3.f35298f;
                            Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue);
                            aVar5.getClass();
                            y0Var.j(g3.a.d(boolValueOf4));
                        }
                    } else {
                        a2 a2Var4 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var4, "GHSAccountViewModel", "[createGHSAccount] invalid MFA Token");
                        g3.f35298f.getClass();
                        y0Var.j(g3.a.d(null));
                    }
                }
                return aVar;
            }
            a2 a2Var5 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var5, "GHSAccountViewModel", "[createGHSAccount] invalid MFA Token");
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(null));
        } catch (Exception e4) {
            a2 a2Var6 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[createGHSAccount] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var6, "GHSAccountViewModel", strD);
            y0Var.j(g3.a.a(g3.f35298f, null, e4, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
