package com.xiaomi.fitness.keep_alive;

import android.content.SharedPreferences;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ComponentState;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.keep_alive.KeepAliveComponent;
import com.xiaomi.fitness.sleep.trace.SleepTraceReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveComponent;", "", "<init>", "()V", "initKeepAlive", "", "initComponentState", "reportBackgroundProcessAlive", "Companion", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "KeepAlive")
public final class KeepAliveComponent {

    @NotNull
    private static final String TAG = "KeepAliveComponent";

    private final void initComponentState() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: gzd
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                KeepAliveComponent.initComponentState$lambda$1(sharedPreferences, str);
            }
        });
        try {
            ComponentState componentState = ComponentState.INSTANCE;
            componentState.enableComponent(regionPreference.getPRIVACY_AGREE(), BootCompletedReceiver.class);
            boolean privacy_agree = regionPreference.getPRIVACY_AGREE();
            int i = SleepTraceReceiver.f12904a;
            Intrinsics.checkNotNullExpressionValue(SleepTraceReceiver.class, "forName(...)");
            componentState.enableComponent(privacy_agree, SleepTraceReceiver.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initComponentState$lambda$1(SharedPreferences sharedPreferences, String str) {
        final RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (Intrinsics.areEqual(str, SpExtKt.getKey(new MutablePropertyReference0Impl(regionPreference) { // from class: com.xiaomi.fitness.keep_alive.KeepAliveComponent$initComponentState$1$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((RegionPreference) this.receiver).getPRIVACY_AGREE());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((RegionPreference) this.receiver).setPRIVACY_AGREE(((Boolean) obj).booleanValue());
            }
        }))) {
            Logger.i(TAG, "initComponentState() called with:  key = " + str);
            try {
                ComponentState componentState = ComponentState.INSTANCE;
                componentState.enableComponent(regionPreference.getPRIVACY_AGREE(), BootCompletedReceiver.class);
                boolean privacy_agree = regionPreference.getPRIVACY_AGREE();
                int i = SleepTraceReceiver.f12904a;
                Intrinsics.checkNotNullExpressionValue(SleepTraceReceiver.class, "forName(...)");
                componentState.enableComponent(privacy_agree, SleepTraceReceiver.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initKeepAlive$lambda$0(WearableDeviceModel wearableDeviceModel) {
        Logger.i(TAG, "initKeepAlive: init " + wearableDeviceModel);
        KeepAliveHelper.INSTANCE.getInstance().updateKeepAlive();
        return Unit.INSTANCE;
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 4, onMainThread = true, processName = ":device")
    public final void initKeepAlive() {
        Logger.i(TAG, "initKeepAlive: " + Thread.currentThread().getName());
        KeepAliveHelper.INSTANCE.getInstance().init();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(new Function1() { // from class: fzd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return KeepAliveComponent.initKeepAlive$lambda$0((WearableDeviceModel) obj);
            }
        });
        initComponentState();
        TimeTracker.INSTANCE.init();
    }

    @ComponentTask(notEarlierThan = 8, notLaterThan = 8, onMainThread = true, processName = ":device")
    public final void reportBackgroundProcessAlive() {
        Logger.i(TAG, "reportBackgroundProcessAlive() called");
        TimeTracker.INSTANCE.trackProcessAlive(RegionPreference.INSTANCE.getPRIVACY_AGREE());
    }
}
