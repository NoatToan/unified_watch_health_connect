package defpackage;

import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class odo {
    private static String e(String str) {
        if (oco.b("ODSA_CUCC_DIFF_NUMBER_SUPPORT", (Boolean) false).booleanValue()) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                ocq.c("OdsaResolveObjectToXml", "encode url value error.");
            }
        }
        return str;
    }

    public static URL a(String str, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, int i, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        HashMap<String, String> mapC = c(absPrimaryDevice, absPairedDevice, i, map);
        boolean z = true;
        for (Map.Entry<String, String> entry : mapC.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (!"vers".equals(key) && !key.isEmpty() && !value.isEmpty()) {
                if (z) {
                    sb.append("?");
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(key);
                sb.append("=");
                sb.append(e(value));
            }
        }
        sb.append("&vers=");
        sb.append(mapC.get("vers"));
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException unused) {
            ocq.c("OdsaResolveObjectToXml", "getRequestUrl MalformedURLException error.");
            return null;
        }
    }

    private static HashMap<String, String> c(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, int i, Map<String, String> map) {
        String imsi;
        HashMap<String, String> map2 = new HashMap<>();
        if (absPrimaryDevice == null || absPairedDevice == null) {
            ocq.c("OdsaResolveObjectToXml", "primaryDevice == null || pairedDevice == null.");
            return map2;
        }
        if (i == 0) {
            b(map2, absPrimaryDevice, absPairedDevice);
        } else if (i == 3 || i == 5) {
            c(map2, absPrimaryDevice, absPairedDevice);
        } else if (i == 1) {
            c(map2, absPrimaryDevice, absPairedDevice, map);
        } else if (i == 2) {
            e(map2, absPrimaryDevice, absPairedDevice, map);
        } else if (i != 4) {
            ocq.a("OdsaResolveObjectToXml", "getRequestMap donothing");
        } else {
            c(map2, absPrimaryDevice, map);
        }
        AuthParam authParamB = odd.d().b();
        if (authParamB == null) {
            ocq.c("OdsaResolveObjectToXml", "get from authParam is null.");
            imsi = null;
        } else {
            imsi = authParamB.getImsi();
        }
        if (oco.b("ODSA_ADD_IMSI", (Boolean) false).booleanValue()) {
            map2.put("IMSI", imsi);
        }
        ocq.c("OdsaResolveObjectToXml", "get from authParam imsi=", imsi);
        return map2;
    }

    private static void b(HashMap<String, String> map, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice) {
        map.put("terminal_id", absPrimaryDevice.getTerminalId());
        map.put("token", oed.e());
        map.put("terminal_vendor", absPrimaryDevice.getTerminalVendor());
        map.put("terminal_model", absPrimaryDevice.getTerminalModel());
        map.put("terminal_sw_version", absPrimaryDevice.getTerminalSwVersion());
        map.put("provisioning_version", "4.0");
        map.put("entitlement_version", oco.c("ODSA_ES_VERSION", "1.0"));
        map.put("app", "ap2006");
        map.put("operation", oeb.f44225a[0]);
        map.put("companion_terminal_id", absPairedDevice.getTerminalId());
        if (oco.b("ODSA_ADD_COMPANION_INFO", (Boolean) false).booleanValue()) {
            map.put("companion_terminal_vendor", "Huawei");
            map.put("companion_terminal_model", absPairedDevice.getTerminalModel());
            map.put("companion_terminal_sw_version", absPairedDevice.getTerminalSwVersion());
        }
        map.put("vers", oco.b("ODSA_SIMPLE_VERS", (Boolean) true).booleanValue() ? "1" : "1 HTTP/1.1");
        map.put("app_name", "Health");
        map.put("app_version", "11.0.6.002");
    }

    private static void c(HashMap<String, String> map, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice) {
        map.put("terminal_id", absPrimaryDevice.getTerminalId());
        map.put("token", oed.e());
        map.put("terminal_vendor", absPrimaryDevice.getTerminalVendor());
        map.put("terminal_model", absPrimaryDevice.getTerminalModel());
        map.put("provisioning_version", "4.0");
        map.put("terminal_sw_version", absPrimaryDevice.getTerminalSwVersion());
        map.put("app", "ap2006");
        map.put("operation", oeb.f44225a[3]);
        map.put("companion_terminal_id", absPairedDevice.getTerminalId());
        map.put("entitlement_version", oco.c("ODSA_ES_VERSION", "1.0"));
        map.put("app_name", "Health");
        map.put("vers", oco.b("ODSA_SIMPLE_VERS", (Boolean) true).booleanValue() ? "1" : "1 HTTP/1.1");
    }

    private static void c(HashMap<String, String> map, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map2) {
        map.put("terminal_id", absPrimaryDevice.getTerminalId());
        map.put("token", oed.e());
        map.put("app", "ap2006");
        map.put("operation", oeb.f44225a[1]);
        map.put("provisioning_version", "4.0");
        map.put("companion_terminal_id", absPairedDevice.getTerminalId());
        map.put("companion_terminal_eid", absPairedDevice.getTerminalEid());
        if (oco.b("ODSA_ADD_COMPANION_INFO", (Boolean) false).booleanValue()) {
            map.put("companion_terminal_vendor", "Huawei");
            map.put("companion_terminal_model", absPairedDevice.getTerminalModel());
            map.put("companion_terminal_sw_version", absPairedDevice.getTerminalSwVersion());
            if (oco.b("ODSA_CUCC_DIFF_NUMBER_SUPPORT", (Boolean) false).booleanValue()) {
                String companionTerminalService = absPrimaryDevice.getCompanionTerminalService().isEmpty() ? "SharedNumber" : absPrimaryDevice.getCompanionTerminalService();
                map.put("companion_terminal_service", companionTerminalService);
                ocq.e("OdsaResolveObjectToXml", "initManageSubscriptionParams COMPANION_TERMINAL_SERVICE:" + companionTerminalService);
            } else {
                map.put("companion_terminal_service", "SharedNumber");
                ocq.e("OdsaResolveObjectToXml", "initManageSubscriptionParams default COMPANION_TERMINAL_SERVICE");
            }
            map.put("companion_terminal_friendly_name", "Huawei");
        }
        map.put("vers", oco.b("ODSA_SIMPLE_VERS", (Boolean) true).booleanValue() ? "1" : "1 HTTP/1.1");
        map.put("app_name", "Health");
        map.put("entitlement_version", oco.c("ODSA_ES_VERSION", "1.0"));
        map.put("terminal_model", absPrimaryDevice.getTerminalModel());
        map.put("terminal_sw_version", absPrimaryDevice.getTerminalSwVersion());
        map.put("terminal_vendor", absPrimaryDevice.getTerminalVendor());
        if (oco.b("SupportedLiveID", (Boolean) false).booleanValue()) {
            map.put("SupportedLiveID", oco.b("SupportedLiveID", (Boolean) false).toString());
        }
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    private static void e(HashMap<String, String> map, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map2) {
        map.put("terminal_id", absPrimaryDevice.getTerminalId());
        map.put("token", oed.e());
        map.put("terminal_vendor", absPrimaryDevice.getTerminalVendor());
        map.put("terminal_model", absPrimaryDevice.getTerminalModel());
        map.put("app_name", "Health");
        map.put("terminal_sw_version", absPrimaryDevice.getTerminalSwVersion());
        map.put("app", "ap2006");
        map.put("operation", oeb.f44225a[2]);
        map.put("operation_type", map2.get("operation_type"));
        map.put("companion_terminal_id", absPairedDevice.getTerminalId());
        boolean zBooleanValue = oco.b("ODSA_CUCC_DIFF_NUMBER_SUPPORT", (Boolean) false).booleanValue();
        if (oco.b("ODSA_ADD_COMPANION_INFO", (Boolean) false).booleanValue()) {
            map.put("companion_terminal_vendor", "Huawei");
            map.put("companion_terminal_model", absPairedDevice.getTerminalModel());
            map.put("companion_terminal_sw_version", absPairedDevice.getTerminalSwVersion());
            if (zBooleanValue) {
                String companionTerminalService = absPrimaryDevice.getCompanionTerminalService().isEmpty() ? "SharedNumber" : absPrimaryDevice.getCompanionTerminalService();
                map.put("companion_terminal_service", companionTerminalService);
                ocq.e("OdsaResolveObjectToXml", "initManageServiceParams COMPANION_TERMINAL_SERVICE:" + companionTerminalService);
            }
        }
        if (!zBooleanValue) {
            map.put("companion_terminal_service", "SharedNumber");
            ocq.e("OdsaResolveObjectToXml", "initManageServiceParams default COMPANION_TERMINAL_SERVICE");
        }
        map.put("vers", oco.b("ODSA_SIMPLE_VERS", (Boolean) true).booleanValue() ? "1" : "1 HTTP/1.1");
    }

    private static void c(HashMap<String, String> map, AbsPrimaryDevice absPrimaryDevice, Map<String, String> map2) {
        ocq.e("OdsaResolveObjectToXml", "initAcquireOdsaUrlParams");
        map.put("terminal_id", absPrimaryDevice.getTerminalId());
        map.put("entitlement_version", oco.c("ODSA_ES_VERSION", "1.0"));
        map.put("provisioning_version", "4.0");
        map.put("terminal_vendor", absPrimaryDevice.getTerminalVendor());
        map.put("terminal_model", absPrimaryDevice.getTerminalModel());
        map.put("terminal_sw_version", absPrimaryDevice.getTerminalSwVersion());
        map.put("app", "ap2006");
        map.put("app_name", "Health");
        map.put("vers", oco.b("ODSA_SIMPLE_VERS", (Boolean) true).booleanValue() ? "1" : "1 HTTP/1.1");
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public static String e(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, int i, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : c(absPrimaryDevice, absPairedDevice, i, map).entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                if (!key.isEmpty() && !value.isEmpty()) {
                    if ("operation_type".equals(key)) {
                        jSONObject.put(key, Integer.valueOf(value));
                    } else {
                        jSONObject.put(key, value);
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            ocq.c("OdsaResolveObjectToXml", "generateJsonStr error");
            return "";
        }
    }
}
