package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.protocol.audio.support.PlayCapacity;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class yo1 extends jyc<ap1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public svf f40357b;
    public pj4 c;
    public sm1 d;
    public wz v;
    public AtomicBoolean e = new AtomicBoolean(false);
    public boolean f = false;
    public final c n = new c(this, null);
    public final String o = "connectstate";
    public final String p = "connecttype";
    public final String q = "connected";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f40359r = "disconnected";
    public final String s = "basic";
    public final String t = "adv";
    public final String u = "mirror";
    public final r4n w = new a();
    public final Map<String, MediaMetaData> g = new ConcurrentHashMap();
    public final Map<String, Integer> h = new ConcurrentHashMap();
    public final Map<String, Integer> i = new ConcurrentHashMap();
    public final Map<String, Integer> j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<String, List<MediaMetaData>> f40358k = new ConcurrentHashMap();
    public final Map<String, Integer> l = new ConcurrentHashMap();
    public final Map<String, PlayCapacity> m = new ConcurrentHashMap();

    public class a implements r4n {
        public a() {
        }

        @Override // defpackage.r4n
        public void a(k55 k55Var, String str, String str2) {
            tpe.f("AudioServiceControl", "onSourceLoopTypeUpdate, deviceId=" + tpe.e(str2) + ", CurrentLoopType=" + k55Var);
            int iA = k55Var.a();
            yo1.this.w("LoopType", str2, Integer.valueOf(iA));
            Iterator<ap1> it = yo1.this.a().iterator();
            while (it.hasNext()) {
                it.next().onSourceLoopTypeUpdate(com.miui.circulate.api.protocol.audio.support.a.i(str2), iA);
            }
        }

        @Override // defpackage.r4n
        public void b(wm1 wm1Var, String str, String str2) {
            tpe.f("AudioServiceControl", "onSourceAudioListUpdate, deviceId=" + tpe.e(str2) + ", audioList=" + wm1Var);
            List<MediaMetaData> listB = com.miui.circulate.api.protocol.audio.support.a.b(wm1Var.a());
            yo1.this.w("AudioList", str2, listB);
            Iterator<ap1> it = yo1.this.a().iterator();
            while (it.hasNext()) {
                it.next().onSourceAudioListUpdate(com.miui.circulate.api.protocol.audio.support.a.i(str2), listB);
            }
        }

        @Override // defpackage.r4n
        public void c(String str, String str2, String str3) {
            tpe.f("AudioServiceControl", "onSourceExecuteSuccess, deviceId=" + tpe.e(str3) + ", message=" + str);
            Iterator<ap1> it = yo1.this.a().iterator();
            while (it.hasNext()) {
                it.next().onSourceExecuteSuccess(com.miui.circulate.api.protocol.audio.support.a.i(str3), str);
            }
        }

        @Override // defpackage.r4n
        public void d(k0i k0iVar, String str, String str2) {
            tpe.f("AudioServiceControl", "onSourcePlayCapacityUpdate, deviceId=" + tpe.e(str2) + ", playCapacity=" + k0iVar);
            PlayCapacity playCapacityA = new PlayCapacity.b().d(k0iVar.c()).b(k0iVar.a()).c(k0iVar.b()).f(k0iVar.g()).e(k0iVar.f()).h(k0iVar.i()).g(k0iVar.h()).k(k0iVar.l()).l(k0iVar.m()).j(k0iVar.k()).i(k0iVar.j()).a();
            yo1.this.w("PlayCapacity", str2, playCapacityA);
            Iterator<ap1> it = yo1.this.a().iterator();
            while (it.hasNext()) {
                it.next().onSourcePlayCapacityUpdate(com.miui.circulate.api.protocol.audio.support.a.i(str2), playCapacityA);
            }
        }

        @Override // defpackage.r4n
        public void e(String str, String str2, String str3) {
            tpe.f("AudioServiceControl", "onSourceExecuteFail, deviceId=" + tpe.e(str3) + ", message=" + str);
            Iterator<ap1> it = yo1.this.a().iterator();
            while (it.hasNext()) {
                it.next().onSourceExecuteFail(com.miui.circulate.api.protocol.audio.support.a.i(str3), str);
            }
        }
    }

    public class b extends wz {
        public b() {
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        public final /* synthetic */ void b(int i) {
            tpe.f("AudioServiceControl", "onReceive, startDiscovery");
            yo1.this.f40357b.z(i);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("connectstate");
            String stringExtra2 = intent.getStringExtra("connecttype");
            tpe.f("AudioServiceControl", "onReceive, action:" + action);
            if ("com.xiaomi.mis.intent.action.MIS_CAR_CONNECT".equals(action) && "mirror".equals(stringExtra2) && "connected".equals(stringExtra)) {
                final int i = 2;
                CompletableFuture.runAsync(new Runnable() { // from class: zo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41509a.b(i);
                    }
                }, wcp.b());
                return;
            }
            tpe.f("AudioServiceControl", "onReceive, connectState:" + stringExtra + "connectType: " + stringExtra2);
        }

        public /* synthetic */ c(yo1 yo1Var, a aVar) {
            this();
        }
    }

    public yo1(svf svfVar) {
        this.f40357b = svfVar;
    }

    public boolean A(String str) {
        return this.f && !"local_device_id".equals(str);
    }

    public void d(List<CirculateDeviceInfo> list) {
        tpe.f("AudioServiceControl", "Pause, deviceId=" + com.miui.circulate.api.protocol.audio.support.a.d(list));
        if (list == null || list.isEmpty()) {
            return;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
        if (!o() || this.f40357b == null) {
            return;
        }
        if (z(list.get(0))) {
            tpe.f("AudioServiceControl", "Pause2, deviceId=" + tpe.e(Arrays.toString(strArrF)));
            this.f40357b.t(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
            return;
        }
        tpe.f("AudioServiceControl", "Pause, deviceId=" + tpe.e(Arrays.toString(strArrF)));
        this.f40357b.a(strArrF);
    }

    public void e(List<CirculateDeviceInfo> list) {
        tpe.f("AudioServiceControl", "Resume, deviceId=" + com.miui.circulate.api.protocol.audio.support.a.d(list));
        if (list == null || list.isEmpty()) {
            return;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
        if (!o() || this.f40357b == null) {
            return;
        }
        if (z(list.get(0))) {
            tpe.f("AudioServiceControl", "Resume2, deviceId=" + tpe.e(Arrays.toString(strArrF)));
            this.f40357b.v(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
            return;
        }
        tpe.f("AudioServiceControl", "Resume, deviceId=" + tpe.e(Arrays.toString(strArrF)));
        this.f40357b.c(strArrF);
    }

    public final MediaMetaData g() {
        if (!o() || this.f40357b == null) {
            return null;
        }
        if (!this.g.containsKey("local_device_id")) {
            tpe.g("AudioServiceControl", true, "return LocalMediaInfoImpl");
            return h();
        }
        MediaMetaData mediaMetaData = this.g.get("local_device_id");
        tpe.g("AudioServiceControl", true, "cache contains local, MediaMetaData=" + mediaMetaData.e());
        return mediaMetaData;
    }

    public MediaMetaData h() {
        com.xiaomi.miplay.audioclient.MediaMetaData mediaMetaDataE = this.f40357b.e();
        if (mediaMetaDataE == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(MediaMetaData.IS_LOCAL, true);
        bundle.putString(MediaMetaData.COVER_URL, mediaMetaDataE.f());
        bundle.putString("id", mediaMetaDataE.j());
        bundle.putString("packageName", mediaMetaDataE.h());
        MediaMetaData mediaMetaDataH = new MediaMetaData.b().i(mediaMetaDataE.a()).j(mediaMetaDataE.c()).k(mediaMetaDataE.d()).m(mediaMetaDataE.g()).o(mediaMetaDataE.j()).p(mediaMetaDataE.i()).l(mediaMetaDataE.e()).n(bundle).h();
        this.g.put("local_device_id", mediaMetaDataH);
        tpe.g("AudioServiceControl", true, "MediaMetaData=" + mediaMetaDataH.e());
        return mediaMetaDataH;
    }

    @SuppressLint({"NewApi"})
    public MediaMetaData i(CirculateDeviceInfo circulateDeviceInfo, boolean z) throws CirculateException {
        if (circulateDeviceInfo == null) {
            throw new CirculateException("getMediaInfo error, empty deviceInfo");
        }
        tpe.f("AudioServiceControl", "getMediaInfo, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
        return ((e96) gx3.e().a("DeviceManager")).a(circulateDeviceInfo) ? g() : m(circulateDeviceInfo, z);
    }

    @SuppressLint({"NewApi"})
    public int j(CirculateDeviceInfo circulateDeviceInfo) {
        String[] strArrF;
        tpe.f("AudioServiceControl", "getMirrorMode, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
        if (!o() || this.f40357b == null || (strArrF = com.miui.circulate.api.protocol.audio.support.a.f(circulateDeviceInfo)) == null || strArrF.length <= 0) {
            return -1;
        }
        if (!this.i.containsKey(strArrF[0])) {
            tpe.f("AudioServiceControl", "getMirrorMode, on ack, deviceId =" + tpe.e(circulateDeviceInfo.f10301a));
            this.f40357b.h(strArrF);
            return -1;
        }
        int iIntValue = this.i.get(strArrF[0]).intValue();
        tpe.f("AudioServiceControl", "getMirrorMode, use cache, deviceId =" + tpe.e(circulateDeviceInfo.f10301a) + ", result=" + iIntValue);
        return iIntValue;
    }

    @SuppressLint({"NewApi"})
    public int k(CirculateDeviceInfo circulateDeviceInfo) {
        tpe.f("AudioServiceControl", "getPlayState, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
        if (!o() || this.f40357b == null) {
            tpe.i("AudioServiceControl", "getPlayState, not available, result=-1");
            return -1;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f(circulateDeviceInfo);
        if (strArrF == null || strArrF.length == 0) {
            tpe.i("AudioServiceControl", "getPlayState, deviceId error, result=-1");
            return -1;
        }
        if (!TextUtils.equals("local_device_id", strArrF[0]) && this.h.containsKey(strArrF[0])) {
            int iIntValue = this.h.get(strArrF[0]).intValue();
            tpe.f("AudioServiceControl", "getPlayState, use cache, deviceId=" + tpe.e(circulateDeviceInfo.f10301a) + ", result=" + iIntValue);
            return iIntValue;
        }
        if (A(strArrF[0])) {
            tpe.f("AudioServiceControl", "use getPlayState2, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
            this.f40357b.j(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
        } else {
            tpe.f("AudioServiceControl", "use getPlayState, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
            this.f40357b.i(strArrF);
        }
        return -1;
    }

    @SuppressLint({"NewApi"})
    public void l(CirculateDeviceInfo circulateDeviceInfo) {
        tpe.f("AudioServiceControl", "getPosition, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
        if (!o() || this.f40357b == null) {
            tpe.i("AudioServiceControl", "getPosition, not available");
            return;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f(circulateDeviceInfo);
        if (strArrF == null || strArrF.length <= 0) {
            return;
        }
        if (z(circulateDeviceInfo)) {
            tpe.f("AudioServiceControl", "use getPosition2, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
            this.f40357b.l(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
            return;
        }
        tpe.f("AudioServiceControl", "usegetPosition, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
        this.f40357b.k(strArrF);
    }

    public final MediaMetaData m(CirculateDeviceInfo circulateDeviceInfo, boolean z) {
        if (!o() || this.f40357b == null) {
            tpe.i("AudioServiceControl", "getMediaInfo, not available");
            return null;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f(circulateDeviceInfo);
        if (strArrF == null || strArrF.length == 0) {
            tpe.i("AudioServiceControl", "getMediaInfo, deviceId error");
            return null;
        }
        if (this.g.containsKey(strArrF[0]) && !z) {
            MediaMetaData mediaMetaData = this.g.get(strArrF[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("getMediaInfo, use cache, ");
            sb.append(tpe.e(circulateDeviceInfo.f10301a));
            sb.append(", result=");
            sb.append(mediaMetaData != null ? mediaMetaData.e() : null);
            tpe.f("AudioServiceControl", sb.toString());
            return mediaMetaData;
        }
        if (strArrF.length > 0) {
            if (z(circulateDeviceInfo)) {
                tpe.f("AudioServiceControl", "use getMediaInfo2 " + tpe.e(circulateDeviceInfo.f10301a));
                this.f40357b.g(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
            } else {
                tpe.f("AudioServiceControl", "use getMediaInfo " + tpe.e(circulateDeviceInfo.f10301a));
                this.f40357b.f(strArrF);
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public int n(CirculateDeviceInfo circulateDeviceInfo) {
        String[] strArrF;
        tpe.f("AudioServiceControl", "getVolume, deviceId=" + tpe.e(circulateDeviceInfo.f10301a));
        if (!o() || this.f40357b == null || (strArrF = com.miui.circulate.api.protocol.audio.support.a.f(circulateDeviceInfo)) == null || strArrF.length <= 0) {
            return -1;
        }
        if (!this.j.containsKey(strArrF[0])) {
            this.f40357b.m(strArrF);
            tpe.f("AudioServiceControl", "getVolume, on ack, deviceId =" + tpe.e(circulateDeviceInfo.f10301a));
            return -1;
        }
        int iIntValue = this.j.get(strArrF[0]).intValue();
        tpe.f("AudioServiceControl", "getVolume, use cache," + tpe.e(circulateDeviceInfo.f10301a) + ", result=" + iIntValue);
        return iIntValue;
    }

    public boolean o() {
        return this.e.get();
    }

    public void p(List<CirculateDeviceInfo> list) {
        tpe.f("AudioServiceControl", "onNext, deviceId=" + com.miui.circulate.api.protocol.audio.support.a.d(list));
        if (list == null || list.isEmpty()) {
            return;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
        if (!o() || this.f40357b == null) {
            return;
        }
        if (z(list.get(0))) {
            tpe.f("AudioServiceControl", "use next2 " + tpe.e(list.toString()));
            this.f40357b.q(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
            return;
        }
        tpe.f("AudioServiceControl", "use onNext " + tpe.e(list.toString()));
        this.f40357b.r(strArrF);
    }

    public void q(String str, byte[] bArr) {
        wz wzVar = this.v;
        if (wzVar != null) {
            wzVar.a(str, bArr);
        }
    }

    public void r() {
        this.v = new b();
        sm1 sm1VarB = sm1.b(gx3.e().b());
        this.d = sm1VarB;
        sm1VarB.c(this.v);
        pj4 pj4VarA = this.d.a();
        this.c = pj4VarA;
        pj4VarA.c(this.w);
    }

    public void s(List<CirculateDeviceInfo> list) {
        tpe.f("AudioServiceControl", "onPrev, deviceId=" + com.miui.circulate.api.protocol.audio.support.a.d(list));
        if (list == null || list.isEmpty()) {
            return;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
        if (!o() || this.f40357b == null) {
            return;
        }
        if (z(list.get(0))) {
            tpe.f("AudioServiceControl", "use prev2, deviceId=" + tpe.e(list.toString()));
            this.f40357b.u(strArrF, com.miui.circulate.api.protocol.audio.support.a.c());
            return;
        }
        tpe.f("AudioServiceControl", "use onPrev, deviceId=" + tpe.e(list.toString()));
        this.f40357b.s(strArrF);
    }

    @SuppressLint({"WrongConstant"})
    public void t(Context context) {
        try {
            tpe.f("AudioServiceControl", "registerMisReceiver");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.xiaomi.mis.intent.action.MIS_CAR_CONNECT");
            context.registerReceiver(this.n, intentFilter, 2);
        } catch (Exception e) {
            tpe.d("AudioServiceControl", "register receiver failed", e);
        }
    }

    public void u(List<CirculateDeviceInfo> list, long j) {
        tpe.f("AudioServiceControl", "seek, deviceId=" + com.miui.circulate.api.protocol.audio.support.a.d(list));
        if (list == null || list.isEmpty()) {
            return;
        }
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
        if (!o() || this.f40357b == null) {
            return;
        }
        if (z(list.get(0))) {
            tpe.f("AudioServiceControl", "seek2, deviceId=" + tpe.e(Arrays.toString(strArrF)) + ", pos=" + j);
            this.f40357b.x(strArrF, j, com.miui.circulate.api.protocol.audio.support.a.c());
            return;
        }
        tpe.f("AudioServiceControl", "seek, deviceId=" + tpe.e(Arrays.toString(strArrF)) + ", pos=" + j);
        this.f40357b.w(strArrF, j);
    }

    public void v(boolean z) {
        this.e.set(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void w(String str, String str2, T t) {
        try {
            tpe.f("AudioServiceControl", "set state to " + str);
            switch (str) {
                case "AudioList":
                    this.f40358k.put(str2, (List) t);
                    break;
                case "LoopType":
                    this.l.put(str2, (Integer) t);
                    break;
                case "MediaMetaData":
                    this.g.put(str2, (MediaMetaData) t);
                    break;
                case "MirrorMode":
                    this.i.put(str2, (Integer) t);
                    break;
                case "PlayState":
                    this.h.put(str2, (Integer) t);
                    break;
                case "PlayCapacity":
                    this.m.put(str2, (PlayCapacity) t);
                    break;
                case "Volume":
                    this.j.put(str2, (Integer) t);
                    break;
                default:
                    break;
            }
        } catch (Exception unused) {
            tpe.i("AudioServiceControl", "error in cast");
        }
    }

    public void x(boolean z) {
        this.f = z;
    }

    public void y(List<CirculateDeviceInfo> list, int i) {
        tpe.f("AudioServiceControl", "setVolume, deviceId=" + com.miui.circulate.api.protocol.audio.support.a.d(list) + ", volume=" + i);
        String[] strArrF = com.miui.circulate.api.protocol.audio.support.a.f((CirculateDeviceInfo[]) list.toArray(new CirculateDeviceInfo[list.size()]));
        if (!o() || this.f40357b == null) {
            return;
        }
        tpe.f("AudioServiceControl", "setVolume, deviceId=" + tpe.e(Arrays.toString(strArrF)) + ", volume=" + i);
        this.f40357b.y(strArrF, i);
    }

    public boolean z(CirculateDeviceInfo circulateDeviceInfo) {
        return A(circulateDeviceInfo.f10301a);
    }
}
