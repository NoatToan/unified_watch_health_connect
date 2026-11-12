package com.huami.bluetooth.profile.channel.module.statistics;

import androidx.annotation.WorkerThread;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002H'¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/IStatisticsApi;", "Lcom/huami/bluetooth/profile/channel/module/statistics/ICompatStatisticsApi;", "", "queryVersion", "flag", "Lcom/xiaomi/hm/health/bt/model/HMStatisticInfo;", "getStatisticsInfo", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IStatisticsApi extends ICompatStatisticsApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int FLAG_ALGORITHM_TIME = 64;
    public static final int FLAG_ALL = 0;
    public static final int FLAG_APP_NOTIFY_COUNT = 4;
    public static final int FLAG_CONNECTED_TIME = 128;
    public static final int FLAG_DISCONNECT_COUNT = 16;
    public static final int FLAG_FLASH_TIME = 256;
    public static final int FLAG_KEY_PRESS_COUNT = 32;
    public static final int FLAG_LED_OPEN_TIME = 512;
    public static final int FLAG_LIFT_WRIST_COUNT = 2;
    public static final int FLAG_MCU_WAKE_TIME = 2048;
    public static final int FLAG_MOTOR_TIME = 8192;
    public static final int FLAG_PHONE_NOTIFY_COUNT = 8;
    public static final int FLAG_PPG_TIME = 1024;
    public static final int FLAG_REBOOT_COUNT = 1;
    public static final int FLAG_SYSTEM_RUN_TIME = 4096;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/IStatisticsApi$Companion;", "", "", "FLAG_ALL", LogUtil.I, "b", "FLAG", "FLAG_REBOOT_COUNT", "FLAG_LIFT_WRIST_COUNT", "FLAG_APP_NOTIFY_COUNT", "FLAG_PHONE_NOTIFY_COUNT", "FLAG_DISCONNECT_COUNT", "FLAG_KEY_PRESS_COUNT", "FLAG_ALGORITHM_TIME", "FLAG_CONNECTED_TIME", "FLAG_FLASH_TIME", "FLAG_LED_OPEN_TIME", "FLAG_PPG_TIME", "FLAG_MCU_WAKE_TIME", "FLAG_SYSTEM_RUN_TIME", "FLAG_MOTOR_TIME", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int FLAG_ALGORITHM_TIME = 64;
        public static final int FLAG_ALL = 0;
        public static final int FLAG_APP_NOTIFY_COUNT = 4;
        public static final int FLAG_CONNECTED_TIME = 128;
        public static final int FLAG_DISCONNECT_COUNT = 16;
        public static final int FLAG_FLASH_TIME = 256;
        public static final int FLAG_KEY_PRESS_COUNT = 32;
        public static final int FLAG_LED_OPEN_TIME = 512;
        public static final int FLAG_LIFT_WRIST_COUNT = 2;
        public static final int FLAG_MCU_WAKE_TIME = 2048;
        public static final int FLAG_MOTOR_TIME = 8192;
        public static final int FLAG_PHONE_NOTIFY_COUNT = 8;
        public static final int FLAG_PPG_TIME = 1024;
        public static final int FLAG_REBOOT_COUNT = 1;
        public static final int FLAG_SYSTEM_RUN_TIME = 4096;
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final int FLAG = 1;

        private Companion() {
        }
    }

    @WorkerThread
    @Nullable
    HMStatisticInfo getStatisticsInfo(int flag);

    @WorkerThread
    int queryVersion();
}
