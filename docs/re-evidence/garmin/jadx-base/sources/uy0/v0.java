package uy0;

import android.content.Context;
import c22.s3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Luy0/v0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ll22/b;", "resourceResolver", "Lfj1/b;", "gcmSettingsRepo", "Lf12/b;", "gcmUserAccount", "Lc22/k;", "appConfigurationDelegate", "Luy0/n;", "getDevicePriorityItemsUseCase", "Luy0/g;", "getAppInfoItemsUseCase", "Luy0/w;", "getLegalItemsUseCase", "Luy0/a1;", "getTechDetailsItemsUseCase", "<init>", "(Landroid/content/Context;Ll22/b;Lfj1/b;Lf12/b;Lc22/k;Luy0/n;Luy0/g;Luy0/w;Luy0/a1;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f173327h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f173329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fj1.b f173330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.b f173331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c22.k f173332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f173333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ty0.b f173334g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f173336b;

        static {
            int[] iArr = new int[ty0.b.values().length];
            try {
                iArr[ty0.b.f166906p2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.b.f166903o2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.b.f166925w2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ty0.b.E2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ty0.b.I2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f173335a = iArr;
            int[] iArr2 = new int[gg1.y0.values().length];
            try {
                iArr2[gg1.y0.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[gg1.y0.DI_TESTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[gg1.y0.MB_TESTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[gg1.y0.ALL_USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f173336b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public v0(Context context, l22.b bVar, fj1.b bVar2, f12.b bVar3, c22.k kVar, n nVar, g gVar, w wVar, a1 a1Var) {
        context.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        kVar.getClass();
        nVar.getClass();
        gVar.getClass();
        wVar.getClass();
        a1Var.getClass();
        this.f173328a = context;
        this.f173329b = bVar;
        this.f173330c = bVar2;
        this.f173331d = bVar3;
        this.f173332e = kVar;
        this.f173333f = gVar;
        this.f173334g = ty0.b.J2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, boolean z14, gj1.b bVar, v13.c cVar) {
        w0 w0Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f173341e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f173341e = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objJ = w0Var.f173339c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f173341e;
        if (i15 == 0) {
            o13.r.b(objJ);
            w0Var.f173338b = bVar;
            w0Var.f173337a = z14;
            w0Var.f173341e = 1;
            fj1.b bVar2 = this.f173330c;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new fj1.c(bVar2, j8, null), w0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = w0Var.f173337a;
            bVar = w0Var.f173338b;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            gj1.h hVar = (gj1.h) ((v2.b) v2Var).f47386a;
            hVar.f77673h = z14;
            hVar.f77674i = bVar;
            return hVar;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(boolean z14, v13.c cVar) {
        x0 x0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f173356d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f173356d = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objA = x0Var.f173354b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f173356d;
        if (i15 == 0) {
            o13.r.b(objA);
            x0Var.f173353a = z14;
            x0Var.f173356d = 1;
            objA = this.f173330c.a(x0Var);
            if (objA != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objA);
                return objA;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z14 = x0Var.f173353a;
        o13.r.b(objA);
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new lj1.a(false, null, null, null, null, false, false, 126, null);
            }
            lc.u0.r();
            return null;
        }
        gj1.f fVar = (gj1.f) ((v2.b) v2Var).f47386a;
        x0Var.f173353a = z14;
        x0Var.f173356d = 2;
        Object objC = c(fVar, z14, x0Var);
        return objC == obj ? obj : objC;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v29, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v33, types: [T, java.lang.String] */
    public final Object c(gj1.f fVar, boolean z14, v13.c cVar) {
        y0 y0Var;
        List<gj1.b> arrayList;
        List<gj1.b> list;
        List<gj1.b> arrayList2;
        List<gj1.b> list2;
        gj1.b bVarD;
        p005kotlin.jvm.internal.r0 r0Var;
        p005kotlin.jvm.internal.r0 r0Var2;
        boolean z15;
        Long l14;
        gj1.b bVar;
        p005kotlin.jvm.internal.r0 r0Var3;
        Long l15;
        gj1.b bVar2;
        p005kotlin.jvm.internal.r0 r0Var4;
        gj1.e primaryTrainingDevices;
        gj1.i wearableDevices;
        gj1.b bVar3;
        List<gj1.b> list3;
        p005kotlin.jvm.internal.r0 r0Var5;
        p005kotlin.jvm.internal.r0 r0Var6;
        List<gj1.b> list4;
        gj1.b bVar4;
        gj1.b bVar5;
        boolean z16;
        boolean z17;
        gj1.h hVar;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i14 = y0Var.f173372k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f173372k = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        y0 y0Var2 = y0Var;
        Object objA = y0Var2.f173370i;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var2.f173372k;
        if (i15 != 0) {
            if (i15 == 1) {
                z15 = y0Var2.f173369h;
                l15 = y0Var2.f173368g;
                r0Var4 = y0Var2.f173367f;
                r0Var3 = y0Var2.f173366e;
                bVarD = y0Var2.f173365d;
                bVar2 = y0Var2.f173364c;
                list2 = y0Var2.f173363b;
                list = y0Var2.f173362a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var5 = y0Var2.f173367f;
                r0Var6 = y0Var2.f173366e;
                bVar3 = y0Var2.f173365d;
                bVar = y0Var2.f173364c;
                list3 = y0Var2.f173363b;
                list4 = y0Var2.f173362a;
                o13.r.b(objA);
            }
            hVar = (gj1.h) objA;
            if (hVar != null) {
                r0Var5.f105810a = e(hVar);
            }
            r0Var = r0Var6;
            list = list4;
            bVar4 = bVar3;
            bVar5 = bVar;
            boolean z18 = (bVar5 == null && list.size() > 1) || (bVar4 != null && list3.size() > 1);
            String str = (String) r0Var.f105810a;
            String str2 = (String) r0Var5.f105810a;
            if (bVar5 != null || list.size() <= 1) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (bVar4 != null || list3.size() <= 1) {
                z17 = false;
            } else {
                z17 = true;
            }
            return new lj1.a(z18, bVar5, str, bVar4, str2, z16, z17);
        }
        o13.r.b(objA);
        if (fVar == null || (wearableDevices = fVar.getWearableDevices()) == null || (arrayList = wearableDevices.b()) == null) {
            arrayList = new ArrayList<>();
        }
        list = arrayList;
        if (fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (arrayList2 = primaryTrainingDevices.b()) == null) {
            arrayList2 = new ArrayList<>();
        }
        list2 = arrayList2;
        if (list.size() <= 1 && list2.size() <= 1) {
            return new lj1.a(false, null, null, null, null, false, false, 126, null);
        }
        gj1.b bVarU = fVar != null ? gl.b.u(fVar) : null;
        if (fVar != null) {
            gj1.d primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
            bVarD = gl.b.D(fVar, primaryTrainingDeviceDTO != null ? primaryTrainingDeviceDTO.getDeviceId() : null);
        } else {
            bVarD = null;
        }
        if (bVarU == null && bVarD == null) {
            return new lj1.a(false, null, null, null, null, false, false, 126, null);
        }
        r0Var = new p005kotlin.jvm.internal.r0();
        r0Var2 = new p005kotlin.jvm.internal.r0();
        Long deviceId = bVarU != null ? bVarU.getDeviceId() : null;
        Long deviceId2 = bVarD != null ? bVarD.getDeviceId() : null;
        if (deviceId == null || z14) {
            z15 = z14;
            l14 = deviceId2;
            bVar = bVarU;
            bVar3 = bVarD;
            if (l14 != null || z15) {
                list3 = list2;
                r0Var5 = r0Var2;
            } else {
                long jLongValue = l14.longValue();
                y0Var2.f173362a = list;
                y0Var2.f173363b = list2;
                y0Var2.f173364c = bVar;
                y0Var2.f173365d = bVar3;
                y0Var2.f173366e = r0Var;
                y0Var2.f173367f = r0Var2;
                y0Var2.f173368g = null;
                y0Var2.f173369h = z15;
                y0Var2.f173372k = 2;
                objA = a(jLongValue, true, bVar3, y0Var2);
                if (objA != obj) {
                    r0Var6 = r0Var;
                    list3 = list2;
                    list4 = list;
                    r0Var5 = r0Var2;
                    hVar = (gj1.h) objA;
                    if (hVar != null) {
                        r0Var5.f105810a = e(hVar);
                    }
                    r0Var = r0Var6;
                    list = list4;
                }
            }
            bVar4 = bVar3;
            bVar5 = bVar;
            if (bVar5 == null) {
            }
            String str3 = (String) r0Var.f105810a;
            String str4 = (String) r0Var5.f105810a;
            if (bVar5 != null) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (bVar4 != null) {
                z17 = false;
            } else {
                z17 = false;
            }
            return new lj1.a(z18, bVar5, str3, bVar4, str4, z16, z17);
        }
        long jLongValue2 = deviceId.longValue();
        y0Var2.f173362a = list;
        y0Var2.f173363b = list2;
        y0Var2.f173364c = bVarU;
        y0Var2.f173365d = bVarD;
        y0Var2.f173366e = r0Var;
        y0Var2.f173367f = r0Var2;
        y0Var2.f173368g = deviceId2;
        y0Var2.f173369h = z14;
        y0Var2.f173372k = 1;
        Long l16 = deviceId2;
        objA = a(jLongValue2, true, bVarU, y0Var2);
        if (objA != obj) {
            z15 = z14;
            r0Var3 = r0Var;
            l15 = l16;
            bVar2 = bVarU;
            r0Var4 = r0Var2;
        }
        return obj;
        gj1.h hVar2 = (gj1.h) objA;
        if (hVar2 != null) {
            r0Var3.f105810a = e(hVar2);
        }
        gj1.b bVar6 = bVar2;
        r0Var = r0Var3;
        bVar = bVar6;
        l14 = l15;
        r0Var2 = r0Var4;
        bVar3 = bVarD;
        if (l14 != null) {
        }
        list3 = list2;
        r0Var5 = r0Var2;
        bVar4 = bVar3;
        bVar5 = bVar;
        if (bVar5 == null) {
        }
        String str5 = (String) r0Var.f105810a;
        String str6 = (String) r0Var5.f105810a;
        if (bVar5 != null) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (bVar4 != null) {
            z17 = false;
        } else {
            z17 = false;
        }
        return new lj1.a(z18, bVar5, str5, bVar4, str6, z16, z17);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v12, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v29, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v34, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v0, types: [uy0.v0] */
    public final Serializable d(boolean z14, v13.c cVar) {
        z0 z0Var;
        Object next;
        boolean zA;
        ArrayList<ty0.b> arrayList;
        com.garmin.android.apps.connectmobile.navigation.more.b kVar;
        ?? arrayList2;
        com.garmin.android.apps.connectmobile.navigation.more.b.e eVar;
        String str;
        String str2;
        List list;
        com.garmin.android.apps.connectmobile.navigation.more.b.e eVar2;
        ?? arrayList3;
        ?? arrayList4;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i14 = z0Var.f173381d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z0Var.f173381d = i14 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object obj = z0Var.f173379b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z0Var.f173381d;
        int i16 = 4;
        int i17 = 3;
        ?? r14 = 0;
        if (i15 == 0) {
            o13.r.b(obj);
            ty0.b[] bVarArr = ty0.b.J2.f166941g;
            if (bVarArr == null) {
                return p13.j0.f134944a;
            }
            ArrayList arrayListL0 = p13.u.l0(bVarArr);
            f12.l.f68084a.getClass();
            String strH4 = f12.l.a.a().h4();
            if (strH4 == null) {
                strH4 = j70.r.f97629l.f97636a;
            }
            if (p005kotlin.jvm.internal.s.g(strH4, j70.r.f97629l.f97636a)) {
                arrayListL0.remove(ty0.b.f166861c2);
            }
            if (s3.b()) {
                zA = false;
            } else {
                String strE = this.f173332e.e("sis_enabled");
                gg1.y0.f77370b.getClass();
                Iterator it = gg1.y0.f77376h.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((gg1.y0) next).f77377a, strE));
                gg1.y0 y0Var = (gg1.y0) next;
                int i18 = y0Var == null ? -1 : b.f173336b[y0Var.ordinal()];
                if (i18 == 1) {
                    zA = false;
                } else if (i18 == 2) {
                    s3.f23252a.getClass();
                    zA = s3.a("ROLE_DI_TESTER");
                } else if (i18 == 3) {
                    s3.f23252a.getClass();
                    if (s3.a("ROLE_DI_TESTER") || s3.a("ROLE_MBTESTER")) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else if (i18 != 4) {
                    zA = false;
                } else {
                    zA = true;
                }
            }
            if (!zA) {
                arrayListL0.remove(ty0.b.f166867e2);
            }
            if (!km2.a.f(SupportedCapability.INSTANT_INPUT.ordinal())) {
                arrayListL0.remove(ty0.b.f166887k2);
            }
            z0Var.f173378a = arrayListL0;
            z0Var.f173381d = 1;
            Object objB = b(z14, z0Var);
            if (objB == aVar) {
                return aVar;
            }
            arrayList = arrayListL0;
            obj = objB;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = z0Var.f173378a;
            o13.r.b(obj);
        }
        lj1.a aVar2 = (lj1.a) obj;
        if (!aVar2.f113035a) {
            arrayList.remove(ty0.b.f166903o2);
        }
        ArrayList arrayList5 = new ArrayList(p13.y.r(arrayList, 10));
        for (ty0.b bVar : arrayList) {
            int[] iArr = b.f173335a;
            int i19 = iArr[bVar.ordinal()];
            ty0.b bVar2 = this.f173334g;
            l22.b bVar3 = this.f173329b;
            if (i19 == 2) {
                String strB = bVar.b(bVar3);
                bVar2.getClass();
                ty0.b[] bVarArr2 = ty0.b.f166903o2.f166941g;
                if (bVarArr2 != null) {
                    ArrayList arrayListL1 = p13.u.l0(bVarArr2);
                    if (!aVar2.f113040f) {
                        arrayListL1.remove(ty0.b.f166895m2);
                    }
                    if (!aVar2.f113041g) {
                        arrayListL1.remove(ty0.b.f166899n2);
                    }
                    List<ty0.b> listA = ty0.c.a(arrayListL1);
                    arrayList2 = new ArrayList(p13.y.r(listA, 10));
                    for (ty0.b bVar4 : listA) {
                        int i24 = n.a.f173251a[bVar4.ordinal()];
                        if (i24 == 1) {
                            String displayName = aVar2.f113037c;
                            if (displayName != null) {
                                str = displayName;
                            } else {
                                gj1.b bVar5 = aVar2.f113036b;
                                if (bVar5 != null) {
                                    displayName = bVar5.getDisplayName();
                                    str = displayName;
                                } else {
                                    str = null;
                                }
                            }
                            eVar = new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar4, str, false, 8, null);
                        } else if (i24 != 2) {
                            eVar = new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar4, null, false, 12, null);
                        } else {
                            String displayName2 = aVar2.f113039e;
                            if (displayName2 != null) {
                                str2 = displayName2;
                            } else {
                                gj1.b bVar6 = aVar2.f113038d;
                                if (bVar6 != null) {
                                    displayName2 = bVar6.getDisplayName();
                                    str2 = displayName2;
                                } else {
                                    str2 = null;
                                }
                            }
                            eVar = new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar4, str2, false, 8, null);
                        }
                        arrayList2.add(eVar);
                    }
                } else {
                    arrayList2 = p13.j0.f134944a;
                }
                int i25 = bVar.f166940f;
                kVar = new com.garmin.android.apps.connectmobile.navigation.more.b.k(strB, arrayList2, i25 != 0 ? bVar3.getString(i25) : null);
            } else if (i19 == i17) {
                String strB2 = bVar.b(bVar3);
                bVar2.getClass();
                ty0.b[] bVarArr3 = ty0.b.f166925w2.f166941g;
                if (bVarArr3 != null) {
                    ArrayList arrayListL2 = p13.u.l0(bVarArr3);
                    g gVar = this.f173333f;
                    if (!gVar.f173170a.W()) {
                        arrayListL2.remove(ty0.b.f166914s2);
                    }
                    arrayListL2.remove(ty0.b.f166917t2);
                    if (!gVar.f173171b.f()) {
                        arrayListL2.remove(ty0.b.f166919u2);
                        arrayListL2.remove(ty0.b.f166922v2);
                    }
                    List<ty0.b> listA2 = ty0.c.a(arrayListL2);
                    ArrayList arrayList6 = new ArrayList(p13.y.r(listA2, 10));
                    ?? r15 = r14;
                    for (ty0.b bVar7 : listA2) {
                        int i26 = g.a.f173172a[bVar7.ordinal()];
                        if (i26 == 1) {
                            eVar2 = new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar7, bVar3.getString(R.string.build_number), false, 8, null);
                        } else if (i26 != 2) {
                            int i27 = bVar7.f166940f;
                            eVar2 = new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar7, i27 != 0 ? bVar3.getString(i27) : r15, false, 8, null);
                        } else {
                            eVar2 = new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar7, "5.30.1", false);
                        }
                        arrayList6.add(eVar2);
                        r15 = 0;
                    }
                    list = arrayList6;
                } else {
                    list = p13.j0.f134944a;
                }
                kVar = new com.garmin.android.apps.connectmobile.navigation.more.b.k(strB2, list, null, 4, null);
            } else if (i19 == i16) {
                String strB3 = bVar.b(bVar3);
                bVar2.getClass();
                ty0.b[] bVarArr4 = ty0.b.E2.f166941g;
                if (bVarArr4 != null) {
                    List<ty0.b> listA3 = ty0.c.a(p13.u.l0(bVarArr4));
                    arrayList3 = new ArrayList(p13.y.r(listA3, 10));
                    for (ty0.b bVar8 : listA3) {
                        arrayList3.add(bVar8 == ty0.b.D2 ? new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar8, String.valueOf(Calendar.getInstance(Locale.US).get(1)), false, 8, null) : new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, bVar8, null, false, 12, null));
                    }
                } else {
                    arrayList3 = p13.j0.f134944a;
                }
                kVar = new com.garmin.android.apps.connectmobile.navigation.more.b.k(strB3, arrayList3, null, 4, null);
            } else if (i19 != 5) {
                int i28 = iArr[bVar.ordinal()];
                ty0.b bVar9 = this.f173334g;
                kVar = i28 == 1 ? new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar9, bVar, this.f173331d.getUserFullName(), false, 8, null) : new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar9, bVar, null, false, 12, null);
            } else {
                String strB4 = bVar.b(bVar3);
                bVar2.getClass();
                ty0.b[] bVarArr5 = ty0.b.I2.f166941g;
                if (bVarArr5 != null) {
                    ArrayList arrayListL3 = p13.u.l0(bVarArr5);
                    GCMActivityAppDiagnostics.INSTANCE.getClass();
                    s3.f23252a.getClass();
                    if (!s3.a("ROLE_MBTESTER") && ((f12.b) KoinJavaComponent.get$default(f12.b.class, r14, r14, 6, r14)).i()) {
                        arrayListL3.remove(ty0.b.F2);
                    }
                    c22.z0.f23761a.getClass();
                    if (!s3.a("ROLE_MBTESTER") && ((f12.b) KoinJavaComponent.get$default(f12.b.class, r14, r14, 6, r14)).D()) {
                        arrayListL3.remove(ty0.b.H2);
                    }
                    List listA4 = ty0.c.a(arrayListL3);
                    arrayList4 = new ArrayList(p13.y.r(listA4, 10));
                    Iterator it3 = listA4.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(bVar2, (ty0.b) it3.next(), null, false, 12, null));
                    }
                } else {
                    arrayList4 = p13.j0.f134944a;
                }
                kVar = new com.garmin.android.apps.connectmobile.navigation.more.b.k(strB4, arrayList4, null, 4, null);
            }
            arrayList5.add(kVar);
            i16 = 4;
            i17 = 3;
            r14 = 0;
        }
        return arrayList5;
    }

    public final String e(gj1.h hVar) {
        String string;
        String displayName;
        String lastUploadTimestamp = hVar.getLastUploadTimestamp();
        if (lastUploadTimestamp == null) {
            return null;
        }
        DateTime dateTime = new DateTime(Long.parseLong(lastUploadTimestamp));
        DateTimeFormatter dateTimeFormatter = c22.j0.f23102d;
        dateTimeFormatter.getClass();
        DateTime dateTime2 = new DateTime(c22.j0.h(dateTime, dateTimeFormatter));
        boolean zG = p005kotlin.jvm.internal.s.g(dateTime2.toString("MM/dd/yy"), DateTime.now().toString("MM/dd/yy"));
        Context context = this.f173328a;
        if (zG) {
            String string2 = context.getString(R.string.mct_lbl_today);
            string2.getClass();
            Locale locale = Locale.ROOT;
            string = j20.x.f(locale, string2, locale);
        } else {
            string = dateTime2.toString("MMM d, yyyy");
        }
        c22.j0.f23099a.getClass();
        String strN = fb1.c.n(" - ", context.getString(R.string.device_last_synced_date, string, dateTime2.toString(c22.j0.z())));
        gj1.b bVar = hVar.f77674i;
        if (bVar == null || (displayName = bVar.getDisplayName()) == null) {
            displayName = "";
        }
        return displayName.concat(strN);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Luy0/v0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LAST_SYNC_PRE_FIX", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
