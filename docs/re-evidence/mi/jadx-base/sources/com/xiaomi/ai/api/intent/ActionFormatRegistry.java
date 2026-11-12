package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ActionFormatRegistry {
    public static ConcurrentHashMap<String, action.ActionName> intentFormatCache = new ConcurrentHashMap<>();

    static {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ActionFormatRegistry.class.getClassLoader().getResourceAsStream("intents")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (!line.isEmpty() && !line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                    action.ActionName actionNameNewInstance = action.ActionName.newInstance(line.split("\t")[0]);
                    intentFormatCache.put(actionNameNewInstance.intentName(), actionNameNewInstance);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static Optional<action.ActionName> findActionName(String str) {
        return Optional.e(intentFormatCache.get(str));
    }
}
