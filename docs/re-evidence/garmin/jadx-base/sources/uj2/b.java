package uj2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.x2;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.work.WorkerParameters;
import b0.b0;
import b0.d0;
import b0.e0;
import b0.g1;
import b0.l0;
import b0.u0;
import cf.m;
import cf.t;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceSWUpdateCheckerWakefulService;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.google.common.util.concurrent.ListenableFuture;
import fa.z;
import g8.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o13.p;
import org.slf4j.Logger;
import r0.h;
import sd2.f;
import ue.x;
import v.a0;
import v.l;
import v.l1;
import v.o1;
import vc0.u;
import ve.e;
import ve.r0;
import ve.y0;
import ve.z0;
import xa1.j;
import xa2.g;
import y.o;
import z0.h0;
import z0.i0;
import z0.m0;
import z0.p0;
import z0.q;
import zb0.k;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f171583d;

    public /* synthetic */ b(Context context, bm2.d dVar, byte[] bArr) {
        this.f171580a = 14;
        this.f171581b = dVar;
        this.f171583d = bArr;
        this.f171582c = context;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ff  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        if (r3.f200579g.n() == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [v.l] */
    /* JADX WARN: Type inference failed for: r3v17, types: [v.k1, v.l$c] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Rational rational;
        final long jB;
        ej1.b bVar;
        String displayName;
        ?? r14;
        ej1.b bVar2;
        String displayName2;
        ListenableFuture listenableFutureF;
        int i14 = 3;
        boolean z14 = false;
        boolean zBooleanValue = true;
        switch (this.f171580a) {
            case 0:
                ((c) this.f171581b).f171588d.f((Context) this.f171582c, (ConnectIQOAuthRequest) this.f171583d);
                return;
            case 1:
                ((c) this.f171581b).f171588d.e((Context) this.f171582c, (xj2.a) this.f171583d);
                return;
            case 2:
                l lVar = (l) this.f171581b;
                Executor executor = (Executor) this.f171582c;
                s sVar = (s) this.f171583d;
                l.a aVar = lVar.B;
                aVar.f173903a.add(sVar);
                aVar.f173904b.put(sVar, executor);
                return;
            case 3:
                a0.g gVar = (a0.g) this.f171581b;
                AtomicReference atomicReference = (AtomicReference) this.f171582c;
                androidx.concurrent.futures.b.a aVar2 = (androidx.concurrent.futures.b.a) this.f171583d;
                gVar.f173659d.a(System.currentTimeMillis() + 3000, (l0.k) atomicReference.get());
                aVar2.b(null);
                return;
            case 4:
                final o1 o1Var = (o1) this.f171581b;
                androidx.concurrent.futures.b.a<e0> aVar3 = (androidx.concurrent.futures.b.a) this.f171582c;
                d0 d0Var = (d0) this.f171583d;
                if (!o1Var.f173951d) {
                    aVar3.d(new CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                Rect rectF = o1Var.f173948a.f173885i.f173974e.f();
                if (o1Var.f173952e != null) {
                    rational = o1Var.f173952e;
                } else {
                    Rect rectF2 = o1Var.f173948a.f173885i.f173974e.f();
                    rational = new Rational(rectF2.width(), rectF2.height());
                }
                List<u0> list = d0Var.f13865a;
                Integer num = (Integer) o1Var.f173948a.f173881e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List<MeteringRectangle> listD = o1Var.d(list, num == null ? 0 : num.intValue(), rational, rectF, 1);
                List<u0> list2 = d0Var.f13866b;
                Integer num2 = (Integer) o1Var.f173948a.f173881e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List<MeteringRectangle> listD2 = o1Var.d(list2, num2 == null ? 0 : num2.intValue(), rational, rectF, 2);
                List<u0> list3 = d0Var.f13867c;
                Integer num3 = (Integer) o1Var.f173948a.f173881e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                List<MeteringRectangle> listD3 = o1Var.d(list3, num3 == null ? 0 : num3.intValue(), rational, rectF, 4);
                if (listD.isEmpty() && listD2.isEmpty() && listD3.isEmpty()) {
                    aVar3.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    return;
                }
                o1Var.f173948a.f173878b.f173906a.remove(o1Var.f173962o);
                androidx.concurrent.futures.b.a<e0> aVar4 = o1Var.f173966s;
                if (aVar4 != null) {
                    aVar4.d(new CameraControl.OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                    o1Var.f173966s = null;
                }
                o1Var.f173948a.f173878b.f173906a.remove(null);
                ScheduledFuture<?> scheduledFuture = o1Var.f173956i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    o1Var.f173956i = null;
                }
                o1Var.f173966s = aVar3;
                MeteringRectangle[] meteringRectangleArr = o1.f173947v;
                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listD.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listD2.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listD3.toArray(meteringRectangleArr);
                ScheduledExecutorService scheduledExecutorService = o1Var.f173950c;
                ?? r15 = o1Var.f173948a;
                r15.f173878b.f173906a.remove(o1Var.f173962o);
                ScheduledFuture<?> scheduledFuture2 = o1Var.f173956i;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    o1Var.f173956i = null;
                }
                ScheduledFuture<?> scheduledFuture3 = o1Var.f173957j;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(true);
                    o1Var.f173957j = null;
                }
                o1Var.f173963p = meteringRectangleArr2;
                o1Var.f173964q = meteringRectangleArr3;
                o1Var.f173965r = meteringRectangleArr4;
                if (meteringRectangleArr2.length > 0) {
                    o1Var.f173954g = true;
                    o1Var.f173959l = false;
                    o1Var.f173960m = false;
                    jB = r15.B();
                    o1Var.f(true);
                } else {
                    o1Var.f173954g = false;
                    o1Var.f173959l = true;
                    o1Var.f173960m = false;
                    jB = r15.B();
                }
                o1Var.f173955h = 0;
                final boolean z15 = r15.u(1) == 1;
                ?? r16 = new l.c() { // from class: v.k1
                    @Override // v.l.c
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        o1 o1Var2 = o1Var;
                        o1Var2.getClass();
                        Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (o1Var2.f173963p.length > 0) {
                            if (!z15 || num4 == null) {
                                o1Var2.f173960m = true;
                                o1Var2.f173959l = true;
                            } else if (o1Var2.f173955h.intValue() == 3) {
                                if (num4.intValue() == 4) {
                                    o1Var2.f173960m = true;
                                    o1Var2.f173959l = true;
                                } else if (num4.intValue() == 5) {
                                    o1Var2.f173960m = false;
                                    o1Var2.f173959l = true;
                                }
                            }
                        }
                        if (!o1Var2.f173959l || !l.x(totalCaptureResult, jB)) {
                            if (!o1Var2.f173955h.equals(num4) && num4 != null) {
                                o1Var2.f173955h = num4;
                            }
                            return false;
                        }
                        boolean z16 = o1Var2.f173960m;
                        ScheduledFuture<?> scheduledFuture4 = o1Var2.f173957j;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            o1Var2.f173957j = null;
                        }
                        androidx.concurrent.futures.b.a<b0.e0> aVar5 = o1Var2.f173966s;
                        if (aVar5 != null) {
                            aVar5.b(b0.e0.a(z16));
                            o1Var2.f173966s = null;
                        }
                        return true;
                    }
                };
                o1Var.f173962o = r16;
                r15.p(r16);
                long j8 = o1Var.f173958k + 1;
                o1Var.f173958k = j8;
                l1 l1Var = new l1(o1Var, j8, false ? 1 : 0);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                o1Var.f173957j = scheduledExecutorService.schedule(l1Var, 5000L, timeUnit);
                long j14 = d0Var.f13868d;
                if (j14 > 0) {
                    o1Var.f173956i = scheduledExecutorService.schedule(new l1(o1Var, j8, true ? 1 : 0), j14, timeUnit);
                    return;
                }
                return;
            case 5:
                u uVar = (u) this.f171581b;
                String str = (String) this.f171582c;
                gj1.c cVar = (gj1.c) this.f171583d;
                Logger logger = u.f177013l;
                Context context = uVar.f64388a;
                f fVar = uVar.f177015d;
                Toast.makeText(context, str, 0).show();
                Activity activity = (Activity) context;
                try {
                    if (activity.isFinishing()) {
                        return;
                    }
                    if (cVar != null && (bVar = cVar.f77652a) != ej1.b.NONE) {
                        hj1.b.a aVar5 = hj1.b.f83993a;
                        gj1.b bVar3 = cVar.f77653b;
                        if (bVar3 == null || (displayName = bVar3.getDisplayName()) == null) {
                            displayName = "";
                        }
                        aVar5.getClass();
                        p pVarC = hj1.b.a.c(context, bVar, displayName);
                        String str2 = (String) pVarC.f128594a;
                        String str3 = (String) pVarC.f128595b;
                        boolean z16 = cVar.f77654c > 1;
                        String displayName3 = fVar.getDisplayName();
                        if (displayName3 == null) {
                            displayName3 = fVar.getProductDisplayName();
                            displayName3.getClass();
                        }
                        hj1.a.a(context, str2, str3, z16, new lj1.c(displayName3, fVar.d0(), fVar.Q()), new uo1.a(uVar, 14));
                        return;
                    }
                    k.e(activity, fVar, new v10.a(12));
                    return;
                } catch (WindowManager.BadTokenException unused) {
                    u.f177013l.error("removeDevice: Failed to load the device remove success message.");
                    return;
                }
            case 6:
                ve.p pVar = (ve.p) this.f171581b;
                androidx.concurrent.futures.b.d dVar = (androidx.concurrent.futures.b.d) this.f171582c;
                y0 y0Var = (y0) this.f171583d;
                int i15 = ve.p.f177580l;
                try {
                    zBooleanValue = ((Boolean) dVar.f6084b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (pVar.f177591k) {
                    try {
                        m mVarW = jg.b.w(y0Var.f177633a);
                        String str4 = mVarW.f26929a;
                        if (pVar.c(str4) == y0Var) {
                            pVar.b(str4);
                        }
                        ue.u uVarA = ue.u.a();
                        int i16 = ve.p.f177580l;
                        uVarA.getClass();
                        Iterator it = pVar.f177590j.iterator();
                        while (it.hasNext()) {
                            ((e) it.next()).b(mVarW, zBooleanValue);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 7:
                r0 r0Var = (r0) this.f171581b;
                ve.u uVar2 = (ve.u) this.f171582c;
                WorkerParameters.a aVar6 = (WorkerParameters.a) this.f171583d;
                ve.p pVar2 = r0Var.f177594a;
                m mVar = uVar2.f177614a;
                String str5 = mVar.f26929a;
                ArrayList arrayList = new ArrayList();
                int i17 = 6;
                t tVar = (t) pVar2.f177585e.runInTransaction(new com.airbnb.lottie.k(pVar2, i17, arrayList, str5));
                int i18 = 29;
                if (tVar == null) {
                    ue.u uVarA2 = ue.u.a();
                    int i19 = ve.p.f177580l;
                    mVar.toString();
                    uVarA2.getClass();
                    pVar2.f177584d.c().execute(new h(i18, pVar2, mVar));
                    return;
                }
                Object obj = pVar2.f177591k;
                synchronized (obj) {
                    try {
                        synchronized (pVar2.f177591k) {
                            try {
                                try {
                                    z14 = pVar2.c(str5) != null;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r14 = z14;
                                throw th;
                            }
                        }
                        if (z14) {
                            Set set = (Set) pVar2.f177588h.get(str5);
                            if (((ve.u) set.iterator().next()).f177614a.f26930b == mVar.f26930b) {
                                set.add(uVar2);
                                ue.u uVarA3 = ue.u.a();
                                int i24 = ve.p.f177580l;
                                mVar.toString();
                                uVarA3.getClass();
                            } else {
                                pVar2.f177584d.c().execute(new h(i18, pVar2, mVar));
                            }
                            return;
                        }
                        if (tVar.f26960t != mVar.f26930b) {
                            pVar2.f177584d.c().execute(new h(i18, pVar2, mVar));
                            return;
                        }
                        y0.a aVar7 = new y0.a(pVar2.f177582b, pVar2.f177583c, pVar2.f177584d, pVar2, pVar2.f177585e, tVar, arrayList);
                        if (aVar6 != null) {
                            aVar7.f177654h = aVar6;
                        }
                        y0 y0Var2 = new y0(aVar7);
                        androidx.concurrent.futures.b.d dVarA = ue.t.a(y0Var2.f177637e.a().plus(i.c()), new z0(y0Var2, null));
                        dVarA.addListener(new b(pVar2, i17, dVarA, y0Var2), pVar2.f177584d.c());
                        pVar2.f177587g.put(str5, y0Var2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(uVar2);
                        pVar2.f177588h.put(str5, hashSet);
                        ue.u uVarA4 = ue.u.a();
                        int i25 = ve.p.f177580l;
                        mVar.toString();
                        uVarA4.getClass();
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        r14 = obj;
                    }
                }
                break;
            case 8:
                vq2.e eVar = (vq2.e) this.f171581b;
                String str6 = (String) this.f171582c;
                String str7 = (String) this.f171583d;
                int i26 = vq2.e.f179461z0;
                hn2.c.ba(eVar.getF52032a(), Boolean.TRUE, str6, str7, 8);
                return;
            case 9:
                xc0.l lVar2 = (xc0.l) this.f171581b;
                String str8 = (String) this.f171582c;
                gj1.c cVar2 = (gj1.c) this.f171583d;
                Logger logger2 = xc0.l.f189932m;
                Context context2 = lVar2.f207282a;
                xw2.b bVar4 = lVar2.f189934e;
                Toast.makeText(context2, str8, 0).show();
                Activity activity2 = (Activity) context2;
                try {
                    if (activity2.isFinishing()) {
                        return;
                    }
                    if (cVar2 != null && (bVar2 = cVar2.f77652a) != ej1.b.NONE) {
                        hj1.b.a aVar8 = hj1.b.f83993a;
                        gj1.b bVar5 = cVar2.f77653b;
                        if (bVar5 == null || (displayName2 = bVar5.getDisplayName()) == null) {
                            displayName2 = "";
                        }
                        aVar8.getClass();
                        p pVarC2 = hj1.b.a.c(context2, bVar2, displayName2);
                        hj1.a.a(context2, (String) pVarC2.f128594a, (String) pVarC2.f128595b, cVar2.f77654c > 1, new lj1.c(bVar4.f192451c, bVar4.f192450b, null, 4, null), new g(lVar2, i14));
                        return;
                    }
                    k.d(activity2, bVar4.f192451c, new String[]{bVar4.f192450b}, new j(9));
                    return;
                } catch (WindowManager.BadTokenException unused3) {
                    xc0.l.f189932m.error("removeDevice: Failed to load the device remove success message.");
                    return;
                }
            case 10:
                o oVar = (o) this.f171581b;
                o.a aVar9 = (o.a) this.f171582c;
                ListenableFuture listenableFuture = (ListenableFuture) this.f171583d;
                Objects.toString(aVar9);
                oVar.toString();
                oVar.f192955b.remove(listenableFuture);
                return;
            case 11:
                z0.a0.i iVar = (z0.a0.i) this.f171581b;
                g1 g1Var = (g1) this.f171582c;
                x2 x2Var = (x2) this.f171583d;
                if (!g1Var.a()) {
                    m0 m0Var = z0.a0.this.f200512a0;
                    int iOrdinal = m0Var.f200684i.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (m0Var.f200681f == g1Var) {
                                    }
                                } else if (iOrdinal != 4) {
                                    wr.g.x("State ", m0Var.f200684i, " is not handled");
                                    return;
                                }
                            }
                        } else if (m0Var.f200681f == g1Var) {
                        }
                        break;
                    }
                    z0.a0 a0Var = z0.a0.this;
                    m0 m0Var2 = new m0(a0Var.f200521f, a0Var.f200519e, a0Var.f200517d);
                    q qVar = (q) z0.a0.k(z0.a0.this.B);
                    b0 b0Var = g1Var.f13907c;
                    f1.a aVarC = f1.d.c(qVar, b0Var, z0.a0.this.f200536s);
                    p0 p0VarD = qVar.d();
                    Size size = g1Var.f13906b;
                    Range<Integer> range = g1Var.f13908d;
                    f1.c cVar3 = aVarC.f67781c;
                    g1.d0 d0Var2 = (g1.d0) (cVar3 != null ? new f1.f(aVarC.f67779a, x2Var, p0VarD, size, cVar3, b0Var, range) : new f1.e(aVarC.f67779a, x2Var, p0VarD, size, b0Var, range)).get();
                    boolean z17 = z0.a0.this.f200524g0;
                    g1.e0 e0VarH = d0Var2.h();
                    g1.d0 d0VarA = d0Var2;
                    if (e0VarH == g1.e0.f74699a) {
                        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) e1.a.f61851a.b(MediaCodecDefaultDataSpaceQuirk.class);
                        if (z17 && mediaCodecDefaultDataSpaceQuirk != null) {
                            g1.e eVar2 = g1.e0.f74701c;
                            g1.d.b bVarM = d0Var2.m();
                            bVarM.b(eVar2);
                            d0VarA = bVarM.a();
                        }
                    }
                    d0VarA = d0Var2;
                    d0VarA = d0Var2;
                    g1.d0 d0Var3 = d0VarA;
                    z0.a0.this.getClass();
                    if (m0Var2.f200684i.ordinal() == 0) {
                        m0Var2.f200684i = m0.a.INITIALIZING;
                        m0Var2.f200681f = g1Var;
                        m0Var2.toString();
                        androidx.concurrent.futures.b.a<Void> aVar10 = new androidx.concurrent.futures.b.a<>();
                        androidx.concurrent.futures.b.d dVar2 = new androidx.concurrent.futures.b.d(aVar10);
                        aVar10.f6080b = dVar2;
                        aVar10.f6079a = v.h.class;
                        try {
                            m0Var2.f200686k = aVar10;
                            aVar10.f6079a = "ReleasedFuture " + m0Var2;
                        } catch (Exception e4) {
                            dVar2.a(e4);
                        }
                        m0Var2.f200685j = dVar2;
                        androidx.concurrent.futures.b.a<g1.i> aVar11 = new androidx.concurrent.futures.b.a<>();
                        androidx.concurrent.futures.b.d dVar3 = new androidx.concurrent.futures.b.d(aVar11);
                        aVar11.f6080b = dVar3;
                        aVar11.f6079a = v.h.class;
                        try {
                            m0Var2.f200688m = aVar11;
                            aVar11.f6079a = "ReadyToReleaseFuture " + m0Var2;
                        } catch (Exception e14) {
                            dVar3.a(e14);
                        }
                        m0Var2.f200687l = dVar3;
                        androidx.concurrent.futures.b.d dVarA2 = androidx.concurrent.futures.b.a(new p62.e(m0Var2, 18, g1Var, d0Var3));
                        l0.j.a(dVarA2, new z0.l0(m0Var2), m0Var2.f200677b);
                        listenableFutureF = l0.j.f(dVarA2);
                        break;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("configure() shouldn't be called in " + m0Var2.f200684i);
                        l0.j.a aVar12 = l0.j.f107810a;
                        listenableFutureF = new l0.m.a(illegalStateException);
                    }
                    z0.a0.this.f200512a0 = m0Var2;
                    l0.j.a(listenableFutureF, new z0.b0(iVar, m0Var2), z0.a0.this.f200519e);
                    return;
                }
                g1Var.a();
                Objects.toString(z0.a0.this.f200512a0);
                return;
            case 12:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f171581b;
                l2.b bVar6 = (l2.b) this.f171582c;
                i0 i0Var = (i0) this.f171583d;
                h0.c cVar4 = h0.G;
                k7.h.f(j0.u.b(), "Surface update cancellation should only occur on main thread.");
                atomicBoolean.set(true);
                bVar6.f5612b.f5825e.remove(i0Var);
                bVar6.f5615e.remove(i0Var);
                return;
            case 13:
                androidx.media3.exoplayer.video.f.a aVar13 = (androidx.media3.exoplayer.video.f.a) this.f171581b;
                androidx.media3.common.q qVar2 = (androidx.media3.common.q) this.f171582c;
                androidx.media3.exoplayer.h hVar = (androidx.media3.exoplayer.h) this.f171583d;
                androidx.media3.exoplayer.video.f fVar2 = aVar13.f9870b;
                int i27 = z.f70071a;
                fVar2.z(qVar2, hVar);
                return;
            default:
                bm2.d dVar4 = (bm2.d) this.f171581b;
                byte[] bArr = (byte[]) this.f171583d;
                Context context3 = (Context) this.f171582c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                CacheDatabase.i().h().a(new bb2.l(jCurrentTimeMillis, "GarminDeviceSWUpdateCheckerWakefulService", dVar4.getF92746j(), GsonUtil.a(dVar4), bArr));
                androidx.work.c.a aVar14 = new androidx.work.c.a();
                aVar14.f11467a.put("ARG_INPUT_TIMESTAMP", Long.valueOf(jCurrentTimeMillis));
                x xVarA = new x.a((Class<? extends androidx.work.d>) GarminDeviceSWUpdateCheckerWakefulService.class).f(aVar14.a()).e(0L, TimeUnit.MILLISECONDS).a();
                com.airbnb.lottie.animation.keyframe.a.o(ue.i0.f170088a, context3).a("GarminDeviceSWUpdateCheckerWakefulService" + dVar4.getF92746j(), ue.l.REPLACE, xVarA).a();
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3) {
        this.f171580a = i14;
        this.f171581b = obj;
        this.f171582c = obj2;
        this.f171583d = obj3;
    }
}
