package com.xiaomi.fitness.sport_eco.view.goal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mi.health.course.ext.CourseExtKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker;
import com.xiaomi.fitness.sport_eco.view.goal.SportGoalSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.av6;
import defpackage.ayi;
import defpackage.clb;
import defpackage.dih;
import defpackage.e1j;
import defpackage.ez5;
import defpackage.fvi;
import defpackage.npi;
import defpackage.zri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u0000 J2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u0017H\u0014J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0017H\u0002J\u001b\u0010;\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020/2\u0006\u0010<\u001a\u00020\u0017H\u0002J\u0010\u0010?\u001a\u00020/2\u0006\u0010<\u001a\u00020\u0017H\u0002J\u0010\u0010@\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0017H\u0002J\u0010\u0010A\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0017H\u0002J\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010=J\u001b\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170.2\u0006\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010DJ\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170.2\u0006\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010DJ\b\u0010I\u001a\u00020\u001fH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u000e¢\u0006\u0004\n\u0002\u00100R\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0004\n\u0002\u00100R\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00170.X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170.X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170.X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u000e¢\u0006\u0004\n\u0002\u00100R\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00170.X\u0082\u000e¢\u0006\u0004\n\u0002\u00108R\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00170.X\u0082\u000e¢\u0006\u0004\n\u0002\u00108¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/goal/SportGoalSettingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/goal/SportStartFragment;", "<init>", "()V", "goalValuePicker", "Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "getGoalValuePicker", "()Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "setGoalValuePicker", "(Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;)V", "target", "Landroid/widget/TextView;", "getTarget", "()Landroid/widget/TextView;", "setTarget", "(Landroid/widget/TextView;)V", "goalUnit", "getGoalUnit", "setGoalUnit", "customBtn", "getCustomBtn", "setCustomBtn", "curBlueToothState", "", "getCurBlueToothState", "()I", "setCurBlueToothState", "(I)V", "bluetoothMonitorReceiver", "Landroid/content/BroadcastReceiver;", "registerReceivers", "", "unregisterReceiver", "onDestroyView", "setLayoutResourceId", "initView", "view", "Landroid/view/View;", "showConnectDialog", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "initPicker", "initGoalView", "onSportGoalChange", "position", "distanceArray", "", "", "[Ljava/lang/String;", "goalDis", "bikingDistanceArray", "bikingDistanceArrayForExBike", "timeArray", "timeArrayForExBike", "timeArrayForRope", "calories", "[Ljava/lang/Integer;", "caloriesForExBike", "numbersForRope", "getGoalDis", DailyRecordKey.sportType, "(I)[Ljava/lang/String;", "getDefaultTime", "getDefaultDistance", "getDefaultDistanceValue", "getDefaultTimeValue", "getGoalTimes", "getGoalCalories", "(I)[Ljava/lang/Integer;", "getGoalNumbers", "goalTimes", "goalCalories", "goalNumbers", "initGoalData", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportGoalSettingFragment extends SportStartFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "SportGoalSettingFragmen";

    @NotNull
    private final Integer[] calories;
    public TextView customBtn;

    @NotNull
    private final String[] distanceArray;

    @NotNull
    private Integer[] goalCalories;

    @NotNull
    private String[] goalDis;

    @NotNull
    private Integer[] goalNumbers;

    @NotNull
    private String[] goalTimes;
    public TextView goalUnit;
    public SportNumberPicker goalValuePicker;

    @NotNull
    private final Integer[] numbersForRope;
    public TextView target;

    @NotNull
    private final String[] timeArray;
    private int curBlueToothState = 12;

    @NotNull
    private final BroadcastReceiver bluetoothMonitorReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.sport_eco.view.goal.SportGoalSettingFragment$bluetoothMonitorReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                Logger.d("SportGoalWrapperFragment", "state = " + intExtra);
                this.this$0.setCurBlueToothState(intExtra);
            }
        }
    };

    @NotNull
    private final String[] bikingDistanceArray = {"1.0", "3.0", "5.0", "10.0", "15.0", "20.0", "30.0", "40.0", "50.0", "100.0"};

    @NotNull
    private final String[] bikingDistanceArrayForExBike = {"1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0", "10.0", "15.0", "20.0", "25.0", "30.0"};

    @NotNull
    private final String[] timeArrayForExBike = {"00:10:00", "00:20:00", "00:30:00", "00:40:00", "00:50:00", "01:00:00"};

    @NotNull
    private final String[] timeArrayForRope = {"00:01:00", "00:02:00", "00:03:00", "00:04:00", "00:05:00", "00:06:00", "00:07:00", "00:08:00", "00:09:00", "00:10:00", "00:11:00", "00:12:00", "00:13:00", "00:14:00", "00:15:00", "00:16:00", "00:17:00", "00:18:00", "00:19:00", "00:20:00", "00:21:00", "00:22:00", "00:23:00", "00:24:00", "00:25:00", "00:26:00", "00:27:00", "00:28:00", "00:29:00", "00:30:00", "00:31:00", "00:32:00", "00:33:00", "00:34:00", "00:35:00", "00:36:00", "00:37:00", "00:38:00", "00:39:00", "00:40:00", "00:41:00", "00:42:00", "00:43:00", "00:44:00", "00:45:00", "00:46:00", "00:47:00", "00:48:00", "00:49:00", "00:50:00", "00:51:00", "00:52:00", "00:53:00", "00:54:00", "00:55:00", "00:56:00", "00:57:00", "00:58:00", "00:59:00", "00:60:00"};

    @NotNull
    private final Integer[] caloriesForExBike = {50, 500, 50, 150, 150};

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/goal/SportGoalSettingFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/sport_eco/view/goal/SportGoalSettingFragment;", DailyRecordKey.sportType, "", "goalType", "deviceType", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportGoalSettingFragment newInstance(int sportType, int goalType, int deviceType) {
            SportGoalSettingFragment sportGoalSettingFragment = new SportGoalSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("GOAL_TYPE", goalType);
            bundle.putInt("KEY_SPORT_TYPE", sportType);
            bundle.putInt("DEVICE_TYPE", deviceType);
            sportGoalSettingFragment.setArguments(bundle);
            return sportGoalSettingFragment;
        }
    }

    public SportGoalSettingFragment() {
        String[] strArr = {"1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0", "10.0", "15.0", "21.1", "42.2"};
        this.distanceArray = strArr;
        this.goalDis = strArr;
        String[] strArr2 = {"00:10:00", "00:20:00", "00:30:00", "00:40:00", "00:50:00", "01:00:00", "01:30:00", "02:00:00", "02:30:00", "03:00:00", "03:30:00", "04:00:00", "04:30:00", "05:00:00", "05:30:00", "06:00:00", "06:30:00", "07:00:00", "07:30:00", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00"};
        this.timeArray = strArr2;
        Integer[] numArr = {50, 1000, 50, 50, 50};
        this.calories = numArr;
        Integer[] numArr2 = {100, 2000, 100, 100, 100};
        this.numbersForRope = numArr2;
        this.goalTimes = strArr2;
        this.goalCalories = numArr;
        this.goalNumbers = numArr2;
    }

    private final String getDefaultDistance(int sportType) {
        return sportType == 7 ? this.goalDis[2] : this.goalDis[0];
    }

    private final int getDefaultDistanceValue(int sportType) {
        return sportType == 7 ? 2 : 0;
    }

    private final String getDefaultTime(int sportType) {
        return sportType == 7 ? this.goalTimes[2] : this.goalTimes[0];
    }

    private final int getDefaultTimeValue(int sportType) {
        return sportType == 7 ? 2 : 0;
    }

    private final Integer[] getGoalCalories(int sportType) {
        return sportType == 7 ? this.caloriesForExBike : this.calories;
    }

    private final String[] getGoalDis(int sportType) {
        if (sportType != 6) {
            return sportType != 7 ? this.distanceArray : this.bikingDistanceArrayForExBike;
        }
        return this.bikingDistanceArray;
    }

    private final Integer[] getGoalNumbers(int sportType) {
        return sportType == 14 ? this.numbersForRope : this.numbersForRope;
    }

    private final String[] getGoalTimes(int sportType) {
        if (sportType != 7) {
            return sportType != 14 ? this.timeArray : this.timeArrayForRope;
        }
        return this.timeArrayForExBike;
    }

    private final void initGoalData() {
        int i = this.sportGoal;
        if (i == 0) {
            this.goalDis = getGoalDis(this.sportType);
            getGoalValuePicker().setMinValue(0);
            getGoalValuePicker().setMaxValue(this.goalDis.length - 1);
            getGoalValuePicker().setDisplayedValues(this.goalDis);
            getGoalValuePicker().setValue(getDefaultDistanceValue(this.sportType));
            this.sportGoalValue = Float.parseFloat(getDefaultDistance(this.sportType));
            getTarget().setText(getDefaultDistance(this.sportType));
            getCustomBtn().setVisibility(8);
            return;
        }
        if (i == 1) {
            this.goalTimes = getGoalTimes(this.sportType);
            getGoalValuePicker().setMinValue(0);
            getGoalValuePicker().setMaxValue(this.goalTimes.length - 1);
            getGoalValuePicker().setDisplayedValues(this.goalTimes);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) getDefaultTime(this.sportType), new String[]{":"}, false, 0, 6, (Object) null);
            getGoalValuePicker().setValue(getDefaultTimeValue(this.sportType));
            this.sportGoalValue = (Integer.parseInt((String) listSplit$default.get(0)) * 60) + Integer.parseInt((String) listSplit$default.get(1));
            getTarget().setText(getDefaultTime(this.sportType));
            getCustomBtn().setVisibility(8);
            return;
        }
        if (i == 2) {
            this.goalCalories = getGoalCalories(this.sportType);
            getGoalValuePicker().setMinValue(this.goalCalories[0].intValue());
            getGoalValuePicker().setMaxValue(this.goalCalories[1].intValue());
            getGoalValuePicker().setIncreaseValue(this.goalCalories[2].intValue());
            getGoalValuePicker().setValue(this.goalCalories[3].intValue());
            this.sportGoalValue = this.goalCalories[4].intValue();
            getTarget().setText(String.valueOf(this.goalCalories[4].intValue()));
            getCustomBtn().setVisibility(8);
            return;
        }
        if (i != 6) {
            return;
        }
        this.goalNumbers = getGoalNumbers(this.sportType);
        getGoalValuePicker().setMinValue(this.goalNumbers[0].intValue());
        getGoalValuePicker().setMaxValue(this.goalNumbers[1].intValue());
        getGoalValuePicker().setIncreaseValue(this.goalNumbers[2].intValue());
        getGoalValuePicker().setValue(this.goalNumbers[3].intValue());
        this.sportGoalValue = this.goalNumbers[4].intValue();
        getTarget().setText(String.valueOf(getGoalValuePicker().getValue()));
        if (this.sportType != 14 || this.deviceType != 1) {
            getCustomBtn().setVisibility(8);
        } else {
            getCustomBtn().setVisibility(0);
            getCustomBtn().setOnClickListener(new View.OnClickListener() { // from class: gnn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportGoalSettingFragment.initGoalData$lambda$12(this.f19165a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGoalData$lambda$12(SportGoalSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("DEVICE_TYPE", this$0.deviceType);
        bundle.putInt("KEY_SPORT_TYPE", this$0.sportType);
        bundle.putInt("GOAL_TYPE", this$0.sportGoal);
        dih.a().e(this$0.getActivity(), new FragmentParams.b().e(JumpCustomGoalSettingFragment.class).c(bundle).b());
    }

    private final void initGoalView() {
        String str;
        int i = this.sportGoal;
        if (i != 0) {
            str = "";
            if (i != 1) {
                if (i == 2) {
                    CharSequence quantityText = getResources().getQuantityText(ayi.common_unit_calorie, (int) this.sportGoalValue);
                    Intrinsics.checkNotNull(quantityText, "null cannot be cast to non-null type kotlin.String");
                    str = (String) quantityText;
                } else if (i == 6) {
                    CharSequence quantityText2 = getResources().getQuantityText(ayi.common_unit_rope_count, (int) this.sportGoalValue);
                    Intrinsics.checkNotNull(quantityText2, "null cannot be cast to non-null type kotlin.String");
                    str = (String) quantityText2;
                }
            }
        } else {
            CharSequence quantityText3 = getResources().getQuantityText(ayi.common_unit_kilometer, (int) this.sportGoalValue);
            Intrinsics.checkNotNull(quantityText3, "null cannot be cast to non-null type kotlin.String");
            str = (String) quantityText3;
        }
        getGoalUnit().setText(str);
    }

    private final void initPicker() {
        getGoalValuePicker().I(ez5.a(44), ez5.a(30), 0);
        getGoalValuePicker().setTextStyle(DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), npi.f28232b));
        getGoalValuePicker().setDistanceOffset(320);
        getGoalValuePicker().setOnValueChangedListener(new SportNumberPicker.i() { // from class: cnn
            @Override // com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker.i
            public final void a(SportNumberPicker sportNumberPicker, int i, int i2) {
                SportGoalSettingFragment.initPicker$lambda$11(this.f5582a, sportNumberPicker, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPicker$lambda$11(SportGoalSettingFragment this$0, SportNumberPicker sportNumberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSportGoalChange(this$0.getGoalValuePicker().getValue());
        clb.a(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(String localSportType, final SportGoalSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(localSportType);
        boolean z = false;
        if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected()) {
            z = true;
        }
        final Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", this$0.sportType);
        bundle.putFloat("GOAL_VALUE", this$0.sportGoalValue);
        bundle.putInt("GOAL_TYPE", this$0.sportGoal);
        bundle.putInt("DEVICE_TYPE", this$0.deviceType);
        FitnessLogUtils.d(TAG, "deviceType : " + this$0.deviceType + " , sportType : " + this$0.sportType + " , sportGoal : " + this$0.sportGoal + " , sportGoalValue : " + this$0.sportGoalValue);
        int i = this$0.deviceType;
        if (i == 0) {
            LaunchSportModel launchSportModel = new LaunchSportModel();
            FragmentActivity activity = this$0.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LaunchSportModel.launchSport$default(launchSportModel, activity, bundle, null, new Function0() { // from class: inn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportGoalSettingFragment.initView$lambda$10$lambda$1(this.f21324a);
                }
            }, 4, null);
            return;
        }
        if (i == 1) {
            if (!z || this$0.curBlueToothState != 12) {
                ToastUtil.INSTANCE.showToast(e1j.y0);
                return;
            }
            int i2 = this$0.sportType;
            if (i2 == 3) {
                FragmentActivity activity2 = this$0.getActivity();
                if (activity2 != null) {
                    LaunchExtensionKt.startActivity(activity2, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: knn
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SportGoalSettingFragment.initView$lambda$10$lambda$2(bundle, (Intent) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (i2 == 7) {
                FragmentActivity activity3 = this$0.getActivity();
                if (activity3 != null) {
                    LaunchExtensionKt.startActivity(activity3, (Class<?>) IndoorRidingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: mnn
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SportGoalSettingFragment.initView$lambda$10$lambda$3(bundle, (Intent) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (i2 != 14) {
                FragmentActivity activity4 = this$0.getActivity();
                if (activity4 != null) {
                    LaunchExtensionKt.startActivity(activity4, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: qnn
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SportGoalSettingFragment.initView$lambda$10$lambda$9(bundle, (Intent) obj);
                        }
                    });
                    return;
                }
                return;
            }
            String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
            EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(key_gym_local_sport_type);
            if (localDeviceModel2 != null && localDeviceModel2.getIsDeviceConnected()) {
                GymDeviceModel.INSTANCE.getBattery(key_gym_local_sport_type, new Function1() { // from class: onn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportGoalSettingFragment.initView$lambda$10$lambda$8(this.f29322a, bundle, ((Integer) obj).intValue());
                    }
                });
                return;
            }
            Product properProduct = CourseExtKt.getProperProduct(key_gym_local_sport_type);
            Logger.i(TAG, "product:" + properProduct);
            if (properProduct == null) {
                ToastUtil.showShortToast(e1j.common_hint_unkonwn_error);
            } else {
                this$0.showConnectDialog(properProduct);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$1(SportGoalSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$2(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$3(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$8(final SportGoalSettingFragment this$0, final Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (i == 0 || i == 1) {
            GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
            FragmentActivity activity = this$0.getActivity();
            int i2 = e1j.C3;
            String string = this$0.getString(e1j.E3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gymDeviceModel.showLowRemindDialog(activity, i2, string, new Function0() { // from class: tnn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else if (i != 2) {
            bundle.putInt(SportConstants.TRAINING_MODE, 1);
            FragmentActivity activity2 = this$0.getActivity();
            if (activity2 != null) {
                LaunchExtensionKt.startActivity(activity2, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: enn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportGoalSettingFragment.initView$lambda$10$lambda$8$lambda$7(bundle, (Intent) obj);
                    }
                });
            }
        } else {
            GymDeviceModel gymDeviceModel2 = GymDeviceModel.INSTANCE;
            FragmentActivity activity3 = this$0.getActivity();
            int i3 = e1j.C3;
            String string2 = this$0.getString(e1j.D3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            gymDeviceModel2.showLowRemindDialog(activity3, i3, string2, new Function0() { // from class: unn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportGoalSettingFragment.initView$lambda$10$lambda$8$lambda$6(bundle, this$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$8$lambda$6(final Bundle bundle, SportGoalSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bundle.putInt(SportConstants.TRAINING_MODE, 1);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: snn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportGoalSettingFragment.initView$lambda$10$lambda$8$lambda$6$lambda$5(bundle, (Intent) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$8$lambda$6$lambda$5(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$8$lambda$7(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10$lambda$9(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
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
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.goalTimes[position], new String[]{":"}, false, 0, 6, (Object) null);
                this.sportGoalValue = (Integer.parseInt((String) listSplit$default.get(0)) * 60) + Integer.parseInt((String) listSplit$default.get(1));
                strValueOf = this.goalTimes[position];
            }
        }
        getTarget().setText(strValueOf);
    }

    private final void registerReceivers() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.registerReceiver(this.bluetoothMonitorReceiver, intentFilter);
        }
    }

    private final void showConnectDialog(final Product product) {
        new CommonDialog.c("connect").setDialogTitle(new DialogParams.DialogDescriptionString(getResources().getString(e1j.d3))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getResources().getString(e1j.e3))).setPositiveText(e1j.s3).setNegativeText(e1j.common_cancel).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.goal.SportGoalSettingFragment.showConnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                FragmentActivity activity;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1 || (activity = SportGoalSettingFragment.this.getActivity()) == null) {
                    return;
                }
                DeviceManagerExtKt.launchToScanDevice(activity, product, true);
            }
        }).showIfNeed(getChildFragmentManager());
    }

    private final void unregisterReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.bluetoothMonitorReceiver);
        }
    }

    public final int getCurBlueToothState() {
        return this.curBlueToothState;
    }

    @NotNull
    public final TextView getCustomBtn() {
        TextView textView = this.customBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("customBtn");
        return null;
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
    public final TextView getTarget() {
        TextView textView = this.target;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("target");
        return null;
    }

    @Override // com.xiaomi.fitness.sport_eco.view.goal.SportStartFragment, com.xiaomi.fitness.sport_eco.baseui.SportGoalBaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        registerReceivers();
        setGoalValuePicker((SportNumberPicker) view.findViewById(zri.w0));
        setTarget((TextView) view.findViewById(zri.L2));
        setGoalUnit((TextView) view.findViewById(zri.goal_unit));
        setCustomBtn((TextView) view.findViewById(zri.F));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.sportGoal = arguments.getInt("GOAL_TYPE", 0);
            this.sportType = arguments.getInt("KEY_SPORT_TYPE", 1);
            this.deviceType = arguments.getInt("DEVICE_TYPE", 0);
        }
        initPicker();
        initGoalData();
        initGoalView();
        TextView textView = (TextView) view.findViewById(zri.F2);
        final String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        textView.setOnClickListener(new View.OnClickListener() { // from class: fnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportGoalSettingFragment.initView$lambda$10(key_gym_local_sport_type, this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        unregisterReceiver();
    }

    public final void setCurBlueToothState(int i) {
        this.curBlueToothState = i;
    }

    public final void setCustomBtn(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.customBtn = textView;
    }

    public final void setGoalUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.goalUnit = textView;
    }

    public final void setGoalValuePicker(@NotNull SportNumberPicker sportNumberPicker) {
        Intrinsics.checkNotNullParameter(sportNumberPicker, "<set-?>");
        this.goalValuePicker = sportNumberPicker;
    }

    @Override // com.xiaomi.fitness.sport_eco.view.goal.SportStartFragment, com.xiaomi.fitness.sport_eco.baseui.SportGoalBaseFragment
    public int setLayoutResourceId() {
        return fvi.S;
    }

    public final void setTarget(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.target = textView;
    }
}
