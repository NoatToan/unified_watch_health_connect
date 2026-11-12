package com.xiaomi.fitness.health.todayhealth.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
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
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckMeasureReminderSettingData;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckMeasureReminderSettingFragment;
import defpackage.b6j;
import defpackage.c0j;
import defpackage.o5g;
import defpackage.yaa;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b0\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J'\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\u0005R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSettingFragment;", "Lmiuix/preference/PreferenceFragment;", "Lyaa;", "", "initSwitchPreference", "()V", "", "exactAlarms", "postPermissionGranted", "checkPermission", "(ZZ)V", "requestAlarmPermission", "initMeasureReminder", "addAnimatorIfNeed", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/os/Bundle;", "data", "dealRemindTimeResult", "(IILandroid/os/Bundle;)V", "checkCustomResult", "saveConfigIfNeed", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "rootKey", "onCreatePreferences", "(Landroid/os/Bundle;Ljava/lang/String;)V", "onFragmentResult", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "mHealthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "mRemindData", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "Lcom/xiaomi/fitness/health/todayhealth/ui/setting/MeasureReminderPreferenceHolder;", "mMeasureReminderPreferenceHolder", "Lcom/xiaomi/fitness/health/todayhealth/ui/setting/MeasureReminderPreferenceHolder;", "Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSwitchPreferenceCompat;", "switch", "Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSwitchPreferenceCompat;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthCheckMeasureReminderSettingFragment extends Hilt_HealthCheckMeasureReminderSettingFragment implements yaa {

    @NotNull
    private static final String TAG = "HealthCheckMeasureReminderConfigFragment";
    private HealthCheckViewModel mHealthCheckViewModel;
    private MeasureReminderPreferenceHolder mMeasureReminderPreferenceHolder;

    @Nullable
    private HealthCheckMeasureReminderSettingData mRemindData;

    @Nullable
    private HealthCheckMeasureReminderSwitchPreferenceCompat switch;

    private final void addAnimatorIfNeed() {
        RecyclerView listView = getListView();
        if (listView == null || listView.getItemAnimator() != null) {
            return;
        }
        listView.setItemAnimator(new o5g());
    }

    private final void checkCustomResult(int requestCode, int resultCode, Bundle data) {
        MeasureReminderPreferenceHolder measureReminderPreferenceHolder = this.mMeasureReminderPreferenceHolder;
        MeasureReminderPreferenceHolder measureReminderPreferenceHolder2 = null;
        if (measureReminderPreferenceHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeasureReminderPreferenceHolder");
            measureReminderPreferenceHolder = null;
        }
        int[] reqCodeRange = measureReminderPreferenceHolder.getReqCodeRange();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(reqCodeRange)) || requestCode < reqCodeRange[0] || requestCode > reqCodeRange[1] || resultCode != -1) {
            return;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i == -1 || i2 == -1) {
            return;
        }
        int minutes = (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2));
        MeasureReminderPreferenceHolder measureReminderPreferenceHolder3 = this.mMeasureReminderPreferenceHolder;
        if (measureReminderPreferenceHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeasureReminderPreferenceHolder");
        } else {
            measureReminderPreferenceHolder2 = measureReminderPreferenceHolder3;
        }
        measureReminderPreferenceHolder2.updateRemindTimeResult(requestCode, minutes);
    }

    private final void checkPermission(boolean exactAlarms, boolean postPermissionGranted) {
        final Function0 function0 = new Function0() { // from class: uob
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthCheckMeasureReminderSettingFragment.checkPermission$lambda$4(this.f35966a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity activity = getActivity();
        String string = getString(c0j.T4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, activity, string, 1, false, new Function1() { // from class: vob
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCheckMeasureReminderSettingFragment.checkPermission$lambda$5(function0, this, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$4(final HealthCheckMeasureReminderSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String string = this$0.getString(c0j.T4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationPermission.requestPostNotificationPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, string, false, new Function1() { // from class: zob
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCheckMeasureReminderSettingFragment.checkPermission$lambda$4$lambda$3(this.f41518a, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$4$lambda$3(HealthCheckMeasureReminderSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        } else {
            HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat = this$0.switch;
            if (healthCheckMeasureReminderSwitchPreferenceCompat != null) {
                healthCheckMeasureReminderSwitchPreferenceCompat.setChecked(false);
            }
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, "android.permission.POST_NOTIFICATIONS", fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: bpb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HealthCheckMeasureReminderSettingFragment.checkPermission$lambda$4$lambda$3$lambda$2();
                }
            }, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$4$lambda$3$lambda$2() {
        NotificationPermission.INSTANCE.goNotifySettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$5(Function0 requestPermission, HealthCheckMeasureReminderSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            requestPermission.invoke();
        } else {
            HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat = this$0.switch;
            if (healthCheckMeasureReminderSwitchPreferenceCompat != null) {
                healthCheckMeasureReminderSwitchPreferenceCompat.setChecked(false);
            }
        }
        return Unit.INSTANCE;
    }

    private final void dealRemindTimeResult(int requestCode, int resultCode, Bundle data) {
        checkCustomResult(requestCode, resultCode, data);
    }

    private final void initMeasureReminder() {
        this.mMeasureReminderPreferenceHolder = new MeasureReminderPreferenceHolder(this);
        HealthCheckViewModel healthCheckViewModel = this.mHealthCheckViewModel;
        if (healthCheckViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHealthCheckViewModel");
            healthCheckViewModel = null;
        }
        healthCheckViewModel.getMeasureRemindDataLiveData().observe(this, new HealthCheckMeasureReminderSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yob
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCheckMeasureReminderSettingFragment.initMeasureReminder$lambda$7(this.f40369a, (HealthCheckMeasureReminderSettingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMeasureReminder$lambda$7(HealthCheckMeasureReminderSettingFragment this$0, HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (healthCheckMeasureReminderSettingData != null) {
            MeasureReminderPreferenceHolder measureReminderPreferenceHolder = this$0.mMeasureReminderPreferenceHolder;
            if (measureReminderPreferenceHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureReminderPreferenceHolder");
                measureReminderPreferenceHolder = null;
            }
            measureReminderPreferenceHolder.updateData(healthCheckMeasureReminderSettingData);
            this$0.mRemindData = healthCheckMeasureReminderSettingData;
        }
        return Unit.INSTANCE;
    }

    private final void initSwitchPreference() {
        HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat = (HealthCheckMeasureReminderSwitchPreferenceCompat) findPreference("reminder_enable");
        this.switch = healthCheckMeasureReminderSwitchPreferenceCompat;
        if (healthCheckMeasureReminderSwitchPreferenceCompat != null) {
            healthCheckMeasureReminderSwitchPreferenceCompat.setSummaryOff(getString(c0j.U4));
        }
        HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat2 = this.switch;
        if (healthCheckMeasureReminderSwitchPreferenceCompat2 != null) {
            healthCheckMeasureReminderSwitchPreferenceCompat2.setSummaryOn(getString(c0j.U4));
        }
        HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat3 = this.switch;
        if (healthCheckMeasureReminderSwitchPreferenceCompat3 != null) {
            healthCheckMeasureReminderSwitchPreferenceCompat3.setOnPreferenceChangeListener(new Preference.c() { // from class: wob
                @Override // androidx.preference.Preference.c
                public final boolean a(Preference preference, Object obj) {
                    return HealthCheckMeasureReminderSettingFragment.initSwitchPreference$lambda$0(this.f38193a, preference, obj);
                }
            });
        }
        Preference.d dVar = new Preference.d() { // from class: xob
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return HealthCheckMeasureReminderSettingFragment.initSwitchPreference$lambda$1(this.f39311a, preference);
            }
        };
        HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat4 = this.switch;
        if (healthCheckMeasureReminderSwitchPreferenceCompat4 != null) {
            healthCheckMeasureReminderSwitchPreferenceCompat4.setOnPreferenceClickListener(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initSwitchPreference$lambda$0(HealthCheckMeasureReminderSettingFragment this$0, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Logger.d("SWITCH_ENABLE", "setOnPreferenceChangeListener " + obj);
        if (!Intrinsics.areEqual(obj, Boolean.TRUE)) {
            return true;
        }
        Context context = this$0.getContext();
        boolean zCanScheduleExactAlarms = context != null ? AlarmManagerExtKt.canScheduleExactAlarms(context) : false;
        Context context2 = this$0.getContext();
        boolean zPostNotificationPermissionGranted = context2 != null ? NotificationPermission.INSTANCE.postNotificationPermissionGranted(context2) : false;
        if (zCanScheduleExactAlarms && zPostNotificationPermissionGranted) {
            return true;
        }
        this$0.checkPermission(zCanScheduleExactAlarms, zPostNotificationPermissionGranted);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initSwitchPreference$lambda$1(HealthCheckMeasureReminderSettingFragment this$0, Preference preference) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.addAnimatorIfNeed();
        return true;
    }

    private final void requestAlarmPermission() {
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NotificationPermission.requestAlarmPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, c0j.W4, false, new Function1() { // from class: apb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCheckMeasureReminderSettingFragment.requestAlarmPermission$lambda$6(this.f3325a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAlarmPermission$lambda$6(HealthCheckMeasureReminderSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchPreference switchPreference = (SwitchPreference) this$0.findPreference("reminder_enable");
        if (switchPreference != null) {
            switchPreference.setChecked(z);
        }
        return Unit.INSTANCE;
    }

    private final void saveConfigIfNeed() {
        MeasureReminderPreferenceHolder measureReminderPreferenceHolder = this.mMeasureReminderPreferenceHolder;
        HealthCheckViewModel healthCheckViewModel = null;
        if (measureReminderPreferenceHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeasureReminderPreferenceHolder");
            measureReminderPreferenceHolder = null;
        }
        if (Intrinsics.areEqual(measureReminderPreferenceHolder.getData(), this.mRemindData)) {
            return;
        }
        MeasureReminderPreferenceHolder measureReminderPreferenceHolder2 = this.mMeasureReminderPreferenceHolder;
        if (measureReminderPreferenceHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeasureReminderPreferenceHolder");
            measureReminderPreferenceHolder2 = null;
        }
        this.mRemindData = measureReminderPreferenceHolder2.getData();
        HealthCheckViewModel healthCheckViewModel2 = this.mHealthCheckViewModel;
        if (healthCheckViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHealthCheckViewModel");
        } else {
            healthCheckViewModel = healthCheckViewModel2;
        }
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.mRemindData;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        healthCheckViewModel.updateMeasureRemindData(healthCheckMeasureReminderSettingData);
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        getPreferenceManager().n(HealthCheckSettingConfig.PREFERENCE_NAME);
        setPreferencesFromResource(b6j.f3863b, rootKey);
        this.mHealthCheckViewModel = (HealthCheckViewModel) new ViewModelProvider(this).get(HealthCheckViewModel.class);
        initSwitchPreference();
        initMeasureReminder();
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
            HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat = this.switch;
            if (healthCheckMeasureReminderSwitchPreferenceCompat != null) {
                healthCheckMeasureReminderSwitchPreferenceCompat.setChecked(false);
            }
            HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat2 = this.switch;
            if (healthCheckMeasureReminderSwitchPreferenceCompat2 != null) {
                healthCheckMeasureReminderSwitchPreferenceCompat2.setSwitchButton(Boolean.FALSE);
            }
        }
    }

    @Override // miuix.preference.PreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        saveConfigIfNeed();
    }

    @Override // miuix.preference.PreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getListView().setItemAnimator(null);
    }
}
