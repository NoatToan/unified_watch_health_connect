package wb2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.ServerProcessingTimeoutException;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import lc.u0;

/* JADX INFO: loaded from: classes11.dex */
public class d0 extends wb2.a implements la2.a {
    public boolean A;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String[] f183973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f183974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f183975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q0 f183976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<v> f183977r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f183978t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f183979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f183980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f183981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HandlerThread f183982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f183983z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (d0.this.f183980w) {
                try {
                    d0 d0Var = d0.this;
                    if (d0Var.A) {
                        long j8 = d0Var.f183981x;
                        if (j8 > 0 && j8 + 60000 > System.currentTimeMillis()) {
                            d0.this.f183983z.postDelayed(this, 60000L);
                        } else if (d0.this.m()) {
                            d0.this.f183902a.error("Sync has been inactive for over 60 seconds. Clearing stuck sync.");
                            d0.this.x();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0 d0Var = d0.this;
            Iterator<v> it = d0Var.f183977r.iterator();
            while (it.hasNext()) {
                it.next().M();
            }
            d0Var.y();
            d0Var.B();
        }
    }

    public d0(y.b bVar, DeviceProfile deviceProfile, Context context, g0 g0Var) {
        super(bVar, deviceProfile, context, g0Var);
        this.f183973n = new String[]{"com.garmin.android.lib.connectdevicesync.ACTION_FILE_READY"};
        this.f183978t = new byte[0];
        this.f183980w = new byte[0];
        this.f183981x = 0L;
        this.f183982y = new HandlerThread("FullSyncStrategy_HandlerThread");
        this.A = false;
        this.f183976q = new q0(context);
        z zVar = new z(context, g0Var);
        b0 b0Var = new b0(context, g0Var, g0Var);
        this.f183974o = b0Var;
        p pVar = new p(context, g0Var, g0Var);
        this.f183975p = pVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zVar);
        arrayList.add(b0Var);
        arrayList.add(pVar);
        bc2.a aVar = ec2.e.f63800h;
        if (aVar != null) {
            aVar.a(context, g0Var);
            aVar.f(context, g0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        List<v> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        this.f183977r = listUnmodifiableList;
        Context context2 = this.f183906e;
        Logger logger = this.f183902a;
        logger.trace("initialize: begin");
        Iterator<v> it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            it.next().addObserver(this);
        }
        String[] strArr = this.f183973n;
        if (strArr != null) {
            IntentFilter intentFilter = new IntentFilter();
            for (String str : strArr) {
                intentFilter.addAction(str);
            }
            wb2.a.c cVar = new wb2.a.c(this);
            this.f183911j = cVar;
            a7.b.registerReceiver(context2, cVar, intentFilter, oa2.b.d(context2), null, 2);
        }
        da2.d.c(context2).f58886a.b(this);
        logger.trace("initialize: end");
        this.f183982y.start();
        this.f183983z = new Handler(this.f183982y.getLooper());
    }

    public final boolean A() {
        boolean z14 = true;
        for (v vVar : this.f183977r) {
            boolean z15 = false;
            if (vVar.H() || vVar.C()) {
                if (vVar.I() || vVar.G()) {
                    z15 = true;
                } else {
                    vVar.D();
                }
            }
            z14 &= z15;
        }
        return z14;
    }

    public final void B() {
        Logger logger = this.f183902a;
        try {
            logger.trace("terminate: begin");
            this.f183983z.removeCallbacksAndMessages(null);
            this.f183982y.quit();
            this.f183914m.shutdown();
            this.f183908g.set(true);
            t();
            da2.d.c(this.f183906e).f58886a.i(this);
            for (v vVar : this.f183977r) {
                vVar.deleteObserver(this);
                vVar.T();
            }
            logger.trace("terminate: end");
        } catch (Throwable th3) {
            logger.warn("terminate: failure", th3);
        }
    }

    @Override // wb2.a
    public final x d() {
        ServerProcessingTimeoutException serverProcessingTimeoutException;
        h hVar;
        x xVar = new x();
        xVar.f184207c = A();
        xVar.f184208d = this.f183913l;
        h hVar2 = null;
        for (v vVar : this.f183977r) {
            if ((vVar.H() || vVar.C()) && hVar2 == null) {
                hVar2 = vVar.f184172n;
            }
            if ((vVar instanceof b0) && (serverProcessingTimeoutException = ((b0) vVar).B) != null && (hVar = serverProcessingTimeoutException.failure) != null) {
                xVar.f184210f = hVar.name();
            }
        }
        if (hVar2 != null) {
            xVar.f184209e = hVar2;
            hVar2.name();
        }
        return xVar;
    }

    @Override // wb2.a
    public final Bundle e() {
        h hVar;
        h hVar2;
        h hVar3;
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("extra.sync.result.is.successful", A());
        bundle.putLong("extra.sync.result.finish.time", this.f183913l);
        b0 b0Var = this.f183974o;
        boolean zH = b0Var.H();
        p pVar = this.f183975p;
        if ((zH || b0Var.C()) && (hVar = b0Var.f184172n) != null) {
            bundle.putInt("extra.sync.result.failure.code", hVar.f184019b);
            bundle.putString("extra.sync.result.failure.message", b0Var.f184172n.f184018a);
            bundle.putInt("extra.sync.result.overall.failure.code", b0Var.f184172n.f184019b);
            bundle.putString("extra.sync.result.overall.failure.message", b0Var.f184172n.f184018a);
        } else if ((pVar.H() || pVar.C()) && (hVar3 = pVar.f184172n) != null) {
            bundle.putInt("extra.sync.result.failure.code", hVar3.f184019b);
            bundle.putString("extra.sync.result.failure.message", pVar.f184172n.f184018a);
            bundle.putInt("extra.sync.result.overall.failure.code", pVar.f184172n.f184019b);
            bundle.putString("extra.sync.result.overall.failure.message", pVar.f184172n.f184018a);
        }
        ServerProcessingTimeoutException serverProcessingTimeoutException = b0Var.B;
        if (serverProcessingTimeoutException != null && (hVar2 = serverProcessingTimeoutException.failure) != null) {
            bundle.putString("extra.sync.result.executing.warning", hVar2.name());
        }
        i iVar = pVar.B.f184078a;
        if (iVar == null) {
            return bundle;
        }
        bundle.putInt("extra.sync.result.connect.iq.install.status.code", iVar.ordinal());
        bundle.putString("extra.sync.result.connect.iq.install.status.message", pVar.B.f184078a.name());
        bundle.putString("extra.sync.result.failed.app.message.url", pVar.B.f184079b);
        bundle.putString("extra.sync.result.failed.app.message.name", pVar.B.f184080c);
        return bundle;
    }

    @Override // wb2.a
    public final a0 f() {
        a0 a0Var = new a0();
        a0Var.f184205a = j();
        a0Var.f184206b = i();
        b0 b0Var = this.f183974o;
        a0Var.f183922c = b0Var.g();
        a0Var.f183923d = b0Var.t();
        a0Var.f183924e = b0Var.f();
        a0Var.f183925f = b0Var.s();
        p pVar = this.f183975p;
        a0Var.f183926g = pVar.g();
        a0Var.f183927h = pVar.t();
        a0Var.f183928i = pVar.f();
        a0Var.f183929j = pVar.s();
        a0Var.f183930k = pVar.C;
        a0Var.f183931l = v();
        j jVarH = h();
        if (jVarH == null) {
            jVarH = j.ALWAYS_SHOW_PROGRESS;
        }
        a0Var.f183932m = jVarH.name();
        return a0Var;
    }

    @Override // wb2.a
    public final long g() {
        p pVar = this.f183975p;
        if (pVar == null) {
            return 0L;
        }
        return pVar.f184074z;
    }

    @Override // wb2.a
    public final boolean m() {
        boolean z14;
        Iterator<v> it = this.f183977r.iterator();
        boolean zF = false;
        while (it.hasNext()) {
            zF |= it.next().F();
        }
        synchronized (this.f183980w) {
            z14 = this.A || zF;
        }
        if (z14) {
            this.f183902a.debug("isSyncInProgress: YES! syncStartBroadcasted=" + this.A + "; isOperationRunning=" + zF);
        }
        return z14;
    }

    @Override // wb2.a
    public final void n(Intent intent) {
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || !"com.garmin.android.lib.connectdevicesync.ACTION_FILE_READY".equals(intent.getAction())) {
            return;
        }
        b0 b0Var = this.f183974o;
        Logger logger = b0Var.f184159a;
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            logger.error("handle: intent action is null");
            return;
        }
        action.getClass();
        if (action.equals("com.garmin.android.lib.connectdevicesync.ACTION_FILE_READY")) {
            String stringExtra = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.EXTRA_ITEM_ID");
            long longExtra = intent.getLongExtra("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_SIZE", -1L);
            byte byteExtra = intent.getByteExtra("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_TYPE", (byte) -1);
            byte byteExtra2 = intent.getByteExtra("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_SUB_TYPE", (byte) -1);
            if (TextUtils.isEmpty(stringExtra) || longExtra <= 0) {
                return;
            }
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(longExtra, "handle: Received FILE_READY event for itemId=", stringExtra, "; fileSize=");
            sbJ.append("; fileType=");
            sbJ.append((int) byteExtra);
            sbJ.append("; fileSubType=");
            sbJ.append((int) byteExtra2);
            logger.debug(sbJ.toString());
            logger.debug("handle: Adding to Work List, itemId=" + stringExtra + "; fileSize=" + longExtra + "; fileType=" + ((int) byteExtra) + "; fileSubType=" + ((int) byteExtra2));
            b0Var.f184164f.put(b0Var.e0(stringExtra), new t0(stringExtra, longExtra, byteExtra, byteExtra2, true, false));
        }
    }

