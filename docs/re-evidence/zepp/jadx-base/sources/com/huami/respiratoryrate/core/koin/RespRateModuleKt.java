package com.huami.respiratoryrate.core.koin;

import com.huami.feature.config.FeatureSwitch;
import com.huami.respiratoryrate.core.RespRateConfig;
import com.huami.respiratoryrate.core.RespRateCoroutineScope;
import com.huami.respiratoryrate.core.data.local.RespRateDatabase;
import com.huami.respiratoryrate.core.data.remote.IRespRateWebApi;
import com.huami.respiratoryrate.core.data.remote.RespRateWebApiImpl;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import com.huami.respiratoryrate.core.repo.IRespRateRepo;
import com.huami.respiratoryrate.core.repo.ISyncTimeRepo;
import com.huami.respiratoryrate.core.repo.RespRateRepoImpl;
import com.huami.respiratoryrate.core.repo.SyncTimeRepoImpl;
import com.huami.respiratoryrate.core.service.RespServiceImpl;
import com.huami.respiratoryrate.core.transform.IWebTransform;
import com.huami.respiratoryrate.core.transform.WebTransformImpl;
import com.huami.respiratoryrate.core.usecase.ClearDataUseCase;
import com.huami.respiratoryrate.core.usecase.GetDataFlowUseCase;
import com.huami.respiratoryrate.core.usecase.GetDataUseCase;
import com.huami.respiratoryrate.core.usecase.GetSyncTimeUseCase;
import com.huami.respiratoryrate.core.usecase.LoadDataUseCase;
import com.huami.respiratoryrate.core.usecase.PostDataUseCase;
import com.huami.respiratoryrate.core.usecase.SaveDataUseCase;
import com.huami.respiratoryrate.core.usecase.SaveSyncTimeUseCase;
import com.huami.respiratoryrate.service.IRespiratoryRateService;
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
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getRespRateCoreModule", "()Lorg/koin/core/module/Module;", "respRateCoreModule", "core_release"}, k = 2, mv = {1, 5, 1})
public final class RespRateModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0547a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0547a a = new C0547a();

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/SaveDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0548a extends Lambda implements Function2<Scope, ParametersHolder, SaveDataUseCase> {
                public static final C0548a a = new C0548a();

                public C0548a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SaveDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SaveDataUseCase((IRespRateRepo) scope.get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/GetDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, GetDataUseCase> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new GetDataUseCase((IRespRateRepo) scope.get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/LoadDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, LoadDataUseCase> {
                public static final c a = new c();

                /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$c$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0549a extends Lambda implements Function0<Boolean> {
                    public final /* synthetic */ Scope a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0549a(Scope scope) {
                        super(0);
                        this.a = scope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return ((FeatureSwitch) this.a.get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable();
                    }
                }

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LoadDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LoadDataUseCase((IRespRateRepo) scope.get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null), new C0549a(scope));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/PostDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PostDataUseCase> {
                public static final d a = new d();

                /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$d$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0550a extends Lambda implements Function0<Boolean> {
                    public final /* synthetic */ Scope a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0550a(Scope scope) {
                        super(0);
                        this.a = scope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return ((FeatureSwitch) this.a.get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable();
                    }
                }

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PostDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PostDataUseCase((IRespRateRepo) scope.get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null), new C0550a(scope));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/ClearDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, ClearDataUseCase> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ClearDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new ClearDataUseCase((IRespRateRepo) scope.get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/GetDataFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, GetDataFlowUseCase> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetDataFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new GetDataFlowUseCase((IRespRateRepo) scope.get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/data/local/RespRateDatabase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, RespRateDatabase> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RespRateDatabase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return RespRateDatabase.INSTANCE.getInstance(ModuleExtKt.androidContext(scope), ((RespRateConfig) scope.get(Reflection.getOrCreateKotlinClass(RespRateConfig.class), null, null)).getUserId());
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/RespRateCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, RespRateCoroutineScope> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RespRateCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RespRateCoroutineScope();
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$i */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/data/remote/IRespRateWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, IRespRateWebApi> {
                public static final i a = new i();

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IRespRateWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RespRateWebApiImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$j */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class j extends Lambda implements Function2<Scope, ParametersHolder, IRespRateRepo> {
                public static final j a = new j();

                public j() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IRespRateRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RespRateRepoImpl(((RespRateDatabase) scope.get(Reflection.getOrCreateKotlinClass(RespRateDatabase.class), null, null)).respRateDao(), (IRespRateWebApi) scope.get(Reflection.getOrCreateKotlinClass(IRespRateWebApi.class), null, null), (IWebTransform) scope.get(Reflection.getOrCreateKotlinClass(IWebTransform.class), null, null), ((RespRateConfig) scope.get(Reflection.getOrCreateKotlinClass(RespRateConfig.class), null, null)).getUserId());
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$k */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class k extends Lambda implements Function2<Scope, ParametersHolder, ISyncTimeRepo> {
                public static final k a = new k();

                public k() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISyncTimeRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SyncTimeRepoImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$l */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/transform/IWebTransform;", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class l extends Lambda implements Function2<Scope, ParametersHolder, IWebTransform<RespRateEventItem>> {
                public static final l a = new l();

                public l() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IWebTransform<RespRateEventItem> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new WebTransformImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$m */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/service/IRespiratoryRateService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class m extends Lambda implements Function2<Scope, ParametersHolder, IRespiratoryRateService> {
                public static final m a = new m();

                public m() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IRespiratoryRateService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RespServiceImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$n */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/SaveSyncTimeUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class n extends Lambda implements Function2<Scope, ParametersHolder, SaveSyncTimeUseCase> {
                public static final n a = new n();

                public n() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SaveSyncTimeUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SaveSyncTimeUseCase((ISyncTimeRepo) scope.get(Reflection.getOrCreateKotlinClass(ISyncTimeRepo.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.koin.RespRateModuleKt$a$a$o */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/respiratoryrate/core/usecase/GetSyncTimeUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class o extends Lambda implements Function2<Scope, ParametersHolder, GetSyncTimeUseCase> {
                public static final o a = new o();

                public o() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetSyncTimeUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new GetSyncTimeUseCase((ISyncTimeRepo) scope.get(Reflection.getOrCreateKotlinClass(ISyncTimeRepo.class), null, null));
                }
            }

            public C0547a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                g gVar = g.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(RespRateDatabase.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                h hVar = h.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(RespRateCoroutineScope.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                i iVar = i.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IRespRateWebApi.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                j jVar = j.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                k kVar = k.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ISyncTimeRepo.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                l lVar = l.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IWebTransform.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                m mVar = m.a;
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IRespiratoryRateService.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                n nVar = n.a;
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SaveSyncTimeUseCase.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                o oVar = o.a;
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSyncTimeUseCase.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
                C0548a c0548a = C0548a.a;
                BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SaveDataUseCase.class), null, c0548a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
                b bVar = b.a;
                BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDataUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
                c cVar = c.a;
                BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LoadDataUseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
                d dVar = d.a;
                BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PostDataUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition13);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory13, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
                e eVar = e.a;
                BeanDefinition beanDefinition14 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ClearDataUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(beanDefinition14);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey14, scopedInstanceFactory14, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory14);
                f fVar = f.a;
                BeanDefinition beanDefinition15 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDataFlowUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory15 = new ScopedInstanceFactory(beanDefinition15);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey15, scopedInstanceFactory15, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory15);
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
            module.scope(QualifierKt.named(RespRateKoinScopeKt.RESPIRATORY_RATE_KOIN_SCOPE_ID), C0547a.a);
        }
    }

    @NotNull
    public static final Module getRespRateCoreModule() {
        return a;
    }
}
