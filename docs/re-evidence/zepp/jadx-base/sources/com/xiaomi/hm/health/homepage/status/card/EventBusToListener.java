package com.xiaomi.hm.health.homepage.status.card;

import com.huami.account.event.EventAccountStatus;
import com.squareup.picasso.u;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.eventbus.EventBandDataDownloadFinished;
import com.xiaomi.hm.health.eventbus.EventEditSleep;
import com.xiaomi.hm.health.eventbus.EventPersonInfoUpdate;
import com.xiaomi.hm.health.eventbus.EventStressUpdate;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventTodaySportAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.locweather.event.WeatherUpdateEvent;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/EventBusToListener;", "", "", "action", "", "onEventMainThread", "registerEventBus", "Lcom/xiaomi/hm/health/eventbus/EventSummeryAnalysisJobFinished;", u.r, "Lcom/xiaomi/hm/health/device/event/EventWHTypeChanged;", "Lcom/xiaomi/hm/health/eventbus/EventUnitChanged;", "Lcom/xiaomi/hm/health/locweather/event/WeatherUpdateEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Lcom/xiaomi/hm/health/eventbus/EventTodaySportAnalysisJobFinished;", "Lcom/xiaomi/hm/health/eventbus/EventEditSleep;", "Lcom/xiaomi/hm/health/eventbus/EventStressUpdate;", "Lcom/huami/account/event/EventAccountStatus;", "event", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lcom/xiaomi/hm/health/eventbus/EventPersonInfoUpdate;", "Lcom/xiaomi/hm/health/eventbus/EventBandDataDownloadFinished;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventBusToListener {

    @NotNull
    public static final EventBusToListener INSTANCE = new EventBusToListener();

    private EventBusToListener() {
    }

    public final void onEventMainThread(@NotNull EventSummeryAnalysisJobFinished ignored) {
        DataNotifiers.INSTANCE.getSummeryDataNotifier().notifyInvalidated();
    }

    public final void registerEventBus() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void onEventMainThread(@NotNull EventWHTypeChanged ignored) {
        DataNotifiers.INSTANCE.getFullHeartRateSwitchNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventUnitChanged ignored) {
        DataNotifiers.INSTANCE.getUnitNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull WeatherUpdateEvent ignored) {
        DataNotifiers.INSTANCE.getUnitNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull HMDeviceBindEvent ignored) {
        DataNotifiers.INSTANCE.getDeviceBoundNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventTodaySportAnalysisJobFinished ignored) {
        DataNotifiers.INSTANCE.getTodaySportAnalysisJobFinishedNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventEditSleep ignored) {
        DataNotifiers.INSTANCE.getEditSleepNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventStressUpdate ignored) {
        DataNotifiers.INSTANCE.getAllDayStressSwitchNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventAccountStatus event) {
        DataNotifiers.INSTANCE.getLoginNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent ignored) {
        if (ignored.isStop() && ignored.getResult()) {
            DataNotifiers.INSTANCE.getAtrialDataNotifier().notifyInvalidated();
        }
    }

    @JvmStatic
    public static final void onEventMainThread(@NotNull String action) {
        int iHashCode = action.hashCode();
        if (iHashCode != 502473491) {
            if (iHashCode != 505380757) {
                if (iHashCode != 1041332296 || !action.equals("android.intent.action.DATE_CHANGED")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.TIME_SET")) {
                return;
            }
        } else if (!action.equals("android.intent.action.TIMEZONE_CHANGED")) {
            return;
        }
        DataNotifiers.INSTANCE.getTimeChangedNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventPersonInfoUpdate ignored) {
        DataNotifiers.INSTANCE.getPersonInfoChangedNotifier().notifyInvalidated();
    }

    public final void onEventMainThread(@NotNull EventBandDataDownloadFinished ignored) {
        DataNotifiers.INSTANCE.getDataDownloadFinishedNotifier().notifyInvalidated();
    }
}
