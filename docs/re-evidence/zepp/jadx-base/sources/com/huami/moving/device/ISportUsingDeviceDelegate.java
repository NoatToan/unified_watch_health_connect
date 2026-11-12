package com.huami.moving.device;

import android.content.Context;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportUsingDeviceDelegate {
    int deviceIconResId(int i, boolean z);

    int getBandValue();

    String getDeviceId(int i);

    String getSN(int i);

    int getShoeValue();

    boolean hasBaroMeter();

    boolean hasValidDevices();

    int heartRateState(int i);

    boolean isBandConnected();

    boolean isHrDevice(int i);

    boolean isHrDeviceConnected();

    boolean isShoeConnected();

    boolean isSupportStep(Context context);

    boolean isValidHrDevices();

    void remindHRIfNeed(int i);

    boolean remindPaceIfNeed(float f);

    boolean sendVerifyDisCmd2Device(long j, int i, int i2, int i3);

    boolean setWebIcon(Context context, int i, ImageView imageView);
}
