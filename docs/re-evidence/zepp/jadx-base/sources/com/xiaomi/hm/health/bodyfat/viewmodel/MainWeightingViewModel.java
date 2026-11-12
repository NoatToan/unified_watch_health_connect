package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceBatteryEvent;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceWeightValueEvent;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.WeightInfoCreateHelper;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0010\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0014R\u001c\u0010 \u001a\u00020\u001c8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R)\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0,0'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R#\u00101\u001a\b\u0012\u0004\u0012\u00020!0'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+R\u0018\u00104\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R)\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e050'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R#\u0010;\u001a\b\u0012\u0004\u0012\u00020!0'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u0016\u0010?\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\"R\u0016\u0010A\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\"¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "data", "", "b", ParamKey.weightData, "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "a", "Lcom/xiaomi/hm/health/bodyfat/event/BFDeviceBatteryEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/bodyfat/event/BFDeviceWeightValueEvent;", "matchUsers", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfo", "setChooseUser", "", "userId", "(Ljava/lang/Long;)V", "saveWeightData", "saveHeartRate", "savePressure", "", "state", "switchPage", "abandonWeight", "onCleared", "", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "", "Z", "isGuest", "()Z", "setGuest", "(Z)V", "Landroidx/lifecycle/MutableLiveData;", "c", "Lkotlin/Lazy;", "getWeightData", "()Landroidx/lifecycle/MutableLiveData;", "", GoogleApiAvailabilityLight.a, "getMatchUsers", "e", "getLowPower", "lowPower", "f", "Ljava/lang/Long;", ParamKey.weightId, "Lcom/huami/arch/helper/Resource;", "g", "getChooseUser", "chooseUser", "h", "getSkipMeasure", "skipMeasure", "i", "getSwitchPage", z.j, "isFinished", hl.k, "isStable", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MainWeightingViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "WeightingModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isGuest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy matchUsers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy lowPower;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Long weightId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy chooseUser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy skipMeasure;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchPage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isFinished;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isStable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel$abandonWeight$1", f = "MainWeightingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainWeightingViewModel.this.new a(continuation);
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
            Long l = MainWeightingViewModel.this.weightId;
            if (l != null) {
                WeightInfoRepository.INSTANCE.getInstance().deleteWeightById(l.longValue());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Resource<? extends UserInfos>>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<UserInfos>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<List<? extends UserInfos>>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<UserInfos>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<MutableLiveData<WeightAdvData>> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WeightAdvData> invoke() {
            return new MutableLiveData<>();
        }
    }

    public MainWeightingViewModel() {
        BFCallback.getInstance().eventBusDevice(true);
        EventBus.getDefault().register(this);
        this.weightData = LazyKt__LazyJVMKt.lazy(g.a);
        this.matchUsers = LazyKt__LazyJVMKt.lazy(d.a);
        this.lowPower = LazyKt__LazyJVMKt.lazy(c.a);
        this.chooseUser = LazyKt__LazyJVMKt.lazy(b.a);
        this.skipMeasure = LazyKt__LazyJVMKt.lazy(e.a);
        this.switchPage = LazyKt__LazyJVMKt.lazy(f.a);
    }

    private final WeightInfos a(WeightAdvData weightData) {
        WeightInfos weightInfo = this.weightId != null ? WeightInfoRepository.INSTANCE.getInstance().getWeightInfo(this.weightId.longValue()) : null;
        MeasureData measureData = weightData.getMeasureData();
        Integer numValueOf = measureData == null ? null : Integer.valueOf(measureData.getImpedance());
        int impedance = numValueOf == null ? weightData.getImpedance() : numValueOf.intValue();
        if (weightInfo == null) {
            WeightInfoCreateHelper weightInfoCreateHelper = WeightInfoCreateHelper.INSTANCE;
            Resource<UserInfos> value = getChooseUser().getValue();
            return weightInfoCreateHelper.createWeightInfo(value != null ? value.getData() : null, weightData.getTimestamp(), weightData.getValueKg(), impedance);
        }
        if (weightInfo.getBody_fat() != null || !HMWeightUtils.isValidImpedance(impedance)) {
            return weightInfo;
        }
        weightInfo.setImpedance(Integer.valueOf(impedance));
        Resource<UserInfos> value2 = getChooseUser().getValue();
        BodyParamsUtils.addBodyParams(weightInfo, value2 != null ? value2.getData() : null);
        return weightInfo;
    }

    private final void b(WeightAdvData data) {
        int i;
        int boundWeightDeviceSourceValue = BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue();
        boolean z = true;
        int i2 = 0;
        if (!(boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT.getValue() || boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT_SCALE2.getValue())) {
            if (boundWeightDeviceSourceValue != HMDeviceSource.WEIGHT_BFS.getValue() && boundWeightDeviceSourceValue != HMDeviceSource.WEIGHT_BODYFAT.getValue()) {
                z = false;
            }
            if (z) {
                data.setMeasureState(MeasureState.MEASURING_WEIGHT);
                if (data.isStable()) {
                    HMLog.v(this.mTag, "体脂称 进入测脂", new Object[0]);
                    if (data.getImpedance() == 65533) {
                        data.setMeasureState(MeasureState.MEASURING_IMPEDANCE);
                        HMLog.v(this.mTag, "体脂称 测脂失败", new Object[0]);
                        i2 = 1024;
                    } else {
                        if (data.isImpedanceStable()) {
                            data.setMeasureState(MeasureState.MEASURING_IMPEDANCE);
                            HMLog.v(this.mTag, "体脂称 测脂成功", new Object[0]);
                        }
                        i2 = 512;
                    }
                }
                if (data.isFinish()) {
                    data.setMeasureState(MeasureState.MEASURING_FINISHED);
                }
            } else {
                HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue();
                i = 0;
            }
            data.setMeasureData(new MeasureData(i, 0, data.getTimestamp(), data.getImpedance(), data.getValue(), 0, 0, -2L, 0, false, 768, null));
        }
        data.setMeasureState(MeasureState.MEASURING_WEIGHT);
        i2 = data.isStable() ? 512 : 0;
        if (data.isFinish()) {
            data.setMeasureState(MeasureState.MEASURING_FINISHED);
        }
        i = i2;
        data.setMeasureData(new MeasureData(i, 0, data.getTimestamp(), data.getImpedance(), data.getValue(), 0, 0, -2L, 0, false, 768, null));
    }

    public final void abandonWeight() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Resource<UserInfos>> getChooseUser() {
        return (MutableLiveData) this.chooseUser.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getLowPower() {
        return (MutableLiveData) this.lowPower.getValue();
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @NotNull
    public final MutableLiveData<List<UserInfos>> getMatchUsers() {
        return (MutableLiveData) this.matchUsers.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSkipMeasure() {
        return (MutableLiveData) this.skipMeasure.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getSwitchPage() {
        return (MutableLiveData) this.switchPage.getValue();
    }

    @NotNull
    public final MutableLiveData<WeightAdvData> getWeightData() {
        return (MutableLiveData) this.weightData.getValue();
    }

    /* JADX INFO: renamed from: isGuest, reason: from getter */
    public final boolean getIsGuest() {
        return this.isGuest;
    }

    public final void matchUsers(@Nullable WeightAdvData data) {
        if (getMatchUsers().getValue() == null) {
            if (this.isGuest) {
                getMatchUsers().setValue(CollectionsKt__CollectionsKt.mutableListOf(UserInfoManager.getManager().getGuest()));
            } else {
                getMatchUsers().setValue(HMWeightUtils.matchUsers(data));
            }
        }
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        BFCallback.getInstance().eventBusDevice(false);
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull BFDeviceBatteryEvent event) {
        HMLog.v(this.mTag, Intrinsics.stringPlus("BFDeviceBatteryEvent--", Integer.valueOf(event.getDeviceType().getValue())), new Object[0]);
        if (event.getDeviceType() == HMDeviceType.WEIGHT) {
            getLowPower().setValue(Boolean.TRUE);
        }
    }

    public final void saveHeartRate(@NotNull WeightAdvData data) {
        WeightInfos weightInfosA;
        UserInfos data2;
        String userId;
        MeasureData measureData = data.getMeasureData();
        if (measureData == null || (weightInfosA = a(data)) == null || measureData.getHeartRate() <= 0) {
            return;
        }
        weightInfosA.setHeartRate(measureData.getHeartRate());
        WeightInfoRepository.INSTANCE.getInstance().updateWeightInfo(weightInfosA);
        boolean z = false;
        HMLog.v(getMTag(), Intrinsics.stringPlus("saveHeartRate :", HMWeightUtils.toString(weightInfosA)), new Object[0]);
        Resource<UserInfos> value = getChooseUser().getValue();
        if (value != null && (data2 = value.getData()) != null && (userId = data2.getUserId()) != null && Long.parseLong(userId) == BFCallback.getHMLoginManager().getValidUid()) {
            z = true;
        }
        if (z) {
            WeightInfoCreateHelper.INSTANCE.saveHeartOfScale(weightInfosA);
        }
    }

    public final void savePressure(@NotNull WeightAdvData data) {
        WeightInfos weightInfosA;
        UserInfos data2;
        String userId;
        MeasureData measureData = data.getMeasureData();
        if (measureData == null || (weightInfosA = a(data)) == null || measureData.getPressure() <= 0) {
            return;
        }
        weightInfosA.setPressure(measureData.getPressure());
        WeightInfoRepository.INSTANCE.getInstance().updateWeightInfo(weightInfosA);
        boolean z = false;
        HMLog.v(getMTag(), Intrinsics.stringPlus("savePressure :", HMWeightUtils.toString(weightInfosA)), new Object[0]);
        Resource<UserInfos> value = getChooseUser().getValue();
        if (value != null && (data2 = value.getData()) != null && (userId = data2.getUserId()) != null && Long.parseLong(userId) == BFCallback.getHMLoginManager().getValidUid()) {
            z = true;
        }
        if (z) {
            BFCallback.getInstance().saveStressOfScale(weightInfosA);
        }
    }

    public final void saveWeightData(@Nullable WeightAdvData weightData) {
        String userId;
        if (weightData == null || weightData.getValueKg() <= 0.0f) {
            return;
        }
        HMLog.v(this.mTag, weightData.toString(), new Object[0]);
        WeightInfos weightInfosA = a(weightData);
        if (BFCallback.getHMPersonInfo().isWeightMergeResult() && weightInfosA != null) {
            WeightInfoRepository.Companion companion = WeightInfoRepository.INSTANCE;
            WeightInfos latestInfo = companion.getInstance().getLatestInfo(weightInfosA.getUserId().longValue());
            if (latestInfo != null && weightInfosA.getTimestamp().longValue() - latestInfo.getTimestamp().longValue() <= 30000 && Intrinsics.areEqual(latestInfo.getSource(), weightInfosA.getSource())) {
                companion.getInstance().deleteWeightInfo(latestInfo);
            }
        }
        if (weightInfosA != null) {
            HMLog.v(this.mTag, Intrinsics.stringPlus("add weight :", HMWeightUtils.toString(weightInfosA)), new Object[0]);
            this.weightId = Long.valueOf(WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfosA));
            HMWeightUtils.updateLoginUserWeight(weightInfosA);
            Resource<UserInfos> value = getChooseUser().getValue();
            UserInfos data = value == null ? null : value.getData();
            EventBus eventBus = EventBus.getDefault();
            long j = 0;
            if (data != null && (userId = data.getUserId()) != null) {
                j = Long.parseLong(userId);
            }
            eventBus.post(new EventWeightChanged(j, 3));
        }
    }

    public final void setChooseUser(@NotNull UserInfos userInfo) {
        if (getChooseUser().getValue() == null) {
            getChooseUser().setValue(Resource.INSTANCE.success(userInfo));
        }
    }

    public final void setGuest(boolean z) {
        this.isGuest = z;
    }

    public final void switchPage(int state) {
        Integer value = getSwitchPage().getValue();
        if (value != null && value.intValue() == state) {
            return;
        }
        getSwitchPage().postValue(Integer.valueOf(state));
    }

    public final void setChooseUser(@Nullable Long userId) {
        if (getChooseUser().getValue() == null) {
            if (this.isGuest) {
                getChooseUser().setValue(Resource.INSTANCE.success(UserInfoManager.getManager().getGuest()));
                return;
            }
            if (userId == null) {
                return;
            }
            UserInfos info = UserInfoManager.getManager().getInfo(userId.longValue());
            if (info != null) {
                getChooseUser().setValue(Resource.INSTANCE.success(info));
                HMLog.v(getMTag(), "秤端匹配到用户id--" + userId + "--name--" + ((Object) info.getName()), new Object[0]);
                return;
            }
            getChooseUser().setValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
            HMLog.i(getMTag(), "秤端用户id--" + userId + "查询不到对应用户,weightData--" + getWeightData().getValue(), new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    public final void onEventMainThread(@NotNull BFDeviceWeightValueEvent event) {
        boolean z;
        WeightAdvData value;
        HMLog.v(this.mTag, Intrinsics.stringPlus("fixWeightData before--", event.getWeightAdvData()), new Object[0]);
        if (this.isFinished) {
            return;
        }
        if (this.isStable && !event.getWeightAdvData().isStable() && (value = getWeightData().getValue()) != null) {
            event.getWeightAdvData().setValue(value.getValue());
            event.getWeightAdvData().setValueKg(value.getValueKg());
        }
        if (event.getWeightAdvData().isStable()) {
            this.isStable = true;
        }
        event.getWeightAdvData().checkTimestamp();
        if (event.getWeightAdvData().getMeasureData() == null) {
            b(event.getWeightAdvData());
            HMLog.v(this.mTag, Intrinsics.stringPlus("fixWeightData after--", event.getWeightAdvData().getMeasureData()), new Object[0]);
        }
        getWeightData().setValue(event.getWeightAdvData());
        if (!event.getWeightAdvData().isFinish()) {
            WeightAdvData weightAdvData = event.getWeightAdvData();
            z = (weightAdvData == null ? null : weightAdvData.getMeasureState()) == MeasureState.MEASURING_FINISHED;
        }
        this.isFinished = z;
    }
}
