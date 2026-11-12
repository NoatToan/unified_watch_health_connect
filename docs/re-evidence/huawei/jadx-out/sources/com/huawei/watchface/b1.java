package com.huawei.watchface;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.VipOrderBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.tencent.open.SocialOperation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class b1 extends a1 {
    public final VipPackageBean f;

    public b1(VipPackageBean vipPackageBean, String str) {
        super(vipPackageBean, str);
        this.f = vipPackageBean;
    }

    private boolean a(VipPackageBean vipPackageBean) {
        return TextUtils.equals("1", a(vipPackageBean, "purchaseScene"));
    }

    @Override // com.huawei.watchface.a1
    public VipOrderBean b(String str) {
        return super.b(str);
    }

    public String c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(linkedHashMap.get("productCode")));
        arrayList.add(String.valueOf(linkedHashMap.get("productType")));
        arrayList.add(String.valueOf(linkedHashMap.get("reportedPrice")));
        arrayList.add(String.valueOf(linkedHashMap.get("orderType")));
        arrayList.add(String.valueOf(linkedHashMap.get("couponId")));
        arrayList.add(String.valueOf(linkedHashMap.get("promotionId")));
        arrayList.add(String.valueOf(linkedHashMap.get("promotionName")));
        arrayList.add(String.valueOf(linkedHashMap.get("relProductCode")));
        arrayList.add(String.valueOf(linkedHashMap.get("orderChannel")));
        arrayList.add(String.valueOf(linkedHashMap.get("phoneNumber")));
        String strJoin = String.join("_", arrayList);
        FlavorConfig.safeHwLog("GetJoinVipV2Thread", "generateUcsToSignParam:" + strJoin);
        return strJoin;
    }

    @Override // com.huawei.watchface.a1
    public LinkedHashMap e() {
        LinkedHashMap linkedHashMapE = super.e();
        linkedHashMapE.put("deviceid", q0.e());
        linkedHashMapE.put("deviceType", "5");
        linkedHashMapE.put("x-ability", a());
        return linkedHashMapE;
    }

    @Override // com.huawei.watchface.a1
    public String f() {
        LinkedHashMap linkedHashMapG = super.g();
        if (linkedHashMapG == null) {
            return "";
        }
        if (a(this.f)) {
            linkedHashMapG.put("orderChannel", Integer.valueOf(TypedValues.Custom.TYPE_REFERENCE));
        }
        String strA = a(this.f, "campaignId");
        if (!TextUtils.isEmpty(strA)) {
            linkedHashMapG.put("promotionId", strA);
        }
        if (!TextUtils.isEmpty(this.f.getMagicExtendInfo())) {
            linkedHashMapG.put("extInfo", this.f.getMagicExtendInfo());
        }
        linkedHashMapG.put(SocialOperation.GAME_SIGNATURE, q4.e().a(c(linkedHashMapG)));
        linkedHashMapG.put("accessKey", q4.e().c());
        return GsonHelper.toJson(linkedHashMapG);
    }

    @Override // com.huawei.watchface.a1
    public String h() {
        return a(WatchFaceHttpUtil.n(), f(), e());
    }

    private String a(VipPackageBean vipPackageBean, String str) {
        if (vipPackageBean == null) {
            return "";
        }
        String magicExtendInfo = vipPackageBean.getMagicExtendInfo();
        if (TextUtils.isEmpty(magicExtendInfo)) {
            return "";
        }
        try {
            return new JSONObject(magicExtendInfo).optString(str);
        } catch (JSONException e) {
            HwLog.e("GetJoinVipV2Thread", "getOrderChannel, JSONException" + HwLog.printException((Exception) e));
            return "";
        }
    }
}
