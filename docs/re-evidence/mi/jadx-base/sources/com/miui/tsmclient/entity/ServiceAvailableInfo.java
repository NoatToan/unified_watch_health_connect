package com.miui.tsmclient.entity;

import android.content.Context;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceAvailableInfo {
    private ActionType mActionType;
    private CardInfo mCardInfo;

    public enum ActionType {
        ISSUE(1),
        RECHARGE(2),
        TRANSFER_OUT(4),
        TRANSFER_IN(5),
        AFTER_SALE(10),
        RETURN(14);

        private int mId;

        ActionType(int i) {
            this.mId = i;
        }
    }

    public enum OS {
        ANDROID(0),
        IOS(1);

        private int mId;

        OS(int i) {
            this.mId = i;
        }
    }

    public ServiceAvailableInfo(CardInfo cardInfo, ActionType actionType) {
        this.mCardInfo = cardInfo;
        this.mActionType = actionType;
    }

    public Map<String, String> getParams(Context context) {
        HashMap map = new HashMap();
        CardInfo cardInfo = this.mCardInfo;
        if (cardInfo != null) {
            map.put("cardName", cardInfo.mCardType);
        }
        ActionType actionType = this.mActionType;
        if (actionType != null) {
            map.put(TSMAuthContants.PARAM_CARD_ACTION_TYPE, actionType.toString());
        }
        map.put("deviceModel", DeviceUtils.getDeviceModel(null));
        map.put(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(null));
        map.put(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion());
        map.put(TSMAuthContants.PARAM_OS, OS.ANDROID.toString());
        return map;
    }
}
