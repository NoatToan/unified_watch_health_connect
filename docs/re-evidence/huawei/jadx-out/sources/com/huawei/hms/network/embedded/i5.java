package com.huawei.hms.network.embedded;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes34.dex */
public abstract class i5 {
    public static final String d = "DetectEventListener";
    public static final i5 e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l5 f14905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x4 f14906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14907c;

    public class a extends i5 {
    }

    public void b(w5 w5Var) {
        this.f14906b = new x4();
        this.f14907c = SystemClock.elapsedRealtime();
    }

    public void b(int i) {
        x4 x4Var = this.f14906b;
        if (x4Var != null) {
            x4Var.a(i);
        }
    }

    public <T extends y4> void a(T t) {
        if (!HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getResourceContext())) {
            Logger.i(d, "HianalyticsHelper report disable, and return!");
        } else if (t == null) {
            Logger.i(d, "the detect data has error! detect == null");
        } else {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new b(t));
        }
    }

    public void a(w5 w5Var) {
        if (this.f14906b != null) {
            this.f14906b.a(SystemClock.elapsedRealtime() - this.f14907c);
            if (w5Var == null || !(w5Var.b() instanceof w4)) {
                return;
            }
            ((v4) w5Var.b()).a(this.f14906b);
            a(this.f14905a, (v4) w5Var.b(), 1003);
        }
    }

    public <T extends w4> void a(l5 l5Var, w4 w4Var, int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = w4Var;
        l5Var.a(messageObtain);
    }

    public void a(int i, String str) {
        x4 x4Var = this.f14906b;
        if (x4Var != null) {
            x4Var.b(i);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.f14906b.a(new URL(str).getHost());
            } catch (IOException unused) {
                Logger.w(d, "obtain host has error");
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y4 f14908a;

        @Override // java.lang.Runnable
        public void run() {
            h5 h5Var = new h5();
            h5Var.put("domain", this.f14908a.a()).put("req_start_time", this.f14908a.b()).put("req_total_time", this.f14908a.e()).put("error_code", this.f14908a.c());
            Logger.v(i5.d, "the detect date :" + h5Var.get());
            HianalyticsHelper.getInstance().onEvent(h5Var.get(), "netdiag");
        }

        public b(y4 y4Var) {
            this.f14908a = y4Var;
        }
    }

    public void a(int i) {
        a(i, "");
    }
}
