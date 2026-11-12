package com.xiaomi.fitness.sport.view.sporting;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import coil.Coil;
import coil.request.ImageRequest;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import com.xiaomi.fitness.sport.view.widget.ButtonsClickListener;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import com.xiaomi.fitness.sport.viewmodel.IndoorSportVM;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.lp5;
import defpackage.rm0;
import defpackage.xri;
import defpackage.xtq;
import defpackage.zxi;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.INDOOR_SPORTING)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001IB\u0007¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0006R(\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u00101\"\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/sport/view/sporting/IndoorRunningActivity;", "Lcom/xiaomi/fitness/sport/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/IndoorSportVM;", "Lrm0;", "", "initRunningMusic", "()V", "adaptiveFullScreen", "setListener", DialWidgetType.COUNT_DOWN, "invalidate", "initData", "gymFoldConfirmDialog", "setGymStartCallback", "showCountDownDialog", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "onAttachedToWindow", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "hideRunningMusic", "", "layoutResID", "setContentView", "(I)V", LifecycleConstantKt.ON_RESUME, "outState", "onSaveInstanceState", "Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sportData", "jumpSportDetail", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", LifecycleConstantKt.ON_DESTROY, "showAdjustmentDistanceDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "gymDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getGymDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setGymDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "isLocalLaunch", "Z", "()Z", "setLocalLaunch", "(Z)V", "Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "Lkotlin/Lazy;", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "Lcom/xiaomi/fitness/sport/view/widget/RunningSportMusicView;", "indoorRunningMusicView", "Lcom/xiaomi/fitness/sport/view/widget/RunningSportMusicView;", "getIndoorRunningMusicView", "()Lcom/xiaomi/fitness/sport/view/widget/RunningSportMusicView;", "setIndoorRunningMusicView", "(Lcom/xiaomi/fitness/sport/view/widget/RunningSportMusicView;)V", "Landroid/widget/ImageView;", "indoorNoPlayer", "Landroid/widget/ImageView;", "getIndoorNoPlayer", "()Landroid/widget/ImageView;", "setIndoorNoPlayer", "(Landroid/widget/ImageView;)V", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIndoorRunningActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndoorRunningActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/IndoorRunningActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,556:1\n54#2,3:557\n24#2:560\n57#2,6:561\n63#2,2:568\n57#3:567\n*S KotlinDebug\n*F\n+ 1 IndoorRunningActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/IndoorRunningActivity\n*L\n293#1:557,3\n293#1:560\n293#1:561,6\n293#1:568,2\n293#1:567\n*E\n"})
public final class IndoorRunningActivity extends Hilt_IndoorRunningActivity<IndoorSportVM, rm0> {

    @NotNull
    public static final String TAG = "IndoorRunningActivity";

    @Nullable
    private CommonDialog<?> gymDialog;

    @Nullable
    private ImageView indoorNoPlayer;

    @Nullable
    private RunningSportMusicView indoorRunningMusicView;
    private boolean isLocalLaunch;

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver;

    public IndoorRunningActivity() {
        super(dvi.e, 0);
        this.lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u8d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRunningActivity.lockScreenReceiver_delegate$lambda$0(this.f35520a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ IndoorSportVM access$getMViewModel(IndoorRunningActivity indoorRunningActivity) {
        return (IndoorSportVM) indoorRunningActivity.getMViewModel();
    }

    private final void adaptiveFullScreen() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void countdown() {
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null && Intrinsics.areEqual(mutableLiveDataIsCountDownEnd.getValue(), Boolean.TRUE)) {
            LottieAnimationView lottieAnimationView = ((rm0) getMBinding()).Q;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                return;
            }
            return;
        }
        setCountdownMode(((rm0) getMBinding()).Q);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).countDownStart(3, 900, true);
        getHandler().postDelayed(new Runnable() { // from class: o9d
            @Override // java.lang.Runnable
            public final void run() {
                IndoorRunningActivity.countdown$lambda$6(this.f28892a);
            }
        }, 2700L);
        LottieAnimationView lottieAnimationView2 = ((rm0) getMBinding()).Q;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void countdown$lambda$6(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getDeviceType() == 0) {
            ((IndoorSportVM) this$0.getMViewModel()).startSport();
        }
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorSportVM) this$0.getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.postValue(Boolean.TRUE);
        }
        LottieAnimationView lottieAnimationView = ((rm0) this$0.getMBinding()).Q;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        this$0.initRunningMusic();
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void gymFoldConfirmDialog() {
        if (this.isLocalLaunch || !((IndoorSportVM) getMViewModel()).getIsGymStartedBool()) {
            return;
        }
        showCountDownDialog();
        setGymStartCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        LottieAnimationView lottieAnimationView;
        gymFoldConfirmDialog();
        ((IndoorSportVM) getMViewModel()).getRecordEmitter().observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c9d
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IndoorRunningActivity.initData$lambda$8(this.f5080a, (SportBasicReport) obj);
            }
        }));
        ((IndoorSportVM) getMViewModel()).setShowLoading(new Function0() { // from class: e9d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRunningActivity.initData$lambda$9(this.f16414a);
            }
        });
        ((IndoorSportVM) getMViewModel()).setHideLoading(new Function0() { // from class: g9d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        MutableLiveData<SportingData> mData = ((IndoorSportVM) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i9d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initData$lambda$11(this.f20905a, (SportingData) obj);
                }
            }));
        }
        Intent intent = getIntent();
        setDeviceType(intent.getIntExtra("DEVICE_TYPE", 0));
        ((IndoorSportVM) getMViewModel()).setDeviceType(getDeviceType());
        ((IndoorSportVM) getMViewModel()).setShowAnimation(intent.getBooleanExtra("IS_SHOW_ANIMATION", true));
        this.isLocalLaunch = intent.getBooleanExtra("LOCAL_DEVICE_LAUNCH", false);
        ((IndoorSportVM) getMViewModel()).setLocalLaunch(this.isLocalLaunch);
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k9d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initData$lambda$13(this.f23630a, (Boolean) obj);
                }
            }));
        }
        if (((IndoorSportVM) getMViewModel()).getIsFirstInit()) {
            if (getDeviceType() == 0) {
                if (getIsRecoverySport()) {
                    ((IndoorSportVM) getMViewModel()).startSport();
                    LottieAnimationView lottieAnimationView2 = ((rm0) getMBinding()).Q;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility(8);
                    }
                } else if (getIsRebootSport()) {
                    LottieAnimationView lottieAnimationView3 = ((rm0) getMBinding()).Q;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setVisibility(8);
                    }
                } else if (SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).hasOngoingSport()) {
                    ((IndoorSportVM) getMViewModel()).restartActivity();
                    LottieAnimationView lottieAnimationView4 = ((rm0) getMBinding()).Q;
                    if (lottieAnimationView4 != null) {
                        lottieAnimationView4.setVisibility(8);
                    }
                } else {
                    countdown();
                }
            } else if (this.isLocalLaunch) {
                FitnessLogUtils.i("IndoorSportVM", "start sport from device");
                ((IndoorSportVM) getMViewModel()).startSport();
                ((IndoorSportVM) getMViewModel()).startTrack();
                if (((IndoorSportVM) getMViewModel()).getIsShowAnimation()) {
                    countdown();
                } else {
                    LottieAnimationView lottieAnimationView5 = ((rm0) getMBinding()).Q;
                    if (lottieAnimationView5 != null) {
                        lottieAnimationView5.setVisibility(8);
                    }
                }
            } else {
                showCountDownDialog();
                ((IndoorSportVM) getMViewModel()).setGymStartedBool(true);
                ((IndoorSportVM) getMViewModel()).startSport();
                setGymStartCallback();
            }
        } else if (!((IndoorSportVM) getMViewModel()).getIsGymStartedBool() && (lottieAnimationView = ((rm0) getMBinding()).Q) != null) {
            lottieAnimationView.setVisibility(8);
        }
        ((IndoorSportVM) getMViewModel()).setFirstInit(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$11(IndoorRunningActivity this$0, SportingData sportingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i("CommonSportModel", "data is received --------start ");
        if (sportingData != null) {
            if (SportBeanHelperExtKt.getSupportsSportBeanAccessoryWithNoPrimaryDevice()) {
                sportingData.getMap().put(CommonSportModel.SportTitle.connectDevice, this$0.getString(c1j.f4));
            }
            ((rm0) this$0.getMBinding()).B0(sportingData.getList());
            ((rm0) this$0.getMBinding()).C0(sportingData.getMap());
            FitnessLogUtils.i("CommonSportModel", "data is received by UI");
            if (this$0.isSportBeanMode()) {
                CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
                SportBeanUiDataModel uiDataListModel$default = CommonSportModelUtil.getUiDataListModel$default(commonSportModelUtil, sportingData.getList(), false, 2, null);
                int landingImageResId = commonSportModelUtil.getUiDataListModel(((rm0) this$0.getMBinding()).A0(), false).getLandingImageResId();
                ImageView imageView = ((rm0) this$0.getMBinding()).O;
                if (imageView != null) {
                    Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(Integer.valueOf(landingImageResId)).target(imageView).build());
                }
                FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                this$0.analyzeLowBatteryCommandAndShowDialogOnceIfNeed(uiDataListModel$default, supportFragmentManager);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$13(IndoorRunningActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = AppUtil.getApp().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        Sensor defaultSensor = ((SensorManager) systemService).getDefaultSensor(33171041);
        int i = 1;
        if (this$0.getDeviceType() == 1 || defaultSensor != null) {
            if (bool.booleanValue() && !this$0.isSportBeanMode()) {
                i = 2;
            }
            this$0.setRequestedOrientation(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$8(IndoorRunningActivity this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportBasicReport != null) {
            Bundle bundle = new Bundle();
            int iA = lp5.a(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putInt("sport_type", iA);
            SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), this$0, bundle, sportBasicReport, false, 8, null);
            this$0.finish();
        } else if (((IndoorSportVM) this$0.getMViewModel()).getDistance() < 100) {
            this$0.showShortDistanceDialog();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$9(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(c1j.F0, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRunningMusic() {
        FitnessLogUtils.d(TAG, "initRunningMusic");
        this.indoorRunningMusicView = (RunningSportMusicView) findViewById(xri.D2);
        this.indoorNoPlayer = (ImageView) findViewById(xri.C2);
        if (Intrinsics.areEqual(SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isShowMusicPlyer(), Boolean.TRUE)) {
            ((IndoorSportVM) getMViewModel()).getIsFirstInit();
            RunningSportMusicView runningSportMusicView = this.indoorRunningMusicView;
            if (runningSportMusicView != null) {
                runningSportMusicView.setOnButtonsClickListener(new ButtonsClickListener() { // from class: com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity.initRunningMusic.1
                    @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
                    public void onNextButtonClick() {
                        IndoorRunningActivity.access$getMViewModel(IndoorRunningActivity.this).nextSong();
                    }

                    @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
                    public void onPauseOrPlayButtonClick() {
                        IndoorRunningActivity.access$getMViewModel(IndoorRunningActivity.this).toggleMusic();
                    }

                    @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
                    public void onPlayListButtonClick() {
                        IndoorRunningActivity.access$getMViewModel(IndoorRunningActivity.this).toMusicZone(IndoorRunningActivity.this);
                    }

                    @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
                    public void onPreButtonClick() {
                        IndoorRunningActivity.access$getMViewModel(IndoorRunningActivity.this).preSong();
                    }
                });
            }
            ((IndoorSportVM) getMViewModel()).getUpdateMusicInfo().observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n8d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initRunningMusic$lambda$1(this.f27651a, (MusicData) obj);
                }
            }));
            ((IndoorSportVM) getMViewModel()).getUpdateMusicState().observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y8d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRunningActivity.initRunningMusic$lambda$2(this.f39927a, (Boolean) obj);
                }
            }));
            return;
        }
        RunningSportMusicView runningSportMusicView2 = this.indoorRunningMusicView;
        if (runningSportMusicView2 != null) {
            ViewExtKt.gone(runningSportMusicView2);
        }
        ImageView imageView = this.indoorNoPlayer;
        if (imageView != null) {
            ViewExtKt.gone(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRunningMusic$lambda$1(IndoorRunningActivity this$0, MusicData musicData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.indoorNoPlayer;
        if (imageView != null) {
            ViewExtKt.gone(imageView);
        }
        RunningSportMusicView runningSportMusicView = this$0.indoorRunningMusicView;
        if (runningSportMusicView != null) {
            ViewExtKt.visible(runningSportMusicView);
        }
        RunningSportMusicView runningSportMusicView2 = this$0.indoorRunningMusicView;
        if (runningSportMusicView2 != null) {
            runningSportMusicView2.bindData(musicData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRunningMusic$lambda$2(IndoorRunningActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RunningSportMusicView runningSportMusicView = this$0.indoorRunningMusicView;
        if (runningSportMusicView != null) {
            runningSportMusicView.updateMusicPlayState(bool);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidate() {
        ((rm0) getMBinding()).getRoot().setVisibility(8);
        ((rm0) getMBinding()).getRoot().post(new Runnable() { // from class: w8d
            @Override // java.lang.Runnable
            public final void run() {
                IndoorRunningActivity.invalidate$lambda$7(this.f37719a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invalidate$lambda$7(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((rm0) this$0.getMBinding()).getRoot().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockScreenReceiver lockScreenReceiver_delegate$lambda$0(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new LockScreenReceiver(this$0.getWearMode());
    }

    private final void registerLockScreenReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(getLockScreenReceiver(), intentFilter);
        Logger.d(TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setGymStartCallback() {
        ((IndoorSportVM) getMViewModel()).isGymStarted().observe(this, new IndoorRunningActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a9d
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IndoorRunningActivity.setGymStartCallback$lambda$14(this.f799a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGymStartCallback$lambda$14(IndoorRunningActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i("IndoorSportVM", "get device info " + bool);
        if (bool.booleanValue()) {
            CommonDialog<?> commonDialog = this$0.gymDialog;
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
            this$0.countdown();
        } else {
            ToastUtil.showShortToast(c1j.n);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    private final void setListener() {
        ((ImageView) findViewById(xri.k6)).setOnClickListener(new View.OnClickListener() { // from class: r8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRunningActivity.setListener$lambda$4(this.f32317a, view);
            }
        });
        ((ImageView) findViewById(xri.C2)).setOnClickListener(new View.OnClickListener() { // from class: s8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRunningActivity.setListener$lambda$5(this.f33406a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(IndoorRunningActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoSportConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(IndoorRunningActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((IndoorSportVM) this$0.getMViewModel()).toMusicZone(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showAdjustmentDistanceDialog$lambda$20(final IndoorRunningActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((CommonSportModel) ((IndoorSportVM) this$0.getMViewModel()).getMModel()).isValidHabitCreateTrainingPlan(((IndoorSportVM) this$0.getMViewModel()).getDistance())) {
            ((IndoorSportVM) this$0.getMViewModel()).hadAdjustmentDistance(((IndoorSportVM) this$0.getMViewModel()).getDistance());
            CommonDialog<?> dialog = this$0.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
            BaseSportingActivity.showHabitPop$default(this$0, ((IndoorSportVM) this$0.getMViewModel()).getDistance(), null, 2, null);
            return;
        }
        if (((CommonSportModel) ((IndoorSportVM) this$0.getMViewModel()).getMModel()).isValidHabitTrainingPlan()) {
            CommonDialog<?> dialog2 = this$0.getDialog();
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this$0.showHabitPop(((IndoorSportVM) this$0.getMViewModel()).getDistance(), new Function0() { // from class: t8d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndoorRunningActivity.showAdjustmentDistanceDialog$lambda$20$lambda$19(this.f34451a);
                }
            });
            return;
        }
        ((IndoorSportVM) this$0.getMViewModel()).hadAdjustmentDistance(((IndoorSportVM) this$0.getMViewModel()).getDistance());
        CommonDialog<?> dialog3 = this$0.getDialog();
        if (dialog3 != null) {
            dialog3.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showAdjustmentDistanceDialog$lambda$20$lambda$19(IndoorRunningActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((IndoorSportVM) this$0.getMViewModel()).hadAdjustmentDistance(((IndoorSportVM) this$0.getMViewModel()).getDistance());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showAdjustmentDistanceDialog$lambda$22(EditText editText, final IndoorRunningActivity this$0, View view) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float f = 0.0f;
        if (editText != null) {
            try {
                Editable text = editText.getText();
                if (text != null && (string = text.toString()) != null) {
                    f = Float.parseFloat(string);
                }
            } catch (NumberFormatException unused) {
            }
        }
        Pair<Float, Float> adjustmentDisInterval = ((IndoorSportVM) this$0.getMViewModel()).getAdjustmentDisInterval();
        if (f < adjustmentDisInterval.getFirst().floatValue() || f > adjustmentDisInterval.getSecond().floatValue()) {
            ToastUtil.showShortToast(this$0.getString(c1j.U, adjustmentDisInterval.getFirst(), adjustmentDisInterval.getSecond()));
            return;
        }
        final int i = (int) (f * 1000);
        if (((CommonSportModel) ((IndoorSportVM) this$0.getMViewModel()).getMModel()).isValidHabitCreateTrainingPlan(i)) {
            ((IndoorSportVM) this$0.getMViewModel()).hadAdjustmentDistance(i);
            CommonDialog<?> dialog = this$0.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
            BaseSportingActivity.showHabitPop$default(this$0, i, null, 2, null);
            return;
        }
        if (((CommonSportModel) ((IndoorSportVM) this$0.getMViewModel()).getMModel()).isValidHabitTrainingPlan()) {
            CommonDialog<?> dialog2 = this$0.getDialog();
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this$0.showHabitPop(i, new Function0() { // from class: v8d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndoorRunningActivity.showAdjustmentDistanceDialog$lambda$22$lambda$21(this.f36612a, i);
                }
            });
            return;
        }
        ((IndoorSportVM) this$0.getMViewModel()).hadAdjustmentDistance(i);
        CommonDialog<?> dialog3 = this$0.getDialog();
        if (dialog3 != null) {
            dialog3.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showAdjustmentDistanceDialog$lambda$22$lambda$21(IndoorRunningActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((IndoorSportVM) this$0.getMViewModel()).hadAdjustmentDistance(i);
        return Unit.INSTANCE;
    }

    private final void showCountDownDialog() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (Intrinsics.areEqual((wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel(), "ksmb.treadmill.m1v1")) {
            View viewInflate = LayoutInflater.from(this).inflate(dvi.t1, (ViewGroup) null);
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("gym").setCustomView(viewInflate).setCanceledOnTouchOutside(false).create();
            this.gymDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            ((TextView) viewInflate.findViewById(xri.b4)).setOnClickListener(new View.OnClickListener() { // from class: m9d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IndoorRunningActivity.showCountDownDialog$lambda$15(this.f25915a, view);
                }
            });
            CommonDialog<?> commonDialog = this.gymDialog;
            if (commonDialog != null) {
                commonDialog.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCountDownDialog$lambda$15(IndoorRunningActivity this$0, View view) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (did = wearableDeviceModelCurGymDeviceModel.getDid()) == null) {
            did = "";
        }
        deviceManagerExtKt.disconnectDevice(did);
        this$0.finish();
    }

    private final void unregisterLockScreenReceiver() {
        if (getIsBackgroundProcessAlive()) {
            LockScreenReceiver.INSTANCE.unregisterPhoneListener();
            unregisterReceiver(getLockScreenReceiver());
            Logger.d(TAG, "lockScreenReceiver successfully unregistered!!!");
        }
    }

    @Nullable
    public final CommonDialog<?> getGymDialog() {
        return this.gymDialog;
    }

    @Nullable
    public final ImageView getIndoorNoPlayer() {
        return this.indoorNoPlayer;
    }

    @Nullable
    public final RunningSportMusicView getIndoorRunningMusicView() {
        return this.indoorRunningMusicView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    @NotNull
    public SportCommandView getSportCommandView() {
        SportCommandView sportCommandView = ((rm0) getMBinding()).d0;
        Intrinsics.checkNotNullExpressionValue(sportCommandView, "sportCommandView");
        return sportCommandView;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    public void hideRunningMusic() {
        if (Intrinsics.areEqual(SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isShowMusicPlyer(), Boolean.TRUE)) {
            RunningSportMusicView runningSportMusicView = this.indoorRunningMusicView;
            if (runningSportMusicView != null) {
                ViewExtKt.gone(runningSportMusicView);
            }
            ImageView imageView = this.indoorNoPlayer;
            if (imageView != null) {
                ViewExtKt.visible(imageView);
            }
        }
    }

    /* JADX INFO: renamed from: isLocalLaunch, reason: from getter */
    public final boolean getIsLocalLaunch() {
        return this.isLocalLaunch;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    public void jumpSportDetail(@Nullable SportData sportData) {
        FitnessLogUtils.i(TAG, "jumpSportDetail , deviceType:" + getDeviceType());
        if (getDeviceType() == 0) {
            super.jumpSportDetail(sportData);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        int safeInsetTop;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            DisplayCutout displayCutout = getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                List boundingRects = displayCutout.getBoundingRects();
                Intrinsics.checkNotNullExpressionValue(boundingRects, "getBoundingRects(...)");
                if (!boundingRects.isEmpty()) {
                    safeInsetTop = getRequestedOrientation() == 1 ? displayCutout.getSafeInsetTop() : displayCutout.getSafeInsetLeft();
                } else {
                    safeInsetTop = 0;
                }
            } else {
                safeInsetTop = 0;
            }
            if (getRequestedOrientation() != 2) {
                safeInsetTop = 0;
            }
            ConstraintLayout constraintLayout = ((rm0) getMBinding()).H;
            if (constraintLayout != null) {
                constraintLayout.setPadding(safeInsetTop, 0, 0, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.Hilt_IndoorRunningActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adaptiveFullScreen();
        if (getIsBackgroundProcessAlive()) {
            setActionBarDisplayable(false);
            initData();
            setListener();
            registerLockScreenReceiver();
        }
        boolean zIsSportBeanWearModeAndHasRunningPosture = isSportBeanWearModeAndHasRunningPosture();
        NestedScrollView nestedScrollView = ((rm0) getMBinding()).D;
        if (nestedScrollView != null) {
            ViewExtKt.setVisible(nestedScrollView, zIsSportBeanWearModeAndHasRunningPosture);
        }
        if (zIsSportBeanWearModeAndHasRunningPosture) {
            NestedScrollView nestedScrollView2 = ((rm0) getMBinding()).D;
            TextView textView = ((rm0) getMBinding()).b0;
            ImageView imageView = ((rm0) getMBinding()).B;
            ImageView imageView2 = ((rm0) getMBinding()).A;
            xtq xtqVar = ((rm0) getMBinding()).i0;
            setDrawerHolder(new SportBeanRunningPostureDrawerHolder(nestedScrollView2, textView, imageView, imageView2, xtqVar != null ? xtqVar.getRoot() : null, this, false));
            SportBeanRunningPostureDrawerHolder drawerHolder = getDrawerHolder();
            if (drawerHolder != null) {
                drawerHolder.initDrawerHolder();
            }
        }
        ((IndoorSportVM) getMViewModel()).getIsFirstInit();
        initRunningMusic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.Hilt_IndoorRunningActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RunningSportMusicView runningSportMusicView = ((rm0) getMBinding()).N;
        if (runningSportMusicView != null) {
            runningSportMusicView.onDestroy();
        }
        unregisterLockScreenReceiver();
        LottieAnimationView lottieAnimationView = ((rm0) getMBinding()).Q;
        if (lottieAnimationView != null) {
            lottieAnimationView.k();
            lottieAnimationView.x();
            lottieAnimationView.y();
        }
        ((IndoorSportVM) getMViewModel()).getRecordEmitter().removeObservers(this);
        ((IndoorSportVM) getMViewModel()).isGymStarted().removeObservers(this);
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.removeObservers(this);
        }
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        invalidate();
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        CommonDialog<?> commonDialog = this.gymDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        this.gymDialog = null;
        super.onSaveInstanceState(outState);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        setMBinding(binding(layoutInflater, layoutResID, null));
        super.setContentView(dvi.e);
    }

    public final void setGymDialog(@Nullable CommonDialog<?> commonDialog) {
        this.gymDialog = commonDialog;
    }

    public final void setIndoorNoPlayer(@Nullable ImageView imageView) {
        this.indoorNoPlayer = imageView;
    }

    public final void setIndoorRunningMusicView(@Nullable RunningSportMusicView runningSportMusicView) {
        this.indoorRunningMusicView = runningSportMusicView;
    }

    public final void setLocalLaunch(boolean z) {
        this.isLocalLaunch = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    public void showAdjustmentDistanceDialog() {
        if (((IndoorSportVM) getMViewModel()).getDistance() < 100 || this.isLocalLaunch || ((IndoorSportVM) getMViewModel()).getIsGymStartedBool()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(dvi.n, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(xri.f);
        editText.setText(String.valueOf(((IndoorSportVM) getMViewModel()).getDistance() / 1000.0f));
        ((Button) viewInflate.findViewById(xri.Q3)).setOnClickListener(new View.OnClickListener() { // from class: p8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRunningActivity.showAdjustmentDistanceDialog$lambda$20(this.f30120a, view);
            }
        });
        ((Button) viewInflate.findViewById(xri.s4)).setOnClickListener(new View.OnClickListener() { // from class: q8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRunningActivity.showAdjustmentDistanceDialog$lambda$22(editText, this, view);
            }
        });
        new CommonDialog.c("adjustmentDis").setDialogTitle(c1j.V).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getResources().getQuantityString(zxi.e, (int) ((IndoorSportVM) getMViewModel()).getAdjustmentDisInterval().getSecond().floatValue(), ((IndoorSportVM) getMViewModel()).getAdjustmentDisInterval().getFirst(), ((IndoorSportVM) getMViewModel()).getAdjustmentDisInterval().getSecond()))).setCustomView(viewInflate).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create().showIfNeed(getSupportFragmentManager());
    }
}
