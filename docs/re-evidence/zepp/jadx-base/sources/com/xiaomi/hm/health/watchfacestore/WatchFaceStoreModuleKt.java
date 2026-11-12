package com.xiaomi.hm.health.watchfacestore;

import android.content.Context;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.device.config.Bari;
import com.huami.watchfacesstore.device.config.Blanc;
import com.huami.watchfacesstore.device.config.Bonn;
import com.huami.watchfacesstore.device.config.Como;
import com.huami.watchfacesstore.device.config.Corsica;
import com.huami.watchfacesstore.device.config.Crater;
import com.huami.watchfacesstore.device.config.DefaultConfig;
import com.huami.watchfacesstore.device.config.Hamburg;
import com.huami.watchfacesstore.device.config.IDeviceConfig;
import com.huami.watchfacesstore.device.config.Lisbon;
import com.huami.watchfacesstore.device.config.Madrid;
import com.huami.watchfacesstore.device.config.Ness;
import com.huami.watchfacesstore.device.config.Newton;
import com.huami.watchfacesstore.device.config.Onyx;
import com.huami.watchfacesstore.device.config.Osprey;
import com.huami.watchfacesstore.device.config.Provence;
import com.huami.watchfacesstore.device.config.Verona;
import com.huami.watchfacesstore.device.config.Vienna;
import com.huami.watchfacesstore.device.config.Volga;
import com.huami.watchfacesstore.device.config.Wast;
import com.huami.watchfacesstore.device.config.York;
import com.huami.watchfacesstore.device.config.Zurich;
import com.huami.watchfacesstore.di.WFUserInfo;
import com.huami.watchfacesstore.navigation.WFNavigation;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
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
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "deviceConfig", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWfDeviceModule", "()Lorg/koin/core/module/Module;", "wfDeviceModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class WatchFaceStoreModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_ONYX_W.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_LISBON_W.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_LISBON_WL.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_YORK.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_NESS_W.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_DAX.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_NEWTON_WL.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_BLANC.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_BLANC_W.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 24;
            iArr[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 25;
            iArr[HMDeviceSource.MILI_HAMBURG.ordinal()] = 26;
            iArr[HMDeviceSource.MILI_HAMBURG_W.ordinal()] = 27;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 28;
            iArr[HMDeviceSource.MILI_BONN_W.ordinal()] = 29;
            iArr[HMDeviceSource.MILI_MADRID.ordinal()] = 30;
            iArr[HMDeviceSource.MILI_MADRID_W.ordinal()] = 31;
            iArr[HMDeviceSource.MILI_SOFIA.ordinal()] = 32;
            iArr[HMDeviceSource.MILI_SOFIA_W.ordinal()] = 33;
            iArr[HMDeviceSource.MILI_MADRID_HML.ordinal()] = 34;
            iArr[HMDeviceSource.MILI_VERONA.ordinal()] = 35;
            iArr[HMDeviceSource.MILI_VERONA_W.ordinal()] = 36;
            iArr[HMDeviceSource.MILI_TEIDE.ordinal()] = 37;
            iArr[HMDeviceSource.MILI_TEIDE_W.ordinal()] = 38;
            iArr[HMDeviceSource.MILI_ZURICH.ordinal()] = 39;
            iArr[HMDeviceSource.MILI_ZURICH_W.ordinal()] = 40;
            iArr[HMDeviceSource.MILI_VIENNA.ordinal()] = 41;
            iArr[HMDeviceSource.MILI_VIENNA_W.ordinal()] = 42;
            iArr[HMDeviceSource.MILI_CRATER_W.ordinal()] = 43;
            iArr[HMDeviceSource.MILI_CRATER_WL.ordinal()] = 44;
            iArr[HMDeviceSource.MILI_PROVENCE.ordinal()] = 45;
            iArr[HMDeviceSource.MILI_PROVENCE_W.ordinal()] = 46;
            iArr[HMDeviceSource.MILI_WAST.ordinal()] = 47;
            iArr[HMDeviceSource.MILI_WAST_W.ordinal()] = 48;
            iArr[HMDeviceSource.MILI_BARI.ordinal()] = 49;
            iArr[HMDeviceSource.MILI_BARI_NFC.ordinal()] = 50;
            iArr[HMDeviceSource.MILI_BARI_W.ordinal()] = 51;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.watchfacestore.WatchFaceStoreModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1038a extends Lambda implements Function2<Scope, ParametersHolder, DeviceInfo> {
            public static final C1038a a = new C1038a();

            public C1038a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceInfo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType());
                return new DeviceInfo(String.valueOf(boundDeviceSource.getValue()), ((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getString(ConfigHelperKt.getDeviceConfig(boundDeviceSource).getDeviceDesc()), WatchFaceStoreModuleKt.deviceConfig(boundDeviceSource));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/watchfacesstore/di/WFUserInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, WFUserInfo> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WFUserInfo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                String userId = HMWebUtil.getUserId();
                String currentRegion = AccountManager.getDefault(BraceletApp.getContext()).getCurrentRegion();
                String countryCode = AccountManager.getDefault(CompanionApplication.get()).getCountryCode();
                if (countryCode == null) {
                    countryCode = "";
                }
                return new WFUserInfo(userId, currentRegion, countryCode);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, IDeviceManager> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IDeviceManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WFDeviceManager();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/watchfacesstore/navigation/WFNavigation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, WFNavigation> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WFNavigation invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WatchFaceNavigation();
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
            C1038a c1038a = C1038a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceInfo.class), null, c1038a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(WFUserInfo.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IDeviceManager.class), null, cVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WFNavigation.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
        }
    }

    @NotNull
    public static final IDeviceConfig deviceConfig(@NotNull HMDeviceSource hMDeviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()]) {
            case 1:
            case 2:
                return new Corsica();
            case 3:
            case 4:
                return new Onyx();
            case 5:
            case 6:
            case 7:
                return new Osprey();
            case 8:
            case 9:
            case 10:
                return new Lisbon();
            case 11:
                return new York();
            case 12:
            case 13:
            case 14:
            case 15:
                return new Como();
            case 16:
            case 17:
            case 18:
                return new Ness();
            case 19:
            case 20:
            case 21:
                return new Newton();
            case 22:
            case 23:
                return new Blanc();
            case 24:
            case 25:
                return new Volga();
            case 26:
            case 27:
                return new Hamburg();
            case 28:
            case 29:
                return new Bonn();
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                return new Madrid();
            case 35:
            case 36:
            case 37:
            case 38:
                return new Verona();
            case 39:
            case 40:
                return new Zurich();
            case 41:
            case 42:
                return new Vienna();
            case 43:
            case 44:
                return new Crater();
            case 45:
            case 46:
                return new Provence();
            case 47:
            case 48:
                return new Wast();
            case 49:
            case 50:
            case 51:
                return new Bari();
            default:
                return new DefaultConfig();
        }
    }

    @NotNull
    public static final Module getWfDeviceModule() {
        return a;
    }
}
