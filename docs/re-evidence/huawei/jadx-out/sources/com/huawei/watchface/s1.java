package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceDownloadQueryFreeResp;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class s1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30567c;

    public s1(String str, String str2, int i) {
        this.f30565a = str;
        this.f30566b = str2;
        this.f30567c = i;
    }

    private String buildRequestParams() {
        HwLog.i("HitopReqDownloadQueryFreeThread", "buildRequestParams enter");
        try {
            String str = this.f30566b + this.f30567c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("productId", this.f30565a);
            linkedHashMap.put("licenseReq", a(str));
            linkedHashMap.put(JsbMapKeyNames.H5_USER_ID, WatchFaceHttpUtil.A().getUserId());
            linkedHashMap.put("hitopid", this.f30566b);
            linkedHashMap.put("type", Integer.valueOf(this.f30567c));
            linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, false));
            return a(linkedHashMap);
        } catch (Exception e) {
            HwLog.i("HitopReqDownloadQueryFreeThread", "Exception : " + HwLog.printException(e));
            return "";
        }
    }

    public WatchFaceDownloadQueryFreeResp b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("HitopReqDownloadQueryFreeThread", "dealReceive json is empty");
            return null;
        }
        try {
            return (WatchFaceDownloadQueryFreeResp) GsonHelper.fromJson(str, WatchFaceDownloadQueryFreeResp.class);
        } catch (Exception e) {
            HwLog.e("HitopReqDownloadQueryFreeThread", "handleJsonData exception: " + HwLog.printException(e));
            return null;
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }

    public String e() {
        return a(WatchFaceHttpUtil.i(), buildRequestParams(), getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        return super.getReqHeaders();
    }
}
