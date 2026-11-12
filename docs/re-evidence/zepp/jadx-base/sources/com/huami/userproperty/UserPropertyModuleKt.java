package com.huami.userproperty;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.datasource.impl.InternalLocalDataSourceImpl;
import com.huami.userproperty.datasource.impl.LocalDataSourceImpl;
import com.huami.userproperty.datasource.impl.RemoteDataSourceImpl;
import com.huami.userproperty.repo.impl.UserPropertyRepoImpl;
import com.huami.userproperty.service.datasource.LocalDataSource;
import com.huami.userproperty.service.datasource.RemoteDataSource;
import com.huami.userproperty.service.repo.UserPropertyRepo;
import com.huami.userproperty.usecase.BatchPushUseCase;
import com.huami.userproperty.usecase.DumpAllLocalDataUseCase;
import com.huami.userproperty.usecase.FetchPropertyUseCase;
import com.huami.userproperty.usecase.FetchRegisteredPropsUseCase;
import com.huami.userproperty.usecase.GetAllLocalPropertiesUseCase;
import com.huami.userproperty.usecase.SaveFetchResultUseCase;
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
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0019\u0010\u0012\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0019\u0010\u0015\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"", "KV_FILE_NAME_PROP_VALUE", "Ljava/lang/String;", "KV_FILE_NAME_PROP_LAST_SYNC", "KV_FILE_NAME_PROP_FETCHED_RANGE", "KV_FILE_NAME_PROP_CONFIG", "MODULE_TAG", "Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getUSER_PROPERTY_VALUE", "()Lorg/koin/core/qualifier/StringQualifier;", "USER_PROPERTY_VALUE", "b", "getUSER_PROPERTY_LAST_SYNC_VALUE", "USER_PROPERTY_LAST_SYNC_VALUE", "c", "getUSER_PROPERTY_FETCHED_RANGE", "USER_PROPERTY_FETCHED_RANGE", GoogleApiAvailabilityLight.a, "getUSER_PROPERTY_CONFIG", "USER_PROPERTY_CONFIG", "Lorg/koin/core/module/Module;", "e", "Lorg/koin/core/module/Module;", "getUserPropertyModule", "()Lorg/koin/core/module/Module;", "userPropertyModule", "userproperty_release"}, k = 2, mv = {1, 5, 1})
public final class UserPropertyModuleKt {

    @NotNull
    public static final String KV_FILE_NAME_PROP_FETCHED_RANGE = "user_property_fetch_range";

    @NotNull
    public static final String KV_FILE_NAME_PROP_LAST_SYNC = "user_property_last_sync";

    @NotNull
    public static final String KV_FILE_NAME_PROP_VALUE = "user_property";

    @NotNull
    public static final String MODULE_TAG = "$UserProperty";

    @NotNull
    private static final StringQualifier a = QualifierKt.named("user_property_value");

    @NotNull
    private static final StringQualifier b = QualifierKt.named("user_property_sync_value");

    @NotNull
    private static final StringQualifier c = QualifierKt.named("user_property_fetched_range");

    @NotNull
    public static final String KV_FILE_NAME_PROP_CONFIG = "user_property_config";

    @NotNull
    private static final StringQualifier d = QualifierKt.named(KV_FILE_NAME_PROP_CONFIG);

