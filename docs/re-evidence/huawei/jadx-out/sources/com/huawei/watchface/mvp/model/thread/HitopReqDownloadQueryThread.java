package com.huawei.watchface.mvp.model.thread;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.k4;
import com.huawei.watchface.mvp.model.datatype.WatchFaceDownloadQueryResp;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.callback.ILoginCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "isOrdered"), @d0(name = "memberStatus")})
public class HitopReqDownloadQueryThread extends BaseHttpRequest<WatchFaceDownloadQueryResp> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30367c;

    public class a implements ILoginCallback {
        public a(HitopReqDownloadQueryThread hitopReqDownloadQueryThread) {
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginFailed(Object obj) {
            HwLog.i("HitopReqDownloadQueryThread", "dealWrongResultCode() onLoginSuccess. ");
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginSuccess(Object obj) {
            HwLog.i("HitopReqDownloadQueryThread", "dealWrongResultCode() onLoginSuccess. ");
        }
    }

    public HitopReqDownloadQueryThread(String str, String str2, int i) {
        this.f30365a = str;
        this.f30366b = str2;
        this.f30367c = i;
    }

    private String buildRequestParams() {
        HwLog.i("HitopReqDownloadQueryThread", "buildRequestParams enter");
        try {
            String str = this.f30366b + this.f30367c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("productId", this.f30365a);
            linkedHashMap.put("licenseReq", a(str));
            linkedHashMap.put(JsbMapKeyNames.H5_USER_ID, WatchFaceHttpUtil.A().getUserId());
            linkedHashMap.put("hitopid", this.f30366b);
            linkedHashMap.put("type", Integer.valueOf(this.f30367c));
            linkedHashMap.put("isSupportedFreeDiscount", "1");
            linkedHashMap.put("isVipVersion", Integer.valueOf(CommonUtils.B()));
            linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, false));
            return a(linkedHashMap);
        } catch (Exception e) {
            HwLog.i("HitopReqDownloadQueryThread", "Exception : " + HwLog.printException(e));
            return "";
        }
    }

    public void a(int i, OperateWatchFaceCallback operateWatchFaceCallback) {
        if (i != 11002 || operateWatchFaceCallback == null) {
            return;
        }
        HwWatchFaceApi.getInstance(Environment.getApplicationContext()).loginByHealthHms(Environment.getApplicationContext(), new a(this));
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.mvp.model.thread.HitopReqDownloadQueryThread$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    k4.a(R.string.IDS_watchface_pay_failed);
                }
            });
        } else {
            HwLog.w("HitopReqDownloadQueryThread", "customWebViewContext not suitable");
        }
    }

    public WatchFaceDownloadQueryResp b(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            HwLog.i("HitopReqDownloadQueryThread", "dealReceive json is empty");
            return null;
        }
        try {
            return (WatchFaceDownloadQueryResp) GsonHelper.fromJson(str, WatchFaceDownloadQueryResp.class);
        } catch (Exception e) {
            HwLog.i("HitopReqDownloadQueryThread", "handleJsonData exception: " + HwLog.printException(e));
            return null;
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }

    public String e() {
        return a(WatchFaceHttpUtil.j(), buildRequestParams(), getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        return super.getReqHeaders();
    }
}
