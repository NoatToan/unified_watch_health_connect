package com.huawei.watchface;

import com.google.gson.JsonElement;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.BatchReportResp;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.MembershipPostRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class y extends MembershipPostRequest {
    public static final String d = "y";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f30663c;

    public y(List list, ResponseListener responseListener) {
        super(responseListener, WatchFaceHttpUtil.d(), BatchReportResp.class);
        this.f30663c = list;
    }

    @Override // com.huawei.watchface.mvp.model.thread.MembershipPostRequest
    public void addHeaderParams(LinkedHashMap linkedHashMap) {
        linkedHashMap.putAll(super.getReqHeaders());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put("accept-lang", MLAsrConstants.LAN_ZH);
        linkedHashMap.remove("Content-Type");
        linkedHashMap.remove(WatchFaceConstant.CIPHER_VERSION);
    }

    @Override // com.huawei.watchface.mvp.model.thread.MembershipPostRequest
    public String buildRequestParams() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("applyRecords", this.f30663c);
            a("portraitImage1");
            JsonElement jsonElement = (JsonElement) GsonHelper.fromJson(GsonHelper.toJson(linkedHashMap), JsonElement.class);
            return jsonElement != null ? jsonElement.getAsJsonObject().toString() : "";
        } catch (Exception e) {
            HwLog.i(d, "Exception : " + HwLog.printException(e));
            return "";
        }
    }
}
