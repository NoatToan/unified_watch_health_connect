package wb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Observable;

/* JADX INFO: loaded from: classes11.dex */
public class e extends a implements la2.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f183986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f183987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f183988p;

    public e(y.b bVar, DeviceProfile deviceProfile, Context context, g0 g0Var) {
        super(bVar, deviceProfile, context, g0Var);
        this.f183988p = false;
        d dVar = new d(deviceProfile, g0Var);
        this.f183987o = dVar;
        b0 b0Var = new b0(context, dVar, g0Var);
        this.f183986n = b0Var;
        Logger logger = this.f183902a;
        logger.trace("initialize: begin");
        b0Var.addObserver(this);
        da2.d.c(this.f183906e).f58886a.b(this);
        logger.trace("initialize: end");
    }

    @Override // wb2.a
    public final x d() {
        x xVar = new x();
        xVar.f184207c = v();
        xVar.f184208d = this.f183913l;
        b0 b0Var = this.f183986n;
        h hVar = b0Var.H() ? b0Var.f184172n : null;
        if (hVar != null) {
            xVar.f184209e = hVar;
            hVar.name();
        }
        return xVar;
    }

    @Override // wb2.a
    public final Bundle e() {
        h hVar;
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("extra.sync.result.is.successful", v());
        bundle.putLong("extra.sync.result.finish.time", this.f183913l);
        b0 b0Var = this.f183986n;
        if (b0Var.H() && (hVar = b0Var.f184172n) != null) {
            bundle.putInt("extra.sync.result.failure.code", hVar.f184019b);
            bundle.putString("extra.sync.result.failure.message", b0Var.f184172n.f184018a);
            bundle.putInt("extra.sync.result.overall.failure.code", b0Var.f184172n.f184019b);
            bundle.putString("extra.sync.result.overall.failure.message", b0Var.f184172n.f184018a);
        }
        return bundle;
    }

    @Override // wb2.a
    public final a0 f() {
        float f14;
        a0 a0Var = new a0();
        a0Var.f184205a = j();
        a0Var.f184206b = i();
        b0 b0Var = this.f183986n;
        a0Var.f183922c = b0Var.g();
        a0Var.f183923d = b0Var.t();
        a0Var.f183924e = b0Var.f();
        a0Var.f183925f = b0Var.s();
        if (b0Var.H()) {
            long jG = b0Var.g();
            long jT = b0Var.t();
            float f15 = jT == 0 ? 100.0f : (jG * 100.0f) / jT;
            f14 = f15 <= 100.0f ? f15 : 100.0f;
            this.f183902a.debug("uploadProgress(%)=" + f14 + ", cumulativeSize=" + jG + ", totalSize=" + jT);
        } else {
            f14 = 0.0f;
        }
        a0Var.f183931l = f14;
        j jVarH = h();
        if (jVarH == null) {
            jVarH = j.ALWAYS_SHOW_PROGRESS;
        }
        a0Var.f183932m = jVarH.name();
        return a0Var;
    }

    @Override // wb2.a
    public final boolean m() {
        return this.f183986n.F();
    }

    @Override // wb2.a
    public final void n(Intent intent) {
    }

    @Override // wb2.a
    public final void o(Observable observable, Object obj) {
        if (obj == null || !(obj instanceof Intent)) {
            return;
        }
        String action = ((Intent) obj).getAction();
        if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_PREPARED".equals(action)) {
            this.f183986n.execute();
            return;
        }
        if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_EXECUTED".equals(action)) {
            boolean zV = v();
            g0 g0Var = this.f183907f;
            if (zV) {
                n0 n0Var = (n0) g0Var;
                n0Var.k(da2.j.FINISHED_WITH_SUCCESS, k());
            } else {
                n0 n0Var2 = (n0) g0Var;
                n0Var2.k(da2.j.FINISHED_WITH_FAILURE, k());
            }
            u();
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
        Logger logger = this.f183902a;
        logger.warn("onDeviceDisconnected");
        b0 b0Var = this.f183986n;
        b0Var.M();
        u();
        logger.trace("terminate: begin");
        this.f183914m.shutdown();
        this.f183908g.set(true);
        t();
        da2.d.c(this.f183906e).f58886a.i(this);
        b0Var.deleteObserver(this);
        b0Var.T();
        logger.trace("terminate: end");
    }

    @Override // wb2.a
    public final void p(long j8, j jVar, String str) {
        Logger logger = this.f183902a;
        logger.info("***** SYNC STARTED!!! *****");
        logger.debug("ProgressVisibility=" + jVar + ", supplied downloadBitMask=" + j8);
        if (jVar == null) {
            jVar = j.ALWAYS_SHOW_PROGRESS;
        }
        this.f183909h = jVar;
        this.f183910i = str;
        this.f183913l = -1L;
        this.f183988p = true;
        b();
        DeviceProfile deviceProfile = this.f183905d;
        b0 b0Var = this.f183986n;
        b0Var.A(deviceProfile);
        b0Var.prepare();
    }

    @Override // wb2.a
    public final void q(long j8, j jVar, String str, String str2) {
        p(j8, jVar, str);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void u() {
        int i14;
        h hVar;
        StringBuilder sb3;
        int i15;
        String str;
        String strS;
        String str2;
        StringBuilder sb4;
        String strK;
        String strS2;
        Logger logger = this.f183902a;
        b0 b0Var = this.f183986n;
        if (this.f183988p) {
            this.f183913l = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            if (!b0Var.H()) {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 2);
            } else {
                if (!b0Var.I()) {
                    if (b0Var.G()) {
                        bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 0);
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_SUCCESS_REASON", v.a.NO_ITEM_TO_PROCESS.name());
                    } else if (b0Var.D()) {
                        bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 1);
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TYPE", b0Var.q());
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL", b0Var.o());
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TRACE", b0Var.p());
                        hVar = b0Var.f184172n;
                        i14 = 0;
                    } else {
                        bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 1);
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TYPE", v.a.ERROR_PRIOR_TO_EXECUTE.name());
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL", b0Var.o());
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TRACE", b0Var.p());
                        i14 = 0;
                        hVar = null;
                    }
                    bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", i14 ^ 1);
                    if (hVar != null) {
                        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE", hVar.name());
                    }
                    sb3 = new StringBuilder("******************** SYNC RESULT ********************\nUpload Status=");
                    i15 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS");
                    if (i15 != 0) {
                        sb3.append("SUCCESSFUL");
                        try {
                            str = v.a.valueOf(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_SUCCESS_REASON")).f184192a;
                        } catch (Exception unused) {
                            str = null;
                        }
                        strS = a.s(str);
                        if (!TextUtils.isEmpty(strS)) {
                            am.j.y(sb3, " (", strS, ")");
                        }
                    } else if (i15 != 1) {
                        sb3.append("FAILED");
                        strS2 = a.s(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL"));
                        if (!TextUtils.isEmpty(strS2)) {
                            am.j.y(sb3, " (", strS2, ")");
                        }
                    } else if (i15 == 2) {
                        sb3.append("NOT_STARTED");
                    }
                    sb3.append("\nOverall Sync Status=");
                    sb3.append(bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS") != 0 ? "FAILED" : "SUCCESSFUL");
                    sb3.append("\nOrigin=");
                    sb3.append(this.f183910i);
                    sb3.append("\n*****************************************************\n");
                    logger.info(sb3.toString());
                    synchronized (b0Var) {
                        str2 = b0Var.f183966v;
                    }
                    sb4 = new StringBuilder();
                    sb4.append((CharSequence) sb3);
                    if (!TextUtils.isEmpty(str2)) {
                        sb4.append(str2);
                    }
                    sb4.append("\n*****************************************************\n");
                    strK = b0Var.k();
                    if (TextUtils.isEmpty(strK)) {
                        strK = b0Var.k();
                    }
                    if (((il2.e) ec2.e.b()).f94040b.j()) {
                        logger.debug("Save the execution result in DeviceSyncAudit");
                        l.f184055c.e(strK, sb4.toString(), ec2.e.a());
                    }
                    c(bundle);
                    bundle.putInt("com.garmin.android.lib.connectdevicesync.extra.EXTRA_SPECIAL_CASE_RESPONSE_ERROR_CODE", b0Var.f183961z);
                    a(bundle);
                    this.f183988p = false;
                    logger.info("***** SYNC FINISHED!!! *****");
                }
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 0);
            }
            i14 = 1;
            hVar = null;
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", i14 ^ 1);
            if (hVar != null) {
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE", hVar.name());
            }
            sb3 = new StringBuilder("******************** SYNC RESULT ********************\nUpload Status=");
            i15 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS");
            if (i15 != 0) {
                sb3.append("SUCCESSFUL");
                str = v.a.valueOf(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_SUCCESS_REASON")).f184192a;
                strS = a.s(str);
                if (!TextUtils.isEmpty(strS)) {
                    am.j.y(sb3, " (", strS, ")");
                }
            } else if (i15 != 1) {
                sb3.append("FAILED");
                strS2 = a.s(bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL"));
                if (!TextUtils.isEmpty(strS2)) {
                    am.j.y(sb3, " (", strS2, ")");
                }
            } else if (i15 == 2) {
                sb3.append("NOT_STARTED");
            }
            sb3.append("\nOverall Sync Status=");
            sb3.append(bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS") != 0 ? "FAILED" : "SUCCESSFUL");
            sb3.append("\nOrigin=");
            sb3.append(this.f183910i);
            sb3.append("\n*****************************************************\n");
            logger.info(sb3.toString());
            synchronized (b0Var) {
                str2 = b0Var.f183966v;
                sb4 = new StringBuilder();
                sb4.append((CharSequence) sb3);
                if (!TextUtils.isEmpty(str2)) {
                    sb4.append(str2);
                }
                sb4.append("\n*****************************************************\n");
                strK = b0Var.k();
                if (TextUtils.isEmpty(strK)) {
                    strK = b0Var.k();
                }
                if (((il2.e) ec2.e.b()).f94040b.j()) {
                    logger.debug("Save the execution result in DeviceSyncAudit");
                    l.f184055c.e(strK, sb4.toString(), ec2.e.a());
                }
                c(bundle);
                bundle.putInt("com.garmin.android.lib.connectdevicesync.extra.EXTRA_SPECIAL_CASE_RESPONSE_ERROR_CODE", b0Var.f183961z);
                a(bundle);
                this.f183988p = false;
                logger.info("***** SYNC FINISHED!!! *****");
            }
        }
    }

    public final boolean v() {
        b0 b0Var = this.f183986n;
        if (!b0Var.H()) {
            return false;
        }
        if (b0Var.I() || b0Var.G()) {
            return true;
        }
        b0Var.D();
        return false;
    }
}
