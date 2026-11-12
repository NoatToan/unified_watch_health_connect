package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.hnq;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    hnq mValueNode;

    public EventAnimationDriver(List<String> list, hnq hnqVar) {
        this.mEventPath = list;
        this.mValueNode = hnqVar;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap == null) {
            throw new IllegalArgumentException("Native animated events must have event data.");
        }
        int i2 = 0;
        ReadableMap readableMap = writableMap;
        while (i2 < this.mEventPath.size() - 1) {
            ReadableMap map = readableMap.getMap(this.mEventPath.get(i2));
            i2++;
            readableMap = map;
        }
        hnq hnqVar = this.mValueNode;
        List<String> list = this.mEventPath;
        hnqVar.f = readableMap.getDouble(list.get(list.size() - 1));
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
