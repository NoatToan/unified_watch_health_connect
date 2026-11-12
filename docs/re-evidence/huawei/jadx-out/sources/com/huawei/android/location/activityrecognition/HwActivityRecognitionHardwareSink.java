package com.huawei.android.location.activityrecognition;

/* JADX INFO: loaded from: classes2.dex */
public interface HwActivityRecognitionHardwareSink {
    void onActivityChanged(HwActivityChangedEvent hwActivityChangedEvent);

    void onActivityExtendChanged(HwActivityChangedExtendEvent hwActivityChangedExtendEvent);

    void onEnvironmentChanged(HwEnvironmentChangedEvent hwEnvironmentChangedEvent);
}
