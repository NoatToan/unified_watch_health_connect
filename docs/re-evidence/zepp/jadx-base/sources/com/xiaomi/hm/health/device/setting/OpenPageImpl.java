package com.xiaomi.hm.health.device.setting;

import android.app.Activity;
import android.content.Intent;
import com.huami.bluetooth.profile.channel.module.openapp.AppPageType;
import com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity;
import com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.ui.HeartRateActivity;
import com.huami.pai.ui.uicase.PaiDetailActivity;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.ui.activity.EcgActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.life.feature.health.IOpenPageListener;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import com.xiaomi.hm.health.ui.heartrate.HeartRateDetailActivity;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/OpenPageImpl;", "Lcom/xiaomi/hm/health/device/setting/life/feature/health/IOpenPageListener;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", DTransferConstants.PAGE, "Lkotlin/Pair;", "", "openPage", "a", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "mPreType", "", "b", "J", "mPreTime", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "openCoroutineScope", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class OpenPageImpl implements IOpenPageListener, KoinComponent {

    @NotNull
    private static final String d = "OpenAppPage";
    private static final long e = 5000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AppPageType mPreType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long mPreTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope openCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ AppPageType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AppPageType appPageType) {
            super(0);
            this.a = appPageType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "open page " + this.a + " too fast, ignore";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ AppPageType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppPageType appPageType) {
            super(0);
            this.a = appPageType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "app is in background, open " + this.a + " ignore";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.OpenPageImpl$openPage$result$1$1", f = "OpenPageImpl.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ Ref.ObjectRef<String> c;
        public final /* synthetic */ Activity d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.OpenPageImpl$openPage$result$1$1$1", f = "OpenPageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Ref.ObjectRef<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<String> objectRef, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.element = SportDataManager.getInstance().getLastDataDate();
                String str = this.b.element;
                if (str == null || str.length() == 0) {
                    this.b.element = SportDay.getToday().getKey();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Intent intent, Ref.ObjectRef<String> objectRef, Activity activity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = intent;
            this.c = objectRef;
            this.d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.putExtra("key", this.c.element);
            this.b.setFlags(268435456);
            this.d.startActivity(this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ AppPageType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AppPageType appPageType) {
            super(0);
            this.a = appPageType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "open " + this.a.getDesc() + " error";
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.device.setting.life.feature.health.IOpenPageListener
    @NotNull
    public Pair<Boolean, AppPageType> openPage(@NotNull AppPageType page) {
        Object objM3845constructorimpl;
        Scope rootScope;
        KClass<?> orCreateKotlinClass;
        if (Intrinsics.areEqual(this.mPreType, page) && System.currentTimeMillis() - this.mPreTime <= 5000) {
            HMLog.info(d, new a(page));
            return new Pair<>(Boolean.TRUE, page);
        }
        HMDeviceManager.getInstance().startSyncData(HMDeviceType.MILI);
        Activity topActivity = BraceletForegroundCallBack.getTopActivity();
        if (topActivity == null) {
            Pair<Boolean, AppPageType> pair = new Pair<>(Boolean.TRUE, page);
            HMLog.info(d, new b(page));
            return pair;
        }
        boolean z = true;
        try {
            Result.Companion companion = Result.Companion;
            if (Intrinsics.areEqual(page, AppPageType.Hr.INSTANCE)) {
                if (!(topActivity instanceof HeartRateDetailActivity)) {
                    HeartRateActivity.Companion companion2 = HeartRateActivity.INSTANCE;
                    if (this instanceof KoinScopeComponent) {
                        rootScope = ((KoinScopeComponent) this).getScope();
                        orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserOfHeartRate.class);
                    } else {
                        rootScope = getKoin().getScopeRegistry().getRootScope();
                        orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserOfHeartRate.class);
                    }
                    companion2.launch(topActivity, (UserOfHeartRate) rootScope.get(orCreateKotlinClass, null, null));
                }
            } else if (Intrinsics.areEqual(page, AppPageType.Spo2.INSTANCE)) {
                Spo2Proxy.INSTANCE.navigateToDetailActivity(topActivity);
            } else if (Intrinsics.areEqual(page, AppPageType.Pressure.INSTANCE)) {
                HealthDataNavigator.INSTANCE.navigateToDataDetail(topActivity, StressDataType.ALL_DAY);
            } else if (Intrinsics.areEqual(page, AppPageType.Temperature.INSTANCE)) {
                if (TempUtils.INSTANCE.supportWristTempDevice()) {
                    HealthDataNavigator.INSTANCE.navigateToDataDetailNew(topActivity, TemperatureDataType.ALL_DAY);
                } else {
                    HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(topActivity, HealthDataType.TEMPERATURE);
                }
            } else if (Intrinsics.areEqual(page, AppPageType.Sleep.INSTANCE)) {
                if (!(topActivity instanceof SleepHomeActivity)) {
                    Intent intent = new Intent(topActivity, (Class<?>) SleepHomeActivity.class);
                    intent.putExtra("user_id", HMPersonInfo.getInstance().getUserInfo().getUserid());
                    intent.putExtra(SleepHomeActivity.SOURCE_FROM, 1);
                    e.f(this.openCoroutineScope, null, null, new c(intent, new Ref.ObjectRef(), topActivity, null), 3, null);
                }
            } else if (Intrinsics.areEqual(page, AppPageType.PAI.INSTANCE)) {
                if (!(topActivity instanceof PaiDetailActivity)) {
                    PaiDetailActivity.INSTANCE.startHMPai(topActivity);
                }
            } else if (Intrinsics.areEqual(page, AppPageType.Menstruation.INSTANCE)) {
                if (!(topActivity instanceof FemaleHealthActivity)) {
                    Intent intent2 = new Intent(topActivity, (Class<?>) FemaleHealthActivity.class);
                    intent2.addFlags(268435456);
                    intent2.addFlags(67108864);
                    topActivity.startActivity(intent2);
                }
            } else if (Intrinsics.areEqual(page, AppPageType.Activity.INSTANCE)) {
                if (!(topActivity instanceof GoalSummaryActivity)) {
                    Intent intent3 = new Intent(topActivity, (Class<?>) GoalSummaryActivity.class);
                    intent3.addFlags(268435456);
                    topActivity.startActivity(intent3);
                }
            } else if (Intrinsics.areEqual(page, AppPageType.ECG.INSTANCE)) {
                if (!(topActivity instanceof EcgActivity)) {
                    Intent intent4 = new Intent(topActivity, (Class<?>) EcgActivity.class);
                    intent4.addFlags(268435456);
                    intent4.addFlags(67108864);
                    topActivity.startActivity(intent4);
                }
            } else {
                if (!Intrinsics.areEqual(page, AppPageType.BloodPressure.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(topActivity instanceof BloodPressureCorrectActivity)) {
                    Intent intent5 = new Intent(topActivity, (Class<?>) BloodPressureCorrectActivity.class);
                    intent5.addFlags(268435456);
                    topActivity.startActivity(intent5);
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(true);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(d, "", thM3848exceptionOrNullimpl, new d(page));
            z = false;
        }
        if (z) {
            this.mPreType = page;
            this.mPreTime = System.currentTimeMillis();
        }
        return new Pair<>(Boolean.valueOf(z), page);
    }
}
