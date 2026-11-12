package com.huami.respiratoryrate.bluetooth.transform;

import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/respiratoryrate/bluetooth/transform/RespRateBleTransformImpl;", "Lcom/huami/respiratoryrate/bluetooth/transform/IBleTransform;", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateData;", "bleData", "", "userId", "toDatabaseEntity", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateBleTransformImpl implements IBleTransform<RespRateEntity> {
    public static final int MIN_SECONDS = 60;
    public static final int SECOND_UNIT = 1000;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.respiratoryrate.bluetooth.transform.IBleTransform
    @NotNull
    public RespRateEntity toDatabaseEntity(@NotNull BreathRateData bleData, @NotNull String userId) {
        return new RespRateEntity(RespRateBleTransformImplKt.toCurrentMin(bleData.getCalendar().getTimeInMillis()), bleData.getBreathRate(), bleData.getCalendar().getTimeZone().getRawOffset() / 1000, userId, 0, 16, null);
    }
}
