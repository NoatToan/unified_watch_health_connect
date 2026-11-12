package com.xiaomi.hm.health.bodyfat.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.ScaleBalanceData;
import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.huami.bluetooth.profile.channel.module.scale.BalanceResult;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.MeasureBalanceState;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.worker.UploadWeightInfoWorker;
import com.xiaomi.hm.health.bt.device.HMAmazfitScaleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "Landroidx/lifecycle/ViewModel;", "", "enable", "", "setMeasureBalanceMode", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "user", "", "score", "", "time", "saveBalanceData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState;", "a", "Landroidx/lifecycle/MutableLiveData;", "getPageIndex", "()Landroidx/lifecycle/MutableLiveData;", "pageIndex", "Lcom/huami/bluetooth/profile/channel/module/scale/BalanceResult;", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "b", "getMeasureResult", "measureResult", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasureBalanceViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<MeasureBalanceState> pageIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BalanceResult<ScaleBalanceData>> measureResult;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.MeasureBalanceViewModel$saveBalanceData$1", f = "MeasureBalanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ MeasureBalanceViewModel c;
        public final /* synthetic */ long d;
        public final /* synthetic */ UserInfos e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, MeasureBalanceViewModel measureBalanceViewModel, long j, UserInfos userInfos, int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = measureBalanceViewModel;
            this.d = j;
            this.e = userInfos;
            this.f = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightInfos weightInfos = new WeightInfos();
            long j = this.d;
            UserInfos userInfos = this.e;
            int i = this.f;
            weightInfos.setWeight(Boxing.boxFloat(0.123f));
            weightInfos.setTimestamp(Boxing.boxLong(ExtentionUtilsKt.millsToSecond(j, true)));
            weightInfos.setType(Boxing.boxInt(4));
            weightInfos.setDevice_id(BFCallback.getHMDeviceManager().getBoundDeviceId(HMDeviceType.WEIGHT));
            weightInfos.setSync(Boxing.boxInt(0));
            weightInfos.setSource(Boxing.boxInt(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
            long j2 = Long.parseLong(userInfos.getUserId());
            if (j2 == Long.parseLong(BFCallback.getHMPersonInfo().getUserid())) {
                j2 = -1;
            }
            weightInfos.setUserId(Boxing.boxLong(j2));
            weightInfos.setOfmt(Boxing.boxFloat(i));
            WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfos);
            WorkManager.getInstance(this.b).enqueueUniqueWork(ParamKey.uploadWorker, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(UploadWeightInfoWorker.class).build());
            MutableLiveData<MeasureBalanceState> pageIndex = this.c.getPageIndex();
            MeasureBalanceState.Success success = MeasureBalanceState.Success.INSTANCE;
            success.setValue(Utils.toLongValue$default(Utils.INSTANCE, this.e.getUserId(), 0L, 2, null));
            Unit unit = Unit.INSTANCE;
            pageIndex.postValue(success);
            return unit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("setMeasureBalanceMode ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.MeasureBalanceViewModel$setMeasureBalanceMode$2", f = "MeasureBalanceViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ScaleSettingModule b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MeasureBalanceViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/scale/BalanceResult;", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<BalanceResult<ScaleBalanceData>, Unit> {
            public final /* synthetic */ MeasureBalanceViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MeasureBalanceViewModel measureBalanceViewModel) {
                super(1);
                this.a = measureBalanceViewModel;
            }

            public final void a(@NotNull BalanceResult<ScaleBalanceData> balanceResult) {
                this.a.getMeasureResult().postValue(balanceResult);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BalanceResult<ScaleBalanceData> balanceResult) {
                a(balanceResult);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScaleSettingModule scaleSettingModule, boolean z, MeasureBalanceViewModel measureBalanceViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = scaleSettingModule;
            this.c = z;
            this.d = measureBalanceViewModel;
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
                ScaleSettingModule scaleSettingModule = this.b;
                if (scaleSettingModule != null) {
                    boolean z = this.c;
                    a aVar = new a(this.d);
                    this.a = 1;
                    obj = scaleSettingModule.setBalanceMode(z, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.MeasureBalanceViewModel$setMeasureBalanceMode$3", f = "MeasureBalanceViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ScaleSettingModule b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MeasureBalanceViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/scale/BalanceResult;", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<BalanceResult<ScaleBalanceData>, Unit> {
            public final /* synthetic */ MeasureBalanceViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MeasureBalanceViewModel measureBalanceViewModel) {
                super(1);
                this.a = measureBalanceViewModel;
            }

            public final void a(@NotNull BalanceResult<ScaleBalanceData> balanceResult) {
                this.a.getMeasureResult().postValue(balanceResult);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BalanceResult<ScaleBalanceData> balanceResult) {
                a(balanceResult);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ScaleSettingModule scaleSettingModule, boolean z, MeasureBalanceViewModel measureBalanceViewModel, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = scaleSettingModule;
            this.c = z;
            this.d = measureBalanceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScaleSettingModule scaleSettingModule = this.b;
                if (scaleSettingModule != null) {
                    boolean z = this.c;
                    a aVar = new a(this.d);
                    this.a = 1;
                    obj = scaleSettingModule.setBalanceMode(z, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public MeasureBalanceViewModel() {
        MutableLiveData<MeasureBalanceState> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(MeasureBalanceState.Prepare.INSTANCE);
        Unit unit = Unit.INSTANCE;
        this.pageIndex = mutableLiveData;
        this.measureResult = new MutableLiveData<>();
    }

    @NotNull
    public final MutableLiveData<BalanceResult<ScaleBalanceData>> getMeasureResult() {
        return this.measureResult;
    }

    @NotNull
    public final MutableLiveData<MeasureBalanceState> getPageIndex() {
        return this.pageIndex;
    }

    public final void saveBalanceData(@NotNull Context context, @NotNull UserInfos user, int score, long time) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(context, this, time, user, score, null), 2, null);
    }

    public final void setMeasureBalanceMode(boolean enable) {
        HMLog.info("MeasureBalanceFragment", new b(enable));
        HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
        if (device instanceof HMAmazfitScaleDevice) {
            ScaleSettingModule scaleSettingModule = (ScaleSettingModule) ChannelModuleProvider.INSTANCE.of(device).get(ScaleSettingModule.class);
            if (enable) {
                e.f(ViewModelKt.getViewModelScope(this), null, null, new c(scaleSettingModule, enable, this, null), 3, null);
            } else {
                e.f(ViewModelKt.getViewModelScope(this), null, null, new d(scaleSettingModule, enable, this, null), 3, null);
            }
        }
    }
}
