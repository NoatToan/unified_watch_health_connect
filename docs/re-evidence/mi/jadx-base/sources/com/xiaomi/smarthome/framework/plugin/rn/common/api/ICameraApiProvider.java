package com.xiaomi.smarthome.framework.plugin.rn.common.api;

import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public interface ICameraApiProvider {
    void checkSwitchFaceAiOpen(String str, String str2, String str3, boolean z, boolean z2, Callback callback);

    void getFreqFlag(Callback callback);
}
