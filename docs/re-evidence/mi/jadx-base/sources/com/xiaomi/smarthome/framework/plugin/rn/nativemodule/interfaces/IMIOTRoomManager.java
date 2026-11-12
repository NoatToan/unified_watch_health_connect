package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTRoomManager {
    void addNewRoomWithName(String str, Callback callback);

    void editRoom(ReadableMap readableMap, Callback callback);

    void getRoomList(Callback callback);

    void getRoomNames(ReadableArray readableArray, Callback callback);
}
