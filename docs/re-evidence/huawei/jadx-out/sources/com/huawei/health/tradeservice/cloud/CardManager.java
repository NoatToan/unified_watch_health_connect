package com.huawei.health.tradeservice.cloud;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.ily;
import defpackage.njy;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class CardManager {
    private static final String TAG = "TradeService_CardManager";
    private static final String VERSION_DIVIDED_SYMBOL = "-";

    private CardManager() {
    }

    public static void cardQueryInfo(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "getCardInfo enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap map = new HashMap(16);
        map.put("language", pjn.b(null));
        map.put("orderCode", str);
        TradeServiceCloudMgr.getInstance().cardQueryInfo(new CardQueryInfoReq(), ily.b((HashMap<String, String>) map), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.CardManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof CardQueryInfoRsp) {
                    iBaseResponseCallback.a(0, ((CardQueryInfoRsp) obj).getThirdCardInfos());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public static void giftCardListQuery(List<Integer> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "giftCardListQuery callBack is null");
            return;
        }
        LogUtil.a(TAG, "giftCardListQuery enter");
        HashMap<String, String> params = getParams(list);
        TradeServiceCloudMgr.getInstance().giftCardListQuery(new GiftCardListReq(), params, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.CardManager.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof GiftCardListRsp) {
                    iBaseResponseCallback.a(0, ((GiftCardListRsp) obj).getGiftCardList());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public static void awardListQuery(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "awardListQuery callBack is null");
            return;
        }
        LogUtil.a(TAG, "awardListQuery enter");
        TradeServiceCloudMgr.getInstance().awardListQuery(new AwardListReq(), getActivityParams(), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.CardManager.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof AwardListRsp) {
                    iBaseResponseCallback.a(0, ((AwardListRsp) obj).getAwardRecords());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public static void couponListQuery(List<Integer> list, String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "giftCardListQuery callBack is null");
            return;
        }
        LogUtil.a(TAG, "giftCardListQuery enter");
        HashMap<String, String> params = getParams(list);
        if (!TextUtils.isEmpty(str)) {
            params.put("productId", str);
        }
        TradeServiceCloudMgr.getInstance().couponListQuery(new CouponListReq(), params, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.CardManager.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof CouponListRsp) {
                    iBaseResponseCallback.a(0, ((CouponListRsp) obj).getCouponList());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public static void receiveCouponList(List<String> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null || njy.e(list)) {
            LogUtil.j(TAG, "receiveCouponList callBack is null");
            return;
        }
        LogUtil.a(TAG, "receiveCouponList enter");
        ReceiveCouponReq receiveCouponReq = new ReceiveCouponReq();
        receiveCouponReq.setCouponIdList(list);
        receiveCouponReq.setClientType(ily.a());
        receiveCouponReq.setClientVersion(getClientVersion(BaseApplication.getContext()));
        receiveCouponReq.setTerritory(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        TradeServiceCloudMgr.getInstance().receiveCoupon(receiveCouponReq, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.CardManager.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a(CardManager.TAG, "errorCode:", Integer.valueOf(i));
                iBaseResponseCallback.a(i, obj);
            }
        });
    }

    private static HashMap<String, String> getParams(List<Integer> list) {
        HashMap<String, String> map = new HashMap<>(0);
        if (!njy.e(list)) {
            map.put("statusList", listToString(list));
        }
        map.put("territory", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("clientVersion", getClientVersion(BaseApplication.getContext()));
        map.put("locale", pjn.b(null));
        return map;
    }

    private static JSONObject getActivityParams() {
        return new JSONObject(new ActivityInfoListFactory(BaseApplication.getContext()).getBody(null));
    }

    public static String getClientVersion(Context context) {
        String strA = CommonUtil.a(context);
        return strA.contains("-") ? strA.substring(0, strA.indexOf("-")) : strA;
    }

    private static String listToString(List<Integer> list) {
        if (njy.e(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(",");
            sb.append(num);
        }
        return sb.substring(1);
    }
}
