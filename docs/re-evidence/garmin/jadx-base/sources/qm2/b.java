package qm2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import bd0.c0;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.PairingException;
import d53.u;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import sm2.w;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\tB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lqm2/b;", "", "Lrm2/b;", "Landroid/content/Context;", "mContext", "mBtcSetupListener", "<init>", "(Landroid/content/Context;Lrm2/b;)V", "a", "b", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
public final class b {
    public static final a A = new a(null);
    public static final Logger B = LoggerFactory.getLogger("PAIR#BtcDeviceStrategy");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm2.b f145657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2.g f145658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f145659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f145660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f145661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EnumC2745b f145662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f145663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f145664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f145665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f145666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public vm2.b f145667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Timer f145668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Timer f145669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BluetoothDevice f145670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public yl2.b f145671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bm2.f f145672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public bm2.d f145673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f145674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public bm2.d f145675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fm2.d f145676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f145677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f145678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f145679x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f145680y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f145681z;

    /* JADX INFO: renamed from: qm2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm2/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum EnumC2745b {
        NOT_STARTED,
        RUNNING,
        COMPLETED,
        CANCELLED
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm2/b$c", "Landroid/content/BroadcastReceiver;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:54:0x012e  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z14;
            boolean z15;
            context.getClass();
            intent.getClass();
            String action = intent.getAction();
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                vm2.f.a aVar = vm2.f.f178828a;
                Logger logger = b.B;
                logger.getClass();
                Bundle extras = intent.getExtras();
                aVar.getClass();
                StringBuilder sbL = hb.a.l(StringUtils.SPACE, action, ":");
                if (extras == null) {
                    sbL.append("no extras");
                } else {
                    for (String str : extras.keySet()) {
                        sbL.append("\n  ");
                        Object obj = extras.get(str);
                        if (obj != null) {
                            x0 x0Var = x0.f105818a;
                            sbL.append(String.format("%s (%s) (%s)", Arrays.copyOf(new Object[]{str, obj.toString(), obj.getClass().getName()}, 3)));
                        }
                    }
                }
                logger.debug("#receivedBroadcast" + ((Object) sbL));
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                b bVar = b.this;
                BluetoothDevice bluetoothDevice2 = bVar.f145670o;
                String address = bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null;
                if (bluetoothDevice == null || address == null || !u.q(bluetoothDevice.getAddress(), address, true)) {
                    return;
                }
                bVar.f145670o = bluetoothDevice;
                switch (intExtra) {
                    case 10:
                        Logger logger2 = b.B;
                        logger2.debug("Bond state changed to NONE");
                        if (intExtra2 == 12) {
                            bVar.p(false);
                            return;
                        }
                        synchronized (bVar.f145661f) {
                            try {
                                z14 = bVar.f145665j;
                                if (!z14 && !bVar.f145663h && Build.VERSION.SDK_INT < 33) {
                                    z15 = false;
                                } else if (bVar.f145664i < 1) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    bVar.f145664i++;
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (!z15) {
                            logger2.debug("Failed to bond. User cancelled confirmation or device is no longer communicating");
                            bVar.n(yl2.e.ABORTED, "Unable to BTC bond");
                            return;
                        }
                        boolean z16 = bVar.f145663h;
                        int i14 = Build.VERSION.SDK_INT;
                        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Auto retry bonding: removedBond[", "], retry[", "], sdk[", z14, z16);
                        sbM.append(i14);
                        sbM.append("]");
                        logger2.debug(sbM.toString());
                        bVar.p(false);
                        return;
                    case 11:
                        b.B.debug("Bond state changed to BONDING");
                        return;
                    case 12:
                        synchronized (bVar.f145661f) {
                            bVar.f145665j = false;
                            bVar.f145664i = 0;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        Logger logger3 = b.B;
                        logger3.debug("Bond state changed to BONDED");
                        logger3.debug("onDeviceBonded: " + bluetoothDevice.getName() + "/" + bluetoothDevice.getAddress());
                        bVar.b();
                        bVar.m(k.AUTHENTICATED);
                        return;
                    default:
                        z.i("Bond state changed to ", intExtra, b.B);
                        return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm2/b$d", "Llm2/d;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements lm2.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f145688a;

        public d() {
        }

        @Override // com.garmin.android.gfdi.AuthRegistry.Callback
        public final void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            str.getClass();
            bArr.getClass();
            bArr2.getClass();
            bArr3.getClass();
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            String strF;
            String strD;
            if (b.a(b.this).contains(bVar.f111632a.getF172493a())) {
                b bVar2 = b.this;
                bm2.d dVar = new bm2.d(bVar.f111632a);
                bVar2.getClass();
                Logger logger = b.B;
                StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(dVar.getF172494b(), "onHandshakeComplete(", ", ", dVar.f());
                sbK.append(")");
                logger.info(sbK.toString());
                bVar2.b();
                bVar2.c();
                int f172495c = dVar.getF172495c();
                HashMap map = yl2.b.B6;
                yl2.b bVar3 = (yl2.b) map.get(String.valueOf(f172495c));
                if (bVar3 != null && bVar2.f145671p != bVar3) {
                    bVar2.f145671p = bVar3;
                }
                if (dVar.getConnectionType() == 2) {
                    bVar2.f145678w = true;
                    yl2.b bVar4 = (yl2.b) map.get(String.valueOf(dVar.getF172495c()));
                    bm2.f fVar = bVar2.f145672q;
                    if (fVar == null || bVar4 != map.get(fVar.getPartNumberPartial().toString())) {
                        lm2.i iVarF = lm2.h.f();
                        dVar.getF172494b();
                        ((im2.c) iVarF).e(String.valueOf(dVar.getF172495c()), null, new qm2.c(bVar2, dVar));
                    } else {
                        bVar2.f145657b.W(dVar, bVar2.f145672q);
                    }
                }
                if (dVar.getF172498f() && dVar.getConnectionType() != 1 && (strD = dVar.d()) != null && strD.length() != 0) {
                    bVar2.f145675t = dVar;
                    ((fm2.c) bVar2.f145658c).j(dVar);
                    bVar2.f145677v = 0;
                    String strD2 = dVar.d();
                    strD2.getClass();
                    bVar2.o(strD2);
                    return;
                }
                bVar2.f145673r = dVar;
                bm2.f fVar2 = bVar2.f145672q;
                if (fVar2 != null) {
                    fVar2.b(dVar.getF172494b());
                }
                logger.info("onHandshakeFullyComplete");
                bm2.d dVar2 = bVar2.f145673r;
                if (dVar2 == null) {
                    bm2.d dVar3 = bVar2.f145675t;
                    String strF2 = dVar3 != null ? dVar3.f() : null;
                    if (strF2 != null && strF2.length() != 0) {
                        bVar2.l(k.CONNECTING_FAILURE, yl2.e.DEVICE_INFO_OBJ_NULL);
                    }
                    bVar2.n(yl2.e.DEVICE_INFO_OBJ_NULL, null);
                    return;
                }
                bVar2.m(k.CONNECTING_SUCCESS);
                String strH = bVar2.h();
                if (strH != null) {
                    logger.info("Sending milestone PAIR_START (GFDI #5030 option 3) to remote device");
                    fm2.c cVar = (fm2.c) bVar2.f145658c;
                    cVar.getClass();
                    cVar.p(da2.j.STARTED, strH, null, null);
                }
                bVar2.k(dVar2);
                bm2.d dVar4 = bVar2.f145675t;
                if (dVar4 != null) {
                    bVar2.k(dVar4);
                }
                bm2.d dVar5 = bVar2.f145675t;
                if (dVar5 == null || (strF = dVar5.f()) == null) {
                    strF = dVar2.f();
                    strF.getClass();
                }
                String str = strF;
                bVar2.m(k.RETRIEVING_GARMIN_DEVICE_XML);
                synchronized (bVar2.f145661f) {
                    try {
                        w wVar = bVar2.f145666k;
                        if (wVar != null) {
                            wVar.b();
                        }
                        w wVar2 = new w(logger, str, new qm2.e(bVar2), 1, true);
                        bVar2.f145666k = wVar2;
                        wVar2.c();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
            la2.i iVar = cVar.f111634b;
            b bVar = b.this;
            ArrayList arrayListA = b.a(bVar);
            String str = cVar.f111633a;
            if (arrayListA.contains(str)) {
                if (cVar.a()) {
                    bVar.n(yl2.e.BAD_BLUETOOTH, iVar.name());
                    return;
                }
                yl2.e eVar = cVar.b() ? yl2.e.CONNECTION_TIMED_OUT : yl2.e.CONNECTION_FAILURE;
                BluetoothDevice bluetoothDevice = bVar.f145670o;
                if (str.equals(bluetoothDevice != null ? bluetoothDevice.getAddress() : null)) {
                    bVar.f145678w = false;
                    bVar.n(eVar, "BTC: " + iVar);
                    return;
                }
                if (bVar.f145674s != null) {
                    b.B.error("Failed BLE handshake: " + eVar + " - " + iVar);
                    if (s.g(bVar.f145674s, str)) {
                        bVar.f145681z.f145688a = true;
                        ((fm2.c) bVar.f145658c).d(0L, bVar.f145674s, true);
                        ge1.b.T(bVar.f145660e, null, null, new qm2.d(bVar, str, eVar, iVar, null), 3);
                    }
                }
            }
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            b bVar = b.this;
            ArrayList arrayListA = b.a(bVar);
            DeviceProfile deviceProfile = hVar.f111673a;
            if (arrayListA.contains(deviceProfile.getF172493a())) {
                String f172493a = deviceProfile.getF172493a();
                f172493a.getClass();
                if (!s.g(bVar.f145674s, f172493a)) {
                    BluetoothDevice bluetoothDevice = bVar.f145670o;
                    if (s.g(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, f172493a)) {
                        bVar.n(yl2.e.DISCONNECTION, "BTC Disconnected");
                        return;
                    } else {
                        bVar.n(yl2.e.DISCONNECTION, null);
                        return;
                    }
                }
                int i14 = hVar.f111674b;
                if (this.f145688a) {
                    b.B.warn("Ignore extra disconnect from previous attempt: " + i14);
                    return;
                }
                bVar.n(yl2.e.DISCONNECTION, "Gatt Status: " + i14);
            }
        }

        @Override // com.garmin.android.gfdi.AuthRegistry.Callback
        public final void onPasskeyRequired(String str, int i14) {
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm2/b$e", "Ljava/util/TimerTask;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f145691b;

        public e(String str) {
            this.f145691b = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a aVar = b.A;
            b bVar = b.this;
            bVar.c();
            BluetoothDevice bluetoothDevice = bVar.f145670o;
            if (!s.g(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, this.f145691b)) {
                bVar.n(yl2.e.CONNECTION_TIMED_OUT, "BLE Handshake timed out");
            } else {
                bVar.f145678w = false;
                bVar.n(yl2.e.CONNECTION_TIMED_OUT, "BTC Handshake timed out");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"qm2/b$f", "Llm2/i$b;", "Lorg/json/JSONObject;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements lm2.i.b<JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bm2.d f145692a;

        public f(bm2.d dVar) {
            this.f145692a = dVar;
        }

        @Override // lm2.i.b
        public final void a(JSONObject jSONObject) {
            com.airbnb.lottie.animation.keyframe.a.u("updateBtConnectionInfo(", this.f145692a.f(), ") - Success", b.B);
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            th3.getClass();
            b.B.error("updateBtConnectionInfo(" + this.f145692a.f() + ")", th3);
        }
    }

    public b(Context context, rm2.b bVar) {
        context.getClass();
        bVar.getClass();
        this.f145656a = context;
        this.f145657b = bVar;
        this.f145658c = lm2.h.c();
        x53.c cVar = s0.f129406a;
        this.f145660e = zl.a.e("BtcDeviceStrategy", x53.b.f189152a.plus(ge1.b.h()));
        this.f145661f = new byte[0];
        this.f145662g = EnumC2745b.NOT_STARTED;
        this.f145680y = new c();
        this.f145681z = new d();
    }

    public static final ArrayList a(b bVar) {
        bVar.getClass();
        HashSet hashSet = new HashSet();
        BluetoothDevice bluetoothDevice = bVar.f145670o;
        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        if (address != null && address.length() != 0) {
            BluetoothDevice bluetoothDevice2 = bVar.f145670o;
            hashSet.add(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null);
        }
        String str = bVar.f145674s;
        if (str != null && str.length() != 0) {
            hashSet.add(bVar.f145674s);
        }
        return h0.Z(hashSet);
    }

    public static void e(bm2.d dVar) {
        if (dVar == null || dVar.getF172495c() <= 0) {
            return;
        }
        new sm2.e(dVar, ((c0) lm2.h.d()).b(String.valueOf(dVar.getF172495c()))).c();
    }

    public final void b() {
        synchronized (this.f145661f) {
            try {
                if (this.f145668m != null) {
                    B.debug("cancelBondRemovalTimer");
                    Timer timer = this.f145668m;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this.f145668m = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f145661f) {
            try {
                if (this.f145669n != null) {
                    B.debug("cancelHandshakeTimer");
                    Timer timer = this.f145669n;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this.f145669n = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d() {
        synchronized (this.f145661f) {
            try {
                b();
                c();
                w wVar = this.f145666k;
                if (wVar != null) {
                    wVar.b();
                }
                this.f145666k = null;
                r(this.f145656a);
                vm2.b bVar = this.f145667l;
                if (bVar != null) {
                    bVar.cancel();
                }
                if (this.f145667l != null && this.f145662g == EnumC2745b.CANCELLED) {
                    B.debug("Cancelled after starting register call. Calling GC to remove device.");
                    ((im2.c) lm2.h.f()).l(i(), true, null);
                }
                this.f145667l = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f() {
        B.debug("deleteDeviceFromDB");
        bm2.d dVar = this.f145673r;
        if (dVar == null) {
            dVar = this.f145675t;
        }
        if (dVar != null) {
            lm2.f fVarE = lm2.h.e();
            ((em2.d) fVarE).g(this.f145656a, dVar.getF172494b(), String.valueOf(dVar.getF172495c()), null);
        }
    }

    public final void g() {
        BluetoothDevice bluetoothDevice = this.f145670o;
        lm2.g gVar = this.f145658c;
        Logger logger = B;
        if (bluetoothDevice != null) {
            logger.warn("disconnect(" + (bluetoothDevice != null ? bluetoothDevice.getAddress() : null) + ")");
            long jI = i();
            BluetoothDevice bluetoothDevice2 = this.f145670o;
            ((fm2.c) gVar).d(jI, bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null, true);
        }
        String str = this.f145674s;
        if (str != null) {
            logger.warn("disconnect(" + str + ")");
            ((fm2.c) gVar).d(i(), this.f145674s, true);
        }
    }

    public final String h() {
        String strF;
        bm2.d dVar = this.f145673r;
        if (dVar != null && (strF = dVar.f()) != null) {
            return strF;
        }
        String strF2 = this.f145674s;
        if (strF2 == null) {
            bm2.d dVar2 = this.f145675t;
            strF2 = dVar2 != null ? dVar2.f() : null;
            if (strF2 == null) {
                BluetoothDevice bluetoothDevice = this.f145670o;
                if (bluetoothDevice != null) {
                    return bluetoothDevice.getAddress();
                }
                return null;
            }
        }
        return strF2;
    }

    public final long i() {
        bm2.d dVar = this.f145673r;
        if (dVar != null) {
            return dVar.getF172494b();
        }
        bm2.d dVar2 = this.f145675t;
        if (dVar2 != null) {
            return dVar2.getF172494b();
        }
        return -1L;
    }

    public final void j(Context context) {
        synchronized (this.f145661f) {
            try {
                if (!this.f145679x) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                    context.registerReceiver(this.f145680y, intentFilter);
                    this.f145679x = true;
                    B.debug("registerBroadcastReceivers: receivers registered");
                }
                ((fm2.c) this.f145658c).a(this.f145681z);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(bm2.d dVar) {
        fm2.d dVarF;
        String str = "saveDeviceToLocalDB(" + dVar.f() + ")";
        Logger logger = B;
        logger.debug(str);
        if (dVar.getConnectionType() == 1) {
            String strF = dVar.f();
            strF.getClass();
            if (strF.length() == 0) {
                vb.h.s("retrieveGarminBleAuth: BLE MAC address is empty!");
                return;
            }
            com.airbnb.lottie.animation.keyframe.a.u("retrieveGarminBleAuth(", strF, ")", logger);
            dVarF = ((fm2.c) this.f145658c).f(strF);
            if (dVarF != null) {
                da2.a aVar = dVarF.f72131a;
                byte[] bArr = aVar.f58872c;
                byte[] bArr2 = aVar.f58873d;
                byte[] bArr3 = aVar.f58871b;
                if (bArr == null || bArr2 == null || bArr3 == null) {
                    logger.debug("retrieveGarminBleAuth: Garmin auth does not exist");
                } else {
                    logger.debug("retrieveGarminBleAuth: Garmin auth exists");
                }
                this.f145676u = dVarF;
            } else {
                logger.warn("retrieveGarminBleAuth: Garmin BLE Auth information is not saved for ".concat(strF));
            }
            dVarF = null;
            this.f145676u = dVarF;
        } else {
            dVarF = null;
        }
        lm2.f fVarE = lm2.h.e();
        bm2.f fVar = this.f145672q;
        ((em2.d) fVarE).c(dVar, fVar != null ? fVar.getApplicationKey() : null, dVarF != null ? dVarF.f72131a.f58872c : null, dVarF != null ? dVarF.f72131a.f58873d : null, dVarF != null ? dVarF.f72131a.f58871b : null);
    }

    public final void l(k kVar, yl2.e eVar) {
        String strH = h();
        if (strH == null) {
            return;
        }
        B.debug("sendPairingFailure: Sending milestone PAIR_FAIL (GFDI #5030 option 5) to remote device");
        String strName = kVar != null ? kVar.name() : null;
        fm2.c cVar = (fm2.c) this.f145658c;
        cVar.getClass();
        cVar.p(da2.j.FINISHED_WITH_FAILURE, strH, eVar, strName);
    }

    public final void m(k kVar) {
        this.f145657b.v(kVar);
    }

    public final void n(yl2.e eVar, String str) {
        synchronized (this.f145661f) {
            if (this.f145662g == EnumC2745b.RUNNING) {
                bm2.d dVar = this.f145673r;
                if (!((dVar == null || ((em2.d) lm2.h.e()).f(dVar).f128594a == null) ? false : true)) {
                    this.f145662g = EnumC2745b.COMPLETED;
                    B.error("***** BTC PAIRING FAILED ***** - " + eVar + " - " + str);
                    d();
                    f();
                    g();
                    Unit unit = Unit.INSTANCE;
                    PairingException pairingException = new PairingException(eVar, str);
                    yb2.b.a aVar = lm2.h.f113624g;
                    if (aVar != null) {
                        bm2.f fVar = this.f145672q;
                        bm2.d dVar2 = this.f145673r;
                        if (dVar2 == null) {
                            dVar2 = this.f145675t;
                        }
                        aVar.a(fVar, dVar2, pairingException);
                    }
                    this.f145657b.C(pairingException);
                    return;
                }
            }
            B.warn("setupFailed when strategy is " + this.f145662g + ": " + eVar);
        }
    }

    public final boolean o(String str) {
        int i14;
        if (str == null || str.length() == 0 || (i14 = this.f145677v) >= 2) {
            return false;
        }
        this.f145674s = str;
        this.f145681z.f145688a = false;
        this.f145677v = i14 + 1;
        q(str);
        B.info("Start connection to BLE link ".concat(str));
        fm2.c cVar = (fm2.c) this.f145658c;
        cVar.getClass();
        da2.d.c(cVar.g()).f58886a.c(new da2.a(str, true), true);
        return true;
    }

    public final void p(boolean z14) {
        String address;
        BluetoothDevice bluetoothDevice;
        m(k.AUTHENTICATING);
        BluetoothDevice bluetoothDevice2 = this.f145670o;
        q(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null);
        Logger logger = B;
        BluetoothDevice bluetoothDevice3 = this.f145670o;
        logger.info("startDeviceBonding: " + (bluetoothDevice3 != null ? bluetoothDevice3.getAddress() : null) + " shouldRemoveBond: " + z14);
        if (z14 && (bluetoothDevice = this.f145670o) != null && bluetoothDevice.getBondState() == 12) {
            if (Build.VERSION.SDK_INT >= 33) {
                logger.info("Device is already bonded , Not removing bond on Android 13 or above");
            } else {
                logger.info("Device is already bonded , starting bond removal timer");
                b();
                synchronized (this.f145661f) {
                    try {
                        if (this.f145668m == null) {
                            logger.debug("startBondRemovalDelayTimer");
                            Timer timer = new Timer();
                            this.f145668m = timer;
                            timer.schedule(new g(this), 7000L);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        BluetoothDevice bluetoothDevice4 = this.f145670o;
        if (bluetoothDevice4 != null && (address = bluetoothDevice4.getAddress()) != null) {
            ((fm2.c) this.f145658c).l(address);
        }
        BluetoothDevice bluetoothDevice5 = this.f145670o;
        if (bluetoothDevice5 == null || bluetoothDevice5.getBondState() != 12) {
            logger.info("Device is not bonded ,  calling create bond");
            BluetoothDevice bluetoothDevice6 = this.f145670o;
            if (bluetoothDevice6 != null) {
                bluetoothDevice6.createBond();
            }
        }
    }

    public final void q(String str) {
        c();
        if (str == null || str.length() == 0) {
            n(yl2.e.CONNECTION_FAILURE, "Handshake timer not started");
            return;
        }
        synchronized (this.f145661f) {
            try {
                if (this.f145669n == null) {
                    B.debug("startHandshakeTimer(" + str + ")");
                    Timer timer = new Timer();
                    this.f145669n = timer;
                    timer.schedule(new e(str), 90000L);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r(Context context) {
        synchronized (this.f145661f) {
            try {
                if (this.f145679x) {
                    context.unregisterReceiver(this.f145680y);
                    this.f145679x = false;
                    B.debug("unregisterBroadcastReceivers: receivers unregistered");
                }
                ((fm2.c) this.f145658c).m(this.f145681z);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void s(bm2.d dVar) {
        String str;
        String str2;
        fm2.d dVar2;
        fm2.d dVar3;
        fm2.d dVar4;
        byte[] capabilityFlags = dVar.b().getCapabilityFlags();
        capabilityFlags.getClass();
        boolean z14 = dVar.getConnectionType() == 1;
        B.debug("updateBtConnectionInfo(" + dVar.f() + ")");
        lm2.i iVarF = lm2.h.f();
        String str3 = null;
        yl2.c cVar = new yl2.c(dVar, null, 2, null);
        byte[] bArrEncode = Base64.encode(capabilityFlags, 0);
        bArrEncode.getClass();
        Charset charset = d53.c.f57666b;
        String str4 = new String(bArrEncode, charset);
        if (!z14 || (dVar4 = this.f145676u) == null) {
            str = null;
        } else {
            byte[] bArrEncode2 = Base64.encode(dVar4.f72131a.f58872c, 0);
            bArrEncode2.getClass();
            str = new String(bArrEncode2, charset);
        }
        if (!z14 || (dVar3 = this.f145676u) == null) {
            str2 = null;
        } else {
            byte[] bArrEncode3 = Base64.encode(dVar3.f72131a.f58873d, 0);
            bArrEncode3.getClass();
            str2 = new String(bArrEncode3, charset);
        }
        if (z14 && (dVar2 = this.f145676u) != null) {
            byte[] bArrEncode4 = Base64.encode(dVar2.f72131a.f58871b, 0);
            bArrEncode4.getClass();
            str3 = new String(bArrEncode4, charset);
        }
        ((im2.c) iVarF).m(cVar, str4, z14, str, str2, str3, new f(dVar));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lqm2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "BOND_REMOVAL_DELAY", "I", "HANDSHAKE_TIMEOUT", "BOND_AUTO_RETRY_COUNT", "BLE_AUTO_RETRY_COUNT", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
