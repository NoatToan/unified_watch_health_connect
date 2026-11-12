package com.huami.heartrate.koin;

import android.content.Context;
import com.huami.bigdata.statistics.core.api.BigDataExportedApi;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.repository.HeartRateRepository;
import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.db.HeartRateDb;
import com.huami.heartrate.repository.db.HollyWoodDBDataSource;
import com.huami.heartrate.repository.db.IDataBaseDataSource;
import com.huami.heartrate.repository.db.ZeppDBDataSource;
import com.huami.heartrate.repository.local.ILocalDataSource;
import com.huami.heartrate.repository.local.KvHelper;
import com.huami.heartrate.repository.local.LocalDataSource;
import com.huami.heartrate.repository.remote.IRemoteDataSource;
import com.huami.heartrate.repository.remote.RemoteDataSource;
import com.huami.heartrate.resting.datasource.IRestingHrDataSource;
import com.huami.heartrate.resting.datasource.RestingHrDataSource;
import com.huami.heartrate.service.IHeartRateService;
import com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase;
import com.huami.heartrate.usecase.FetchRestingHrUseCase;
import com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase;
import com.huami.heartrate.usecase.GetLocalWholeDayHRDataUseCase;
import com.huami.heartrate.usecase.GetWholeDayHrDataUseCase;
import com.huami.heartrate.usecase.HeartRateBigDataUseCase;
import com.huami.heartrate.usecase.InitMeasureHrUseCase;
import com.huami.heartrate.usecase.InsertMeasureHrToDbUseCase;
import com.huami.heartrate.usecase.QueryEarliestSyncedHeartRateUseCase;
import com.huami.heartrate.usecase.QueryHeartRateUseCase;
import com.huami.heartrate.usecase.QueryManualHeartRateUseCase;
import com.huami.heartrate.usecase.QueryRestHeartRateByDayUseCase;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "scope", "Lcom/huami/heartrate/model/UserOfHeartRate;", "getUserOfHeartRate", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getHeartRateInternalModule", "()Lorg/koin/core/module/Module;", "heartRateInternalModule", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class HeartRateModulesKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateModulesKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/repository/db/HeartRateDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0438a extends Lambda implements Function2<Scope, ParametersHolder, HeartRateDb> {
            public static final C0438a a = new C0438a();

            public C0438a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HeartRateDb invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return HeartRateDb.INSTANCE.create((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, KvPersistence> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KvPersistence invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return KvKit.getKvPersistence(ConstantKt.KVKIT_NAME, false);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final c a = new c();

            /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateModulesKt$a$c$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/GetLocalWholeDayHRDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0439a extends Lambda implements Function2<Scope, ParametersHolder, GetLocalWholeDayHRDataUseCase> {
                public static final C0439a a = new C0439a();

                public C0439a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetLocalWholeDayHRDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new GetLocalWholeDayHRDataUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, GetLocalMeasureHRDataUseCase> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetLocalMeasureHRDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new GetLocalMeasureHRDataUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateModulesKt$a$c$c, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/QueryRestHeartRateByDayUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0440c extends Lambda implements Function2<Scope, ParametersHolder, QueryRestHeartRateByDayUseCase> {
                public static final C0440c a = new C0440c();

                public C0440c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final QueryRestHeartRateByDayUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new QueryRestHeartRateByDayUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, FetchRemoteMeasureHrUseCase> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FetchRemoteMeasureHrUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new FetchRemoteMeasureHrUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/QueryEarliestSyncedHeartRateUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, QueryEarliestSyncedHeartRateUseCase> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final QueryEarliestSyncedHeartRateUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new QueryEarliestSyncedHeartRateUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/InitMeasureHrUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, InitMeasureHrUseCase> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InitMeasureHrUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new InitMeasureHrUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null), HeartRateModulesKt.getUserOfHeartRate(scope).getUserId());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/InsertMeasureHrToDbUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, InsertMeasureHrToDbUseCase> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InsertMeasureHrToDbUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new InsertMeasureHrToDbUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/QueryHeartRateUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, QueryHeartRateUseCase> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final QueryHeartRateUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new QueryHeartRateUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/service/IHeartRateService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, IHeartRateService> {
                public static final i a = new i();

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IHeartRateService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HeartRateServiceImpl(HeartRateModulesKt.getUserOfHeartRate(scope).getUserId(), HeartRateModulesKt.getUserOfHeartRate(scope).getRegisterTime());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/QueryManualHeartRateUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class j extends Lambda implements Function2<Scope, ParametersHolder, QueryManualHeartRateUseCase> {
                public static final j a = new j();

                public j() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final QueryManualHeartRateUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new QueryManualHeartRateUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/model/UserOfHeartRate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class k extends Lambda implements Function2<Scope, ParametersHolder, UserOfHeartRate> {
                public static final k a = new k();

                public k() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UserOfHeartRate invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return HeartRateModulesKt.getUserOfHeartRate(scope);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/GetWholeDayHrDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class l extends Lambda implements Function2<Scope, ParametersHolder, GetWholeDayHrDataUseCase> {
                public static final l a = new l();

                public l() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetWholeDayHrDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new GetWholeDayHrDataUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/repository/local/KvHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class m extends Lambda implements Function2<Scope, ParametersHolder, KvHelper> {
                public static final m a = new m();

                public m() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KvHelper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new KvHelper((KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), null, null), HeartRateModulesKt.getUserOfHeartRate(scope).getUserId());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class n extends Lambda implements Function2<Scope, ParametersHolder, IBigDataExportedApi> {
                public static final n a = new n();

                public n() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBigDataExportedApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BigDataExportedApi(HeartRateModulesKt.getUserOfHeartRate(scope).getUserId(), KoinExtKt.getHeartRateDataDelegate().getAppName(), KoinExtKt.isHollywood());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/HeartRateBigDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class o extends Lambda implements Function2<Scope, ParametersHolder, HeartRateBigDataUseCase> {
                public static final o a = new o();

                public o() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final HeartRateBigDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HeartRateBigDataUseCase((IBigDataExportedApi) scope.get(Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, null), (GetLocalMeasureHRDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetLocalMeasureHRDataUseCase.class), null, null), (GetLocalWholeDayHRDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetLocalWholeDayHRDataUseCase.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/repository/local/ILocalDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class p extends Lambda implements Function2<Scope, ParametersHolder, ILocalDataSource> {
                public static final p a = new p();

                public p() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ILocalDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LocalDataSource(HeartRateModulesKt.getUserOfHeartRate(scope).getUserId());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/repository/remote/IRemoteDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class q extends Lambda implements Function2<Scope, ParametersHolder, IRemoteDataSource> {
                public static final q a = new q();

                public q() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IRemoteDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RemoteDataSource(HeartRateModulesKt.getUserOfHeartRate(scope).getUserId());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class r extends Lambda implements Function2<Scope, ParametersHolder, IDataBaseDataSource> {
                public static final r a = new r();

                public r() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IDataBaseDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return KoinExtKt.isHollywood() ? new HollyWoodDBDataSource(HeartRateModulesKt.getUserOfHeartRate(scope).getUserId()) : new ZeppDBDataSource();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/resting/datasource/IRestingHrDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class s extends Lambda implements Function2<Scope, ParametersHolder, IRestingHrDataSource> {
                public static final s a = new s();

                public s() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IRestingHrDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RestingHrDataSource(HeartRateModulesKt.getUserOfHeartRate(scope).getUserId());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/usecase/FetchRestingHrUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class t extends Lambda implements Function2<Scope, ParametersHolder, FetchRestingHrUseCase> {
                public static final t a = new t();

                public t() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FetchRestingHrUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new FetchRestingHrUseCase((IHeartRateRepository) scope.get(Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class u extends Lambda implements Function2<Scope, ParametersHolder, IHeartRateRepository> {
                public static final u a = new u();

                public u() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IHeartRateRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HeartRateRepository((ILocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(ILocalDataSource.class), null, null), (IRemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(IRemoteDataSource.class), null, null), (IDataBaseDataSource) scope.get(Reflection.getOrCreateKotlinClass(IDataBaseDataSource.class), null, null), (IRestingHrDataSource) scope.get(Reflection.getOrCreateKotlinClass(IRestingHrDataSource.class), null, null));
                }
            }

            public c() {
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
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UserOfHeartRate.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                n nVar = n.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                o oVar = o.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HeartRateBigDataUseCase.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                p pVar = p.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ILocalDataSource.class), null, pVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                q qVar = q.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IRemoteDataSource.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                r rVar = r.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IDataBaseDataSource.class), null, rVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                s sVar = s.a;
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IRestingHrDataSource.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                t tVar = t.a;
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchRestingHrUseCase.class), null, tVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                u uVar = u.a;
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IHeartRateRepository.class), null, uVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
                C0439a c0439a = C0439a.a;
                BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetLocalWholeDayHRDataUseCase.class), null, c0439a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
                b bVar = b.a;
                BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetLocalMeasureHRDataUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
                C0440c c0440c = C0440c.a;
                BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(QueryRestHeartRateByDayUseCase.class), null, c0440c, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
                d dVar = d.a;
                BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchRemoteMeasureHrUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition13);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory13, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
                e eVar = e.a;
                BeanDefinition beanDefinition14 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(QueryEarliestSyncedHeartRateUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(beanDefinition14);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey14, scopedInstanceFactory14, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory14);
                f fVar = f.a;
                BeanDefinition beanDefinition15 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(InitMeasureHrUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory15 = new ScopedInstanceFactory(beanDefinition15);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey15, scopedInstanceFactory15, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory15);
                g gVar = g.a;
                BeanDefinition beanDefinition16 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(InsertMeasureHrToDbUseCase.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory16 = new ScopedInstanceFactory(beanDefinition16);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey16, scopedInstanceFactory16, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory16);
                h hVar = h.a;
                BeanDefinition beanDefinition17 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(QueryHeartRateUseCase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory17 = new ScopedInstanceFactory(beanDefinition17);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey17, scopedInstanceFactory17, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory17);
                i iVar = i.a;
                BeanDefinition beanDefinition18 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IHeartRateService.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory18 = new ScopedInstanceFactory(beanDefinition18);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey18, scopedInstanceFactory18, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory18);
                j jVar = j.a;
                BeanDefinition beanDefinition19 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(QueryManualHeartRateUseCase.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory19 = new ScopedInstanceFactory(beanDefinition19);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey19, scopedInstanceFactory19, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory19);
                l lVar = l.a;
                BeanDefinition beanDefinition20 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetWholeDayHrDataUseCase.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey20 = BeanDefinitionKt.indexKey(beanDefinition20.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory20 = new ScopedInstanceFactory(beanDefinition20);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey20, scopedInstanceFactory20, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory20);
                m mVar = m.a;
                BeanDefinition beanDefinition21 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(KvHelper.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey21 = BeanDefinitionKt.indexKey(beanDefinition21.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory21 = new ScopedInstanceFactory(beanDefinition21);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey21, scopedInstanceFactory21, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory21);
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0438a c0438a = C0438a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HeartRateDb.class), null, c0438a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(KvPersistence.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            module.scope(QualifierKt.named(ScopeKt.HEART_RATE_KOIN_SCOPE_ID), c.a);
        }
    }

    @NotNull
    public static final Module getHeartRateInternalModule() {
        return a;
    }

    @NotNull
    public static final UserOfHeartRate getUserOfHeartRate(@NotNull Scope scope) {
        return (UserOfHeartRate) scope.getProperty(ScopeKt.HEART_RATE_USER_KEY);
    }
}
