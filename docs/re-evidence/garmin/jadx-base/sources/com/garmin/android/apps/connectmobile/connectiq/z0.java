package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import c22.u1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.connectiq.ConnectIQ;
import com.garmin.android.connectiq.IQDevice;
import com.garmin.android.connectiq.exception.InvalidStateException;
import com.garmin.android.connectiq.exception.ServiceUnavailableException;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static z0 f32114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f32115d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ReentrantLock f32116e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<c> f32118b;

    public class a implements la2.a {
        public a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            long f172494b = hVar.f111673a.getF172494b();
            z0.f32116e.lock();
            try {
                z0.f32115d.remove(Long.valueOf(f172494b));
                z0.this.f32118b.removeIf(new y0(f172494b, 0));
            } finally {
                z0.f32116e.unlock();
            }
        }
    }

    public class b {
        public b() {
        }

        public final void a(long j8, String str) {
            ea2.d dVarE;
            z0 z0Var = z0.this;
            z0Var.getClass();
            z0.f32116e.lock();
            try {
                c cVarI = z0Var.i(j8, d.CLOSE_CONNECTION, str);
                if (cVarI != null) {
                    z0Var.m(cVarI);
                }
                for (c cVar : z0Var.f32118b) {
                    if (d.OPEN_CONNECTION == cVar.f32122b && !cVar.f32127g) {
                        long j14 = cVar.f32121a;
                        if (j14 == j8 && (dVarE = z0Var.e(j14)) != null) {
                            dVarE.b(cVar.f32123c);
                            z0.f32116e.unlock();
                        }
                    }
                }
                z0.f32115d.remove(Long.valueOf(j8));
                z0.f32116e.unlock();
            } catch (Throwable th3) {
                z0.f32116e.unlock();
                throw th3;
            }
        }

        public final void b(final int i14, final long j8) {
            u0 u0VarB = u0.b();
            u0VarB.getClass();
            ArrayList<u0.b> arrayList = new ArrayList();
            for (u0.b bVar : u0VarB.f32028b.values()) {
                try {
                    GarminConnectMobileApp.f28688j.getPackageManager().getPackageInfo(bVar.f32033b, 0);
                    arrayList.add(bVar);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            for (final u0.b bVar2 : arrayList) {
                i2.d("MonkeybrainsStateManager", "Requesting bind service for device status change for unitId: " + j8 + " connected: " + i14);
                bVar2.f32034c.a(z0.this.f32117a, bVar2.f32033b);
                new Thread(new Runnable() { // from class: com.garmin.android.apps.connectmobile.connectiq.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z0.b bVar3 = this.f31811a;
                        long j14 = j8;
                        int i15 = i14;
                        c cVar = bVar2.f32034c;
                        try {
                            String strC = cVar.c(z0.b(z0.this, j14, i15).toString());
                            if (Objects.equals(strC, ConnectIQ.EXTRA_STATUS_SUCCESS)) {
                                return;
                            }
                            i2.i("MonkeybrainsStateManager", "Received failure response from companion app service for device status change for unitId: " + j14 + " connected: " + i15 + " response: " + strC);
                            cVar.d();
                        } catch (InvalidStateException e4) {
                            e = e4;
                            StringBuilder sbW = v.h.w(i15, "Failed to send device status change for unitId: ", " connected: ", j14);
                            sbW.append(" error: ");
                            sbW.append(e.getMessage());
                            i2.i("MonkeybrainsStateManager", sbW.toString());
                            cVar.d();
                        } catch (ServiceUnavailableException e14) {
                            e = e14;
                            StringBuilder sbW2 = v.h.w(i15, "Failed to send device status change for unitId: ", " connected: ", j14);
                            sbW2.append(" error: ");
                            sbW2.append(e.getMessage());
                            i2.i("MonkeybrainsStateManager", sbW2.toString());
                            cVar.d();
                        } catch (JSONException e15) {
                            i2.i("MonkeybrainsStateManager", "Failed to create JSON object for device status change for unitId: " + j14 + " connected: " + i15);
                            cVar.d();
                            o2.c.p(e15);
                        }
                    }
                }).start();
            }
            Context context = GarminConnectMobileApp.f28688j;
            if (context != null) {
                Intent intent = new Intent(ConnectIQ.DEVICE_STATUS);
                intent.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j8, ""));
                intent.putExtra(ConnectIQ.EXTRA_STATUS, i14);
                context.sendBroadcast(intent);
            }
        }
    }

    public enum d {
        OPEN_CONNECTION,
        CLOSE_CONNECTION,
        /* JADX INFO: Fake field, exist only in values array */
        KEY_EXCHANGE,
        /* JADX INFO: Fake field, exist only in values array */
        CAPABILITIES,
        APPLICATION_INFO,
        OPEN_APPLICATION,
        DATA_TRANSFER
    }

    private z0(Context context) {
        a aVar = new a();
        b bVar = new b();
        this.f32117a = context.getApplicationContext();
        this.f32118b = new ConcurrentLinkedQueue<>();
        f32116e = new ReentrantLock();
        b bVar2 = ch2.h.f27575i;
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i("CIQ#MonkeybrainsSubscriber").debug("setRemoteMonkeybrainsCallback=" + bVar);
        ch2.h.f27575i = bVar;
        da2.d.b().f58886a.b(aVar);
    }

    public static /* synthetic */ void a(z0 z0Var, c cVar, String str, long j8, String str2, u0.b bVar) {
        com.garmin.android.apps.connectmobile.connectiq.c cVar2 = bVar.f32034c;
        z0Var.getClass();
        if (cVar != null) {
            try {
                str = cVar.f32126f;
            } catch (InvalidStateException e4) {
                e = e4;
                StringBuilder sbK = ds.e0.k(j8, "Failed to send device not connected for device: ", " error: ");
                sbK.append(e.getMessage());
                i2.i("MonkeybrainsStateManager", sbK.toString());
                cVar2.d();
                return;
            } catch (ServiceUnavailableException e14) {
                e = e14;
                StringBuilder sbK2 = ds.e0.k(j8, "Failed to send device not connected for device: ", " error: ");
                sbK2.append(e.getMessage());
                i2.i("MonkeybrainsStateManager", sbK2.toString());
                cVar2.d();
                return;
            } catch (JSONException e15) {
                i2.i("MonkeybrainsStateManager", "Failed to create JSON object for device not connected for device: " + j8);
                cVar2.d();
                o2.c.p(e15);
                return;
            }
        }
        String strC = cVar2.c(j(ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal(), str, str2, j8).toString());
        if (Objects.equals(strC, ConnectIQ.EXTRA_STATUS_SUCCESS)) {
            return;
        }
        i2.i("MonkeybrainsStateManager", "Received failure response from companion app service for device not connected for device: " + j8 + " application: " + str2 + " response: " + strC);
        cVar2.d();
    }

    public static JSONObject b(z0 z0Var, long j8, int i14) throws JSONException {
        z0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceIdentifier", j8);
        jSONObject.put("friendlyName", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", ConnectIQ.DEVICE_STATUS);
        jSONObject2.put(ConnectIQ.EXTRA_REMOTE_DEVICE, jSONObject);
        jSONObject2.put(ConnectIQ.EXTRA_STATUS, i14);
        return jSONObject2;
    }

    public static JSONObject c(String str, long j8, byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applicationId", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("deviceIdentifier", j8);
        jSONObject2.put("friendlyName", "");
        JsonArray jsonArray = new JsonArray();
        for (byte b14 : bArr) {
            jsonArray.add(Byte.valueOf(b14));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("action", ConnectIQ.INCOMING_MESSAGE);
        jSONObject3.put(ConnectIQ.EXTRA_REMOTE_APPLICATION, jSONObject);
        jSONObject3.put(ConnectIQ.EXTRA_REMOTE_DEVICE, jSONObject2);
        jSONObject3.put(ConnectIQ.EXTRA_PAYLOAD, jsonArray);
        jSONObject3.put(ConnectIQ.EXTRA_APPLICATION_ID, str);
        return jSONObject3;
    }

    public static JSONObject d(int i14, String str, String str2, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceIdentifier", j8);
        jSONObject.put("friendlyName", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", str);
        jSONObject2.put(ConnectIQ.EXTRA_REMOTE_DEVICE, jSONObject);
        jSONObject2.put(ConnectIQ.EXTRA_APPLICATION_ID, str2);
        jSONObject2.put(ConnectIQ.EXTRA_APPLICATION_VERSION, i14);
        return jSONObject2;
    }

    public static z0 f(Context context) {
        if (f32114c == null) {
            f32114c = new z0(context);
        }
        return f32114c;
    }

    public static JSONObject g(int i14, String str, String str2, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceIdentifier", j8);
        jSONObject.put("friendlyName", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", str);
        jSONObject2.put(ConnectIQ.EXTRA_OPEN_APPLICATION_DEVICE, jSONObject);
        jSONObject2.put(ConnectIQ.EXTRA_OPEN_APPLICATION_ID, str2);
        jSONObject2.put(ConnectIQ.EXTRA_OPEN_APPLICATION_RESULT_CODE, i14);
        return jSONObject2;
    }

    public static JSONObject j(int i14, String str, String str2, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceIdentifier", j8);
        jSONObject.put("friendlyName", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", str);
        jSONObject2.put(ConnectIQ.EXTRA_REMOTE_DEVICE, jSONObject);
        jSONObject2.put(ConnectIQ.EXTRA_APPLICATION_ID, str2);
        jSONObject2.put(ConnectIQ.EXTRA_STATUS, i14);
        return jSONObject2;
    }

    public final ea2.d e(long j8) {
        String strA = u1.a(j8);
        if (!TextUtils.isEmpty(strA)) {
            return (ea2.d) da2.d.c(this.f32117a).getCapability(strA, ea2.d.class);
        }
        i2.i("MonkeybrainsStateManager", "Invalid mac address");
        return null;
    }

    public final c h(long j8, d dVar) {
        for (c cVar : this.f32118b) {
            if (cVar.f32121a == j8 && cVar.f32122b == dVar && !cVar.f32127g) {
                cVar.f32127g = true;
                return cVar;
            }
        }
        return null;
    }

    public final c i(long j8, d dVar, String str) {
        for (c cVar : this.f32118b) {
            if (cVar.f32121a == j8 && cVar.f32122b == dVar && cVar.f32123c.equalsIgnoreCase(str) && !cVar.f32127g) {
                cVar.f32127g = true;
                return cVar;
            }
        }
        return null;
    }

    public final void k(int i14, String str, long j8) {
        c cVarI = i(j8, d.DATA_TRANSFER, str);
        if (cVarI != null) {
            String str2 = cVarI.f32126f;
            ea2.d dVarE = e(j8);
            if (dVarE != null) {
                dVarE.c(cVarI.f32124d);
            }
            int i15 = cVarI.f32124d;
            String str3 = cVarI.f32125e;
            this.f32118b.add(new c(j8, d.CLOSE_CONNECTION, str, i15, str3, cVarI.f32126f, null, false));
            m(cVarI);
            u0.b bVarC = u0.b().c(str);
            if (bVarC != null) {
                String str4 = bVarC.f32033b;
                com.garmin.android.apps.connectmobile.connectiq.c cVar = bVarC.f32034c;
                if (str4.equals(str3)) {
                    cVar.a(this.f32117a, str4);
                    try {
                        String strC = cVar.c(j(i14, str2, str, j8).toString());
                        if (Objects.equals(strC, ConnectIQ.EXTRA_STATUS_SUCCESS)) {
                            return;
                        }
                        i2.i("MonkeybrainsStateManager", "Received failure response from companion app service for message sent for application: " + str + " response: " + strC);
                        cVar.d();
                        return;
                    } catch (InvalidStateException | ServiceUnavailableException unused) {
                        cVar.d();
                        return;
                    } catch (JSONException e4) {
                        cVar.d();
                        o2.c.p(e4);
                        return;
                    }
                }
            }
            Intent intent = new Intent(str2);
            intent.setPackage(str3);
            intent.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j8, ""));
            intent.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str);
            intent.putExtra(ConnectIQ.EXTRA_STATUS, i14);
            GarminConnectMobileApp.f28688j.sendBroadcast(intent);
        }
    }

    public final void l(long j8, d dVar, String str, String str2, String str3, byte[] bArr, boolean z14) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f32118b;
        if (z14) {
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.f32121a == j8 && cVar.f32123c.equalsIgnoreCase(str) && cVar.f32122b == d.OPEN_CONNECTION && cVar.f32130j && !cVar.f32127g) {
                    concurrentLinkedQueue.remove(cVar);
                }
            }
        }
        concurrentLinkedQueue.add(new c(j8, dVar, str, str2, str3, bArr, z14));
    }

    public final void m(c cVar) {
        this.f32118b.remove(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0100, please report this as an issue */
    public final void n(String str, final String str2, long j8, final String str3, byte[] bArr, boolean z14) {
        String str4;
        final long j14;
        String str5;
        String str6;
        String str7;
        Throwable th3;
        final c cVarI;
        final u0.b bVarC;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Context context = this.f32117a;
        f32116e.lock();
        try {
            d dVar = d.OPEN_CONNECTION;
            str4 = str;
            str6 = "MonkeybrainsStateManager";
            try {
                l(j8, dVar, str3, str4, str2, bArr, z14);
                str7 = str3;
                j14 = j8;
                try {
                    HashSet hashSet = f32115d;
                    if (hashSet.contains(Long.valueOf(j14))) {
                        hashSet.add(Long.valueOf(j14));
                    } else {
                        ea2.d dVarE = e(j14);
                        if (dVarE != null) {
                            try {
                                dVarE.b(str7);
                                hashSet.add(Long.valueOf(j14));
                            } catch (Throwable th4) {
                                th3 = th4;
                                str5 = ConnectIQ.EXTRA_STATUS;
                                cVarI = i(j14, d.OPEN_CONNECTION, str7);
                                if (cVarI != null) {
                                    m(cVarI);
                                }
                                bVarC = u0.b().c(str7);
                                if (bVarC != null) {
                                    str10 = bVarC.f32033b;
                                    if (str10.equals(str4)) {
                                        i2.d(str6, "Requesting bind service for device not connected for device: " + j14);
                                        bVarC.f32034c.a(context, str10);
                                        new Thread(new Runnable() { // from class: com.garmin.android.apps.connectmobile.connectiq.v0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                z0.a(this.f32036a, cVarI, str2, j14, str3, bVarC);
                                            }
                                        }).start();
                                    } else {
                                        if (cVarI != null) {
                                            str8 = cVarI.f32126f;
                                        } else {
                                            str8 = str2;
                                        }
                                        Intent intent = new Intent(str8);
                                        if (cVarI != null) {
                                            str9 = cVarI.f32125e;
                                        } else {
                                            str9 = str4;
                                        }
                                        intent.setPackage(str9);
                                        intent.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j14, ""));
                                        intent.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str7);
                                        intent.putExtra(str5, ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal());
                                        GarminConnectMobileApp.f28688j.sendBroadcast(intent);
                                    }
                                } else {
                                    if (cVarI != null) {
                                        str8 = cVarI.f32126f;
                                    } else {
                                        str8 = str2;
                                    }
                                    Intent intent2 = new Intent(str8);
                                    if (cVarI != null) {
                                        str9 = cVarI.f32125e;
                                    } else {
                                        str9 = str4;
                                    }
                                    intent2.setPackage(str9);
                                    intent2.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j14, ""));
                                    intent2.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str7);
                                    intent2.putExtra(str5, ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal());
                                    GarminConnectMobileApp.f28688j.sendBroadcast(intent2);
                                }
                                f32116e.unlock();
                                throw th3;
                            }
                        } else {
                            final c cVarI2 = i(j14, dVar, str7);
                            if (cVarI2 != null) {
                                m(cVarI2);
                            }
                            final u0.b bVarC2 = u0.b().c(str7);
                            if (bVarC2 != null) {
                                String str13 = bVarC2.f32033b;
                                if (str13.equals(str4)) {
                                    i2.d(str6, "Requesting bind service for device not connected for device: " + j14);
                                    bVarC2.f32034c.a(context, str13);
                                    new Thread(new Runnable() { // from class: com.garmin.android.apps.connectmobile.connectiq.v0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z0.a(this.f32036a, cVarI2, str2, j14, str3, bVarC2);
                                        }
                                    }).start();
                                } else {
                                    if (cVarI2 != null) {
                                        str11 = cVarI2.f32126f;
                                    } else {
                                        str11 = str2;
                                    }
                                    Intent intent3 = new Intent(str11);
                                    if (cVarI2 != null) {
                                        str12 = cVarI2.f32125e;
                                    } else {
                                        str12 = str4;
                                    }
                                    intent3.setPackage(str12);
                                    intent3.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j14, ""));
                                    intent3.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str7);
                                    intent3.putExtra(ConnectIQ.EXTRA_STATUS, ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal());
                                    GarminConnectMobileApp.f28688j.sendBroadcast(intent3);
                                }
                            } else {
                                if (cVarI2 != null) {
                                    str11 = cVarI2.f32126f;
                                } else {
                                    str11 = str2;
                                }
                                Intent intent4 = new Intent(str11);
                                if (cVarI2 != null) {
                                    str12 = cVarI2.f32125e;
                                } else {
                                    str12 = str4;
                                }
                                intent4.setPackage(str12);
                                intent4.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j14, ""));
                                intent4.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str7);
                                intent4.putExtra(ConnectIQ.EXTRA_STATUS, ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal());
                                GarminConnectMobileApp.f28688j.sendBroadcast(intent4);
                            }
                        }
                    }
                    f32116e.unlock();
                } catch (Throwable th5) {
                    th = th5;
                    str5 = ConnectIQ.EXTRA_STATUS;
                    th3 = th;
                    cVarI = i(j14, d.OPEN_CONNECTION, str7);
                    if (cVarI != null) {
                        m(cVarI);
                    }
                    bVarC = u0.b().c(str7);
                    if (bVarC != null) {
                        str10 = bVarC.f32033b;
                        if (str10.equals(str4)) {
                            if (cVarI != null) {
                                str8 = cVarI.f32126f;
                            } else {
                                str8 = str2;
                            }
                            Intent intent5 = new Intent(str8);
                            if (cVarI != null) {
                                str9 = cVarI.f32125e;
                            } else {
                                str9 = str4;
                            }
                            intent5.setPackage(str9);
                            intent5.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j14, ""));
                            intent5.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str7);
                            intent5.putExtra(str5, ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal());
                            GarminConnectMobileApp.f28688j.sendBroadcast(intent5);
                        } else {
                            i2.d(str6, "Requesting bind service for device not connected for device: " + j14);
                            bVarC.f32034c.a(context, str10);
                            new Thread(new Runnable() { // from class: com.garmin.android.apps.connectmobile.connectiq.v0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z0.a(this.f32036a, cVarI, str2, j14, str3, bVarC);
                                }
                            }).start();
                        }
                    } else {
                        if (cVarI != null) {
                            str8 = cVarI.f32126f;
                        } else {
                            str8 = str2;
                        }
                        Intent intent6 = new Intent(str8);
                        if (cVarI != null) {
                            str9 = cVarI.f32125e;
                        } else {
                            str9 = str4;
                        }
                        intent6.setPackage(str9);
                        intent6.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(j14, ""));
                        intent6.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str7);
                        intent6.putExtra(str5, ConnectIQ.IQMessageStatus.FAILURE_DEVICE_NOT_CONNECTED.ordinal());
                        GarminConnectMobileApp.f28688j.sendBroadcast(intent6);
                    }
                    f32116e.unlock();
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
                str7 = str3;
                j14 = j8;
            }
        } catch (Throwable th7) {
            th = th7;
            str4 = str;
            j14 = j8;
            str5 = ConnectIQ.EXTRA_STATUS;
            str6 = "MonkeybrainsStateManager";
            str7 = str3;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f32121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f32122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f32124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f32125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f32126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f32127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32128h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f32129i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f32130j;

        public c(long j8, d dVar, String str, int i14, String str2, String str3, byte[] bArr, boolean z14) {
            this.f32127g = false;
            this.f32128h = bArr != null;
            this.f32129i = bArr;
            this.f32121a = j8;
            this.f32123c = str;
            this.f32124d = i14;
            this.f32122b = dVar;
            this.f32125e = str2;
            this.f32126f = str3;
            this.f32130j = z14;
        }

        public c(long j8, d dVar, String str, String str2, String str3, byte[] bArr, boolean z14) {
            this(j8, dVar, str, 0, str2, str3, bArr, z14);
        }
    }
}
