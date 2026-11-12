package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTAudio {
    void amrToWav(String str, String str2, Callback callback);

    void getRecordingPeakPower(Callback callback);

    void startPlay(String str, ReadableMap readableMap, Callback callback);

    void startRecord(String str, ReadableMap readableMap, Callback callback);

    void stopPlay(Callback callback);

    void stopRecord(Callback callback);

    void wavToAmr(String str, String str2, Callback callback);
}
