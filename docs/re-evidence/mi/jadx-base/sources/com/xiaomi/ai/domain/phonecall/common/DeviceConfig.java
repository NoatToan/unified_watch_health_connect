package com.xiaomi.ai.domain.phonecall.common;

import com.typesafe.config.a;
import defpackage.aqe;
import defpackage.jlo;
import defpackage.nb4;
import defpackage.qpe;
import defpackage.t08;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceConfig {
    private static final String APP_ID_KEY = "app_id";
    private static final String APP_NAME_KEY = "app_name";
    private static final String DEVICE_CONFIG = "com.xiaomi.ai.domain.phoneCall.devices";
    private static final String DEVICE_FILE = "phonecall-device.conf";
    private static final String FUNCTIONS_KEY = "functions";
    private static final String STRATEGY_KEY = "strategies";
    private Map<String, DeviceApp> appIdToDevice = new HashMap();
    private Map<Function, Set<String>> funcDevices = new HashMap();
    private Map<ResponseStrategy, Set<String>> strategyDevices = new HashMap();
    private static final qpe LOGGER = aqe.f(DeviceConfig.class);
    private static DeviceConfig config = null;

    private DeviceConfig() {
        try {
            for (nb4 nb4Var : a.i(new InputStreamReader(t08.a(DEVICE_FILE))).j(DEVICE_CONFIG)) {
                String string = nb4Var.v("app_id") ? nb4Var.getString("app_id") : "";
                String string2 = nb4Var.v("app_name") ? nb4Var.getString("app_name") : "";
                if (jlo.a(string)) {
                    this.appIdToDevice.put(string, new DeviceApp(string, string2, ""));
                }
                if (nb4Var.v(FUNCTIONS_KEY)) {
                    Iterator<String> it = nb4Var.f(FUNCTIONS_KEY).iterator();
                    while (it.hasNext()) {
                        Function functionFromString = Function.fromString(it.next());
                        if (functionFromString != null) {
                            Set<String> treeSet = this.funcDevices.get(functionFromString);
                            if (treeSet == null) {
                                treeSet = new TreeSet<>();
                                this.funcDevices.put(functionFromString, treeSet);
                            }
                            treeSet.add(string);
                            LOGGER.info("load app_id:{} app_name:{} function:{}", string, string2, functionFromString.getFunc());
                        }
                    }
                }
                if (nb4Var.v(STRATEGY_KEY)) {
                    Iterator<String> it2 = nb4Var.f(STRATEGY_KEY).iterator();
                    while (it2.hasNext()) {
                        ResponseStrategy responseStrategyFromString = ResponseStrategy.fromString(it2.next());
                        Set<String> treeSet2 = this.strategyDevices.get(responseStrategyFromString);
                        if (treeSet2 == null) {
                            treeSet2 = new TreeSet<>();
                            this.strategyDevices.put(responseStrategyFromString, treeSet2);
                        }
                        treeSet2.add(string);
                        LOGGER.info("load app_id:{} app_name:{} strategy:{}", string, string2, responseStrategyFromString.toString());
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("error:{}", e.getMessage());
        }
    }

    public static DeviceConfig getInstance() {
        try {
            if (config == null) {
                synchronized (DeviceConfig.class) {
                    try {
                        if (config == null) {
                            config = new DeviceConfig();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return config;
        } catch (Exception e) {
            LOGGER.error("error:{}", e.getMessage());
            return null;
        }
    }

    public static boolean supportDevice(String str) {
        return getInstance().appIdToDevice.containsKey(str);
    }

    public static boolean supportFunction(String str, Function function) {
        Set<String> set = getInstance().funcDevices.get(function);
        return set != null && set.contains(str);
    }

    public static boolean useStrategy(ResponseStrategy responseStrategy, String str) {
        Set<String> set = getInstance().strategyDevices.get(responseStrategy);
        return set != null && set.contains(str);
    }
}
