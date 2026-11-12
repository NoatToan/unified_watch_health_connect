package com.huawei.hms.framework.network.restclient.dnkeeper;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c extends g implements Callable {
    private static final String i = "DNKeeperCallable";
    private RequestHost d;
    private String e;
    private h f;
    private PLSharedPreferences g;
    private e h;

    @Override // java.util.concurrent.Callable
    public DnsResult call() {
        HttpClient httpClient = DNKeeperManager.getInstance().getHttpClient();
        DnsResult dnsResult = new DnsResult();
        String str = "https://" + this.f13383b + d.g;
        String string = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metrics_data", new JSONObject().put("trace_id", string));
        } catch (JSONException e) {
            Logger.w(i, "recordMap fail to put:", e);
        }
        Request requestBuild = httpClient.newRequest().options(jSONObject.toString()).requestBody(RequestBodyProviders.create("text/plain", StringUtils.str2Byte(f.a(this.d)))).url(str).method("POST").build();
        Logger.v(i, "DNKeeperCallable call : " + this.d.getDomainName());
        this.h.put("request_domain", "[" + this.d.getDomainName() + ']');
        this.h.put("trace_id", string);
        Submit<ResponseBody> submitNewSubmit = httpClient.newSubmit(requestBuild);
        try {
            Response<ResponseBody> responseExecute = submitNewSubmit.execute();
            a(submitNewSubmit);
            if (responseExecute.isOK() && this.f13383b.equals(this.e)) {
                a((DnsResult) null);
                try {
                    responseExecute.close();
                } catch (IOException e2) {
                    Logger.w(i, "response close error", e2);
                }
                PLSharedPreferences pLSharedPreferences = this.g;
                return pLSharedPreferences != null ? f.a(pLSharedPreferences.getString(this.f13383b)) : dnsResult;
            }
            if (responseExecute.isOK()) {
                a(responseExecute);
            } else {
                Logger.w(i, "response status code:" + responseExecute.getCode());
                this.h.put("error_code", (long) responseExecute.getCode());
                a();
            }
            b();
            DnsResult dnsResultA = this.f.a();
            if (!f.a(dnsResultA)) {
                Logger.i(i, this.e + " queryIps from dnkeeper service success");
                this.f.a(false);
            }
            return dnsResultA;
        } catch (IOException e3) {
            Logger.w(i, "IOException: ", e3);
            this.h.put("error_code", ExceptionCode.getErrorCodeFromException(e3));
            a(submitNewSubmit);
            a();
            b();
            return dnsResult;
        }
    }

    private void b() {
        e.a();
        if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            Logger.v(i, "dnkeeper report data to aiops is: %s", new JSONObject(this.h.get()));
            HianalyticsHelper.getInstance().executeReportHa(this.h, "dns_request");
        }
    }

    private void a(Submit submit) {
        this.f.a((Future) null);
        RequestFinishedInfo requestFinishedInfo = submit.getRequestFinishedInfo();
        if (requestFinishedInfo != null) {
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            this.f13382a = metrics.getConnectIps();
            this.h.put("dns_server_ips", Arrays.toString(metrics.getConnectIps().toArray()));
            this.h.put(e.h, requestFinishedInfo.getMetricsTime().getTotalTime());
            this.h.put("protocol_impl", requestFinishedInfo.getNetworkSdkType());
        }
    }

    private void a(Response<ResponseBody> response) {
        try {
            String strByte2Str = StringUtils.byte2Str(IoUtils.toByteArray(response.getBody().getInputStream()));
            Logger.v(i, "response = " + strByte2Str);
            JSONObject jSONObject = new JSONObject(strByte2Str);
            int i2 = jSONObject.getInt(DnsResult.KEY_ATN_CODE);
            if (i2 != 0) {
                this.h.put("error_code", 10020001L);
                Logger.w(i, "DNKeeper response atnCode %d", Integer.valueOf(i2));
                a();
            } else {
                this.h.put("error_code", 10020000L);
                jSONObject.put("createTime", System.currentTimeMillis());
                DnsResult dnsResultA = f.a(jSONObject.toString());
                this.f.a(dnsResultA);
                a(dnsResultA);
                a((DnsResult) null);
            }
        } catch (IOException | JSONException e) {
            a();
            this.h.put("error_code", 10020001L);
            Logger.w(i, e.getClass().getSimpleName());
        }
    }

    private void a(DnsResult dnsResult) {
        PLSharedPreferences pLSharedPreferences = this.g;
        if (pLSharedPreferences != null) {
            pLSharedPreferences.putString(d.e, "https://" + this.f13383b);
        }
        if (dnsResult == null) {
            a(this.g);
        } else {
            a(dnsResult, this.e, this.g);
        }
    }

    private void a() {
        this.f.a(System.currentTimeMillis());
    }

    public c(RequestHost requestHost, String str, h hVar, PLSharedPreferences pLSharedPreferences) {
        this.d = requestHost;
        this.e = requestHost.getDomainName();
        this.f13383b = str;
        this.f = hVar;
        this.g = pLSharedPreferences;
        e eVar = new e();
        this.h = eVar;
        eVar.put("trigger_type", "dns_sync_query");
    }
}
