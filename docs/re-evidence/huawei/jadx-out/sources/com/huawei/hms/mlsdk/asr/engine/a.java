package com.huawei.hms.mlsdk.asr.engine;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.extractor.AacUtil;
import com.huawei.hms.ml.grs.GrsListener;
import com.huawei.hms.ml.grs.GrsRegionUtils;
import com.huawei.hms.ml.grs.GrsUtils;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.mlsdk.asr.o.f;
import com.huawei.hms.mlsdk.asr.o.g;
import com.huawei.hms.mlsdk.asr.o.h;
import com.huawei.hms.mlsdk.asr.o.i;
import com.huawei.hms.mlsdk.asr.o.j;
import com.huawei.hms.mlsdk.asr.o.n;
import com.huawei.hms.mlsdk.asr.o.o;
import com.huawei.hms.mlsdk.asr.o.q;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.operation.jsoperation.JsUtil;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReentrantLock f14364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Condition f14365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AsrEngine f14366c;
    private ArrayList d;
    private c e;
    private j f;
    private Thread g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final AtomicBoolean j;
    private long k;
    private volatile boolean l;
    private q m;
    private volatile boolean n;
    private volatile boolean o;
    private long p;
    private long q;
    private volatile boolean r;
    private boolean s;
    private volatile boolean t;
    private String u;
    private long v;
    private AtomicInteger w;
    private AtomicBoolean x;

    /* JADX INFO: renamed from: com.huawei.hms.mlsdk.asr.engine.a$a, reason: collision with other inner class name */
    final class C0154a implements GrsListener {

        /* JADX INFO: renamed from: com.huawei.hms.mlsdk.asr.engine.a$a$a, reason: collision with other inner class name */
        final class C0155a implements n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f14368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f14369b;

            C0155a(long j) {
                this.f14369b = j;
            }

            @Override // com.huawei.hms.mlsdk.asr.o.n
            public final void a() {
                SmartLogger.i("AsrProcessor", "onOpen");
                a.this.w.set(-1);
                if (a.this.f14366c.isRecognizerLong() && a.this.x.get()) {
                    Iterator it = a.this.d.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).onState(43);
                    }
                }
                boolean z = true;
                if (!a.this.x.get()) {
                    a.this.x.set(true);
                }
                i iVar = new i();
                iVar.m();
                iVar.a(a.this.f14366c.getEngineConfig().getLanguage());
                iVar.b(Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND));
                iVar.a((Integer) 16);
                iVar.a(a.this.f14366c.getEngineConfig().getEnablePunctuation());
                iVar.c(a.this.f14366c.getEngineConfig().getEnableSilenceDetection());
                iVar.c(a.this.f14366c.getEngineConfig().getSilenceDurationThreshold());
                iVar.e(Integer.valueOf(a.this.f14366c.getEngineConfig().getVadStartMuteDuration()));
                iVar.d(Integer.valueOf(a.this.f14366c.getEngineConfig().getVadEndMuteDuration()));
                if (a.this.f14366c.isRecognizerLong()) {
                    iVar.d(Boolean.valueOf(a.this.f14366c.getEngineConfig().isWordTimeOffset()));
                    iVar.b(Boolean.valueOf(a.this.f14366c.getEngineConfig().isSentenceTimeOffset()));
                }
                iVar.b(a.this.f14366c.getEngineConfig().getScenes());
                StringBuilder sb = new StringBuilder(701);
                sb.append("{\"command\":\"START\", \"audioConfig\":{\"encoding\":\"");
                sb.append(iVar.f());
                sb.append("\",\"languageCode\":\"");
                sb.append(iVar.g());
                sb.append("\",\"sampleRate\":");
                sb.append(iVar.h());
                sb.append(",\"bitDepth\":");
                sb.append(iVar.a());
                if (iVar.b() != null) {
                    sb.append(",\"enablePunctuation\":");
                    sb.append(iVar.b());
                }
                if (iVar.e() != null) {
                    sb.append(",\"enableWordTimeOffset\":");
                    sb.append(iVar.e());
                }
                if (iVar.c() != null) {
                    sb.append(",\"enableSentenceTimeOffset\":");
                    sb.append(iVar.c());
                }
                if (iVar.l() != null) {
                    sb.append(",\"vadStartMuteDuration\":");
                    sb.append(iVar.l());
                }
                if (iVar.k() != null) {
                    sb.append(",\"vadEndMuteDuration\":");
                    sb.append(iVar.k());
                }
                if (iVar.i() != null) {
                    sb.append(",\"scene\":\"");
                    sb.append(iVar.i());
                    sb.append("\"");
                }
                if (iVar.d() != null || iVar.j() != null) {
                    sb.append(",\"metadata\":{");
                    if (iVar.d() != null) {
                        sb.append("\"enableSilenceDetection\":");
                        sb.append(iVar.d());
                    } else {
                        z = false;
                    }
                    if (iVar.j() != null) {
                        if (z) {
                            sb.append(",");
                        }
                        sb.append("\"silenceDurationThreshold\":");
                        sb.append(iVar.j());
                    }
                    sb.append("}");
                }
                sb.append("}}");
                String string = sb.toString();
                SmartLogger.i("AsrProcessor", "send start ");
                if (a.this.m != null) {
                    a.this.m.a(string);
                }
            }

            @Override // com.huawei.hms.mlsdk.asr.o.n
            public final void b() {
                SmartLogger.i("AsrProcessor", "reconnect");
            }

            @Override // com.huawei.hms.mlsdk.asr.o.n
            public final void b(int i, String str) {
                a.this.w.set(i);
                SmartLogger.i("AsrProcessor", "closing:" + i + "," + str);
                if (!a.this.f14366c.isRecognizerLong()) {
                    if (i != 0) {
                        if (3001 == i) {
                            a.a(a.this, 44, "Authentication failed.", Integer.valueOf(i));
                            return;
                        } else {
                            a.a(a.this, 40, "Service unavailable", Integer.valueOf(i));
                            return;
                        }
                    }
                    return;
                }
                a.this.l = true;
                a.this.a(false);
                if (a.a(a.this, i)) {
                    for (e eVar : a.this.d) {
                        eVar.onResult(new AsrResult(5, null, "", true));
                        eVar.onState(42);
                    }
                    a.this.m.d();
                    return;
                }
                Iterator it = a.this.d.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).onResult(new AsrResult(8, null, "", true));
                }
                Bundle bundle = new Bundle();
                if (3001 == i) {
                    bundle.putInt("subErrorCode", 3001);
                    Iterator it2 = a.this.d.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).a(new AsrError(44, str, bundle));
                    }
                    return;
                }
                bundle.putInt("subErrorCode", i);
                Iterator it3 = a.this.d.iterator();
                while (it3.hasNext()) {
                    ((e) it3.next()).a(new AsrError(40, str, bundle));
                }
            }

            @Override // com.huawei.hms.mlsdk.asr.o.n
            public final void a(String str) {
                SmartLogger.i("AsrProcessor", "onMessage:");
                if (a.this.t) {
                    SmartLogger.i("AsrProcessor", "although receive message, but Destroy() is called");
                    return;
                }
                try {
                    SmartLogger.d("AsrProcessor", "onMessage text: " + str);
                    h hVarA = h.a(str);
                    String strC = hVarA.c();
                    if (!"0".equalsIgnoreCase(strC)) {
                        a.a(a.this, 40, "Service unavailable", Integer.valueOf(Integer.parseInt(strC)));
                        return;
                    }
                    int i = 0;
                    if ("START".equalsIgnoreCase(hVarA.a())) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14369b;
                        Bundle bundle = new Bundle();
                        bundle.putInt("chainBuildingDelay", (int) jCurrentTimeMillis);
                        SmartLogger.i("AsrProcessor", "chainBuildingDelay: " + jCurrentTimeMillis);
                        com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 8, bundle);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = a.this.d.iterator();
                        while (it.hasNext()) {
                            ((e) it.next()).a(jElapsedRealtime);
                        }
                        a aVar = a.this;
                        aVar.e = new c(aVar, i);
                        a.this.e.a(Long.valueOf(jElapsedRealtime));
                        a.this.a(true);
                        if (a.this.g == null) {
                            a.this.h.set(true);
                            a.this.g = new Thread(new d(a.this, i), "InnerProcessRunnable");
                            a.this.g.start();
                            return;
                        }
                        return;
                    }
                    if (CommonConstant.RETKEY.STATUS.equalsIgnoreCase(hVarA.a())) {
                        JSONObject jSONObjectB = hVarA.b();
                        g gVar = new g();
                        if (jSONObjectB != null && jSONObjectB.has("silenceDetected")) {
                            gVar.a(jSONObjectB.getBoolean("silenceDetected"));
                        }
                        if (gVar.a()) {
                            a.this.s = true;
                            SmartLogger.i("AsrProcessor", "receive silence=true");
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("speechEndTime", System.currentTimeMillis());
                            SmartLogger.i("AsrProcessor", "isSilenceDetected speechEndTime: " + System.currentTimeMillis());
                            com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 2, bundle2);
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            if (a.this.f14366c.isRecognizerLong()) {
                                return;
                            }
                            Iterator it2 = a.this.d.iterator();
                            while (it2.hasNext()) {
                                ((e) it2.next()).b(jElapsedRealtime2);
                            }
                            return;
                        }
                        return;
                    }
                    if (JsUtil.ServiceType.DATA.equalsIgnoreCase(hVarA.a())) {
                        if (a.this.r) {
                            a.this.r = false;
                            Long lE = com.huawei.hms.mlsdk.asr.o.e.b().e(a.this.u);
                            if (lE != null) {
                                SmartLogger.d("AsrProcessor", "getSpeechStartTime: " + lE);
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - lE.longValue();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt("firstWordCost", (int) jCurrentTimeMillis2);
                                com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 3, bundle3);
                                SmartLogger.i("AsrProcessor", "firstWordCost: " + jCurrentTimeMillis2);
                            }
                            a.this.q = System.currentTimeMillis() - a.this.p;
                            SmartLogger.i("AsrProcessor", "mSendFinishDelayTime is " + a.this.q + "ms");
                            this.f14368a = System.currentTimeMillis();
                        } else {
                            SmartLogger.d("AsrProcessor", "time of between receive data is: " + (System.currentTimeMillis() - this.f14368a) + "ms");
                            this.f14368a = System.currentTimeMillis();
                        }
                        f fVarA = h.a(hVarA.b());
                        if (a.this.f14366c.isRecognizerLong()) {
                            AsrResult asrResult = new AsrResult(5, null, fVarA.c(), fVarA.e());
                            asrResult.setSentenceOffsetList(fVarA.b());
                            asrResult.setWordOffsetList(fVarA.d());
                            Iterator it3 = a.this.d.iterator();
                            while (it3.hasNext()) {
                                ((e) it3.next()).onResult(asrResult);
                            }
                            return;
                        }
                        if ((fVarA.c() == null || "".equals(fVarA.c())) && !fVarA.a()) {
                            if (a.this.f14366c.hasResult()) {
                                a.a(a.this, 6, "Cannot understand", 1003);
                                return;
                            }
                            return;
                        }
                        if (!fVarA.a()) {
                            Iterator it4 = a.this.d.iterator();
                            while (it4.hasNext()) {
                                ((e) it4.next()).onResult(new AsrResult(5, null, fVarA.c(), false));
                            }
                            return;
                        }
                        Bundle bundle4 = new Bundle();
                        if (!a.this.s && com.huawei.hms.mlsdk.asr.o.e.b().d(a.this.u) != null) {
                            long jCurrentTimeMillis3 = System.currentTimeMillis() - com.huawei.hms.mlsdk.asr.o.e.b().d(a.this.u).longValue();
                            bundle4.putInt("lastWordCost", (int) jCurrentTimeMillis3);
                            SmartLogger.i("AsrProcessor", "lastWordCost: " + jCurrentTimeMillis3);
                            com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 4, bundle4);
                        }
                        SmartLogger.i("AsrProcessor", "result.getIsFinal(): " + fVarA.a() + " isFinished: " + a.this.l);
                        a.this.a(false);
                        a.this.h.set(false);
                        for (e eVar : a.this.d) {
                            if (!a.this.o) {
                                a.this.o = true;
                                SmartLogger.d("AsrProcessor", "onMessage: result.mHasCallOnResult()");
                                eVar.onResult(new AsrResult(8, null, fVarA.c(), true));
                            }
                        }
                    }
                } catch (JSONException unused) {
                    a.a(a.this, 40, "Service unavailable", 1003);
                }
            }

            @Override // com.huawei.hms.mlsdk.asr.o.n
            public final void a(int i, String str) {
                SmartLogger.i("AsrProcessor", "onClosed: code: " + i + "reason: " + str);
            }

            @Override // com.huawei.hms.mlsdk.asr.o.n
            public final void a(Throwable th) {
                SmartLogger.e("AsrProcessor", "onFailure socket error: " + th.getMessage() + ", " + th.getClass().getSimpleName());
                if (!a.this.f14366c.isRecognizerLong() || a.this.m == null || a.this.m.c() || (!(th instanceof UnknownHostException) && !(th instanceof SSLException) && !(th instanceof ConnectException))) {
                    if (a.this.f14366c.isRecognizerLong() && a.this.i.get()) {
                        a aVar = a.this;
                        if (a.a(aVar, aVar.w.get())) {
                            SmartLogger.i("AsrProcessor", "onFailure socket already reconnect in onClosing");
                            return;
                        }
                    }
                    if (!(th instanceof IOException) || !a.q(a.this)) {
                        if (a.this.l || a.this.s) {
                            return;
                        }
                        SmartLogger.i("AsrProcessor", th.getMessage() + " isFinished=" + a.this.l);
                        a.a(a.this, 40, "Service unavailable", 1003);
                        return;
                    }
                    a.a(a.this, 7, "No network", null);
                    return;
                }
                for (e eVar : a.this.d) {
                    eVar.onResult(new AsrResult(5, null, "", true));
                    eVar.onState(42);
                }
                a.this.m.d();
            }
        }

        C0154a() {
        }

        @Override // com.huawei.hms.ml.grs.GrsListener
        public final void onAsynGrsUrls(List<String> list) {
            String str;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                SmartLogger.i("AsrProcessor", "url:" + next, true);
                if (!next.startsWith("ws://") && !next.startsWith("wss://")) {
                    next = "wss://".concat(next);
                }
                if (a.this.f14366c.isRecognizerLong()) {
                    str = next + AsrConstants.AsrGrs.ASR_LONG_URL;
                } else {
                    str = next + AsrConstants.AsrGrs.ASR_SHORT_URL;
                }
                arrayList.add(str);
            }
            if (a.this.m == null) {
                SmartLogger.i("AsrProcessor", "create WebSocketClient");
                a.this.m = new q(a.this.f14366c.isRecognizerLong(), arrayList);
            }
            a.this.m.a(new C0155a(System.currentTimeMillis()));
            if (a.this.m.b()) {
                return;
            }
            SmartLogger.i("AsrProcessor", "begin to start connect ");
            a.this.m.e();
        }
    }

    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            String str = "after send finish later";
            boolean zHasNext = false;
            try {
                Thread.sleep(a.this.q);
                a.this.a(false);
                a.this.h.set(false);
                SmartLogger.i("AsrProcessor", "after send finish later");
                Iterator it = a.this.d.iterator();
                while (true) {
                    if (!zHasNext) {
                        break;
                    }
                    e eVar = (e) it.next();
                    if (!a.this.o) {
                        a.this.o = true;
                        SmartLogger.i("AsrProcessor", "after send finish " + a.this.q + " ms later but don't receive response, call onResult");
                        eVar.onResult(new AsrResult(8));
                    }
                }
            } catch (InterruptedException e) {
                SmartLogger.e("AsrProcessor", e.getMessage());
                a.this.a(false);
                a.this.h.set(false);
                SmartLogger.i("AsrProcessor", "after send finish later");
                Iterator it2 = a.this.d.iterator();
                while (true) {
                    if (!zHasNext) {
                        break;
                    }
                    e eVar2 = (e) it2.next();
                    if (!a.this.o) {
                        a.this.o = true;
                        SmartLogger.i("AsrProcessor", "after send finish " + a.this.q + " ms later but don't receive response, call onResult");
                        eVar2.onResult(new AsrResult(8));
                    }
                }
            } finally {
                a.this.a(zHasNext);
                a.this.h.set(zHasNext);
                SmartLogger.i("AsrProcessor", str);
                for (e eVar3 : a.this.d) {
                    if (!a.this.o) {
                        a.this.o = true;
                        SmartLogger.i("AsrProcessor", "after send finish " + a.this.q + " ms later but don't receive response, call onResult");
                        eVar3.onResult(new AsrResult(8));
                    }
                }
            }
        }
    }

    public interface e {
        void a(long j);

        void a(AsrError asrError);

        void b(long j);

        void onResult(AsrResult asrResult);

        void onState(int i);
    }

    public a(AsrEngine asrEngine) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f14364a = reentrantLock;
        this.f14365b = reentrantLock.newCondition();
        this.d = new ArrayList();
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = 0L;
        this.l = false;
        this.m = null;
        this.n = true;
        this.o = false;
        this.p = 0L;
        this.q = 0L;
        this.r = true;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v = 0L;
        this.w = new AtomicInteger(-1);
        this.x = new AtomicBoolean(false);
        this.f14366c = asrEngine;
        this.f = new j(asrEngine.getEngineConfig().getRecognizeDuration() * 32);
        if (a()) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(new AsrError(7, "No network", null));
            }
            this.n = false;
        }
    }

    static /* synthetic */ boolean q(a aVar) {
        aVar.getClass();
        return a();
    }

    static /* synthetic */ long w(a aVar) {
        long j = aVar.k + 1;
        aVar.k = j;
        return j;
    }

    static boolean x(a aVar) {
        aVar.getClass();
        return o.a() == 3;
    }

    /* JADX INFO: loaded from: classes34.dex */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f14372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14373b;

        private c() {
            this.f14373b = 0;
        }

        final void a(Long l) {
            this.f14372a = l;
            this.f14373b = 0;
        }

        final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long.valueOf(jElapsedRealtime).getClass();
            this.f14373b = (int) (jElapsedRealtime - this.f14372a.longValue());
        }

        final boolean a() {
            return this.f14373b > a.this.f14366c.getEngineConfig().getMaxAudioDuration();
        }

        /* synthetic */ c(a aVar, int i) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14375a;

        private d() {
            this.f14375a = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar;
            a aVar2;
            while (a.this.h.get()) {
                a.this.f14364a.lock();
                try {
                    if (!a.this.i.get()) {
                        try {
                            try {
                                a.this.j.set(true);
                                SmartLogger.d("AsrProcessor", "InnerProcessRunnable begin waiting because of isActive is false");
                                a.this.f14365b.await();
                                SmartLogger.d("AsrProcessor", "InnerProcessRunnable awake from isActive is false");
                                aVar = a.this;
                            } catch (Throwable th) {
                                a.this.j.set(false);
                                throw th;
                            }
                        } catch (InterruptedException e) {
                            SmartLogger.e("AsrProcessor", "await failed" + e.getMessage());
                            aVar = a.this;
                        }
                        aVar.j.set(false);
                    }
                    a.this.e.b();
                    if (a.this.e.a()) {
                        SmartLogger.i("AsrProcessor", "one minutes later after receiving start, and send finish");
                        a.this.c();
                        a.this.f14364a.unlock();
                        break;
                    }
                    byte[] bArrB = a.this.f.b();
                    while (a.this.h.get() && bArrB != null && bArrB.length == 0) {
                        try {
                            try {
                                a.this.j.set(true);
                                SmartLogger.d("AsrProcessor", "InnerProcessRunnable waiting: isRunning.get(): " + a.this.h.get() + "block.length: " + bArrB.length);
                                a.this.f14365b.await();
                                SmartLogger.d("AsrProcessor", "InnerProcessRunnable awake from isRunning.get()");
                                bArrB = a.this.f.b();
                                aVar2 = a.this;
                            } catch (InterruptedException e2) {
                                SmartLogger.e("AsrProcessor", "await failed" + e2.getMessage());
                                aVar2 = a.this;
                            }
                            aVar2.j.set(false);
                        } catch (Throwable th2) {
                            a.this.j.set(false);
                            throw th2;
                        }
                    }
                    if (a.this.h.get() && a.this.i.get()) {
                        byte[] bArrA = new com.huawei.hms.mlsdk.asr.o.c(a.w(a.this), bArrB).a();
                        SmartLogger.i("AsrProcessor", "send data in thread, messageSeqNo: " + a.this.k);
                        if (a.this.m != null) {
                            a.this.m.a(bArrA);
                        }
                        if (this.f14375a) {
                            a.this.p = System.currentTimeMillis();
                            SmartLogger.i("AsrProcessor", "mTimeOfSendFirstData is " + a.this.p);
                            this.f14375a = false;
                            if (a.x(a.this)) {
                                Iterator it = a.this.d.iterator();
                                while (it.hasNext()) {
                                    ((e) it.next()).onState(9);
                                }
                            }
                        }
                        int i = (int) a.this.k;
                        int i2 = (int) a.this.k;
                        Bundle bundle = new Bundle();
                        bundle.putInt("voiceStreamTime", i * 200);
                        bundle.putInt("uploadVoiceSize", i2 * 6400);
                        bundle.putLong("sendFinalDataTime", System.currentTimeMillis());
                        com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 5, bundle);
                        com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 6, bundle);
                        com.huawei.hms.mlsdk.asr.o.e.b().a(a.this.u, 11, bundle);
                        a.this.v = System.currentTimeMillis();
                    }
                    a.this.f14364a.unlock();
                } catch (Throwable th3) {
                    a.this.f14364a.unlock();
                    throw th3;
                }
            }
            SmartLogger.i("AsrProcessor", "InnerProcessRunnable is over");
        }

        /* synthetic */ d(a aVar, int i) {
            this();
        }
    }

    private void f() {
        this.f14364a.lock();
        try {
            this.f14365b.signal();
        } finally {
            this.f14364a.unlock();
        }
    }

    public final long d() {
        return this.v;
    }

    public final boolean e() {
        return this.n;
    }

    final void g() {
        synchronized (this) {
            if (!this.l) {
                this.l = true;
                a(false);
                this.h.set(false);
                com.huawei.hms.mlsdk.asr.o.b bVar = new com.huawei.hms.mlsdk.asr.o.b();
                bVar.b();
                StringBuilder sb = new StringBuilder(23);
                sb.append("{ \"command\":\"");
                sb.append(bVar.a());
                sb.append("\"}");
                String string = sb.toString();
                q qVar = this.m;
                if (qVar != null) {
                    qVar.a(string);
                }
            }
        }
    }

    public final void h() {
        synchronized (this) {
            if (!this.n) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(new AsrError(7, "No network", null));
                }
                return;
            }
            GrsUtils.setGrsListener(new C0154a());
            String grsCountryCode = GrsRegionUtils.getGrsCountryCode();
            SmartLogger.i("AsrProcessor", "Grs-CountryCode:" + grsCountryCode);
            if (grsCountryCode != null) {
                GrsUtils.getAsrVisionSearchUrls(GrsUtils.initGrsVisionSearchClientWithCountry(MLApplication.getInstance().getAppContext(), grsCountryCode));
            } else {
                GrsUtils.getAsrUrls(MLApplication.getInstance().getAppContext(), false);
            }
        }
    }

    public final void b() {
        synchronized (this) {
            this.t = true;
            j jVar = this.f;
            if (jVar != null) {
                jVar.a();
            }
            a(false);
            this.h.set(false);
            f();
            q qVar = this.m;
            if (qVar != null) {
                qVar.f();
            }
        }
    }

    public final void c() {
        synchronized (this) {
            if (!this.l) {
                this.l = true;
                a(false);
                this.h.set(false);
                byte[] bArrB = this.f.b();
                while (bArrB != null && bArrB.length > 0) {
                    long j = this.k + 1;
                    this.k = j;
                    byte[] bArrA = new com.huawei.hms.mlsdk.asr.o.c(j, bArrB).a();
                    SmartLogger.i("AsrProcessor", "send data in finish");
                    q qVar = this.m;
                    if (qVar != null) {
                        qVar.a(bArrA);
                    }
                    bArrB = this.f.b();
                }
                com.huawei.hms.mlsdk.asr.o.b bVar = new com.huawei.hms.mlsdk.asr.o.b();
                bVar.b();
                StringBuilder sb = new StringBuilder(23);
                sb.append("{ \"command\":\"");
                sb.append(bVar.a());
                sb.append("\"}");
                String string = sb.toString();
                if (this.m != null) {
                    SmartLogger.i("AsrProcessor", "send finish");
                    this.m.a(string);
                }
                if (this.q < 2000) {
                    this.q = 2000L;
                }
                new Thread(new b(), "sendFinishThread").start();
            }
        }
    }

    static void a(a aVar, int i, String str, Integer num) {
        synchronized (aVar) {
            SmartLogger.i("AsrProcessor", "onAbnormal");
            aVar.l = true;
            aVar.a(false);
            aVar.h.set(false);
            if (num != null && num.intValue() == 3015) {
                for (e eVar : aVar.d) {
                    SmartLogger.i("AsrProcessor", "one minute timeout");
                    eVar.onResult(new AsrResult(8));
                }
            } else {
                Bundle bundle = new Bundle();
                if (num != null) {
                    bundle.putInt("subErrorCode", num.intValue());
                }
                Iterator it = aVar.d.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(new AsrError(i, str, bundle));
                }
            }
        }
    }

    public final void a(e eVar) {
        this.d.add(eVar);
    }

    public final void a(byte[] bArr) {
        this.f.a(bArr);
        if (!this.j.get() || this.f.c() <= 0) {
            return;
        }
        SmartLogger.d("AsrProcessor", "setInput(byte[] input):notify InnerProcessRunnable");
        f();
    }

    public final void a(byte[] bArr, boolean z) {
        this.f.a(bArr);
        if (this.j.get() && this.f.c() > 0) {
            SmartLogger.d("AsrProcessor", "setInputForWriteAudio(byte[] input):notify InnerProcessRunnable");
            f();
        }
        if (z) {
            com.huawei.hms.mlsdk.asr.o.b bVar = new com.huawei.hms.mlsdk.asr.o.b();
            bVar.b();
            StringBuilder sb = new StringBuilder(23);
            sb.append("{ \"command\":\"");
            sb.append(bVar.a());
            sb.append("\"}");
            String string = sb.toString();
            q qVar = this.m;
            if (qVar != null) {
                qVar.a(string);
            }
        }
    }

    private static boolean a() {
        int iA = o.a();
        return iA == 1 || iA == 2;
    }

    public final void a(boolean z) {
        this.f14364a.lock();
        try {
            this.i.set(z);
            if (this.j.get()) {
                f();
            }
        } finally {
            this.f14364a.unlock();
        }
    }

    public final void a(String str) {
        this.u = str;
    }

    static boolean a(a aVar, int i) {
        q qVar = aVar.m;
        if (qVar == null || qVar.c()) {
            return false;
        }
        return 3018 == i || 3017 == i || 3016 == i;
    }
}
