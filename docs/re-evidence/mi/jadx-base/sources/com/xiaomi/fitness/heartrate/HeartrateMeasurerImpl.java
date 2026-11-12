package com.xiaomi.fitness.heartrate;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.heartrate.camera.CameraConfiguration;
import com.xiaomi.fitness.heartrate.export.HeartrateMeasurer;
import com.xiaomi.fitness.heartrate.finger.FingerprintDetectManager;
import com.xiaomi.fitness.heartrate.ui.CameraDetectActivity;
import com.xiaomi.fitness.heartrate.ui.DetectManualActivity;
import com.xiaomi.fitness.heartrate.ui.FingerDetectActivity;
import com.xiaomi.fitness.heartrate.utils.HeartRatePreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/heartrate/HeartrateMeasurerImpl;", "Lcom/xiaomi/fitness/heartrate/export/HeartrateMeasurer;", "detectManager", "Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;", "<init>", "(Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;)V", "isEnableDetect", "", "()Z", "launchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartrateMeasurerImpl implements HeartrateMeasurer {

    @NotNull
    private final FingerprintDetectManager detectManager;

    public HeartrateMeasurerImpl(@NotNull FingerprintDetectManager detectManager) {
        Intrinsics.checkNotNullParameter(detectManager, "detectManager");
        this.detectManager = detectManager;
    }

    @Override // com.xiaomi.fitness.heartrate.export.HeartrateMeasurer
    public boolean isEnableDetect() {
        return RomUtils.INSTANCE.isMiui() && !AppUtil.INSTANCE.isPlayChannel() && (CameraConfiguration.INSTANCE.isEnableDetect() || this.detectManager.isHasHardwareFingerprint());
    }

    @Override // com.xiaomi.fitness.heartrate.export.HeartrateMeasurer
    @NotNull
    public Intent launchIntent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        int i = this.detectManager.isHasHardwareFingerprint() ? 1 : 2;
        if (HeartRatePreference.INSTANCE.getSHOW_MANUAL()) {
            intent.setClass(context, DetectManualActivity.class);
            intent.putExtra(DetectManualActivity.DETECT_TYPE, i);
        } else if (i == 1) {
            intent.setClass(context, FingerDetectActivity.class);
        } else {
            intent.setClass(context, CameraDetectActivity.class);
        }
        return intent;
    }
}
