package com.xiaomi.fitness.sport_eco.view.sporting;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import com.xiaomi.fitness.sport_eco.viewmodel.IndoorRunningSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.lp5;
import defpackage.m0d;
import defpackage.wi0;
import defpackage.zri;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.INDOOR_SPORTING)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0006R\u001a\u0010#\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u00101\"\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/sporting/IndoorRunningActivity;", "Lcom/xiaomi/fitness/sport_eco/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/IndoorRunningSportVM;", "Lwi0;", "", "adaptiveFullScreen", "()V", "setListener", DialWidgetType.COUNT_DOWN, "initData", "gymFoldConfirmDialog", "setGymStartCallback", "showCountDownDialog", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "layoutResID", "setContentView", "(I)V", "Lm0d;", "callback", "onViewFinish", "(Lm0d;)V", "outState", "onSaveInstanceState", "Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "jumpSportDetail", LifecycleConstantKt.ON_DESTROY, "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "gymDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getGymDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setGymDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "isLocalLaunch", "Z", "()Z", "setLocalLaunch", "(Z)V", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "Lkotlin/Lazy;", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "<init>", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IndoorRunningActivity extends Hilt_IndoorRunningActivity<IndoorRunningSportVM, wi0> {

    @NotNull
    private final String TAG;

    @Nullable
    private CommonDialog<?> gymDialog;
    private boolean isLocalLaunch;

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver;

    public IndoorRunningActivity() {
        super(fvi.c, 0);
        this.TAG = com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity.TAG;
        this.lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z8d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRunningActivity.lockScreenReceiver_delegate$lambda$0();
            }
        });
    }

    private final void adaptiveFullScreen() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void countdown() {
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorRunningSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null && Intrinsics.areEqual(mutableLiveDataIsCountDownEnd.getValue(), Boolean.TRUE)) {
            LottieAnimationView lottieAnimationView = ((wi0) getMBinding()).H;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                return;
            }
            return;
        }
        setCountdownMode(((wi0) getMBinding()).H);
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).countDownStart(3, 900, true);
        getHandler().postDelayed(new Runnable() { // from class: n9d
            @Override // java.lang.Runnable
            public final void run() {
                IndoorRunningActivity.countdown$lambda$3(this.f27680a);
            }
        }, 2700L);
        LottieAnimationView lottieAnimationView2 = ((wi0) getMBinding()).H;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void countdown$lambda$3(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getDeviceType() == 0) {
            ((IndoorRunningSportVM) this$0.getMViewModel()).startSport();
        }
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorRunningSportVM) this$0.getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.postValue(Boolean.TRUE);
        }
        LottieAnimationView lottieAnimationView = ((wi0) this$0.getMBinding()).H;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void gymFoldConfirmDialog() {
        if (this.isLocalLaunch || !((IndoorRunningSportVM) getMViewModel()).getIsGymStartedBool()) {
            return;
        }
        showCountDownDialog();
        setGymStartCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        LottieAnimationView lottieAnimationView;
        gymFoldConfirmDialog();
        ((IndoorRunningSportVM) getMViewModel()).getRecordEmitter().observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b9d
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IndoorRunningActivity.initData$lambda$4(this.f3950a, (SportBasicReport) obj);
            }
        }));
        ((IndoorRunningSportVM) getMViewModel()).setShowLoading(new Function0() { // from class: d9d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRunningActivity.initData$lambda$5(this.f15261a);
            }
        });
        ((IndoorRunningSportVM) getMViewModel()).setHideLoading(new Function0() { // from class: f9d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRunningActivity.initData$lambda$6(this.f17554a);
            }
        });
        MutableLiveData<SportingData> mData = ((IndoorRunningSportVM) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h9d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initData$lambda$7(this.f19832a, (SportingData) obj);
                }
            }));
        }
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorRunningSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j9d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initData$lambda$8(this.f22560a, (Boolean) obj);
                }
            }));
        }
        Intent intent = getIntent();
        setDeviceType(intent.getIntExtra("DEVICE_TYPE", 0));
        ((IndoorRunningSportVM) getMViewModel()).setDeviceType(getDeviceType());
        ((IndoorRunningSportVM) getMViewModel()).setShowAnimation(intent.getBooleanExtra("IS_SHOW_ANIMATION", true));
        this.isLocalLaunch = intent.getBooleanExtra("LOCAL_DEVICE_LAUNCH", false);
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd2 = ((IndoorRunningSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd2 != null) {
            mutableLiveDataIsCountDownEnd2.observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l9d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initData$lambda$10(this.f24800a, (Boolean) obj);
                }
            }));
        }
        if (((IndoorRunningSportVM) getMViewModel()).getIsFirstInit()) {
            if (getDeviceType() == 0) {
                if (getIsRecoverySport()) {
                    ((IndoorRunningSportVM) getMViewModel()).startSport();
                    LottieAnimationView lottieAnimationView2 = ((wi0) getMBinding()).H;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility(8);
                    }
                } else if (getIsRebootSport()) {
                    LottieAnimationView lottieAnimationView3 = ((wi0) getMBinding()).H;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setVisibility(8);
                    }
                } else {
                    countdown();
                }
            } else if (this.isLocalLaunch) {
                ((IndoorRunningSportVM) getMViewModel()).startSport();
                ((IndoorRunningSportVM) getMViewModel()).startTrack();
                if (((IndoorRunningSportVM) getMViewModel()).getIsShowAnimation()) {
                    countdown();
                } else {
                    LottieAnimationView lottieAnimationView4 = ((wi0) getMBinding()).H;
                    if (lottieAnimationView4 != null) {
                        lottieAnimationView4.setVisibility(8);
                    }
                }
            } else {
                showCountDownDialog();
                ((IndoorRunningSportVM) getMViewModel()).setGymStartedBool(true);
                ((IndoorRunningSportVM) getMViewModel()).startSport();
                setGymStartCallback();
            }
        } else if (!((IndoorRunningSportVM) getMViewModel()).getIsGymStartedBool() && (lottieAnimationView = ((wi0) getMBinding()).H) != null) {
            lottieAnimationView.setVisibility(8);
        }
        ((IndoorRunningSportVM) getMViewModel()).setFirstInit(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$10(IndoorRunningActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = AppUtil.getApp().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        Sensor defaultSensor = ((SensorManager) systemService).getDefaultSensor(33171041);
        if (this$0.getDeviceType() == 1 || defaultSensor != null) {
            this$0.setRequestedOrientation(bool.booleanValue() ? 4 : 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$4(IndoorRunningActivity this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (sportBasicReport != null) {
            Bundle bundle = new Bundle();
            int iA = lp5.a(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putInt("sport_type", iA);
            SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), this$0, bundle, sportBasicReport, false, 8, null);
            this$0.finish();
        } else if (((IndoorRunningSportVM) this$0.getMViewModel()).getDistance() < 100) {
            this$0.showShortDistanceDialog();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(e1j.W, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$6(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$7(IndoorRunningActivity this$0, SportingData sportingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i("CommonSportModel", "data is received --------start ");
        if (sportingData != null) {
            ((wi0) this$0.getMBinding()).A0(sportingData.getList());
            FitnessLogUtils.i("CommonSportModel", "data is received by UI");
            ((wi0) this$0.getMBinding()).B0(sportingData.getMap());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$8(IndoorRunningActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setRequestedOrientation(bool.booleanValue() ? 2 : 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockScreenReceiver lockScreenReceiver_delegate$lambda$0() {
        return new LockScreenReceiver();
    }

    private final void registerLockScreenReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(getLockScreenReceiver(), intentFilter);
        FitnessLogUtils.d(this.TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setGymStartCallback() {
        ((IndoorRunningSportVM) getMViewModel()).isGymStarted().observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m8d
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IndoorRunningActivity.setGymStartCallback$lambda$11(this.f25882a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGymStartCallback$lambda$11(IndoorRunningActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            CommonDialog<?> commonDialog = this$0.gymDialog;
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
            this$0.countdown();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    private final void setListener() {
        ((ImageView) findViewById(zri.g2)).setOnClickListener(new View.OnClickListener() { // from class: x8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRunningActivity.setListener$lambda$2(this.f38847a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(IndoorRunningActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoSportConfig();
    }

    private final void showCountDownDialog() {
        View viewInflate = LayoutInflater.from(this).inflate(fvi.n0, (ViewGroup) null);
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("gym").setCustomView(viewInflate).setCanceledOnTouchOutside(false).create();
        this.gymDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        ((TextView) viewInflate.findViewById(zri.n1)).setOnClickListener(new View.OnClickListener() { // from class: o8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRunningActivity.showCountDownDialog$lambda$12(this.f28855a, view);
            }
        });
        CommonDialog<?> commonDialog = this.gymDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCountDownDialog$lambda$12(IndoorRunningActivity this$0, View view) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        ecoDeviceManagerExtKt.disconnectDevice(did);
        this$0.finish();
    }

    private final void unregisterLockScreenReceiver() {
        if (getIsBackgroundProcessAlive()) {
            LockScreenReceiver.INSTANCE.unregisterPhoneListener();
            unregisterReceiver(getLockScreenReceiver());
            FitnessLogUtils.d(this.TAG, "lockScreenReceiver successfully unregistered!!!");
        }
    }

    @Nullable
    public final CommonDialog<?> getGymDialog() {
        return this.gymDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity
    @NotNull
    public SportCommandView getSportCommandView() {
        SportCommandView sportCommandView = ((wi0) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(sportCommandView, "sportCommandView");
        return sportCommandView;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: isLocalLaunch, reason: from getter */
    public final boolean getIsLocalLaunch() {
        return this.isLocalLaunch;
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity
    public void jumpSportDetail() {
        if (getDeviceType() == 0) {
            super.jumpSportDetail();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.Hilt_IndoorRunningActivity, com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adaptiveFullScreen();
        if (getIsBackgroundProcessAlive()) {
            setActionBarDisplayable(false);
            initData();
            setListener();
            registerLockScreenReceiver();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.Hilt_IndoorRunningActivity, com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterLockScreenReceiver();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        CommonDialog<?> commonDialog = this.gymDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        this.gymDialog = null;
        super.onSaveInstanceState(outState);
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback
    public void onViewFinish(@NotNull m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        super.onViewFinish(callback);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        setMBinding(binding(layoutInflater, layoutResID, null));
        super.setContentView(fvi.c);
    }

    public final void setGymDialog(@Nullable CommonDialog<?> commonDialog) {
        this.gymDialog = commonDialog;
    }

    public final void setLocalLaunch(boolean z) {
        this.isLocalLaunch = z;
    }
}
