package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class o5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15142b = "RequestMetricsCache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o5 f15143c = new o5();
    public static volatile boolean d = false;
    public static volatile boolean e = false;
    public static String f = "com.huawei.hms.network.httpclient.Interceptor$Chain";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LimitQueue<n5> f15144a = new LimitQueue<>(10, false);

    public void a(Interceptor.Chain chain) {
        q5.a().a(new a(chain));
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "8.0.1.320");
            JSONArray jSONArray = new JSONArray();
            Iterator<n5> it = this.f15144a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().i());
            }
            jSONObject.put(p5.f15178b, jSONArray);
        } catch (JSONException unused) {
            Logger.w(f15142b, "Get RequestMetricsCache Error");
        }
        return jSONObject.toString();
    }

    public static o5 c() {
        return f15143c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (e) {
            return d;
        }
        d = ReflectionUtils.checkCompatible(f, p5.f15178b, new Class[0]);
        e = true;
        return d;
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Interceptor.Chain f15145a;

        @Override // java.lang.Runnable
        public void run() {
            Interceptor.Chain chain;
            if (!o5.this.b() || (chain = this.f15145a) == null || chain.requestFinishedInfo() == null) {
                return;
            }
            RequestFinishedInfo.MetricsTime metricsTime = this.f15145a.requestFinishedInfo().getMetricsTime();
            if (metricsTime.getConnectEndTime() - metricsTime.getConnectStartTime() == 0) {
                return;
            }
            o5.this.a(new n5(this.f15145a));
        }

        public a(Interceptor.Chain chain) {
            this.f15145a = chain;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n5 n5Var) {
        this.f15144a.add(n5Var);
    }
}
