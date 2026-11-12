package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.RouteInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.example.statistics.export.OneTrackConstant;
import com.miui.circulate.api.bean.CirculateParam;
import com.miui.circulate.api.bean.ResponseParam;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.circulate.api.util.CarUtils;
import com.miui.circulate.device.api.Constant;
import com.miui.circulate.device.api.GlobalDeviceControl;
import com.miui.circulate.device.api.Icon;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import com.xiaomi.miplay.audioclient.MediaMetaData;
import com.xiaomi.miplay.audioclient.MiPlayDevice;
import com.xiaomi.miplay.audioclient.MiPlayDeviceControlCenter;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class xo1 extends c52 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final svf f39300k;
    public final yo1 l;
    public final int d = 4000;
    public final String e = "get_volume";
    public final String f = "get_position";
    public final String g = "get_play_state";
    public final String h = "get_media_info";
    public final String i = "get_mirror_mode";
    public final String j = "com.xiaomi.mis";
    public AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(false);
    public volatile CountDownLatch o = null;
    public final Map<String, String> p = new ConcurrentHashMap();
    public final tvf q = new a();

    public class a extends tvf {
        public a() {
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void B1(Map map) throws RemoteException {
            tpe.a("AudioServiceClient", "onPositionChanged2: ");
            long jLongValue = 0;
            String strValueOf = null;
            for (Object obj : map.keySet()) {
                if ("modeType".equals(obj)) {
                    ((Integer) map.get(obj)).intValue();
                } else {
                    strValueOf = String.valueOf(obj);
                    jLongValue = ((Long) map.get(obj)).longValue();
                }
            }
            tpe.f("AudioServiceClient", "onPositionChanged2, deviceId=" + tpe.e(strValueOf) + ", position=" + jLongValue);
            for (ap1 ap1Var : xo1.this.l.a()) {
                List<CirculateDeviceInfo> listJ = qx3.g().j(strValueOf);
                ap1Var.onPositionChange(listJ != null ? listJ.get(0) : null, jLongValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void E1(Map map) throws RemoteException {
            super.E1(map);
            for (Object obj : map.keySet()) {
                if ("modeType".equals(obj)) {
                    ((Integer) map.get(obj)).intValue();
                } else {
                    tpe.f("AudioServiceClient", "onPositionAck2: " + obj + "," + map.get(obj));
                    long jLongValue = ((Long) map.get(obj)).longValue();
                    for (ap1 ap1Var : xo1.this.l.a()) {
                        List<CirculateDeviceInfo> listJ = qx3.g().j(String.valueOf(obj));
                        ap1Var.onPositionChange(listJ != null ? listJ.get(0) : null, jLongValue);
                    }
                }
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void F0(Map map) throws RemoteException {
            MediaMetaData mediaMetaData;
            try {
                if (xo1.this.l.A(com.miui.circulate.api.protocol.audio.support.a.e(map))) {
                    return;
                }
                tpe.a("AudioServiceClient", "onMediaInfoChange");
                com.miui.circulate.api.protocol.audio.support.MediaMetaData mediaMetaDataH = null;
                String str = null;
                for (Object obj : map.keySet()) {
                    String strValueOf = String.valueOf(obj);
                    if (map.get(obj) instanceof MediaMetaData) {
                        mediaMetaData = (MediaMetaData) map.get(obj);
                    } else {
                        tpe.f("AudioServiceClient", "onMediaInfoChange: " + map.get(obj));
                        mediaMetaData = null;
                    }
                    if (mediaMetaData != null) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(com.miui.circulate.api.protocol.audio.support.MediaMetaData.IS_LOCAL, false);
                        bundle.putString(com.miui.circulate.api.protocol.audio.support.MediaMetaData.COVER_URL, mediaMetaData.f());
                        bundle.putString("id", mediaMetaData.j());
                        bundle.putString("packageName", mediaMetaData.h());
                        mediaMetaDataH = new com.miui.circulate.api.protocol.audio.support.MediaMetaData.b().i(mediaMetaData.a()).j(mediaMetaData.c()).k(mediaMetaData.d()).m(mediaMetaData.g()).o(mediaMetaData.j()).p(mediaMetaData.i()).l(mediaMetaData.e()).n(bundle).h();
                        str = strValueOf;
                        break;
                    }
                    str = strValueOf;
                }
                if (mediaMetaDataH != null) {
                    xo1.this.l.w("MediaMetaData", str, mediaMetaDataH);
                    tpe.f("AudioServiceClient", "onMediaInfoChange, deviceId=" + tpe.e(str) + ", MetaData=" + mediaMetaDataH.e());
                    Iterator<ap1> it = xo1.this.l.a().iterator();
                    while (it.hasNext()) {
                        it.next().onMediaInfoChange(com.miui.circulate.api.protocol.audio.support.a.i(str), mediaMetaDataH);
                    }
                }
            } catch (Exception e) {
                tpe.c("AudioServiceClient", "onMediaInfoAck error:" + e);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void G4(String str) throws RemoteException {
            tpe.f("AudioServiceClient", "onBeSeized");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void H2(Map map) throws RemoteException {
            tpe.f("AudioServiceClient", "onChannelsAck");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void H3(Map map) throws RemoteException {
            int iQ5;
            String strValueOf;
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                iQ5 = q5(strValueOf, ((Integer) map.get(next)).intValue());
            } else {
                iQ5 = 0;
                strValueOf = null;
            }
            if (xo1.this.l.A(strValueOf)) {
                return;
            }
            xo1.this.l.w("PlayState", strValueOf, Integer.valueOf(iQ5));
            tpe.f("AudioServiceClient", "onPlayStateChange, deviceId=" + tpe.e(strValueOf) + ", playState=" + iQ5);
            Iterator<ap1> it2 = xo1.this.l.a().iterator();
            while (it2.hasNext()) {
                it2.next().onPlayStateChange(com.miui.circulate.api.protocol.audio.support.a.i(strValueOf), iQ5);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void K1(Map map) throws RemoteException {
            MediaMetaData mediaMetaData;
            try {
                tpe.a("AudioServiceClient", "onMediaInfoAck2");
                for (Object obj : map.keySet()) {
                    if ("modeType".equals(obj)) {
                        ((Integer) map.get(obj)).intValue();
                    } else {
                        if (map.get(obj) instanceof MediaMetaData) {
                            mediaMetaData = (MediaMetaData) map.get(obj);
                        } else {
                            tpe.f("AudioServiceClient", "onMediaInfoAck2: " + map.get(obj));
                            mediaMetaData = null;
                        }
                        if (mediaMetaData != null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean(com.miui.circulate.api.protocol.audio.support.MediaMetaData.IS_LOCAL, false);
                            bundle.putString(com.miui.circulate.api.protocol.audio.support.MediaMetaData.COVER_URL, mediaMetaData.f());
                            bundle.putString("id", mediaMetaData.j());
                            bundle.putString("packageName", mediaMetaData.h());
                            com.miui.circulate.api.protocol.audio.support.MediaMetaData mediaMetaDataH = new com.miui.circulate.api.protocol.audio.support.MediaMetaData.b().i(mediaMetaData.a()).j(mediaMetaData.c()).k(mediaMetaData.d()).m(mediaMetaData.g()).o(mediaMetaData.j()).p(mediaMetaData.i()).l(mediaMetaData.e()).n(bundle).h();
                            xo1.this.l.w("MediaMetaData", String.valueOf(obj), mediaMetaDataH);
                            StringBuilder sb = new StringBuilder();
                            sb.append("onMediaInfoAck, deviceId=");
                            sb.append(tpe.e(String.valueOf(obj)));
                            sb.append(", MetaData=");
                            sb.append(mediaMetaDataH != null ? mediaMetaDataH.e() : null);
                            tpe.f("AudioServiceClient", sb.toString());
                            if (mediaMetaDataH != null) {
                                Iterator<ap1> it = xo1.this.l.a().iterator();
                                while (it.hasNext()) {
                                    it.next().onMediaInfoChange(com.miui.circulate.api.protocol.audio.support.a.i(String.valueOf(obj)), mediaMetaDataH);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                tpe.c("AudioServiceClient", "onMediaInfoAck error:" + e);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void L4(Map map) throws RemoteException {
            int iIntValue;
            String strValueOf;
            tpe.a("AudioServiceClient", "onSetVolumeACK");
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                iIntValue = ((Integer) map.get(next)).intValue();
            } else {
                iIntValue = 0;
                strValueOf = null;
            }
            xo1.this.l.w("Volume", strValueOf, Integer.valueOf(iIntValue));
            tpe.a("AudioServiceClient", "onSetVolumeACK, deviceId=" + tpe.e(strValueOf) + ", volume=" + iIntValue);
            Iterator<ap1> it2 = xo1.this.l.a().iterator();
            while (it2.hasNext()) {
                it2.next().onVolumeChange(com.miui.circulate.api.protocol.audio.support.a.i(strValueOf), iIntValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void P0(Map map) throws RemoteException {
            MediaMetaData mediaMetaData;
            try {
                if (xo1.this.l.A(com.miui.circulate.api.protocol.audio.support.a.e(map))) {
                    return;
                }
                tpe.a("AudioServiceClient", "onMediaInfoAck");
                for (Object obj : map.keySet()) {
                    if (map.get(obj) instanceof MediaMetaData) {
                        mediaMetaData = (MediaMetaData) map.get(obj);
                    } else {
                        tpe.f("AudioServiceClient", "onMediaInfoAck: " + map.get(obj));
                        mediaMetaData = null;
                    }
                    if (mediaMetaData != null) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(com.miui.circulate.api.protocol.audio.support.MediaMetaData.IS_LOCAL, false);
                        bundle.putString(com.miui.circulate.api.protocol.audio.support.MediaMetaData.COVER_URL, mediaMetaData.f());
                        bundle.putString("id", mediaMetaData.j());
                        bundle.putString("packageName", mediaMetaData.h());
                        com.miui.circulate.api.protocol.audio.support.MediaMetaData mediaMetaDataH = new com.miui.circulate.api.protocol.audio.support.MediaMetaData.b().i(mediaMetaData.a()).j(mediaMetaData.c()).k(mediaMetaData.d()).m(mediaMetaData.g()).o(mediaMetaData.j()).p(mediaMetaData.i()).l(mediaMetaData.e()).n(bundle).h();
                        xo1.this.l.w("MediaMetaData", String.valueOf(obj), mediaMetaDataH);
                        StringBuilder sb = new StringBuilder();
                        sb.append("onMediaInfoAck, deviceId=");
                        sb.append(tpe.e(String.valueOf(obj)));
                        sb.append(", MetaData=");
                        sb.append(mediaMetaDataH != null ? mediaMetaDataH.e() : null);
                        tpe.f("AudioServiceClient", sb.toString());
                        if (mediaMetaDataH != null) {
                            Iterator<ap1> it = xo1.this.l.a().iterator();
                            while (it.hasNext()) {
                                it.next().onMediaInfoChange(com.miui.circulate.api.protocol.audio.support.a.i(String.valueOf(obj)), mediaMetaDataH);
                            }
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                tpe.c("AudioServiceClient", "onMediaInfoAck error:" + e);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void S2(Map map) throws RemoteException {
            int iQ5 = 0;
            String str = null;
            for (Object obj : map.keySet()) {
                if ("modeType".equals(obj)) {
                    ((Integer) map.get(obj)).intValue();
                } else {
                    String strValueOf = String.valueOf(obj);
                    str = strValueOf;
                    iQ5 = q5(strValueOf, ((Integer) map.get(obj)).intValue());
                }
            }
            xo1.this.l.w("PlayState", str, Integer.valueOf(iQ5));
            tpe.f("AudioServiceClient", "onPlayStateChange2, deviceId=" + tpe.e(str) + ", playState=" + iQ5);
            Iterator<ap1> it = xo1.this.l.a().iterator();
            while (it.hasNext()) {
                it.next().onPlayStateChange(com.miui.circulate.api.protocol.audio.support.a.i(str), iQ5);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        @SuppressLint({"NewApi"})
        public void W2(String str) throws RemoteException {
            if (TextUtils.isEmpty(str)) {
                xo1.this.l.w("PlayState", "local_device_id", 0);
                tpe.f("AudioServiceClient", "onTopActiveSessionChange, send onPlayStateChange");
                Iterator<ap1> it = xo1.this.l.a().iterator();
                while (it.hasNext()) {
                    it.next().onPlayStateChange(com.miui.circulate.api.protocol.audio.support.a.i("local_device_id"), 0);
                }
                return;
            }
            tpe.f("AudioServiceClient", "onTopActiveSessionChange, appId=" + str);
            CirculateDeviceInfo circulateDeviceInfoD = ((e96) gx3.e().a("DeviceManager")).d();
            Iterator<ap1> it2 = xo1.this.l.a().iterator();
            while (it2.hasNext()) {
                it2.next().onMediaInfoChange(com.miui.circulate.api.protocol.audio.support.a.i("local_device_id"), xo1.this.l.h());
            }
            xo1.this.l.k(circulateDeviceInfoD);
            xo1.this.l.l(circulateDeviceInfoD);
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void W3(Map map) throws RemoteException {
            if (xo1.this.l.A(com.miui.circulate.api.protocol.audio.support.a.e(map))) {
                return;
            }
            tpe.a("AudioServiceClient", "onPlayStateAck");
            for (Object obj : map.keySet()) {
                String strValueOf = String.valueOf(obj);
                int iQ5 = q5(strValueOf, ((Integer) map.get(obj)).intValue());
                xo1.this.l.w("PlayState", strValueOf, Integer.valueOf(iQ5));
                tpe.f("AudioServiceClient", "onPlayStateAck, deviceId=" + tpe.e(strValueOf) + ", playState=" + iQ5);
                Iterator<ap1> it = xo1.this.l.a().iterator();
                while (it.hasNext()) {
                    it.next().onPlayStateChange(com.miui.circulate.api.protocol.audio.support.a.i(strValueOf), iQ5);
                }
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void a0(Map map) throws RemoteException {
            tpe.f("AudioServiceClient", "onDisconnectNotify");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void a1(Map map) throws RemoteException {
            int iIntValue;
            String strValueOf;
            tpe.a("AudioServiceClient", "onVolumeChange");
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                iIntValue = ((Integer) map.get(next)).intValue();
            } else {
                iIntValue = 0;
                strValueOf = null;
            }
            xo1.this.l.w("Volume", strValueOf, Integer.valueOf(iIntValue));
            tpe.f("AudioServiceClient", "onVolumeChange, deviceId=" + tpe.e(strValueOf) + ", volume=" + iIntValue);
            Iterator<ap1> it2 = xo1.this.l.a().iterator();
            while (it2.hasNext()) {
                it2.next().onVolumeChange(com.miui.circulate.api.protocol.audio.support.a.i(strValueOf), iIntValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void b3(MediaMetaData mediaMetaData) throws RemoteException {
            tpe.g("AudioServiceClient", true, "onLocalMediaInfoChange drop this notify");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void f5(MiPlayDeviceControlCenter miPlayDeviceControlCenter) throws RemoteException {
            if (xo1.this.f15094b != null) {
                tpe.g("AudioServiceClient", true, "onDeviceFoundControlCenter: " + xo1.this.W(miPlayDeviceControlCenter));
                if (miPlayDeviceControlCenter.h() != 5) {
                    CirculateDeviceInfo circulateDeviceInfoA = com.miui.circulate.api.protocol.audio.support.a.a(miPlayDeviceControlCenter);
                    CirculateServiceInfo circulateServiceInfoA = CirculateServiceInfo.a(65536);
                    circulateServiceInfoA.f10304a = miPlayDeviceControlCenter.j();
                    circulateServiceInfoA.h(xo1.this.l);
                    circulateDeviceInfoA.i.add(circulateServiceInfoA);
                    circulateServiceInfoA.d = miPlayDeviceControlCenter.f() != 1 ? 0 : 2;
                    String str = com.miui.circulate.api.protocol.audio.support.a.f(circulateDeviceInfoA)[0];
                    xo1.this.f39300k.p(str, 1);
                    if (circulateDeviceInfoA.n == 1) {
                        tpe.f("AudioServiceClient", "device is support alonePlayCapacity");
                        xo1.this.f39300k.o(str, 1);
                    }
                    if (!xo1.this.b0(circulateDeviceInfoA)) {
                        xo1.this.f15094b.d(65536, circulateDeviceInfoA, circulateServiceInfoA);
                        return;
                    } else {
                        tpe.i("AudioServiceClient", "Filter repeated reports from the same speaker");
                        xo1.this.f15094b.a(65536, circulateDeviceInfoA, circulateServiceInfoA);
                        return;
                    }
                }
                if (!p5(miPlayDeviceControlCenter) || !xo1.this.X()) {
                    tpe.i("AudioServiceClient", "ignore " + miPlayDeviceControlCenter.t());
                    return;
                }
                final CirculateDeviceInfo circulateDeviceInfoA2 = com.miui.circulate.api.protocol.audio.support.a.a(miPlayDeviceControlCenter);
                if (xo1.this.Z(circulateDeviceInfoA2)) {
                    CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(circulateDeviceInfoA2.f10301a);
                    CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfoI.c(65536);
                    if (com.miui.circulate.api.protocol.audio.support.a.m(miPlayDeviceControlCenter).booleanValue()) {
                        circulateDeviceInfoI.a("wlan", miPlayDeviceControlCenter.l());
                        circulateServiceInfoC.e.put(miPlayDeviceControlCenter.j(), "wlan");
                    } else if (com.miui.circulate.api.protocol.audio.support.a.l(miPlayDeviceControlCenter).booleanValue()) {
                        circulateDeviceInfoI.a("P2P", miPlayDeviceControlCenter.l());
                        circulateServiceInfoC.e.put(miPlayDeviceControlCenter.j(), "P2P");
                    }
                    xo1.this.p.put(miPlayDeviceControlCenter.j(), circulateDeviceInfoI.f10301a);
                    xo1.this.f15094b.a(65536, circulateDeviceInfoI, circulateServiceInfoC);
                    return;
                }
                final CirculateServiceInfo circulateServiceInfoA2 = CirculateServiceInfo.a(65536);
                circulateServiceInfoA2.f10304a = miPlayDeviceControlCenter.j();
                circulateServiceInfoA2.h(xo1.this.l);
                circulateDeviceInfoA2.i.add(circulateServiceInfoA2);
                circulateServiceInfoA2.d = miPlayDeviceControlCenter.f() != 1 ? 0 : 2;
                if (com.miui.circulate.api.protocol.audio.support.a.m(miPlayDeviceControlCenter).booleanValue()) {
                    circulateServiceInfoA2.e.put(miPlayDeviceControlCenter.j(), "wlan");
                } else if (com.miui.circulate.api.protocol.audio.support.a.l(miPlayDeviceControlCenter).booleanValue()) {
                    circulateServiceInfoA2.e.put(miPlayDeviceControlCenter.j(), "P2P");
                }
                xo1.this.f39300k.p(miPlayDeviceControlCenter.j(), 1);
                if (circulateDeviceInfoA2.n == 1) {
                    tpe.f("AudioServiceClient", "device is support alonePlayCapacity");
                    xo1.this.f39300k.o(miPlayDeviceControlCenter.j(), 1);
                }
                xo1.this.p.put(miPlayDeviceControlCenter.j(), circulateDeviceInfoA2.f10301a);
                wcp.a(new Runnable() { // from class: vo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37076a.u5(circulateDeviceInfoA2, circulateServiceInfoA2);
                    }
                });
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void h() throws RemoteException {
            tpe.i("AudioServiceClient", "onBinderDied");
            xo1.this.h(false);
            xo1.this.l.v(false);
            if (xo1.this.f39300k != null) {
                xo1.this.n.set(true);
                String strC = gx3.e().c();
                xo1.this.f39300k.n(xo1.this.q, "", strC + ".circulation");
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void i1(MiPlayDeviceControlCenter miPlayDeviceControlCenter) throws RemoteException {
            CirculateServiceInfo circulateServiceInfoC;
            if (xo1.this.f15094b != null) {
                tpe.g("AudioServiceClient", true, "onDeviceUpdateControlCenter: " + xo1.this.W(miPlayDeviceControlCenter));
                if (!xo1.this.p.containsKey(miPlayDeviceControlCenter.j())) {
                    CirculateDeviceInfo circulateDeviceInfoA = com.miui.circulate.api.protocol.audio.support.a.a(miPlayDeviceControlCenter);
                    CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(circulateDeviceInfoA.f10301a);
                    circulateServiceInfoC = circulateDeviceInfoI != null ? circulateDeviceInfoI.c(65536) : null;
                    if (circulateServiceInfoC == null) {
                        tpe.i("AudioServiceClient", "drop this message while not find cached service");
                        return;
                    } else {
                        circulateDeviceInfoA.i.add(circulateServiceInfoC);
                        xo1.this.f15094b.a(65536, circulateDeviceInfoA, circulateServiceInfoC);
                        return;
                    }
                }
                CirculateDeviceInfo circulateDeviceInfoA2 = com.miui.circulate.api.protocol.audio.support.a.a(miPlayDeviceControlCenter);
                CirculateDeviceInfo circulateDeviceInfoI2 = qx3.g().i(circulateDeviceInfoA2.f10301a);
                circulateServiceInfoC = circulateDeviceInfoI2 != null ? circulateDeviceInfoI2.c(65536) : null;
                if (circulateServiceInfoC == null) {
                    tpe.i("AudioServiceClient", "drop this message while not find cached service");
                    return;
                }
                circulateDeviceInfoA2.f = circulateDeviceInfoI2.f;
                circulateDeviceInfoA2.i.add(circulateServiceInfoC);
                xo1.this.f15094b.a(65536, circulateDeviceInfoA2, circulateServiceInfoC);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void i5(Map map) throws RemoteException {
            MediaMetaData mediaMetaData;
            try {
                tpe.a("AudioServiceClient", "onMediaInfoChange2");
                com.miui.circulate.api.protocol.audio.support.MediaMetaData mediaMetaDataH = null;
                String strValueOf = null;
                for (Object obj : map.keySet()) {
                    if (!"modeType".equals(obj)) {
                        strValueOf = String.valueOf(obj);
                        if (map.get(obj) instanceof MediaMetaData) {
                            mediaMetaData = (MediaMetaData) map.get(obj);
                        } else {
                            tpe.f("AudioServiceClient", "onMediaInfoChange2: " + map.get(obj));
                            mediaMetaData = null;
                        }
                        if (mediaMetaData != null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean(com.miui.circulate.api.protocol.audio.support.MediaMetaData.IS_LOCAL, false);
                            bundle.putString(com.miui.circulate.api.protocol.audio.support.MediaMetaData.COVER_URL, mediaMetaData.f());
                            bundle.putString("id", mediaMetaData.j());
                            bundle.putString("packageName", mediaMetaData.h());
                            mediaMetaDataH = new com.miui.circulate.api.protocol.audio.support.MediaMetaData.b().i(mediaMetaData.a()).j(mediaMetaData.c()).k(mediaMetaData.d()).m(mediaMetaData.g()).o(mediaMetaData.j()).p(mediaMetaData.i()).l(mediaMetaData.e()).n(bundle).h();
                            break;
                        }
                    } else {
                        ((Integer) map.get(obj)).intValue();
                    }
                }
                if (mediaMetaDataH != null) {
                    xo1.this.l.w("MediaMetaData", strValueOf, mediaMetaDataH);
                    tpe.f("AudioServiceClient", "onMediaInfoChange2, deviceId=" + tpe.e(strValueOf) + ", MetaData=" + mediaMetaDataH.e() + ", serviceNotifies size=" + xo1.this.l.a().size());
                    Iterator<ap1> it = xo1.this.l.a().iterator();
                    while (it.hasNext()) {
                        it.next().onMediaInfoChange(com.miui.circulate.api.protocol.audio.support.a.i(strValueOf), mediaMetaDataH);
                    }
                }
            } catch (Exception e) {
                tpe.c("AudioServiceClient", "onMediaInfoAck error:" + e);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void k2(Map map) throws RemoteException {
            int iIntValue;
            String strValueOf;
            tpe.b("AudioServiceClient", true, "onBufferStateChange");
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                iIntValue = ((Integer) map.get(next)).intValue();
            } else {
                iIntValue = 0;
                strValueOf = null;
            }
            tpe.f("AudioServiceClient", "onBufferStateChange, deviceId=" + tpe.e(strValueOf) + ", bufferState=" + iIntValue);
            for (ap1 ap1Var : xo1.this.l.a()) {
                List<CirculateDeviceInfo> listJ = qx3.g().j(strValueOf);
                ap1Var.onBufferStateChange(listJ != null ? listJ.get(0) : null, iIntValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void k4(String str, int i) throws RemoteException {
            tpe.b("AudioServiceClient", true, "onDeviceConnectStateChange id= " + str + ", state=" + i);
            if (xo1.this.f15094b != null) {
                int i2 = 0;
                if (i != 0 && i == 1) {
                    i2 = 2;
                }
                tpe.f("AudioServiceClient", " onDeviceConnectStateChange id: " + str + ", connectState: " + i2);
                List<CirculateDeviceInfo> listJ = qx3.g().j(str);
                if (listJ != null) {
                    Iterator<CirculateDeviceInfo> it = listJ.iterator();
                    while (it.hasNext()) {
                        CirculateDeviceInfo next = it.next();
                        CirculateServiceInfo circulateServiceInfoC = next != null ? next.c(65536) : null;
                        if (circulateServiceInfoC != null) {
                            circulateServiceInfoC.d = i2;
                        }
                        xo1.this.f15094b.onConnectStateChange(i2, next, circulateServiceInfoC);
                    }
                }
                tpe.a("AudioServiceClient", "onDeviceConnectStateChange:" + i2 + ", mWaitPlay=" + xo1.this.o);
                if (i2 != 2 || xo1.this.o == null) {
                    return;
                }
                xo1.this.o.countDown();
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void l0(Map map) throws RemoteException {
            tpe.a("AudioServiceClient", "onMirrorModeAck");
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                int iIntValue = ((Integer) map.get(next)).intValue();
                int i = 1;
                if (iIntValue != 1) {
                    i = 2;
                    if (iIntValue != 2) {
                        i = 0;
                    }
                }
                tpe.f("AudioServiceClient", "onMirrorModeAck, deviceId=" + tpe.e(next.toString()) + ", mode=" + i);
                xo1.this.l.w("MirrorMode", String.valueOf(next), Integer.valueOf(i));
                for (ap1 ap1Var : xo1.this.l.a()) {
                    List<CirculateDeviceInfo> listJ = qx3.g().j(String.valueOf(next));
                    if (listJ != null) {
                        listJ.get(0);
                    }
                    ap1Var.onMirrorModeChange(listJ != null ? listJ.get(0) : null, i);
                }
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void m3() throws RemoteException {
            tpe.i("AudioServiceClient", "onInitError");
            xo1.this.h(false);
            xo1.this.l.v(false);
            boolean zCompareAndSet = xo1.this.n.compareAndSet(true, false);
            if (xo1.this.f15094b == null || !zCompareAndSet) {
                return;
            }
            xo1.this.f15094b.b(65536, new ResponseParam.b(0, "init error").a());
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void n3(String str, byte[] bArr) throws RemoteException {
            tpe.f("AudioServiceClient", "onReceiveCustomProtocol");
            xo1.this.l.q(str, bArr);
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void o(Map map) throws RemoteException {
            long jLongValue;
            String strValueOf;
            if (xo1.this.l.A(com.miui.circulate.api.protocol.audio.support.a.e(map))) {
                return;
            }
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                jLongValue = ((Long) map.get(next)).longValue();
            } else {
                jLongValue = 0;
                strValueOf = null;
            }
            tpe.f("AudioServiceClient", "onPositionAck, deviceId=" + tpe.e(strValueOf) + ", position=" + jLongValue);
            for (ap1 ap1Var : xo1.this.l.a()) {
                List<CirculateDeviceInfo> listJ = qx3.g().j(strValueOf);
                ap1Var.onPositionChange(listJ != null ? listJ.get(0) : null, jLongValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void o1(Map map) throws RemoteException {
            tpe.f("AudioServiceClient", "onBtFrequencyACK");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void onDeviceLost(String str) throws RemoteException {
            if (xo1.this.f15094b != null) {
                tpe.g("AudioServiceClient", true, "onDeviceLost: " + str);
                if (xo1.this.p.containsKey(str)) {
                    String str2 = (String) xo1.this.p.get(str);
                    xo1.this.p.remove(str);
                    CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(str2);
                    CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfoI != null ? circulateDeviceInfoI.c(65536) : null;
                    if (circulateServiceInfoC != null) {
                        circulateDeviceInfoI.i(circulateServiceInfoC.e.getOrDefault(str, "error"));
                        circulateServiceInfoC.e.remove(str);
                        if (circulateServiceInfoC.e.isEmpty()) {
                            xo1.this.f15094b.onConnectStateChange(0, circulateDeviceInfoI, circulateServiceInfoC);
                            xo1.this.f15094b.e(65536, circulateDeviceInfoI, circulateServiceInfoC);
                            return;
                        } else {
                            if (circulateServiceInfoC.e.keySet().stream().findFirst().isPresent()) {
                                circulateServiceInfoC.f10304a = circulateServiceInfoC.e.keySet().stream().findFirst().get();
                            }
                            xo1.this.f15094b.a(65536, circulateDeviceInfoI, circulateServiceInfoC);
                            return;
                        }
                    }
                    return;
                }
                List<CirculateDeviceInfo> listJ = qx3.g().j(str);
                if (listJ != null) {
                    for (CirculateDeviceInfo circulateDeviceInfo : listJ) {
                        tpe.g("AudioServiceClient", true, "onDeviceLost name: " + circulateDeviceInfo.c);
                        CirculateServiceInfo circulateServiceInfoD = circulateDeviceInfo.d(65536, str);
                        if (circulateServiceInfoD == null) {
                            circulateServiceInfoD = CirculateServiceInfo.a(65536);
                            circulateServiceInfoD.f10304a = str;
                            circulateServiceInfoD.h(xo1.this.l);
                        }
                        circulateServiceInfoD.d = 0;
                        xo1.this.f15094b.onConnectStateChange(0, circulateDeviceInfo, circulateServiceInfoD);
                        xo1.this.f15094b.e(65536, circulateDeviceInfo, circulateServiceInfoD);
                    }
                }
            }
        }

        public final boolean p5(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
            if (miPlayDeviceControlCenter == null) {
                return false;
            }
            if (com.miui.circulate.api.protocol.audio.support.a.l(miPlayDeviceControlCenter).booleanValue()) {
                tpe.f("AudioServiceClient", "In a P2P scenario, it is required to allow");
                return true;
            }
            if (s5() == null) {
                tpe.f("AudioServiceClient", "gatewayIp is null");
                return false;
            }
            tpe.f("AudioServiceClient", "checkGateway is " + TextUtils.equals(miPlayDeviceControlCenter.l(), s5()));
            return TextUtils.equals(miPlayDeviceControlCenter.l(), s5());
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void q3(Map map) throws RemoteException {
            tpe.a("AudioServiceClient", "onVolumeAck: " + Thread.currentThread().getId());
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                tpe.f("AudioServiceClient", "onVolumeAck, deviceId=" + tpe.e(next.toString()) + ", volume=" + map.get(next));
                int iIntValue = ((Integer) map.get(next)).intValue();
                Iterator<ap1> it2 = xo1.this.l.a().iterator();
                while (it2.hasNext()) {
                    it2.next().onVolumeChange(com.miui.circulate.api.protocol.audio.support.a.i(String.valueOf(next)), iIntValue);
                }
            }
        }

        public final int q5(String str, int i) {
            if ("local_device_id".equalsIgnoreCase(str)) {
                if (i == 1) {
                    i = 9;
                } else if (i == 2) {
                    i = 3;
                } else if (i == 3) {
                    i = 2;
                }
            }
            tpe.f("AudioServiceClient", "convertPlayState, deviceId=" + tpe.e(str) + ", state=" + i);
            return i;
        }

        /* JADX INFO: renamed from: r5, reason: merged with bridge method [inline-methods] */
        public final void u5(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
            final String str = circulateDeviceInfo.f10301a;
            Object objA = ix3.a(851968, "getCarIcon", circulateDeviceInfo);
            Icon icon = objA instanceof Icon ? (Icon) objA : null;
            if (icon != null) {
                circulateDeviceInfo.l = icon;
                xo1.this.f15094b.d(65536, circulateDeviceInfo, circulateServiceInfo);
            } else {
                xo1.this.f15094b.d(65536, circulateDeviceInfo, circulateServiceInfo);
                ix3.b(851968, "getCarIconAsync", circulateDeviceInfo, new ix3.b() { // from class: wo1
                    @Override // ix3.b
                    public final void onResult(Object obj) throws JSONException {
                        this.f38186a.t5(str, obj);
                    }
                });
            }
        }

        public String s5() {
            Network network;
            ConnectivityManager connectivityManager = (ConnectivityManager) xo1.this.f15093a.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            Network[] allNetworks = connectivityManager.getAllNetworks();
            int length = allNetworks.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    network = null;
                    break;
                }
                network = allNetworks[i];
                if (connectivityManager.getNetworkCapabilities(network).hasTransport(1)) {
                    break;
                }
                i++;
            }
            if (network == null) {
                return null;
            }
            for (RouteInfo routeInfo : connectivityManager.getLinkProperties(network).getRoutes()) {
                if (routeInfo.isDefaultRoute() && routeInfo.hasGateway()) {
                    InetAddress gateway = routeInfo.getGateway();
                    if (gateway == null) {
                        return null;
                    }
                    return gateway.getHostAddress();
                }
            }
            return null;
        }

        public final /* synthetic */ void t5(String str, Object obj) throws JSONException {
            if (xo1.this.f15094b == null || obj == null) {
                return;
            }
            Icon iconFromUri = null;
            try {
                Uri uriA = CarUtils.a(xo1.this.f15093a, obj.toString());
                if (uriA != null) {
                    iconFromUri = Icon.fromUri(uriA.toString());
                }
            } catch (IllegalArgumentException unused) {
                tpe.f("AudioServiceClient", "get icon error:" + obj);
            }
            if (iconFromUri != null) {
                CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(str);
                if (circulateDeviceInfoI != null) {
                    CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfoI.c(65536);
                    circulateDeviceInfoI.l = iconFromUri;
                    if (circulateServiceInfoC != null) {
                        xo1.this.f15094b.a(65536, circulateDeviceInfoI, circulateServiceInfoC);
                    }
                }
                String strFlat = iconFromUri.flat();
                GlobalDeviceControl.updateIconById(xo1.this.f15093a.getContentResolver(), "wlan$" + str, strFlat);
                GlobalDeviceControl.updateIconById(xo1.this.f15093a.getContentResolver(), "p2p$" + str, strFlat);
                GlobalDeviceControl.updateIconById(xo1.this.f15093a.getContentResolver(), str, strFlat);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void u4(Map map) throws RemoteException {
            long jLongValue;
            String strValueOf;
            if (xo1.this.l.A(com.miui.circulate.api.protocol.audio.support.a.e(map))) {
                return;
            }
            tpe.a("AudioServiceClient", "onPositionChanged: ");
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                jLongValue = ((Long) map.get(next)).longValue();
            } else {
                jLongValue = 0;
                strValueOf = null;
            }
            tpe.f("AudioServiceClient", "onPositionChanged, deviceId=" + tpe.e(strValueOf) + ", position=" + jLongValue);
            for (ap1 ap1Var : xo1.this.l.a()) {
                List<CirculateDeviceInfo> listJ = qx3.g().j(strValueOf);
                ap1Var.onPositionChange(listJ != null ? listJ.get(0) : null, jLongValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void v3(MiPlayDevice miPlayDevice) throws RemoteException {
            tpe.f("AudioServiceClient", "onDeviceFound");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void w1(Map map) throws RemoteException {
            int iIntValue;
            String strValueOf;
            tpe.a("AudioServiceClient", "onMirrorModeNotify");
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                strValueOf = String.valueOf(next);
                iIntValue = ((Integer) map.get(next)).intValue();
            } else {
                iIntValue = 0;
                strValueOf = null;
            }
            tpe.f("AudioServiceClient", "onMirrorModeAck, deviceId=" + tpe.e(strValueOf) + ", mode=" + iIntValue);
            xo1.this.l.w("MirrorMode", strValueOf, Integer.valueOf(iIntValue));
            for (ap1 ap1Var : xo1.this.l.a()) {
                List<CirculateDeviceInfo> listJ = qx3.g().j(strValueOf);
                if (listJ != null) {
                    listJ.get(0);
                }
                ap1Var.onMirrorModeChange(listJ != null ? listJ.get(0) : null, iIntValue);
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void x0(Map map) throws RemoteException {
            tpe.a("AudioServiceClient", "onPlayStateAck2");
            for (Object obj : map.keySet()) {
                if ("modeType".equals(obj)) {
                    ((Integer) map.get(obj)).intValue();
                } else {
                    String strValueOf = String.valueOf(obj);
                    int iQ5 = q5(strValueOf, ((Integer) map.get(obj)).intValue());
                    xo1.this.l.w("PlayState", strValueOf, Integer.valueOf(iQ5));
                    tpe.f("AudioServiceClient", "onPlayStateAck2, deviceId=" + tpe.e(strValueOf) + ", playState=" + iQ5);
                    Iterator<ap1> it = xo1.this.l.a().iterator();
                    while (it.hasNext()) {
                        it.next().onPlayStateChange(com.miui.circulate.api.protocol.audio.support.a.i(strValueOf), iQ5);
                    }
                }
            }
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void x3(MiPlayDevice miPlayDevice) throws RemoteException {
            tpe.f("AudioServiceClient", "onDeviceUpdate");
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void z1() throws RemoteException {
            tpe.a("AudioServiceClient", "onInitSuccess");
            boolean z = true;
            xo1.this.h(true);
            xo1.this.l.v(true);
            xo1.this.l.r();
            boolean zCompareAndSet = xo1.this.n.compareAndSet(true, false);
            if (xo1.this.f15094b != null && zCompareAndSet) {
                xo1.this.f15094b.c(65536);
            }
            try {
                int iD = xo1.this.f39300k.d();
                tpe.f("AudioServiceClient", "onInitSuccess(): getApiVersion = " + iD);
                yo1 yo1Var = xo1.this.l;
                if (iD < 2) {
                    z = false;
                }
                yo1Var.x(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public xo1() {
        tpe.b("AudioServiceClient", true, "AudioServiceClient");
        svf svfVar = new svf(gx3.e().b());
        this.f39300k = svfVar;
        this.l = new yo1(svfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void c0(List<CirculateDeviceInfo> list, List<CirculateDeviceInfo> list2, CirculateParam circulateParam) {
        boolean z;
        boolean z2;
        StringBuilder sb;
        tpe.g("AudioServiceClient", true, "circulateService: " + d());
        if (this.f39300k == null) {
            tpe.j("AudioServiceClient", true, "circulateService: client is null");
            i(this.f15094b, 65536, -2, (CirculateDeviceInfo[]) list2.toArray(new CirculateDeviceInfo[list2.size()]));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CirculateDeviceInfo> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            CirculateDeviceInfo next = it.next();
            if ("local_device_id".equals(next.f10301a)) {
                z = true;
                break;
            } else if (next.c(65536) != null) {
                arrayList.add(next);
            }
        }
        this.o = null;
        if (!z) {
            String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) arrayList.toArray(new CirculateDeviceInfo[arrayList.size()]));
            tpe.a("AudioServiceClient", "circulateService device play: " + Arrays.toString(strArrF));
            if (strArrF == null || strArrF.length == 0) {
                i(this.f15094b, 65536, -3, (CirculateDeviceInfo[]) list2.toArray(new CirculateDeviceInfo[list2.size()]));
            } else {
                tpe.g("AudioServiceClient", true, "circulateService device real play");
                i(this.f15094b, 65536, 3, (CirculateDeviceInfo[]) list2.toArray(new CirculateDeviceInfo[list2.size()]));
                tpe.a("AudioServiceClient", "connecting: " + Arrays.toString(strArrF));
                this.f39300k.b(strArrF, true, "", 7);
                this.o = new CountDownLatch(1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<CirculateDeviceInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            CirculateDeviceInfo next2 = it2.next();
            if ("local_device_id".equals(next2.f10301a)) {
                this.o = null;
                z2 = true;
                break;
            } else if (next2.c(65536) != null) {
                arrayList2.add(next2);
            }
        }
        if (!z2) {
            String[] strArrF2 = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) arrayList2.toArray(new CirculateDeviceInfo[arrayList2.size()]));
            tpe.a("AudioServiceClient", "circulateService device stop: " + Arrays.toString(strArrF2));
            if (strArrF2 == null || strArrF2.length == 0) {
                i(this.f15094b, 65536, -3, (CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
            } else {
                tpe.f("AudioServiceClient", "circulateService device stop wait");
                i(this.f15094b, 65536, 1, (CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
                try {
                    try {
                        if (this.o != null) {
                            this.o.await(EcoBanner.BANNER_CHANGE_TIME, TimeUnit.MILLISECONDS);
                        }
                        tpe.g("AudioServiceClient", true, "circulateService device real stop");
                        sb = new StringBuilder();
                    } catch (InterruptedException e) {
                        tpe.c("AudioServiceClient", "circulateService stop error:" + e);
                        tpe.g("AudioServiceClient", true, "circulateService device real stop");
                        sb = new StringBuilder();
                    }
                    sb.append("disconnecting: ");
                    sb.append(Arrays.toString(strArrF2));
                    tpe.a("AudioServiceClient", sb.toString());
                    this.f39300k.A(strArrF2);
                } catch (Throwable th) {
                    tpe.g("AudioServiceClient", true, "circulateService device real stop");
                    tpe.a("AudioServiceClient", "disconnecting: " + Arrays.toString(strArrF2));
                    this.f39300k.A(strArrF2);
                    throw th;
                }
            }
        }
        tpe.g("AudioServiceClient", true, "circulateService: " + z + ", " + z2);
    }

    public final String W(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
        return ("device name=" + miPlayDeviceControlCenter.t()) + ", idHash=" + tpe.e(miPlayDeviceControlCenter.k()) + ", miplayId=" + tpe.e(miPlayDeviceControlCenter.j()) + ", mac=" + tpe.e(miPlayDeviceControlCenter.q().toLowerCase()) + ", connectState=" + miPlayDeviceControlCenter.f() + ", devicetype=" + miPlayDeviceControlCenter.h() + ", networkIface=" + miPlayDeviceControlCenter.u();
    }

    public final boolean X() {
        try {
            return this.f15093a.getPackageManager().getPackageInfo("com.xiaomi.mis", 0) != null;
        } catch (Exception e) {
            tpe.f("AudioServiceClient", "hasInstallMis false! " + e.getMessage());
            return false;
        }
    }

    public boolean Y(CirculateDeviceInfo circulateDeviceInfo) {
        return circulateDeviceInfo.d.equals("AndroidCar");
    }

    public boolean Z(CirculateDeviceInfo circulateDeviceInfo) {
        for (CirculateDeviceInfo circulateDeviceInfo2 : qx3.g().k(65536)) {
            if (circulateDeviceInfo.f10302b.equals(circulateDeviceInfo2.f10302b) && Y(circulateDeviceInfo)) {
                tpe.f("AudioServiceClient", "filter Speaker Device");
                return circulateDeviceInfo.equals(circulateDeviceInfo2);
            }
        }
        return false;
    }

    @Override // defpackage.dqc
    public void a(final List<CirculateDeviceInfo> list, final List<CirculateDeviceInfo> list2, final CirculateParam circulateParam) throws CirculateException {
        wcp.a(new Runnable() { // from class: to1
            @Override // java.lang.Runnable
            public final void run() {
                this.f34885a.c0(list, list2, circulateParam);
            }
        });
    }

    public boolean a0(CirculateDeviceInfo circulateDeviceInfo) {
        String str = circulateDeviceInfo.d;
        return str.equals("Sound") || str.equals(Constant.DeviceType.SCREEN_SOUND) || str.equals("TV");
    }

    @Override // defpackage.trc
    public void b(dy6 dy6Var) {
        svf svfVar;
        boolean zCompareAndSet = this.m.compareAndSet(true, false);
        tpe.g("AudioServiceClient", true, "stopDiscovery: " + d() + "," + zCompareAndSet);
        if (d() && zCompareAndSet && (svfVar = this.f39300k) != null) {
            svfVar.B();
            qx3.g().f(65536, false);
        }
    }

    public boolean b0(CirculateDeviceInfo circulateDeviceInfo) {
        for (CirculateDeviceInfo circulateDeviceInfo2 : qx3.g().k(65536)) {
            if (circulateDeviceInfo.f10302b.equals(circulateDeviceInfo2.f10302b) && a0(circulateDeviceInfo)) {
                tpe.f("AudioServiceClient", "filter Speaker Device");
                return circulateDeviceInfo.equals(circulateDeviceInfo2);
            }
        }
        return false;
    }

    @Override // defpackage.trc
    @RequiresApi(api = 24)
    public void c(dy6 dy6Var, Executor executor) throws CirculateException {
        tpe.g("AudioServiceClient", true, "startDiscovery: " + d() + ", " + dy6Var.f16050a + "," + this.m.compareAndSet(false, true));
        if (!d() || this.f39300k == null) {
            return;
        }
        int i = dy6Var.f16050a;
        final int i2 = (i & 2) != 0 ? 66 : 0;
        if ((i & 4) != 0) {
            i2 |= 4;
        }
        if ((i & 8) != 0) {
            i2 |= 2;
        }
        if ((i & 16) != 0) {
            i2 |= 64;
        }
        if ((i & 32) != 0) {
            i2 |= 1;
        }
        if ((i & 64) != 0) {
            i2 |= 128;
        }
        if ((i & 128) != 0) {
            i2 |= 256;
        }
        tpe.f("AudioServiceClient", "startDiscovery: " + i2);
        if (i2 != 0) {
            CompletableFuture.runAsync(new Runnable() { // from class: so1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33829a.d0(i2);
                }
            }, wcp.b());
        }
    }

    public final /* synthetic */ void d0(int i) {
        this.f39300k.z(i);
    }

    @Override // defpackage.b14
    public hyc e(int i) throws CirculateException {
        tpe.a("AudioServiceClient", "getServiceControl: " + i);
        if (!d()) {
            throw new CirculateException("getServiceController error, client not available, please init first");
        }
        if (this.f39300k != null) {
            return this.l;
        }
        return null;
    }

    @Override // defpackage.b14
    public int f() {
        return 65536;
    }

    @Override // defpackage.d52, defpackage.b14
    public void g(Context context, zw3 zw3Var, String str) {
        tpe.b("AudioServiceClient", true, "clientInstall");
        super.g(context, zw3Var, str);
    }

    @Override // defpackage.b14
    public void init() {
        tpe.f("AudioServiceClient", "start init");
        this.l.t(this.f15093a);
        if (this.f39300k == null) {
            if (this.f15094b == null) {
                tpe.i("AudioServiceClient", "init fail, client=null and callback=null");
                return;
            } else {
                tpe.i("AudioServiceClient", "init fail, client=null");
                this.f15094b.b(65536, new ResponseParam.b(0, "init error").a());
                return;
            }
        }
        this.n.set(true);
        String strC = gx3.e().c();
        this.f39300k.n(this.q, "", strC + ".circulation");
    }

    @Override // defpackage.b14
    public void release() {
        h(false);
    }
}
