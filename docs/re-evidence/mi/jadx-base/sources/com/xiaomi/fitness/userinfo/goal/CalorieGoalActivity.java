package com.xiaomi.fitness.userinfo.goal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.userinfo.goal.CalorieGoalActivity;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import defpackage.c1p;
import defpackage.fyi;
import defpackage.hki;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import defpackage.wiq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\n*\u0001\u0018\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b \u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/CalorieGoalActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/goal/GoalGuideViewModel;", "Lwiq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "()V", "", "TAG", "Ljava/lang/String;", "", "mSelectValue", "I", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "mIndex", "", "mFirstGuideFromSportTarget", "Z", "com/xiaomi/fitness/userinfo/goal/CalorieGoalActivity$mReceiver$1", "mReceiver", "Lcom/xiaomi/fitness/userinfo/goal/CalorieGoalActivity$mReceiver$1;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalorieGoalActivity extends Hilt_CalorieGoalActivity<GoalGuideViewModel, wiq> {
    private boolean mFirstGuideFromSportTarget;
    private int mIndex;

    @NotNull
    private final String TAG = "CalorieGoalFragment";
    private int mSelectValue = -1;

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private CalorieGoalActivity$mReceiver$1 mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.goal.CalorieGoalActivity$mReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (this.this$0.mFirstGuideFromSportTarget) {
                this.this$0.finish();
                return;
            }
            this.this$0.finish();
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.Companion.getINDEX_DEVICE());
            MainExtKt.showMainActivity(this.this$0, null, bundle);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(CalorieGoalActivity this$0, Ref.ObjectRef mPicker, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mPicker, "$mPicker");
        String str = this$0.TAG;
        String contentByCurrValue = ((NumberPickerView) mPicker.element).getContentByCurrValue();
        Intrinsics.checkNotNullExpressionValue(contentByCurrValue, "getContentByCurrValue(...)");
        Logger.i(str + " Goal manager selectValue calorie mPicker.contentByCurrValue = " + Integer.parseInt(contentByCurrValue), new Object[0]);
        String contentByCurrValue2 = ((NumberPickerView) mPicker.element).getContentByCurrValue();
        Intrinsics.checkNotNullExpressionValue(contentByCurrValue2, "getContentByCurrValue(...)");
        this$0.mSelectValue = Integer.parseInt(contentByCurrValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(CalorieGoalActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((GoalGuideViewModel) this$0.getMViewModel()).setGoal(this$0.mSelectValue, GoalConfigSupport.INSTANCE.getSUPPORT_GOAL_CALORIE());
        ((GoalGuideViewModel) this$0.getMViewModel()).onNext(this$0, this$0.mIndex, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(CalorieGoalActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.xiaomi.fitness.baseui.widget.NumberPickerView, java.lang.Object] */
    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_CalorieGoalActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.P0);
        ((GoalGuideViewModel) getMViewModel()).initUserProfile();
        this.mFirstGuideFromSportTarget = getIntent().getBooleanExtra(GuidePageUtil.KEY_FIRST_GUIDE_FROM_SPORT_TARGET, false);
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        int goalValue = goalConfigSupport.getGoalValue(goalConfigSupport.getCALORIE_GOAL_FIELD(), UserInfoManager.getUserProfile$default(((GoalGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null).getRegularGoalList());
        this.mIndex = getIntent().getIntExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        Logger.i(this.TAG + " currentCalorie before = " + goalValue, new Object[0]);
        if (goalValue == 0) {
            goalValue = UserInfoManager.getUserProfile$default(((GoalGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null).getDEFAULT_DAILY_CAL_GOAL();
            Logger.i(this.TAG + " currentCalorie = " + goalValue, new Object[0]);
        }
        this.mSelectValue = goalValue;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? calorieGoalSettingPicker = ((wiq) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(calorieGoalSettingPicker, "calorieGoalSettingPicker");
        objectRef.element = calorieGoalSettingPicker;
        ArrayList arrayList = new ArrayList();
        String[] strArrB = c1p.b(arrayList, 200, 5000, 100);
        Intrinsics.checkNotNullExpressionValue(strArrB, "showTargetList(...)");
        ((NumberPickerView) objectRef.element).setDisplayedValues(strArrB);
        ((NumberPickerView) objectRef.element).setMinValue(0);
        ((NumberPickerView) objectRef.element).setMaxValue(49);
        ((NumberPickerView) objectRef.element).setValue(arrayList.indexOf(String.valueOf(this.mSelectValue)));
        ((NumberPickerView) objectRef.element).setOnValueChangedListener(new NumberPickerView.d() { // from class: mb3
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                CalorieGoalActivity.onCreate$lambda$0(this.f25962a, objectRef, numberPickerView, i, i2);
            }
        });
        ((NumberPickerView) objectRef.element).setHintTextColor(hki.f20169a);
        NumberPickerView numberPickerView = (NumberPickerView) objectRef.element;
        int i = fyi.c;
        int i2 = this.mSelectValue;
        numberPickerView.setHintText(ResourceExtKt.getQuantityString(this, i, i2, Integer.valueOf(i2)));
        Logger.i(this.TAG + " Goal manager selectValue calorie = " + this.mSelectValue, new Object[0]);
        ((wiq) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: nb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalorieGoalActivity.onCreate$lambda$1(this.f27741a, view);
            }
        });
        ((wiq) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: ob3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalorieGoalActivity.onCreate$lambda$2(this.f28950a, view);
            }
        });
        ((wiq) getMBinding()).F.setText(getString(o1j.g0, Integer.valueOf(this.mIndex), 3));
        this.intentFilter.addAction("goal_action_finish_activity");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_CalorieGoalActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mReceiver);
        super.onDestroy();
    }
}
