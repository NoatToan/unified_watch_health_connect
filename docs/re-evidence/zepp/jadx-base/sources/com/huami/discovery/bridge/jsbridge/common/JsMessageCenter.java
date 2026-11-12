package com.huami.discovery.bridge.jsbridge.common;

import com.xiaomi.hm.health.discovery.jsbridge.function.SyncWatchSkinHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.TreadmillNoticeHandler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class JsMessageCenter {
    private static final String a = "{\"status\":\"success\"}";
    private static final String b = "Undefined Error, not support this code : %s";
    private static final HashMap<String, String> c = new HashMap<>();

    private JsMessageCenter() {
        HashMap<String, String> map = c;
        map.put("4000000", "Param syntax error.");
        map.put("4000001", SyncWatchSkinHandler.NET_ERROR_MSG);
        map.put("4020000", "Param {{ %s }} is required.");
        map.put("4020101", "Verify sign error.");
        map.put("4020201", "Parameter 'r','g','b' must be int between 0 to 255.");
        map.put("4020202", "Parameter 'a' must be float between 0 to 1.");
        map.put("4020301", "Parameter 'display' must be bool.");
        map.put("4040401", "Unknown button key.");
        map.put("4010401", "Invalid url: {{ %s }}.");
        map.put("4020501", "Param global object is required.");
        map.put("4020502", "Param type and capture are required.");
        map.put("4040501", "Unsupported type, just support {{card, image, text, mix}}.");
        map.put("4040502", "Unknown capture value, just support 0, 1, 2.");
        map.put("4040503", "Unsupported social in especial config : {{unsupported social name}}.");
        map.put("4010501", "Cannot use 'imgUrl' as share image , because used 'capture = {{param capture}}");
        map.put("4010502", "{{Social}} cannot support share type {{type}}");
        map.put("4010503", "Share type '{{type}}' require use {{param}}");
        map.put("4040504", "Unsupported event, just support close, enter, back.");
        map.put("4040505", "Unsupported social in ext config : {{unsupported social name}}.");
        map.put("4040601", "Not defined : '{{position}}'");
        map.put("4040602", "Unknown the fallbackEvent value : '{{fallbackEvent}}'");
        map.put("4040603", "The '{{fallbackEvent}}' of position '{{fallbackEvent}}' is unsupported");
        map.put("4040701", "This protocol is not registered.");
        map.put("4030801", "User has logout.");
        map.put("4030802", "User has kicked out.");
        map.put("4030803", "User has not login.");
        map.put("4030901", "Getting location is forbidden.");
        map.put("4040902", "Location is null.");
        map.put("4041001", SyncWatchSkinHandler.DEVICE_CONN_ERROR_MSG);
        map.put("4001001", SyncWatchSkinHandler.DOWNLOAD_ERROR_MSG);
        map.put("4001002", SyncWatchSkinHandler.SYNC_ERROR_MSG);
        map.put(TreadmillNoticeHandler.ERROR_CODE_MSG_FORMAT_WRONG, "Invalid payload.");
        map.put("4021201", SyncWatchSkinHandler.DEVICE_CONN_ERROR_MSG);
        map.put("4021201", SyncWatchSkinHandler.DEVICE_CONN_ERROR_MSG);
        map.put(TreadmillNoticeHandler.ERROR_CODE_WRITE_FAILED, "Sync Error.");
        map.put("4021203", "Device is not supported.");
        map.put("4021204", "Firmware version is low.");
        map.put("4021205", "Device's sub model is not supported.");
        map.put("4021206", "Device is not bound.");
    }

    public static JsMessageCenter get() {
        return new JsMessageCenter();
    }

    public ErrorMessage getMessage(String str) {
        ErrorMessage errorMessage = new ErrorMessage(str);
        HashMap<String, String> map = c;
        if (map.get(str) != null) {
            errorMessage.message = map.get(str);
        } else {
            errorMessage.message = String.format(b, str);
        }
        return errorMessage;
    }

    public String getMessageStr(String str) {
        return getMessage(str).toString();
    }

    public String getSuccess() {
        return "{\"status\":\"success\"}";
    }

    public ErrorMessage getMessage(String str, String str2) {
        ErrorMessage errorMessage = new ErrorMessage(str);
        HashMap<String, String> map = c;
        if (map.get(str) != null) {
            errorMessage.message = String.format(map.get(str), str2);
        } else {
            errorMessage.message = String.format(b, str);
        }
        return errorMessage;
    }
}
