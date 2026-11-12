package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u0007¢\u0006\u0004\bO\u0010PJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J.\u0010\u0017\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!R\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002030\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!R\u001f\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!R\"\u0010A\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R6\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010M\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "type", "", "enable", "", "b", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", SessionDescription.p, "setPoolSwimmingLaneLength", "wrist", "setRowingMachineWearingWrist", "setSportType", BehaviorTaggingWebApi.g.x, "setSensitivity", "setAlert", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", PointCategory.LOAD, "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "a", "Lkotlin/Lazy;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getAlertVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "alertVisibleLiveData", "c", "getAlertLiveData", "alertLiveData", GoogleApiAvailabilityLight.a, "getSportTypeVisibleLiveData", "sportTypeVisibleLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "e", "getSportTypeLiveData", "sportTypeLiveData", "f", "getRecognizeAndSensitivityEnableLiveData", "recognizeAndSensitivityEnableLiveData", "g", "getSportRecognizeSensitivityVisibleLiveData", "sportRecognizeSensitivityVisibleLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "h", "getSportRecognizeSensitivityLiveData", "sportRecognizeSensitivityLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "i", "getLoadingLiveData", "loadingLiveData", z.j, "Z", "getHasSetRowingMachineWearingWrist", "()Z", "setHasSetRowingMachineWearingWrist", "(Z)V", "hasSetRowingMachineWearingWrist", hl.k, "getHasSetPoolSwimmingLaneLength", "setHasSetPoolSwimmingLaneLength", "hasSetPoolSwimmingLaneLength", "l", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "m", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "sport", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportRecognizeViewModel extends ViewModel implements KoinComponent {
    public static final int LANE_LENGTH_25_M = 1;
    public static final int LANE_LENGTH_25_YARDS = 3;
    public static final int LANE_LENGTH_50_M = 2;
    public static final int LANE_LENGTH_50_YARDS = 4;
    public static final int WEAR_WRIST_LEFT = 1;
    public static final int WEAR_WRIST_RIGHT = 2;

    @NotNull
    private static final String n = "SportRecognizeViewModel";
    private static final int o = 0;
    private static final int p = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> alertVisibleLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> alertLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> sportTypeVisibleLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<EnumArray> sportTypeLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> recognizeAndSensitivityEnableLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> sportRecognizeSensitivityVisibleLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<EnumData> sportRecognizeSensitivityLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean hasSetRowingMachineWearingWrist;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean hasSetPoolSwimmingLaneLength;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$load$1", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EnumData rowingMachineWearingWrist;
            EnumData poolSwimmingLaneLength;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sport sportA = SportRecognizeViewModel.this.a();
            EnumArray sportRecognitionTypes = sportA == null ? null : sportA.getSportRecognitionTypes();
            Sport sportA2 = SportRecognizeViewModel.this.a();
            Integer numBoxInt = (sportA2 == null || (rowingMachineWearingWrist = sportA2.getRowingMachineWearingWrist()) == null) ? null : Boxing.boxInt(rowingMachineWearingWrist.getValue());
            SportRecognizeViewModel.this.setHasSetRowingMachineWearingWrist((numBoxInt == null || numBoxInt.intValue() == 0) ? false : true);
            Sport sportA3 = SportRecognizeViewModel.this.a();
            Integer numBoxInt2 = (sportA3 == null || (poolSwimmingLaneLength = sportA3.getPoolSwimmingLaneLength()) == null) ? null : Boxing.boxInt(poolSwimmingLaneLength.getValue());
            SportRecognizeViewModel.this.setHasSetPoolSwimmingLaneLength((numBoxInt2 == null || numBoxInt2.intValue() == 0) ? false : true);
            SportRecognizeViewModel.this.getSportTypeVisibleLiveData().postValue(Boxing.boxBoolean(sportRecognitionTypes != null));
            if (sportRecognitionTypes != null) {
                SportRecognizeViewModel.this.getSportTypeLiveData().postValue(sportRecognitionTypes);
            }
            MutableLiveData<Boolean> recognizeAndSensitivityEnableLiveData = SportRecognizeViewModel.this.getRecognizeAndSensitivityEnableLiveData();
            ArrayList<Integer> values = sportRecognitionTypes == null ? null : sportRecognitionTypes.getValues();
            recognizeAndSensitivityEnableLiveData.postValue(Boxing.boxBoolean(!(values == null || values.isEmpty())));
            Sport sportA4 = SportRecognizeViewModel.this.a();
            Boolean sportRecognizedRemindSwitch = sportA4 == null ? null : sportA4.getSportRecognizedRemindSwitch();
            SportRecognizeViewModel.this.getAlertVisibleLiveData().postValue(Boxing.boxBoolean(sportRecognizedRemindSwitch != null));
            if (sportRecognizedRemindSwitch != null) {
                SportRecognizeViewModel.this.getAlertLiveData().postValue(sportRecognizedRemindSwitch);
            }
            Sport sportA5 = SportRecognizeViewModel.this.a();
            EnumData sportRecognitionSensitivity = sportA5 == null ? null : sportA5.getSportRecognitionSensitivity();
            SportRecognizeViewModel.this.getSportRecognizeSensitivityVisibleLiveData().postValue(Boxing.boxBoolean(sportRecognitionSensitivity != null));
            if (sportRecognitionSensitivity != null) {
                SportRecognizeViewModel.this.getSportRecognizeSensitivityLiveData().postValue(sportRecognitionSensitivity);
            }
            LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setAlert$1", f = "SportRecognizeViewModel.kt", i = {}, l = {180, DataTypeSource.SPORT_TYPE_DISCO}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                if (sport == null) {
                    return;
                }
                sport.setSportRecognizedRemindSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setAlert$1$2", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0867b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportRecognizeViewModel b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0867b(SportRecognizeViewModel sportRecognizeViewModel, boolean z, Continuation<? super C0867b> continuation) {
                super(2, continuation);
                this.b = sportRecognizeViewModel;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0867b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0867b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Sport sportA = this.b.a();
                if (sportA != null) {
                    sportA.setSportRecognizedRemindSwitch(Boxing.boxBoolean(this.c));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0037  */
        /* JADX WARN: Code duplicated, block: B:21:0x005d  */
        /* JADX WARN: Code duplicated, block: B:23:0x008b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            MainCoroutineDispatcher main;
            C0867b c0867b;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
            SettingsModule settingsModule = SportRecognizeViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                Sport sport = new Sport();
                sport.setSportRecognizedRemindSwitch(Boxing.boxBoolean(this.c));
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                main = Dispatchers.getMain();
                c0867b = new C0867b(SportRecognizeViewModel.this, this.c, null);
                this.a = 2;
                if (BuildersKt.withContext(main, c0867b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                SportRecognizeViewModel.this.getAlertLiveData().postValue(Boxing.boxBoolean(!this.c));
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                main = Dispatchers.getMain();
                c0867b = new C0867b(SportRecognizeViewModel.this, this.c, null);
                this.a = 2;
                if (BuildersKt.withContext(main, c0867b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                SportRecognizeViewModel.this.getAlertLiveData().postValue(Boxing.boxBoolean(!this.c));
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setPoolSwimmingLaneLength$1", f = "SportRecognizeViewModel.kt", i = {}, l = {66, 68, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setPoolSwimmingLaneLength$1$1", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportRecognizeViewModel b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportRecognizeViewModel sportRecognizeViewModel, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sportRecognizeViewModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setHasSetPoolSwimmingLaneLength(true);
                Sport sportA = this.b.a();
                EnumData poolSwimmingLaneLength = sportA == null ? null : sportA.getPoolSwimmingLaneLength();
                if (poolSwimmingLaneLength != null) {
                    poolSwimmingLaneLength.setValue(this.c);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(1);
                this.a = i;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                if (sport == null) {
                    return;
                }
                sport.setPoolSwimmingLaneLength(Integer.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, boolean z, int i2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = z;
            this.e = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0063  */
        /* JADX WARN: Code duplicated, block: B:25:0x0078 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Sport sportA;
            EnumArray sportRecognitionTypes;
            MainCoroutineDispatcher main;
            a aVar;
            SportRecognizeViewModel sportRecognizeViewModel;
            int i;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                    sportRecognizeViewModel = SportRecognizeViewModel.this;
                    i = this.c;
                    z = this.d;
                    this.a = 3;
                    if (sportRecognizeViewModel.b(i, z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
            Sport sport = new Sport();
            sport.setPoolSwimmingLaneLength(new EnumData(this.e));
            SettingsModule settingsModule = SportRecognizeViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(SportRecognizeViewModel.this, this.e, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                sportRecognizeViewModel = SportRecognizeViewModel.this;
                i = this.c;
                z = this.d;
                this.a = 3;
                if (sportRecognizeViewModel.b(i, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                sportA = SportRecognizeViewModel.this.a();
                if (sportA != null && (sportRecognitionTypes = sportA.getSportRecognitionTypes()) != null) {
                    SportRecognizeViewModel.this.getSportTypeLiveData().postValue(sportRecognitionTypes);
                }
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(SportRecognizeViewModel.this, this.e, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                sportRecognizeViewModel = SportRecognizeViewModel.this;
                i = this.c;
                z = this.d;
                this.a = 3;
                if (sportRecognizeViewModel.b(i, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                sportA = SportRecognizeViewModel.this.a();
                if (sportA != null) {
                    SportRecognizeViewModel.this.getSportTypeLiveData().postValue(sportRecognitionTypes);
                }
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setRowingMachineWearingWrist$1", f = "SportRecognizeViewModel.kt", i = {}, l = {87, 89, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setRowingMachineWearingWrist$1$1", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportRecognizeViewModel b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportRecognizeViewModel sportRecognizeViewModel, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sportRecognizeViewModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setHasSetRowingMachineWearingWrist(true);
                Sport sportA = this.b.a();
                EnumData rowingMachineWearingWrist = sportA == null ? null : sportA.getRowingMachineWearingWrist();
                if (rowingMachineWearingWrist != null) {
                    rowingMachineWearingWrist.setValue(this.c);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(1);
                this.a = i;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                if (sport == null) {
                    return;
                }
                sport.setRowingMachineWearingWrist(Integer.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, boolean z, int i2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = z;
            this.e = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new d(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0063  */
        /* JADX WARN: Code duplicated, block: B:25:0x0078 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Sport sportA;
            EnumArray sportRecognitionTypes;
            MainCoroutineDispatcher main;
            a aVar;
            SportRecognizeViewModel sportRecognizeViewModel;
            int i;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                    sportRecognizeViewModel = SportRecognizeViewModel.this;
                    i = this.c;
                    z = this.d;
                    this.a = 3;
                    if (sportRecognizeViewModel.b(i, z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
            Sport sport = new Sport();
            sport.setRowingMachineWearingWrist(new EnumData(this.e));
            SettingsModule settingsModule = SportRecognizeViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                sportA = SportRecognizeViewModel.this.a();
                if (sportA != null && (sportRecognitionTypes = sportA.getSportRecognitionTypes()) != null) {
                    SportRecognizeViewModel.this.getSportTypeLiveData().postValue(sportRecognitionTypes);
                }
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                return Unit.INSTANCE;
            }
            main = Dispatchers.getMain();
            aVar = new a(SportRecognizeViewModel.this, this.e, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            sportRecognizeViewModel = SportRecognizeViewModel.this;
            i = this.c;
            z = this.d;
            this.a = 3;
            if (sportRecognizeViewModel.b(i, z, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                sportA = SportRecognizeViewModel.this.a();
                if (sportA != null) {
                    SportRecognizeViewModel.this.getSportTypeLiveData().postValue(sportRecognitionTypes);
                }
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                return Unit.INSTANCE;
            }
            main = Dispatchers.getMain();
            aVar = new a(SportRecognizeViewModel.this, this.e, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            sportRecognizeViewModel = SportRecognizeViewModel.this;
            i = this.c;
            z = this.d;
            this.a = 3;
            if (sportRecognizeViewModel.b(i, z, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setSensitivity$1", f = "SportRecognizeViewModel.kt", i = {}, l = {156, 160}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setSensitivity$1$1", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportRecognizeViewModel b;
            public final /* synthetic */ int c;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$e$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0868a extends Lambda implements Function0<String> {
                public static final C0868a a = new C0868a();

                public C0868a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "enumData null";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(int i) {
                    super(1);
                    this.a = i;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                    if (sport == null) {
                        return;
                    }
                    sport.setSportRecognitionSensitivity(Integer.valueOf(this.a));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportRecognizeViewModel sportRecognizeViewModel, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sportRecognizeViewModel;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                EnumData value = this.b.getSportRecognizeSensitivityLiveData().getValue();
                if (value == null) {
                    HMLog.error$default(SportRecognizeViewModel.n, null, null, C0868a.a, 6, null);
                }
                if (value != null) {
                    value.setValue(this.c);
                }
                this.b.getSportRecognizeSensitivityLiveData().setValue(value);
                Sport sportA = this.b.a();
                EnumData sportRecognitionSensitivity = sportA == null ? null : sportA.getSportRecognitionSensitivity();
                if (sportRecognitionSensitivity != null) {
                    sportRecognitionSensitivity.setValue(this.c);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.c), 1, null);
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, this.b.getLoadingLiveData(), null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0071 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, SportRecognizeViewModel.this.getLoadingLiveData(), null, 2, null);
            SettingsModule settingsModule = SportRecognizeViewModel.this.settingsModule;
            if (settingsModule != null) {
                Sport sport = new Sport();
                sport.setSportRecognitionSensitivity(new EnumData(this.c));
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(SportRecognizeViewModel.this, this.c, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(SportRecognizeViewModel.this, this.c, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setSportType$1", f = "SportRecognizeViewModel.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, boolean z, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportRecognizeViewModel sportRecognizeViewModel = SportRecognizeViewModel.this;
                int i2 = this.c;
                boolean z = this.d;
                this.a = 1;
                if (sportRecognizeViewModel.b(i2, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel", f = "SportRecognizeViewModel.kt", i = {0, 0, 0}, l = {112, 133, 142}, m = "setSportTypeSuspend", n = {"this", "type", "enable"}, s = {"L$0", "I$0", "Z$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public boolean d;
        public /* synthetic */ Object e;
        public int g;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return SportRecognizeViewModel.this.b(0, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
            if (sport == null) {
                return;
            }
            sport.setSportRecognitionTypes(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setSportTypeSuspend$3", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ EnumArray c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z, EnumArray enumArray, int i, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = enumArray;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList<Integer> values;
            ArrayList<Integer> values2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                EnumArray enumArray = this.c;
                if (enumArray == null || (values2 = enumArray.getValues()) == null) {
                    return null;
                }
                return Boxing.boxBoolean(values2.remove(Boxing.boxInt(this.d)));
            }
            EnumArray enumArray2 = this.c;
            if (enumArray2 == null || (values = enumArray2.getValues()) == null) {
                return null;
            }
            return Boxing.boxBoolean(values.add(Boxing.boxInt(this.d)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$setSportTypeSuspend$enumArray$1", f = "SportRecognizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EnumArray>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "写入重复类型：" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z, int i, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportRecognizeViewModel.this.new j(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super EnumArray> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sport sportA = SportRecognizeViewModel.this.a();
            EnumArray sportRecognitionTypes = sportA == null ? null : sportA.getSportRecognitionTypes();
            if (sportRecognitionTypes == null) {
                LoadingVo.INSTANCE.postFailMsg(SportRecognizeViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                return null;
            }
            if (!this.c) {
                sportRecognitionTypes.getValues().remove(Boxing.boxInt(this.d));
            } else if (sportRecognitionTypes.getValues().contains(Boxing.boxInt(this.d))) {
                HMLog.error$default(SportRecognizeViewModel.n, null, null, new a(this.d), 6, null);
            } else {
                sportRecognitionTypes.getValues().add(Boxing.boxInt(this.d));
            }
            return sportRecognitionTypes;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportRecognizeViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), objArr, objArr2);
            }
        });
        this.alertVisibleLiveData = new MutableLiveData<>();
        this.alertLiveData = new MutableLiveData<>();
        this.sportTypeVisibleLiveData = new MutableLiveData<>();
        this.sportTypeLiveData = new MutableLiveData<>();
        this.recognizeAndSensitivityEnableLiveData = new MutableLiveData<>();
        this.sportRecognizeSensitivityVisibleLiveData = new MutableLiveData<>();
        this.sportRecognizeSensitivityLiveData = new MutableLiveData<>();
        this.loadingLiveData = new MutableLiveData<>();
        HMBaseDevice device = getDeviceCenter().getDevice();
        this.settingsModule = device != null ? (SettingsModule) device.getChannelModule(SettingsModule.class) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sport a() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.SPORT);
        if (settings instanceof Sport) {
            return (Sport) settings;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(int i2, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        g gVar;
        SportRecognizeViewModel sportRecognizeViewModel;
        EnumArray enumArray;
        SettingsModule settingsModule;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        EnumArray enumArray2;
        MainCoroutineDispatcher main;
        i iVar;
        SportRecognizeViewModel sportRecognizeViewModel2;
        ArrayList<Integer> values;
        String strJoinToString$default;
        Boolean bool;
        int i4 = i2;
        boolean z5 = z;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i5 = gVar.g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gVar.g = i5 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithContext = gVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = gVar.g;
        if (i6 != 0) {
            if (i6 == 1) {
                boolean z6 = gVar.d;
                int i7 = gVar.c;
                SportRecognizeViewModel sportRecognizeViewModel3 = (SportRecognizeViewModel) gVar.a;
                ResultKt.throwOnFailure(objWithContext);
                sportRecognizeViewModel = sportRecognizeViewModel3;
                z5 = z6;
                i4 = i7;
            } else {
                if (i6 == 2) {
                    z2 = gVar.d;
                    i3 = gVar.c;
                    enumArray = (EnumArray) gVar.b;
                    sportRecognizeViewModel = (SportRecognizeViewModel) gVar.a;
                    ResultKt.throwOnFailure(objWithContext);
                    bool = (Boolean) objWithContext;
                    if (bool == null) {
                        z3 = z2;
                        enumArray2 = enumArray;
                        z4 = false;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        z3 = z2;
                        enumArray2 = enumArray;
                        z4 = zBooleanValue;
                    }
                    if (z4) {
                        LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, sportRecognizeViewModel.getLoadingLiveData(), null, 2, null);
                        if (enumArray2 != null && (values = enumArray2.getValues()) != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(values, ",", null, null, 0, null, null, 62, null)) != null) {
                            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new h(strJoinToString$default), 1, null);
                        }
                    } else {
                        LoadingVo.INSTANCE.postFailMsg(sportRecognizeViewModel.getLoadingLiveData(), R.string.long_sit_set_failed);
                        main = Dispatchers.getMain();
                        iVar = new i(z3, enumArray2, i3, null);
                        gVar.a = sportRecognizeViewModel;
                        gVar.b = enumArray2;
                        gVar.g = 3;
                        if (BuildersKt.withContext(main, iVar, gVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sportRecognizeViewModel2 = sportRecognizeViewModel;
                    }
                    sportRecognizeViewModel.getSportTypeLiveData().postValue(enumArray2);
                    return Unit.INSTANCE;
                }
                if (i6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumArray2 = (EnumArray) gVar.b;
                sportRecognizeViewModel2 = (SportRecognizeViewModel) gVar.a;
                ResultKt.throwOnFailure(objWithContext);
            }
            sportRecognizeViewModel = sportRecognizeViewModel2;
            sportRecognizeViewModel.getSportTypeLiveData().postValue(enumArray2);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objWithContext);
        LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, getLoadingLiveData(), null, 2, null);
        MainCoroutineDispatcher main2 = Dispatchers.getMain();
        j jVar = new j(z5, i4, null);
        gVar.a = this;
        gVar.c = i4;
        gVar.d = z5;
        gVar.g = 1;
        objWithContext = BuildersKt.withContext(main2, jVar, gVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        sportRecognizeViewModel = this;
        enumArray = (EnumArray) objWithContext;
        if (enumArray != null && (settingsModule = sportRecognizeViewModel.settingsModule) != null) {
            Sport sport = new Sport();
            sport.setSportRecognitionTypes(enumArray);
            Unit unit = Unit.INSTANCE;
            gVar.a = sportRecognizeViewModel;
            gVar.b = enumArray;
            gVar.c = i4;
            gVar.d = z5;
            gVar.g = 2;
            objWithContext = SettingsExtsKt.write(settingsModule, sport, gVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean z7 = z5;
            i3 = i4;
            z2 = z7;
            bool = (Boolean) objWithContext;
            if (bool == null) {
                z3 = z2;
            } else {
                boolean zBooleanValue2 = bool.booleanValue();
                z3 = z2;
                enumArray2 = enumArray;
                z4 = zBooleanValue2;
            }
            if (z4) {
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, sportRecognizeViewModel.getLoadingLiveData(), null, 2, null);
                if (enumArray2 != null) {
                    WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new h(strJoinToString$default), 1, null);
                }
            } else {
                LoadingVo.INSTANCE.postFailMsg(sportRecognizeViewModel.getLoadingLiveData(), R.string.long_sit_set_failed);
                main = Dispatchers.getMain();
                iVar = new i(z3, enumArray2, i3, null);
                gVar.a = sportRecognizeViewModel;
                gVar.b = enumArray2;
                gVar.g = 3;
                if (BuildersKt.withContext(main, iVar, gVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportRecognizeViewModel2 = sportRecognizeViewModel;
                sportRecognizeViewModel = sportRecognizeViewModel2;
            }
            sportRecognizeViewModel.getSportTypeLiveData().postValue(enumArray2);
            return Unit.INSTANCE;
        }
        z3 = z5;
        i3 = i4;
        enumArray2 = enumArray;
        z4 = false;
        if (z4) {
            LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, sportRecognizeViewModel.getLoadingLiveData(), null, 2, null);
            if (enumArray2 != null) {
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new h(strJoinToString$default), 1, null);
            }
        } else {
            LoadingVo.INSTANCE.postFailMsg(sportRecognizeViewModel.getLoadingLiveData(), R.string.long_sit_set_failed);
            main = Dispatchers.getMain();
            iVar = new i(z3, enumArray2, i3, null);
            gVar.a = sportRecognizeViewModel;
            gVar.b = enumArray2;
            gVar.g = 3;
            if (BuildersKt.withContext(main, iVar, gVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportRecognizeViewModel2 = sportRecognizeViewModel;
            sportRecognizeViewModel = sportRecognizeViewModel2;
        }
        sportRecognizeViewModel.getSportTypeLiveData().postValue(enumArray2);
        return Unit.INSTANCE;
    }

    private final DeviceCenter getDeviceCenter() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getAlertLiveData() {
        return this.alertLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getAlertVisibleLiveData() {
        return this.alertVisibleLiveData;
    }

    public final boolean getHasSetPoolSwimmingLaneLength() {
        return this.hasSetPoolSwimmingLaneLength;
    }

    public final boolean getHasSetRowingMachineWearingWrist() {
        return this.hasSetRowingMachineWearingWrist;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRecognizeAndSensitivityEnableLiveData() {
        return this.recognizeAndSensitivityEnableLiveData;
    }

    @NotNull
    public final MutableLiveData<EnumData> getSportRecognizeSensitivityLiveData() {
        return this.sportRecognizeSensitivityLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSportRecognizeSensitivityVisibleLiveData() {
        return this.sportRecognizeSensitivityVisibleLiveData;
    }

    @NotNull
    public final MutableLiveData<EnumArray> getSportTypeLiveData() {
        return this.sportTypeLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSportTypeVisibleLiveData() {
        return this.sportTypeVisibleLiveData;
    }

    public final void load(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void setAlert(boolean enable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(enable, null), 2, null);
    }

    public final void setHasSetPoolSwimmingLaneLength(boolean z) {
        this.hasSetPoolSwimmingLaneLength = z;
    }

    public final void setHasSetRowingMachineWearingWrist(boolean z) {
        this.hasSetRowingMachineWearingWrist = z;
    }

    public final void setPoolSwimmingLaneLength(int type, boolean enable, int length) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(type, enable, length, null), 2, null);
    }

    public final void setRowingMachineWearingWrist(int type, boolean enable, int wrist) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(type, enable, wrist, null), 2, null);
    }

    public final void setSensitivity(int sensitivity) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(sensitivity, null), 2, null);
    }

    public final void setSportType(int type, boolean enable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(type, enable, null), 2, null);
    }
}