    @NotNull
    private static final Module e = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.userproperty.UserPropertyModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/usecase/FetchPropertyUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0636a extends Lambda implements Function2<Scope, ParametersHolder, FetchPropertyUseCase> {
            public static final C0636a a = new C0636a();

            public C0636a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FetchPropertyUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FetchPropertyUseCase((SaveFetchResultUseCase) scope.get(Reflection.getOrCreateKotlinClass(SaveFetchResultUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/usecase/BatchPushUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, BatchPushUseCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BatchPushUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BatchPushUseCase((InternalLocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/usecase/DumpAllLocalDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, DumpAllLocalDataUseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DumpAllLocalDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DumpAllLocalDataUseCase((GetAllLocalPropertiesUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetAllLocalPropertiesUseCase.class), null, null), (KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), UserPropertyModuleKt.getUSER_PROPERTY_LAST_SYNC_VALUE(), null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, GetAllLocalPropertiesUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetAllLocalPropertiesUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetAllLocalPropertiesUseCase((KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), UserPropertyModuleKt.getUSER_PROPERTY_VALUE(), null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SaveFetchResultUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SaveFetchResultUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SaveFetchResultUseCase((InternalLocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, KvPersistence> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KvPersistence invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return KvKit.getKvPersistence(UserPropertyModuleKt.KV_FILE_NAME_PROP_VALUE, true);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, KvPersistence> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KvPersistence invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return KvKit.getKvPersistence(UserPropertyModuleKt.KV_FILE_NAME_PROP_LAST_SYNC, true);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, KvPersistence> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KvPersistence invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return KvKit.getKvPersistence(UserPropertyModuleKt.KV_FILE_NAME_PROP_CONFIG, true);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, KvPersistence> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KvPersistence invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return KvKit.getKvPersistence(UserPropertyModuleKt.KV_FILE_NAME_PROP_FETCHED_RANGE, true);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, InternalLocalDataSource> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InternalLocalDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new InternalLocalDataSourceImpl((KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), UserPropertyModuleKt.getUSER_PROPERTY_VALUE(), null), (KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), UserPropertyModuleKt.getUSER_PROPERTY_LAST_SYNC_VALUE(), null), (KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), UserPropertyModuleKt.getUSER_PROPERTY_FETCHED_RANGE(), null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/service/datasource/LocalDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, LocalDataSource> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LocalDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LocalDataSourceImpl((InternalLocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/service/datasource/RemoteDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, RemoteDataSource> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RemoteDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RemoteDataSourceImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/service/repo/UserPropertyRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, UserPropertyRepo> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserPropertyRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserPropertyRepoImpl((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null), (InternalLocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), null, null), (SaveFetchResultUseCase) scope.get(Reflection.getOrCreateKotlinClass(SaveFetchResultUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/userproperty/usecase/FetchRegisteredPropsUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, FetchRegisteredPropsUseCase> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FetchRegisteredPropsUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FetchRegisteredPropsUseCase((FetchPropertyUseCase) scope.get(Reflection.getOrCreateKotlinClass(FetchPropertyUseCase.class), null, null));
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
            StringQualifier user_property_value = UserPropertyModuleKt.getUSER_PROPERTY_VALUE();
            f fVar = f.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(KvPersistence.class), user_property_value, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), user_property_value, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            StringQualifier user_property_last_sync_value = UserPropertyModuleKt.getUSER_PROPERTY_LAST_SYNC_VALUE();
            g gVar = g.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(KvPersistence.class), user_property_last_sync_value, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), user_property_last_sync_value, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            StringQualifier user_property_config = UserPropertyModuleKt.getUSER_PROPERTY_CONFIG();
            h hVar = h.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(KvPersistence.class), user_property_config, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), user_property_config, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            StringQualifier user_property_fetched_range = UserPropertyModuleKt.getUSER_PROPERTY_FETCHED_RANGE();
            i iVar = i.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(KvPersistence.class), user_property_fetched_range, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), user_property_fetched_range, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            j jVar = j.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            k kVar = k.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            l lVar = l.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            m mVar = m.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserPropertyRepo.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory8, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory8);
            }
            new Pair(module, singleInstanceFactory8);
            n nVar = n.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchRegisteredPropsUseCase.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, singleInstanceFactory9, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory9);
            }
            new Pair(module, singleInstanceFactory9);
            C0636a c0636a = C0636a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchPropertyUseCase.class), null, c0636a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory10 = new SingleInstanceFactory<>(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, singleInstanceFactory10, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory10);
            }
            new Pair(module, singleInstanceFactory10);
            b bVar = b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BatchPushUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, singleInstanceFactory11, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory11);
            }
            new Pair(module, singleInstanceFactory11);
            c cVar = c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DumpAllLocalDataUseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory12 = new SingleInstanceFactory<>(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, singleInstanceFactory12, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory12);
            }
            new Pair(module, singleInstanceFactory12);
            d dVar = d.a;
            BeanDefinition beanDefinition13 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAllLocalPropertiesUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, singleInstanceFactory13, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory13);
            }
            new Pair(module, singleInstanceFactory13);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SaveFetchResultUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory14 = new SingleInstanceFactory<>(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, singleInstanceFactory14, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory14);
            }
            new Pair(module, singleInstanceFactory14);
        }
    }

    @NotNull
    public static final StringQualifier getUSER_PROPERTY_CONFIG() {
        return d;
    }

    @NotNull
    public static final StringQualifier getUSER_PROPERTY_FETCHED_RANGE() {
        return c;
    }

    @NotNull
    public static final StringQualifier getUSER_PROPERTY_LAST_SYNC_VALUE() {
        return b;
    }

    @NotNull
    public static final StringQualifier getUSER_PROPERTY_VALUE() {
        return a;
    }

    @NotNull
    public static final Module getUserPropertyModule() {
        return e;
    }
}
