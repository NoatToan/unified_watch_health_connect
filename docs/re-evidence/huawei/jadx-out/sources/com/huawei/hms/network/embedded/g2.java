package com.huawei.hms.network.embedded;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.huawei.hms.hquic.HQUICException;
import com.huawei.hms.hquic.HQUICManager;
import com.huawei.hms.hquic.HQUICProvider;
import com.huawei.hms.network.base.util.HttpUtils;
import com.huawei.hms.network.conf.api.ConfigAPI;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class g2 {
    public static final String H3 = "h3";
    public static final String QUIC = "quic";
    public static final String f = "CronetNegotiateManager";
    public static final String g = "org.chromium.net.CronetEngine";
    public static final String h = "com.huawei.hms.hquic.HQUICManager";
    public static final String i = "hquic_load";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 443;
    public static final int o = 10000910;
    public static final int p = 10000911;
    public static volatile g2 q = null;
    public static final int r = 1;
    public static final int s = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f14793c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, m2> f14791a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14792b = 0;
    public String d = null;
    public boolean e = false;

    public void updateQuicHints(String str, int i2, boolean z) {
        if (str != null && !z) {
            this.f14791a.remove(str);
        }
        if (str == null) {
            Logger.v(f, "host == null");
            return;
        }
        m2 m2Var = this.f14791a.get(str);
        if (m2Var == null || !(i2 == -1 || i2 == m2Var.getPort())) {
            Logger.v(f, "server negotiate port is %d, but there is not compatible config or historical success record", Integer.valueOf(i2));
        } else {
            Logger.v(f, "the host:%s will use cronet next time", str);
            m2Var.setEnableQuic(z);
        }
        Logger.v(f, "updateQuicHints is execute,and the map is: %s", this.f14791a.keySet().toString());
    }

    public void maybeRecordCongestionTypeInfo(String str, boolean z) {
        if (z && this.e) {
            l1.getInstance().recordCongestionTypeInfo(str);
            return;
        }
        Logger.v(f, "the CronetEngine can‘t use for bandwidth, and congestionType = " + str);
    }

    public void maybeExtraBandwidthEvaluation() {
        this.e = true;
    }

    public int mappingCronetErrorCode(Exception exc) {
        if (exc == null || !isAvailable() || !(exc instanceof NetworkException)) {
            return 10000802;
        }
        switch (((NetworkException) exc).getErrorCode()) {
            case 1:
                return 10000300;
            case 2:
                return 10000200;
            case 3:
                return ExceptionCode.NETWORK_CHANGED;
            case 4:
                return 10000600;
            case 5:
                return 10000406;
            case 6:
                return 10000400;
            case 7:
                return 10000404;
            case 8:
                return 10000401;
            case 9:
                return 10000301;
            case 10:
                return ExceptionCode.PROTOCOL_ERROR;
            default:
                return 10000800;
        }
    }

    public void loadQuicConf() {
        String strValueOf = String.valueOf(ConfigAPI.getValue(PolicyNetworkService.QuicConstants.QUICHINT));
        Logger.v(f, "quichint is %s", strValueOf);
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        a(strValueOf);
    }

    public void lazyInitHmsQuicLoader(boolean z) {
        synchronized (this) {
            try {
                if (!z) {
                    if (this.f14792b != 0) {
                        Logger.i(f, "run lazyInitHmsQuicLoader before");
                    }
                }
                Class.forName(h);
                this.f14792b = 1;
                a();
            } catch (ClassNotFoundException e) {
                Logger.w(f, "load com.huawei.hms.hquic.HQUICManagerclass failed, exception:%s", e.getClass().getSimpleName());
                this.f14792b = 3;
                this.f14793c.setLoadEndTime(Utils.getCurrentTime(false));
                this.f14793c.setLoadError(e);
                this.f14793c.setErrorCode(p);
                HianalyticsHelper.getInstance().getReportExecutor().execute(new b());
                return;
            }
            this.f14793c = new d();
            this.f14793c.setLoadStartTime(Utils.getCurrentTime(false));
        }
    }

    public boolean isSupportExtraBandwidthEvaluation() {
        return this.e;
    }

    public boolean isSupportCronet() {
        try {
            Class.forName(g);
            return true;
        } catch (ClassNotFoundException e) {
            Logger.w(f, "load network-quic CronetEngine class failed, exception:%s", e.getClass().getSimpleName());
            return false;
        }
    }

    public boolean isHquicProviderSupportSelectQuic() {
        return ReflectionUtils.checkCompatible(h, "asyncInit", Context.class, String.class, HQUICManager.HQUICInitCallback.class);
    }

    public Boolean isEnableQuic(String str, int i2) {
        boolean z;
        Logger.v(f, "isEnableQuic is execute,and the map is: %s", this.f14791a.keySet().toString());
        m2 m2Var = this.f14791a.get(str);
        if (m2Var != null && m2Var.getEnableQuic() && (i2 == -1 || i2 == m2Var.getPort())) {
            Logger.v(f, "use cronet and request");
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean isAvailable() {
        Logger.v(f, "initHmsQuicProviderState code is: " + this.f14792b);
        return this.f14792b == 2;
    }

    public ConcurrentHashMap<String, m2> getQuicHints() {
        return this.f14791a;
    }

    public String getAltSvcType() {
        return k.c.f14969a.equals(this.d) ? H3 : QUIC;
    }

    public void addQuicHint(List<String> list, boolean z) {
        if (list == null) {
            Logger.e(f, "invalid argument");
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            addQuicHint(it.next(), z);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap<String, String> f14799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14801c;
        public Exception d;
        public int e;
        public String f;
        public String g;

        public void setLoadStartTime(long j) {
            this.f14800b = j;
        }

        public void setLoadSdkVersion(String str) {
            this.f = str;
        }

        public void setLoadSdkName(String str) {
            this.g = str;
        }

        public void setLoadError(Exception exc) {
            this.d = exc;
        }

        public void setLoadEndTime(long j) {
            this.f14801c = j;
        }

        public void setErrorCode(int i) {
            this.e = i;
        }

        public long getLoadTime() {
            long j = this.f14801c - this.f14800b;
            if (j > 0) {
                return j;
            }
            return 0L;
        }

        public LinkedHashMap<String, String> finiInfo2HaMap() {
            this.f14799a.put("error_code", String.valueOf(this.e));
            this.f14799a.put("total_time", String.valueOf(getLoadTime()));
            this.f14799a.put("req_start_time", String.valueOf(this.f14800b));
            this.f14799a.put("kit_provider", this.g);
            this.f14799a.put("kit_version", this.f);
            Exception exc = this.d;
            if (exc != null) {
                this.f14799a.put("exception_name", exc.getClass().getSimpleName());
                this.f14799a.put("message", StringUtils.anonymizeMessage(this.d.getMessage()));
            }
            return this.f14799a;
        }

        public d() {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            this.f14799a = linkedHashMap;
            linkedHashMap.put(HianalyticsBaseData.SDK_NAME, "networkkit");
            this.f14799a.put("sdk_type", "UxPP");
            this.f14799a.put("sdk_version", "8.0.1.320");
        }
    }

    public void addQuicHint(String str, boolean z) {
        a(str, z, false);
    }

    public static g2 getInstance() {
        if (q == null) {
            synchronized (g2.class) {
                if (q == null) {
                    q = new g2();
                }
            }
        }
        return q;
    }

    private void a(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "invalid argument";
        } else {
            if (HttpUtils.isHttpUrl(str)) {
                str2 = str;
            } else {
                str2 = "https://" + str;
            }
            try {
                URL url = new URL(str2);
                m2 m2Var = this.f14791a.get(url.getHost());
                int port = url.getPort() == -1 ? n : url.getPort();
                if (m2Var == null || z2 || port != m2Var.getPort()) {
                    m2Var = new m2();
                    m2Var.setHost(url.getHost());
                    m2Var.setPort(port);
                    m2Var.setAlternatePort(port);
                    m2Var.setEnableQuic(z);
                    Logger.w(f, "QuicHit:" + m2Var);
                }
                this.f14791a.put(m2Var.getHost(), m2Var);
                return;
            } catch (MalformedURLException unused) {
                str3 = "add QuicHit failed，please check domian format:" + str;
            }
        }
        Logger.e(f, str3);
    }

    private void a(String str) {
        Logger.v(f, "the configInfo is %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("services");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                if (TextUtils.isEmpty(next) || TextUtils.isEmpty(string)) {
                    Logger.e(f, "config file has been broken.");
                } else {
                    int iStringToInteger = StringUtils.stringToInteger(string, -1);
                    if (iStringToInteger == 0) {
                        a(next, false, true);
                    } else if (iStringToInteger == 1) {
                        a(next, true, true);
                    }
                }
            }
            Logger.v(f, "loadConfigToCache is execute,and the map size is:%s---%s", Integer.valueOf(this.f14791a.size()), this.f14791a.keySet().toString());
        } catch (JSONException e) {
            Logger.w(f, "parse JSON occur error.", e);
        }
    }

    public class a implements HQUICManager.HQUICInitCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HQUICProvider f14794a = new HQUICProvider(ContextHolder.getResourceContext());

        public void onSuccess() {
            Logger.i(g2.f, "Init Quic Success");
            try {
                a();
                g2.this.f14792b = 2;
                a(g2.o);
                g2 g2Var = g2.this;
                g2Var.a(g2Var.f14793c);
            } catch (Throwable th) {
                Logger.w(g2.f, "load quic pro success but init engine fail: " + th.getMessage());
                onFail(new Exception(th));
            }
        }

        public void onFail(Exception exc) {
            StringBuilder sb;
            Logger.i(g2.f, "Init Quic Fail");
            g2.this.f14792b = 3;
            if (!(exc instanceof HQUICException)) {
                if (exc instanceof IllegalArgumentException) {
                    sb = new StringBuilder("invalid argument, reason:");
                }
                g2.this.f14793c.setLoadError(exc);
                a(g2.p);
                g2 g2Var = g2.this;
                g2Var.a(g2Var.f14793c);
            }
            sb = new StringBuilder("Init Hms Quic Loader failed, reason:");
            sb.append(exc.getMessage());
            Logger.i(g2.f, sb.toString());
            g2.this.f14793c.setLoadError(exc);
            a(g2.p);
            g2 g2Var2 = g2.this;
            g2Var2.a(g2Var2.f14793c);
        }

        private void a(int i) {
            g2.this.f14793c.setLoadEndTime(Utils.getCurrentTime(false));
            if (a.class.getClassLoader() != null) {
                g2.this.f14793c.setLoadSdkName(a.class.getClassLoader().getClass().getCanonicalName());
            } else {
                g2.this.f14793c.setLoadSdkName(this.f14794a.getName());
            }
            g2.this.f14793c.setErrorCode(i);
            g2.this.f14793c.setLoadSdkVersion(this.f14794a.getVersion());
        }

        private void a() {
            new ExperimentalCronetEngine.Builder(new z1(ContextHolder.getResourceContext())).enableQuic(true).enableHttp2(true).enableNetworkQualityEstimator(true).build().shutdown();
        }

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            InitReport.reportWhenInit(new c(dVar));
        } else {
            Logger.i(f, "HianalyticsHelper report disable");
        }
    }

    private void a() {
        String strValueOf = String.valueOf(ConfigAPI.getValue(PolicyNetworkService.QuicConstants.MODULE_NAME));
        this.d = strValueOf;
        Logger.i(f, "module name is %s", strValueOf);
        a aVar = new a();
        if (isHquicProviderSupportSelectQuic()) {
            HQUICManager.asyncInit(ContextHolder.getResourceContext(), this.d, aVar);
        } else {
            Logger.i(f, "not support select quic");
            HQUICManager.asyncInit(ContextHolder.getResourceContext(), aVar);
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            g2 g2Var = g2.this;
            g2Var.a(g2Var.f14793c);
        }

        public b() {
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f14797a;

        @Override // java.lang.Runnable
        public void run() {
            HianalyticsHelper.getInstance().onEvent(this.f14797a.finiInfo2HaMap(), g2.i);
        }

        public c(d dVar) {
            this.f14797a = dVar;
        }
    }
}
