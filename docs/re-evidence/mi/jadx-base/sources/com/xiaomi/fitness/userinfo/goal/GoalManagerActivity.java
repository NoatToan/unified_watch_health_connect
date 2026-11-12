package com.xiaomi.fitness.userinfo.goal;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.goal.GoalPreference;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.userinfo.goal.GoalManagerActivity;
import com.xiaomi.fitness.userinfo.ui.UserGuideViewModel;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.a4i;
import defpackage.av6;
import defpackage.bv6;
import defpackage.c2b;
import defpackage.fyi;
import defpackage.hki;
import defpackage.hsi;
import defpackage.moi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import defpackage.swi;
import defpackage.wli;
import defpackage.yiq;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J7\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0004¢\u0006\u0004\b$\u0010\u0006J\u0017\u0010%\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\u0004H\u0014¢\u0006\u0004\b&\u0010\u0006J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0006J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001fR\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00102R\u0016\u00103\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u00105\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u001fR\u0017\u00107\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u0010\u001fR\u0014\u0010:\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001fR\u0014\u0010<\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001f¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/GoalManagerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lyiq;", "", "showNotifySwitch", "()V", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", Scopes.PROFILE, "initData", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "Landroid/widget/FrameLayout;", "pickerView", "removeInnerView", "(Landroid/widget/FrameLayout;)V", "showOnvisibleView", "", "type", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;", "adapter", "uint", "currentStep", "title", "showExerciseGoalDialog", "(ILcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;III)V", "Landroid/view/View;", "view", "showPopupMenu", "(Landroid/view/View;)V", "setSwitchGoal", "getContentResourceId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initContentView", "bindDataToView", LifecycleConstantKt.ON_RESUME, "setListener", "", "hasDeviceConnect", "()Z", "", "TAG", "Ljava/lang/String;", "REQ_GOAL", "I", "getREQ_GOAL", "selectValue", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "mGoalSwitchStand", "Z", "standGoal", "getStandGoal", "mhsGoal", "getMhsGoal", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GoalManagerActivity extends Hilt_GoalManagerActivity<UserGuideViewModel, yiq> {
    private boolean mGoalSwitchStand;
    private final int mhsGoal;

    @Nullable
    private UserProfile profile;
    private final int standGoal;

    @NotNull
    private final String TAG = "GoalManagerFragment";
    private final int REQ_GOAL = 2;
    private int selectValue = -1;

    public GoalManagerActivity() {
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        this.standGoal = goalConfigSupport.getGoalValue(goalConfigSupport.getSTAND_TIMES_GOAL_FIELD(), UserInfoManager.getUserProfile$default(new UserInfoManager(), false, 1, null).getRegularGoalList());
        this.mhsGoal = goalConfigSupport.getGoalValue(goalConfigSupport.getMHS_GOAL_FIELD(), UserInfoManager.getUserProfile$default(new UserInfoManager(), false, 1, null).getRegularGoalList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserGuideViewModel access$getMViewModel(GoalManagerActivity goalManagerActivity) {
        return (UserGuideViewModel) goalManagerActivity.getMViewModel();
    }

    private final void initData(UserProfile profile) {
        if (profile == null) {
            return;
        }
        this.profile = profile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$0(GoalManagerActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindDataToView(UserInfoManager.getUserProfile$default(((UserGuideViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null));
        return Unit.INSTANCE;
    }

    private final void removeInnerView(FrameLayout pickerView) {
        Intrinsics.checkNotNull(pickerView);
        ViewParent parent = pickerView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$3(GoalManagerActivity this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "USER ==== " + UserInfoManager.getUserProfile$default(((UserGuideViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null));
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        goalConfigSupport.updateGoalList(UserInfoManager.getUserProfile$default(((UserGuideViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null));
        int mStepGoal = goalConfigSupport.getMStepGoal();
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            mStepGoal = GoalPreference.INSTANCE.getNotLoginStepGoal();
        }
        int i = mStepGoal;
        GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
        this$0.showExerciseGoalDialog(guidePageUtil.getTYPE_GOAL_STEPS(), new c2b(guidePageUtil.getTYPE_GOAL_STEPS()), fyi.e, i, o1j.K);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$4(GoalManagerActivity this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        goalConfigSupport.updateGoalList(UserInfoManager.getUserProfile$default(((UserGuideViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null));
        int calorieGoal = goalConfigSupport.getCalorieGoal();
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            calorieGoal = GoalPreference.INSTANCE.getNotLoginCalorieGoal();
        }
        int i = calorieGoal;
        GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
        this$0.showExerciseGoalDialog(guidePageUtil.getTYPE_GOAL_CALORIE(), new c2b(guidePageUtil.getTYPE_GOAL_CALORIE()), fyi.c, i, o1j.J);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$5(GoalManagerActivity this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.mGoalSwitchStand) {
            GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
            goalConfigSupport.updateGoalList(UserInfoManager.getUserProfile$default(((UserGuideViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null));
            int standTimeGoal = goalConfigSupport.getStandTimeGoal();
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                standTimeGoal = GoalPreference.INSTANCE.getNotLoginStandTimeGoal();
            }
            int i = standTimeGoal;
            GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
            this$0.showExerciseGoalDialog(guidePageUtil.getTYPE_STAND_COUNT(), new c2b(guidePageUtil.getTYPE_STAND_COUNT()), fyi.f, i, o1j.f28647r);
        } else {
            GoalConfigSupport goalConfigSupport2 = GoalConfigSupport.INSTANCE;
            goalConfigSupport2.updateGoalList(UserInfoManager.getUserProfile$default(((UserGuideViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null));
            int mhsGoal = goalConfigSupport2.getMhsGoal();
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                mhsGoal = GoalPreference.INSTANCE.getNotLoginMhsGoal();
            }
            int i2 = mhsGoal;
            GuidePageUtil guidePageUtil2 = GuidePageUtil.INSTANCE;
            this$0.showExerciseGoalDialog(guidePageUtil2.getTYPE_GOAL_MHS(), new c2b(guidePageUtil2.getTYPE_GOAL_MHS()), fyi.n, i2, o1j.b1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(GoalManagerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupMenu(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$7(GoalManagerActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserGuideViewModel.setVitalityReminder$default((UserGuideViewModel) this$0.getMViewModel(), Boolean.valueOf(z), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSwitchGoal() {
        GoalPreference goalPreference = GoalPreference.INSTANCE;
        int notLoginMhsGoal = goalPreference.getNotLoginMhsGoal();
        int notLoginStandTimeGoal = goalPreference.getNotLoginStandTimeGoal();
        if (notLoginMhsGoal > 0) {
            String quantityString = getResources().getQuantityString(fyi.f18377k, notLoginMhsGoal, Integer.valueOf(notLoginMhsGoal));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            ((yiq) getMBinding()).A.setTitle(o1j.b1);
            ((yiq) getMBinding()).A.setEnable(true, moi.g);
            ((yiq) getMBinding()).A.setSubtitle(quantityString);
            this.mGoalSwitchStand = false;
        } else {
            String quantityString2 = getResources().getQuantityString(fyi.f18377k, notLoginStandTimeGoal, Integer.valueOf(notLoginStandTimeGoal));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            ((yiq) getMBinding()).A.setTitle(o1j.f28647r);
            ((yiq) getMBinding()).A.setEnable(true, moi.i);
            ((yiq) getMBinding()).A.setSubtitle(quantityString2);
            this.mGoalSwitchStand = true;
        }
        ((yiq) getMBinding()).A.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
        ((yiq) getMBinding()).B.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
        ((yiq) getMBinding()).K.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.xiaomi.fitness.baseui.dialog.CommonDialog] */
    private final void showExerciseGoalDialog(final int type, PickerDialog.a adapter, int uint, int currentStep, int title) {
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        PickerDialog pickerDialog = (PickerDialog) bv6.a(this, "exercise_goal_picker", title);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Create = (pickerDialog == null || (bVarBuildUpon = pickerDialog.buildUpon()) == null || (bVarC = bVarBuildUpon.c(adapter)) == null) ? 0 : bVarC.create();
        objectRef.element = Create;
        if (Create != 0) {
            Create.setRequestCode(this.REQ_GOAL);
        }
        PickerDialog pickerDialog2 = (PickerDialog) objectRef.element;
        if (pickerDialog2 != null) {
            pickerDialog2.showIfNeed(getSupportFragmentManager());
        }
        PickerDialog pickerDialog3 = (PickerDialog) objectRef.element;
        if (pickerDialog3 != null) {
            pickerDialog3.setValue(currentStep);
        }
        PickerDialog pickerDialog4 = (PickerDialog) objectRef.element;
        if (pickerDialog4 != null) {
            pickerDialog4.setPickerHintTextPluralsRes(uint);
        }
        PickerDialog pickerDialog5 = (PickerDialog) objectRef.element;
        if (pickerDialog5 != null) {
            pickerDialog5.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.goal.GoalManagerActivity.showExerciseGoalDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        dialog.dismiss();
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                        GoalManagerActivity goalManagerActivity = GoalManagerActivity.this;
                        PickerDialog pickerDialog6 = objectRef.element;
                        Integer numValueOf = pickerDialog6 != null ? Integer.valueOf(pickerDialog6.getValue()) : null;
                        Intrinsics.checkNotNull(numValueOf);
                        goalManagerActivity.selectValue = numValueOf.intValue();
                        if (GoalManagerActivity.this.selectValue == GoalConfigSupport.INSTANCE.getStandTimeGoal()) {
                            return;
                        }
                        NetUtil netUtil = NetUtil.INSTANCE;
                        Application application = GoalManagerActivity.this.getApplication();
                        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                        if (netUtil.getNetWorkAvailable(application)) {
                            GoalManagerActivity.access$getMViewModel(GoalManagerActivity.this).sendProfile(type, GoalManagerActivity.this.selectValue);
                            Logger.i(GoalManagerActivity.this.TAG + " Goal manager sendProfile selectValue is " + GoalManagerActivity.this.selectValue, new Object[0]);
                        } else {
                            ToastExtKt.toastShort(this, o1j.common_hint_network_unavailable);
                        }
                        GoalManagerActivity goalManagerActivity2 = GoalManagerActivity.this;
                        goalManagerActivity2.bindDataToView(UserInfoManager.getUserProfile$default(GoalManagerActivity.access$getMViewModel(goalManagerActivity2).getMUserInfoManager(), false, 1, null));
                        GoalManagerActivity.this.showOnvisibleView();
                    } else {
                        GoalManagerActivity goalManagerActivity3 = GoalManagerActivity.this;
                        PickerDialog pickerDialog7 = objectRef.element;
                        Integer numValueOf2 = pickerDialog7 != null ? Integer.valueOf(pickerDialog7.getValue()) : null;
                        Intrinsics.checkNotNull(numValueOf2);
                        goalManagerActivity3.selectValue = numValueOf2.intValue();
                        int i = type;
                        GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
                        if (i == guidePageUtil.getTYPE_GOAL_STEPS()) {
                            int i2 = GoalManagerActivity.this.selectValue;
                            GoalPreference goalPreference = GoalPreference.INSTANCE;
                            if (i2 != goalPreference.getNotLoginStepGoal()) {
                                goalPreference.setNotLoginStepGoal(GoalManagerActivity.this.selectValue);
                                goalPreference.setNotLoginSetGoalFlag(true);
                            }
                        } else if (i == guidePageUtil.getTYPE_GOAL_CALORIE()) {
                            int i3 = GoalManagerActivity.this.selectValue;
                            GoalPreference goalPreference2 = GoalPreference.INSTANCE;
                            if (i3 != goalPreference2.getNotLoginCalorieGoal()) {
                                goalPreference2.setNotLoginCalorieGoal(GoalManagerActivity.this.selectValue);
                                goalPreference2.setNotLoginSetGoalFlag(true);
                            }
                        } else if (i == guidePageUtil.getTYPE_GOAL_MHS()) {
                            int i4 = GoalManagerActivity.this.selectValue;
                            GoalPreference goalPreference3 = GoalPreference.INSTANCE;
                            if (i4 != goalPreference3.getNotLoginMhsGoal()) {
                                goalPreference3.setNotLoginMhsGoal(GoalManagerActivity.this.selectValue);
                                goalPreference3.setNotLoginStandTimeGoal(0);
                                goalPreference3.setNotLoginSetGoalFlag(true);
                            }
                        } else if (i == guidePageUtil.getTYPE_STAND_COUNT()) {
                            int i5 = GoalManagerActivity.this.selectValue;
                            GoalPreference goalPreference4 = GoalPreference.INSTANCE;
                            if (i5 != goalPreference4.getNotLoginStandTimeGoal()) {
                                goalPreference4.setNotLoginStandTimeGoal(GoalManagerActivity.this.selectValue);
                                goalPreference4.setNotLoginMhsGoal(0);
                                goalPreference4.setNotLoginSetGoalFlag(true);
                            }
                        }
                        GoalManagerActivity goalManagerActivity4 = GoalManagerActivity.this;
                        goalManagerActivity4.bindDataToView(UserInfoManager.getUserProfile$default(GoalManagerActivity.access$getMViewModel(goalManagerActivity4).getMUserInfoManager(), false, 1, null));
                        GoalManagerActivity.this.showOnvisibleView();
                    }
                    dialog.dismiss();
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    super.onDialogMultiClick(dialogName, which, isChecked);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showNotifySwitch() {
        String name;
        if (((UserGuideViewModel) getMViewModel()).showNotifySwitch()) {
            ConstraintLayout goalNotifySwitch = ((yiq) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(goalNotifySwitch, "goalNotifySwitch");
            ViewExtKt.visible(goalNotifySwitch);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
                name = "";
            }
            ((yiq) getMBinding()).I.setText(getString(o1j.u1, name));
            ((UserGuideViewModel) getMViewModel()).getGetVitalityReminderRet().observe(this, new GoalManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o1b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GoalManagerActivity.showNotifySwitch$lambda$1(this.f28640a, (UserGuideViewModel.VitalityReminderData) obj);
                }
            }));
            ((UserGuideViewModel) getMViewModel()).getSetVitalityReminderRet().observe(this, new GoalManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p1b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GoalManagerActivity.showNotifySwitch$lambda$2(this.f29904a, (Boolean) obj);
                }
            }));
            ((UserGuideViewModel) getMViewModel()).getVitalityReminder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showNotifySwitch$lambda$1(GoalManagerActivity this$0, UserGuideViewModel.VitalityReminderData vitalityReminderData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (vitalityReminderData != null) {
            ((yiq) this$0.getMBinding()).E.setSwitch(vitalityReminderData.getReachGoal());
        } else {
            ((yiq) this$0.getMBinding()).E.setSwitch(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNotifySwitch$lambda$2(GoalManagerActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, bool.booleanValue() ? o1j.common_set_success : o1j.common_set_error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showOnvisibleView() {
        Logger.i(this.TAG, "showOnvisibleView");
        try {
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                setSwitchGoal();
                return;
            }
            UserProfile userProfile$default = UserInfoManager.getUserProfile$default(((UserGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null);
            List<DallyGoalItem> regularGoalList = userProfile$default != null ? userProfile$default.getRegularGoalList() : null;
            GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
            int goalValue = goalConfigSupport.getGoalValue(goalConfigSupport.getSTAND_TIMES_GOAL_FIELD(), regularGoalList);
            int goalValue2 = goalConfigSupport.getGoalValue(goalConfigSupport.getMHS_GOAL_FIELD(), regularGoalList);
            if (goalConfigSupport.containsKey(goalConfigSupport.getSTAND_TIMES_GOAL_FIELD(), regularGoalList)) {
                String quantityString = getResources().getQuantityString(fyi.f18377k, goalValue, Integer.valueOf(goalValue));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ((yiq) getMBinding()).A.setTitle(o1j.f28647r);
                ((yiq) getMBinding()).A.setEnable(true, moi.i);
                ((yiq) getMBinding()).A.setSubtitle(quantityString);
                this.mGoalSwitchStand = true;
            } else {
                String quantityString2 = getResources().getQuantityString(fyi.j, goalValue2, Integer.valueOf(goalValue2));
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                ((yiq) getMBinding()).A.setTitle(o1j.b1);
                ((yiq) getMBinding()).A.setEnable(true, moi.g);
                ((yiq) getMBinding()).A.setSubtitle(quantityString2);
                this.mGoalSwitchStand = false;
            }
            ((yiq) getMBinding()).A.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
            ((yiq) getMBinding()).B.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
            ((yiq) getMBinding()).K.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(this, view);
        a4iVar.f(swi.f34062b);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: w1b
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return GoalManagerActivity.showPopupMenu$lambda$8(this.f37438a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean showPopupMenu$lambda$8(GoalManagerActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == hsi.r0) {
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                ((UserGuideViewModel) this$0.getMViewModel()).sendProfile(GuidePageUtil.INSTANCE.getTYPE_GOAL_MHS(), this$0.mhsGoal);
                this$0.showOnvisibleView();
                return true;
            }
            GoalPreference goalPreference = GoalPreference.INSTANCE;
            goalPreference.setNotLoginMhsGoal(30);
            goalPreference.setNotLoginStandTimeGoal(0);
            this$0.showOnvisibleView();
            return true;
        }
        if (itemId != hsi.s0) {
            return true;
        }
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isLogin() || !RomUtils.INSTANCE.isMiui()) {
            if (!AccountManagerExtKt.getInstance(companion).isLogin()) {
                return true;
            }
            ((UserGuideViewModel) this$0.getMViewModel()).sendProfile(GuidePageUtil.INSTANCE.getTYPE_STAND_COUNT(), this$0.standGoal);
            this$0.showOnvisibleView();
            return true;
        }
        GoalPreference goalPreference2 = GoalPreference.INSTANCE;
        goalPreference2.setNotLoginStandTimeGoal(12);
        goalPreference2.setNotLoginMhsGoal(0);
        this$0.showOnvisibleView();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindDataToView(@Nullable UserProfile profile) {
        int notLoginStepGoal;
        int notLoginCalorieGoal;
        int notLoginStandTimeGoal;
        int notLoginMhsGoal;
        if (profile == null) {
            this.profile = UserInfoManager.getUserProfile$default(((UserGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null);
        }
        this.profile = profile;
        try {
            Logger.i(this.TAG, "GoalManagerActivity profile IS " + profile);
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                List<DallyGoalItem> regularGoalList = profile != null ? profile.getRegularGoalList() : null;
                GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
                notLoginStepGoal = goalConfigSupport.getGoalValue(goalConfigSupport.getSTEP_GOAL_FIELD(), regularGoalList);
                notLoginCalorieGoal = goalConfigSupport.getGoalValue(goalConfigSupport.getCALORIE_GOAL_FIELD(), regularGoalList);
                notLoginStandTimeGoal = goalConfigSupport.getGoalValue(goalConfigSupport.getSTAND_TIMES_GOAL_FIELD(), regularGoalList);
                notLoginMhsGoal = goalConfigSupport.getGoalValue(goalConfigSupport.getMHS_GOAL_FIELD(), regularGoalList);
            } else {
                GoalPreference goalPreference = GoalPreference.INSTANCE;
                notLoginStepGoal = goalPreference.getNotLoginStepGoal();
                notLoginCalorieGoal = goalPreference.getNotLoginCalorieGoal();
                notLoginStandTimeGoal = goalPreference.getNotLoginStandTimeGoal();
                notLoginMhsGoal = goalPreference.getNotLoginMhsGoal();
            }
            Logger.i(this.TAG, "STEP=" + notLoginStepGoal + ", calore= " + notLoginCalorieGoal + " ,stand = " + notLoginStandTimeGoal + " + mhs = " + notLoginMhsGoal);
            String quantityString = getResources().getQuantityString(fyi.l, notLoginStepGoal, Integer.valueOf(notLoginStepGoal));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            ((yiq) getMBinding()).K.setSubtitle(quantityString);
            String quantityString2 = getResources().getQuantityString(fyi.i, notLoginCalorieGoal, Integer.valueOf(notLoginCalorieGoal));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            ((yiq) getMBinding()).B.setSubtitle(quantityString2);
            ((yiq) getMBinding()).A.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
            ((yiq) getMBinding()).B.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
            ((yiq) getMBinding()).K.setViewPadding((int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b), (int) ResourceExtKt.getDimen(this, wli.f38106a), (int) ResourceExtKt.getDimen(this, wli.f38107b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int getContentResourceId() {
        return nvi.f;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.f;
    }

    public final int getMhsGoal() {
        return this.mhsGoal;
    }

    public final int getREQ_GOAL() {
        return this.REQ_GOAL;
    }

    public final int getStandGoal() {
        return this.standGoal;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    public final boolean hasDeviceConnect() {
        return !DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initContentView() {
        setTitle(getString(o1j.a1));
        setSubtitle(getString(o1j.d1));
        setTitleBackground(hki.d);
        bindDataToView(UserInfoManager.getUserProfile$default(((UserGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null));
        GoalConfigSupport.INSTANCE.getDeviceSupportGoal();
        initData(UserInfoManager.getUserProfile$default(((UserGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null));
        showOnvisibleView();
        setListener();
        showNotifySwitch();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_GoalManagerActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContentView();
        bindDataToView(UserInfoManager.getUserProfile$default(((UserGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null));
        ((UserGuideViewModel) getMViewModel()).getMDatabaseChange().observe(this, new GoalManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoalManagerActivity.onCreate$lambda$0(this.f30986a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String simpleName = GoalManagerActivity.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        Logger.i(" Goal manager onResume  %s", simpleName);
        super.onResume();
        showOnvisibleView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setListener() {
        if (this.profile == null) {
            Logger.i(this.TAG + " Goal manager profile is null", new Object[0]);
            return;
        }
        ViewExtKt.clickWithTrigger$default(((yiq) getMBinding()).K, 0L, new Function1() { // from class: r1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoalManagerActivity.setListener$lambda$3(this.f32074a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((yiq) getMBinding()).B, 0L, new Function1() { // from class: s1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoalManagerActivity.setListener$lambda$4(this.f33164a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((yiq) getMBinding()).A, 0L, new Function1() { // from class: t1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoalManagerActivity.setListener$lambda$5(this.f34200a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
        ((yiq) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: u1b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalManagerActivity.setListener$lambda$6(this.f35271a, view);
            }
        });
        ((yiq) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: v1b
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                GoalManagerActivity.setListener$lambda$7(this.f36374a, z, iSwitchButton);
            }
        });
    }
}
