package com.huami.assistant;

import android.content.Context;
import android.util.Log;
import com.huami.assistant.dataexchange.IExchange;
import com.huami.assistant.dataexchange.WatchExchange;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\u0016\u001a\u00020\bH\u0007J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0007R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lcom/huami/assistant/AssistantModule;", "", "Lcom/huami/assistant/IAssistantModule;", "module", "", "a", "bleModule", "setBleModule", "", "isBleDevice", "Lcom/huami/assistant/dataexchange/IExchange;", "getExchange", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isDeviceConnected", "isSupportAlarm", "", "getAlarmCountLimit", "isSupportEvent", "isSupportPin", "isSupportFlight", "isSupportUpdates", "isOverSeaSchedule", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "getScheduleApi", "getCurrentSource", "", "Ljava/lang/String;", "TAG", "b", "Lcom/huami/assistant/IAssistantModule;", "sModule", "c", "sBleModule", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class AssistantModule {

    @NotNull
    public static final AssistantModule INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AssistantModule";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static IAssistantModule sModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static IAssistantModule sBleModule;

    static {
        AssistantModule assistantModule = new AssistantModule();
        INSTANCE = assistantModule;
        assistantModule.a(new IAssistantModule() { // from class: com.huami.assistant.AssistantModule.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int EVEREST_2_ALARM_COUNT_LIMIT = 10;

            @Override // com.huami.assistant.IAssistantModule
            public int getAlarmCountLimit(@NotNull Context context) {
                if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
                    return this.EVEREST_2_ALARM_COUNT_LIMIT;
                }
                return -1;
            }

            @Override // com.huami.assistant.IAssistantModule
            public int getCurrentSource(@NotNull Context context) {
                return DeviceSource.getDeviceSource(DeviceManager.getManager(context).getCurrentDevice());
            }

            @Override // com.huami.assistant.IAssistantModule
            @NotNull
            public IExchange getExchange() {
                return WatchExchange.get();
            }

            @Override // com.huami.assistant.IAssistantModule
            @Nullable
            public ScheduleRpcApi getScheduleApi() {
                return null;
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isBleDevice() {
                return false;
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isDeviceConnected(@NotNull Context context) {
                return DeviceManager.getManager(context).isBoundDeviceConnected();
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isOverSeaSchedule() {
                return false;
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isSupportAlarm(@NotNull Context context) {
                return DeviceUtil.isSupportAlarm(context);
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isSupportEvent(@NotNull Context context) {
                return DeviceUtil.isSupportAssistant(context);
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isSupportFlight(@NotNull Context context) {
                Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
                return DeviceUtil.isSupportAssistantFlight(context) && (currentDevice == null || !DeviceSource.isModelXihu(currentDevice));
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isSupportPin(@NotNull Context context) {
                Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
                return currentDevice == null || !DeviceSource.isSeriesXihu(currentDevice);
            }

            @Override // com.huami.assistant.IAssistantModule
            public boolean isSupportUpdates(@NotNull Context context) {
                Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
                return DeviceUtil.isSupportAssistantUpdates(context) && (currentDevice == null || !DeviceSource.isModelXihu(currentDevice));
            }
        });
    }

    private AssistantModule() {
    }

    private final void a(IAssistantModule module) {
        sModule = module;
    }

    @JvmStatic
    public static final int getAlarmCountLimit(@Nullable Context context) {
        int alarmCountLimit = isBleDevice() ? sBleModule.getAlarmCountLimit(context) : sModule.getAlarmCountLimit(context);
        if (alarmCountLimit <= 0) {
            alarmCountLimit = Integer.MAX_VALUE;
        }
        Log.d(TAG, "Alarm CountLimit: " + alarmCountLimit);
        return alarmCountLimit;
    }

    @JvmStatic
    public static final int getCurrentSource(@NotNull Context context) {
        return isBleDevice() ? sBleModule.getCurrentSource(context) : sModule.getCurrentSource(context);
    }

    @JvmStatic
    @NotNull
    public static final IExchange getExchange() {
        return isBleDevice() ? sBleModule.getExchange() : sModule.getExchange();
    }

    @JvmStatic
    @Nullable
    public static final ScheduleRpcApi getScheduleApi() {
        if (isBleDevice()) {
            return sBleModule.getScheduleApi();
        }
        return null;
    }

    @JvmStatic
    public static final boolean isBleDevice() {
        IAssistantModule iAssistantModule = sBleModule;
        return iAssistantModule != null && iAssistantModule.isBleDevice();
    }

    @JvmStatic
    public static final boolean isDeviceConnected(@Nullable Context context) {
        SettingRepo.INSTANCE.setContext(context);
        return isBleDevice() ? sBleModule.isDeviceConnected(context) : sModule.isDeviceConnected(context);
    }

    @JvmStatic
    public static final boolean isOverSeaSchedule() {
        return isBleDevice() ? sBleModule.isOverSeaSchedule() : sModule.isOverSeaSchedule();
    }

    @JvmStatic
    public static final boolean isSupportAlarm(@Nullable Context context) {
        return isBleDevice() ? sBleModule.isSupportAlarm(context) : sModule.isSupportAlarm(context);
    }

    @JvmStatic
    public static final boolean isSupportEvent(@Nullable Context context) {
        return isBleDevice() ? sBleModule.isSupportEvent(context) : sModule.isSupportEvent(context);
    }

    @JvmStatic
    public static final boolean isSupportFlight(@Nullable Context context) {
        return isBleDevice() ? sBleModule.isSupportFlight(context) : sModule.isSupportFlight(context);
    }

    @JvmStatic
    public static final boolean isSupportPin(@Nullable Context context) {
        return isBleDevice() ? sBleModule.isSupportPin(context) : sModule.isSupportPin(context);
    }

    @JvmStatic
    public static final boolean isSupportUpdates(@Nullable Context context) {
        return isBleDevice() ? sBleModule.isSupportUpdates(context) : sModule.isSupportUpdates(context);
    }

    @JvmStatic
    public static final void setBleModule(@Nullable IAssistantModule bleModule) {
        sBleModule = bleModule;
    }
}