    @Override // wb2.a
    public final void o(Observable observable, Object obj) {
        String action;
        v vVarZ;
        v vVarZ2;
        if (observable == null || obj == null || !(obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) obj;
        if (TextUtils.isEmpty(intent.getAction()) || (action = intent.getAction()) == null) {
            return;
        }
        if (this.f183908g.get()) {
            this.f183902a.warn("Received update after terminate");
            x();
            return;
        }
        synchronized (this.f183980w) {
            this.f183981x = System.currentTimeMillis();
        }
        boolean zE = true;
        switch (action) {
            case "com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_FINISHED":
            case "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_STARTED":
            case "com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_STARTED":
            case "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_FINISHED":
                r.f().getClass();
                if (r.f184103h.get()) {
                    oa2.b.c(this.f183906e, intent.getAction(), l(), intent.getExtras());
                    return;
                } else {
                    oa2.b.a(this.f183906e, intent.getAction(), l(), intent.getExtras());
                    return;
                }
            case "com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_DEVICE_TRANSFER_PROGRESS":
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f183912k < 500) {
                    this.f183902a.debug("Skipped transfer progress broadcast (too soon): " + intent);
                    return;
                } else {
                    this.f183912k = jCurrentTimeMillis;
                    u(this.f183975p.C);
                    return;
                }
            case "com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_DEVICE_TRANSFER_PROGRESS":
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - this.f183912k < 500) {
                    this.f183902a.debug("Skipped transfer progress broadcast (too soon): " + intent);
                    return;
                } else {
                    this.f183912k = jCurrentTimeMillis2;
                    u(false);
                    return;
                }
            default:
                if (TextUtils.isEmpty(action) || (vVarZ = z()) == null) {
                    return;
                }
                if (action.equals(vVarZ.a())) {
                    if (vVarZ.D() || this.f183908g.get()) {
                        x();
                        return;
                    } else {
                        vVarZ.execute();
                        return;
                    }
                }
                if (action.equals(vVarZ.c())) {
                    if (vVarZ.D() || this.f183908g.get()) {
                        x();
                        return;
                    }
                    synchronized (this.f183978t) {
                        this.f183979v++;
                        vVarZ2 = z();
                        break;
                    }
                    if (vVarZ2 != null) {
                        if (vVarZ2.a() != null) {
                            vVarZ2.prepare();
                            return;
                        } else {
                            vVarZ2.execute();
                            return;
                        }
                    }
                    Iterator<v> it = this.f183977r.iterator();
                    while (it.hasNext()) {
                        zE &= it.next().E();
                    }
                    if (zE) {
                        y();
                        boolean zA = A();
                        g0 g0Var = this.f183907f;
                        if (zA) {
                            ((n0) g0Var).k(da2.j.FINISHED_WITH_SUCCESS, k());
                            return;
                        } else {
                            ((n0) g0Var).k(da2.j.FINISHED_WITH_FAILURE, k());
                            return;
                        }
                    }
                    Logger logger = this.f183902a;
                    y();
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e4) {
                        logger.error(e4.getMessage(), (Throwable) e4);
                    }
                    logger.info("Restarting Sync...");
                    try {
                        p(-1L, j.SHOW_PROGRESS_ONLY_WHEN_FILES_FOUND, "5009_Restart");
                        return;
                    } catch (Exception e14) {
                        logger.error(e14.getMessage());
                        return;
                    }
                }
                return;
        }
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (k().equals(hVar.f111673a.getMacAddress())) {
            boolean zM = m();
            Logger logger = this.f183902a;
            if (!zM) {
                logger.debug("Device disconnected while sync isn't running. Cleanup strategy");
                B();
            } else {
                logger.warn("Device disconnected while sync in progress. Fail sync and then cleanup");
                this.f183983z.post(new b());
            }
        }
    }

    @Override // wb2.a
    public final void p(long j8, j jVar, String str) {
        q(j8, jVar, str, "Normal");
    }

    @Override // wb2.a
    public final void q(long j8, j jVar, String str, String str2) {
        String str3;
        this.f183902a.info("***** SYNC STARTED!!! *****");
        this.f183902a.info("ProgressVisibility=" + jVar + ", supplied downloadBitMask=" + j8);
        this.f183909h = jVar != null ? jVar : j.ALWAYS_SHOW_PROGRESS;
        p pVar = this.f183975p;
        if (jVar == null) {
            pVar.getClass();
            jVar = j.ALWAYS_SHOW_PROGRESS;
        }
        pVar.P = jVar;
        this.f183910i = str;
        this.f183913l = -1L;
        synchronized (this.f183980w) {
            this.A = true;
            this.f183981x = System.currentTimeMillis();
        }
        b();
        this.f183983z.postDelayed(new a(), 60000L);
        this.f183976q.getClass();
        q0.g();
        synchronized (this.f183978t) {
            this.f183979v = 0;
        }
        for (v vVar : this.f183977r) {
            if (vVar instanceof p) {
                int i14 = il2.e.a.f94044a[((il2.e) ec2.e.b()).f94039a.getF132628h().ordinal()];
                if (i14 == 1) {
                    str3 = "Force";
                } else if (i14 == 2) {
                    str3 = "Block";
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return;
                    }
                    str3 = "Normal";
                }
                if (TextUtils.equals(str2, "Normal")) {
                    str2 = str3;
                }
                p pVar2 = (p) vVar;
                DeviceProfile deviceProfile = this.f183905d;
                synchronized (pVar2) {
                    pVar2.A(deviceProfile);
                    pVar2.E = str2;
                    if (j8 > -1) {
                        pVar2.f184074z = j8;
                    }
                }
            } else {
                vVar.A(this.f183905d);
            }
        }
        v vVarZ = z();
        if (vVarZ != null) {
            if (vVarZ.a() != null) {
                vVarZ.prepare();
            } else {
                vVarZ.execute();
            }
        }
    }

    public final void u(boolean z14) {
        Bundle bundle = new Bundle();
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", k());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        bundle.putFloat("com.garmin.android.lib.connectdevicesync.EXTRA_TOTAL_PROGRESS_BY_FILE_SIZE", v());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY", h().name());
        if (z14) {
            bundle.putBoolean("com.garmin.android.lib.connectdevicesync.EXTRA_PROCESSING_SOFTWARE_UPDATE", z14);
        }
        r.f().getClass();
        boolean z15 = r.f184103h.get();
        Context context = this.f183906e;
        if (z15) {
            oa2.b.c(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_TRANSFER_PROGRESS", l(), bundle);
        } else {
            oa2.b.a(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_TRANSFER_PROGRESS", l(), bundle);
        }
    }

    public final float v() {
        float f14;
        b0 b0Var = this.f183974o;
        v.b bVar = b0Var.f184163e.get();
        v.b bVar2 = v.b.EXECUTING;
        Logger logger = this.f183902a;
        float f15 = 0.0f;
        if (bVar == bVar2 || bVar == v.b.EXECUTED) {
            long jG = b0Var.g();
            long jT = b0Var.t();
            f14 = jT == 0 ? 50.0f : (jG * 50.0f) / jT;
            if (f14 > 50.0f) {
                f14 = 50.0f;
            }
            logger.debug("calculateTotalProgressByFileSize: scaled uploadProgress(%)=" + f14 + ", cumulativeSize=" + jG + ", totalSize=" + jT);
        } else {
            f14 = 0.0f;
        }
        p pVar = this.f183975p;
        v.b bVar3 = pVar.f184163e.get();
        if (bVar3 == bVar2 || bVar3 == v.b.EXECUTED) {
            long jG2 = pVar.g();
            long jT2 = pVar.t();
            float f16 = jT2 == 0 ? 50.0f : (jG2 * 50.0f) / jT2;
            float f17 = f16 <= 50.0f ? f16 : 50.0f;
            logger.debug("calculateTotalProgressByFileSize: scaled downloadProgress(%)=" + f17 + ", cumulativeSize=" + jG2 + ", totalSize=" + jT2);
            f15 = f17;
        }
        float f18 = f14 + f15;
        logger.debug("calculateTotalProgressByFileSize: totalProgress(%)=" + f18);
        return f18;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045 A[PHI: r15
      0x0045: PHI (r15v8 java.lang.String) = (r15v5 java.lang.String), (r15v14 java.lang.String) binds: [B:16:0x0062, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[PHI: r5
      0x0092: PHI (r5v6 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v16 java.lang.String) binds: [B:38:0x00c9, B:35:0x00b5, B:26:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    public final void w(Bundle bundle) {
        String str;
        String strS;
        String strS2;
        String str2;
        String str3;
        String str4;
        p pVar = this.f183975p;
        b0 b0Var = this.f183974o;
        Logger logger = this.f183902a;
        StringBuilder sb3 = new StringBuilder("******************** SYNC RESULT ********************\nUpload Status=");
        int i14 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS");
        if (i14 == 0) {
            sb3.append("SUCCESSFUL");
            try {
                str = v.a.valueOf(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_SUCCESS_REASON")).f184192a;
            } catch (Exception unused) {
                str = null;
            }
            strS = wb2.a.s(str);
            if (!TextUtils.isEmpty(strS)) {
                am.j.y(sb3, " (", strS, ")");
            }
        } else if (i14 == 1) {
            sb3.append("FAILED");
            strS = wb2.a.s(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL"));
            if (!TextUtils.isEmpty(strS)) {
                am.j.y(sb3, " (", strS, ")");
            }
        } else if (i14 == 2) {
            sb3.append("NOT_STARTED");
        }
        sb3.append("\nDownload Status=");
        int i15 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS");
        if (i15 != 0) {
            if (i15 == 1) {
                sb3.append("FAILED");
                strS2 = wb2.a.s(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_DETAIL"));
                if (!TextUtils.isEmpty(strS2)) {
                    am.j.y(sb3, " (", strS2, ")");
                }
            } else if (i15 == 2) {
                sb3.append("NOT_STARTED");
            }
        } else if (bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_PARTIAL_FAILURE_COUNT", 0) == 0) {
            sb3.append("SUCCESSFUL");
            try {
                str2 = v.a.valueOf(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_SUCCESS_REASON")).f184192a;
            } catch (Exception unused2) {
                str2 = null;
            }
            strS2 = wb2.a.s(str2);
            if (!TextUtils.isEmpty(strS2)) {
                am.j.y(sb3, " (", strS2, ")");
            }
        } else {
            sb3.append("PARTIALLY_SUCCESSFUL");
            strS2 = wb2.a.s(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_SUCCESS_REASON"));
            if (!TextUtils.isEmpty(strS2)) {
                am.j.y(sb3, " (", strS2, ")");
            }
        }
        sb3.append("\nTime Sync Status=");
        int i16 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_STATUS");
        if (i16 == 0) {
            sb3.append("SUCCESSFUL");
        } else if (i16 == 1) {
            sb3.append("FAILED");
            String strS3 = wb2.a.s(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_DETAIL"));
            if (!TextUtils.isEmpty(strS3)) {
                am.j.y(sb3, " (", strS3, ")");
            }
        } else if (i16 == 2) {
            sb3.append("NOT_STARTED");
        }
        sb3.append("\nOverall Sync Status=");
        sb3.append(bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS") != 0 ? "FAILED" : "SUCCESSFUL");
        String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_EXECUTION_WARNING");
        if (!TextUtils.isEmpty(string)) {
            sb3.append("\nWarning=");
            sb3.append(string);
        }
        sb3.append("\nOrigin=");
        sb3.append(this.f183910i);
        sb3.append("\n*****************************************************\n");
        logger.info(sb3.toString());
        synchronized (b0Var) {
            str3 = b0Var.f183966v;
        }
        synchronized (pVar) {
            str4 = pVar.f183966v;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) sb3);
        if (!TextUtils.isEmpty(str3)) {
            sb4.append(str3);
        }
        sb4.append("\n*****************************************************\n");
        if (!TextUtils.isEmpty(str4)) {
            sb4.append(str4);
        }
        sb4.append("\n*****************************************************\n");
        String string2 = sb4.toString();
        v vVar = this.f183977r.get(0);
        if (i14 == 1 || i15 == 1 || i16 == 1) {
            this.f183983z.post(new e0(this, vVar, string2));
        } else {
            this.f183976q.getClass();
            ic2.a.b().a();
            p0.b().a();
        }
        String strK = vVar.k();
        if (TextUtils.isEmpty(strK)) {
            strK = vVar.k();
        }
        if (!(j.SHOW_PROGRESS_ONLY_WHEN_FILES_FOUND.equals(h()) && b0Var.G() && pVar.G()) && ((il2.e) ec2.e.b()).f94040b.j()) {
            logger.debug("Save the execution result in DeviceSyncAudit");
            l.f184055c.e(strK, sb4.toString(), ec2.e.a());
        }
    }

    public final void x() {
        for (v vVar : this.f183977r) {
            if (!vVar.E()) {
                vVar.cancel();
            }
        }
        y();
        g0 g0Var = this.f183907f;
        n0 n0Var = (n0) g0Var;
        n0Var.k(da2.j.FINISHED_WITH_FAILURE, k());
    }

    public final void y() {
        Bundle bundle;
        synchronized (this.f183980w) {
            try {
                bundle = null;
                this.f183983z.removeCallbacksAndMessages(null);
                if (this.A) {
                    this.f183913l = System.currentTimeMillis();
                    bundle = new Bundle();
                    Iterator<v> it = this.f183977r.iterator();
                    while (it.hasNext()) {
                        it.next().b(bundle);
                    }
                    w(bundle);
                    c(bundle);
                    bundle.putInt("com.garmin.android.lib.connectdevicesync.extra.EXTRA_SPECIAL_CASE_RESPONSE_ERROR_CODE", this.f183974o.f183961z);
                    this.A = false;
                    this.f183981x = 0L;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (bundle != null) {
            a(bundle);
            this.f183902a.info("***** SYNC FINISHED!!! *****");
        }
    }

    public final v z() {
        synchronized (this.f183978t) {
            try {
                int i14 = this.f183979v;
                if (i14 == Integer.MAX_VALUE) {
                    return null;
                }
                if (i14 >= this.f183977r.size()) {
                    this.f183979v = Integer.MAX_VALUE;
                    return null;
                }
                return this.f183977r.get(this.f183979v);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
