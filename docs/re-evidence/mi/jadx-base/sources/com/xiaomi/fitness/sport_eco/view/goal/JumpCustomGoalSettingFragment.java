package com.xiaomi.fitness.sport_eco.view.goal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mi.health.course.ext.CourseExtKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.view.goal.JumpCustomGoalSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco.view.widget.JumpCountCustomGoalView;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.av6;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.g5a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/goal/JumpCustomGoalSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/goal/JumpGoalVM;", "Lg5a;", "", "launchGym", "()V", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "showConnectDialog", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "(Landroid/view/View;)V", "setListener", "", DailyRecordKey.sportType, "I", "sportGoal", "", "sportGoalValue", "F", "deviceType", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class JumpCustomGoalSettingFragment extends BaseBindingFragment<JumpGoalVM, g5a> {

    @NotNull
    public static final String TAG = "JumpCustomGoalSettingFragment";
    private int deviceType;
    private int sportGoal;
    private float sportGoalValue;
    private int sportType;

    private final void launchGym() {
        JumpCountCustomGoalView jumpCountCustomGoalView;
        EditText goalEditText;
        JumpCountCustomGoalView jumpCountCustomGoalView2;
        EditText goalEditText2;
        JumpCountCustomGoalView jumpCountCustomGoalView3;
        EditText goalEditText3;
        JumpCountCustomGoalView jumpCountCustomGoalView4;
        EditText goalEditText4;
        JumpCountCustomGoalView jumpCountCustomGoalView5;
        EditText goalEditText5;
        g5a mBinding = getMBinding();
        Editable text = null;
        if (!StringsKt__StringsKt.isBlank(String.valueOf((mBinding == null || (jumpCountCustomGoalView5 = mBinding.A) == null || (goalEditText5 = jumpCountCustomGoalView5.getGoalEditText()) == null) ? null : goalEditText5.getText()))) {
            g5a mBinding2 = getMBinding();
            if (Float.parseFloat(String.valueOf((mBinding2 == null || (jumpCountCustomGoalView4 = mBinding2.A) == null || (goalEditText4 = jumpCountCustomGoalView4.getGoalEditText()) == null) ? null : goalEditText4.getText())) != 0.0f) {
                g5a mBinding3 = getMBinding();
                if (Float.parseFloat(String.valueOf((mBinding3 == null || (jumpCountCustomGoalView3 = mBinding3.A) == null || (goalEditText3 = jumpCountCustomGoalView3.getGoalEditText()) == null) ? null : goalEditText3.getText())) >= 50.0f) {
                    g5a mBinding4 = getMBinding();
                    if (Float.parseFloat(String.valueOf((mBinding4 == null || (jumpCountCustomGoalView2 = mBinding4.A) == null || (goalEditText2 = jumpCountCustomGoalView2.getGoalEditText()) == null) ? null : goalEditText2.getText())) <= 9999.0f) {
                        g5a mBinding5 = getMBinding();
                        if (mBinding5 != null && (jumpCountCustomGoalView = mBinding5.A) != null && (goalEditText = jumpCountCustomGoalView.getGoalEditText()) != null) {
                            text = goalEditText.getText();
                        }
                        this.sportGoalValue = Float.parseFloat(String.valueOf(text));
                        final Bundle bundle = new Bundle();
                        bundle.putInt("KEY_SPORT_TYPE", this.sportType);
                        bundle.putFloat("GOAL_VALUE", this.sportGoalValue);
                        bundle.putInt("GOAL_TYPE", this.sportGoal);
                        bundle.putInt("DEVICE_TYPE", this.deviceType);
                        FitnessLogUtils.d(TAG, "deviceType : " + this.deviceType + " , sportType : " + this.sportType + " , sportGoal : " + this.sportGoal + " , sportGoalValue : " + this.sportGoalValue);
                        if (this.deviceType == 1 && this.sportType == 14 && !ViewUtil.INSTANCE.isFastClick()) {
                            String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
                            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(key_gym_local_sport_type);
                            if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected()) {
                                GymDeviceModel.INSTANCE.getBattery(key_gym_local_sport_type, new Function1() { // from class: bvd
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: invoke */
                                    public final Object invoke2(Object obj) {
                                        return JumpCustomGoalSettingFragment.launchGym$lambda$7(this.f4638a, bundle, ((Integer) obj).intValue());
                                    }
                                });
                                return;
                            }
                            Product properProduct = CourseExtKt.getProperProduct(key_gym_local_sport_type);
                            Logger.i(TAG, "product:" + properProduct);
                            if (properProduct == null) {
                                ToastUtil.showShortToast(e1j.common_hint_unkonwn_error);
                                return;
                            } else {
                                showConnectDialog(properProduct);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
        ToastUtil.showShortToast(getResources().getString(e1j.f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$7(final JumpCustomGoalSettingFragment this$0, final Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (i == 0 || i == 1) {
            GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
            FragmentActivity activity = this$0.getActivity();
            int i2 = e1j.C3;
            String string = this$0.getString(e1j.E3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gymDeviceModel.showLowRemindDialog(activity, i2, string, new Function0() { // from class: cvd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else if (i != 2) {
            bundle.putInt(SportConstants.TRAINING_MODE, 1);
            FragmentActivity activity2 = this$0.getActivity();
            if (activity2 != null) {
                LaunchExtensionKt.startActivity(activity2, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: evd
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return JumpCustomGoalSettingFragment.launchGym$lambda$7$lambda$6(bundle, (Intent) obj);
                    }
                });
            }
        } else {
            GymDeviceModel gymDeviceModel2 = GymDeviceModel.INSTANCE;
            FragmentActivity activity3 = this$0.getActivity();
            int i3 = e1j.C3;
            String string2 = this$0.getString(e1j.D3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            gymDeviceModel2.showLowRemindDialog(activity3, i3, string2, new Function0() { // from class: dvd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumpCustomGoalSettingFragment.launchGym$lambda$7$lambda$5(bundle, this$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$7$lambda$5(final Bundle bundle, JumpCustomGoalSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bundle.putInt(SportConstants.TRAINING_MODE, 1);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: fvd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JumpCustomGoalSettingFragment.launchGym$lambda$7$lambda$5$lambda$4(bundle, (Intent) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$7$lambda$5$lambda$4(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$7$lambda$6(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(JumpCustomGoalSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.launchGym();
    }

    private final void showConnectDialog(final Product product) {
        new CommonDialog.c("connect").setDialogTitle(new DialogParams.DialogDescriptionString(getResources().getString(e1j.d3))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getResources().getString(e1j.e3))).setPositiveText(e1j.s3).setNegativeText(e1j.common_cancel).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.goal.JumpCustomGoalSettingFragment.showConnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                FragmentActivity activity;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1 || (activity = JumpCustomGoalSettingFragment.this.getActivity()) == null) {
                    return;
                }
                DeviceManagerExtKt.launchToScanDevice(activity, product, true);
            }
        }).showIfNeed(getChildFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.R;
    }

    public final void initView(@Nullable View view) {
        JumpCountCustomGoalView jumpCountCustomGoalView;
        EditText goalEditText;
        setTitle(e1j.s0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.sportType = arguments.getInt("KEY_SPORT_TYPE", 14);
            this.sportGoal = arguments.getInt("GOAL_TYPE", 6);
            this.deviceType = arguments.getInt("DEVICE_TYPE", 1);
        }
        g5a mBinding = getMBinding();
        if (mBinding == null || (jumpCountCustomGoalView = mBinding.A) == null || (goalEditText = jumpCountCustomGoalView.getGoalEditText()) == null) {
            return;
        }
        goalEditText.setText("100");
        goalEditText.setFocusable(true);
        goalEditText.setFocusableInTouchMode(true);
        goalEditText.requestFocus();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        TextView textView;
        g5a mBinding = getMBinding();
        if (mBinding == null || (textView = mBinding.B) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: avd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JumpCustomGoalSettingFragment.setListener$lambda$2(this.f3486a, view);
            }
        });
    }
}
