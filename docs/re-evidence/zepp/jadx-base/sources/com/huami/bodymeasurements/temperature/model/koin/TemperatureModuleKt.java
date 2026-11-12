package com.huami.bodymeasurements.temperature.model.koin;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.remote.friend.FriendWebApi;
import com.huami.bodymeasurements.common.remote.friend.FriendWebApiImpl;
import com.huami.bodymeasurements.common.remote.userevents.UserEventsApi;
import com.huami.bodymeasurements.common.remote.userevents.UserEventsApiImpl;
import com.huami.bodymeasurements.temperature.model.device.TempDeviceApi;
import com.huami.bodymeasurements.temperature.model.koin.data.TemperatureCoroutineScope;
import com.huami.bodymeasurements.temperature.model.local.TemperatureDb;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.EightySecondsTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.service.TemperatureServiceImpl;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.CleanLocalTempUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.DeleteManualTempItemUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.FetchTempFromServerUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.UploadUnSyncTempUseCase;
import com.huami.bodymeasurements.temperature.viewmodel.TempAddDataViewModel;
import com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel;
import com.huami.bodymeasurements.temperature.viewmodel.detail.TempDayDetailViewModel;
import com.huami.bodymeasurements.temperature.viewmodel.detail.TempDetailViewModel;
import com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel;
import com.huami.health.bodymeasurements.p014temperatureservice.TemperatureService;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0002\u001a(\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0082\b¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0082\b¢\u0006\u0004\b\r\u0010\f\"\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f\"-\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128@@\u0000X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"3\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\"\u001c\u0010!\u001a\u00020\u000e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 \"\u001c\u0010$\u001a\u00020\u000e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010 \"\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lkotlin/ExtensionFunctionType;", "externalScopeSet", "loadTemperatureModule", "unloadTemperatureModule", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "c", "Lorg/koin/core/module/Module;", "Lorg/koin/core/module/Module;", "scopeModule", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Lkotlin/Lazy;", "getTemperatureModules", "()Ljava/util/ArrayList;", "temperatureModules", "Lkotlin/jvm/functions/Function1;", "getInternalScopeSet", "()Lkotlin/jvm/functions/Function1;", "getInternalScopeSet$annotations", "()V", "internalScopeSet", GoogleApiAvailabilityLight.a, "getSingleModule", "()Lorg/koin/core/module/Module;", "singleModule", "e", "getViewModelModule", "viewModelModule", "", "f", "Ljava/lang/String;", "TAG", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class TemperatureModuleKt {
    private static Module a = null;

    @NotNull
    private static final Lazy b = LazyKt__LazyJVMKt.lazy(e.a);

    @NotNull
    private static final Function1<ScopeDSL, Unit> c = a.a;

    @NotNull
    private static final Module d = ModuleKt.module$default(false, d.a, 1, null);

    @NotNull
    private static final Module e = ModuleKt.module$default(false, g.a, 1, null);

    @NotNull
    private static final String f = "TemperatureModule";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.koin.TemperatureModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/FetchTempFromServerUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0336a extends Lambda implements Function2<Scope, ParametersHolder, FetchTempFromServerUseCase> {
            public static final C0336a a = new C0336a();

            public C0336a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FetchTempFromServerUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FetchTempFromServerUseCase(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.singleTempRepository(scope.getKoin()), ScopesKt.allDayTempRepository(scope.getKoin()), ScopesKt.manualTempRepository(scope.getKoin())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/UploadUnSyncTempUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, UploadUnSyncTempUseCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UploadUnSyncTempUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UploadUnSyncTempUseCase(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.singleTempRepository(scope.getKoin()), ScopesKt.allDayTempRepository(scope.getKoin()), ScopesKt.manualTempRepository(scope.getKoin()), ScopesKt.eightySecondsTempRepository(scope.getKoin())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/CleanLocalTempUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, CleanLocalTempUseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CleanLocalTempUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CleanLocalTempUseCase(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.singleTempRepository(scope.getKoin()), ScopesKt.allDayTempRepository(scope.getKoin()), ScopesKt.manualTempRepository(scope.getKoin()), ScopesKt.eightySecondsTempRepository(scope.getKoin())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/DeleteManualTempItemUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, DeleteManualTempItemUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeleteManualTempItemUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeleteManualTempItemUseCase(ScopesKt.manualTempRepository(scope.getKoin()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, AddManualTempUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AddManualTempUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AddManualTempUseCase(ScopesKt.manualTempRepository(scope.getKoin()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, TemperatureService> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TemperatureService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TemperatureServiceImpl(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.manualTempRepository(scope.getKoin())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, TemperatureDb> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TemperatureDb invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return TemperatureDb.INSTANCE.create(ModuleExtKt.androidContext(scope), "temperature.db");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TemperatureCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, TemperatureCoroutineScope> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TemperatureCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TemperatureCoroutineScope();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/SingleTempRepositoryImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, SingleTempRepositoryImpl> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SingleTempRepositoryImpl invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SingleTempRepositoryImpl((TempDeviceApi) ScopesKt.temperatureScope(scope.getKoin()).getOrNull(Reflection.getOrCreateKotlinClass(TempDeviceApi.class), null, null), ScopesKt.temperatureDb(scope.getKoin()).singleTempDao(), (TempWebApi) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TempWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/AllDayTempRepositoryImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, AllDayTempRepositoryImpl> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AllDayTempRepositoryImpl invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AllDayTempRepositoryImpl((TempDeviceApi) ScopesKt.temperatureScope(scope.getKoin()).getOrNull(Reflection.getOrCreateKotlinClass(TempDeviceApi.class), null, null), ScopesKt.temperatureDb(scope.getKoin()).allDayTempDao(), (TempWebApi) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TempWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/ManualTempRepositoryImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, ManualTempRepositoryImpl> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ManualTempRepositoryImpl invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ManualTempRepositoryImpl(ScopesKt.temperatureDb(scope.getKoin()).manualTempDao(), (TempWebApi) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TempWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/EightySecondsTempRepositoryImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, EightySecondsTempRepositoryImpl> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EightySecondsTempRepositoryImpl invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EightySecondsTempRepositoryImpl((TempDeviceApi) ScopesKt.temperatureScope(scope.getKoin()).getOrNull(Reflection.getOrCreateKotlinClass(TempDeviceApi.class), null, null), ScopesKt.temperatureDb(scope.getKoin()).eightySecondsTempDao(), (TempWebApi) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TempWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, GetLocalTempListBetweenTimeUseCase> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLocalTempListBetweenTimeUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLocalTempListBetweenTimeUseCase(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.singleTempRepository(scope.getKoin()), ScopesKt.allDayTempRepository(scope.getKoin()), ScopesKt.manualTempRepository(scope.getKoin())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, GetTempHistoryDataUseCase> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetTempHistoryDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetTempHistoryDataUseCase(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.singleTempRepository(scope.getKoin()), ScopesKt.manualTempRepository(scope.getKoin())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLatestTempUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, GetLatestTempUseCase> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLatestTempUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLatestTempUseCase(CollectionsKt__CollectionsKt.arrayListOf(ScopesKt.singleTempRepository(scope.getKoin()), ScopesKt.allDayTempRepository(scope.getKoin()), ScopesKt.manualTempRepository(scope.getKoin())));
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
            g gVar = g.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(TemperatureDb.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            h hVar = h.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(TemperatureCoroutineScope.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            StringQualifier stringQualifierNamed = QualifierKt.named("SingleTempRepositoryImpl");
            i iVar = i.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SingleTempRepositoryImpl.class), stringQualifierNamed, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            StringQualifier stringQualifierNamed2 = QualifierKt.named("AllDayTempRepositoryImpl");
            j jVar = j.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AllDayTempRepositoryImpl.class), stringQualifierNamed2, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            StringQualifier stringQualifierNamed3 = QualifierKt.named("ManualTempRepositoryImpl");
            k kVar = k.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ManualTempRepositoryImpl.class), stringQualifierNamed3, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), stringQualifierNamed3, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            StringQualifier stringQualifierNamed4 = QualifierKt.named("EightySecondsTempRepositoryImpl");
            l lVar = l.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(EightySecondsTempRepositoryImpl.class), stringQualifierNamed4, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), stringQualifierNamed4, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
            m mVar = m.a;
            Module module = scopeDSL.getModule();
            Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(GetLocalTempListBetweenTimeUseCase.class), null, mVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            n nVar = n.a;
            Module module2 = scopeDSL.getModule();
            Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(GetTempHistoryDataUseCase.class), null, nVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module2, strIndexKey8, factoryInstanceFactory2, false, 4, null);
            new Pair(module2, factoryInstanceFactory2);
            o oVar = o.a;
            Module module3 = scopeDSL.getModule();
            Qualifier scopeQualifier3 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(scopeQualifier3, Reflection.getOrCreateKotlinClass(GetLatestTempUseCase.class), null, oVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module3, strIndexKey9, factoryInstanceFactory3, false, 4, null);
            new Pair(module3, factoryInstanceFactory3);
            C0336a c0336a = C0336a.a;
            Module module4 = scopeDSL.getModule();
            Qualifier scopeQualifier4 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition10 = new BeanDefinition(scopeQualifier4, Reflection.getOrCreateKotlinClass(FetchTempFromServerUseCase.class), null, c0336a, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition10);
            Module.saveMapping$default(module4, strIndexKey10, factoryInstanceFactory4, false, 4, null);
            new Pair(module4, factoryInstanceFactory4);
            b bVar = b.a;
            Module module5 = scopeDSL.getModule();
            Qualifier scopeQualifier5 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition11 = new BeanDefinition(scopeQualifier5, Reflection.getOrCreateKotlinClass(UploadUnSyncTempUseCase.class), null, bVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition11);
            Module.saveMapping$default(module5, strIndexKey11, factoryInstanceFactory5, false, 4, null);
            new Pair(module5, factoryInstanceFactory5);
            c cVar = c.a;
            Module module6 = scopeDSL.getModule();
            Qualifier scopeQualifier6 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition12 = new BeanDefinition(scopeQualifier6, Reflection.getOrCreateKotlinClass(CleanLocalTempUseCase.class), null, cVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition12);
            Module.saveMapping$default(module6, strIndexKey12, factoryInstanceFactory6, false, 4, null);
            new Pair(module6, factoryInstanceFactory6);
            d dVar = d.a;
            Module module7 = scopeDSL.getModule();
            Qualifier scopeQualifier7 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition13 = new BeanDefinition(scopeQualifier7, Reflection.getOrCreateKotlinClass(DeleteManualTempItemUseCase.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition13);
            Module.saveMapping$default(module7, strIndexKey13, factoryInstanceFactory7, false, 4, null);
            new Pair(module7, factoryInstanceFactory7);
            e eVar = e.a;
            Module module8 = scopeDSL.getModule();
            Qualifier scopeQualifier8 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition14 = new BeanDefinition(scopeQualifier8, Reflection.getOrCreateKotlinClass(AddManualTempUseCase.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition14);
            Module.saveMapping$default(module8, strIndexKey14, factoryInstanceFactory8, false, 4, null);
            new Pair(module8, factoryInstanceFactory8);
            f fVar = f.a;
            Module module9 = scopeDSL.getModule();
            Qualifier scopeQualifier9 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition15 = new BeanDefinition(scopeQualifier9, Reflection.getOrCreateKotlinClass(TemperatureService.class), null, fVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, scopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition15);
            Module.saveMapping$default(module9, strIndexKey15, factoryInstanceFactory9, false, 4, null);
            new Pair(module9, factoryInstanceFactory9);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ Function1<ScopeDSL, Unit> a;

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
            module.scope(QualifierKt.named("Temperature"), TemperatureModuleKt.e(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<ScopeDSL, Unit> {
        public final /* synthetic */ Function1<ScopeDSL, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super ScopeDSL, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            this.a.invoke(scopeDSL);
            TemperatureModuleKt.getInternalScopeSet().invoke(scopeDSL);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Module, Unit> {
        public static final d a = new d();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, UserEventsApi> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserEventsApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserEventsApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, FriendWebApi> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FriendWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FriendWebApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, TempWebApi> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempWebApiImpl((UserEventsApi) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(UserEventsApi.class), null, null), (FriendWebApi) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(FriendWebApi.class), null, null));
            }
        }

        public d() {
            super(1);
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserEventsApi.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FriendWebApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TempWebApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "Lorg/koin/core/module/Module;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ArrayList<Module>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<Module> getA() {
            ArrayList<Module> arrayList = new ArrayList<>();
            Module module = TemperatureModuleKt.a;
            Objects.requireNonNull(module);
            arrayList.add(module);
            arrayList.add(TemperatureModuleKt.getSingleModule());
            arrayList.add(TemperatureModuleKt.getViewModelModule());
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "unloadTemperatureModule";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Module, Unit> {
        public static final g a = new g();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, TempDetailViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempDetailViewModel((FetchTempFromServerUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(FetchTempFromServerUseCase.class), null, null), (GetLatestTempUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(GetLatestTempUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDayDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, TempDayDetailViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempDayDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempDayDetailViewModel((GetLocalTempListBetweenTimeUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(GetLocalTempListBetweenTimeUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempStatisticsDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, TempStatisticsDetailViewModel> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempStatisticsDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempStatisticsDetailViewModel((GetLocalTempListBetweenTimeUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(GetLocalTempListBetweenTimeUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/viewmodel/TempHistoryDataViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, TempHistoryDataViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempHistoryDataViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempHistoryDataViewModel((GetTempHistoryDataUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(GetTempHistoryDataUseCase.class), null, null), (DeleteManualTempItemUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(DeleteManualTempItemUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/viewmodel/TempAddDataViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, TempAddDataViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempAddDataViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempAddDataViewModel((AddManualTempUseCase) ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AddManualTempUseCase.class), null, null));
            }
        }

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(TempDetailViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(TempDayDetailViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(TempStatisticsDetailViewModel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            d dVar = d.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(TempHistoryDataViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            e eVar = e.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(TempAddDataViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
        }
    }

    private static final /* synthetic */ <T> T a(Scope scope, Qualifier qualifier) {
        Scope scopeTemperatureScope = ScopesKt.temperatureScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeTemperatureScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object b(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopeTemperatureScope = ScopesKt.temperatureScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopeTemperatureScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    private static final /* synthetic */ <T> T c(Scope scope, Qualifier qualifier) {
        Scope scopeTemperatureScope = ScopesKt.temperatureScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeTemperatureScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object d(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopeTemperatureScope = ScopesKt.temperatureScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopeTemperatureScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<ScopeDSL, Unit> e(Function1<? super ScopeDSL, Unit> function1) {
        return new c(function1);
    }

    @NotNull
    public static final Function1<ScopeDSL, Unit> getInternalScopeSet() {
        return c;
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getInternalScopeSet$annotations() {
    }

    @NotNull
    public static final Module getSingleModule() {
        return d;
    }

    @NotNull
    public static final ArrayList<Module> getTemperatureModules() {
        return (ArrayList) b.getValue();
    }

    @NotNull
    public static final Module getViewModelModule() {
        return e;
    }

    public static final void loadTemperatureModule(@NotNull Function1<? super ScopeDSL, Unit> function1) {
        a = ModuleKt.module$default(false, new b(function1), 1, null);
        DefaultContextExtKt.loadKoinModules(getTemperatureModules());
    }

    public static final void unloadTemperatureModule() {
        HMLog.info(f, f.a);
        DefaultContextExtKt.unloadKoinModules(getTemperatureModules());
    }
}
