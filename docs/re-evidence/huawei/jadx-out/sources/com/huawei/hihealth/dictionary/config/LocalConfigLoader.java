package com.huawei.hihealth.dictionary.config;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.dictionary.model.HiHealthDictionary;
import com.huawei.hihealth.dictionary.utils.DictUtils;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class LocalConfigLoader implements ConfigureLoader {
    @Override // com.huawei.hihealth.dictionary.config.ConfigureLoader
    public String getName() {
        return "local_json_config";
    }

    @Override // com.huawei.hihealth.dictionary.config.ConfigureLoader
    public HiHealthDictionary loadConfig(Context context) {
        String strB = DictUtils.b(context, "dict_config.txt");
        if (strB == null) {
            LogUtil.c("HiH_LocalConfigLoader", "read local json config failed.");
            return null;
        }
        try {
            return (HiHealthDictionary) new Gson().fromJson(strB, HiHealthDictionary.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.c("HiH_LocalConfigLoader", "parse local json config failed for error format.");
            return null;
        } catch (Exception unused2) {
            LogUtil.c("HiH_LocalConfigLoader", "parse local json config failed for unknown error.");
            return null;
        }
    }
}
