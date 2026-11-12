package com.xiaomi.hm.health.sleep.eventbus;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.eventbus.EventDateDataAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventRecentInfoAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/sleep/eventbus/SleepEventBusToListener;", "", "", "registerEventBus", "Lcom/xiaomi/hm/health/eventbus/EventDateDataAnalysisJobFinished;", "data", "onEventMainThread", "Lcom/xiaomi/hm/health/eventbus/EventSummeryAnalysisJobFinished;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lcom/xiaomi/hm/health/eventbus/EventRecentInfoAnalysisJobFinished;", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepEventBusToListener {

    @NotNull
    public static final SleepEventBusToListener INSTANCE = new SleepEventBusToListener();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LfType.values().length];
            iArr[LfType.SLEEPING.ordinal()] = 1;
            iArr[LfType.AWAKING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepEventBusToListener() {
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        LfType lfType = event.getLfType();
        int i = lfType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lfType.ordinal()];
        if (i == 1) {
            HMLog.info("SleepEventBusToListener", new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.eventbus.SleepEventBusToListener.onEvent.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "收到用户入睡事件 时间为" + System.currentTimeMillis();
                }
            });
            SleepDataNotifiers.INSTANCE.getSleepStateNotifier().notifyInvalidated(0);
        } else {
            if (i != 2) {
                return;
            }
            HMLog.info("SleepEventBusToListener", new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.eventbus.SleepEventBusToListener.onEvent.2
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "收到用户醒来事件 时间为" + System.currentTimeMillis();
                }
            });
            SleepDataNotifiers.INSTANCE.getSleepStateNotifier().notifyInvalidated(1);
        }
    }

    public final void onEventMainThread(@NotNull EventDateDataAnalysisJobFinished data) {
        SleepDataNotifiers.INSTANCE.getDataAnalysisJobFinished().notifyInvalidated(data);
    }

    public final void registerEventBus() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void onEventMainThread(@NotNull EventSummeryAnalysisJobFinished data) {
        SleepDataNotifiers.INSTANCE.getSummeryAnalysisJobFinished().notifyInvalidated(data);
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent data) {
        SleepDataNotifiers.INSTANCE.getHMDeviceSyncDataEvent().notifyInvalidated(data);
    }

    public final void onEventMainThread(@NotNull EventRecentInfoAnalysisJobFinished data) {
        SleepDataNotifiers.INSTANCE.getRecentStepOrSleepInfoEvent().notifyInvalidated(Unit.INSTANCE);
    }
}
