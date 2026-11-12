package com.xiaomi.hm.health.ui.goal.manager;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.goal.GoalConstants;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.goal.GoalPropertyRegistry;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/CalorieGoalPickerManager;", "Lorg/koin/core/component/KoinComponent;", "", PointCategory.INIT, "saveData", "Lcom/huami/widget/wheelview/WheelView;", "a", "Lcom/huami/widget/wheelview/WheelView;", "calorieView", "", "b", "Z", "isDialogStyle", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceMangerApi", "<init>", "(Lcom/huami/widget/wheelview/WheelView;Z)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CalorieGoalPickerManager implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CalorieGoalPickerManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WheelView calorieView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isDialogStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceMangerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/CalorieGoalPickerManager$Companion;", "", "Lcom/huami/widget/wheelview/WheelView;", "calorieView", "", "loadExistData", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void loadExistData(@NotNull WheelView calorieView) {
            Integer num = GoalPropertyRegistry.INSTANCE.getCalorieGoal().get();
            calorieView.setCurrentItem(GoalConstants.INSTANCE.getCalorieRange().indexOf(Integer.valueOf(num == null ? 300 : num.intValue())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalorieGoalPickerManager(@NotNull WheelView wheelView, boolean z) {
        this.calorieView = wheelView;
        this.isDialogStyle = z;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceMangerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceMangerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void init() {
        GoalFunctionsKt.setupWheelPicker(this.calorieView, 2, 30, 100, R.string.unit_kc, this.isDialogStyle);
        INSTANCE.loadExistData(this.calorieView);
    }

    public final void saveData() {
        int iIntValue = GoalConstants.INSTANCE.getCalorieRange().get(this.calorieView.getCurrentItem()).intValue();
        GoalFunctionsKt.postCalorieGoal$default(iIntValue, false, 2, null);
        if (HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(9)) {
            HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
            Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
            ((HMMiLiProDevice) device).setCalorieTarget(HMPersonInfo.getInstance().getMiliConfig().isGoalRemind(), iIntValue, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager.saveData.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager$saveData$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "result: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(CalorieGoalPickerManager.TAG, new a(result));
                }
            });
        } else {
            if (a().getBoundDeviceSource(HMDeviceType.WATCH) != HMDeviceSource.VDEVICE) {
                SyncUtil.syncUserCalorieGoalToWatch(BraceletApp.getContext(), iIntValue, null);
                return;
            }
            HMBaseDevice device2 = a().getDevice(HMDeviceType.MILI);
            HMMiLiProDevice hMMiLiProDevice = device2 instanceof HMMiLiProDevice ? (HMMiLiProDevice) device2 : null;
            if (hMMiLiProDevice == null) {
                return;
            }
            if (hMMiLiProDevice.isHuamiOs()) {
                hMMiLiProDevice.setTargets(new HMTarget(HMPersonInfo.getInstance().getMiliConfig().isGoalRemind(), null, Long.valueOf(iIntValue), null, null, null, null), new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager.saveData.2

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager$saveData$2$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "ret: " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                        onFinish(bool.booleanValue());
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.info(CalorieGoalPickerManager.TAG, new a(result));
                    }
                });
            } else {
                hMMiLiProDevice.setCalorieGoal(iIntValue, new HMCallback<Integer>() { // from class: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager.saveData.3

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager$saveData$3$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "Set calorie gaol result " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.info(CalorieGoalPickerManager.TAG, new a(result));
                    }
                });
            }
        }
    }

    public /* synthetic */ CalorieGoalPickerManager(WheelView wheelView, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wheelView, (i & 2) != 0 ? false : z);
    }
}
