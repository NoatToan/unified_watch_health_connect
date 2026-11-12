package com.huami.phn.coach.koin;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.sync.impl.job.milible.ZeppCoachJob;
import com.huami.phn.coach.R;
import com.huami.phn.coach.service.PHNStateServiceImpl;
import com.huami.phn.coach.usecase.CleanAllLocalDataUseCase;
import com.huami.phn.coach.usecase.DailyAnalysisUseCase;
import com.huami.phn.coach.usecase.GetOldestPHNPlanStartDateUseCase;
import com.huami.phn.coach.usecase.GetPHNDailyAnalysisResultUseCase;
import com.huami.phn.coach.usecase.GetPHNPlanUseCase;
import com.huami.phn.coach.usecase.LoadDailyAnalysisUseCase;
import com.huami.phn.coach.usecase.OpenPHNPlanPageUseCase;
import com.huami.phn.coach.usecase.PHNInitUseCase;
import com.huami.phn.coach.usecase.PlanDetailUseCase;
import com.huami.phn.coach.usecase.PostLocalDailyAnalysisUseCase;
import com.huami.phn.coach.usecase.PostLocalPlanDetailUseCase;
import com.huami.phn.coach.usecase.RestorePHNPlanUseCase;
import com.huami.phn.coach.usecase.StopPlanUseCase;
import com.huami.phn.coach.usecase.SwitchDeviceAlertUseCase;
import com.huami.phn.coach.usecase.SyncDevicePhnUseCase;
import com.huami.phn.coach.usecase.SyncUpdateUseCase;
import com.huami.phn.coach.usecase.UpdateRestDayUseCase;
import com.huami.phn.coach.usecase.impl.DailyAnalysisChartUseCaseImpl;
import com.huami.phn.coach.usecase.impl.DailyAnalysisUseCaseImpl;
import com.huami.phn.coach.usecase.impl.LoadDailyAnalysisUseCaseImpl;
import com.huami.phn.coach.usecase.impl.PlanDetailUseCaseImpl;
import com.huami.phn.coach.usecase.impl.PostLocalDailyAnalysisUseCaseImpl;
import com.huami.phn.coach.usecase.impl.PostLocalPlanDetailUseCaseImpl;
import com.huami.phn.coach.usecase.impl.RestorePHNPlanUseCaseImpl;
import com.huami.phn.coach.usecase.impl.StopPlanUseCaseImpl;
import com.huami.phn.coach.usecase.impl.SwitchDeviceAlertUseCaseImpl;
import com.huami.phn.coach.usecase.impl.SyncDevicePhnUseCaseImpl;
import com.huami.phn.coach.usecase.impl.SyncUpdateUseCaseImpl;
import com.huami.phn.coach.usecase.impl.UpdateRestDayUseCaseImpl;
import com.huami.phn.coach.viewmodel.DailyAnalysisViewModel;
import com.huami.phn.coach.viewmodel.PHNDetailPageViewModel;
import com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel;
import com.huami.phn.core.device.DeviceChecker;
import com.huami.phn.core.device.DeviceDelegate;
import com.huami.phn.core.device.DeviceManager;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.device.impl.BleDevice;
import com.huami.phn.core.device.impl.DeviceCheckerImpl;
import com.huami.phn.core.device.impl.DevicePHNFeatureImpl;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.LocalKeeper;
import com.huami.phn.core.source.RemoteDataSource;
import com.huami.phn.core.source.impl.LocalDataSourceImpl;
import com.huami.phn.core.source.impl.LocalKeeperImpl;
import com.huami.phn.core.source.impl.RemoteDataSourceImpl;
import com.huami.phn.core.webapi.PHNInitWebApi;
import com.huami.phn.core.webapi.UserEventApi;
import com.huami.phn.core.webapi.impl.PHNInitWebApiImpl;
import com.huami.phn.core.webapi.impl.UserEventWebApiImpl;
import com.huami.phn.service.PHNStateService;
import com.huami.phn.util.StringKt;
import com.huami.util.net.NetUtil;
import com.huami.utils.persistence.kvkit.KvKit;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\"\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\"\u001c\u0010\u0018\u001a\u00020\u00148\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001c\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"+\u0010\"\u001a\u0017\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00000\u001cj\u0002`\u001e¢\u0006\u0002\b\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!\"\u0013\u0010'\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&*,\u0010(\"\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00000\u001c¢\u0006\u0002\b\u001f2\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00000\u001c¢\u0006\u0002\b\u001f¨\u0006)"}, d2 = {"", "destroyPHNUserScope", "Lorg/koin/core/scope/Scope;", "a", "Lcom/huami/phn/core/device/DeviceManager;", "deviceManager", "Lcom/huami/phn/coach/koin/PhnDeviceNameDelegate;", "deviceNameDelegate", "Lorg/koin/core/module/Module;", "getPHNProjectModule", "", "PHN_PROJECT_KOIN_SCOPE_ID", "Ljava/lang/String;", "Lkotlin/Function0;", "phnUserId", "Lkotlin/jvm/functions/Function0;", "getPhnUserId", "()Lkotlin/jvm/functions/Function0;", "setPhnUserId", "(Lkotlin/jvm/functions/Function0;)V", "Lorg/koin/core/qualifier/StringQualifier;", "Lorg/koin/core/qualifier/StringQualifier;", "getDAILY_ANALYSIS_CHART", "()Lorg/koin/core/qualifier/StringQualifier;", "DAILY_ANALYSIS_CHART", "b", "getDAILY_ANALYSIS", "DAILY_ANALYSIS", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "Lcom/huami/phn/coach/koin/ScopeSetDeclaration;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function1;", "phnProjectScopeSet", GoogleApiAvailabilityLight.a, "storageName", "getPhnProjectKoinScope", "()Lorg/koin/core/scope/Scope;", "phnProjectKoinScope", "ScopeSetDeclaration", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
public final class PHNProjectModuleKt {

    @NotNull
    public static final String PHN_PROJECT_KOIN_SCOPE_ID = "phn_project_koin_scope_id";

    @NotNull
    private static final StringQualifier a = QualifierKt.named("daily_analysis_chart");

    @NotNull
    private static final StringQualifier b = QualifierKt.named(RemoteDataSourceImpl.USER_PHN_DAILY_ANA_SUB_KEY);

    @NotNull
    private static final Function1<ScopeDSL, Unit> c = b.a;

    @NotNull
    private static final Function1<String, String> d = c.a;
    public static Function0<String> phnUserId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HMDeviceSource, String> {
        public final /* synthetic */ PhnDeviceNameDelegate a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PhnDeviceNameDelegate phnDeviceNameDelegate) {
            super(1);
            this.a = phnDeviceNameDelegate;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HMDeviceSource hMDeviceSource) {
            return this.a.nameForSource(hMDeviceSource);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/webapi/UserEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, UserEventApi> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserEventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserEventWebApiImpl();
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/source/RemoteDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0531b extends Lambda implements Function2<Scope, ParametersHolder, RemoteDataSource> {
            public static final C0531b a = new C0531b();

            public C0531b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RemoteDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RemoteDataSourceImpl((PHNInitWebApi) scope.get(Reflection.getOrCreateKotlinClass(PHNInitWebApi.class), null, null), (UserEventApi) scope.get(Reflection.getOrCreateKotlinClass(UserEventApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/source/LocalDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, LocalDataSource> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LocalDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LocalDataSourceImpl((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/source/LocalKeeper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, LocalKeeper> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LocalKeeper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LocalKeeperImpl(KvKit.getKvPersistence$default((String) PHNProjectModuleKt.d.invoke(HMKeeperConstant.KEEP_XML), false, 2, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/GetOldestPHNPlanStartDateUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, GetOldestPHNPlanStartDateUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetOldestPHNPlanStartDateUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetOldestPHNPlanStartDateUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/GetPHNPlanUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, GetPHNPlanUseCase> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetPHNPlanUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetPHNPlanUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null), (LocalKeeper) scope.get(Reflection.getOrCreateKotlinClass(LocalKeeper.class), null, null), (GetPHNDailyAnalysisResultUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetPHNDailyAnalysisResultUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/PHNInitUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, PHNInitUseCase> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PHNInitUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PHNInitUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null), (DevicePHNFeature) scope.get(Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/OpenPHNPlanPageUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, OpenPHNPlanPageUseCase> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OpenPHNPlanPageUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OpenPHNPlanPageUseCase();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/PostLocalDailyAnalysisUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, PostLocalDailyAnalysisUseCase> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PostLocalDailyAnalysisUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PostLocalDailyAnalysisUseCaseImpl((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, PostLocalPlanDetailUseCase> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PostLocalPlanDetailUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PostLocalPlanDetailUseCaseImpl((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/PlanDetailUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, PlanDetailUseCase> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlanDetailUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PlanDetailUseCaseImpl((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/phn/coach/usecase/DailyAnalysisUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, DailyAnalysisUseCase> {
            public static final l a = new l();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ParametersHolder> {
                public final /* synthetic */ Long a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Long l) {
                    super(0);
                    this.a = l;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ParametersHolder invoke() {
                    return ParametersHolderKt.parametersOf(this.a);
                }
            }

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DailyAnalysisUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                Long l = (Long) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Long.class));
                return new DailyAnalysisChartUseCaseImpl((DailyAnalysisUseCase) scope.get(Reflection.getOrCreateKotlinClass(DailyAnalysisUseCase.class), PHNProjectModuleKt.getDAILY_ANALYSIS(), new a(l)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/CleanAllLocalDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, CleanAllLocalDataUseCase> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CleanAllLocalDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CleanAllLocalDataUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/LoadDailyAnalysisUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, LoadDailyAnalysisUseCase> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoadDailyAnalysisUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LoadDailyAnalysisUseCaseImpl((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/phn/coach/usecase/DailyAnalysisUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, DailyAnalysisUseCase> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DailyAnalysisUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DailyAnalysisUseCaseImpl((Long) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Long.class)), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (GetPHNDailyAnalysisResultUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetPHNDailyAnalysisResultUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/phn/coach/usecase/UpdateRestDayUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, UpdateRestDayUseCase> {
            public static final p a = new p();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(NetUtil.INSTANCE.networkInfo().isNetworkConnect());
                }
            }

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UpdateRestDayUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UpdateRestDayUseCaseImpl(((Number) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (PostLocalPlanDetailUseCase) scope.get(Reflection.getOrCreateKotlinClass(PostLocalPlanDetailUseCase.class), null, null), (DevicePHNFeature) scope.get(Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, null), a.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/phn/coach/usecase/StopPlanUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, StopPlanUseCase> {
            public static final q a = new q();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(NetUtil.INSTANCE.networkInfo().isNetworkConnect());
                }
            }

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StopPlanUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StopPlanUseCaseImpl(((Number) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (PostLocalPlanDetailUseCase) scope.get(Reflection.getOrCreateKotlinClass(PostLocalPlanDetailUseCase.class), null, null), (DevicePHNFeature) scope.get(Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, null), a.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/SyncDevicePhnUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, SyncDevicePhnUseCase> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncDevicePhnUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncDevicePhnUseCaseImpl((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (DevicePHNFeature) scope.get(Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, null), (LocalKeeper) scope.get(Reflection.getOrCreateKotlinClass(LocalKeeper.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/SyncUpdateUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, SyncUpdateUseCase> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncUpdateUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncUpdateUseCaseImpl((DevicePHNFeature) scope.get(Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, null), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (DeviceChecker) scope.get(Reflection.getOrCreateKotlinClass(DeviceChecker.class), null, null), (LocalKeeper) scope.get(Reflection.getOrCreateKotlinClass(LocalKeeper.class), null, null), (SyncDevicePhnUseCase) scope.get(Reflection.getOrCreateKotlinClass(SyncDevicePhnUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t extends Lambda implements Function2<Scope, ParametersHolder, GetPHNDailyAnalysisResultUseCase> {
            public static final t a = new t();

            public t() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetPHNDailyAnalysisResultUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetPHNDailyAnalysisResultUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/webapi/PHNInitWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class u extends Lambda implements Function2<Scope, ParametersHolder, PHNInitWebApi> {
            public static final u a = new u();

            public u() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PHNInitWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PHNInitWebApiImpl();
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            k kVar = k.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PlanDetailUseCase.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            StringQualifier daily_analysis_chart = PHNProjectModuleKt.getDAILY_ANALYSIS_CHART();
            l lVar = l.a;
            Module module = scopeDSL.getModule();
            Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(DailyAnalysisUseCase.class), daily_analysis_chart, lVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), daily_analysis_chart, scopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            StringQualifier daily_analysis = PHNProjectModuleKt.getDAILY_ANALYSIS();
            o oVar = o.a;
            Module module2 = scopeDSL.getModule();
            Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(DailyAnalysisUseCase.class), daily_analysis, oVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), daily_analysis, scopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module2, strIndexKey3, factoryInstanceFactory2, false, 4, null);
            new Pair(module2, factoryInstanceFactory2);
            p pVar = p.a;
            Module module3 = scopeDSL.getModule();
            Qualifier scopeQualifier3 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeQualifier3, Reflection.getOrCreateKotlinClass(UpdateRestDayUseCase.class), null, pVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module3, strIndexKey4, factoryInstanceFactory3, false, 4, null);
            new Pair(module3, factoryInstanceFactory3);
            q qVar = q.a;
            Module module4 = scopeDSL.getModule();
            Qualifier scopeQualifier4 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeQualifier4, Reflection.getOrCreateKotlinClass(StopPlanUseCase.class), null, qVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module4, strIndexKey5, factoryInstanceFactory4, false, 4, null);
            new Pair(module4, factoryInstanceFactory4);
            r rVar = r.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncDevicePhnUseCase.class), null, rVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition6);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            s sVar = s.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncUpdateUseCase.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition7);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            t tVar = t.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetPHNDailyAnalysisResultUseCase.class), null, tVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition8);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            u uVar = u.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PHNInitWebApi.class), null, uVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition9);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            a aVar = a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UserEventApi.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition10);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory6, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
            C0531b c0531b = C0531b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, c0531b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition11);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory7, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
            c cVar = c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition12);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory8, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
            d dVar = d.a;
            BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalKeeper.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition13);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory9, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetOldestPHNPlanStartDateUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition14);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey14, scopedInstanceFactory10, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
            f fVar = f.a;
            BeanDefinition beanDefinition15 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetPHNPlanUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition15);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey15, scopedInstanceFactory11, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
            g gVar = g.a;
            BeanDefinition beanDefinition16 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PHNInitUseCase.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition16);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey16, scopedInstanceFactory12, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
            h hVar = h.a;
            BeanDefinition beanDefinition17 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(OpenPHNPlanPageUseCase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition17);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey17, scopedInstanceFactory13, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
            i iVar = i.a;
            BeanDefinition beanDefinition18 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PostLocalDailyAnalysisUseCase.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(beanDefinition18);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey18, scopedInstanceFactory14, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory14);
            j jVar = j.a;
            BeanDefinition beanDefinition19 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PostLocalPlanDetailUseCase.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory15 = new ScopedInstanceFactory(beanDefinition19);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey19, scopedInstanceFactory15, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory15);
            m mVar = m.a;
            BeanDefinition beanDefinition20 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(CleanAllLocalDataUseCase.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey20 = BeanDefinitionKt.indexKey(beanDefinition20.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory16 = new ScopedInstanceFactory(beanDefinition20);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey20, scopedInstanceFactory16, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory16);
            n nVar = n.a;
            BeanDefinition beanDefinition21 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LoadDailyAnalysisUseCase.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey21 = BeanDefinitionKt.indexKey(beanDefinition21.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory17 = new ScopedInstanceFactory(beanDefinition21);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey21, scopedInstanceFactory17, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory17);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "suffix", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str) {
            return StringKt.md5(((Object) PHNProjectModuleKt.getPhnUserId().invoke()) + "_" + str);
        }
    }

    private static final synchronized Scope a() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), PHN_PROJECT_KOIN_SCOPE_ID, QualifierKt.named(PHN_PROJECT_KOIN_SCOPE_ID), null, 4, null);
    }

    public static final void destroyPHNUserScope() {
        Scope scopeOrNull = GlobalContext.INSTANCE.get().getScopeOrNull(PHN_PROJECT_KOIN_SCOPE_ID);
        if (scopeOrNull == null) {
            return;
        }
        scopeOrNull.close();
    }

    @NotNull
    public static final StringQualifier getDAILY_ANALYSIS() {
        return b;
    }

    @NotNull
    public static final StringQualifier getDAILY_ANALYSIS_CHART() {
        return a;
    }

    @NotNull
    public static final Module getPHNProjectModule(@NotNull final DeviceManager deviceManager, @NotNull final PhnDeviceNameDelegate phnDeviceNameDelegate) {
        DeviceDelegate deviceDelegate = DeviceDelegate.INSTANCE;
        deviceDelegate.setDeviceName(new a(phnDeviceNameDelegate));
        deviceDelegate.setPhnDeviceSource(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_MADRID, HMDeviceSource.MILI_MADRID_W}));
        return ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.huami.phn.coach.koin.PHNProjectModuleKt.getPHNProjectModule.2

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/phn/coach/usecase/SwitchDeviceAlertUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function2<Scope, ParametersHolder, SwitchDeviceAlertUseCase> {
                public static final a a = new a();

                /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0532a extends Lambda implements Function0<String> {
                    public final /* synthetic */ Scope a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0532a(Scope scope) {
                        super(0);
                        this.a = scope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return ModuleExtKt.androidContext(this.a).getString(R.string.phn_switch_device_support);
                    }
                }

                /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$a$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ Scope a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Scope scope) {
                        super(0);
                        this.a = scope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return ModuleExtKt.androidContext(this.a).getString(R.string.phn_switch_device_not_support);
                    }
                }

                public a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SwitchDeviceAlertUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SwitchDeviceAlertUseCaseImpl(new BleDevice((HMBaseDevice) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(HMBaseDevice.class)), null, null, 6, null), (LocalDataSource) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), new C0532a(scope), new b(scope));
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/usecase/RestorePHNPlanUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, RestorePHNPlanUseCase> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RestorePHNPlanUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RestorePHNPlanUseCaseImpl((DevicePHNFeature) scope.get(Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, null), (LocalDataSource) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (DeviceChecker) scope.get(Reflection.getOrCreateKotlinClass(DeviceChecker.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, PHNDetailPageViewModel> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PHNDetailPageViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PHNDetailPageViewModel();
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/viewmodel/PHNTerminationPlanViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PHNTerminationPlanViewModel> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PHNTerminationPlanViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PHNTerminationPlanViewModel();
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/viewmodel/DailyAnalysisViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, DailyAnalysisViewModel> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DailyAnalysisViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DailyAnalysisViewModel();
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/service/PHNStateService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, PHNStateService> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PHNStateService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PHNStateServiceImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/device/DevicePHNFeature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, DevicePHNFeature> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DevicePHNFeature invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DevicePHNFeatureImpl((DeviceManager) scope.get(Reflection.getOrCreateKotlinClass(DeviceManager.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/device/DeviceChecker;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, DeviceChecker> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DeviceChecker invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DeviceCheckerImpl((DeviceManager) scope.get(Reflection.getOrCreateKotlinClass(DeviceManager.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$i */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/core/device/DeviceManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, DeviceManager> {
                public final /* synthetic */ DeviceManager a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(DeviceManager deviceManager) {
                    super(2);
                    this.a = deviceManager;
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DeviceManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.koin.PHNProjectModuleKt$getPHNProjectModule$2$j */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phn/coach/koin/PhnDeviceNameDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class j extends Lambda implements Function2<Scope, ParametersHolder, PhnDeviceNameDelegate> {
                public final /* synthetic */ PhnDeviceNameDelegate a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(PhnDeviceNameDelegate phnDeviceNameDelegate) {
                    super(2);
                    this.a = phnDeviceNameDelegate;
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PhnDeviceNameDelegate invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Module module) {
                invoke2(module);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Module module) {
                c cVar = c.a;
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(PHNDetailPageViewModel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
                FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
                new Pair(module, factoryInstanceFactory);
                d dVar = d.a;
                StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(PHNTerminationPlanViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
                FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
                Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
                new Pair(module, factoryInstanceFactory2);
                e eVar = e.a;
                StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(DailyAnalysisViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
                FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
                Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
                new Pair(module, factoryInstanceFactory3);
                f fVar = f.a;
                StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(PHNStateService.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
                FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
                Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
                new Pair(module, factoryInstanceFactory4);
                g gVar = g.a;
                Kind kind2 = Kind.Singleton;
                BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DevicePHNFeature.class), null, gVar, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition5);
                Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory);
                }
                new Pair(module, singleInstanceFactory);
                h hVar = h.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceChecker.class), null, hVar, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition6);
                Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory2, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory2);
                }
                new Pair(module, singleInstanceFactory2);
                i iVar = new i(deviceManager);
                BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceManager.class), null, iVar, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition7);
                Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory3, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory3);
                }
                new Pair(module, singleInstanceFactory3);
                j jVar = new j(phnDeviceNameDelegate);
                BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PhnDeviceNameDelegate.class), null, jVar, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition8);
                Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory4, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory4);
                }
                new Pair(module, singleInstanceFactory4);
                AnonymousClass9 anonymousClass9 = new Function2<Scope, ParametersHolder, ZeppCoachJob>() { // from class: com.huami.phn.coach.koin.PHNProjectModuleKt.getPHNProjectModule.2.9
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ZeppCoachJob invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new ZeppCoachJob() { // from class: com.huami.phn.coach.koin.PHNProjectModuleKt.getPHNProjectModule.2.9.1
                            @Override // com.huami.device.core.sync.api.type.SyncJob
                            public void start() {
                                ((SyncUpdateUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(SyncUpdateUseCase.class), null, null)).exec();
                            }
                        };
                    }
                };
                BeanDefinition beanDefinition9 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ZeppCoachJob.class), null, anonymousClass9, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition9);
                Module.saveMapping$default(module, strIndexKey9, singleInstanceFactory5, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory5);
                }
                new Pair(module, singleInstanceFactory5);
                a aVar = a.a;
                StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(SwitchDeviceAlertUseCase.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier5);
                FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition10);
                Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory5, false, 4, null);
                new Pair(module, factoryInstanceFactory5);
                b bVar = b.a;
                StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(RestorePHNPlanUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier6);
                FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition11);
                Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory6, false, 4, null);
                new Pair(module, factoryInstanceFactory6);
                module.scope(QualifierKt.named(PHNProjectModuleKt.PHN_PROJECT_KOIN_SCOPE_ID), PHNProjectModuleKt.c);
            }
        }, 1, null);
    }

    @NotNull
    public static final Scope getPhnProjectKoinScope() {
        return a();
    }

    @NotNull
    public static final Function0<String> getPhnUserId() {
        Function0<String> function0 = phnUserId;
        if (function0 != null) {
            return function0;
        }
        return null;
    }

    public static final void setPhnUserId(@NotNull Function0<String> function0) {
        phnUserId = function0;
    }
}
