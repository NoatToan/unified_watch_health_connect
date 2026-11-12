package com.garmin.android.gncs.handlers;

import android.text.TextUtils;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ih2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractAppHandler {
    private static final Map<String, Class<? extends AbstractAppHandler>> appHandlers = new HashMap();
    private static final AbstractAppHandler noOpHandler = new AbstractAppHandler() { // from class: com.garmin.android.gncs.handlers.AbstractAppHandler.1
        @Override // com.garmin.android.gncs.handlers.AbstractAppHandler
        public boolean shouldSendToDevice(GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
            return z14;
        }
    };
    private static List<AbstractAppHandler> globalHandlers = new ArrayList();

    public static AbstractAppHandler getApplicationHandler(String str, int i14) {
        Map<String, Class<? extends AbstractAppHandler>> map = appHandlers;
        Class<? extends AbstractAppHandler> cls = map.get(str + ":" + i14);
        if (cls == null && i14 != 0) {
            cls = map.get(str + ":0");
        }
        if (cls != null) {
            try {
                return cls.getConstructor(null).newInstance(null);
            } catch (Exception e4) {
                b.a(e4, "AbstractAppHandler.getApplicationHandler");
            }
        }
        return noOpHandler;
    }

    public static List<AbstractAppHandler> getGlobalHandlers() {
        return globalHandlers;
    }

    public static void loadDynamicAppHandlers(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    Class<?> cls = Class.forName(jSONObject.getString("className"));
                    if (AbstractAppHandler.class.isAssignableFrom(cls)) {
                        String string = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                        registerApplicationHandler(string, jSONObject.optInt(RemoteConfigConstants.RequestFieldKey.APP_VERSION, 0), cls);
                        b.b("AbstractAppHandler.loadDynamicAppHandlers -> added [" + string + "], class [" + cls.getName() + "]");
                    }
                } catch (Throwable th3) {
                    b.c("AbstractAppHandler.loadDynamicAppHandlers", th3);
                }
            }
        } catch (Throwable th4) {
            b.c("AbstractAppHandler.loadDynamicAppHandlers", th4);
        }
    }

    public static void registerApplicationHandler(String str, int i14, Class<? extends AbstractAppHandler> cls) {
        appHandlers.put(str + ":" + i14, cls);
    }

    public static void registerGlobalHandler(AbstractAppHandler abstractAppHandler) {
        globalHandlers.add(abstractAppHandler);
    }

    public static void unregisterGlobalHandler(AbstractAppHandler abstractAppHandler) {
        globalHandlers.remove(abstractAppHandler);
    }

    public abstract boolean shouldSendToDevice(GNCSNotificationInfo gNCSNotificationInfo, boolean z14);
}
