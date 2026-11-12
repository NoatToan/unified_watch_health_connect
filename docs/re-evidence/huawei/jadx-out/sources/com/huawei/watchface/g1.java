package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes20.dex */
public class g1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30157c;
    public int d;
    public o4 e;

    public g1(String str, String str2, String str3, int i) {
        this.f30155a = str;
        this.f30156b = str2;
        this.f30157c = str3;
        this.d = i;
    }

    private String e() {
        String str = this.f30157c + this.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            linkedHashMap.put("productId", this.f30155a);
            linkedHashMap.put(RecommendConstants.VER, "1.6");
            linkedHashMap.put("licenseReq", a(str));
            linkedHashMap.put(JsbMapKeyNames.H5_USER_ID, WatchFaceHttpUtil.A().getUserId());
            linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, false));
            Boolean bool = Boolean.TRUE;
            linkedHashMap.put("isZip", bool.toString());
            linkedHashMap.put("isFontGzip", bool.toString());
            linkedHashMap.put("hitopid", this.f30157c);
            linkedHashMap.put("type", Integer.valueOf(this.d));
            linkedHashMap.put("isVipVersion", Integer.valueOf(CommonUtils.B()));
        } catch (Exception e) {
            HwLog.e("GetWatchFaceTryOutInfoThread", "getRequestParams Exception:" + HwLog.printException(e));
        }
        String strA = a(linkedHashMap);
        HwLog.i("GetWatchFaceTryOutInfoThread", "getRequestParams -- mProductId:" + this.f30155a);
        return strA;
    }

    public o4 b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetWatchFaceTryOutInfoThread", "dealReceive json is empty");
            return null;
        }
        try {
            o4 o4Var = new o4();
            this.e = o4Var;
            o4Var.a(str);
        } catch (JSONException e) {
            HwLog.e("GetWatchFaceTryOutInfoThread", "dealReceive " + HwLog.printException((Exception) e));
        }
        return this.e;
    }

    public String c(String str) {
        HwLog.i("GetWatchFaceTryOutInfoThread", "getResponse url");
        return a(WatchFaceHttpUtil.H(), str + e(), getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return this.f30156b;
    }
}
