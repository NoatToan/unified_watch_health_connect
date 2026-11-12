package com.duokan.airkan.rc_sdk.airkan;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.duokan.airkan.common.AirkanException;
import com.duokan.airkan.common.aidl.ParcelDeviceData;
import com.duokan.airkan.rc_sdk.airkan.AirkanService;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.ae4;
import defpackage.cpc;
import defpackage.cqc;
import defpackage.h5q;
import defpackage.ikk;
import defpackage.j6q;
import defpackage.jpe;
import defpackage.jzc;
import defpackage.l6q;
import defpackage.m6q;
import defpackage.n6j;
import defpackage.o6j;
import defpackage.pz0;
import defpackage.qz0;
import defpackage.sz0;
import defpackage.z6q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AirkanService extends Service implements cpc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o6j f7040b;
    public List<cpc.b> d;
    public List<n6j> e;
    public List<m6q.k> f;
    public Handler g;
    public qz0 h;
    public j l;
    public l6q m;
    public ConcurrentHashMap<Integer, z6q> n;
    public List<m6q.k> o;
    public com.duokan.airkan.authorization.a p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HandlerThread f7042r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f7039a = new cpc.a(this);
    public final int c = -1;
    public boolean i = false;
    public final boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7041k = null;
    public final i q = new i(this, null);
    public boolean s = true;
    public final int t = 5;
    public final d u = new d(true);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AirkanService.this.q.c != null) {
                AirkanService.this.I("manual disconnected called", false, ae4.e);
                AirkanService.this.q.c.f = false;
                AirkanService.this.q.f7056b = -1;
                AirkanService.this.q.c.g = null;
            }
        }
    }

    public class b implements jzc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cqc f7044a;

        public b(cqc cqcVar) {
            this.f7044a = cqcVar;
        }

        public static /* synthetic */ void d(cqc cqcVar, int i, String str) {
            jpe.f("AirkanService", "checkAuthentication fail");
            cqcVar.a(i, str);
        }

        public static /* synthetic */ void e(cqc cqcVar, String str, String str2, boolean z) {
            jpe.f("AirkanService", "checkAuthentication success");
            cqcVar.b(str, str2, z);
        }

        @Override // defpackage.jzc
        public void a(final String str, final String str2, final boolean z) {
            Handler handler = new Handler(Looper.getMainLooper());
            final cqc cqcVar = this.f7044a;
            handler.post(new Runnable() { // from class: zz0
                @Override // java.lang.Runnable
                public final void run() {
                    AirkanService.b.e(cqcVar, str, str2, z);
                }
            });
        }

        @Override // defpackage.jzc
        public void onFail(final int i, final String str) {
            Handler handler = new Handler(Looper.getMainLooper());
            final cqc cqcVar = this.f7044a;
            handler.post(new Runnable() { // from class: a01
                @Override // java.lang.Runnable
                public final void run() {
                    AirkanService.b.d(cqcVar, i, str);
                }
            });
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                jpe.h("AirkanService", "1111");
                AirkanService.this.O();
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                AirkanService.this.M();
                return;
            }
            Object obj = message.obj;
            if (obj == null) {
                return;
            }
            if (((h) obj).g != null) {
                AirkanService.this.L((h) obj);
            } else if (j.IP.equals(((h) obj).f7053a)) {
                AirkanService.this.K((h) message.obj);
            }
        }
    }

    public class d implements n6j {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AirkanService.this.J();
                AirkanService airkanService = AirkanService.this;
                airkanService.Y(airkanService.q.c.g, 0, null);
                AirkanService.this.q.f7056b = -1;
            }
        }

        public d(boolean z) {
        }

        @Override // defpackage.te4
        public void a(ae4 ae4Var, String str) {
            jpe.a("AirkanService", "onDisconnected  ");
            synchronized (AirkanService.this.e) {
                try {
                    Iterator it = AirkanService.this.e.iterator();
                    while (it.hasNext()) {
                        ((n6j) it.next()).a(ae4Var, AirkanService.this.q.c.g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            jpe.h("AirkanService", "server connect");
            AirkanService airkanService = AirkanService.this;
            airkanService.b0(airkanService.q.c.g, AirkanService.this.T(), AirkanService.this.q.f7056b);
        }

        public void c(ae4 ae4Var) {
            jpe.b("AirkanService", "err " + ae4Var);
            AirkanService.this.I(ae4Var.b(), true, ae4Var);
        }

        @Override // defpackage.te4
        public void onConnected() {
            if (AirkanService.this.g != null) {
                AirkanService.this.g.post(new a());
            }
        }
    }

    public class e implements m6q.k {
        public e() {
        }

        @Override // m6q.k
        public void a(boolean z, boolean z2, int i) {
            jpe.a("AirkanService", "AirkanMilinkOperationConnectListener, onStatusChanged ,is ctrl udt:" + z + ",is connected:" + z2 + ",ip:" + i);
            synchronized (AirkanService.this.o) {
                try {
                    Iterator it = AirkanService.this.o.iterator();
                    while (it.hasNext()) {
                        ((m6q.k) it.next()).a(z, z2, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class f implements m6q.k {
        public f() {
        }

        @Override // m6q.k
        public void a(boolean z, boolean z2, int i) {
            jpe.a("AirkanService", "onStatusChanged ,is ctrl udt:" + z + ",is connected:" + z2 + ",ip:" + i);
            synchronized (AirkanService.this.f) {
                try {
                    Iterator it = AirkanService.this.f.iterator();
                    while (it.hasNext()) {
                        ((m6q.k) it.next()).a(z, z2, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2 || AirkanService.this.R() == i) {
                return;
            }
            AirkanService.this.G();
        }
    }

    public enum g {
        RESUME,
        DEVICES_CHANGE,
        CONNECT_CHANGE,
        MANUAL,
        USER_CHECK
    }

    public enum j {
        NAME,
        MAC,
        IP
    }

    public interface k {
        void a(int i);
    }

    public static /* synthetic */ void V(int i2, k kVar) {
        jpe.f("AirkanService", "onVersionBack " + i2);
        kVar.a(i2);
    }

    public static /* synthetic */ void W(String str, final k kVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://" + str + ":6095/getInfo?action=getVersion").openConnection();
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 404) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yz0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AirkanService.lambda$setAirkanVersion$4(kVar);
                        }
                    });
                    return;
                }
                return;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb.toString();
                        jpe.a("AirkanService", "EncryptResponseData: " + string);
                        JSONObject jSONObject = new JSONObject(string);
                        jSONObject.optInt("status");
                        jSONObject.optString("msg");
                        final int iOptInt = jSONObject.optJSONObject("data").optInt("version");
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: wz0
                            @Override // java.lang.Runnable
                            public final void run() {
                                AirkanService.V(iOptInt, kVar);
                            }
                        });
                        return;
                    }
                    sb.append(line.trim());
                } catch (IOException e2) {
                    jpe.e("AirkanService", "IOException, " + e2.getMessage());
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xz0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AirkanService.lambda$setAirkanVersion$3(kVar);
                        }
                    });
                    return;
                }
            }
        } catch (Exception e3) {
            jpe.b("AirkanService", "Error: Build Request Error, " + e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAirkanVersion$3(k kVar) {
        jpe.h("AirkanService", "IOException");
        kVar.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAirkanVersion$4(k kVar) {
        jpe.h("AirkanService", "HTTP_NOT_FOUND");
        kVar.a(0);
    }

    public final void C(String str) {
    }

    public final void D(g gVar) {
        if (this.q == null) {
            return;
        }
        E(gVar, null);
    }

    public final void E(g gVar, ParcelDeviceData parcelDeviceData) {
        int i2;
        if (gVar == g.CONNECT_CHANGE) {
            i2 = 1000;
        } else {
            if (gVar == g.DEVICES_CHANGE || gVar == g.MANUAL || gVar == g.USER_CHECK) {
                this.q.f7056b = 0;
            }
            i2 = 0;
        }
        F(gVar, parcelDeviceData, i2);
    }

    public final void F(g gVar, final ParcelDeviceData parcelDeviceData, int i2) {
        jpe.a("AirkanService", "check trigger:" + gVar.name() + ",send check message for delaytime:" + i2);
        Handler handler = this.g;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: uz0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36295a.U(parcelDeviceData);
                }
            }, i2);
        } else {
            jpe.a("AirkanService", "work handle is not ready in checkconnect,quit");
        }
    }

    public void G() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeMessages(0);
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            this.g.sendMessageDelayed(messageObtain, 500L);
        }
    }

    public final void H(h hVar, int i2) {
        if (this.g == null || hVar == null) {
            return;
        }
        jpe.a("AirkanService", "work handle is ready ,from:" + i2 + "," + hVar);
        this.g.removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = hVar;
        messageObtain.arg1 = i2;
        this.g.sendMessage(messageObtain);
    }

    public final synchronized void I(String str, boolean z, ae4 ae4Var) {
        try {
            jpe.h("AirkanService", "connectFailed called,reason:" + str + ",reconnectcount:" + this.q.f7056b + ",need check:" + z);
            this.q.f7055a.set(true);
            h hVar = this.q.c;
            if (hVar != null) {
                Y(hVar.g, 1, ae4Var);
                if (z) {
                    this.q.c.f = true;
                    D(g.CONNECT_CHANGE);
                } else {
                    c0();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void J() {
        i iVar = this.q;
        iVar.f7056b = -1;
        iVar.f7055a.set(true);
        jpe.a("AirkanService", "connectSuccess,mConnectedDeviceData == null:");
        G();
    }

    public final void K(h hVar) {
        jpe.a("AirkanService", "connectWithIP  param: connectDevice:" + this.q.f7055a.get() + "  thread:" + Thread.currentThread().getName());
        this.q.f7055a.set(false);
        i iVar = this.q;
        iVar.f7056b = iVar.f7056b + 1;
        b0(hVar.g, T(), this.q.f7056b);
        String strH = this.f7040b.h();
        jpe.a("AirkanService", "connectWithIP  connectDeviceIP:" + strH + "  paramIP:" + hVar.d);
        if (hVar.d.equals(strH)) {
            boolean zI = this.f7040b.i();
            boolean zJ = this.f7040b.j();
            if (zI) {
                this.q.f7055a.set(true);
                i iVar2 = this.q;
                iVar2.f7056b = -1;
                Z(iVar2.c.g, 0, true, null);
                jpe.h("AirkanService", " connected ip:" + strH);
                return;
            }
            if (zJ) {
                jpe.h("AirkanService", " connecting ip:" + strH);
                return;
            }
        }
        i iVar3 = this.q;
        iVar3.c = hVar;
        if (iVar3.f7056b >= 5) {
            ae4 ae4Var = ae4.c;
            I(ae4Var.b(), false, ae4Var);
            this.q.f7056b = -1;
            return;
        }
        jpe.a("AirkanService", "current connect param valid ,start to connect for :" + hVar);
        if (this.q.f7056b > -1) {
            C(hVar.d);
        }
        this.f7040b.f(hVar.d, hVar.c);
    }

    public final void L(h hVar) {
        jpe.a("AirkanService", "connectWithRealDevice  param: connectDevice:" + this.q.f7055a.get() + "  thread:" + Thread.currentThread().getName());
        this.q.f7055a.set(false);
        i iVar = this.q;
        iVar.f7056b = iVar.f7056b + 1;
        b0(hVar.g, T(), this.q.f7056b);
        String strH = this.f7040b.h();
        jpe.a("AirkanService", "connectWithRealDevice  connectDeviceIP:" + strH + "  paramIP:" + hVar);
        if (hVar.g.equals(strH)) {
            boolean zI = this.f7040b.i();
            boolean zJ = this.f7040b.j();
            if (zI) {
                this.q.f7055a.set(true);
                i iVar2 = this.q;
                iVar2.f7056b = -1;
                Z(iVar2.c.g, 0, true, null);
                jpe.h("AirkanService", " connected ip:" + strH);
                return;
            }
            if (zJ) {
                jpe.h("AirkanService", " connecting ip:" + strH);
                return;
            }
        }
        i iVar3 = this.q;
        iVar3.c = hVar;
        if (iVar3.f7056b >= 5) {
            ae4 ae4Var = ae4.c;
            I(ae4Var.b(), false, ae4Var);
            this.q.f7056b = -1;
            return;
        }
        jpe.a("AirkanService", "current connect param valid ,start to connect for :" + hVar);
        if (this.q.f7056b > -1) {
            C(hVar.g);
        }
        this.f7040b.f(hVar.g, hVar.c);
    }

    public final synchronized void M() {
        try {
            if (this.q.c != null) {
                Iterator<Map.Entry<Integer, z6q>> it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    N(it.next().getValue());
                }
            } else {
                jpe.h("AirkanService", "connectUDT failed,data is null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void N(z6q z6qVar) {
        boolean z;
        boolean z2;
        jpe.h("AirkanService", "createUDTConnection.");
        try {
            Iterator<j6q> it = z6qVar.v().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                j6q next = it.next();
                if (next != null) {
                    if (next.b() == h5q.c(this.q.c.g)) {
                        z2 = true;
                        break;
                    }
                    jpe.h("AirkanService", "remove udt ctrl connect ip: " + next.b());
                    z6qVar.F(next, true);
                }
            }
            Iterator<j6q> it2 = z6qVar.w().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                j6q next2 = it2.next();
                if (next2 != null) {
                    if (next2.b() == h5q.c(this.q.c.g)) {
                        break;
                    }
                    jpe.h("AirkanService", "remove udt data connect ip: " + next2.b());
                    z6qVar.F(next2, false);
                }
            }
            if (!z2 && !z) {
                jpe.h("AirkanService", "both udt ctrl and data udt are not connected  for:" + this.q.c.d);
                z6qVar.K(this.q.c.g);
                return;
            }
            if (!z2) {
                z6qVar.M(this.q.c.g);
                jpe.h("AirkanService", "udt ctrl connect for " + this.q.c.g);
                return;
            }
            if (z) {
                return;
            }
            z6qVar.O(this.q.c.g);
            jpe.h("AirkanService", "udt data connect for " + this.q.c.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final synchronized void O() {
        boolean z;
        boolean z2;
        try {
            if (this.q.c != null) {
                Iterator<j6q> it = this.m.t().iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    j6q next = it.next();
                    if (next != null) {
                        if (next.b() == h5q.c(this.q.c.g)) {
                            z2 = true;
                            break;
                        }
                        jpe.h("AirkanService", "remove udt ctrl connect ip: " + next.b());
                        this.m.B(next, true);
                    }
                }
                Iterator<j6q> it2 = this.m.u().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    j6q next2 = it2.next();
                    if (next2 != null) {
                        if (next2.b() == h5q.c(this.q.c.g)) {
                            break;
                        }
                        jpe.h("AirkanService", "remove udt data connect ip: " + next2.b());
                        this.m.B(next2, false);
                    }
                }
                if (!z2 && !z) {
                    jpe.h("AirkanService", "both udt ctrl and data udt are not connected  for:" + this.q.c);
                    this.m.F(this.q.c.g);
                } else if (!z2) {
                    this.m.H(this.q.c.g);
                } else if (!z) {
                    this.m.J(this.q.c.g);
                    jpe.h("AirkanService", "udt data connect for " + this.q.c.g);
                }
            } else {
                jpe.h("AirkanService", "connectUDT failed,data is null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void P() {
        HandlerThread handlerThread = new HandlerThread("connect");
        this.f7042r = handlerThread;
        handlerThread.start();
        this.g = new c(this.f7042r.getLooper());
    }

    public final void Q() {
    }

    public final synchronized int R() {
        h hVar = this.q.c;
        if (hVar == null) {
            return 0;
        }
        return h5q.c(hVar.g);
    }

    public synchronized boolean S() {
        boolean z;
        try {
            o6j o6jVar = this.f7040b;
            z = o6jVar != null && o6jVar.i();
            jpe.a("AirkanService", "isConnected:" + z);
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final boolean T() {
        return this.q.f7056b == 4;
    }

    public final /* synthetic */ void U(ParcelDeviceData parcelDeviceData) {
        Q();
        if (!X()) {
            jpe.a("AirkanService", "start check connect in handle runable auto:false device:" + parcelDeviceData + " connectDevice:" + this.q);
            return;
        }
        jpe.a("AirkanService", "start check connect in handle runable auto:true device:" + parcelDeviceData + " connectDevice:" + this.q);
        h hVar = this.q.c;
        hVar.f = true;
        H(hVar, 2);
        jpe.h("AirkanService", " checkConnect reconnect");
    }

    public final boolean X() {
        h hVar = this.q.c;
        if (hVar == null || TextUtils.isEmpty(hVar.g)) {
            jpe.a("AirkanService", "mReconnectDeviceName is null,not send reconnect msg");
            return false;
        }
        String strH = this.f7040b.h();
        if (!TextUtils.isEmpty(this.q.c.g) && this.q.c.g.equals(strH)) {
            jpe.a("AirkanService", " device in connect state");
            return false;
        }
        if (!this.q.c.f) {
            jpe.a("AirkanService", "reconnect flag is false,not send reconnect msg");
            return false;
        }
        if (S()) {
            jpe.a("AirkanService", "has connected,need not reconnect");
            return false;
        }
        if (!T()) {
            return true;
        }
        jpe.a("AirkanService", "is lastReconnect, no need reconnect");
        return false;
    }

    public final void Y(String str, int i2, ae4 ae4Var) {
        Z(str, i2, true, ae4Var);
    }

    public final void Z(String str, int i2, boolean z, ae4 ae4Var) {
        a0(str, i2, z, ae4Var, this.q.f7056b);
    }

    @Override // defpackage.cpc
    public qz0 a() {
        return this.h;
    }

    public final void a0(String str, int i2, boolean z, ae4 ae4Var, int i3) {
        jpe.a("AirkanService", "notifyAirkanConnectResult called,ip:" + str + ",code:" + i2 + ",need notify:" + z + ",reconnect count:" + this.q.f7056b + " err:" + ae4Var);
        if (z && i2 == 0) {
            synchronized (this.e) {
                try {
                    Iterator<n6j> it = this.e.iterator();
                    while (it.hasNext()) {
                        it.next().onConnected();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AirkanConnectListener end,count:");
        sb.append(this.d.size());
        sb.append("  connected:");
        sb.append(i2 == 0);
        jpe.a("AirkanService", sb.toString());
        synchronized (this.d) {
            try {
                for (cpc.b bVar : this.d) {
                    bVar.b(str, i2 == 0, i3, T(), ae4Var);
                    jpe.a("AirkanService", " notifyAirkanConnectResult   instance: " + bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jpe.a("AirkanService", " notifyAirkanConnectResult   end");
    }

    @Override // defpackage.cpc
    public void b(final String str, final k kVar) {
        sz0.i(this);
        pz0.a(new Runnable() { // from class: vz0
            @Override // java.lang.Runnable
            public final void run() {
                AirkanService.W(str, kVar);
            }
        });
    }

    public final void b0(String str, boolean z, int i2) {
        synchronized (this.d) {
            try {
                for (cpc.b bVar : this.d) {
                    bVar.a(str, i2, z);
                    jpe.a("AirkanService", " notifyConnectStart   instance: " + bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cpc
    public void c() {
        jpe.f("AirkanService", "disconnected");
        try {
            o6j o6jVar = this.f7040b;
            if (o6jVar != null) {
                o6jVar.g();
                this.f7040b.k();
                this.f7040b = null;
            }
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final synchronized void c0() {
        this.q.c.g = null;
    }

    @Override // defpackage.cpc
    public void d(String str, boolean z) {
        jpe.h("AirkanService", "ip: " + str);
        o6j o6jVar = this.f7040b;
        if (o6jVar != null) {
            o6jVar.setRCEventListener(null);
            this.f7040b.k();
        }
        o6j o6jVar2 = new o6j(getPackageName());
        this.f7040b = o6jVar2;
        o6jVar2.setRCEventListener(this.u);
        this.q.f7056b = -1;
        H(new h(this, j.IP, str), 2);
    }

    @Override // defpackage.cpc
    public void e(String str, String str2, String str3, String str4, ikk ikkVar) {
        jpe.f("AirkanService", "completeAuthority");
        com.duokan.airkan.authorization.a aVar = new com.duokan.airkan.authorization.a(this, str, str2, str3, str4, ikkVar);
        this.p = aVar;
        aVar.n();
    }

    @Override // defpackage.cpc
    public void f(String str, cqc cqcVar) {
        try {
            this.h = qz0.i(str);
            this.h.j(new b(cqcVar));
        } catch (Exception e2) {
            jpe.e("AirkanService", "exception:" + e2);
        }
    }

    @Override // defpackage.cpc
    public int g(int i2, int i3) {
        if (!S()) {
            return -1001;
        }
        try {
            return this.f7040b.l(new KeyEvent(i2, i3), "");
        } catch (AirkanException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    @Override // defpackage.cpc
    public void h() {
        if (this.p != null) {
            sz0.o();
            this.p.i();
            this.p.h = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Bundle extras;
        Bundle extras2;
        if (this.i) {
            jpe.h("AirkanService", "onBind,need not create devicemanager");
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appID")) {
                int i2 = extras.getInt("appID");
                jpe.h("AirkanService", "appID = " + i2);
                z6q z6qVar = new z6q(this, i2);
                this.n.put(Integer.valueOf(i2), z6qVar);
                z6qVar.A();
                z6qVar.J(new e());
            }
        } else {
            this.i = true;
            jpe.h("AirkanService", "onBind,create devicemanager");
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                if (extras2.containsKey("appID")) {
                    int i3 = extras2.getInt("appID");
                    jpe.h("AirkanService", "appID = " + i3);
                    this.n.put(Integer.valueOf(i3), new z6q(this, i3));
                }
                this.f7041k = extras2.getString("extra");
                jpe.h("AirkanService", "mExtra1: " + this.f7041k);
            }
        }
        return this.f7039a;
    }

    @Override // android.app.Service
    public void onCreate() {
        jpe.f("AirkanService", "onCreate");
        P();
        this.n = new ConcurrentHashMap<>();
        this.l = j.MAC;
        this.d = Collections.synchronizedList(new ArrayList());
        this.e = Collections.synchronizedList(new ArrayList());
        this.f = Collections.synchronizedList(new ArrayList());
        l6q l6qVar = new l6q(this);
        this.m = l6qVar;
        l6qVar.E(new f());
        this.m.x();
        this.o = Collections.synchronizedList(new ArrayList());
    }

    @Override // android.app.Service
    public void onDestroy() {
        jpe.f("AirkanService", LifecycleConstantKt.ON_DESTROY);
        this.m.y();
        try {
            o6j o6jVar = this.f7040b;
            if (o6jVar != null) {
                o6jVar.setRCEventListener(null);
                this.f7040b.k();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        for (Map.Entry<Integer, z6q> entry : this.n.entrySet()) {
            jpe.h("AirkanService", "tmpEntry.getKey()");
            entry.getValue().B();
        }
        this.i = false;
        HandlerThread handlerThread = this.f7042r;
        if (handlerThread != null) {
            handlerThread.quit();
            Handler handler = this.g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.g = null;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }

    @Override // defpackage.cpc
    public void registeOnRCEventListener(n6j n6jVar) {
        if (this.e.contains(n6jVar)) {
            return;
        }
        this.e.add(n6jVar);
        jpe.j("AirkanService", "register OnRCEventListener:" + n6jVar);
    }

    @Override // defpackage.cpc
    public void registeonAirkanConnectListener(cpc.b bVar) {
        if (this.d.contains(bVar)) {
            return;
        }
        this.d.add(bVar);
        jpe.j("AirkanService", "register OnAirkanConnectListener:");
    }

    @Override // defpackage.cpc
    public void unregisteOnRCEventListener(n6j n6jVar) {
        if (this.e.contains(n6jVar)) {
            this.e.remove(n6jVar);
            jpe.j("AirkanService", "unregister OnRCEventListener:" + n6jVar);
        }
    }

    @Override // defpackage.cpc
    public void unregisteonAirkanConnectListener(cpc.b bVar) {
        if (this.d.contains(bVar)) {
            this.d.remove(bVar);
            jpe.j("AirkanService", "unregister OnAirkanConnectListener:");
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicBoolean f7055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7056b;
        public h c;

        public i() {
            this.f7055a = new AtomicBoolean(true);
            this.f7056b = -1;
        }

        public String toString() {
            return "ConnectDevice{conPorgressOver=" + this.f7055a + ", reconnectCount=" + this.f7056b + ", param=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }

        public /* synthetic */ i(AirkanService airkanService, a aVar) {
            this();
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f7053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f7054b;
        public int c;
        public String d;
        public boolean e;
        public boolean f;
        public String g;

        public h(j jVar, int i, String str, boolean z, boolean z2) {
            this.f7053a = jVar;
            this.c = i;
            this.d = str;
            this.e = z;
            this.f = z2;
            this.f7054b = jVar;
            if (j.IP.equals(jVar)) {
                this.g = str;
            }
        }

        public String toString() {
            return "ConnectDataParam{keyType=" + this.f7053a + ", originKeyType=" + this.f7054b + ", port=" + this.c + ", device='" + this.d + "', valid=" + this.e + ", reconnect=" + this.f + AbstractJsonLexerKt.END_OBJ;
        }

        public h(AirkanService airkanService, j jVar, String str) {
            this(jVar, 6091, str, false, false);
        }
    }
}
