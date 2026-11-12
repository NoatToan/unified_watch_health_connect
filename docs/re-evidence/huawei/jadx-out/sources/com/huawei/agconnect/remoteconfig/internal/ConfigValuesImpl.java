package com.huawei.agconnect.remoteconfig.internal;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.agconnect.remoteconfig.internal.utils.Constant$BooleanRegex;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigValuesImpl implements ConfigValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConfigContainer f5058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5059b;

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public String getValueAsString(String str) {
        String string;
        try {
            ConfigContainer configContainer = this.f5058a;
            string = configContainer != null ? configContainer.b().getString(str) : null;
        } catch (JSONException unused) {
            Logger.d("RemoteConfig", "not find in config values for key : " + str);
        }
        return string != null ? string : "";
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public Long getValueAsLong(String str) {
        Long lValueOf;
        try {
            ConfigContainer configContainer = this.f5058a;
            lValueOf = configContainer != null ? Long.valueOf(configContainer.b().getLong(str)) : null;
        } catch (JSONException unused) {
            Logger.d("RemoteConfig", "not find in config values for key : " + str);
        }
        if (lValueOf != null) {
            return lValueOf;
        }
        return 0L;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public Double getValueAsDouble(String str) {
        Double dValueOf;
        try {
            ConfigContainer configContainer = this.f5058a;
            dValueOf = configContainer != null ? Double.valueOf(configContainer.b().getDouble(str)) : null;
        } catch (JSONException unused) {
            Logger.d("RemoteConfig", "not find in config values for key : " + str);
        }
        return dValueOf != null ? dValueOf : Double.valueOf(0.0d);
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public byte[] getValueAsByteArray(String str) {
        String string;
        try {
            ConfigContainer configContainer = this.f5058a;
            string = configContainer != null ? configContainer.b().getString(str) : null;
        } catch (JSONException unused) {
            Logger.d("RemoteConfig", "not find in config values for key : " + str);
        }
        return string != null ? string.getBytes(Charset.forName("UTF-8")) : AGConnectConfig.DEFAULT.BYTE_ARRAY_VALUE;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public Boolean getValueAsBoolean(String str) {
        String string;
        try {
            ConfigContainer configContainer = this.f5058a;
            string = configContainer != null ? configContainer.b().getString(str) : null;
        } catch (JSONException unused) {
            Logger.d("RemoteConfig", "not find in config values for key : " + str);
        }
        if (string != null) {
            if (Constant$BooleanRegex.f5064a.matcher(string).matches()) {
                return Boolean.TRUE;
            }
            if (Constant$BooleanRegex.f5065b.matcher(string).matches()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public boolean containKey(String str) {
        ConfigContainer configContainer = this.f5058a;
        return (configContainer == null || configContainer.b().opt(str) == null) ? false : true;
    }

    public Map<String, Object> c() {
        HashMap map = new HashMap();
        ConfigContainer configContainer = this.f5058a;
        if (configContainer != null) {
            Iterator<String> itKeys = configContainer.b().keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = this.f5058a.b().opt(next);
                if (objOpt != null) {
                    map.put(next, objOpt);
                }
            }
        }
        return map;
    }

    ConfigContainer b() {
        return this.f5058a;
    }

    void a(ConfigContainer configContainer) {
        this.f5058a = configContainer;
        SharedPrefUtil.getInstance().put("com.huawei.agconnect.config", this.f5059b, ConfigContainer.class, configContainer, AgcCrypto.class);
    }

    void a() {
        this.f5058a = new ConfigContainer((JSONObject) null);
        SharedPrefUtil.getInstance().remove("com.huawei.agconnect.config", this.f5059b);
    }

    ConfigValuesImpl(String str, AGConnectInstance aGConnectInstance) {
        String str2 = str + "_" + aGConnectInstance.getIdentifier();
        this.f5059b = str2;
        this.f5058a = (ConfigContainer) SharedPrefUtil.getInstance().get("com.huawei.agconnect.config", str2, ConfigContainer.class, null, AgcCrypto.class);
    }
}
