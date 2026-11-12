package com.huawei.hihealth.dictionary.config;

import android.content.Context;
import com.huawei.hihealth.dictionary.model.HiHealthDictionary;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConfigureManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ConfigureManager f12267c;
    private static final Object e = new Object();
    private List<ConfigureLoader> d = new ArrayList(1);

    private ConfigureManager() {
    }

    public static ConfigureManager a() {
        if (f12267c == null) {
            synchronized (e) {
                if (f12267c == null) {
                    LogUtil.e("HiH_DictConfigureManager", "start to create ConfigureManager.");
                    ConfigureManager configureManager = new ConfigureManager();
                    configureManager.e(new LocalConfigLoader());
                    configureManager.e(new CloudConfigLoader());
                    f12267c = configureManager;
                }
            }
        }
        return f12267c;
    }

    public void e(ConfigureLoader configureLoader) {
        if (configureLoader == null) {
            LogUtil.d("HiH_DictConfigureManager", "configureLoader is null");
        } else {
            this.d.add(configureLoader);
        }
    }

    public List<HiHealthDictionary> b(Context context) {
        ArrayList arrayList = new ArrayList();
        for (ConfigureLoader configureLoader : this.d) {
            LogUtil.a("HiH_DictConfigureManager", "start to load dict config from:", configureLoader.getName());
            HiHealthDictionary hiHealthDictionaryLoadConfig = configureLoader.loadConfig(context);
            LogUtil.a("HiH_DictConfigureManager", "finish load dict config from:", configureLoader.getName());
            if (hiHealthDictionaryLoadConfig == null) {
                LogUtil.d("HiH_DictConfigureManager", "dict load failed from ", configureLoader.getName());
            } else if (!hiHealthDictionaryLoadConfig.g()) {
                LogUtil.d("HiH_DictConfigureManager", "dict data is illegal. version:", Integer.valueOf(hiHealthDictionaryLoadConfig.h()));
            } else {
                hiHealthDictionaryLoadConfig.a();
                hiHealthDictionaryLoadConfig.d();
                hiHealthDictionaryLoadConfig.e();
                arrayList.add(hiHealthDictionaryLoadConfig);
            }
        }
        return arrayList;
    }
}
