package com.xiaomi.fitness.sport.view.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.baseui.SportNumberPicker;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.utils.RecursionDataModel;
import com.xiaomi.fitness.sport.utils.WearModeGuideExtKt;
import com.xiaomi.fitness.sport.view.goal.SportGoalSettingFragment;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import defpackage.c1j;
import defpackage.clb;
import defpackage.dvi;
import defpackage.ez5;
import defpackage.mpi;
import defpackage.xri;
import defpackage.zxi;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0014H\u0014J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0014J\u001a\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u0014H\u0002J\b\u00107\u001a\u00020!H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0004\n\u0002\u00103R\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u000e¢\u0006\u0004\n\u0002\u00103R\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0004\n\u0002\u00103R\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0004\n\u0002\u00103¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/SportGoalSettingFragment;", "Lcom/xiaomi/fitness/sport/view/goal/SportStartFragment;", "<init>", "()V", "goalValuePicker", "Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;", "getGoalValuePicker", "()Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;", "setGoalValuePicker", "(Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;)V", "target", "Landroid/widget/TextView;", "getTarget", "()Landroid/widget/TextView;", "setTarget", "(Landroid/widget/TextView;)V", "goalUnit", "getGoalUnit", "setGoalUnit", "wearMode", "", "getWearMode", "()I", "setWearMode", "(I)V", "launchSportModel", "Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "getLaunchSportModel", "()Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "launchSportModel$delegate", "Lkotlin/Lazy;", "setLayoutResourceId", LifecycleConstantKt.ON_RESUME, "", LifecycleConstantKt.ON_DESTROY, "initView", "view", "Landroid/view/View;", "startSport", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "forceSwitchToBandMode", "", "launchSportAndFinish", "initPicker", "initGoalView", "onSportGoalChange", "position", "distanceArray", "", "", "[Ljava/lang/String;", "goalDis", "bikingDistanceArray", "timeArray", "initGoalData", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportGoalSettingFragment extends SportStartFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "SportGoalSettingFragmen";

    @NotNull
    private final String[] distanceArray;

    @NotNull
    private String[] goalDis;
    public TextView goalUnit;
    public SportNumberPicker goalValuePicker;
    public TextView target;
    private int wearMode;

    /* JADX INFO: renamed from: launchSportModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy launchSportModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dnn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportGoalSettingFragment.launchSportModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final String[] bikingDistanceArray = {"1.0", "3.0", "5.0", "10.0", "15.0", "20.0", "30.0", "40.0", "50.0", "100.0"};

    @NotNull
    private final String[] timeArray = {"00:10:00", "00:20:00", "00:30:00", "00:40:00", "00:50:00", "01:00:00", "01:30:00", "02:00:00", "02:30:00", "03:00:00", "03:30:00", "04:00:00", "04:30:00", "05:00:00", "05:30:00", "06:00:00", "06:30:00", "07:00:00", "07:30:00", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00"};

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/SportGoalSettingFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/sport/view/goal/SportGoalSettingFragment;", DailyRecordKey.sportType, "", "goalType", "deviceType", "wearMode", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportGoalSettingFragment newInstance(int sportType, int goalType, int deviceType, int wearMode) {
            SportGoalSettingFragment sportGoalSettingFragment = new SportGoalSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("GOAL_TYPE", goalType);
            bundle.putInt("KEY_SPORT_TYPE", sportType);
            bundle.putInt("DEVICE_TYPE", deviceType);
            bundle.putInt("WEAR_MODE", wearMode);
            sportGoalSettingFragment.setArguments(bundle);
            return sportGoalSettingFragment;
        }
    }

    public SportGoalSettingFragment() {
        String[] strArr = {"1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0", "10.0", "15.0", "21.1", "42.2"};
        this.distanceArray = strArr;
        this.goalDis = strArr;
    }

    private final void initGoalData() {
        int i = this.sportGoal;
        if (i == 0) {
            this.goalDis = this.sportType == 6 ? this.bikingDistanceArray : this.distanceArray;
            getGoalValuePicker().setMinValue(0);
            getGoalValuePicker().setMaxValue(this.goalDis.length - 1);
            getGoalValuePicker().setDisplayedValues(this.goalDis);
            this.sportGoalValue = Float.parseFloat(this.goalDis[0]);
            getTarget().setText(this.goalDis[0]);
            return;
        }
        if (i == 1) {
            getGoalValuePicker().setMinValue(0);
            getGoalValuePicker().setMaxValue(this.timeArray.length - 1);
            getGoalValuePicker().setDisplayedValues(this.timeArray);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.timeArray[0], new String[]{":"}, false, 0, 6, (Object) null);
            this.sportGoalValue = (Integer.parseInt((String) listSplit$default.get(0)) * 60) + Integer.parseInt((String) listSplit$default.get(1));
            getTarget().setText(this.timeArray[0]);
            return;
        }
        if (i != 2) {
            return;
        }
        getGoalValuePicker().setMinValue(50);
        getGoalValuePicker().setMaxValue(1000);
        getGoalValuePicker().setIncreaseValue(50);
        getGoalValuePicker().setValue(50);
        this.sportGoalValue = 50.0f;
        getTarget().setText(String.valueOf(getGoalValuePicker().getValue()));
    }

    private final void initGoalView() {
        String str;
        int i = this.sportGoal;
        if (i != 0) {
            str = "";
            if (i != 1 && i == 2) {
                CharSequence quantityText = getResources().getQuantityText(zxi.common_unit_calorie, (int) this.sportGoalValue);
                Intrinsics.checkNotNull(quantityText, "null cannot be cast to non-null type kotlin.String");
                str = (String) quantityText;
            }
        } else {
            CharSequence quantityText2 = getResources().getQuantityText(zxi.common_unit_kilometer, (int) this.sportGoalValue);
            Intrinsics.checkNotNull(quantityText2, "null cannot be cast to non-null type kotlin.String");
            str = (String) quantityText2;
        }
        getGoalUnit().setText(str);
    }

    private final void initPicker() {
        getGoalValuePicker().D(ez5.a(44), ez5.a(30), 0);
        getGoalValuePicker().setTextStyle(DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), mpi.c));
        getGoalValuePicker().setDistanceOffset(320);
        getGoalValuePicker().setOnValueChangedListener(new SportNumberPicker.h() { // from class: nnn
            @Override // com.xiaomi.fitness.sport.baseui.SportNumberPicker.h
            public final void a(SportNumberPicker sportNumberPicker, int i, int i2) {
                SportGoalSettingFragment.initPicker$lambda$7(this.f28096a, sportNumberPicker, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPicker$lambda$7(SportGoalSettingFragment this$0, SportNumberPicker sportNumberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSportGoalChange(this$0.getGoalValuePicker().getValue());
        clb.a(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(final SportGoalSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", this$0.sportType);
        bundle.putFloat("GOAL_VALUE", this$0.sportGoalValue);
        bundle.putInt("GOAL_TYPE", this$0.sportGoal);
        bundle.putInt("DEVICE_TYPE", this$0.deviceType);
        bundle.putInt("WEAR_MODE", this$0.wearMode);
        FitnessLogUtils.d(TAG, "sportType : " + this$0.sportType + " , sportGoal : " + this$0.sportGoal + " , sportGoalValue : " + this$0.sportGoalValue);
        int i = this$0.wearMode;
        int i2 = this$0.sportType;
        Function0 function0 = new Function0() { // from class: jnn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportGoalSettingFragment.initView$lambda$3$lambda$2(this.f22953a, bundle);
            }
        };
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        WearModeGuideExtKt.performOperationAndChooseNextOperationType(new RecursionDataModel(i, 0, null, i2, function0, fragmentActivityRequireActivity, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$2(SportGoalSettingFragment this$0, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        startSport$default(this$0, bundle, false, 2, null);
        return Unit.INSTANCE;
    }

    private final void launchSportAndFinish(Bundle bundle) {
        LaunchSportModel launchSportModel = getLaunchSportModel();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LaunchSportModel.launchSport$default(launchSportModel, activity, bundle, null, new Function0() { // from class: hnn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportGoalSettingFragment.launchSportAndFinish$lambda$6(this.f20267a);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSportAndFinish$lambda$6(SportGoalSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LaunchSportModel launchSportModel_delegate$lambda$0() {
        return new LaunchSportModel();
    }

    private final void onSportGoalChange(int position) {
        String strValueOf;
        if (getGoalValuePicker().getDisplayedValues() == null) {
            this.sportGoalValue = position;
            strValueOf = String.valueOf(position);
        } else {
            int i = this.sportGoal;
            if (i == 0) {
                this.sportGoalValue = Float.parseFloat(this.goalDis[position]);
                strValueOf = this.goalDis[position];
            } else if (i != 1) {
                strValueOf = "";
            } else {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.timeArray[position], new String[]{":"}, false, 0, 6, (Object) null);
                this.sportGoalValue = (Integer.parseInt((String) listSplit$default.get(0)) * 60) + Integer.parseInt((String) listSplit$default.get(1));
                strValueOf = this.timeArray[position];
            }
        }
        getTarget().setText(strValueOf);
    }

    private final void startSport(final Bundle bundle, boolean forceSwitchToBandMode) {
        FragmentActivity activity;
        int i = this.deviceType;
        if (i != 0) {
            if (i != 1 || (activity = getActivity()) == null) {
                return;
            }
            LaunchExtensionKt.startActivity(activity, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: rnn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportGoalSettingFragment.startSport$lambda$5(bundle, (Intent) obj);
                }
            });
            return;
        }
        if (!forceSwitchToBandMode) {
            launchSportAndFinish(bundle);
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            DeviceModelExtKt.setDeviceWearMode(wearableDeviceModel, 0, new Function1() { // from class: pnn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportGoalSettingFragment.startSport$lambda$4(this.f30565a, bundle, ((Integer) obj).intValue());
                }
            });
        }
    }

    public static /* synthetic */ void startSport$default(SportGoalSettingFragment sportGoalSettingFragment, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        sportGoalSettingFragment.startSport(bundle, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSport$lambda$4(SportGoalSettingFragment this$0, Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (i == 0) {
            this$0.launchSportAndFinish(bundle);
        } else {
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ToastExtKt.toastShort(fragmentActivityRequireActivity, c1j.p2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSport$lambda$5(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    @NotNull
    public final TextView getGoalUnit() {
        TextView textView = this.goalUnit;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goalUnit");
        return null;
    }

    @NotNull
    public final SportNumberPicker getGoalValuePicker() {
        SportNumberPicker sportNumberPicker = this.goalValuePicker;
        if (sportNumberPicker != null) {
            return sportNumberPicker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goalValuePicker");
        return null;
    }

    @NotNull
    public final LaunchSportModel getLaunchSportModel() {
        return (LaunchSportModel) this.launchSportModel.getValue();
    }

    @NotNull
    public final TextView getTarget() {
        TextView textView = this.target;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("target");
        return null;
    }

    public final int getWearMode() {
        return this.wearMode;
    }

    @Override // com.xiaomi.fitness.sport.view.goal.SportStartFragment, com.xiaomi.fitness.sport.baseui.SportGoalBaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setGoalValuePicker((SportNumberPicker) view.findViewById(xri.U1));
        setTarget((TextView) view.findViewById(xri.d7));
        setGoalUnit((TextView) view.findViewById(xri.goal_unit));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.sportGoal = arguments.getInt("GOAL_TYPE", 0);
            this.sportType = arguments.getInt("KEY_SPORT_TYPE", 1);
            this.deviceType = arguments.getInt("DEVICE_TYPE", 0);
            this.wearMode = arguments.getInt("WEAR_MODE", 0);
        }
        initGoalView();
        initPicker();
        initGoalData();
        ((TextView) view.findViewById(xri.N6)).setOnClickListener(new View.OnClickListener() { // from class: lnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportGoalSettingFragment.initView$lambda$3(this.f25249a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getLaunchSportModel().stopRefreshGpsStatus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLaunchSportModel().refreshGpsStatus();
    }

    public final void setGoalUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.goalUnit = textView;
    }

    public final void setGoalValuePicker(@NotNull SportNumberPicker sportNumberPicker) {
        Intrinsics.checkNotNullParameter(sportNumberPicker, "<set-?>");
        this.goalValuePicker = sportNumberPicker;
    }

    @Override // com.xiaomi.fitness.sport.view.goal.SportStartFragment, com.xiaomi.fitness.sport.baseui.SportGoalBaseFragment
    public int setLayoutResourceId() {
        return dvi.f15972r;
    }

    public final void setTarget(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.target = textView;
    }

    public final void setWearMode(int i) {
        this.wearMode = i;
    }
}
