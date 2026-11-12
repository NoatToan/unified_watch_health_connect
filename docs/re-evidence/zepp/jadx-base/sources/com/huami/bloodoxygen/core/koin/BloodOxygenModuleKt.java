package com.huami.bloodoxygen.core.koin;

import android.content.Context;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.local.process.OdiFactory;
import com.huami.bloodoxygen.core.remote.api.event.EventApi;
import com.huami.bloodoxygen.core.remote.api.fileaccess.FileAccessApi;
import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.bloodoxygen.core.remote.upload.Uploader;
import com.huami.bloodoxygen.core.repository.BloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.service.Spo2ServiceImpl;
import com.huami.bloodoxygen.core.usecase.clickspo2.ClearInvalidClickSpo2UseCase;
import com.huami.bloodoxygen.core.usecase.odi.ProduceOdiUseCase;
import com.huami.bloodoxygen.core.usecase.other.BloodOxygenLifecycleUseCase;
import com.huami.bloodoxygen.core.usecase.other.ClearAllUserDataUseCase;
import com.huami.bloodoxygen.core.usecase.other.UploadBloodOxygenEventsUseCase;
import com.huami.bloodoxygen.core.usecase.sleep.GetSleepInfoUseCase;
import com.huami.bloodoxygen.service.Spo2Service;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0007\u001a\u00020\u00062\u001b\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u0004\".\u0010\f\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b*,\u0010\r\"\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00042\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0004¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lcom/huami/bloodoxygen/core/koin/ScopeSetDeclaration;", "Lkotlin/ExtensionFunctionType;", "scopeSet", "Lorg/koin/core/module/Module;", "bloodOxygenModule", "a", "Lkotlin/jvm/functions/Function1;", "getBloodOxygenDefaultScopeSet", "()Lkotlin/jvm/functions/Function1;", "bloodOxygenDefaultScopeSet", "ScopeSetDeclaration", "core_release"}, k = 2, mv = {1, 5, 1})
public final class BloodOxygenModuleKt {

    @NotNull
    private static final Function1<ScopeDSL, Unit> a = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.bloodoxygen.core.koin.BloodOxygenModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/ClearInvalidClickSpo2UseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0293a extends Lambda implements Function2<Scope, ParametersHolder, ClearInvalidClickSpo2UseCase> {
            public static final C0293a a = new C0293a();

            public C0293a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClearInvalidClickSpo2UseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ClearInvalidClickSpo2UseCase((BloodOxygenCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), (IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/other/BloodOxygenLifecycleUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenLifecycleUseCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenLifecycleUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BloodOxygenLifecycleUseCase((ClearInvalidClickSpo2UseCase) scope.get(Reflection.getOrCreateKotlinClass(ClearInvalidClickSpo2UseCase.class), null, null), (IUploader) scope.get(Reflection.getOrCreateKotlinClass(IUploader.class), null, null), (BloodOxygenCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/other/UploadBloodOxygenEventsUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, UploadBloodOxygenEventsUseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UploadBloodOxygenEventsUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UploadBloodOxygenEventsUseCase((IUploader) scope.get(Reflection.getOrCreateKotlinClass(IUploader.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isSyncDataEnable());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/odi/ProduceOdiUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, ProduceOdiUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProduceOdiUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ProduceOdiUseCase((OdiFactory) scope.get(Reflection.getOrCreateKotlinClass(OdiFactory.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/other/ClearAllUserDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, ClearAllUserDataUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClearAllUserDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ClearAllUserDataUseCase((BloodOxygenDatabase) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenDatabase.class), null, null), (KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenDatabase> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenDatabase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return BloodOxygenDatabase.INSTANCE.create((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, EventApi> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EventApi(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getAppName(), false, ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isPathExtension(), 4, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenCoroutineScope> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BloodOxygenCoroutineScope();
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
                return KvKit.getKvPersistence(BloodOxygen.KVKIT_NAME, false);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, KvKey> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KvKey invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new KvKey((KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, IBloodOxygenRepo> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IBloodOxygenRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BloodOxygenRepo(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), (BloodOxygenDatabase) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenDatabase.class), null, null), (EventApi) scope.get(Reflection.getOrCreateKotlinClass(EventApi.class), null, null), (KvKey) scope.get(Reflection.getOrCreateKotlinClass(KvKey.class), null, null), null, null, null, null, null, null, null, null, null, 8176, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, IUploader> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IUploader invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new Uploader((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getAppName(), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), new FileAccessApi(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getAppName(), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isPathExtension()), (IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null), (BloodOxygenCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isSyncDataEnable());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/sleep/GetSleepInfoUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, GetSleepInfoUseCase> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetSleepInfoUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetSleepInfoUseCase(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getSleepQuery());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/local/process/OdiFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, OdiFactory> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OdiFactory invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OdiFactory((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null), (BloodOxygenCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), (GetSleepInfoUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetSleepInfoUseCase.class), null, null), (IUploader) scope.get(Reflection.getOrCreateKotlinClass(IUploader.class), null, null));
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            f fVar = f.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodOxygenDatabase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            g gVar = g.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(EventApi.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            h hVar = h.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            i iVar = i.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(KvPersistence.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            j jVar = j.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(KvKey.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            k kVar = k.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
            l lVar = l.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IUploader.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
            m mVar = m.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSleepInfoUseCase.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
            n nVar = n.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(OdiFactory.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
            C0293a c0293a = C0293a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ClearInvalidClickSpo2UseCase.class), null, c0293a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
            b bVar = b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodOxygenLifecycleUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
            c cVar = c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UploadBloodOxygenEventsUseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
            d dVar = d.a;
            BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ProduceOdiUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition13);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory13, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ClearAllUserDataUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(beanDefinition14);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey14, scopedInstanceFactory14, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory14);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ Function1<ScopeDSL, Unit> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/service/Spo2Service;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, Spo2Service> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Spo2Service invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new Spo2ServiceImpl();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super ScopeDSL, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Spo2Service.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            module.scope(QualifierKt.named(BloodOxygenKoinScopeKt.BLOOD_OXYGEN_KOIN_SCOPE_ID), this.a);
        }
    }

    @NotNull
    public static final Module bloodOxygenModule(@NotNull Function1<? super ScopeDSL, Unit> function1) {
        return ModuleKt.module$default(false, new b(function1), 1, null);
    }

    @NotNull
    public static final Function1<ScopeDSL, Unit> getBloodOxygenDefaultScopeSet() {
        return a;
    }
}
