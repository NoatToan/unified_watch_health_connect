package com.huawei.hms.network.embedded;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.CreateFileUtil;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.httpclient.excutor.PolicyExecutor;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.impl.ImplVersion;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class d2 {
    public static final String CONGESTION_CONTROL_PCC_MULTIPATH = "pcc_multipath";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14693c = "CronetEngineManager";
    public static final String d = "CronetListener";
    public static final String e = "core_textTransmission";
    public static final String f = "core_smallPkt-fec";
    public static final String g = "SCC";
    public static final String h = "HW01,AKDU";
    public static final String i = "RACK,ARC3";
    public static final String j = "HW02,PCCH,IFWd";
    public static final String k = "PRIO";
    public static final int l = 0;
    public static final int m = 5;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final String r = "MPTH,MMAB";
    public static final String s = "MPTH,MRTT";
    public static final String t = "MPTH,MMIM";
    public static final String u = "MPTH";
    public static final String v = "STMP";
    public static final int w = 16;
    public static final int x = 300;
    public static final int y = 1000;
    public static final String z = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e2 f14694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<String, c2> f14695b;

    public c2 getCronetEngineFeature(Context context, PolicyExecutor policyExecutor) {
        String str;
        if (policyExecutor.getString("", PolicyNetworkService.ClientConstants.CONGESTION_CONTROL_TYPE).equals(k.a.f14965b)) {
            str = policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.ENABLE_MULTIPATH) ? CONGESTION_CONTROL_PCC_MULTIPATH : k.a.f14965b;
        } else {
            str = "bbrv1";
        }
        Logger.v(f14693c, "congestionType is ".concat(str));
        synchronized (d2.class) {
            c2 c2Var = this.f14695b.get(str);
            if (c2Var != null && c2Var.getCronetEngine() != null) {
                Logger.v(f14693c, "use already cronet engine, congestion type is ".concat(str));
                return c2Var;
            }
            c2 c2VarA = a(context, policyExecutor);
            getInstance().addCronetEngineFeature(str, c2VarA);
            g2.getInstance().maybeRecordCongestionTypeInfo(str, policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.QUIC_ENABLE_BANDWIDTH));
            return c2VarA;
        }
    }

    public void addCronetEngineFeature(String str, c2 c2Var) {
        this.f14695b.put(str, c2Var);
    }

    public static d2 getInstance() {
        return b.f14696a;
    }

    private boolean a(String str) {
        File fileNewFile = CreateFileUtil.newFile(str);
        return fileNewFile != null && fileNewFile.exists() && fileNewFile.canWrite();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d2 f14696a = new d2();
    }

    private String a(String str, String str2) {
        String[] strArrSplit = str.split(",");
        String[] strArrSplit2 = str2.split(",");
        HashSet<String> hashSet = new HashSet();
        hashSet.add(v);
        hashSet.addAll(Arrays.asList(strArrSplit));
        hashSet.addAll(Arrays.asList(strArrSplit2));
        StringBuilder sb = new StringBuilder();
        for (String str3 : hashSet) {
            if (!TextUtils.isEmpty(str3)) {
                sb.append("," + str3);
            }
        }
        return sb.toString().replaceFirst(",", "");
    }

    private c2 a(Context context, PolicyExecutor policyExecutor) {
        String string;
        int iStringToInteger;
        StringBuilder sb;
        String str;
        c2 c2Var = new c2();
        try {
            ExperimentalCronetEngine.Builder builderEnableNetworkQualityEstimator = new ExperimentalCronetEngine.Builder(context).enableQuic(true).enableHttp2(true).enableNetworkQualityEstimator(true);
            if (ImplVersion.getApiLevel() >= 16) {
                builderEnableNetworkQualityEstimator.enableTextTransmission(Boolean.parseBoolean(policyExecutor.getValue("", e)));
            }
            for (Map.Entry<String, m2> entry : g2.getInstance().getQuicHints().entrySet()) {
                Logger.i(f14693c, "the host of using quic is %s", entry.getKey());
                builderEnableNetworkQualityEstimator.addQuicHint(entry.getKey(), entry.getValue().getPort(), entry.getValue().getAlternatePort());
            }
            if (policyExecutor.getUserConfigValue(f).isEmpty() ? policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.SMALLPKT_FEC) : StringUtils.stringToBoolean(policyExecutor.getUserConfigValue(f), false)) {
                long j2 = policyExecutor.getLong("", PolicyNetworkService.ClientConstants.SMALLPKT_FEC_INITIALLEVEL, 0L);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(",HW01,AKDU");
                sb2.append(",SCC");
                if (j2 < 0 || j2 > 5) {
                    j2 = 0;
                }
                sb2.append(j2);
                string = sb2.toString();
            } else {
                string = "";
            }
            if (policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.ENABLE_MULTIPATH)) {
                int i2 = policyExecutor.getInt("", PolicyNetworkService.ClientConstants.MULTIPATH_TYPE);
                if (i2 == 4) {
                    sb = new StringBuilder();
                    sb.append(string);
                    str = ",MPTH";
                } else if (i2 == 3) {
                    sb = new StringBuilder();
                    sb.append(string);
                    str = ",MPTH,MMIM";
                } else if (i2 == 2) {
                    sb = new StringBuilder();
                    sb.append(string);
                    str = ",MPTH,MRTT";
                } else {
                    sb = new StringBuilder();
                    sb.append(string);
                    str = ",MPTH,MMAB";
                }
                sb.append(str);
                string = sb.toString();
            }
            if (k.a.f14965b.equals(policyExecutor.getString("", PolicyNetworkService.ClientConstants.CONGESTION_CONTROL_TYPE))) {
                string = string + ",HW02,PCCH,IFWd";
            }
            if (policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.REDUNDANT_ACK)) {
                string = string + ",RACK,ARC3";
            }
            if (k.f.f14978a.equals(policyExecutor.getString("", PolicyNetworkService.ClientConstants.PRIORITY_CONTROL_TYPE))) {
                string = string + ",PRIO";
            }
            if (HianalyticsHelper.getInstance().isQuicEnableReport(ContextHolder.getAppContext()) && g4.getInstance().addQuicTrace()) {
                string = string + ",RPTD";
            }
            String string2 = policyExecutor.getString("", PolicyNetworkService.ClientConstants.QUIC_CONNECTION_OPTIONS);
            String strA = TextUtils.isEmpty(string2) ? v + string : a(string, string2);
            String str2 = (k.c.f14969a.equals(policyExecutor.getString("", PolicyNetworkService.QuicConstants.MODULE_NAME)) && g2.getInstance().isHquicProviderSupportSelectQuic()) ? g2.H3 : "QUIC_VERSION_43";
            try {
                JSONObject jSONObjectPut = new JSONObject().put(i.f, strA).put("idle_connection_timeout_seconds", 300).put("quic_disable_tls_0rtt", !policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.TLS_ZERO_RTT));
                jSONObjectPut.put("quic_version", str2);
                if (policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.HWHTTP_ENABLE_CONNECTION_MIGRATION)) {
                    jSONObjectPut.put("migrate_sessions_on_network_change_v2", true).put("migrate_sessions_early_v2", true);
                    c2Var.setEnableConnectionMigrated(true);
                    long j3 = policyExecutor.getLong("", PolicyNetworkService.ClientConstants.WAIT_FOR_NEW_NETWORK_TIME_MS, -1L);
                    if (j3 >= 0 && j3 <= 20000) {
                        jSONObjectPut.put("wait_for_new_network_time_ms", j3);
                    }
                }
                int i3 = policyExecutor.getInt("", PolicyNetworkService.ClientConstants.MAX_IDLE_TIME_BEFORE_CRYPTO_HANDSHAKE_SECONDS);
                if (i3 != -1) {
                    jSONObjectPut.put("max_idle_time_before_crypto_handshake_seconds", i3);
                }
                JSONObject jSONObjectPut2 = new JSONObject().put("QUIC", jSONObjectPut);
                if (policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.QUIC_ENABLE_GSO)) {
                    jSONObjectPut2.put("quic_enable_gso", true);
                }
                if (policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.QUIC_ENABLE_BANDWIDTH)) {
                    jSONObjectPut2.put("quic_enable_bandwidth", true);
                }
                String value = policyExecutor.getValue("", PolicyNetworkService.ClientConstants.TRAFFIC_CLASS);
                if (!TextUtils.isEmpty(value) && (iStringToInteger = StringUtils.stringToInteger(value, -1)) >= 0 && iStringToInteger <= 255) {
                    jSONObjectPut2.put(x2.TRAFFIC_CLASS, iStringToInteger);
                }
                String string3 = policyExecutor.getString("", PolicyNetworkService.ClientConstants.STORAGE_PATH);
                if (a(string3)) {
                    File file = new File(CreateFileUtil.getCanonicalPath(string3) + "/cronet_cache");
                    if (file.exists() || file.mkdirs()) {
                        builderEnableNetworkQualityEstimator.setStoragePath(file.getCanonicalPath());
                        long j4 = policyExecutor.getLong("", PolicyNetworkService.ClientConstants.MAX_SERVER_CONFIGS_STORED_PROPERTIES, 0L);
                        if (j4 > 0 && j4 <= 1000) {
                            jSONObjectPut.put("max_server_configs_stored_in_properties", policyExecutor.getLong("", PolicyNetworkService.ClientConstants.MAX_SERVER_CONFIGS_STORED_PROPERTIES, 0L));
                        }
                    }
                } else {
                    Logger.i(f14693c, "Storage file path is invalid.");
                }
                jSONObjectPut2.put("server_config_persist_delay", policyExecutor.getInt("", PolicyNetworkService.ClientConstants.SERVER_CONFIG_PERSIST_DELAY)).put("tls13_session_timeout", policyExecutor.getInt("", PolicyNetworkService.ClientConstants.TLS13_SESSION_TIMEOUT)).put("commit_file_delay", policyExecutor.getInt("", PolicyNetworkService.ClientConstants.COMMIT_FILE_DELAY)).put("quic_broken_mode", policyExecutor.getInt("", PolicyNetworkService.ClientConstants.QUIC_BROKEN_MDOE));
                Logger.i(f14693c, "QUIC options:" + jSONObjectPut2.toString());
                builderEnableNetworkQualityEstimator.setExperimentalOptions(jSONObjectPut2.toString());
                j.e().b(strA);
            } catch (JSONException e2) {
                Logger.e(f14693c, "set QUIC options failed, exception:", e2.getClass().getSimpleName());
            }
            builderEnableNetworkQualityEstimator.setThreadPriority(0);
            ExperimentalCronetEngine experimentalCronetEngineBuild = builderEnableNetworkQualityEstimator.build();
            c2Var.setCronetEngine(experimentalCronetEngineBuild);
            e2 e2Var = new e2(ExecutorsUtils.newSingleThreadExecutor(d));
            this.f14694a = e2Var;
            if (experimentalCronetEngineBuild instanceof ExperimentalCronetEngine) {
                experimentalCronetEngineBuild.addRequestFinishedListener(e2Var);
            }
        } catch (Throwable th) {
            Logger.i(f14693c, "build CronetEngine failed, the reason:" + StringUtils.anonymizeMessage(th.getMessage()));
        }
        return c2Var;
    }

    public d2() {
        this.f14695b = new ConcurrentHashMap<>(3);
    }
}
