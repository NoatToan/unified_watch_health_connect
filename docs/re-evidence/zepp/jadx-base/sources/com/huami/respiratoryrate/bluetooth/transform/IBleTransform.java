package com.huami.respiratoryrate.bluetooth.transform;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/respiratoryrate/bluetooth/transform/IBleTransform;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateData;", "bleData", "", "userId", "toDatabaseEntity", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateData;Ljava/lang/String;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IBleTransform<T> {
    T toDatabaseEntity(@NotNull BreathRateData bleData, @NotNull String userId);
}
