package com.xiaomi.fitness.sport_eco.view.sporting;

import android.animation.Animator;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import com.xiaomi.fitness.sport_eco.viewmodel.IndoorRidingSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.e1j;
import defpackage.foi;
import defpackage.fvi;
import defpackage.lp5;
import defpackage.m0d;
import defpackage.ri0;
import defpackage.zri;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.INDOOR_RIDING_SPORTING)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0007¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0006R(\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/sporting/IndoorRidingActivity;", "Lcom/xiaomi/fitness/sport_eco/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/IndoorRidingSportVM;", "Lri0;", "", "adaptiveFullScreen", "()V", "setListener", DialWidgetType.COUNT_DOWN, "initData", "initCountDownDialog", "setGymStartCallback", "showCountDownDialog", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "onAttachedToWindow", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "layoutResID", "setContentView", "(I)V", "Lm0d;", "callback", "onViewFinish", "(Lm0d;)V", "outState", "onSaveInstanceState", "Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "jumpSportDetail", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "gymDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getGymDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setGymDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "isDeviceLaunch", "Z", "()Z", "setDeviceLaunch", "(Z)V", "", "localSportType", "Ljava/lang/String;", "getLocalSportType", "()Ljava/lang/String;", "setLocalSportType", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "Lkotlin/Lazy;", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIndoorRidingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndoorRidingActivity.kt\ncom/xiaomi/fitness/sport_eco/view/sporting/IndoorRidingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
public final class IndoorRidingActivity extends Hilt_IndoorRidingActivity<IndoorRidingSportVM, ri0> {

    @NotNull
    public static final String TAG = "IndoorRidingActivity";

    @Nullable
    private CommonDialog<?> gymDialog;
    private boolean isDeviceLaunch;

    @NotNull
    private String localSportType;

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity$initData$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity$initData$7", f = "IndoorRidingActivity.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndoorRidingActivity.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual(IndoorRidingActivity.access$getMViewModel(IndoorRidingActivity.this).isGymStarted().getValue(), Boxing.boxBoolean(false))) {
                IndoorRidingActivity.this.showCountDownDialog();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public IndoorRidingActivity() {
        super(fvi.f18291b, 0);
        this.localSportType = "runmi.exbike.jscrm1";
        this.lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y7d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRidingActivity.lockScreenReceiver_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ri0 access$getMBinding(IndoorRidingActivity indoorRidingActivity) {
        return (ri0) indoorRidingActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ IndoorRidingSportVM access$getMViewModel(IndoorRidingActivity indoorRidingActivity) {
        return (IndoorRidingSportVM) indoorRidingActivity.getMViewModel();
    }

    private final void adaptiveFullScreen() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void countdown() {
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorRidingSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null && Intrinsics.areEqual(mutableLiveDataIsCountDownEnd.getValue(), Boolean.TRUE)) {
            LottieAnimationView lottieAnimationView = ((ri0) getMBinding()).I;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                return;
            }
            return;
        }
        setCountdownMode(((ri0) getMBinding()).I);
        LottieAnimationView lottieAnimationView2 = ((ri0) getMBinding()).I;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.i(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity.countdown.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    if (IndoorRidingActivity.this.getDeviceType() == 0) {
                        IndoorRidingActivity.access$getMViewModel(IndoorRidingActivity.this).startSport();
                    }
                    MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd2 = IndoorRidingActivity.access$getMViewModel(IndoorRidingActivity.this).isCountDownEnd();
                    if (mutableLiveDataIsCountDownEnd2 != null) {
                        mutableLiveDataIsCountDownEnd2.postValue(Boolean.TRUE);
                    }
                    LottieAnimationView lottieAnimationView3 = IndoorRidingActivity.access$getMBinding(IndoorRidingActivity.this).I;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setVisibility(8);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).countDownStart(3, 900, true);
                }
            });
        }
        LottieAnimationView lottieAnimationView3 = ((ri0) getMBinding()).I;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.w();
        }
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    private final void initCountDownDialog() {
        View viewInflate = LayoutInflater.from(this).inflate(fvi.n0, (ViewGroup) null);
        if (Intrinsics.areEqual(this.localSportType, "runmi.exbike.jscrm1") || Intrinsics.areEqual(this.localSportType, "yesoul.exbike.jsc01y")) {
            ((ImageView) viewInflate.findViewById(zri.m)).setImageResource(foi.I);
        } else {
            ((ImageView) viewInflate.findViewById(zri.m)).setImageResource(foi.o);
        }
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("gym").setCustomView(viewInflate).setCanceledOnTouchOutside(false).create();
        this.gymDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        ((TextView) viewInflate.findViewById(zri.n1)).setOnClickListener(new View.OnClickListener() { // from class: v7d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRidingActivity.initCountDownDialog$lambda$9(this.f36587a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCountDownDialog$lambda$9(IndoorRidingActivity this$0, View view) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this$0.localSportType);
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        ecoDeviceManagerExtKt.disconnectDevice(did);
        FitnessLogUtils.d(TAG, "finish");
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        LottieAnimationView lottieAnimationView;
        initCountDownDialog();
        if (!this.isDeviceLaunch && ((IndoorRidingSportVM) getMViewModel()).getIsGymStartedBool()) {
            showCountDownDialog();
            setGymStartCallback();
        }
        ((IndoorRidingSportVM) getMViewModel()).getRecordEmitter().observe(this, new IndoorRidingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z7d
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IndoorRidingActivity.initData$lambda$3(this.f40981a, (SportBasicReport) obj);
            }
        }));
        ((IndoorRidingSportVM) getMViewModel()).setShowLoading(new Function0() { // from class: a8d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRidingActivity.initData$lambda$4(this.f765a);
            }
        });
        ((IndoorRidingSportVM) getMViewModel()).setHideLoading(new Function0() { // from class: b8d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndoorRidingActivity.initData$lambda$5(this.f3920a);
            }
        });
        MutableLiveData<SportingData> mData = ((IndoorRidingSportVM) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new IndoorRidingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c8d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRidingActivity.initData$lambda$6(this.f5047a, (SportingData) obj);
                }
            }));
        }
        Intent intent = getIntent();
        setDeviceType(intent.getIntExtra("DEVICE_TYPE", 0));
        ((IndoorRidingSportVM) getMViewModel()).setDeviceType(getDeviceType());
        ((IndoorRidingSportVM) getMViewModel()).setShowAnimation(intent.getBooleanExtra("IS_SHOW_ANIMATION", true));
        this.isDeviceLaunch = intent.getBooleanExtra("LOCAL_DEVICE_LAUNCH", false);
        String stringExtra = intent.getStringExtra(SportConstants.KEY_GYM_MODE_TYPE);
        if (stringExtra == null) {
            stringExtra = "ksmb.treadmill.m1v1";
        }
        this.localSportType = stringExtra;
        MutableLiveData<Boolean> mutableLiveDataIsCountDownEnd = ((IndoorRidingSportVM) getMViewModel()).isCountDownEnd();
        if (mutableLiveDataIsCountDownEnd != null) {
            mutableLiveDataIsCountDownEnd.observe(this, new IndoorRidingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d8d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IndoorRidingActivity.initData$lambda$8(this.f15212a, (Boolean) obj);
                }
            }));
        }
        if (((IndoorRidingSportVM) getMViewModel()).getIsFirstInit()) {
            if (getDeviceType() == 0) {
                if (getIsRecoverySport()) {
                    ((IndoorRidingSportVM) getMViewModel()).startSport();
                    LottieAnimationView lottieAnimationView2 = ((ri0) getMBinding()).I;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility(8);
                    }
                } else if (getIsRebootSport()) {
                    LottieAnimationView lottieAnimationView3 = ((ri0) getMBinding()).I;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setVisibility(8);
                    }
                } else {
                    countdown();
                }
            } else if (this.isDeviceLaunch) {
                ((IndoorRidingSportVM) getMViewModel()).startSport();
                ((IndoorRidingSportVM) getMViewModel()).startTrack();
                if (((IndoorRidingSportVM) getMViewModel()).getIsShowAnimation()) {
                    countdown();
                } else {
                    LottieAnimationView lottieAnimationView4 = ((ri0) getMBinding()).I;
                    if (lottieAnimationView4 != null) {
                        lottieAnimationView4.setVisibility(8);
                    }
                }
            } else {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass7(null), 3, null);
                ((IndoorRidingSportVM) getMViewModel()).setGymStartedBool(true);
                ((IndoorRidingSportVM) getMViewModel()).startSport();
                setGymStartCallback();
            }
        } else if (!((IndoorRidingSportVM) getMViewModel()).getIsGymStartedBool() && (lottieAnimationView = ((ri0) getMBinding()).I) != null) {
            lottieAnimationView.setVisibility(8);
        }
        ((IndoorRidingSportVM) getMViewModel()).setFirstInit(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$3(IndoorRidingActivity this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (sportBasicReport != null) {
            Bundle bundle = new Bundle();
            int iA = lp5.a(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putInt("sport_type", iA);
            SportRecordApiKt.getSportRecordApi().goEcoSportBicycleDetail(this$0, bundle, sportBasicReport);
            FitnessLogUtils.d(TAG, "finish");
            this$0.finish();
        } else if (((IndoorRidingSportVM) this$0.getMViewModel()).getDistance() < 100) {
            FitnessLogUtils.d(TAG, "from jumpSportDetail in observe");
            this$0.showShortDistanceDialog();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$4(IndoorRidingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(e1j.W, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5(IndoorRidingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$6(IndoorRidingActivity this$0, SportingData sportingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportingData != null) {
            ((ri0) this$0.getMBinding()).A0(sportingData.getList());
            ((ri0) this$0.getMBinding()).B0(sportingData.getMap());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$8(IndoorRidingActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setRequestedOrientation(bool.booleanValue() ? 2 : 1);
        Object systemService = AppUtil.getApp().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        Sensor defaultSensor = ((SensorManager) systemService).getDefaultSensor(33171041);
        if (this$0.getDeviceType() == 1 || defaultSensor != null) {
            this$0.setRequestedOrientation(bool.booleanValue() ? 4 : 1);
        }
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
        FitnessLogUtils.d(TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setGymStartCallback() {
        ((IndoorRidingSportVM) getMViewModel()).isGymStarted().observe(this, new IndoorRidingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w7d
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IndoorRidingActivity.setGymStartCallback$lambda$12(this.f37684a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGymStartCallback$lambda$12(IndoorRidingActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            CommonDialog<?> commonDialog = this$0.gymDialog;
            if (commonDialog != null) {
                if (!commonDialog.isShowing()) {
                    commonDialog = null;
                }
                if (commonDialog != null) {
                    commonDialog.dismissAllowingStateLoss();
                }
            }
            this$0.countdown();
        } else {
            FitnessLogUtils.d(TAG, "finish");
            ToastUtil.showShortToast(e1j.course_device_busy);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    private final void setListener() {
        ((ImageView) findViewById(zri.g2)).setOnClickListener(new View.OnClickListener() { // from class: x7d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorRidingActivity.setListener$lambda$2(this.f38784a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(IndoorRidingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoSportConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCountDownDialog() {
        CommonDialog<?> commonDialog = this.gymDialog;
        if (commonDialog != null) {
            if (!(!commonDialog.isShowing())) {
                commonDialog = null;
            }
            if (commonDialog != null) {
                commonDialog.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    private final void unregisterLockScreenReceiver() {
        if (getIsBackgroundProcessAlive()) {
            LockScreenReceiver.INSTANCE.unregisterPhoneListener();
            unregisterReceiver(getLockScreenReceiver());
            FitnessLogUtils.d(TAG, "lockScreenReceiver successfully unregistered!!!");
        }
    }

    @Nullable
    public final CommonDialog<?> getGymDialog() {
        return this.gymDialog;
    }

    @NotNull
    public final String getLocalSportType() {
        return this.localSportType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity
    @NotNull
    public SportCommandView getSportCommandView() {
        SportCommandView sportCommandView = ((ri0) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(sportCommandView, "sportCommandView");
        return sportCommandView;
    }

    /* JADX INFO: renamed from: isDeviceLaunch, reason: from getter */
    public final boolean getIsDeviceLaunch() {
        return this.isDeviceLaunch;
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity
    public void jumpSportDetail() {
        if (getDeviceType() == 0) {
            FitnessLogUtils.d(TAG, "from jumpSportDetail in riding");
            super.jumpSportDetail();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        int safeInsetTop;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 2;
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
            ConstraintLayout constraintLayout = ((ri0) getMBinding()).C;
            if (constraintLayout != null) {
                constraintLayout.setPadding(safeInsetTop, 0, 0, 0);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.Hilt_IndoorRidingActivity, com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(null);
        adaptiveFullScreen();
        if (getIsBackgroundProcessAlive()) {
            setActionBarDisplayable(false);
            initData();
            setListener();
            registerLockScreenReceiver();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.sporting.Hilt_IndoorRidingActivity, com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterLockScreenReceiver();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        CommonDialog<?> commonDialog = this.gymDialog;
        if (commonDialog != null) {
            if (!commonDialog.isShowing()) {
                commonDialog = null;
            }
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
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
        super.setContentView(fvi.f18291b);
    }

    public final void setDeviceLaunch(boolean z) {
        this.isDeviceLaunch = z;
    }

    public final void setGymDialog(@Nullable CommonDialog<?> commonDialog) {
        this.gymDialog = commonDialog;
    }

    public final void setLocalSportType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localSportType = str;
    }
}
