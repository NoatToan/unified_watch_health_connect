package com.huawei.watchface.mvp.model.thread;

import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "hadRenewVip"), @d0(name = "subInfo"), @d0(name = "memberStatus")})
public class QueryAllRequest extends MembershipPostRequest<QuerySubInfoDetailResp> {
    public QueryAllRequest(ResponseListener responseListener) {
        super(responseListener, WatchFaceHttpUtil.w(), QuerySubInfoDetailResp.class);
    }

    @Override // com.huawei.watchface.mvp.model.thread.MembershipPostRequest
    public void addHeaderParams(LinkedHashMap linkedHashMap) {
        linkedHashMap.putAll(getReqHeaders());
        linkedHashMap.remove("Content-Type");
        linkedHashMap.remove(WatchFaceConstant.CIPHER_VERSION);
        linkedHashMap.put("productType", "2");
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
    }

    @Override // com.huawei.watchface.mvp.model.thread.MembershipPostRequest
    public String buildRequestParams() {
        return "";
    }
}
