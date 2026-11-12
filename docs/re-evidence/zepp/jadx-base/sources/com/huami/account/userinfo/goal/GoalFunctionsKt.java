package com.huami.account.userinfo.goal;

import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.utils.Utils;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.service.UserProperty;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0013\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u0006\u0010\u000b\u001a\u00020\n\u001a\u0006\u0010\f\u001a\u00020\u0001\u001a\b\u0010\r\u001a\u0004\u0018\u00010\n\u001a\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u0006\u0010\u000f\u001a\u00020\b\"\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0015\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0017\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0016\u0010\u001f\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014\"\u0016\u0010!\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0014\"\u0016\u0010#\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0014\"\u0016\u0010%\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0014\"\u0016\u0010'\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0014\"\u0016\u0010(\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0014\"\u0016\u0010)\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0014\"\u0016\u0010*\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/huami/widget/wheelview/WheelView;", "", "startValue", "endValue", "stepValue", "unitTextRes", "", "isDialogStyle", "", "setupWheelPicker", "", "getGoalCalorieString", "getGoalCalorieValue", "getGoalSleepString", "getGoalSleepValue", "saveDefaultGoalIfEmpty", "a", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "TIME_STEP", "c", "UNIT_TEXT_SIZE", "", GoogleApiAvailabilityLight.a, "F", "UNIT_X_OFFSET", "e", "UNIT_Y_OFFSET", "f", "VISIBLE_ITEM_COUNT", "g", "ITEM_HEIGHT_DP", "h", "CENTER_TEXT_SIZE_DP", "i", "NORMAL_TEXT_SIZE_DP", z.j, "NORMAL_LIGHT_TEXT_DP", "WHEEL_CENTER_TEXT_SIZE_DP", "WHEEL_NORMAL_TEXT_SIZE_DP", "WHEEL_NORMAL_LIGHT_TEXT_DP", "userinfo_release"}, k = 2, mv = {1, 5, 1})
public final class GoalFunctionsKt {
    public static final int WHEEL_CENTER_TEXT_SIZE_DP = 20;
    public static final int WHEEL_NORMAL_LIGHT_TEXT_DP = 15;
    public static final int WHEEL_NORMAL_TEXT_SIZE_DP = 20;

    @NotNull
    private static final String a = "GoalFunctions";
    private static final int b = 60;
    private static final int c = 12;
    private static final float d = 9.0f;
    private static final float e = 0.0f;
    private static final int f = 5;
    private static final int g = 60;
    private static final int h = 36;
    private static final int i = 26;
    private static final int j = 20;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("read goal of sleep format error: ", this.a.getMessage());
        }
    }

    private static final <T> void a(UserProperty<T> userProperty, T t) {
        if (userProperty.get() == null) {
            userProperty.set(t);
            UserPropertyManager.INSTANCE.schedulePushAll();
        }
    }

    @NotNull
    public static final String getGoalCalorieString() {
        int goalCalorieValue = getGoalCalorieValue();
        return UserinfoExternalsKt.getAppContext().getResources().getQuantityString(R.plurals.user_info_with_kcal, goalCalorieValue, Integer.valueOf(goalCalorieValue));
    }

    public static final int getGoalCalorieValue() {
        Integer num = GoalPropertyRegistry.INSTANCE.getCalorieGoal().get();
        if (num == null) {
            return 300;
        }
        return num.intValue();
    }

    @Nullable
    public static final String getGoalSleepString() {
        try {
            int goalSleepValue = getGoalSleepValue();
            if (goalSleepValue % 60 != 0) {
                return Utils.INSTANCE.getCalculateTimeByMinute(UserinfoExternalsKt.getAppContext(), goalSleepValue, 17);
            }
            int i2 = goalSleepValue / 60;
            return UserinfoExternalsKt.getAppContext().getResources().getQuantityString(R.plurals.user_info_Nhours, i2, Integer.valueOf(i2));
        } catch (Exception e2) {
            HMLog.info(a, new a(e2));
            return "";
        }
    }

    public static final int getGoalSleepValue() {
        Integer num = GoalPropertyRegistry.INSTANCE.getSleepGoal().get();
        if (num == null) {
            return 480;
        }
        return num.intValue();
    }

    public static final void saveDefaultGoalIfEmpty() {
        GoalPropertyRegistry goalPropertyRegistry = GoalPropertyRegistry.INSTANCE;
        a(goalPropertyRegistry.getSleepGoal(), 480);
        a(goalPropertyRegistry.getCalorieGoal(), 300);
    }

    public static final void setupWheelPicker(@NotNull WheelView wheelView, int i2, int i3, int i4, int i5, boolean z) {
        PickAdapter pickAdapter = z ? new PickAdapter(wheelView.getContext(), i2, i3, wheelView, ContextCompat.getColor(wheelView.getContext(), R.color.p4), ContextCompat.getColor(wheelView.getContext(), R.color.s2), ContextCompat.getColor(wheelView.getContext(), R.color.s3), false, 46, 20, 20, 15, i4, 0) : new PickAdapter(wheelView.getContext(), i2, i3, wheelView, ContextCompat.getColor(wheelView.getContext(), R.color.s1), ContextCompat.getColor(wheelView.getContext(), R.color.s2), ContextCompat.getColor(wheelView.getContext(), R.color.s3), false, 60, 36, 26, 20, i4, 0);
        wheelView.setVisibleItems(5);
        wheelView.setStyle(WheelView.Style.NORMAL);
        wheelView.setCenterStyle(wheelView.getResources().getString(i5), R.color.split_color, 12, 9.0f, 0.0f);
        if (z) {
            wheelView.setCenterDrawable(R.drawable.wheel_view_select_bg);
        } else {
            wheelView.setLineColor(ContextCompat.getColor(wheelView.getContext(), R.color.s4));
            wheelView.setUnitTextColor(ContextCompat.getColor(wheelView.getContext(), R.color.s2));
        }
        wheelView.setViewAdapter(pickAdapter);
    }
}
