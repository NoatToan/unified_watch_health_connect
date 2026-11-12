package com.xiaomi.hm.health.webapi;

import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class RankWebAPI {
    private static final String a = "RankWebAPI";
    private static final String b = "v1/user/ranks.json";
    private static final String c = "record_type";
    private static final String d = "rank_time_type";
    private static final String e = "record";
    private static final String f = "from_date";
    private static final String g = "to_date";
    private static final String h = "beat_percentage";
    private static final String i = "step";
    private static final String j = "goal";
    private static final String k = "day";

    public interface OnRankHandler {
        void onFailed(String log);

        void onRank(int rank);
    }

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ OnRankHandler a;

        public a(final OnRankHandler val$handler) {
            this.a = val$handler;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            this.a.onFailed(throwable.toString());
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData item) {
            if (item == null || !item.isSuccess()) {
                this.a.onFailed("request failed");
            } else {
                RankWebAPI.c(item, this.a);
            }
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ OnRankHandler a;

        public b(final OnRankHandler val$handler) {
            this.a = val$handler;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            this.a.onFailed(throwable.toString());
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData item) {
            if (item == null || !item.isSuccess()) {
                this.a.onFailed("request failed");
            } else {
                RankWebAPI.c(item, this.a);
            }
        }
    }

    private static void b(final int record, String fromDate, String toDate, final OnRankHandler handler) {
        String url = HMServerDef.getUrl(b);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(c, "step");
        systemParams.put(d, "day");
        systemParams.put("record", Integer.valueOf(record));
        systemParams.put("from_date", fromDate);
        systemParams.put(g, toDate);
        HMLog.d(a, "params " + systemParams.toString() + " url " + url, new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new a(handler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HMHttpResponseData item, OnRankHandler handler) {
        String str = new String(item.getResponseBody());
        HMLog.d(a, "response : " + str, new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") == 1) {
                handler.onRank((int) (Float.valueOf(new JSONObject(jSONObject.optString("data")).optString(h)).floatValue() * 100.0f));
            } else {
                handler.onFailed(str);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            handler.onFailed(e2.toString());
        }
    }

    public static void getContinueRank(int days, String fromDate, String toDate, final OnRankHandler handler) {
        String url = HMServerDef.getUrl(b);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(c, "goal");
        systemParams.put(d, "day");
        systemParams.put("record", Integer.valueOf(days));
        systemParams.put("from_date", fromDate);
        systemParams.put(g, toDate);
        HMLog.d(a, "params " + systemParams.toString() + " url " + url, new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new b(handler));
    }

    public static void getTodayStepRank(int step, OnRankHandler handler) {
        String key = new SportDay(Calendar.getInstance()).getKey();
        b(step, key, key, handler);
    }
}
