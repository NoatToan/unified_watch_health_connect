package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R(\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/classic/BoltSportStateHolder;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "command", "", "updateSportState", "sendAppCmdMsg", "Lcom/xiaomi/hm/health/bt/classic/HMSportController$TreadmillSportState;", "a", "Lcom/xiaomi/hm/health/bt/classic/HMSportController$TreadmillSportState;", "getSportState", "()Lcom/xiaomi/hm/health/bt/classic/HMSportController$TreadmillSportState;", "setSportState", "(Lcom/xiaomi/hm/health/bt/classic/HMSportController$TreadmillSportState;)V", "getSportState$annotations", "()V", "sportState", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", "b", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", "getSportInnerListener", "()Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", "setSportInnerListener", "(Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;)V", "getSportInnerListener$annotations", "sportInnerListener", "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BoltSportStateHolder {

    @NotNull
    public static final BoltSportStateHolder INSTANCE = new BoltSportStateHolder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static HMSportController.TreadmillSportState sportState = HMSportController.TreadmillSportState.NONE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static IHMSportListener sportInnerListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportCommand.values().length];
            iArr[SportCommand.START.ordinal()] = 1;
            iArr[SportCommand.RESUME.ordinal()] = 2;
            iArr[SportCommand.PAUSE.ordinal()] = 3;
            iArr[SportCommand.STOP.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BoltSportStateHolder() {
    }

    @Nullable
    public static final IHMSportListener getSportInnerListener() {
        return sportInnerListener;
    }

    @JvmStatic
    public static /* synthetic */ void getSportInnerListener$annotations() {
    }

    @NotNull
    public static final HMSportController.TreadmillSportState getSportState() {
        return sportState;
    }

    @JvmStatic
    public static /* synthetic */ void getSportState$annotations() {
    }

    @JvmStatic
    public static final void sendAppCmdMsg(@NotNull SportCommand command) {
        if (command == SportCommand.START || command == SportCommand.PAUSE || command == SportCommand.RESUME || command == SportCommand.STOP) {
            updateSportState(command);
        }
    }

    public static final void setSportInnerListener(@Nullable IHMSportListener iHMSportListener) {
        sportInnerListener = iHMSportListener;
    }

    public static final void setSportState(@NotNull HMSportController.TreadmillSportState treadmillSportState) {
        sportState = treadmillSportState;
    }

    @JvmStatic
    public static final void updateSportState(@NotNull SportCommand command) {
        int i = WhenMappings.$EnumSwitchMapping$0[command.ordinal()];
        if (i == 1 || i == 2) {
            sportState = HMSportController.TreadmillSportState.RUNNING;
        } else if (i == 3) {
            sportState = HMSportController.TreadmillSportState.PAUSED;
        } else if (i == 4) {
            sportState = HMSportController.TreadmillSportState.NONE;
        }
        IHMSportListener iHMSportListener = sportInnerListener;
        if (iHMSportListener == null) {
            return;
        }
        iHMSportListener.onSportCommand(command);
    }
}
