package qf1;

import android.app.Activity;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.samd.data.model.DeviceAppLaunchFailureException;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.proto.generated.SaMDEcg;
import com.garmin.samd.exception.NetworkException;
import com.garmin.samd.exception.NullAppDelegateException;
import d53.w;
import g22.n;
import jx2.m;
import o13.r;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.u;
import ze2.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lqf1/c;", "Lqf1/b;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qf1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kx2.a f144604c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf1.a f144605a = (uf1.a) KoinJavaComponent.get$default(uf1.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f144606b = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144607a;

        static {
            int[] iArr = new int[ze2.l.values().length];
            try {
                iArr[ze2.l.NO_NETWORK_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f144607a = iArr;
        }
    }

    static {
        new a(null);
        f144604c = kx2.a.ECG;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qf1.b
    public final Object a(String str, v13.c cVar) throws Exception {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f144639c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f144639c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objA = kVar.f144637a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f144639c;
        boolean z14 = true;
        try {
            if (i15 == 0) {
                r.b(objA);
                if (w.J(str)) {
                    z14 = false;
                } else {
                    f12.b bVar = this.f144606b;
                    kVar.f144639c = 1;
                    objA = bVar.a(str, kVar);
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                return Boolean.valueOf(z14);
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
            Boolean bool = (Boolean) objA;
            if (bool == null) {
                throw new Exception("MFA token validity unknown");
            }
            if (!bool.booleanValue()) {
                z14 = false;
            }
            return Boolean.valueOf(z14);
        } catch (NoNetworkException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.ONBOARDING, "SaMDAppService", "[isMFATokenValid] no network: " + e4);
            throw new NoNetworkException();
        }
    }

    @Override // qf1.b
    public final Object b(v13.c cVar) {
        return this.f144606b.B(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // qf1.b
    public final Object c(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f144621c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f144621c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objG = fVar.f144619a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f144621c;
        try {
            if (i15 == 0) {
                r.b(objG);
                vf1.b bVar = (vf1.b) KoinJavaComponent.get$default(vf1.b.class, null, null, 6, null);
                fVar.f144621c = 1;
                objG = bVar.g();
                if (objG == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objG);
            }
            a2 a2Var = a2.ONBOARDING;
            String str = "[getGarminHealthAccessToken] token available=" + n.d((String) objG);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SaMDAppService", str);
            return (String) objG;
        } catch (Exception e4) {
            a2 a2Var2 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[getGarminHealthAccessToken] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SaMDAppService", strD);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r8 == r2) goto L26;
     */
    @Override // qf1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v13.c cVar) throws NullAppDelegateException, NoNetworkException {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f144636c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f144636c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objA = jVar.f144634a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f144636c;
        try {
            if (i15 == 0) {
                r.b(objA);
                new gx2.b();
                jVar.f144636c = 1;
                objA = gx2.b.a(jVar);
                if (objA == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            Boolean bool = (Boolean) objA;
            boolean zBooleanValue = bool.booleanValue();
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "SaMDAppService", "[isGHSAccountCreated] GHS account exists=" + zBooleanValue);
            return bool;
            jVar.f144636c = 2;
            objA = ((jx2.b) objA).l(jVar);
        } catch (NetworkException unused) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SaMDAppService", "[isGHSAccountCreated] no network");
            throw new NoNetworkException();
        } catch (NullAppDelegateException e4) {
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SaMDAppService", "[isGHSAccountCreated] app delegate null");
            throw e4;
        }
    }

    @Override // qf1.b
    public final boolean e() throws Exception {
        f12.b bVar = this.f144606b;
        ve2.d dVarK = bVar.k();
        if (dVarK == null) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SaMDAppService", "[isPermanentMFAEnabled] no active account");
            vb.h.z("No active account");
            return false;
        }
        try {
            Boolean boolA = bVar.A(dVarK);
            if (boolA != null) {
                return boolA.booleanValue();
            }
            throw new Exception("Permanent MFA status unknown");
        } catch (NoNetworkException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.ONBOARDING, "SaMDAppService", "[isPermanentMFAEnabled] no network: " + e4);
            throw new NoNetworkException();
        } catch (Exception e14) {
            a2 a2Var2 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "[isPermanentMFAEnabled] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SaMDAppService", strD);
            throw e14;
        }
    }

    @Override // qf1.b
    public final Exception f(Intent intent) {
        intent.getClass();
        ze2.k kVarA = o.a(intent);
        return b.f144607a[kVarA.f204311a.ordinal()] == 1 ? new NoNetworkException() : new Exception(kVarA.f204312b);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e5 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:14:0x003d, B:45:0x010e, B:47:0x012a, B:49:0x012e, B:51:0x013b, B:53:0x0144, B:56:0x0148, B:58:0x0164, B:21:0x0052, B:40:0x00df, B:42:0x00e5, B:60:0x0171, B:37:0x00c7), top: B:66:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0171 A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:14:0x003d, B:45:0x010e, B:47:0x012a, B:49:0x012e, B:51:0x013b, B:53:0x0144, B:56:0x0148, B:58:0x0164, B:21:0x0052, B:40:0x00df, B:42:0x00e5, B:60:0x0171, B:37:0x00c7), top: B:66:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        if (r3 == r8) goto L44;
     */
    @Override // qf1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j8, String str, v13.c cVar) throws Throwable {
        e eVar;
        String str2;
        jx2.r rVar;
        kx2.d dVar;
        jx2.r rVar2;
        String str3;
        String str4;
        long j14 = j8;
        String str5 = str;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f144618f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f144618f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objE0 = eVar.f144616d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f144618f;
        try {
            if (i15 == 0) {
                r.b(objE0);
                a2 a2Var = a2.ONBOARDING;
                String strU = v.h.u(j14, "[enableEcgFeatureOnDevice] deviceUnitId=", " macAddress=", str5);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppService", strU);
                new gx2.b();
                eVar.f144614b = str5;
                eVar.f144613a = j14;
                eVar.f144618f = 1;
                objE0 = ge1.b.e0(s0.f129406a, new gx2.e(null), eVar);
                if (objE0 != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j14 = eVar.f144613a;
                str5 = eVar.f144614b;
                r.b(objE0);
            } else {
                if (i15 == 2) {
                    j14 = eVar.f144613a;
                    rVar = eVar.f144615c;
                    str2 = eVar.f144614b;
                    r.b(objE0);
                    dVar = (kx2.d) objE0;
                    if (dVar != null || !dVar.f107130b) {
                        a2 a2Var2 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                        return new rf1.f.b(qf1.a.a(f144604c));
                    }
                    a2 a2Var3 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "SaMDAppService", "[enableEcgFeatureOnDevice] ECG capability supported");
                    vf1.b bVar = (vf1.b) KoinJavaComponent.get$default(vf1.b.class, null, null, 6, null);
                    eVar.f144614b = str2;
                    eVar.f144615c = rVar;
                    eVar.f144613a = j14;
                    eVar.f144618f = 3;
                    objE0 = bVar.g();
                    if (objE0 != aVar) {
                        rVar2 = rVar;
                        str3 = str2;
                        str4 = (String) objE0;
                        if (str4 != null) {
                            a2 a2Var4 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var4, "SaMDAppService", "[enableEcgFeatureOnDevice] credentials null");
                            return new rf1.f.a(null, 1, null);
                        }
                        kx2.a aVar2 = f144604c;
                        eVar.f144614b = null;
                        eVar.f144615c = null;
                        eVar.f144613a = j14;
                        eVar.f144618f = 4;
                        rVar2.getClass();
                        gx2.b.f80060a.getClass();
                        objE0 = ge1.b.e0(gx2.b.d.a(), new jx2.k(rVar2, aVar2, j14, str4, str3, null), eVar);
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    j14 = eVar.f144613a;
                    rVar = eVar.f144615c;
                    str2 = eVar.f144614b;
                    r.b(objE0);
                    rVar2 = rVar;
                    str3 = str2;
                    str4 = (String) objE0;
                    if (str4 != null) {
                        a2 a2Var5 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var5, "SaMDAppService", "[enableEcgFeatureOnDevice] credentials null");
                        return new rf1.f.a(null, 1, null);
                    }
                    kx2.a aVar3 = f144604c;
                    eVar.f144614b = null;
                    eVar.f144615c = null;
                    eVar.f144613a = j14;
                    eVar.f144618f = 4;
                    rVar2.getClass();
                    gx2.b.f80060a.getClass();
                    objE0 = ge1.b.e0(gx2.b.d.a(), new jx2.k(rVar2, aVar3, j14, str4, str3, null), eVar);
                } else {
                    if (i15 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objE0);
                }
            }
            kx2.c cVar2 = (kx2.c) objE0;
            Object obj = cVar2.f107126a;
            a2 a2Var6 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "SaMDAppService", "[enableEcgFeatureOnDevice] result status: " + obj);
            if (obj != null && obj == SaMDEcg.EnableResponse.ResponseStatus.SUCCESS) {
                i2.a.b(a2Var6, "SaMDAppService", "[enableEcgFeatureOnDevice] ECG enabled on device");
                return new rf1.f.d(Boolean.TRUE);
            }
            i2.a.b(a2Var6, "SaMDAppService", "[enableEcgFeatureOnDevice] ECG couldn't be enabled on device");
            Exception[] excArr = cVar2.f107127b;
            if (excArr != null && excArr.length != 0) {
                i2.a.b(a2Var6, "SaMDAppService", "[enableEcgFeatureOnDevice] failure result errors: " + excArr);
                return new rf1.f.a((Exception) u.L(0, excArr));
            }
            i2.a.b(a2Var6, "SaMDAppService", "[enableEcgFeatureOnDevice] failure result with no errors");
            return new rf1.f.d(Boolean.FALSE);
            jx2.r rVar3 = (jx2.r) objE0;
            eVar.f144614b = str5;
            eVar.f144615c = rVar3;
            eVar.f144613a = j14;
            eVar.f144618f = 2;
            Object objK = rVar3.k(j14, eVar);
            if (objK != aVar) {
                str2 = str5;
                rVar = rVar3;
                objE0 = objK;
                dVar = (kx2.d) objE0;
                if (dVar != null) {
                }
                a2 a2Var7 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.f(a2Var7, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                return new rf1.f.b(qf1.a.a(f144604c));
            }
            return aVar;
        } catch (Exception e4) {
            a2 a2Var8 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[enableEcgFeatureOnDevice] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var8, "SaMDAppService", strD);
            return new rf1.f.a(e4);
        }
    }

    @Override // qf1.b
    public final Object h(Activity activity, v13.i iVar) {
        if (this.f144606b.k() != null) {
            return qu.b.a(activity, true, iVar);
        }
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.f(a2Var, "SaMDAppService", "[getMFAFlowIntent] no user signed in");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: NullAppDelegateException -> 0x0034, NetworkException -> 0x00d8, TryCatch #2 {NetworkException -> 0x00d8, NullAppDelegateException -> 0x0034, blocks: (B:14:0x0030, B:39:0x0093, B:21:0x0042, B:34:0x0072, B:36:0x007a, B:24:0x0048, B:30:0x005f, B:27:0x004f), top: B:45:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r11.k(r3, r1) == r2) goto L38;
     */
    @Override // qf1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, v13.c cVar) throws NullAppDelegateException, NoNetworkException {
        d dVar;
        String str2;
        jx2.b bVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f144612e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f144612e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objA = dVar.f144610c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f144612e;
        try {
            if (i15 == 0) {
                r.b(objA);
                new gx2.b();
                dVar.f144608a = str;
                dVar.f144612e = 1;
                objA = gx2.b.a(dVar);
                if (objA == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                str = dVar.f144608a;
                r.b(objA);
            } else if (i15 == 2) {
                bVar = dVar.f144609b;
                str2 = dVar.f144608a;
                r.b(objA);
                if (!((Boolean) objA).booleanValue()) {
                    a2 a2Var = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "SaMDAppService", "[createGHSAccount] no GHS account -> creating");
                    dVar.f144608a = null;
                    dVar.f144609b = bVar;
                    dVar.f144612e = 3;
                }
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = dVar.f144609b;
                r.b(objA);
            }
            bVar.getClass();
            String strE = qx2.a.f148445a.e();
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "SaMDAppService", "[createGHSAccount] GHS account id: " + strE);
            ((uf1.a) KoinJavaComponent.get$default(uf1.a.class, null, null, 6, null)).c().f158872a.O2("key_ghs_account_created", n.d(strE));
            return strE;
            jx2.b bVar2 = (jx2.b) objA;
            dVar.f144608a = str;
            dVar.f144609b = bVar2;
            dVar.f144612e = 2;
            Object objL = bVar2.l(dVar);
            if (objL != aVar) {
                str2 = str;
                bVar = bVar2;
                objA = objL;
                if (!((Boolean) objA).booleanValue()) {
                    a2 a2Var2 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "SaMDAppService", "[createGHSAccount] no GHS account -> creating");
                    dVar.f144608a = null;
                    dVar.f144609b = bVar;
                    dVar.f144612e = 3;
                }
                bVar.getClass();
                String strE2 = qx2.a.f148445a.e();
                i2.f36769a.getClass();
                i2.a.b(a2.ONBOARDING, "SaMDAppService", "[createGHSAccount] GHS account id: " + strE2);
                ((uf1.a) KoinJavaComponent.get$default(uf1.a.class, null, null, 6, null)).c().f158872a.O2("key_ghs_account_created", n.d(strE2));
                return strE2;
            }
            return aVar;
        } catch (NetworkException unused) {
            a2 a2Var3 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "SaMDAppService", "[createGHSAccount] no network");
            throw new NoNetworkException();
        } catch (NullAppDelegateException e4) {
            a2 a2Var4 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var4, "SaMDAppService", "[createGHSAccount] app delegate null");
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[PHI: r0 r2 r4 r8
      0x0051: PHI (r0v9 jx2.r) = (r0v8 jx2.r), (r0v28 jx2.r) binds: [B:34:0x00cd, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r2v6 long) = (r2v5 long), (r2v17 long) binds: [B:34:0x00cd, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r4v16 java.lang.Object) = (r4v15 java.lang.Object), (r4v1 java.lang.Object) binds: [B:34:0x00cd, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v7 java.lang.String) = (r8v6 java.lang.String), (r8v9 java.lang.String) binds: [B:34:0x00cd, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        if (r4 == r7) goto L43;
     */
    @Override // qf1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j8, String str, v13.c cVar) throws Throwable {
        l lVar;
        String str2;
        jx2.r rVar;
        kx2.d dVar;
        long j14 = j8;
        String str3 = str;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f144645f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f144645f = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objB = lVar.f144643d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f144645f;
        try {
            if (i15 == 0) {
                r.b(objB);
                a2 a2Var = a2.ONBOARDING;
                String strU = v.h.u(j14, "[launchEcgFeatureOnDevice] deviceUnitId=", " macAddress=", str3);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppService", strU);
                lVar.f144641b = str3;
                lVar.f144640a = j14;
                lVar.f144645f = 1;
                objB = this.f144605a.b(j14);
                if (objB != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j14 = lVar.f144640a;
                str3 = lVar.f144641b;
                r.b(objB);
            } else {
                if (i15 == 2) {
                    j14 = lVar.f144640a;
                    str3 = lVar.f144641b;
                    r.b(objB);
                    str2 = str3;
                    rVar = (jx2.r) objB;
                    lVar.f144641b = str2;
                    lVar.f144642c = rVar;
                    lVar.f144640a = j14;
                    lVar.f144645f = 3;
                    objB = rVar.k(j14, lVar);
                    if (objB != aVar) {
                        jx2.r rVar2 = rVar;
                        String str4 = str2;
                        dVar = (kx2.d) objB;
                        if (dVar != null) {
                        }
                        a2 a2Var2 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                        return new rf1.f.b(qf1.a.a(f144604c));
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    j14 = lVar.f144640a;
                    rVar = lVar.f144642c;
                    str2 = lVar.f144641b;
                    r.b(objB);
                    jx2.r rVar3 = rVar;
                    String str5 = str2;
                    dVar = (kx2.d) objB;
                    if (dVar != null || !dVar.f107130b) {
                        a2 a2Var3 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var3, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                        return new rf1.f.b(qf1.a.a(f144604c));
                    }
                    a2 a2Var4 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "SaMDAppService", "[launchEcgFeatureOnDevice] ECG capability supported");
                    kx2.a aVar2 = f144604c;
                    lVar.f144641b = null;
                    lVar.f144642c = null;
                    lVar.f144640a = j14;
                    lVar.f144645f = 4;
                    rVar3.getClass();
                    rVar3.d().debug(n23.j.d(j14, "launchFeature: ", aVar2.name(), ", deviceUnitId "));
                    gx2.b.f80060a.getClass();
                    objB = ge1.b.e0(gx2.b.d.a(), new jx2.n(aVar2, rVar3, j14, str5, null), lVar);
                } else {
                    if (i15 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objB);
                }
            }
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "SaMDAppService", "[launchEcgFeatureOnDevice] result status: " + objB);
            if (objB == SaMDEcg.LaunchResponse.ResponseStatus.SUCCESS) {
                return new rf1.f.d(null, 1, null);
            }
            if (objB == SaMDEcg.LaunchResponse.ResponseStatus.FAILURE_LOW_BATTERY) {
                return new rf1.f.a(new DeviceAppLaunchFailureException(rf1.a.DEVICE_BATTERY_LOW));
            }
            return objB == SaMDEcg.LaunchResponse.ResponseStatus.FAILURE_BUSY ? new rf1.f.a(new DeviceAppLaunchFailureException(rf1.a.DEVICE_BUSY)) : new rf1.f.a(null, 1, null);
            if (!((Boolean) objB).booleanValue()) {
                a2 a2Var5 = a2.ONBOARDING;
                String strE = org.apache.commons.lang3.e.e(j14, "[launchEcgFeatureOnDevice] device not connected deviceUnitId=");
                i2.f36769a.getClass();
                i2.a.f(a2Var5, "SaMDAppService", strE);
                return rf1.f.c.f152426a;
            }
            a2 a2Var6 = a2.ONBOARDING;
            String strE2 = org.apache.commons.lang3.e.e(j14, "[launchEcgFeatureOnDevice] device connected deviceUnitId=");
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "SaMDAppService", strE2);
            new gx2.b();
            lVar.f144641b = str3;
            lVar.f144640a = j14;
            lVar.f144645f = 2;
            objB = ge1.b.e0(s0.f129406a, new gx2.e(null), lVar);
            if (objB != aVar) {
                str2 = str3;
                rVar = (jx2.r) objB;
                lVar.f144641b = str2;
                lVar.f144642c = rVar;
                lVar.f144640a = j14;
                lVar.f144645f = 3;
                objB = rVar.k(j14, lVar);
                if (objB != aVar) {
                    jx2.r rVar4 = rVar;
                    String str6 = str2;
                    dVar = (kx2.d) objB;
                    if (dVar != null) {
                    }
                    a2 a2Var7 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var7, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                    return new rf1.f.b(qf1.a.a(f144604c));
                }
            }
            return aVar;
        } catch (Exception e4) {
            a2 a2Var8 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[launchEcgFeatureOnDevice] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var8, "SaMDAppService", strD);
            return new rf1.f.a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[PHI: r0 r2 r4 r8
      0x0053: PHI (r0v8 jx2.r) = (r0v7 jx2.r), (r0v20 jx2.r) binds: [B:35:0x00cf, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r2v6 long) = (r2v5 long), (r2v16 long) binds: [B:35:0x00cf, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r4v16 java.lang.Object) = (r4v15 java.lang.Object), (r4v1 java.lang.Object) binds: [B:35:0x00cf, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r8v7 java.lang.String) = (r8v6 java.lang.String), (r8v8 java.lang.String) binds: [B:35:0x00cf, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // qf1.b
    public final Object k(long j8, String str, v13.c cVar) throws Throwable {
        i iVar;
        String str2;
        jx2.r rVar;
        kx2.d dVar;
        long j14;
        long j15 = j8;
        String str3 = str;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f144633f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f144633f = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f144631d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f144633f;
        boolean z14 = true;
        try {
            if (i15 == 0) {
                r.b(objB);
                a2 a2Var = a2.ONBOARDING;
                String strU = v.h.u(j15, "[isEcgFeatureEnabledOnDevice] deviceUnitId=", " macAddress=", str3);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppService", strU);
                iVar.f144629b = str3;
                iVar.f144628a = j15;
                iVar.f144633f = 1;
                objB = this.f144605a.b(j15);
                if (objB != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j15 = iVar.f144628a;
                str3 = iVar.f144629b;
                r.b(objB);
            } else {
                if (i15 == 2) {
                    j15 = iVar.f144628a;
                    str3 = iVar.f144629b;
                    r.b(objB);
                    str2 = str3;
                    rVar = (jx2.r) objB;
                    iVar.f144629b = str2;
                    iVar.f144630c = rVar;
                    iVar.f144628a = j15;
                    iVar.f144633f = 3;
                    objB = rVar.k(j15, iVar);
                    if (objB != aVar) {
                        jx2.r rVar2 = rVar;
                        String str4 = str2;
                        dVar = (kx2.d) objB;
                        if (dVar != null) {
                        }
                        a2 a2Var2 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                        return new rf1.f.b(qf1.a.a(f144604c));
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    j15 = iVar.f144628a;
                    rVar = iVar.f144630c;
                    str2 = iVar.f144629b;
                    r.b(objB);
                    jx2.r rVar3 = rVar;
                    String str5 = str2;
                    dVar = (kx2.d) objB;
                    if (dVar != null || !dVar.f107130b) {
                        a2 a2Var3 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var3, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                        return new rf1.f.b(qf1.a.a(f144604c));
                    }
                    a2 a2Var4 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG capability supported");
                    iVar.f144629b = null;
                    iVar.f144630c = null;
                    iVar.f144628a = j15;
                    iVar.f144633f = 4;
                    rVar3.getClass();
                    gx2.b.f80060a.getClass();
                    long j16 = j15;
                    objB = ge1.b.e0(gx2.b.d.a(), new m(rVar3, j16, str5, null), iVar);
                    if (objB != aVar) {
                        j14 = j16;
                    }
                    return aVar;
                }
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j14 = iVar.f144628a;
                r.b(objB);
            }
            SaMDEcg.AppStatusResponse.ResponseStatus responseStatus = (SaMDEcg.AppStatusResponse.ResponseStatus) objB;
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG app status: " + responseStatus);
            SaMDEcg.AppStatusResponse.ResponseStatus responseStatus2 = SaMDEcg.AppStatusResponse.ResponseStatus.ENABLED;
            if (responseStatus == responseStatus2) {
                ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).a(j14, e31.a.ECG_APP_ENABLED);
            }
            if (responseStatus != responseStatus2) {
                z14 = false;
            }
            return new rf1.f.d(Boolean.valueOf(z14));
            if (!((Boolean) objB).booleanValue()) {
                a2 a2Var5 = a2.ONBOARDING;
                String strE = org.apache.commons.lang3.e.e(j15, "[isEcgFeatureEnabledOnDevice] device not connected deviceUnitId=");
                i2.f36769a.getClass();
                i2.a.f(a2Var5, "SaMDAppService", strE);
                return rf1.f.c.f152426a;
            }
            a2 a2Var6 = a2.ONBOARDING;
            String strE2 = org.apache.commons.lang3.e.e(j15, "[isEcgFeatureEnabledOnDevice] device connected deviceUnitId=");
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "SaMDAppService", strE2);
            new gx2.b();
            iVar.f144629b = str3;
            iVar.f144628a = j15;
            iVar.f144633f = 2;
            objB = ge1.b.e0(s0.f129406a, new gx2.e(null), iVar);
            if (objB != aVar) {
                str2 = str3;
                rVar = (jx2.r) objB;
                iVar.f144629b = str2;
                iVar.f144630c = rVar;
                iVar.f144628a = j15;
                iVar.f144633f = 3;
                objB = rVar.k(j15, iVar);
                if (objB != aVar) {
                    jx2.r rVar4 = rVar;
                    String str6 = str2;
                    dVar = (kx2.d) objB;
                    if (dVar != null) {
                    }
                    a2 a2Var7 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var7, "SaMDAppService", "[isEcgFeatureEnabledOnDevice] ECG not supported");
                    return new rf1.f.b(qf1.a.a(f144604c));
                }
            }
            return aVar;
        } catch (Exception e4) {
            a2 a2Var8 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[isEcgFeatureEnabledOnDevice] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var8, "SaMDAppService", strD);
            return new rf1.f.a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qf1.b
    public final Object l(v13.c cVar) throws NoNetworkException {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f144624c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f144624c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objQ = gVar.f144622a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f144624c;
        try {
            if (i15 == 0) {
                r.b(objQ);
                f12.b bVar = this.f144606b;
                gVar.f144624c = 1;
                objQ = bVar.q(gVar);
                if (objQ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objQ);
            }
            ve2.i iVar = (ve2.i) objQ;
            if (iVar == null) {
                return null;
            }
            String str = iVar.f177743a;
            ve2.j jVar = iVar.f177744b;
            rf1.e eVarA = jVar != null ? rf1.d.a(jVar) : null;
            ve2.j jVar2 = iVar.f177745c;
            return new rf1.c(str, eVarA, jVar2 != null ? rf1.d.a(jVar2) : null);
        } catch (NoNetworkException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.ONBOARDING, "SaMDAppService", "[getMFAInfo] no network: " + e4);
            throw new NoNetworkException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r14 == r2) goto L26;
     */
    @Override // qf1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(v13.c cVar) throws Throwable {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f144627c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f144627c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objA = hVar.f144625a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f144627c;
        try {
            if (i15 == 0) {
                r.b(objA);
                new gx2.b();
                hVar.f144627c = 1;
                objA = gx2.b.a(hVar);
                if (objA == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            Boolean bool = (Boolean) objA;
            boolean zBooleanValue = bool.booleanValue();
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "SaMDAppService", "[isEcgFeatureEnabled] GHS check if ECG feature enabled: " + zBooleanValue);
            return bool;
            jx2.b bVar = (jx2.b) objA;
            kx2.a aVar2 = f144604c;
            hVar.f144627c = 2;
            jx2.b.a aVar3 = jx2.b.f101511b;
            bVar.getClass();
            gx2.b.f80060a.getClass();
            objA = ge1.b.e0(gx2.b.d.a(), new jx2.g(3600000L, bVar, aVar2, null), hVar);
        } catch (NetworkException unused) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SaMDAppService", "[isEcgFeatureEnabled] network exception");
            throw new NoNetworkException();
        } catch (NullAppDelegateException e4) {
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SaMDAppService", "[isEcgFeatureEnabled] app delegate null");
            throw e4;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqf1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lkx2/a;", "FEATURE_ECG", "Lkx2/a;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
