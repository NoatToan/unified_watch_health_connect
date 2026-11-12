package com.huawei.hms.network;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.huawei.hms.network.api.advance.AdvanceNetworkKit;
import com.huawei.hms.network.api.advance.BandwidthCallBack;
import com.huawei.hms.network.api.advance.ReportCallBack;
import com.huawei.hms.network.api.advance.WrapperLogger;
import com.huawei.hms.network.embedded.a1;
import com.huawei.hms.network.embedded.a3;
import com.huawei.hms.network.embedded.g2;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hms.network.embedded.h1;
import com.huawei.hms.network.embedded.l1;
import com.huawei.hms.network.embedded.m4;
import com.huawei.hms.network.embedded.s2;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hms.network.embedded.y0;
import com.huawei.hms.network.embedded.z0;
import com.huawei.hms.network.httpclient.excutor.PolicyExecutor;
import com.huawei.hms.network.httpclient.okhttp.OkHttpClientGlobal;
import com.huawei.hms.network.inner.api.InterceptorNetworkService;
import com.huawei.hms.network.inner.api.NetDiagnosisNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.netdiag.qoe.QoeMetrics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes34.dex */
public class ComposedNetworkKit {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14437c = "ComposedNetworkKit";
    public static final ComposedNetworkKit d = new ComposedNetworkKit();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PolicyExecutor f14438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CyclicBarrier f14439b = new CyclicBarrier(2);

    public void setWrapperLogger(WrapperLogger wrapperLogger, boolean z) {
        Logger.setExtLogger(new h1.k(wrapperLogger), z);
    }

    public void setReportCallback(ReportCallBack reportCallBack) {
        HianalyticsHelper.getInstance().setReportCallback(new a(reportCallBack));
    }

    public void setOptions(String str) {
        if (str == null) {
            Logger.w(f14437c, "setOptions == null");
            return;
        }
        PolicyExecutor policyExecutor = this.f14438a;
        if (policyExecutor != null) {
            policyExecutor.setOptions(str);
            NetworkKitInnerImpl.getInstance().setPolicyExecutor(this.f14438a);
            b();
        }
    }

    public void setLogEnableLevel(int i) {
        Logger.setLogEnableLevel(i);
    }

    public void reloadQuic() {
        a1.reloadQuic();
    }

    public void registerBandwidthCallback(String str, int i, BandwidthCallBack bandwidthCallBack) {
        l1.getInstance().init(str, i);
        l1.getInstance().registerBandwidthCallback(bandwidthCallBack);
    }

    public void initKit(Context context, String str) {
        ContextHolder.setAppContext(context);
        ExecutorsUtils.newThread(new b(context), "ComposedNetworkKit_initKit").start();
        NetworkKitInnerImpl.getInstance().init(context, str, a()).setProtocolStackManager(new z0());
        this.f14438a = new PolicyExecutor();
        NetworkKitInnerImpl.getInstance().setPolicyExecutor(this.f14438a);
        b();
        Boolean boolC = m4.c().c(NetworkService.Constants.REMOTE_SCENE_SWITCH);
        if (boolC != null && boolC.booleanValue()) {
            u3.getInstance().registerSceneChangeListener(context);
        }
        try {
            this.f14439b.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | BrokenBarrierException | TimeoutException unused) {
            Logger.w(f14437c, "cyclicBarrier  await error!");
        }
    }

    public void initConnectionPool(int i, long j, TimeUnit timeUnit) {
        OkHttpClientGlobal.init(i, j, timeUnit);
    }

    public Map<String, Integer> getSignalMetrics() {
        InterceptorNetworkService interceptorNetworkService = NetworkKitInnerImpl.getInstance().getInterceptorNetworkService("netdiag");
        if (interceptorNetworkService != null) {
            return ((NetDiagnosisNetworkService) interceptorNetworkService).getSignalMetrics();
        }
        Logger.w(f14437c, "the netdiag service is not reachable for signal");
        return new HashMap();
    }

