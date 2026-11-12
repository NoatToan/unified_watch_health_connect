package com.xiaomi.fitness.heartrate.camera;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/OnCounterChangedListener;", "", "onCounterValueChanged", "", VibrateModeSetFragment.MAX, "", "value", "onCounterFinished", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnCounterChangedListener {
    void onCounterFinished();

    void onCounterValueChanged(int max, int value);
}
