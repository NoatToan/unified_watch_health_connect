package com.miui.tsmclient.net.request;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.ReadOnlySecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.GroupConfigInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigListRequest extends ReadOnlySecureRequest<GroupConfigInfo> {
    public ConfigListRequest(CardInfo cardInfo, String str, ResponseListener<GroupConfigInfo> responseListener) {
        super("GET", TSMAuthContants.URL_QUERY_GROUPED_CONFIGS_V2, GroupConfigInfo.class, responseListener);
        addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams("cardName", cardInfo == null ? null : cardInfo.mCardType).addParams("key", str).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(cardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion());
    }
}
