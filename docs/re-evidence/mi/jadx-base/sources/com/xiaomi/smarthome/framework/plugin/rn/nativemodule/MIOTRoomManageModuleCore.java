package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTRoomManager;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import defpackage.ndj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTRoomManageModuleCore.NAME)
public class MIOTRoomManageModuleCore extends MIOTBaseJavaModule implements IMIOTRoomManager, ReactModuleWithSpec {
    public static final String NAME = "MHRoom";

    public MIOTRoomManageModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private boolean shouldRetDidList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("xiaomi.wifispeaker");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTRoomManager
    @ReactMethod
    public void addNewRoomWithName(String str, Callback callback) {
        if (callback == null) {
            return;
        }
        if (getDevice() == null) {
            callback.invoke(Boolean.FALSE, "current device is null...");
        } else {
            getRnPluginHostApiProvider().addNewRoomWithName(str, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTRoomManager
    @ReactMethod
    public void editRoom(ReadableMap readableMap, Callback callback) {
        if (callback == null) {
            return;
        }
        if (readableMap == null) {
            callback.invoke(Boolean.FALSE, "params is null");
            return;
        }
        if (getDevice() == null) {
            callback.invoke(Boolean.FALSE, "current device is null...");
            return;
        }
        String string = readableMap.getString("roomId");
        String string2 = readableMap.getString("name");
        if (TextUtils.isEmpty(string)) {
            callback.invoke(Boolean.FALSE, "roomId is null or empty...");
        } else {
            getRnPluginHostApiProvider().editRoom(string, string2, callback);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTRoomManager
    @ReactMethod
    public void getRoomList(Callback callback) {
        if (callback == null) {
            return;
        }
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, "current device is null...");
        } else {
            getRnPluginHostApiProvider().getRoomList(shouldRetDidList(device.model), callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTRoomManager
    @ReactMethod
    public void getRoomNames(ReadableArray readableArray, Callback callback) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        if (arrayList.isEmpty()) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "roomIds can not be empty!"));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(obj instanceof String)) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "roomIds elements must be String type!"));
                return;
            }
            arrayList2.add((String) obj);
        }
        List<String> roomNames = getRnPluginHostApiProvider().getRoomNames(arrayList2);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = roomNames.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        callback.invoke(Boolean.TRUE, writableArrayCreateArray);
    }
}
