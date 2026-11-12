package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.model.DeviceBPRemind;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.ui.MeasureRemindPreferenceFragment;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import defpackage.b6j;
import defpackage.c0j;
import defpackage.gxf;
import defpackage.he5;
import defpackage.i2m;
import defpackage.j7g;
import defpackage.jui;
import defpackage.mwg;
import defpackage.o5g;
import defpackage.tz2;
import defpackage.yaa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.preference.RadioButtonPreference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bH\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J'\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010 J'\u0010$\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010\"J'\u0010%\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010\"J'\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010\"J#\u0010*\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,2\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\u0003H\u0016¢\u0006\u0004\b1\u0010\u0005J'\u00102\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001eH\u0016¢\u0006\u0004\b2\u0010 R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010F\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/MeasureRemindPreferenceFragment;", "Lmiuix/preference/PreferenceFragment;", "Lyaa;", "", "initRadioButtonPreferenceClick", "()V", "updateSwitchState", "", "getCategory", "()I", "Ltz2;", "data", "", "enable", "updateToDevice", "(Ltz2;Z)V", "requestAlarmPermission", "exactAlarms", "postPermissionGranted", "checkPermission", "(ZZ)V", "addAnimatorIfNeed", "initNormal", "initMid", "initModerate", "initSevere", "initCustom", "saveConfigIfNeed", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/os/Bundle;", "dealRemindTimeResult", "(IILandroid/os/Bundle;)V", "checkNormalResult", "(IILandroid/os/Bundle;)Z", "checkCustomResult", "checkSevereResult", "checkModerateResult", "checkMidResult", "savedInstanceState", "", "rootKey", "onCreatePreferences", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onFragmentResult", "Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "mBloodPressureViewModel", "Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "Lmwg;", "mNormalPreferenceHolder", "Lmwg;", "Lgxf;", "mMidPreferenceHolder", "Lgxf;", "Lj7g;", "mModeratePreferenceHolder", "Lj7g;", "Li2m;", "mSeverePreferenceHolder", "Li2m;", "Lhe5;", "mCustomPreferenceHolder", "Lhe5;", "", "mRemindDataMap", "Ljava/util/Map;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MeasureRemindPreferenceFragment extends Hilt_MeasureRemindPreferenceFragment implements yaa {
    private BloodPressureViewModel mBloodPressureViewModel;
    private he5 mCustomPreferenceHolder;
    private gxf mMidPreferenceHolder;
    private j7g mModeratePreferenceHolder;
    private mwg mNormalPreferenceHolder;

    @Nullable
    private Map<String, tz2> mRemindDataMap;
    private i2m mSeverePreferenceHolder;

    private final void addAnimatorIfNeed() {
        RecyclerView listView = getListView();
        if (listView == null || listView.getItemAnimator() != null) {
            return;
        }
        listView.setItemAnimator(new o5g());
    }

    private final void checkCustomResult(int requestCode, int resultCode, Bundle data) {
        he5 he5Var = this.mCustomPreferenceHolder;
        he5 he5Var2 = null;
        if (he5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomPreferenceHolder");
            he5Var = null;
        }
        int[] iArrN = he5Var.n();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(iArrN)) || requestCode < iArrN[0] || requestCode > iArrN[1] || resultCode != -1) {
            return;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i == -1 || i2 == -1) {
            return;
        }
        int minutes = (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2));
        he5 he5Var3 = this.mCustomPreferenceHolder;
        if (he5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomPreferenceHolder");
        } else {
            he5Var2 = he5Var3;
        }
        he5Var2.y(requestCode, minutes);
    }

    private final boolean checkMidResult(int requestCode, int resultCode, Bundle data) {
        gxf gxfVar = this.mMidPreferenceHolder;
        gxf gxfVar2 = null;
        if (gxfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMidPreferenceHolder");
            gxfVar = null;
        }
        int[] iArrI = gxfVar.i();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(iArrI)) || requestCode < iArrI[0] || requestCode > iArrI[1] || resultCode != -1) {
            return false;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i != -1 && i2 != -1) {
            int minutes = (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2));
            gxf gxfVar3 = this.mMidPreferenceHolder;
            if (gxfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMidPreferenceHolder");
            } else {
                gxfVar2 = gxfVar3;
            }
            gxfVar2.r(requestCode, minutes);
        }
        return true;
    }

    private final boolean checkModerateResult(int requestCode, int resultCode, Bundle data) {
        j7g j7gVar = this.mModeratePreferenceHolder;
        j7g j7gVar2 = null;
        if (j7gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mModeratePreferenceHolder");
            j7gVar = null;
        }
        int[] iArrD = j7gVar.d();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(iArrD)) || requestCode < iArrD[0] || requestCode > iArrD[1] || resultCode != -1) {
            return false;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i != -1 && i2 != -1) {
            int minutes = (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2));
            j7g j7gVar3 = this.mModeratePreferenceHolder;
            if (j7gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModeratePreferenceHolder");
            } else {
                j7gVar2 = j7gVar3;
            }
            j7gVar2.k(requestCode, minutes);
        }
        return true;
    }

    private final boolean checkNormalResult(int requestCode, int resultCode, Bundle data) {
        mwg mwgVar = this.mNormalPreferenceHolder;
        mwg mwgVar2 = null;
        if (mwgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalPreferenceHolder");
            mwgVar = null;
        }
        int[] iArrI = mwgVar.i();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(iArrI)) || requestCode < iArrI[0] || requestCode > iArrI[1] || resultCode != -1) {
            return false;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i != -1 && i2 != -1) {
            int minutes = (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2));
            mwg mwgVar3 = this.mNormalPreferenceHolder;
            if (mwgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNormalPreferenceHolder");
            } else {
                mwgVar2 = mwgVar3;
            }
            mwgVar2.q(requestCode, minutes);
        }
        return true;
    }

    private final void checkPermission(boolean exactAlarms, boolean postPermissionGranted) {
        final Function0 function0 = new Function0() { // from class: kbf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeasureRemindPreferenceFragment.checkPermission$lambda$5(this.f23683a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity activity = getActivity();
        String string = getString(c0j.Y1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, activity, string, 1, false, new Function1() { // from class: lbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.checkPermission$lambda$6(function0, this, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$5(final MeasureRemindPreferenceFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String string = this$0.getString(c0j.Y1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationPermission.requestPostNotificationPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, string, false, new Function1() { // from class: mbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.checkPermission$lambda$5$lambda$4(this.f25973a, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$5$lambda$4(MeasureRemindPreferenceFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        } else {
            CustomerSwitchPreference customerSwitchPreference = (CustomerSwitchPreference) this$0.findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
            if (customerSwitchPreference != null) {
                customerSwitchPreference.setChecked(false);
            }
            CustomerSwitchPreference customerSwitchPreference2 = (CustomerSwitchPreference) this$0.findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
            if (customerSwitchPreference2 != null) {
                customerSwitchPreference2.setSwitchButton(Boolean.FALSE);
            }
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, "android.permission.POST_NOTIFICATIONS", fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: ebf
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MeasureRemindPreferenceFragment.checkPermission$lambda$5$lambda$4$lambda$3();
                }
            }, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$5$lambda$4$lambda$3() {
        NotificationPermission.INSTANCE.goNotifySettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$6(Function0 requestPermission, MeasureRemindPreferenceFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            requestPermission.invoke();
            return Unit.INSTANCE;
        }
        CustomerSwitchPreference customerSwitchPreference = (CustomerSwitchPreference) this$0.findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
        if (customerSwitchPreference != null) {
            customerSwitchPreference.setChecked(false);
        }
        CustomerSwitchPreference customerSwitchPreference2 = (CustomerSwitchPreference) this$0.findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
        if (customerSwitchPreference2 == null) {
            return null;
        }
        customerSwitchPreference2.setSwitchButton(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private final boolean checkSevereResult(int requestCode, int resultCode, Bundle data) {
        i2m i2mVar = this.mSeverePreferenceHolder;
        i2m i2mVar2 = null;
        if (i2mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeverePreferenceHolder");
            i2mVar = null;
        }
        int[] iArrF = i2mVar.f();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(iArrF)) || requestCode < iArrF[0] || requestCode > iArrF[1] || resultCode != -1) {
            return false;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i != -1 && i2 != -1) {
            int minutes = (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2));
            i2m i2mVar3 = this.mSeverePreferenceHolder;
            if (i2mVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeverePreferenceHolder");
            } else {
                i2mVar2 = i2mVar3;
            }
            i2mVar2.n(requestCode, minutes);
        }
        return true;
    }

    private final void dealRemindTimeResult(int requestCode, int resultCode, Bundle data) {
        if (checkNormalResult(requestCode, resultCode, data) || checkMidResult(requestCode, resultCode, data) || checkSevereResult(requestCode, resultCode, data)) {
            return;
        }
        checkCustomResult(requestCode, resultCode, data);
    }

    private final int getCategory() {
        BloodPressureViewModel bloodPressureViewModel = this.mBloodPressureViewModel;
        BloodPressureViewModel bloodPressureViewModel2 = null;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        IBloodPressurePreRepository mPrefRepo = bloodPressureViewModel.getMPrefRepo();
        Boolean bool = Boolean.FALSE;
        Object prefValue = mPrefRepo.getPrefValue("normal_enable", bool);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(prefValue, bool2)) {
            RadioButtonPreference radioButtonPreference = (RadioButtonPreference) findPreference("normal_enable");
            if (radioButtonPreference == null) {
                return 0;
            }
            radioButtonPreference.setChecked(true);
            return 0;
        }
        BloodPressureViewModel bloodPressureViewModel3 = this.mBloodPressureViewModel;
        if (bloodPressureViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel3 = null;
        }
        if (Intrinsics.areEqual(bloodPressureViewModel3.getMPrefRepo().getPrefValue("mid_enable", bool), bool2)) {
            RadioButtonPreference radioButtonPreference2 = (RadioButtonPreference) findPreference("mid_enable");
            if (radioButtonPreference2 != null) {
                radioButtonPreference2.setChecked(true);
            }
            return 1;
        }
        BloodPressureViewModel bloodPressureViewModel4 = this.mBloodPressureViewModel;
        if (bloodPressureViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel4 = null;
        }
        if (Intrinsics.areEqual(bloodPressureViewModel4.getMPrefRepo().getPrefValue("severe_enable", bool), bool2)) {
            RadioButtonPreference radioButtonPreference3 = (RadioButtonPreference) findPreference("severe_enable");
            if (radioButtonPreference3 != null) {
                radioButtonPreference3.setChecked(true);
            }
            return 2;
        }
        BloodPressureViewModel bloodPressureViewModel5 = this.mBloodPressureViewModel;
        if (bloodPressureViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
        } else {
            bloodPressureViewModel2 = bloodPressureViewModel5;
        }
        if (Intrinsics.areEqual(bloodPressureViewModel2.getMPrefRepo().getPrefValue("custom_enable", bool), bool2)) {
            RadioButtonPreference radioButtonPreference4 = (RadioButtonPreference) findPreference("custom_enable");
            if (radioButtonPreference4 != null) {
                radioButtonPreference4.setChecked(true);
            }
            return 3;
        }
        RadioButtonPreference radioButtonPreference5 = (RadioButtonPreference) findPreference("normal_enable");
        if (radioButtonPreference5 == null) {
            return 0;
        }
        radioButtonPreference5.setChecked(true);
        return 0;
    }

    private final void initCustom() {
        this.mCustomPreferenceHolder = new he5(this);
        BloodPressureViewModel bloodPressureViewModel = this.mBloodPressureViewModel;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        bloodPressureViewModel.getMeasureRemindDataLiveData("custom").observe(this, new MeasureRemindPreferenceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.initCustom$lambda$11(this.f5162a, (tz2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustom$lambda$11(MeasureRemindPreferenceFragment this$0, tz2 tz2Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tz2Var != null) {
            he5 he5Var = this$0.mCustomPreferenceHolder;
            if (he5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomPreferenceHolder");
                he5Var = null;
            }
            he5Var.x(tz2Var);
            Map<String, tz2> map = this$0.mRemindDataMap;
            Intrinsics.checkNotNull(map);
            map.put("custom", tz2Var);
        }
        return Unit.INSTANCE;
    }

    private final void initMid() {
        this.mMidPreferenceHolder = new gxf(this);
        BloodPressureViewModel bloodPressureViewModel = this.mBloodPressureViewModel;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        bloodPressureViewModel.getMeasureRemindDataLiveData(BloodPressurePreRepository.KEY_ITEM_MID).observe(this, new MeasureRemindPreferenceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.initMid$lambda$8(this.f18805a, (tz2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMid$lambda$8(MeasureRemindPreferenceFragment this$0, tz2 tz2Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tz2Var != null) {
            gxf gxfVar = this$0.mMidPreferenceHolder;
            if (gxfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMidPreferenceHolder");
                gxfVar = null;
            }
            gxfVar.q(tz2Var);
            Map<String, tz2> map = this$0.mRemindDataMap;
            Intrinsics.checkNotNull(map);
            map.put(BloodPressurePreRepository.KEY_ITEM_MID, tz2Var);
        }
        return Unit.INSTANCE;
    }

    private final void initModerate() {
        this.mModeratePreferenceHolder = new j7g(this);
        BloodPressureViewModel bloodPressureViewModel = this.mBloodPressureViewModel;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        bloodPressureViewModel.getMeasureRemindDataLiveData(BloodPressurePreRepository.KEY_ITEM_MODERATE).observe(this, new MeasureRemindPreferenceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.initModerate$lambda$9(this.f22617a, (tz2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initModerate$lambda$9(MeasureRemindPreferenceFragment this$0, tz2 tz2Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tz2Var != null) {
            j7g j7gVar = this$0.mModeratePreferenceHolder;
            if (j7gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModeratePreferenceHolder");
                j7gVar = null;
            }
            j7gVar.j(tz2Var);
            Map<String, tz2> map = this$0.mRemindDataMap;
            Intrinsics.checkNotNull(map);
            map.put(BloodPressurePreRepository.KEY_ITEM_MODERATE, tz2Var);
        }
        return Unit.INSTANCE;
    }

    private final void initNormal() {
        this.mNormalPreferenceHolder = new mwg(this);
        BloodPressureViewModel bloodPressureViewModel = this.mBloodPressureViewModel;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        bloodPressureViewModel.getMeasureRemindDataLiveData("normal").observe(this, new MeasureRemindPreferenceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ibf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.initNormal$lambda$7(this.f20970a, (tz2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initNormal$lambda$7(MeasureRemindPreferenceFragment this$0, tz2 tz2Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tz2Var != null) {
            mwg mwgVar = this$0.mNormalPreferenceHolder;
            if (mwgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNormalPreferenceHolder");
                mwgVar = null;
            }
            mwgVar.p(tz2Var);
            Map<String, tz2> map = this$0.mRemindDataMap;
            Intrinsics.checkNotNull(map);
            map.put("normal", tz2Var);
        }
        return Unit.INSTANCE;
    }

    private final void initRadioButtonPreferenceClick() {
        Preference preferenceFindPreference = findPreference("normal_enable");
        Intrinsics.checkNotNull(preferenceFindPreference);
        RadioButtonPreference radioButtonPreference = (RadioButtonPreference) preferenceFindPreference;
        radioButtonPreference.setLayoutResource(jui.n);
        Preference preferenceFindPreference2 = findPreference("mid_enable");
        Intrinsics.checkNotNull(preferenceFindPreference2);
        RadioButtonPreference radioButtonPreference2 = (RadioButtonPreference) preferenceFindPreference2;
        radioButtonPreference2.setLayoutResource(jui.n);
        Preference preferenceFindPreference3 = findPreference("severe_enable");
        Intrinsics.checkNotNull(preferenceFindPreference3);
        RadioButtonPreference radioButtonPreference3 = (RadioButtonPreference) preferenceFindPreference3;
        radioButtonPreference3.setLayoutResource(jui.n);
        Preference preferenceFindPreference4 = findPreference("custom_enable");
        Intrinsics.checkNotNull(preferenceFindPreference4);
        RadioButtonPreference radioButtonPreference4 = (RadioButtonPreference) preferenceFindPreference4;
        radioButtonPreference4.setLayoutResource(jui.n);
        Preference.d dVar = new Preference.d() { // from class: hbf
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return MeasureRemindPreferenceFragment.initRadioButtonPreferenceClick$lambda$0(this.f19905a, preference);
            }
        };
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Preference preferenceFindPreference5 = findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
        Intrinsics.checkNotNull(preferenceFindPreference5);
        CustomerSwitchPreference customerSwitchPreference = (CustomerSwitchPreference) preferenceFindPreference5;
        customerSwitchPreference.setSummaryOff(getString(c0j.V1));
        customerSwitchPreference.setSummaryOn((wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_pressure")) ? getString(c0j.X1) : getString(c0j.W1));
        radioButtonPreference.setOnPreferenceClickListener(dVar);
        radioButtonPreference2.setOnPreferenceClickListener(dVar);
        radioButtonPreference3.setOnPreferenceClickListener(dVar);
        radioButtonPreference4.setOnPreferenceClickListener(dVar);
        updateSwitchState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initRadioButtonPreferenceClick$lambda$0(MeasureRemindPreferenceFragment this$0, Preference preference) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.addAnimatorIfNeed();
        return true;
    }

    private final void initSevere() {
        this.mSeverePreferenceHolder = new i2m(this);
        BloodPressureViewModel bloodPressureViewModel = this.mBloodPressureViewModel;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        bloodPressureViewModel.getMeasureRemindDataLiveData(BloodPressurePreRepository.KEY_ITEM_SEVERE).observe(this, new MeasureRemindPreferenceFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.initSevere$lambda$10(this.f15341a, (tz2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSevere$lambda$10(MeasureRemindPreferenceFragment this$0, tz2 tz2Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tz2Var != null) {
            i2m i2mVar = this$0.mSeverePreferenceHolder;
            if (i2mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeverePreferenceHolder");
                i2mVar = null;
            }
            i2mVar.m(tz2Var);
            Map<String, tz2> map = this$0.mRemindDataMap;
            Intrinsics.checkNotNull(map);
            map.put(BloodPressurePreRepository.KEY_ITEM_SEVERE, tz2Var);
        }
        return Unit.INSTANCE;
    }

    private final void requestAlarmPermission() {
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NotificationPermission.requestAlarmPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, c0j.Y1, false, new Function1() { // from class: bbf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureRemindPreferenceFragment.requestAlarmPermission$lambda$2(this.f4016a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAlarmPermission$lambda$2(MeasureRemindPreferenceFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomerSwitchPreference customerSwitchPreference = (CustomerSwitchPreference) this$0.findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
        if (customerSwitchPreference != null) {
            customerSwitchPreference.setChecked(z);
        }
        CustomerSwitchPreference customerSwitchPreference2 = (CustomerSwitchPreference) this$0.findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
        if (customerSwitchPreference2 != null) {
            customerSwitchPreference2.setSwitchButton(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    private final void saveConfigIfNeed() {
        BloodPressureViewModel bloodPressureViewModel;
        ArrayMap arrayMap = new ArrayMap();
        Map<String, tz2> map = this.mRemindDataMap;
        Intrinsics.checkNotNull(map);
        Iterator<Map.Entry<String, tz2>> it = map.entrySet().iterator();
        while (true) {
            bloodPressureViewModel = null;
            mwg mwgVar = null;
            gxf gxfVar = null;
            i2m i2mVar = null;
            he5 he5Var = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, tz2> next = it.next();
            String key = next.getKey();
            tz2 value = next.getValue();
            if ("normal".equals(key)) {
                mwg mwgVar2 = this.mNormalPreferenceHolder;
                if (mwgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNormalPreferenceHolder");
                    mwgVar2 = null;
                }
                if (!Intrinsics.areEqual(mwgVar2.f(), value)) {
                    mwg mwgVar3 = this.mNormalPreferenceHolder;
                    if (mwgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mNormalPreferenceHolder");
                    } else {
                        mwgVar = mwgVar3;
                    }
                    arrayMap.put("normal", mwgVar.f());
                }
            }
            if (BloodPressurePreRepository.KEY_ITEM_MID.equals(key)) {
                gxf gxfVar2 = this.mMidPreferenceHolder;
                if (gxfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMidPreferenceHolder");
                    gxfVar2 = null;
                }
                if (!Intrinsics.areEqual(gxfVar2.g(), value)) {
                    gxf gxfVar3 = this.mMidPreferenceHolder;
                    if (gxfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMidPreferenceHolder");
                    } else {
                        gxfVar = gxfVar3;
                    }
                    arrayMap.put(BloodPressurePreRepository.KEY_ITEM_MID, gxfVar.g());
                }
            }
            if (BloodPressurePreRepository.KEY_ITEM_SEVERE.equals(key)) {
                i2m i2mVar2 = this.mSeverePreferenceHolder;
                if (i2mVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeverePreferenceHolder");
                    i2mVar2 = null;
                }
                if (!Intrinsics.areEqual(i2mVar2.e(), value)) {
                    i2m i2mVar3 = this.mSeverePreferenceHolder;
                    if (i2mVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeverePreferenceHolder");
                    } else {
                        i2mVar = i2mVar3;
                    }
                    arrayMap.put(BloodPressurePreRepository.KEY_ITEM_SEVERE, i2mVar.e());
                }
            }
            if ("custom".equals(key)) {
                he5 he5Var2 = this.mCustomPreferenceHolder;
                if (he5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCustomPreferenceHolder");
                    he5Var2 = null;
                }
                if (!Intrinsics.areEqual(he5Var2.k(), value)) {
                    he5 he5Var3 = this.mCustomPreferenceHolder;
                    if (he5Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCustomPreferenceHolder");
                    } else {
                        he5Var = he5Var3;
                    }
                    arrayMap.put("custom", he5Var.k());
                }
            }
        }
        BloodPressureViewModel bloodPressureViewModel2 = this.mBloodPressureViewModel;
        if (bloodPressureViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
        } else {
            bloodPressureViewModel = bloodPressureViewModel2;
        }
        bloodPressureViewModel.updateRemindConfig(arrayMap);
    }

    private final void updateSwitchState() {
        final CustomerSwitchPreference customerSwitchPreference = (CustomerSwitchPreference) findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
        if (customerSwitchPreference != null && customerSwitchPreference.isChecked()) {
            getCategory();
        }
        Logger.d("SWITCH_ENABLE", "updateSwitchState " + (customerSwitchPreference != null ? Boolean.valueOf(customerSwitchPreference.isChecked()) : null));
        if (customerSwitchPreference != null) {
            customerSwitchPreference.setOnPreferenceChangeListener(new Preference.c() { // from class: fbf
                @Override // androidx.preference.Preference.c
                public final boolean a(Preference preference, Object obj) {
                    return MeasureRemindPreferenceFragment.updateSwitchState$lambda$1(this.f17627a, customerSwitchPreference, preference, obj);
                }
            });
        }
        if (customerSwitchPreference != null) {
            customerSwitchPreference.setSwitchButton(Boolean.valueOf(customerSwitchPreference.isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateSwitchState$lambda$1(MeasureRemindPreferenceFragment this$0, CustomerSwitchPreference customerSwitchPreference, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Logger.d("SWITCH_ENABLE", "setOnPreferenceChangeListener " + obj);
        BloodPressureViewModel bloodPressureViewModel = this$0.mBloodPressureViewModel;
        if (bloodPressureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBloodPressureViewModel");
            bloodPressureViewModel = null;
        }
        tz2 measureRemindData = bloodPressureViewModel.getMPrefRepo().getMeasureRemindData(BloodPressurePreRepository.KEY_REMIND_DATA);
        if (measureRemindData != null) {
            this$0.updateToDevice(measureRemindData, Intrinsics.areEqual(obj, Boolean.TRUE));
        }
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(obj, bool)) {
            customerSwitchPreference.setSwitchButton(Boolean.FALSE);
            return true;
        }
        Context context = this$0.getContext();
        boolean zCanScheduleExactAlarms = context != null ? AlarmManagerExtKt.canScheduleExactAlarms(context) : false;
        Context context2 = this$0.getContext();
        boolean zPostNotificationPermissionGranted = context2 != null ? NotificationPermission.INSTANCE.postNotificationPermissionGranted(context2) : false;
        if (zCanScheduleExactAlarms && zPostNotificationPermissionGranted) {
            customerSwitchPreference.setSwitchButton(bool);
            return true;
        }
        customerSwitchPreference.setSwitchButton(Boolean.FALSE);
        this$0.checkPermission(zCanScheduleExactAlarms, zPostNotificationPermissionGranted);
        return false;
    }

    private final void updateToDevice(tz2 data, boolean enable) {
        List arrayList;
        int category = getCategory();
        int iD = data.d();
        int iB = data.b();
        if (data.c() != null) {
            int[] iArrC = data.c();
            Intrinsics.checkNotNullExpressionValue(iArrC, "getRemindTimes(...)");
            arrayList = ArraysKt___ArraysKt.toMutableList(iArrC);
        } else {
            arrayList = new ArrayList();
        }
        DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).setBloodPressureRemind(new DeviceBPRemind(enable, category, iD, iB, arrayList));
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        getPreferenceManager().n(BloodPressurePreRepository.PREFERENCE_NAME);
        setPreferencesFromResource(b6j.f3862a, rootKey);
        this.mBloodPressureViewModel = (BloodPressureViewModel) new ViewModelProvider(this).get(BloodPressureViewModel.class);
        this.mRemindDataMap = new LinkedHashMap();
        initNormal();
        initMid();
        initSevere();
        initCustom();
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        dealRemindTimeResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        saveConfigIfNeed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context == null || !AlarmManagerExtKt.canScheduleExactAlarms(context)) {
            CustomerSwitchPreference customerSwitchPreference = (CustomerSwitchPreference) findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
            if (customerSwitchPreference != null) {
                customerSwitchPreference.setChecked(false);
            }
            CustomerSwitchPreference customerSwitchPreference2 = (CustomerSwitchPreference) findPreference(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE);
            if (customerSwitchPreference2 != null) {
                customerSwitchPreference2.setSwitchButton(Boolean.FALSE);
            }
        }
        initRadioButtonPreferenceClick();
    }

    @Override // miuix.preference.PreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getListView().setItemAnimator(null);
    }
}
