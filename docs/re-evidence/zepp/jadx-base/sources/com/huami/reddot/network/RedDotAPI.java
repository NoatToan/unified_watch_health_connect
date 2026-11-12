package com.huami.reddot.network;

import android.annotation.SuppressLint;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.reddot.RedDotConstant;
import com.huami.reddot.RedDotProvider;
import com.huami.reddot.entity.RedDotItem;
import com.huami.tools.log.HMLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class RedDotAPI implements Cloud.API {
    private static final String a = "RedDotAPI";
    private static final String b = "mifitDotDismissInfos";

    @SuppressLint({"StaticFieldLeak"})
    private static volatile RedDotAPI c;

    public static class RedDotParamInfo implements Serializable {

        @SerializedName("type")
        private String a;

        @SerializedName("dotDismissTime")
        private long b;

        public RedDotParamInfo(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof RedDotParamInfo) && this.a.equals(((RedDotParamInfo) obj).a)) {
                return true;
            }
            return super.equals(obj);
        }

        public long getDotDismissTime() {
            return this.b;
        }

        public String getType() {
            return this.a;
        }

        public void setDotDismissTime(long j) {
            this.b = j;
        }

        public void setType(String str) {
            this.a = str;
        }
    }

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Cloud.DiscoveryResult a;

        /* JADX INFO: renamed from: com.huami.reddot.network.RedDotAPI$a$a, reason: collision with other inner class name */
        public class C0544a extends TypeToken<ArrayList<RedDotItem>> {
            public C0544a() {
            }
        }

        public a(Cloud.DiscoveryResult discoveryResult) {
            this.a = discoveryResult;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.w(RedDotAPI.a, "requestIconRedDot onFail item=" + hMHttpResponseData.isSuccess() + ",status=" + hMHttpResponseData.getStatusCode(), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            HMLog.w(RedDotAPI.a, "requestIconRedDot item=" + hMHttpResponseData.isSuccess() + ",status=" + hMHttpResponseData.getStatusCode(), new Object[0]);
            if (hMHttpResponseData.isSuccess()) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
                    if (Cloud.b(jSONObject)) {
                        String strA = Cloud.a(jSONObject);
                        HMLog.w(RedDotAPI.a, "requestIconRedDot:dotInfos==" + strA, new Object[0]);
                        ArrayList<RedDotItem> arrayList = (ArrayList) new Gson().fromJson(strA, new C0544a().getType());
                        Cloud.DiscoveryResult discoveryResult = this.a;
                        discoveryResult.success = true;
                        discoveryResult.dotItems = arrayList;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private RedDotAPI() {
        RedDotProvider provider = RedDotProvider.getProvider();
        if (provider != null) {
            List<RedDotParamInfo> redDotInfos = provider.getRedDotInfos();
            RedDotParamInfo redDotParamInfo = new RedDotParamInfo(RedDotConstant.DISCOVERY_TYPE_ICON_MESSAGE_CENTER, 0L);
            if (!redDotInfos.contains(redDotParamInfo)) {
                redDotInfos.add(redDotParamInfo);
            }
            RedDotParamInfo redDotParamInfo2 = new RedDotParamInfo(RedDotConstant.DISCOVERY_TYPE_ICON_DATA_REPORT, 0L);
            if (!redDotInfos.contains(redDotParamInfo2)) {
                redDotInfos.add(redDotParamInfo2);
            }
            RedDotParamInfo redDotParamInfo3 = new RedDotParamInfo(RedDotConstant.DISCOVERY_TYPE_ICON_MEDAL, 0L);
            if (!redDotInfos.contains(redDotParamInfo3)) {
                redDotInfos.add(redDotParamInfo3);
            }
            RedDotParamInfo redDotParamInfo4 = new RedDotParamInfo(RedDotConstant.CHAOHU_WATCH_SKIN, 0L);
            if (!redDotInfos.contains(redDotParamInfo4)) {
                redDotInfos.add(redDotParamInfo4);
            }
            RedDotParamInfo redDotParamInfo5 = new RedDotParamInfo(RedDotConstant.TEMPO_WATCH_SKIN, 0L);
            if (!redDotInfos.contains(redDotParamInfo5)) {
                redDotInfos.add(redDotParamInfo5);
            }
            provider.saveRedDotInfos(redDotInfos);
        }
    }

    private static RedDotAPI a() {
        if (c == null) {
            synchronized (RedDotAPI.class) {
                if (c == null) {
                    c = new RedDotAPI();
                }
            }
        }
        return c;
    }

    public static RedDotAPI api() {
        return a();
    }

    private Map<String, Object> b(String[] strArr) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        ArrayList arrayList = new ArrayList();
        RedDotProvider provider = RedDotProvider.getProvider();
        if (provider != null) {
            List<RedDotParamInfo> redDotInfos = provider.getRedDotInfos();
            for (String str : strArr) {
                RedDotParamInfo redDotParamInfo = new RedDotParamInfo(str, 0L);
                if (redDotInfos.contains(redDotParamInfo)) {
                    arrayList.add(redDotInfos.get(redDotInfos.indexOf(redDotParamInfo)));
                }
            }
            HMLog.d(a, "requestIconRedDot list ----to json=" + new Gson().toJson(arrayList), new Object[0]);
            systemParams.put(b, new Gson().toJson(arrayList));
        }
        return systemParams;
    }

    public static void clear() {
        c = null;
    }

    @Override // com.huami.reddot.network.Cloud.API
    public Map<String, Object> params() {
        return null;
    }

    public Cloud.DiscoveryResult requestIconRedDot(String[] strArr) {
        Cloud.DiscoveryResult discoveryResult = new Cloud.DiscoveryResult();
        HMWebUtil.doRequest(url(), b(strArr), Support.RequestSupport.POST, true, new a(discoveryResult));
        HMLog.d(Cloud.TAG, "Get Has Icon RedDot : " + discoveryResult.success, new Object[0]);
        return discoveryResult;
    }

    @Override // com.huami.reddot.network.Cloud.API
    public String url() {
        return Cloud.host() + Cloud.b;
    }
}
