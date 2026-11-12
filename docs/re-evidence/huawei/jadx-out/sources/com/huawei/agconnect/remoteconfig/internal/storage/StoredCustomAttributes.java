package com.huawei.agconnect.remoteconfig.internal.storage;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import com.huawei.agconnect.remoteconfig.internal.utils.DataProcessingFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class StoredCustomAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f5062a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5063b;

    public void a(Map<String, String> map) {
        this.f5062a = map;
        if (map == null || map.size() == 0) {
            SharedPrefUtil.getInstance().remove("com.huawei.agc.remoteconfig", this.f5063b);
            return;
        }
        try {
            SharedPrefUtil.getInstance().put("com.huawei.agc.remoteconfig", this.f5063b, String.class, new JSONObject(map).toString(), DefaultCrypto.class);
        } catch (NullPointerException e) {
            Logger.e("RemoteConfig", "map to json error:" + e.getMessage());
        }
    }

    public Map<String, String> a() {
        return this.f5062a;
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        String str = (String) SharedPrefUtil.getInstance().get("com.huawei.agc.remoteconfig", this.f5063b, String.class, null, DefaultCrypto.class);
        if (!TextUtils.isEmpty(str)) {
            try {
                return DataProcessingFactory.a(new JSONObject(str));
            } catch (JSONException e) {
                Logger.e("RemoteConfig", "processJsonToMap error:" + e.getMessage());
            }
        }
        return map;
    }

    public StoredCustomAttributes(AGConnectInstance aGConnectInstance) {
        this.f5063b = "customAttributesKey_" + aGConnectInstance.getIdentifier();
    }
}
