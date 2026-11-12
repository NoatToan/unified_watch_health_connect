package pc0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.s0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpc0/j;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lac0/c;", "deviceApiService", "Lic0/b;", "deviceInfoRepository", "Lf12/l;", "gcmUserSettings", "Lf12/b;", "gcmUserAccount", "Lpc0/i;", "devicesPreferences", "Ll80/a;", "deviceDelegate", "Ll80/b;", "gdiDelegate", "La31/e;", "onboardingChecksDelegate", "<init>", "(Lac0/c;Lic0/b;Lf12/l;Lf12/b;Lpc0/i;Ll80/a;Ll80/b;La31/e;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f137223i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac0.c f137224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic0.b f137225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.l f137226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.b f137227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f137228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l80.a f137229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l80.b f137230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.e f137231h;

    static {
        n63.p.a(new p40.h(6));
    }

    public j(ac0.c cVar, ic0.b bVar, f12.l lVar, f12.b bVar2, i iVar, l80.a aVar, l80.b bVar3, a31.e eVar) {
        cVar.getClass();
        bVar.getClass();
        lVar.getClass();
        bVar2.getClass();
        iVar.getClass();
        aVar.getClass();
        bVar3.getClass();
        eVar.getClass();
        this.f137224a = cVar;
        this.f137225b = bVar;
        this.f137226c = lVar;
        this.f137227d = bVar2;
        this.f137228e = iVar;
        this.f137229f = aVar;
        this.f137230g = bVar3;
        this.f137231h = eVar;
    }

    public static final sd2.f a(j jVar, List list) {
        jVar.getClass();
        sd2.f fVar = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (sd2.f) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sd2.f fVar2 = (sd2.f) it.next();
            if (jVar.f137226c.s4() == fVar2.getUnitID()) {
                return fVar2;
            }
            if (fVar == null || fVar2.K2() > fVar.K2()) {
                fVar = fVar2;
            }
        }
        return fVar;
    }

    public static final ArrayList b(j jVar, String str) {
        jVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("devices");
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    bm2.c cVarD = bm2.c.d(jSONArray.getJSONObject(i14));
                    if (cVarD != null) {
                        arrayList.add(cVarD);
                    }
                }
            }
            return arrayList;
        } catch (JSONException e4) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "DevicesRepo", e4);
            return null;
        }
    }

    public static final void c(j jVar, ArrayList arrayList, String str) {
        jVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hv.i.a(zb0.k.f((bm2.c) obj), str, true)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String partNumberPartial = ((bm2.c) it.next()).getPartNumberPartial();
            if (partNumberPartial != null) {
                arrayList3.add(partNumberPartial);
            }
        }
        List listB1 = p13.h0.b1(p13.h0.f1(arrayList3));
        if (listB1.isEmpty()) {
            return;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICES, "DevicesRepo", "savePairSupportedProductNumbers " + listB1);
        jVar.f137228e.b(p13.h0.g1(listB1));
    }

    public static Object d(j jVar, boolean z14, v13.c cVar) {
        String strB = c22.b0.b(null);
        jVar.getClass();
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new l(z14, jVar, strB, null), cVar);
    }

    public static c0 j() {
        ed0.a.f63825a.getClass();
        return new c0(ed0.a.f63833i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(v13.c cVar) {
        m mVar;
        ArrayList arrayList;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f137259c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f137259c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objJ = mVar.f137257a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f137259c;
        if (i15 == 0) {
            o13.r.b(objJ);
            n nVar = new n(this, null);
            mVar.f137259c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, nVar, mVar);
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
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        try {
            JSONArray jSONArray = new JSONArray((String) bVar.f47386a);
            ArrayList arrayList2 = new ArrayList();
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i16 = 0; i16 < length; i16++) {
                    bm2.c cVarD = bm2.c.d(jSONArray.getJSONObject(i16));
                    if (cVarD != null) {
                        arrayList2.add(cVarD);
                    }
                }
            }
            arrayList = arrayList2;
        } catch (JSONException e4) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "DevicesRepo", e4);
            arrayList = null;
        }
        return arrayList != null ? new v2.b(arrayList, bVar.f47387b, null, null, 12, null) : new v2.a(new Exception("Error parsing all device list response"), null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(String str, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f137296c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f137296c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objJ = uVar.f137294a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f137296c;
        if (i15 == 0) {
            o13.r.b(objJ);
            v vVar = new v(this, str, null);
            uVar.f137296c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, vVar, uVar);
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
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            T t7 = bVar.f47386a;
            int i16 = bVar.f47387b;
            if (i16 == 204 && !(t7 instanceof com.garmin.android.apps.connectmobile.devices.model.m)) {
                return new v2.a(new Exception("204 No Content. Empty response body. kotlin.Unit cannot be cast to DeviceRegistrationDetailsDTO"), new Integer(i16), null, 4, null);
            }
            if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.devices.model.m) t7).getTopoActiveMapsRealTimeSettingCapable(), Boolean.TRUE)) {
                this.f137231h.b(e31.a.HAS_TOPO_ACTIVE_MAPS_SUPPORT);
            }
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [bm2.c[], java.io.Serializable] */
    public final Serializable h(v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f137302c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f137302c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objJ = wVar.f137300a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f137302c;
        if (i15 == 0) {
            o13.r.b(objJ);
            x xVar = new x(this, null);
            wVar.f137302c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, xVar, wVar);
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
        if (v2Var instanceof v2.b) {
            try {
                T t7 = ((v2.b) v2Var).f47386a;
                t7.getClass();
                return bm2.c.f(new JSONArray((String) t7));
            } catch (Exception e4) {
                String strN = fb1.c.n("Error in fetching device list - message: ", e4.getMessage());
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "DevicesRepo", strN);
                return null;
            }
        }
        if (!(v2Var instanceof v2.a)) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "DevicesRepo", "Fetching device list - no list found");
            return null;
        }
        String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "Error in fetching device list - rc: ");
        i2.a aVar4 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar4.getClass();
        i2.a.f(a2Var3, "DevicesRepo", strG);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(v13.c cVar) {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f137307c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f137307c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objJ = yVar.f137305a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f137307c;
        if (i15 == 0) {
            o13.r.b(objJ);
            z zVar = new z(this, null);
            yVar.f137307c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, zVar, yVar);
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
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "Error in fetching device list - rc: ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "DevicesRepo", strG);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c  */
    @SuppressLint({"MissingPermission"})
    public final ArrayList k() throws Throwable {
        l80.a aVar;
        boolean z14;
        bm2.c cVarN;
        com.garmin.android.apps.connectmobile.devices.model.l lVarF;
        String address;
        wb2.h hVar;
        ArrayList arrayList = new ArrayList();
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListD = rd2.j.d();
        if (arrayListD != null && !arrayListD.isEmpty()) {
            if (arrayListD.size() > 1) {
                p13.c0.u(arrayListD, new f0());
            }
            if (arrayListD.size() > 1) {
                p13.c0.u(arrayListD, new e0());
            }
            if (arrayListD.size() > 1) {
                p13.c0.u(arrayListD, new g0(this));
            }
            for (sd2.f fVar : arrayListD) {
                arrayList.add(new gc0.e(fVar));
                rd2.m mVarF = rd2.m.f();
                long unitID = fVar.getUnitID();
                mVarF.getClass();
                rd2.m.e(unitID);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aVar = this.f137229f;
            if (!zHasNext) {
                break;
            }
            gc0.e eVar = (gc0.e) it.next();
            sd2.f fVar2 = eVar.f76845a;
            if (fVar2.isPaired()) {
                long unitID2 = fVar2.getUnitID();
                al2.a aVarK = aVar.K(unitID2);
                al2.k kVarY = aVar.y(fVar2.d0());
                al2.k kVar = al2.k.STARTED;
                boolean z15 = kVarY == kVar || aVar.y(fVar2.Q()) == kVar;
                if (aVarK != null) {
                    eVar.a(z15 ? gc0.f.IN_PROGRESS_SUB_STATUS_SENDING_SOFTWARE_UPDATE_TO_DEVICE : gc0.f.IN_PROGRESS_NO_SUB_STATUS);
                    eVar.f76849e = (int) aVarK.a();
                } else {
                    wb2.x xVarL = this.f137230g.l(unitID2);
                    if (xVarL != null) {
                        long j8 = xVarL.f184208d;
                        if (j8 != -1) {
                            eVar.f76848d = j8;
                            if (xVarL.f184207c) {
                                eVar.a(gc0.f.FINISHED_SUCCESS);
                                eVar.f76849e = 100;
                            } else {
                                eVar.a(gc0.f.FINISHED_FAILURE);
                                eVar.f76849e = 0;
                                wb2.h hVar2 = xVarL.f184209e;
                                String strName = hVar2 != null ? hVar2.name() : "";
                                if (strName != null) {
                                    hVar = wb2.h.DEFAULT;
                                    try {
                                        wb2.h hVarValueOf = wb2.h.valueOf(strName);
                                        if (hVarValueOf != null) {
                                            hVar = hVarValueOf;
                                        }
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    hVar = wb2.h.DEFAULT;
                                }
                                eVar.f76851g = hVar;
                            }
                        }
                    }
                    eVar.a(gc0.f.NONE);
                }
            }
        }
        rd2.m.f().getClass();
        ArrayList<sd2.j> arrayListG = rd2.m.g();
        if (arrayListG != null) {
            for (sd2.j jVar : arrayListG) {
                try {
                    Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
                    bondedDevices.getClass();
                    Set<BluetoothDevice> set = bondedDevices;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it3 = set.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                BluetoothDevice bluetoothDevice = (BluetoothDevice) it3.next();
                                if ((bluetoothDevice == null || (address = bluetoothDevice.getAddress()) == null) ? false : address.equalsIgnoreCase(jVar.J0)) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                        if (!z14) {
                            cVarN = aVar.N(jVar.Z0);
                            if (cVarN != null) {
                                lVarF = zb0.k.f(cVarN);
                            } else {
                                lVarF = null;
                            }
                            arrayList.add(0, new gc0.e(jVar, lVarF));
                        }
                    }
                } catch (Exception e4) {
                    a2 a2Var = a2.DEVICES;
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "isOrphanDeviceBonded ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DevicesRepo", strD);
                }
                z14 = false;
                if (!z14) {
                    cVarN = aVar.N(jVar.Z0);
                    if (cVarN != null) {
                        lVarF = zb0.k.f(cVarN);
                    } else {
                        lVarF = null;
                    }
                    arrayList.add(0, new gc0.e(jVar, lVarF));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f137219c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f137219c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objC = h0Var.f137217a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f137219c;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                o53.r<cc0.f> rVarK = new cc0.e(this.f137227d.getUserDisplayName(), null).k();
                h0Var.f137219c = 1;
                objC = ((o53.s) rVarK).C(h0Var);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            cc0.f fVar = (cc0.f) objC;
            return fVar != null ? new v2.b(fVar, 200, null, null, 12, null) : new v2.a(new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA), null, null, 6, null);
        } catch (BizOperationException e4) {
            a2 a2Var = a2.DEVICES;
            String str = "refreshUserActiveDevices() -> operation failed with status=[" + e4.getStatus() + "]";
            i2.f36769a.getClass();
            i2.a.f(a2Var, "DevicesRepo", str);
            return new v2.a(e4, null, null, 6, null);
        } catch (Throwable th3) {
            a2 a2Var2 = a2.DEVICES;
            String strM = am.j.m("refreshUserActiveDevices() -> operation failed with exception=[", th3.getMessage(), "]");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "DevicesRepo", strM);
            return new v2.a(new IOException(th3), null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable m(byte[] bArr, v13.c cVar) {
        i0 i0Var;
        Serializable bVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f137222c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f137222c = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objE = i0Var.f137220a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f137222c;
        try {
            if (i15 == 0) {
                o13.r.b(objE);
                int i16 = o13.q.f128596b;
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DevicesRepo", "registerDeviceAccessory -> registering device accessory");
                RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, MediaType.INSTANCE.parse("application/octet-stream"), 0, 0, 6, (Object) null);
                ac0.c cVar2 = this.f137224a;
                i0Var.f137222c = 1;
                objE = cVar2.e(requestBodyCreate$default, i0Var);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE);
            }
            c83.a0 a0Var = (c83.a0) objE;
            if (!a0Var.f25745a.isSuccessful()) {
                a2 a2Var2 = a2.DEVICES;
                String str = "registerDeviceAccessory -> response not successful code[" + a0Var.f25745a.code() + "]";
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "DevicesRepo", str);
                throw new HttpException(a0Var);
            }
            ResponseBody responseBody = (ResponseBody) a0Var.f25746b;
            String strString = responseBody != null ? responseBody.string() : null;
            boolean zOptBoolean = false;
            if (strString != null) {
                zOptBoolean = new JSONObject(strString).optBoolean("newRegistration", false);
            } else {
                a2 a2Var3 = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "DevicesRepo", "registerDeviceAccessory -> response body is null");
            }
            bVar = Boolean.valueOf(zOptBoolean);
            int i17 = o13.q.f128596b;
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                a2 a2Var4 = a2.DEVICES;
                String strP = am.j.p("registerDeviceAccessory -> failed to register device accessory ", thB);
                i2.f36769a.getClass();
                i2.a.f(a2Var4, "DevicesRepo", strP);
            }
            if (!(bVar instanceof o13.q.b)) {
                boolean zBooleanValue = ((Boolean) bVar).booleanValue();
                a2 a2Var5 = a2.DEVICES;
                String strG = com.airbnb.lottie.animation.keyframe.a.g("registerDeviceAccessory -> device accessory registered successfully newRegistration[", "]", zBooleanValue);
                i2.f36769a.getClass();
                i2.a.b(a2Var5, "DevicesRepo", strG);
            }
            return bVar;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpc0/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "JSON_KEY_DEVICES", "JSON_KEY_NEW_REGISTRATION", "Ln63/b;", "jsonParser", "Ln63/b;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(a aVar) {
            ac0.c cVar = (ac0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ac0.c.class, new c83.h.a[0], null, null, null, 120);
            ic0.b bVar = (ic0.b) KoinJavaComponent.get$default(ic0.b.class, null, null, 6, null);
            f12.l.a aVar2 = f12.l.f68084a;
            aVar2.getClass();
            f12.l lVarA = f12.l.a.a();
            f12.b bVar2 = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            aVar2.getClass();
            m0 m0Var = new m0(f12.l.a.a());
            l80.a aVar3 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
            l80.b bVar3 = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
            a31.e eVar = (a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null);
            aVar.getClass();
            cVar.getClass();
            bVar.getClass();
            lVarA.getClass();
            bVar2.getClass();
            aVar3.getClass();
            bVar3.getClass();
            eVar.getClass();
            return new j(cVar, bVar, lVarA, bVar2, m0Var, aVar3, bVar3, eVar);
        }

        private a() {
        }
    }
}
