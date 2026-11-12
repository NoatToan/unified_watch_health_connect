package com.xiaomi.fitness.homepage;

import android.util.SparseIntArray;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.DataBinderMapperImpl;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.sleep.utils.SleepSchemaHandler;
import com.xiaomi.fitness.homepage.HealthComponent;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.homepage.view.DataHeaderV2View;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.mine.MineFragment;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.sport.sporttab.SportTabV4Fragment;
import defpackage.c0j;
import defpackage.xfl;
import defpackage.zr3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/homepage/HealthComponent;", "", "<init>", "()V", "preInit", "", "preloadClass", "preloadHiltClass", "setupFuncNames", "initListenerTask", "initPush", "taskRun", "registerIntentHandlerToAirEco", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "健康tab")
public final class HealthComponent {

    @NotNull
    public static final String TAG = "HealthComponent";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair setupFuncNames$lambda$0() {
        boolean z = RegionPreference.INSTANCE.getPRIVACY_AGREE() && RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE).isEnable();
        Logger.i("addFuncName", "motion-recognize: " + z);
        if (z) {
            return new Pair(ResourceExtKt.getString(c0j.X9), 3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair setupFuncNames$lambda$1() {
        boolean zIsEnable = TraceExtKt.getInstance(SleepTracer.INSTANCE).isEnable();
        Logger.i("addFuncName", "sleep-trace: " + zIsEnable);
        if (zIsEnable) {
            return new Pair(ResourceExtKt.getString(c0j.ef), 3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupFuncNames$lambda$2(Boolean bool, Boolean bool2) {
        if (Intrinsics.areEqual(bool2, Boolean.FALSE)) {
            RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE).setEnable(false);
            TraceExtKt.getInstance(SleepTracer.INSTANCE).setEnable(false);
        }
        return Unit.INSTANCE;
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = true)
    public final void initListenerTask() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.homepage.HealthComponent.initListenerTask.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(HealthComponent.TAG, "sync on start " + did);
                AnyExtKt.io$default(null, new HealthComponent$initListenerTask$1$onStart$1(null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        });
    }

    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void initPush() {
        Logger.i(TAG, "initPush...");
        xfl.a().d(new EcgSchemaHandler());
        xfl.a().d(new SleepSchemaHandler());
    }

    @ComponentTask(notLaterThan = 8, onMainThread = false)
    public final void preInit() {
        LocalDate.now();
    }

    @ComponentTask(notLaterThan = 8, onMainThread = false)
    public final void preloadClass() {
        int i = NestedScrollView.f2129a;
        boolean z = FragmentManager.R;
        int i2 = TabLayout.R;
        int i3 = RecyclerView.HORIZONTAL;
        DataHeaderV2View.Companion companion = DataHeaderV2View.INSTANCE;
        int i4 = zr3.f41590a;
        HealthDataUtil healthDataUtil = HealthDataUtil.INSTANCE;
        HealthV2Fragment.Companion companion2 = HealthV2Fragment.INSTANCE;
        MineFragment.Companion companion3 = MineFragment.INSTANCE;
        DeviceTabFragmentV4.Companion companion4 = DeviceTabFragmentV4.INSTANCE;
        SportTabV4Fragment.Companion companion5 = SportTabV4Fragment.INSTANCE;
        SparseIntArray sparseIntArray = DataBinderMapperImpl.f11476a;
        SparseIntArray sparseIntArray2 = com.xiaomi.fitness.health.DataBinderMapperImpl.f12220a;
        SparseIntArray sparseIntArray3 = com.xiaomi.fitness.devicesettings.DataBinderMapperImpl.f11935a;
        SparseIntArray sparseIntArray4 = com.xiaomi.fitness.sport.DataBinderMapperImpl.f12913a;
    }

    @ComponentTask(notLaterThan = 11, onMainThread = false)
    public final void preloadHiltClass() {
    }

    @ComponentTask(notEarlierThan = 11, onMainThread = false)
    public final void registerIntentHandlerToAirEco() {
        boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        Logger.i(TAG, "registerIntentHandlerToAirEco isLoggedIn=" + zIsLogin + " curtRegionNotEmpty=" + z + " privacyAgreed=" + privacy_agree);
        if (zIsLogin && z && privacy_agree) {
            HealthPageExtKt.getInstance(IHealthPage.INSTANCE).registerAirEcoIntentionHandler();
        }
    }

    @ComponentTask(notEarlierThan = 3, notLaterThan = 4)
    public final void setupFuncNames() {
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        notificationPermission.addFuncName(new Function0() { // from class: opb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthComponent.setupFuncNames$lambda$0();
            }
        });
        notificationPermission.addFuncName(new Function0() { // from class: ppb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthComponent.setupFuncNames$lambda$1();
            }
        });
        notificationPermission.registerListener(new Function2() { // from class: qpb
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HealthComponent.setupFuncNames$lambda$2((Boolean) obj, (Boolean) obj2);
            }
        });
    }

    @ComponentTask(notEarlierThan = 7, onMainThread = false)
    public final void taskRun() {
        Logger.i(TAG, "taskRun...");
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getUserInfoFromWeb();
    }
}
