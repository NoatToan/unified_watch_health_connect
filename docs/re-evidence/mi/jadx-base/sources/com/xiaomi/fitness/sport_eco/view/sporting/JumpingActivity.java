package com.xiaomi.fitness.sport_eco.view.sporting;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.utils.TransitionUtil;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment;
import com.xiaomi.fitness.sport_eco.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import com.xiaomi.fitness.sport_eco.viewmodel.JumpingSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.av6;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.lp5;
import defpackage.m0d;
import defpackage.ym0;
import defpackage.zri;
import java.util.ArrayList;
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
@Route(path = SportRouterKt.JUMP_SPORTING)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0006J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'\"\u0004\b0\u00101R6\u00105\u001a\u0016\u0012\u0004\u0012\u000203\u0018\u000102j\n\u0012\u0004\u0012\u000203\u0018\u0001`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/sporting/JumpingActivity;", "Lcom/xiaomi/fitness/sport_eco/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/JumpingSportVM;", "Lym0;", "", "adaptiveFullScreen", "()V", "setListener", DialWidgetType.COUNT_DOWN, "initData", "showJumpInvalidDialog", "showJumpShutdownDialog", "setGymStartCallback", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "askExitSportDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "layoutResID", "setContentView", "(I)V", "outState", "onSaveInstanceState", "Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "jumpSportDetail", LifecycleConstantKt.ON_DESTROY, "Lm0d;", "callback", "onViewFinish", "(Lm0d;)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "", "isLocalLaunch", "Z", "()Z", "setLocalLaunch", "(Z)V", "localSportType", "getLocalSportType", "setLocalSportType", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "Lkotlin/collections/ArrayList;", "intervalSportTargetArr", "Ljava/util/ArrayList;", "getIntervalSportTargetArr", "()Ljava/util/ArrayList;", "setIntervalSportTargetArr", "(Ljava/util/ArrayList;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialogShutdown", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getDialogShutdown", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setDialogShutdown", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "Lkotlin/Lazy;", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "<init>", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class JumpingActivity extends Hilt_JumpingActivity<JumpingSportVM, ym0> {

    @NotNull
    private final String TAG;

    @Nullable
    private CommonDialog<?> dialogShutdown;

    @Nullable
    private ArrayList<IntervalSportTarget> intervalSportTargetArr;
    private boolean isLocalLaunch;

    @NotNull
    private String localSportType;

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity$askExitSportDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport_eco/view/sporting/JumpingActivity$askExitSportDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDialogClick$lambda$0() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which != -2) {
                if (which != -1) {
                    return;
                }
                JumpingActivity.access$getMViewModel(JumpingActivity.this).resumeSport(new m0d() { // from class: tvd
                    @Override // defpackage.m0d
                    public final void a() {
                        JumpingActivity.AnonymousClass1.onDialogClick$lambda$0();
                    }
                });
            } else {
                JumpingActivity.access$getMViewModel(JumpingActivity.this).finishSport();
                if (dialog != null) {
                    dialog.dismiss();
                }
                JumpingActivity.this.finish();
            }
        }
    }

    public JumpingActivity() {
        super(fvi.l, 0);
        this.TAG = "JumpingActivity";
        this.localSportType = "";
        this.lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: svd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumpingActivity.lockScreenReceiver_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ JumpingSportVM access$getMViewModel(JumpingActivity jumpingActivity) {
        return (JumpingSportVM) jumpingActivity.getMViewModel();
    }

    private final void adaptiveFullScreen() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    private final void askExitSportDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("askIfResumeSportDialog").setDialogTitle(e1j.k3).setDialogDescription(e1j.q3).setNegativeText(e1j.x1).setPositiveText(e1j.d0).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new AnonymousClass1());
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void countdown() {
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((JumpingSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null && Intrinsics.areEqual(mutableLiveDataIsCountDownEnd.getValue(), Boolean.TRUE)) {
            LottieAnimationView lottieAnimationView = ((ym0) getMBinding()).F;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                return;
            }
            return;
        }
        setCountdownMode(((ym0) getMBinding()).F);
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).countDownStart(3, 900, true);
        getHandler().postDelayed(new Runnable() { // from class: kvd
            @Override // java.lang.Runnable
            public final void run() {
                JumpingActivity.countdown$lambda$3(this.f24334a);
            }
        }, 2700L);
        LottieAnimationView lottieAnimationView2 = ((ym0) getMBinding()).F;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void countdown$lambda$3(JumpingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((JumpingSportVM) this$0.getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.postValue(Boolean.TRUE);
        }
        LottieAnimationView lottieAnimationView = ((ym0) this$0.getMBinding()).F;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        ((JumpingSportVM) this$0.getMViewModel()).startSport();
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        ((JumpingSportVM) getMViewModel()).getRecordEmitter().observe(this, new JumpingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mvd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JumpingActivity.initData$lambda$4(this.f27252a, (SportBasicReport) obj);
            }
        }));
        ((JumpingSportVM) getMViewModel()).setShowLoading(new Function0() { // from class: nvd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumpingActivity.initData$lambda$5(this.f28477a);
            }
        });
        ((JumpingSportVM) getMViewModel()).setHideLoading(new Function0() { // from class: ovd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumpingActivity.initData$lambda$6(this.f29728a);
            }
        });
        MutableLiveData<SportingData> mData = ((JumpingSportVM) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new JumpingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pvd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JumpingActivity.initData$lambda$7(this.f30824a, (SportingData) obj);
                }
            }));
        }
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((JumpingSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.observe(this, new JumpingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qvd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JumpingActivity.initData$lambda$8(this.f31881a, (Boolean) obj);
                }
            }));
        }
        ((JumpingSportVM) getMViewModel()).isGymShutdown().observe(this, new JumpingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rvd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JumpingActivity.initData$lambda$9(this.f32945a, (Boolean) obj);
            }
        }));
        Intent intent = getIntent();
        setDeviceType(intent.getIntExtra("DEVICE_TYPE", 1));
        ((JumpingSportVM) getMViewModel()).setDeviceType(getDeviceType());
        ((JumpingSportVM) getMViewModel()).setShowAnimation(intent.getBooleanExtra("IS_SHOW_ANIMATION", true));
        this.isLocalLaunch = intent.getBooleanExtra("LOCAL_DEVICE_LAUNCH", false);
        ((JumpingSportVM) getMViewModel()).setLocalLaunch(this.isLocalLaunch);
        String stringExtra = intent.getStringExtra(SportConstants.KEY_GYM_MODE_TYPE);
        if (stringExtra == null) {
            stringExtra = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        }
        this.localSportType = stringExtra;
        ((JumpingSportVM) getMViewModel()).setTimeStamp(intent.getLongExtra(SportConstants.KEY_TIMESTAMP, 0L));
        ((JumpingSportVM) getMViewModel()).setTimeZone(intent.getLongExtra("timeZone", 0L));
        Logger.d(this.TAG, "initData isLocalLaunch:" + this.isLocalLaunch + " ; trainingMode:" + ((JumpingSportVM) getMViewModel()).getTrainingMode() + " ; timeStamp:" + ((JumpingSportVM) getMViewModel()).getTimeStamp() + " ; timeZone:" + ((JumpingSportVM) getMViewModel()).getTimeZone());
        if (getIntent().getSerializableExtra(SportConstants.INTERVAL_SPORT_TARGET_LIST) != null) {
            this.intervalSportTargetArr = (ArrayList) getIntent().getSerializableExtra(SportConstants.INTERVAL_SPORT_TARGET_LIST);
            ((JumpingSportVM) getMViewModel()).setIntervalSportTargetArr(this.intervalSportTargetArr);
        }
        Logger.d(this.TAG, "initData isLocalLaunch:" + this.isLocalLaunch);
        if (!((JumpingSportVM) getMViewModel()).getIsFirstInit()) {
            LottieAnimationView lottieAnimationView = ((ym0) getMBinding()).F;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
            }
        } else if (getDeviceType() == 1) {
            if (!this.isLocalLaunch) {
                countdown();
                setGymStartCallback();
            } else if (((JumpingSportVM) getMViewModel()).getIsShowAnimation()) {
                countdown();
            } else {
                LottieAnimationView lottieAnimationView2 = ((ym0) getMBinding()).F;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setVisibility(8);
                }
                ((JumpingSportVM) getMViewModel()).startSport();
            }
        }
        ((JumpingSportVM) getMViewModel()).setFirstInit(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$4(JumpingActivity this$0, SportBasicReport sportBasicReport) {
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
        } else if (((JumpingSportVM) this$0.getMViewModel()).getJumpCount() < 1) {
            this$0.showJumpInvalidDialog();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5(JumpingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(e1j.W, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$6(JumpingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$7(JumpingActivity this$0, SportingData sportingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "data is received --------start ");
        if (sportingData != null) {
            ((ym0) this$0.getMBinding()).A0(sportingData.getList());
            ((ym0) this$0.getMBinding()).B0(sportingData.getMap());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$8(JumpingActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setRequestedOrientation(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$9(JumpingActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showJumpShutdownDialog();
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
        Logger.d(this.TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setGymStartCallback() {
        ((JumpingSportVM) getMViewModel()).isGymStarted().observe(this, new JumpingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jvd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JumpingActivity.setGymStartCallback$lambda$11(this.f23179a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGymStartCallback$lambda$11(JumpingActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!bool.booleanValue()) {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    private final void setListener() {
        ((ImageView) findViewById(zri.g2)).setOnClickListener(new View.OnClickListener() { // from class: lvd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JumpingActivity.setListener$lambda$2(this.f25470a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(JumpingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "onclick sportConfig");
        Bundle bundle = new Bundle();
        bundle.putString(SportConstants.KEY_GYM_MODE_TYPE, this$0.localSportType);
        bundle.putBoolean(LocalRopeSettingFragment.IS_SPORTING, true);
        TransitionUtil.INSTANCE.gotoActivityResult(this$0, LocalRopeSettingFragment.class, bundle, 0);
    }

    private final void showJumpInvalidDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("finishSport").setDialogDescription(e1j.p3).setPositiveText(e1j.d).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity.showJumpInvalidDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    JumpingActivity.this.finish();
                }
            });
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showJumpShutdownDialog() {
        CommonDialog<?> commonDialog = this.dialogShutdown;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sportShutdown").setDialogDescription(e1j.t3).setPositiveText(e1j.d).create();
            this.dialogShutdown = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.dialogShutdown;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity.showJumpShutdownDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        JumpingActivity.this.finishActivity();
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.dialogShutdown;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    private final void unregisterLockScreenReceiver() {
        if (getIsBackgroundProcessAlive()) {
            LockScreenReceiver.INSTANCE.unregisterPhoneListener();
            unregisterReceiver(getLockScreenReceiver());
            Logger.d(this.TAG, "lockScreenReceiver successfully unregistered!!!");
        }
    }

    @Nullable
    public final CommonDialog<?> getDialogShutdown() {
        return this.dialogShutdown;
    }

    @Nullable
    public final ArrayList<IntervalSportTarget> getIntervalSportTargetArr() {
        return this.intervalSportTargetArr;
    }

    @NotNull
    public final String getLocalSportType() {
        return this.localSportType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity
    @NotNull
    public SportCommandView getSportCommandView() {
        SportCommandView sportCommandView = ((ym0) getMBinding()).N;
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
        FitnessLogUtils.i(this.TAG, "jumpSportDetail  deviceType = " + getDeviceType());
        if (getDeviceType() == 0) {
            super.jumpSportDetail();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.Hilt_JumpingActivity, com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        SportManagerExportPreference.INSTANCE.setKEY_GYM_IS_JUMPING(true);
        super.onCreate(savedInstanceState);
        adaptiveFullScreen();
        if (getIsBackgroundProcessAlive()) {
            setActionBarDisplayable(false);
            initData();
            setListener();
            registerLockScreenReceiver();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.Hilt_JumpingActivity, com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (getHandler() != null) {
            getHandler().removeCallbacksAndMessages(null);
        }
        unregisterLockScreenReceiver();
        SportManagerExportPreference.INSTANCE.setKEY_GYM_IS_JUMPING(false);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback
    public void onViewFinish(@NotNull m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = this.TAG;
        SportingData sportData = ((JumpingSportVM) getMViewModel()).getSportData();
        Logger.d(str, "onViewFinish " + (sportData != null ? Long.valueOf(sportData.getSportDurtaion()) : null));
        SportingData sportData2 = ((JumpingSportVM) getMViewModel()).getSportData();
        Long lValueOf = sportData2 != null ? Long.valueOf(sportData2.getSportDurtaion()) : null;
        Intrinsics.checkNotNull(lValueOf);
        if (lValueOf.longValue() >= 30) {
            ((JumpingSportVM) getMViewModel()).finishSport();
        } else {
            askExitSportDialog();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        setMBinding(binding(layoutInflater, layoutResID, null));
        super.setContentView(fvi.l);
    }

    public final void setDialogShutdown(@Nullable CommonDialog<?> commonDialog) {
        this.dialogShutdown = commonDialog;
    }

    public final void setIntervalSportTargetArr(@Nullable ArrayList<IntervalSportTarget> arrayList) {
        this.intervalSportTargetArr = arrayList;
    }

    public final void setLocalLaunch(boolean z) {
        this.isLocalLaunch = z;
    }

    public final void setLocalSportType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localSportType = str;
    }
}
