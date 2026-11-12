package com.xiaomi.fitness.userinfo.goal;

import android.app.Application;
import android.os.Bundle;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.route.track.view.TrackEditNameActivity;
import com.xiaomi.fitness.userinfo.ui.UserGuideViewModel;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import defpackage.yjq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/SetGoalPageActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lyjq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "", "TAG", "Ljava/lang/String;", "EABLE_STAND", "ENABLE_MHS", TrackEditNameActivity.EDIT_NAME, "mEnableGoalItem", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SetGoalPageActivity extends Hilt_SetGoalPageActivity<UserGuideViewModel, yjq> {

    @Nullable
    private String mEnableGoalItem;

    @NotNull
    private final String TAG = "SetGoalPageFragment";

    @NotNull
    private final String EABLE_STAND = Feature.STANDING;

    @NotNull
    private final String ENABLE_MHS = "highIntensity";

    @NotNull
    private final String EDIT_NAME = "Activity_EditTarget";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ yjq access$getMBinding(SetGoalPageActivity setGoalPageActivity) {
        return (yjq) setGoalPageActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserGuideViewModel access$getMViewModel(SetGoalPageActivity setGoalPageActivity) {
        return (UserGuideViewModel) setGoalPageActivity.getMViewModel();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.s;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.xiaomi.fitness.account.api.bean.UserProfile] */
    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_SetGoalPageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.C);
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = UserInfoManager.getUserProfile$default(((UserGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null);
            GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
            final int goalValue = goalConfigSupport.getGoalValue(goalConfigSupport.getSTAND_TIMES_GOAL_FIELD(), ((UserProfile) objectRef.element).getRegularGoalList());
            final int goalValue2 = goalConfigSupport.getGoalValue(goalConfigSupport.getMHS_GOAL_FIELD(), ((UserProfile) objectRef.element).getRegularGoalList());
            if (goalConfigSupport.containsKey(goalConfigSupport.getMHS_GOAL_FIELD(), ((UserProfile) objectRef.element).getRegularGoalList())) {
                ((yjq) getMBinding()).C.setSwitch(true);
            } else {
                ((yjq) getMBinding()).D.setSwitch(true);
            }
            ((yjq) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.userinfo.goal.SetGoalPageActivity.onCreate.1
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public void onCheckedChanged(boolean isChecked, ISwitchButton switchButton) {
                    String str;
                    if (isChecked) {
                        GoalConfigSupport goalConfigSupport2 = GoalConfigSupport.INSTANCE;
                        if (!goalConfigSupport2.isDeviceSupportAllGoal() && goalConfigSupport2.isDeviceCurrentSupportStand()) {
                            Application application = SetGoalPageActivity.this.getApplication();
                            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                            ToastExtKt.toastShort(application, o1j.R0);
                        }
                        SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_GOAL_MHS(), goalValue2);
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).D.setSwitch(false);
                        SetGoalPageActivity setGoalPageActivity = SetGoalPageActivity.this;
                        setGoalPageActivity.mEnableGoalItem = setGoalPageActivity.ENABLE_MHS;
                        return;
                    }
                    SetGoalPageActivity setGoalPageActivity2 = SetGoalPageActivity.this;
                    GoalConfigSupport goalConfigSupport3 = GoalConfigSupport.INSTANCE;
                    if (goalConfigSupport3.isDeviceSupportAllGoal() || goalConfigSupport3.containsKey(goalConfigSupport3.getSTAND_TIMES_GOAL_FIELD(), objectRef.element.getRegularGoalList()) || goalConfigSupport3.isDeviceCurrentSupportStand()) {
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).D.setSwitch(true);
                        SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_STAND_COUNT(), goalValue);
                        str = SetGoalPageActivity.this.EABLE_STAND;
                    } else {
                        Application application2 = SetGoalPageActivity.this.getApplication();
                        Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
                        ToastExtKt.toastShort(application2, o1j.S0);
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).C.setSwitch(true);
                        SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_GOAL_MHS(), goalValue2);
                        str = SetGoalPageActivity.this.ENABLE_MHS;
                    }
                    setGoalPageActivity2.mEnableGoalItem = str;
                }
            });
            ((yjq) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.userinfo.goal.SetGoalPageActivity.onCreate.2
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public void onCheckedChanged(boolean isChecked, ISwitchButton switchButton) {
                    String str;
                    String str2;
                    if (isChecked) {
                        SetGoalPageActivity setGoalPageActivity = SetGoalPageActivity.this;
                        GoalConfigSupport goalConfigSupport2 = GoalConfigSupport.INSTANCE;
                        if (goalConfigSupport2.isDeviceSupportAllGoal() || goalConfigSupport2.containsKey(goalConfigSupport2.getSTAND_TIMES_GOAL_FIELD(), objectRef.element.getRegularGoalList()) || goalConfigSupport2.isDeviceCurrentSupportStand()) {
                            SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).D.setSwitch(true);
                            SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_STAND_COUNT(), goalValue);
                            SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).C.setSwitch(false);
                            str2 = SetGoalPageActivity.this.EABLE_STAND;
                        } else {
                            Application application = SetGoalPageActivity.this.getApplication();
                            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                            ToastExtKt.toastShort(application, o1j.S0);
                            SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).D.setSwitch(false);
                            SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_GOAL_MHS(), goalValue2);
                            str2 = SetGoalPageActivity.this.ENABLE_MHS;
                        }
                        setGoalPageActivity.mEnableGoalItem = str2;
                        return;
                    }
                    SetGoalPageActivity setGoalPageActivity2 = SetGoalPageActivity.this;
                    GoalConfigSupport goalConfigSupport3 = GoalConfigSupport.INSTANCE;
                    if (!goalConfigSupport3.isDeviceSupportAllGoal() && goalConfigSupport3.containsKey(goalConfigSupport3.getSTAND_TIMES_GOAL_FIELD(), objectRef.element.getRegularGoalList()) && goalConfigSupport3.isDeviceCurrentSupportStand()) {
                        Application application2 = SetGoalPageActivity.this.getApplication();
                        Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
                        ToastExtKt.toastShort(application2, o1j.R0);
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).C.setSwitch(true);
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).D.setSwitch(false);
                        SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_GOAL_MHS(), goalValue2);
                        str = SetGoalPageActivity.this.ENABLE_MHS;
                    } else {
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).C.setSwitch(true);
                        SetGoalPageActivity.access$getMBinding(SetGoalPageActivity.this).D.setSwitch(false);
                        SetGoalPageActivity.access$getMViewModel(SetGoalPageActivity.this).sendProfile(GuidePageUtil.INSTANCE.getTYPE_GOAL_MHS(), goalValue2);
                        str = SetGoalPageActivity.this.ENABLE_MHS;
                    }
                    setGoalPageActivity2.mEnableGoalItem = str;
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
