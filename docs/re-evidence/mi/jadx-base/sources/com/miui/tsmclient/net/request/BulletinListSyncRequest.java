package com.miui.tsmclient.net.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BulletinListSyncRequest extends SecureRequest<BulletinResponseInfo> {
    public BulletinListSyncRequest(String str, CardInfo cardInfo, String str2, Map<String, String> map) {
        super("GET", TSMAuthContants.URL_QUERY_BULLETINS, TypeToken.get(BulletinResponseInfo.class));
        addParams("tag", str).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams("cplc", str2);
        if (cardInfo != null) {
            map = map == null ? new HashMap<>() : map;
            map.put("cardName", cardInfo.mCardType);
            map.put("aid", cardInfo.mAid);
        }
        if (map != null) {
            addParams("extra", new Gson().toJson(map));
        }
    }
}
