package ui1;

import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Response;
import org.json.JSONArray;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lui1/o0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lui1/l0;", "subscriptionsApi", "La31/e;", "onboardingChecksDelegate", "<init>", "(Lui1/l0;La31/e;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f171346d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f171347e = p13.w.c("3652");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f171348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.e f171349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f171350c;

    public o0(l0 l0Var, a31.e eVar) {
        l0Var.getClass();
        eVar.getClass();
        this.f171348a = l0Var;
        this.f171349b = eVar;
        this.f171350c = o13.m.b(new uf2.p0(4));
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        try {
            int iH = d53.w.H(str, "-", 0, false, 4);
            return str.substring(iH + 2, iH + 6);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, v13.c cVar) {
        p0 p0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f171356c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f171356c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objJ = p0Var.f171354a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f171356c;
        if (i15 == 0) {
            o13.r.b(objJ);
            q0 q0Var = new q0(this, str, null);
            p0Var.f171356c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, q0Var, p0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            String strG = androidx.room.a0.g(aVar2.f47384b, "Error occurred while connecting to check job status ");
            p92.y.f136664a.getClass();
            p92.y.a.c("SubscriptionsRepository", strG);
            return new v2.a(new IOException("Error occurred while connecting to check job status !!"), aVar2.f47384b, null, 4, null);
        }
        v2.b bVar = (v2.b) v2Var;
        String strA = ((c0) bVar.f47386a).getStatus();
        Integer num = strA != null ? new Integer(Integer.parseInt(strA)) : null;
        int iOrdinal = d0.UNKNOWN.ordinal();
        if (num == null || num.intValue() != iOrdinal) {
            int iOrdinal2 = d0.READY.ordinal();
            if (num == null || num.intValue() != iOrdinal2) {
                int iOrdinal3 = d0.PROCESSING.ordinal();
                if (num == null || num.intValue() != iOrdinal3) {
                    d0 d0Var = d0.COMPLETE;
                    int iOrdinal4 = d0Var.ordinal();
                    if (num != null && num.intValue() == iOrdinal4) {
                        return new v2.b(d0Var, bVar.f47387b, null, null, 12, null);
                    }
                    String strH = am.j.h(bVar.f47387b, "Error occurred while fetching the job status ");
                    p92.y.f136664a.getClass();
                    p92.y.a.c("SubscriptionsRepository", strH);
                    return new v2.a(new IOException("Error occurred while fetching the job status"), null, null, 6, null);
                }
            }
        }
        return new v2.b(d0.PROCESSING, bVar.f47387b, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (o53.m0.b(5000, r2) == r3) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0095 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, v13.c cVar) {
        r0 r0Var;
        r0 r0Var2;
        int i14;
        String str2;
        String str3;
        int i15;
        v2 v2Var;
        v2.b bVar;
        int i16;
        Object objA;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i17 = r0Var.f171371e;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                r0Var.f171371e = i17 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object obj = r0Var.f171369c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i18 = r0Var.f171371e;
        if (i18 == 0) {
            o13.r.b(obj);
            r0Var2 = r0Var;
            i14 = 0;
            str2 = str;
            i16 = i14 + 1;
            if (i14 < 6) {
                return new v2.a(new IOException("taking longer time than expected"), new Integer(6), null, 4, null);
            }
            r0Var2.f171367a = str2;
            r0Var2.f171368b = i16;
            r0Var2.f171371e = 1;
            objA = a(str2, r0Var2);
            if (objA != obj2) {
                str3 = str2;
                obj = objA;
                r0Var = r0Var2;
                i15 = i16;
                v2Var = (v2) obj;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        v2.a aVar = (v2.a) v2Var;
                        return new v2.a(aVar.f47383a, aVar.f47384b, null, 4, null);
                    }
                    lc.u0.r();
                    return null;
                }
                bVar = (v2.b) v2Var;
                if (((d0) bVar.f47386a).equals(d0.COMPLETE)) {
                    return new v2.b(Unit.INSTANCE, bVar.f47387b, null, null, 12, null);
                }
                r0Var.f171367a = str3;
                r0Var.f171368b = i15;
                r0Var.f171371e = 2;
            }
            return obj2;
        }
        if (i18 == 1) {
            i15 = r0Var.f171368b;
            str3 = r0Var.f171367a;
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
                }
                lc.u0.r();
                return null;
            }
            bVar = (v2.b) v2Var;
            if (((d0) bVar.f47386a).equals(d0.COMPLETE)) {
                return new v2.b(Unit.INSTANCE, bVar.f47387b, null, null, 12, null);
            }
            r0Var.f171367a = str3;
            r0Var.f171368b = i15;
            r0Var.f171371e = 2;
        } else {
            if (i18 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = r0Var.f171368b;
            str3 = r0Var.f171367a;
            o13.r.b(obj);
        }
        int i19 = i15;
        r0Var2 = r0Var;
        i14 = i19;
        str2 = str3;
        i16 = i14 + 1;
        if (i14 < 6) {
            return new v2.a(new IOException("taking longer time than expected"), new Integer(6), null, 4, null);
        }
        r0Var2.f171367a = str2;
        r0Var2.f171368b = i16;
        r0Var2.f171371e = 1;
        objA = a(str2, r0Var2);
        if (objA != obj2) {
            str3 = str2;
            obj = objA;
            r0Var = r0Var2;
            i15 = i16;
            v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    v2.a aVar3 = (v2.a) v2Var;
                    return new v2.a(aVar3.f47383a, aVar3.f47384b, null, 4, null);
                }
                lc.u0.r();
                return null;
            }
            bVar = (v2.b) v2Var;
            if (((d0) bVar.f47386a).equals(d0.COMPLETE)) {
                return new v2.b(Unit.INSTANCE, bVar.f47387b, null, null, 12, null);
            }
            r0Var.f171367a = str3;
            r0Var.f171368b = i15;
            r0Var.f171371e = 2;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, List list, v13.c cVar) {
        s0 s0Var;
        String strG;
        LinkedHashMap linkedHashMap;
        List list2;
        Unit unit;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f171380f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f171380f = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object obj = s0Var.f171378d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f171380f;
        if (i15 == 0) {
            o13.r.b(obj);
            strG = g(str);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
            s0Var.f171375a = list;
            s0Var.f171376b = strG;
            s0Var.f171377c = linkedHashMap2;
            s0Var.f171380f = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(jVarA, new pc0.a0(jVarA, null), s0Var);
            if (objJ == aVar) {
                return aVar;
            }
            linkedHashMap = linkedHashMap2;
            obj = objJ;
            list2 = list;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = s0Var.f171377c;
            strG = s0Var.f171376b;
            list2 = s0Var.f171375a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            try {
                T t7 = ((v2.b) v2Var).f47386a;
                t7.getClass();
                bm2.c[] cVarArrF = bm2.c.f(new JSONArray((String) t7));
                if (cVarArrF != null) {
                    ArrayList arrayList = new ArrayList(cVarArrF.length);
                    for (bm2.c cVar2 : cVarArrF) {
                        String strG2 = g(cVar2.f18899b);
                        if (strG2 != null) {
                            if (f171347e.contains(strG2) && strG2.equals(strG) && list2.contains(new Long(cVar2.f18942x))) {
                                String productDisplayName = cVar2.getProductDisplayName();
                                if (productDisplayName == null || productDisplayName.length() == 0) {
                                    linkedHashMap.put(new Long(cVar2.f18942x), String.valueOf(cVar2.f18942x));
                                } else {
                                    linkedHashMap.put(new Long(cVar2.f18942x), cVar2.getProductDisplayName() + " (" + d53.y.t0(4, String.valueOf(cVar2.f18942x)) + ")");
                                }
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        arrayList.add(unit);
                    }
                }
                rd2.f.a().f152045a.getClass();
                ArrayList<sd2.f> arrayListD = rd2.j.d();
                if (arrayListD != null) {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListD, 10));
                    for (sd2.f fVar : arrayListD) {
                        if (p005kotlin.jvm.internal.s.g(g(fVar.getPartNumber()), strG) && list2.contains(new Long(fVar.getUnitID()))) {
                            String productDisplayName2 = fVar.getProductDisplayName();
                            if (productDisplayName2 == null || productDisplayName2.length() == 0) {
                                linkedHashMap.put(new Long(fVar.getUnitID()), String.valueOf(fVar.getUnitID()));
                            } else {
                                linkedHashMap.put(new Long(fVar.getUnitID()), fVar.getProductDisplayName() + " (" + d53.y.t0(4, String.valueOf(fVar.getUnitID())) + ")");
                            }
                        }
                        arrayList2.add(Unit.INSTANCE);
                    }
                }
            } catch (Exception e4) {
                String strN = fb1.c.n("error in fetching device list ", e4.getMessage());
                p92.y.f136664a.getClass();
                p92.y.a.c("SubscriptionsRepository", strN);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(Long l14, v13.c cVar) {
        t0 t0Var;
        Integer inventoryStatus;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f171387d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f171387d = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object objAwait = t0Var.f171385b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f171387d;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                o53.i0<c83.a0<m0>> i0VarC = this.f171348a.c();
                t0Var.f171384a = l14;
                t0Var.f171387d = 1;
                objAwait = i0VarC.await(t0Var);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l14 = t0Var.f171384a;
                o13.r.b(objAwait);
            }
            c83.a0 a0Var = (c83.a0) objAwait;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            m0 m0Var = (m0) t7;
            if (!response.isSuccessful() || m0Var == null) {
                if (response.isSuccessful()) {
                    return new v2.b(new ArrayList(), response.code(), null, null, 12, null);
                }
                return new v2.a(new IOException("Error Occurred while fetching getAllSubscriberDevices, Response [" + a0Var + "]"), new Integer(response.code()), null, 4, null);
            }
            ArrayList<n0> arrayList = new ArrayList();
            for (n0 n0Var : m0Var) {
                n0 n0Var2 = n0Var;
                if (n0Var2 != null && (inventoryStatus = n0Var2.getInventoryStatus()) != null && inventoryStatus.intValue() == 2 && !p005kotlin.jvm.internal.s.g(n0Var2.getUnitID(), l14)) {
                    arrayList.add(n0Var);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            for (n0 n0Var3 : arrayList) {
                arrayList2.add(n0Var3 != null ? n0Var3.getUnitID() : null);
            }
            return new v2.b(new ArrayList(arrayList2), response.code(), null, null, 12, null);
        } catch (Throwable th3) {
            return new v2.a(new IOException("Error Occurred during getAllSubscriberDevices, ERROR [" + th3 + "]"), null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r15 == r3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Long l14, v13.c cVar) {
        u0 u0Var;
        o13.t tVar = this.f171350c;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f171394d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f171394d = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objC = u0Var.f171392b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f171394d;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                u0Var.f171391a = l14;
                u0Var.f171394d = 1;
                objC = bVar.C(u0Var);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                l14 = u0Var.f171391a;
                o13.r.b(objC);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l14 = u0Var.f171391a;
                o13.r.b(objC);
            }
            c83.a0 a0Var = (c83.a0) objC;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            x0 x0Var = (x0) t7;
            if (!response.isSuccessful() || x0Var == null) {
                if (response.isSuccessful()) {
                    return new v2.b(new x0(), response.code(), null, null, 12, null);
                }
                return new v2.a(new IOException("Error Occurred during getLTESubscriptions, Response [" + a0Var + "]"), new Integer(response.code()), null, 4, null);
            }
            if (y0.b(x0Var)) {
                this.f171349b.b(e31.a.ENTERED_LTE_SETUP);
            }
            if (l14 != null) {
                long jLongValue = l14.longValue();
                if (y0.b(x0Var) && ((vi1.a) tVar.getValue()).a().k(jLongValue)) {
                    ((vi1.a) tVar.getValue()).a().p(jLongValue, false);
                }
            }
            return new v2.b(x0Var, response.code(), null, null, 12, null);
            HashMap mapD = p13.u0.d(new o13.p("customerId", (String) objC));
            if (l14 != null) {
            }
            o53.i0<c83.a0<x0>> i0VarE = this.f171348a.e(mapD);
            u0Var.f171391a = l14;
            u0Var.f171394d = 2;
            objC = i0VarE.await(u0Var);
        } catch (Throwable th3) {
            return new v2.a(new IOException("Error Occurred during getLTESubscriptions, ERROR [" + th3 + "]"), null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(v13.c cVar) {
        v0 v0Var;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i14 = v0Var.f171400c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f171400c = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object objAwait = v0Var.f171398a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f171400c;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                o53.i0<c83.a0<tj1.v>> i0VarB = this.f171348a.b();
                v0Var.f171400c = 1;
                objAwait = i0VarB.await(v0Var);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objAwait);
            }
            c83.a0 a0Var = (c83.a0) objAwait;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            tj1.v vVar = (tj1.v) t7;
            if (response.isSuccessful() && vVar != null) {
                return new v2.b(vVar, response.code(), null, null, 12, null);
            }
            if (!response.isSuccessful()) {
                return new v2.a(new IOException("Error Occurred during getSubscriptionBillingInfo, Response [" + a0Var + "]"), new Integer(response.code()), null, 4, null);
            }
            return new v2.b(new tj1.v(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null), response.code(), null, null, 12, null);
        } catch (Throwable th3) {
            return new v2.a(new IOException("Error Occurred during getSubscriptionBillingInfo, ERROR [" + th3 + "]"), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lui1/o0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "UNIT_ID", "CUSTOMER_ID", "", "ACTIVATED", "I", "", "subTransferWhiteList", "Ljava/util/List;", "", "DEFAULT_RETRY_DELAY", "J", "DEFAULT_MAX_RETRY_COUNT", "POLLING_INTERVAL", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o0 a() {
            return new o0((l0) ez0.b.a(ez0.b.f67468a, ez0.c.LTE_SUBSCRIPTIONS_URL, l0.class, new c83.h.a[0], null, null, null, 120), (a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null));
        }

        private a() {
        }
    }
}
