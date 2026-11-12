package com.huawei.health.tradeservice.cloud;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import defpackage.njy;
import defpackage.pjn;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class AssetMessageManager {
    private static final String TAG = "TradeService_AssetManager";

    public static void assetMsgNotify(int i, IBaseResponseCallback iBaseResponseCallback) {
        AssetMsgNotifyReq assetMsgNotifyReq = new AssetMsgNotifyReq();
        assetMsgNotifyReq.setMessageType(i);
        assetMsgNotifyReq.setTerritory(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        LogUtil.a(TAG, "assetMsgNotify: ", assetMsgNotifyReq.toString());
        TradeServiceCloudMgr.getInstance().assetMsgNotify(assetMsgNotifyReq, iBaseResponseCallback);
    }

    public static void assetMsgListQuery(int i, long j, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.a(TAG, "assetMsgListQuery callBack is null");
            return;
        }
        LogUtil.a(TAG, "assetMsgListQuery enter");
        HashMap<String, String> map = new HashMap<>(0);
        if (i > 0) {
            map.put(BleConstants.LIMIT, String.valueOf(i));
        }
        if (j > 0) {
            map.put("cutOffTime", String.valueOf(j));
        }
        map.put("locale", pjn.b(null));
        TradeServiceCloudMgr.getInstance().assetMsgListQuery(new AssetMsgListReq(), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.AssetMessageManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (obj instanceof AssetMsgListRsp) {
                    iBaseResponseCallback.a(i2, ((AssetMsgListRsp) obj).getMessages());
                } else {
                    iBaseResponseCallback.a(i2, null);
                }
            }
        });
    }

    public static void assetMsgVisited(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        if (njy.e(list)) {
            LogUtil.a(TAG, "assetMsgVisited param is null");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        AssetMsgVisitedReq assetMsgVisitedReq = new AssetMsgVisitedReq();
        assetMsgVisitedReq.setMessageIds(list);
        LogUtil.a(TAG, "assetMsgVisited: ", assetMsgVisitedReq.toString());
        TradeServiceCloudMgr.getInstance().assetMsgVisited(assetMsgVisitedReq, iBaseResponseCallback);
    }
}
