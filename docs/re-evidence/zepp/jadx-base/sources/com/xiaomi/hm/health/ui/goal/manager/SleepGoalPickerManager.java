package com.xiaomi.hm.health.ui.goal.manager;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.goal.GoalConstants;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.goal.GoalPropertyRegistry;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/SleepGoalPickerManager;", "", "", "minuteValue", "", "e", "Lcom/huami/widget/wheelview/WheelView;", "minuteView", "c", "a", "hourView", "b", GoogleApiAvailabilityLight.a, "f", PointCategory.INIT, "saveData", "Lcom/huami/widget/wheelview/WheelView;", "", "Z", "isDialogStyle", "<init>", "(Lcom/huami/widget/wheelview/WheelView;Lcom/huami/widget/wheelview/WheelView;Z)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepGoalPickerManager {

    @NotNull
    public static final String TAG = "SleepGoalPickerManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WheelView hourView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WheelView minuteView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isDialogStyle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device mismatch.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "not support.";
        }
    }

    public SleepGoalPickerManager(@NotNull WheelView wheelView, @NotNull WheelView wheelView2, boolean z) {
        this.hourView = wheelView;
        this.minuteView = wheelView2;
        this.isDialogStyle = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(WheelView minuteView) {
        GoalFunctionsKt.setupWheelPicker(minuteView, 0, 0, 30, R.string.unit_min_long, this.isDialogStyle);
        minuteView.setCurrentItem(0);
    }

    private final void b(WheelView hourView) {
        GoalFunctionsKt.setupWheelPicker(hourView, 4, 16, 1, R.string.unit_hour_long, this.isDialogStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(WheelView minuteView) {
        GoalFunctionsKt.setupWheelPicker(minuteView, 0, 1, 30, R.string.unit_min_long, this.isDialogStyle);
    }

    private final void d(WheelView hourView, WheelView minuteView) {
        Integer num = GoalPropertyRegistry.INSTANCE.getSleepGoal().get();
        int iIntValue = num == null ? 480 : num.intValue();
        int i = iIntValue / 60;
        GoalConstants goalConstants = GoalConstants.INSTANCE;
        int iIndexOf = goalConstants.getHoursRange().indexOf(Integer.valueOf(i));
        int iIndexOf2 = goalConstants.getMinuteRange().indexOf(Integer.valueOf(iIntValue % 60));
        if (iIndexOf == -1) {
            iIndexOf = goalConstants.getHoursRange().indexOf(8);
        }
        hourView.setCurrentItem(iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = goalConstants.getMinuteRange().indexOf(0);
        }
        minuteView.setCurrentItem(iIndexOf2);
        if (i == 16) {
            a(minuteView);
        }
    }

    private final void e(int minuteValue) {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        if (!(miliDevice instanceof HMMiLiProDevice)) {
            HMLog.error$default(TAG, null, null, a.a, 6, null);
            return;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) miliDevice;
        if (hMMiLiProDevice.isHuamiOs()) {
            hMMiLiProDevice.setTargets(new HMTarget(HMPersonInfo.getInstance().getMiliConfig().isGoalRemind(), null, null, null, Long.valueOf(minuteValue), null, null), new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.goal.manager.SleepGoalPickerManager$saveToDevice$3

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
                    HMLog.info(SleepGoalPickerManager.TAG, new a(result));
                }
            });
        } else {
            HMLog.error$default(TAG, null, null, b.a, 6, null);
        }
    }

    private final void f(final WheelView hourView, final WheelView minuteView) {
        b(hourView);
        c(minuteView);
        hourView.addScrollingListener(new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.ui.goal.manager.SleepGoalPickerManager$setupSleepGoal$1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@Nullable WheelView wheel) {
                GoalConstants goalConstants = GoalConstants.INSTANCE;
                if (goalConstants.getHoursRange().get(hourView.getCurrentItem()).intValue() == 16) {
                    if (minuteView.getViewAdapter().getItemsCount() == goalConstants.getMinuteRange().size()) {
                        this.a(minuteView);
                    }
                } else if (minuteView.getViewAdapter().getItemsCount() != goalConstants.getMinuteRange().size()) {
                    this.c(minuteView);
                }
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@Nullable WheelView wheel) {
            }
        });
        d(hourView, minuteView);
    }

    public final void init() {
        f(this.hourView, this.minuteView);
    }

    public final void saveData() {
        GoalConstants goalConstants = GoalConstants.INSTANCE;
        int iIntValue = (goalConstants.getHoursRange().get(this.hourView.getCurrentItem()).intValue() * 60) + goalConstants.getMinuteRange().get(this.minuteView.getCurrentItem()).intValue();
        e(iIntValue);
        if (iIntValue > 960) {
            iIntValue = 960;
        }
        GoalFunctionsKt.postSleepGoal(iIntValue);
    }

    public /* synthetic */ SleepGoalPickerManager(WheelView wheelView, WheelView wheelView2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wheelView, wheelView2, (i & 4) != 0 ? false : z);
    }
}
