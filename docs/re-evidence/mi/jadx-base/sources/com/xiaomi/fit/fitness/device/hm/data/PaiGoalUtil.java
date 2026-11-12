package com.xiaomi.fit.fitness.device.hm.data;

import com.xiaomi.hm.health.bt.sdk.pai.PaiGoalData;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/data/PaiGoalUtil;", "", "<init>", "()V", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaiGoalUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static PaiGoalData paiGoalData;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/data/PaiGoalUtil$Companion;", "", "<init>", "()V", "paiGoalData", "Lcom/xiaomi/hm/health/bt/sdk/pai/PaiGoalData;", "getPaiGoalData$annotations", "getPaiGoalData", "()Lcom/xiaomi/hm/health/bt/sdk/pai/PaiGoalData;", "setPaiGoalData", "(Lcom/xiaomi/hm/health/bt/sdk/pai/PaiGoalData;)V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getPaiGoalData$annotations() {
        }

        @Nullable
        public final PaiGoalData getPaiGoalData() {
            return PaiGoalUtil.paiGoalData;
        }

        public final void setPaiGoalData(@Nullable PaiGoalData paiGoalData) {
            PaiGoalUtil.paiGoalData = paiGoalData;
        }
    }

    @Nullable
    public static final PaiGoalData getPaiGoalData() {
        return INSTANCE.getPaiGoalData();
    }

    public static final void setPaiGoalData(@Nullable PaiGoalData paiGoalData2) {
        INSTANCE.setPaiGoalData(paiGoalData2);
    }
}
