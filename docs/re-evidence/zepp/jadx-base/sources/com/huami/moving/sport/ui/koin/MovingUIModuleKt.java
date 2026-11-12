package com.huami.moving.sport.ui.koin;

import android.content.Context;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.config.SportConfigManager;
import com.huami.moving.config.impl.SportConfigManagerImpl;
import com.huami.moving.datacenter.SportDataRender;
import com.huami.moving.datacenter.SportDataRenderImpl;
import com.huami.moving.datacenter.SportType;
import com.huami.moving.sport.ui.activity.OpenSportDetailPageImpl;
import com.huami.moving.sport.ui.common.HrZoneShowRuleConfig;
import com.huami.moving.sport.ui.common.SportDataDisplayItemConverter;
import com.huami.moving.sport.ui.common.SportDataDisplayItemConverterImpl;
import com.huami.moving.sport.ui.koin.MovingUIModuleKt;
import com.huami.moving.sport.ui.usecase.GetChildSportRecordDataUseCase;
import com.huami.moving.sport.ui.usecase.GetDeviceIconUserCase;
import com.huami.moving.sport.ui.usecase.GetDeviceNameUserCase;
import com.huami.moving.sport.ui.usecase.GetHrZoneShowRuleUseCase;
import com.huami.moving.sport.ui.usecase.GetSportDetailParsedDataUseCase;
import com.huami.moving.sport.ui.usecase.GetSportRecordDataUseCase;
import com.huami.moving.sport.ui.usecase.SportDeviceSourceConverter;
import com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel;
import com.huami.moving.sport.ui.webapi.DeviceSettingApi;
import com.huami.moving.sport.ui.webapi.WebProvider;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.moving.ui.sport.OpenSportDetailPage;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.List;
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
import org.jetbrains.annotations.Nullable;
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
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b\"\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"+\u0010\u0016\u001a\u0017\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0013\u0010\u0019\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018*,\u0010\u001a\"\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u00132\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0013¨\u0006\u001b"}, d2 = {"Lorg/koin/core/scope/Scope;", "i", "Lcom/huami/moving/sport/ui/usecase/GetDeviceNameUserCase;", "deviceNameUserCase", "Lcom/huami/moving/sport/ui/webapi/WebProvider;", "webProvider", "Lcom/huami/moving/sport/ui/usecase/SportDeviceSourceConverter;", "sportDeviceSourceConverter", "Lcom/huami/moving/sport/ui/usecase/GetHrZoneShowRuleUseCase;", "hrZoneShowRuleUseCase", "Lorg/koin/core/module/Module;", "getMovingUIModule", "", "MOVING_UI_KOIN_SCOPE_ID", "Ljava/lang/String;", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lcom/huami/moving/sport/ui/koin/ScopeSetDeclaration;", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "movingUiScopeSet", "getMovingUIKoinScope", "()Lorg/koin/core/scope/Scope;", "movingUIKoinScope", "ScopeSetDeclaration", "moving-ui_release"}, k = 2, mv = {1, 5, 1})
public final class MovingUIModuleKt {

    @NotNull
    public static final String MOVING_UI_KOIN_SCOPE_ID = "moving_ui_koin_scope_id";

    @NotNull
    private static final Function1<ScopeDSL, Unit> a = b.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ WebProvider a;
        public final /* synthetic */ GetDeviceNameUserCase b;
        public final /* synthetic */ SportDeviceSourceConverter c;
        public final /* synthetic */ GetHrZoneShowRuleUseCase d;

        /* JADX INFO: renamed from: com.huami.moving.sport.ui.koin.MovingUIModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/config/SportConfigManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0494a extends Lambda implements Function2<Scope, ParametersHolder, SportConfigManager> {
            public static final C0494a a = new C0494a();

            /* JADX INFO: renamed from: com.huami.moving.sport.ui.koin.MovingUIModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/content/Context;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0495a extends Lambda implements Function0<Context> {
                public final /* synthetic */ Scope a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0495a(Scope scope) {
                    super(0);
                    this.a = scope;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke */
                public final Context getA() {
                    return ModuleExtKt.androidContext(this.a);
                }
            }

            public C0494a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportConfigManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SportConfigManagerImpl(new C0495a(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/webapi/DeviceSettingApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DeviceSettingApi> {
            public final /* synthetic */ WebProvider a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WebProvider webProvider) {
                super(2);
                this.a = webProvider;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceSettingApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceSettingApiImpl(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/GetDeviceNameUserCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, GetDeviceNameUserCase> {
            public final /* synthetic */ GetDeviceNameUserCase a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(GetDeviceNameUserCase getDeviceNameUserCase) {
                super(2);
                this.a = getDeviceNameUserCase;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetDeviceNameUserCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/GetDeviceIconUserCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, GetDeviceIconUserCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetDeviceIconUserCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetDeviceIconUserCase((DeviceSettingApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceSettingApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/SportDeviceSourceConverter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SportDeviceSourceConverter> {
            public final /* synthetic */ SportDeviceSourceConverter a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SportDeviceSourceConverter sportDeviceSourceConverter) {
                super(2);
                this.a = sportDeviceSourceConverter;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportDeviceSourceConverter invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/GetHrZoneShowRuleUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, GetHrZoneShowRuleUseCase> {
            public final /* synthetic */ GetHrZoneShowRuleUseCase a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(GetHrZoneShowRuleUseCase getHrZoneShowRuleUseCase) {
                super(2);
                this.a = getHrZoneShowRuleUseCase;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetHrZoneShowRuleUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/ui/sport/OpenSportDetailPage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, OpenSportDetailPage> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OpenSportDetailPage invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OpenSportDetailPageImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/moving/datacenter/SportDataRender;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, SportDataRender> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportDataRender invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SportDataRenderImpl((Trackrecord) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Trackrecord.class)), (List) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(List.class)), (SportConfigManager) scope.get(Reflection.getOrCreateKotlinClass(SportConfigManager.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItemConverter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, SportDataDisplayItemConverter> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportDataDisplayItemConverter invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                boolean zIsMetric;
                int iIntValue = ((Number) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Integer.class))).intValue();
                Integer num = (Integer) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(Integer.class));
                if (iIntValue == SportType.SwimmingPool.INSTANCE.getType()) {
                    zIsMetric = num != null && num.intValue() == 0;
                } else {
                    zIsMetric = RunnerData.getRunner().isMetric();
                }
                return new SportDataDisplayItemConverterImpl(ModuleExtKt.androidContext(scope), zIsMetric, iIntValue, null, 8, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebProvider webProvider, GetDeviceNameUserCase getDeviceNameUserCase, SportDeviceSourceConverter sportDeviceSourceConverter, GetHrZoneShowRuleUseCase getHrZoneShowRuleUseCase) {
            super(1);
            this.a = webProvider;
            this.b = getDeviceNameUserCase;
            this.c = sportDeviceSourceConverter;
            this.d = getHrZoneShowRuleUseCase;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0494a c0494a = C0494a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SportConfigManager.class), null, c0494a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = new b(this.a);
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceSettingApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = new c(this.b);
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDeviceNameUserCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDeviceIconUserCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = new e(this.c);
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SportDeviceSourceConverter.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = new f(this.d);
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetHrZoneShowRuleUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            g gVar = g.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(OpenSportDetailPage.class), null, gVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            h hVar = h.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SportDataRender.class), null, hVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            i iVar = i.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(SportDataDisplayItemConverter.class), null, iVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            module.scope(QualifierKt.named(MovingUIModuleKt.MOVING_UI_KOIN_SCOPE_ID), MovingUIModuleKt.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/GetSportRecordDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, GetSportRecordDataUseCase> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetSportRecordDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetSportRecordDataUseCase();
            }
        }

        /* JADX INFO: renamed from: com.huami.moving.sport.ui.koin.MovingUIModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/GetSportDetailParsedDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0496b extends Lambda implements Function2<Scope, ParametersHolder, GetSportDetailParsedDataUseCase> {
            public static final C0496b a = new C0496b();

            public C0496b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetSportDetailParsedDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetSportDetailParsedDataUseCase();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/usecase/GetChildSportRecordDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, GetChildSportRecordDataUseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetChildSportRecordDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetChildSportRecordDataUseCase();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, SportDetailPageViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportDetailPageViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SportDetailPageViewModel((GetSportRecordDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetSportRecordDataUseCase.class), null, null), (GetSportDetailParsedDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetSportDetailParsedDataUseCase.class), null, null), (GetChildSportRecordDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetChildSportRecordDataUseCase.class), null, null), (GetDeviceIconUserCase) scope.get(Reflection.getOrCreateKotlinClass(GetDeviceIconUserCase.class), null, null), (GetDeviceNameUserCase) scope.get(Reflection.getOrCreateKotlinClass(GetDeviceNameUserCase.class), null, null), (SportDeviceSourceConverter) scope.get(Reflection.getOrCreateKotlinClass(SportDeviceSourceConverter.class), null, null), (GetHrZoneShowRuleUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetHrZoneShowRuleUseCase.class), null, null));
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
            a aVar = a.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSportRecordDataUseCase.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            C0496b c0496b = C0496b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSportDetailParsedDataUseCase.class), null, c0496b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetChildSportRecordDataUseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            d dVar = d.a;
            Module module = scopeDSL.getModule();
            Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(SportDetailPageViewModel.class), null, dVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer g(int i) {
        return Integer.valueOf(i);
    }

    @NotNull
    public static final Scope getMovingUIKoinScope() {
        return i();
    }

    @NotNull
    public static final Module getMovingUIModule(@NotNull GetDeviceNameUserCase getDeviceNameUserCase, @NotNull WebProvider webProvider, @NotNull SportDeviceSourceConverter sportDeviceSourceConverter, @NotNull GetHrZoneShowRuleUseCase getHrZoneShowRuleUseCase) {
        return ModuleKt.module$default(false, new a(webProvider, getDeviceNameUserCase, sportDeviceSourceConverter, getHrZoneShowRuleUseCase), 1, null);
    }

    public static /* synthetic */ Module getMovingUIModule$default(GetDeviceNameUserCase getDeviceNameUserCase, WebProvider webProvider, SportDeviceSourceConverter sportDeviceSourceConverter, GetHrZoneShowRuleUseCase getHrZoneShowRuleUseCase, int i, Object obj) {
        if ((i & 1) != 0) {
            getDeviceNameUserCase = new GetDeviceNameUserCase() { // from class: l85
                @Override // com.huami.moving.sport.ui.usecase.GetDeviceNameUserCase
                public final String getBySource(int i2) {
                    return MovingUIModuleKt.e(i2);
                }
            };
        }
        if ((i & 2) != 0) {
            webProvider = new WebProvider() { // from class: o85
                @Override // com.huami.moving.sport.ui.webapi.WebProvider
                public final String host() {
                    return MovingUIModuleKt.f();
                }
            };
        }
        if ((i & 4) != 0) {
            sportDeviceSourceConverter = new SportDeviceSourceConverter() { // from class: n85
                @Override // com.huami.moving.sport.ui.usecase.SportDeviceSourceConverter
                public final Integer toDeviceSource(int i2) {
                    return MovingUIModuleKt.g(i2);
                }
            };
        }
        if ((i & 8) != 0) {
            getHrZoneShowRuleUseCase = new GetHrZoneShowRuleUseCase() { // from class: m85
                @Override // com.huami.moving.sport.ui.usecase.GetHrZoneShowRuleUseCase
                public final HrZoneShowRuleConfig getHrZoneShowRuleConfig() {
                    return MovingUIModuleKt.h();
                }
            };
        }
        return getMovingUIModule(getDeviceNameUserCase, webProvider, sportDeviceSourceConverter, getHrZoneShowRuleUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrZoneShowRuleConfig h() {
        return null;
    }

    private static final synchronized Scope i() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), MOVING_UI_KOIN_SCOPE_ID, QualifierKt.named(MOVING_UI_KOIN_SCOPE_ID), null, 4, null);
    }
}
