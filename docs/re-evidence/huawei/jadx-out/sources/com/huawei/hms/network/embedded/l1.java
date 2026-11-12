package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.api.advance.BandwidthCallBack;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class l1 {
    public static final int MAX_SIZE_FOR_RECEIVED_BANDWIDTH = 32;
    public static final String h = "NetworkBandwidthManager";
    public static volatile l1 i = null;
    public static final long j = 1000;
    public static final String k = "GET";
    public String d;
    public HttpClient f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<BandwidthCallBack> f15022a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k1> f15023b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f15024c = ExecutorsUtils.newSingleThreadExecutor("NK-BW");
    public int e = 0;
    public String g = "";

    public void registerBandwidthCallback(BandwidthCallBack bandwidthCallBack) {
        this.f15022a.add(bandwidthCallBack);
    }

    public void recordCongestionTypeInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.g = str;
        Logger.v(h, "the CronetEngine can use for bandwidth after, and congestionType = " + str);
    }

    public void processNetworkReceiveMsg() {
        this.f15024c.submit(new b());
    }

    public void onBandwidthMessageReceived(String str, String str2) {
        this.f15024c.submit(new a(str2, str));
    }

    public void init(String str, int i2) {
        this.d = str;
        this.e = i2;
        NetworkKit.getInstance().addQuicHint(true, str);
        g2.getInstance().maybeExtraBandwidthEvaluation();
        l4.b().a(new m1(this));
    }

    public void clearBandwidthInfo() {
        this.f15023b.clear();
        k1 k1Var = new k1();
        for (BandwidthCallBack bandwidthCallBack : this.f15022a) {
            if (bandwidthCallBack != null) {
                bandwidthCallBack.onBandwidth(k1Var.getCurrentHost(), k1Var.getEstimatedBandwidthBps());
            }
        }
    }

    public static l1 getInstance() {
        if (i == null) {
            synchronized (l1.class) {
                if (i == null) {
                    i = new l1();
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (TextUtils.isEmpty(this.d)) {
            Logger.v(h, "probeURL == null,return it");
        } else if (TextUtils.isEmpty(this.g)) {
            Logger.i(h, "the CronetEngine has not created , don't request this time!");
        } else {
            this.f.newSubmit(a().newRequest().url(this.d).method("GET").build()).enqueue(new c());
        }
    }

    private String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("quic_enable_bandwidth", true);
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put(n2.CONGESTION_CONTROL_TYPE, this.g);
            }
        } catch (JSONException unused) {
            Logger.w(h, "the networkBandwidth option quic_enable_bandwidth or congestion_control_type has error!");
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k1 b() {
        k1 k1Var = new k1();
        for (int i2 = 0; i2 < this.f15023b.size(); i2++) {
            if (k1Var.getEstimatedBandwidthBps() <= this.f15023b.get(i2).getEstimatedBandwidthBps()) {
                k1Var = this.f15023b.get(i2);
            }
        }
        Logger.v(h, "the bandwidthInfoList is: " + this.f15023b.toString());
        return k1Var;
    }

    public class c extends Callback<ResponseBody> {
        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit<ResponseBody> submit, Response<ResponseBody> response) throws IOException {
            if (response.isSuccessful()) {
                response.getBody().bytes();
                response.close();
            }
            Logger.i(l1.h, "the request has finished ,and responseCode = " + response.getCode());
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit<ResponseBody> submit, Throwable th) {
            Logger.w(l1.h, "request fail for bandwidth this time! ");
        }

        public c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k1 k1Var) {
        long receivedTime = k1Var.getReceivedTime();
        long j2 = this.e;
        if (this.f15023b.size() == 32) {
            this.f15023b.remove(0);
        }
        this.f15023b.add(k1Var);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f15023b.size() && this.f15023b.get(i2).getReceivedTime() < receivedTime - (1000 * j2); i2++) {
            hashSet.add(this.f15023b.get(i2));
        }
        Logger.v(h, "the bandwidthInfoList will remove : " + hashSet.toString());
        this.f15023b.removeAll(hashSet);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15026b;

        @Override // java.lang.Runnable
        public void run() {
            long j;
            d3 d3Var = new d3(this.f15025a);
            try {
                j = Long.parseLong(this.f15026b);
            } catch (NumberFormatException unused) {
                Logger.w(l1.h, "the realBandwidth has error,abandon it this time");
                j = 0;
            }
            if (j > 0) {
                k1 k1Var = new k1(Utils.getCurrentTime(true), d3Var.getHost(), j);
                l1.this.a(k1Var);
                k1 k1VarB = l1.this.b();
                Logger.v(l1.h, "the bandwidthInfo will callback, bandwidthInfo = " + k1Var);
                for (BandwidthCallBack bandwidthCallBack : l1.this.f15022a) {
                    if (bandwidthCallBack != null) {
                        bandwidthCallBack.onBandwidth(k1VarB.getCurrentHost(), k1VarB.getEstimatedBandwidthBps());
                    }
                }
                return;
            }
            Logger.v(l1.h, "the realBandwidth <= 0, return it");
        }

        public a(String str, String str2) {
            this.f15025a = str;
            this.f15026b = str2;
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            l1.this.clearBandwidthInfo();
            if (NetworkUtil.getCurrentNetworkType() != -1 && NetworkUtil.getCurrentNetworkType() != 0) {
                l1.this.d();
                return;
            }
            Logger.i(l1.h, "this time the networkType = " + NetworkUtil.getCurrentNetworkType());
        }

        public b() {
        }
    }

    private HttpClient a() {
        HttpClient httpClient;
        synchronized (this) {
            if (this.f == null) {
                this.f = new HttpClient.Builder().retryTimeOnConnectionFailure(0).options(c()).enableQuic(true).build();
            }
            httpClient = this.f;
        }
        return httpClient;
    }
}
