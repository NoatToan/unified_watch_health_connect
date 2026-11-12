package com.huami.bloodpressure_core.di;

import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bloodpressure.service.IBloodPressureService;
import com.huami.bloodpressure_core.dc.bigdata.BloodPressureBigDataUseCaseIml;
import com.huami.bloodpressure_core.dc.bigdata.BloodPressureBigDataUserCaseDelegate;
import com.huami.bloodpressure_core.dc.local.BloodPressureDatabase;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.dc.local.LocalDelegateImpl;
import com.huami.bloodpressure_core.dc.remote.BloodPressureApiDeviceDelegate;
import com.huami.bloodpressure_core.dc.remote.BloodPressureApiV1Delegate;
import com.huami.bloodpressure_core.dc.remote.BloodPressureApiV2Delegate;
import com.huami.bloodpressure_core.dc.remote.BloodPressureEventApiV1;
import com.huami.bloodpressure_core.dc.remote.BloodPressureEventApiV2;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteEntity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteV2Entity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestEntity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestV2Entity;
import com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate;
import com.huami.bloodpressure_core.dc.remote.night.BloodPressureApiNightDelegate;
import com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightEventApi;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchApiImpl;
import com.huami.bloodpressure_core.dc.research.IResearchApi;
import com.huami.bloodpressure_core.repo.BloodPressureRepo;
import com.huami.bloodpressure_core.repo.BloodPressureRepoDelegate;
import com.huami.bloodpressure_core.repo.IBloodPressureRepo;
import com.huami.bloodpressure_core.scope.BloodPressureScope;
import com.huami.bloodpressure_core.service.BloodPressureService;
import com.huami.bloodpressure_core.service.IDeviceSwitch;
import com.huami.bloodpressure_core.sharedpreference.BloodPressureSharedPre;
import com.huami.bloodpressure_core.sharedpreference.ISharedPref;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME, "Ljava/lang/String;", BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV1, BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV2, BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIDEVICE, "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getBloodPressureModuleInterval", "()Lorg/koin/core/module/Module;", "bloodPressureModuleInterval", "bloodpressure-core_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureModuleKt {

    @NotNull
    public static final String BLOODPRESSURE_SCOPE_APIDEVICE = "BLOODPRESSURE_SCOPE_APIDEVICE";

    @NotNull
    public static final String BLOODPRESSURE_SCOPE_APIV1 = "BLOODPRESSURE_SCOPE_APIV1";

    @NotNull
    public static final String BLOODPRESSURE_SCOPE_APIV2 = "BLOODPRESSURE_SCOPE_APIV2";

    @NotNull
    public static final String BLOODPRESSURE_SCOPE_NAME = "BLOODPRESSURE_SCOPE_NAME";

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0301a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0301a a = new C0301a();

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/bigdata/BloodPressureBigDataUserCaseDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0302a extends Lambda implements Function2<Scope, ParametersHolder, BloodPressureBigDataUserCaseDelegate> {
                public static final C0302a a = new C0302a();

                public C0302a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BloodPressureBigDataUserCaseDelegate invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureBigDataUserCaseDelegate(new BloodPressureBigDataUseCaseIml((ILocalDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ILocalDelegate.class), null, null), (IBigDataExportedApi) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, null)));
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure/service/IBloodPressureService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, IBloodPressureService> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBloodPressureService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureService((ILocalDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ILocalDelegate.class), null, null), (IDeviceSwitch) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IDeviceSwitch.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, IResearchApi> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IResearchApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureResearchApiImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity>> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureApiV1Delegate(new BloodPressureEventApiV1());
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity>> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureApiV2Delegate(new BloodPressureEventApiV2());
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity>> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureApiDeviceDelegate(new BloodPressureEventApiV2());
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureApiNightDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, BloodPressureApiNightDelegate> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BloodPressureApiNightDelegate invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureApiNightDelegate(new BloodPressureNightEventApi());
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, BloodPressureDatabase> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BloodPressureDatabase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return BloodPressureDatabase.Companion.create$default(BloodPressureDatabase.INSTANCE, ModuleExtKt.androidContext(scope), null, 2, null);
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$i */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, ILocalDelegate> {
                public static final i a = new i();

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ILocalDelegate invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LocalDelegateImpl((BloodPressureDatabase) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(BloodPressureDatabase.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$j */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class j extends Lambda implements Function2<Scope, ParametersHolder, CoroutineScope> {
                public static final j a = new j();

                public j() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureScope();
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$k */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class k extends Lambda implements Function2<Scope, ParametersHolder, ISharedPref> {
                public static final k a = new k();

                public k() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISharedPref invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureSharedPre();
                }
            }

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.di.BloodPressureModuleKt$a$a$l */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class l extends Lambda implements Function2<Scope, ParametersHolder, IBloodPressureRepo> {
                public static final l a = new l();

                public l() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBloodPressureRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureRepoDelegate(new BloodPressureRepo((CoroutineScope) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), null, null), (ILocalDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ILocalDelegate.class), null, null), (ISharedPref) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), null, null), (IBloodPressureDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV1), null), (IBloodPressureDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV2), null), (IBloodPressureDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIDEVICE), null), (BloodPressureApiNightDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(BloodPressureApiNightDelegate.class), null, null)));
                }
            }

            public C0301a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier stringQualifierNamed = QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV1);
                d dVar = d.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), stringQualifierNamed, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed2 = QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV2);
                e eVar = e.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), stringQualifierNamed2, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                StringQualifier stringQualifierNamed3 = QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIDEVICE);
                f fVar = f.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), stringQualifierNamed3, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), stringQualifierNamed3, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                g gVar = g.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodPressureApiNightDelegate.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                h hVar = h.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodPressureDatabase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                i iVar = i.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ILocalDelegate.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                j jVar = j.a;
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                k kVar = k.a;
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ISharedPref.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                l lVar = l.a;
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureRepo.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
                C0302a c0302a = C0302a.a;
                BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodPressureBigDataUserCaseDelegate.class), null, c0302a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
                b bVar = b.a;
                BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureService.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
                c cVar = c.a;
                BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IResearchApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
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
            module.scope(QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME), C0301a.a);
        }
    }

    @NotNull
    public static final Module getBloodPressureModuleInterval() {
        return a;
    }
}