    public QoeMetrics getQoeMetrics() {
        InterceptorNetworkService interceptorNetworkService = NetworkKitInnerImpl.getInstance().getInterceptorNetworkService("netdiag");
        if (interceptorNetworkService != null) {
            return ((NetDiagnosisNetworkService) interceptorNetworkService).getQoeMetrics(false);
        }
        Logger.w(f14437c, "the netdiag service is not reachable for qoe");
        return null;
    }

    public String getOption(String str, String str2) {
        PolicyExecutor policyExecutor = this.f14438a;
        return policyExecutor != null ? policyExecutor.getValue(str, str2) : "";
    }

    public String getNetworkMetrics() {
        InterceptorNetworkService interceptorNetworkService = NetworkKitInnerImpl.getInstance().getInterceptorNetworkService("netdiag");
        if (interceptorNetworkService != null) {
            return ((NetDiagnosisNetworkService) interceptorNetworkService).getNetworkMetrics();
        }
        Logger.w(f14437c, "the netdiag service is not reachable for NetworkMetrics");
        return null;
    }

    public void evictAllConnections() {
        OkHttpClientGlobal.getInstance().evictAll();
    }

    public void doAction(String str) {
        if (str == null) {
            Logger.e(f14437c, "invalid actionkey!");
        } else if (str.equals(AdvanceNetworkKit.ACTION_CLEAN_CONNECTDATA)) {
            clear();
            InitReport.disableConnectNet();
        }
    }

    public void clear() {
        Iterator<NetworkService> it = m4.c().a().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    public boolean checkConnectivity() {
        InterceptorNetworkService interceptorNetworkService = NetworkKitInnerImpl.getInstance().getInterceptorNetworkService("netdiag");
        if (interceptorNetworkService != null) {
            return ((NetDiagnosisNetworkService) interceptorNetworkService).checkConnectivity();
        }
        Logger.w(f14437c, "the netdiag service is not reachable for connect");
        return false;
    }

    public void addQuicHint(boolean z, String... strArr) {
        g2.getInstance().addQuicHint(Arrays.asList(strArr), z);
    }

    public static ComposedNetworkKit getInstance() {
        return d;
    }

    private void b() {
        HianalyticsHelper.getInstance().setHaTag(this.f14438a.getString("", "core_ha_tag"));
        HianalyticsHelper.getInstance().enablePrivacyPolicy(this.f14438a.getBoolean("", "core_enable_privacy_policy"));
        HianalyticsHelper.getInstance().setRate(this.f14438a.getInt("", PolicyNetworkService.GlobalConstants.REPORT_RATE));
        HianalyticsHelper.getInstance().setQuicRate(this.f14438a.getInt("", PolicyNetworkService.GlobalConstants.QUIC_REPORT_RATE));
        g4.getInstance().enableAllLinkDelayAnalysis(this.f14438a.getBoolean("", "core_enable_alllink_delay_analysis"));
        g4.getInstance().userSet(!TextUtils.isEmpty(this.f14438a.getUserConfigValue("core_enable_alllink_delay_analysis")));
    }

    public class a implements HianalyticsHelper.ReportCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReportCallBack f14440a;

        @Override // com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.ReportCallBack
        public void onReport(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
            this.f14440a.onReport(i, str, linkedHashMap);
        }

        public a(ReportCallBack reportCallBack) {
            this.f14440a = reportCallBack;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f14442a;

        @Override // java.lang.Runnable
        public void run() {
            new s2().init();
            a3.init();
            y0.registerNetworkState(this.f14442a);
            try {
                ComposedNetworkKit.this.f14439b.await(1L, TimeUnit.SECONDS);
            } catch (InterruptedException | BrokenBarrierException | TimeoutException unused) {
                Logger.w(ComposedNetworkKit.f14437c, "cyclicBarrier  await error!");
            }
        }

        public b(Context context) {
            this.f14442a = context;
        }
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(PolicyNetworkService.NetworkServiceConstants.IS_DYNAMIC, ContextHolder.getKitContext() != null);
        return bundle;
    }
}
