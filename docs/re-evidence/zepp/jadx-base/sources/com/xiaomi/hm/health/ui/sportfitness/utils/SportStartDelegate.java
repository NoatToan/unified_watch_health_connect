package com.xiaomi.hm.health.ui.sportfitness.utils;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.observer.IServiceSportObserver;
import com.huami.mifit.sportlib.utils.LocationChecker;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import com.huami.moving.ui.utils.GpsUtilDelegate;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalKeeper;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.locweather.model.RealtimeWeatherInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.ui.SetTemperatureActivity;
import com.xiaomi.hm.health.ui.sportfitness.fragment.SportHRTipsFragment;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate;
import com.xiaomi.hm.health.utils.Utils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.kc4;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 42\u00020\u0001:\u0003546B\u0017\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b2\u00103J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0012\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\rJ\u0006\u0010!\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\nR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate;", "", "Landroid/content/Context;", b.r, "", "resId", "", "r", "Landroidx/fragment/app/FragmentManager;", DTransferConstants.SEARCH_KEY, "", "m", GoogleApiAvailabilityLight.b, "", hl.k, z.j, "l", "isRunIndoor", SOAP.XMLNS, "o", "B", "C", "tipMsg", "F", "isBlueMonkey", "x", "t", DbUtils.Const.Columns.Event.EVENT_ID, "value", "i", "sportType", TdmillHmFragment.ARG_IS_OVERSEA, "tryStartSport", "checkUseGaodeMap", "checkLocatePermissionForM", "showLocationPermissionDialog", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$Action;", "b", "Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$Action;", "action", "c", LogUtil.I, GoogleApiAvailabilityLight.a, "Z", "e", "statePriority", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$Action;)V", "Companion", "Action", TrainingAnalytics.ParamKey.STATE, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportStartDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int f = 35;
    private static final int g = 2;
    private static final int h = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Action action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isOversea;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int sportType = SportUIKeeper.getSelectSportType(p());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int statePriority = State.GPS_PERMISSION.getPriority();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$Action;", "", "", "onRequestLocationPermission", "", "isGPSAvailable", "", "gpsSignalLevel", "Lcom/huami/mifit/sportlib/observer/IServiceSportObserver;", "observer", "registerGpsObserver", "unRegisterGpsObserver", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface Action {
        int gpsSignalLevel();

        boolean isGPSAvailable();

        void onRequestLocationPermission();

        void registerGpsObserver(@NotNull IServiceSportObserver observer);

        void unRegisterGpsObserver(@NotNull IServiceSportObserver observer);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$State;", "", "", "priority", LogUtil.I, "getPriority", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "ALL_READY", "GPS_PERMISSION", "GPS_OPEN_STATE", "GPS_SIGNAL_LEVEL", "SPORT_DEVICE_TIP", SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public enum State {
        ALL_READY(0),
        GPS_PERMISSION(5),
        GPS_OPEN_STATE(4),
        GPS_SIGNAL_LEVEL(3),
        SPORT_DEVICE_TIP(2),
        TEMPERATURE(1);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int priority;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$State$Companion;", "", "", "priority", "Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$State;", "valueOf", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final State valueOf(int priority) {
                State[] stateArrValues = State.values();
                int length = stateArrValues.length;
                int i = 0;
                while (i < length) {
                    State state = stateArrValues[i];
                    i++;
                    if (priority == state.getPriority()) {
                        return state;
                    }
                }
                return State.ALL_READY;
            }
        }

        State(int i) {
            this.priority = i;
        }

        @JvmStatic
        @NotNull
        public static final State valueOf(int i) {
            return INSTANCE.valueOf(i);
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.GPS_PERMISSION.ordinal()] = 1;
            iArr[State.GPS_OPEN_STATE.ordinal()] = 2;
            iArr[State.GPS_SIGNAL_LEVEL.ordinal()] = 3;
            iArr[State.SPORT_DEVICE_TIP.ordinal()] = 4;
            iArr[State.TEMPERATURE.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", FirebaseAnalytics.Param.LEVEL, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ ImageView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImageView imageView) {
            super(1);
            this.a = imageView;
        }

        public final void a(int i) {
            int i2;
            ImageView imageView = this.a;
            if (i == GPSSignal.SignalLevel.WEAK.getValue()) {
                i2 = R.drawable.gps_signal_1;
            } else if (i == GPSSignal.SignalLevel.MIDDLE.getValue()) {
                i2 = R.drawable.gps_signal_2;
            } else {
                i2 = i == GPSSignal.SignalLevel.STRONG.getValue() ? R.drawable.gps_signal_3 : R.drawable.gps_signal_0;
            }
            imageView.setImageResource(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public SportStartDelegate(@NotNull Fragment fragment, @NotNull Action action) {
        this.fragment = fragment;
        this.action = action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SportStartDelegate sportStartDelegate, DialogInterface dialogInterface, int i) {
        Utils.startAppSettings(sportStartDelegate.p());
    }

    private final void B() {
        Context contextP = p();
        if (contextP == null) {
            return;
        }
        GpsUtilDelegate.INSTANCE.genOpenGpsDialog(contextP).show(q());
    }

    private final void C() {
        if (!SportUIKeeper.getIsTipNoStepAgain(p())) {
            i(SportAnalytics.EVENT_CONTINUE_RUNNING, SportAnalytics.Params.VALUE_CONTINUE);
            m();
            return;
        }
        View viewInflate = View.inflate(p(), R.layout.dialog_running_indoor_not_support_step, null);
        View viewFindViewById = viewInflate.findViewById(R.id.run_indoor_no_tip_again_text);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: gd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportStartDelegate.E(this.a, view);
            }
        });
        new AlertDialogFragment.Builder(p()).setCancelable(true).setContentView(viewInflate).setNeutralButton(r(R.string.running_indoor_start), new DialogInterface.OnClickListener() { // from class: zc7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportStartDelegate.D(this.a, dialogInterface, i);
            }
        }).show(q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SportStartDelegate sportStartDelegate, DialogInterface dialogInterface, int i) {
        sportStartDelegate.i(SportAnalytics.EVENT_CONTINUE_RUNNING, SportAnalytics.Params.VALUE_CONTINUE);
        sportStartDelegate.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SportStartDelegate sportStartDelegate, View view) {
        SportUIKeeper.setIsTipNoStepAgain(sportStartDelegate.p(), false);
    }

    private final void F(String tipMsg) {
        new AlertDialogFragment.Builder(p()).setCancelable(true).setTitle(R.string.kindly_reminder).setMessage(tipMsg).setNeutralButton(R.string.running_tip_known, new DialogInterface.OnClickListener() { // from class: ad7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportStartDelegate.G(this.a, dialogInterface, i);
            }
        }).show(q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(SportStartDelegate sportStartDelegate, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        sportStartDelegate.m();
    }

    private final void i(String eventId, String value) {
        Analytics.recordEvent(new CountEventBuilder(eventId).setValue(value));
    }

    private final boolean j() {
        if (LocationChecker.isGPSLocationSupported(p())) {
            return true;
        }
        i(SportAnalytics.EVENT_RUN_TURN_ON_GPS_REQUEST, "Off");
        B();
        return false;
    }

    private final boolean k() {
        if (checkLocatePermissionForM()) {
            return true;
        }
        this.action.onRequestLocationPermission();
        return false;
    }

    private final boolean l() {
        boolean zIsGPSAvailable = this.action.isGPSAvailable();
        int iGpsSignalLevel = this.action.gpsSignalLevel();
        if (!zIsGPSAvailable || iGpsSignalLevel <= GPSSignal.SignalLevel.WEAK.getValue()) {
            i(SportAnalytics.EVENT_RUN_TURN_ON_GPS_REQUEST, SportAnalytics.Params.SIGNAL_WEAK);
            t();
            return false;
        }
        if (iGpsSignalLevel > GPSSignal.SignalLevel.MIDDLE.getValue()) {
            i(SportAnalytics.EVENT_RUN_TURN_ON_GPS_REQUEST, SportAnalytics.Params.SIGNAL_STRONG);
            return true;
        }
        i(SportAnalytics.EVENT_RUN_TURN_ON_GPS_REQUEST, "Medium");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.statePriority--;
        n();
    }

    private final void n() {
        boolean z = this.sportType == 8;
        int i = WhenMappings.$EnumSwitchMapping$0[State.INSTANCE.valueOf(this.statePriority).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            Context contextP = p();
                            if (contextP == null) {
                                return;
                            }
                            INSTANCE.startSport(contextP, true, this.sportType, this.isOversea);
                            return;
                        }
                        if (!HMLoginManager.isInKR() && !z && !o()) {
                            return;
                        }
                    } else if (s(z)) {
                        return;
                    }
                }
            } else if (!z && !j()) {
                return;
            }
        } else if (!k()) {
            return;
        }
        m();
    }

    private final boolean o() {
        RealtimeWeatherInfo realtimeWeatherInfo;
        String strR;
        RealtimeWeatherInfo realtimeWeatherInfo2;
        SetTemperatureActivity.Companion companion = SetTemperatureActivity.INSTANCE;
        int currentTemperature = 10;
        if (companion.getCanTestTemperature()) {
            Integer temperature = companion.getTemperature();
            if (temperature == null) {
                WeatherInfos weatherInfos = LocWeatherManager.getInstance().getWeatherInfos();
                if (weatherInfos != null && (realtimeWeatherInfo2 = weatherInfos.getRealtimeWeatherInfo()) != null) {
                    currentTemperature = realtimeWeatherInfo2.getCurrentTemperature();
                }
            } else {
                currentTemperature = temperature.intValue();
            }
        } else {
            WeatherInfos weatherInfos2 = LocWeatherManager.getInstance().getWeatherInfos();
            if (weatherInfos2 != null && (realtimeWeatherInfo = weatherInfos2.getRealtimeWeatherInfo()) != null) {
                currentTemperature = realtimeWeatherInfo.getCurrentTemperature();
            }
        }
        if (currentTemperature > 35) {
            strR = r(R.string.sport_temp_too_hot);
        } else {
            strR = currentTemperature < 2 ? r(R.string.sport_temp_too_cold) : null;
        }
        if (strR == null) {
            return true;
        }
        F(strR);
        return false;
    }

    private final Context p() {
        return this.fragment.getContext();
    }

    private final FragmentManager q() {
        return this.fragment.getFragmentManager();
    }

    private final String r(@StringRes int resId) {
        return this.fragment.getString(resId);
    }

    private final boolean s(boolean isRunIndoor) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (HMDeviceSource hMDeviceSource : SportDeviceManager.getInstance(p()).getUserOpenedBoundDevices(this.sportType)) {
            if (!z && hMDeviceSource == HMDeviceSource.OTHER_BM) {
                z = true;
            }
            if (!z3 && hMDeviceSource.getType() == HMDeviceType.MILI) {
                z3 = true;
            }
            if (!z2 && (hMDeviceSource.getType() == HMDeviceType.MILI || hMDeviceSource.getType() == HMDeviceType.SHOES || hMDeviceSource.getType() == HMDeviceType.SENSORHUB || hMDeviceSource == HMDeviceSource.OTHER_BM)) {
                z2 = true;
            }
        }
        if (isRunIndoor) {
            if (!z2) {
                Context contextP = p();
                Object systemService = contextP == null ? null : contextP.getSystemService("sensor");
                z2 = systemService == null ? false : ((SensorManager) systemService).getDefaultSensor(18) != null;
            }
            if (!z2) {
                C();
                return true;
            }
        }
        if (z && GlobalKeeper.getBlueMonkeyNeedTip()) {
            x(true);
            return true;
        }
        if (z || !z3 || !GlobalKeeper.getHrNeedTip()) {
            return false;
        }
        y(this, false, 1, null);
        return true;
    }

    @JvmStatic
    public static final void startSport(@NotNull Context context, @NotNull Trackrecord trackrecord) {
        INSTANCE.startSport(context, trackrecord);
    }

    @JvmStatic
    public static final void startSport(@NotNull Context context, boolean z, int i) {
        INSTANCE.startSport(context, z, i);
    }

    @JvmStatic
    public static final void startSport(@NotNull Context context, boolean z, int i, boolean z2) {
        INSTANCE.startSport(context, z, i, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.huami.mifit.sportlib.observer.IServiceSportObserver, com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate$showGpsUnAvailableDialog$gpsObserver$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void t() {
        View viewInflate = View.inflate(p(), R.layout.dialog_running_gps_unavailable, null);
        final a aVar = new a((ImageView) viewInflate.findViewById(R.id.gps_signal_image));
        aVar.invoke(Integer.valueOf(this.action.gpsSignalLevel()));
        final AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(p()).setCancelable(true).setContentView(viewInflate).setNegativeButton(r(R.string.cancel), new DialogInterface.OnClickListener() { // from class: dd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportStartDelegate.u(this.a, dialogInterface, i);
            }
        }).setPositiveButton(r(R.string.running_indoor_start), new DialogInterface.OnClickListener() { // from class: bd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportStartDelegate.v(this.a, dialogInterface, i);
            }
        }).create();
        final ?? r1 = new IServiceSportObserver() { // from class: com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate$showGpsUnAvailableDialog$gpsObserver$1
            @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
            public void onDeviceStatusChanged(boolean isBand, boolean connect) {
            }

            @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
            public void onGPSSignalChanged(int level) {
                if (alertDialogFragmentCreate.isShowing()) {
                    aVar.invoke(Integer.valueOf(level));
                }
            }

            @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
            public /* synthetic */ void onInaccuracyLocationChanged(GPSPoint gPSPoint) {
                kc4.a(this, gPSPoint);
            }

            @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
            public void onScreenStatusChanged(@Nullable String action, @Nullable String lastAction) {
            }
        };
        this.action.registerGpsObserver(r1);
        alertDialogFragmentCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fd7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SportStartDelegate.w(this.a, r1, dialogInterface);
            }
        });
        alertDialogFragmentCreate.show(q());
    }

    public static /* synthetic */ void tryStartSport$default(SportStartDelegate sportStartDelegate, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        sportStartDelegate.tryStartSport(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SportStartDelegate sportStartDelegate, DialogInterface dialogInterface, int i) {
        sportStartDelegate.i(SportAnalytics.EVENT_CONTINUE_RUNNING, "Cancel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SportStartDelegate sportStartDelegate, DialogInterface dialogInterface, int i) {
        sportStartDelegate.i(SportAnalytics.EVENT_CONTINUE_RUNNING, SportAnalytics.Params.VALUE_CONTINUE);
        sportStartDelegate.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SportStartDelegate sportStartDelegate, SportStartDelegate$showGpsUnAvailableDialog$gpsObserver$1 sportStartDelegate$showGpsUnAvailableDialog$gpsObserver$1, DialogInterface dialogInterface) {
        sportStartDelegate.action.unRegisterGpsObserver(sportStartDelegate$showGpsUnAvailableDialog$gpsObserver$1);
    }

    private final void x(final boolean isBlueMonkey) {
        final SportHRTipsFragment sportHRTipsFragmentNewInstance = SportHRTipsFragment.newInstance(isBlueMonkey);
        sportHRTipsFragmentNewInstance.setDialogButtonListener(new SportHRTipsFragment.DialogButtonListener() { // from class: com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate$showHrTipFragment$1
            @Override // com.xiaomi.hm.health.ui.sportfitness.fragment.SportHRTipsFragment.DialogButtonListener
            public void onDismiss() {
            }

            @Override // com.xiaomi.hm.health.ui.sportfitness.fragment.SportHRTipsFragment.DialogButtonListener
            public void onNotTips() {
                if (isBlueMonkey) {
                    GlobalKeeper.setBlueMonkeyNeedTip(false);
                } else {
                    GlobalKeeper.setHrNeedTip(false);
                }
                sportHRTipsFragmentNewInstance.dismiss();
                this.m();
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = q().beginTransaction();
        fragmentTransactionBeginTransaction.add(sportHRTipsFragmentNewInstance, "SportHRTipsFragment");
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static /* synthetic */ void y(SportStartDelegate sportStartDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sportStartDelegate.x(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(DialogInterface dialogInterface, int i) {
    }

    public final boolean checkLocatePermissionForM() {
        Context contextP = p();
        if (contextP == null) {
            return false;
        }
        return EasyPermissions.hasPermissions(contextP, "android.permission.ACCESS_FINE_LOCATION");
    }

    public final boolean checkUseGaodeMap() {
        Context contextP = p();
        if (contextP == null) {
            return true;
        }
        return SportUseGaodeMapChecker.INSTANCE.checkUseGaodeMap(contextP);
    }

    public final void showLocationPermissionDialog() {
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(p()).setCancelable(true).setTitle(R.string.running_no_locate_permission_title);
        Context contextP = p();
        title.setMessage(contextP == null ? null : contextP.getString(R.string.running_no_locate_permission, "Zepp")).setNegativeButton(r(R.string.cancel), new DialogInterface.OnClickListener() { // from class: ed7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportStartDelegate.z(dialogInterface, i);
            }
        }).setPositiveButton(r(R.string.open), new DialogInterface.OnClickListener() { // from class: cd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportStartDelegate.A(this.a, dialogInterface, i);
            }
        }).show(q());
    }

    public final void tryStartSport(int sportType, boolean isOversea) {
        this.sportType = sportType;
        this.isOversea = isOversea;
        String str = isOversea ? SportAnalytics.EVENT_SPORT_OVERSEA_OP : "DomesticSports_Operate";
        if (sportType == 1) {
            i(str, SportAnalytics.Params.VALUE_RUNNING);
        } else if (sportType == 6) {
            i(str, "Walking");
        } else if (sportType == 8) {
            i(str, SportAnalytics.Params.VALUE_INDDOR_RUNNING);
        } else if (sportType == 9) {
            i(str, SportAnalytics.Params.VALUE_CYCLING);
        }
        this.statePriority = State.GPS_PERMISSION.getPriority();
        n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0007R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/utils/SportStartDelegate$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "sportType", "", "b", "Landroid/content/Intent;", "intent", "c", "", "a", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "startSport", "isNewSport", TdmillHmFragment.ARG_IS_OVERSEA, "COLD_TEMP", LogUtil.I, "DEFAULT_TEMP", "HOT_TEMP", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a() {
            return (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
        }

        private final void b(Context context, int sportType) {
            RunningManager.setOrUpdateRunnerData();
            LocWeatherManager.getInstance().cancelLocation();
            SportDeviceManager.getInstance(context).registerSportUsingDevice(sportType);
        }

        private final void c(Context context, Intent intent) {
            context.startActivity(intent, ActivityOptions.makeCustomAnimation(context, R.anim.running_main_enter, R.anim.running_main_exit).toBundle());
        }

        @JvmStatic
        public final void startSport(@NotNull Context context, @NotNull Trackrecord record) {
            b(context, record.getType().intValue());
            c(context, GPSMainActivity.newIntent(context, record.getType().intValue(), record.getTrackid().longValue(), a(), SportUseGaodeMapChecker.INSTANCE.checkUseGaodeMap(context)));
        }

        @JvmStatic
        public final void startSport(@NotNull Context context, boolean isNewSport, int sportType) {
            startSport(context, isNewSport, sportType, a());
        }

        @JvmStatic
        public final void startSport(@NotNull Context context, boolean isNewSport, int sportType, boolean isOversea) {
            b(context, sportType);
            c(context, GPSMainActivity.newIntent(context, sportType, isNewSport, isOversea, SportUseGaodeMapChecker.INSTANCE.checkUseGaodeMap(context)));
        }
    }
}
