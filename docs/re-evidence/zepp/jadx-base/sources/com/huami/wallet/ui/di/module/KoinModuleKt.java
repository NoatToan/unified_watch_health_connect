package com.huami.wallet.ui.di.module;

import android.app.Application;
import android.content.Context;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.ui.api.NfcNotification;
import com.huami.wallet.ui.api.NfcNotificationApi;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.navigation.WalletNavigationController;
import com.huami.wallet.ui.pref.WalletPreference;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.repository.ReturnCardMiRepo;
import com.huami.wallet.ui.repository.ShiftCardMiRepo;
import com.huami.wallet.ui.repository.ShiftCardRepo;
import com.huami.wallet.ui.repository.TradeRecordRepo;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.viewmodel.BindPhoneNumberViewModel;
import com.huami.wallet.ui.viewmodel.BusCardDetailViewModel;
import com.huami.wallet.ui.viewmodel.BusCardListViewModel;
import com.huami.wallet.ui.viewmodel.BusCardResultViewModel;
import com.huami.wallet.ui.viewmodel.BusCardStackViewModel;
import com.huami.wallet.ui.viewmodel.ConfirmServiceInVoiceViewModel;
import com.huami.wallet.ui.viewmodel.EntranceViewModel;
import com.huami.wallet.ui.viewmodel.ImgViewModel;
import com.huami.wallet.ui.viewmodel.MiConfirmServiceInVoiceViewModel;
import com.huami.wallet.ui.viewmodel.OpenBusCardViewModel;
import com.huami.wallet.ui.viewmodel.OpenedBusCardsViewModel;
import com.huami.wallet.ui.viewmodel.RechargeViewModel;
import com.huami.wallet.ui.viewmodel.RemindOpenBusCardViewModel;
import com.huami.wallet.ui.viewmodel.ReturnViewModel;
import com.huami.wallet.ui.viewmodel.ServiceChargeViewModel;
import com.huami.wallet.ui.viewmodel.ShiftCardMiViewModel;
import com.huami.wallet.ui.viewmodel.ShiftCardViewModel;
import com.huami.wallet.ui.viewmodel.ShiftOutTipsCardViewModel;
import com.huami.wallet.ui.viewmodel.TradeRecordViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiBulletinViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004\"\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004\"\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\"\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004\"\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004\"\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004\"\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0019\u0010\u0014\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/wallet/ui/resource/IWalletRes;", "deviceRes", "", "WALLET_SCOPE_DEVICE", "Ljava/lang/String;", "WALLET_SCOPE_DEVICE_RES", "WALLET_SCOPE_USER", "WALLET_SCOPE_USER_ID", "WALLET_SCOPE_USER_USERDATA", "WALLET_SCOPE_DEVICE_DEVICE", KoinModuleKt.WALLET_CONFIG_APPNAME, KoinModuleKt.WALLET_CONFIG_WEB_APPNAME, "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWalletViewModelModule", "()Lorg/koin/core/module/Module;", "walletViewModelModule", "b", "getWalletRepoModule", "walletRepoModule", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class KoinModuleKt {

    @NotNull
    public static final String WALLET_CONFIG_APPNAME = "WALLET_CONFIG_APPNAME";

    @NotNull
    public static final String WALLET_CONFIG_WEB_APPNAME = "WALLET_CONFIG_WEB_APPNAME";

    @NotNull
    public static final String WALLET_SCOPE_DEVICE = "WALLET_DEVICE";

    @NotNull
    public static final String WALLET_SCOPE_DEVICE_DEVICE = "WALLET_DEVICE_DEVICE";

    @NotNull
    public static final String WALLET_SCOPE_DEVICE_RES = "WALLET_DEVICE_RES";

    @NotNull
    public static final String WALLET_SCOPE_USER = "WALLET_USER";

    @NotNull
    public static final String WALLET_SCOPE_USER_ID = "WALLET_USER_ID";

    @NotNull
    public static final String WALLET_SCOPE_USER_USERDATA = "WALLET_USER_USERDATA";

    @NotNull
    private static final Module a = ModuleKt.module$default(false, b.a, 1, null);

    @NotNull
    private static final Module b = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.wallet.ui.di.module.KoinModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/repository/BusCardRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0644a extends Lambda implements Function2<Scope, ParametersHolder, BusCardRepo> {
            public static final C0644a a = new C0644a();

            public C0644a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusCardRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BusCardRepo((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/repository/NoticeRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, NoticeRepo> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NoticeRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NoticeRepo((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/repository/TradeRecordRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, TradeRecordRepo> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TradeRecordRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TradeRecordRepo((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/repository/ShiftCardRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, ShiftCardRepo> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShiftCardRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ShiftCardRepo((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/repository/ShiftCardMiRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, ShiftCardMiRepo> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShiftCardMiRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ShiftCardMiRepo((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/repository/ReturnCardMiRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, ReturnCardMiRepo> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReturnCardMiRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ReturnCardMiRepo((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
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
            C0644a c0644a = C0644a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, c0644a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NoticeRepo.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TradeRecordRepo.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ShiftCardRepo.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ShiftCardMiRepo.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ReturnCardMiRepo.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, EntranceViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EntranceViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EntranceViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.wallet.ui.di.module.KoinModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/MiConfirmServiceInVoiceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0645b extends Lambda implements Function2<Scope, ParametersHolder, MiConfirmServiceInVoiceViewModel> {
            public static final C0645b a = new C0645b();

            public C0645b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MiConfirmServiceInVoiceViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MiConfirmServiceInVoiceViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/OpenBusCardViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, OpenBusCardViewModel> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OpenBusCardViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OpenBusCardViewModel((BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/OpenedBusCardsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, OpenedBusCardsViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OpenedBusCardsViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OpenedBusCardsViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/RechargeViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, RechargeViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RechargeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RechargeViewModel((Application) scope.get(Reflection.getOrCreateKotlinClass(Application.class), null, null), (BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ServiceChargeViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, ServiceChargeViewModel> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ServiceChargeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ServiceChargeViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, TradeRecordViewModel> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TradeRecordViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TradeRecordViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null), (TradeRecordRepo) scope.get(Reflection.getOrCreateKotlinClass(TradeRecordRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ShiftCardViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, ShiftCardViewModel> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShiftCardViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ShiftCardViewModel((ShiftCardRepo) scope.get(Reflection.getOrCreateKotlinClass(ShiftCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ShiftOutTipsCardViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, ShiftOutTipsCardViewModel> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShiftOutTipsCardViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ShiftOutTipsCardViewModel((ShiftCardRepo) scope.get(Reflection.getOrCreateKotlinClass(ShiftCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/RemindOpenBusCardViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, RemindOpenBusCardViewModel> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RemindOpenBusCardViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RemindOpenBusCardViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, ReturnViewModel> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReturnViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ReturnViewModel((BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ShiftCardMiViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, ShiftCardMiViewModel> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShiftCardMiViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ShiftCardMiViewModel((ShiftCardMiRepo) scope.get(Reflection.getOrCreateKotlinClass(ShiftCardMiRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ImgViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, ImgViewModel> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImgViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ImgViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/navigation/NavigationController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, NavigationController> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NavigationController invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WalletNavigationController((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/api/NfcNotificationApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, NfcNotificationApi> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcNotificationApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NfcNotification((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null), (BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null), (Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/BindPhoneNumberViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, BindPhoneNumberViewModel> {
            public static final p a = new p();

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BindPhoneNumberViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BindPhoneNumberViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null), (WalletPreference) scope.get(Reflection.getOrCreateKotlinClass(WalletPreference.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, XiaomiSztRefundViewModel> {
            public static final q a = new q();

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaomiSztRefundViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaomiSztRefundViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null), (ReturnCardMiRepo) scope.get(Reflection.getOrCreateKotlinClass(ReturnCardMiRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/XiaomiBulletinViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, XiaomiBulletinViewModel> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaomiBulletinViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaomiBulletinViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/BusCardDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, BusCardDetailViewModel> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusCardDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BusCardDetailViewModel((BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/BusCardListViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t extends Lambda implements Function2<Scope, ParametersHolder, BusCardListViewModel> {
            public static final t a = new t();

            public t() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusCardListViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BusCardListViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/BusCardResultViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class u extends Lambda implements Function2<Scope, ParametersHolder, BusCardResultViewModel> {
            public static final u a = new u();

            public u() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusCardResultViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BusCardResultViewModel((Application) scope.get(Reflection.getOrCreateKotlinClass(Application.class), null, null), (BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/BusCardStackViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class v extends Lambda implements Function2<Scope, ParametersHolder, BusCardStackViewModel> {
            public static final v a = new v();

            public v() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusCardStackViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BusCardStackViewModel((BusCardRepo) scope.get(Reflection.getOrCreateKotlinClass(BusCardRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/viewmodel/ConfirmServiceInVoiceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class w extends Lambda implements Function2<Scope, ParametersHolder, ConfirmServiceInVoiceViewModel> {
            public static final w a = new w();

            public w() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ConfirmServiceInVoiceViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ConfirmServiceInVoiceViewModel((WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, null));
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            k kVar = k.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(ReturnViewModel.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            p pVar = p.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(BindPhoneNumberViewModel.class), null, pVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            q qVar = q.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(XiaomiSztRefundViewModel.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            r rVar = r.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(XiaomiBulletinViewModel.class), null, rVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            s sVar = s.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(BusCardDetailViewModel.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            t tVar = t.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(BusCardListViewModel.class), null, tVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            u uVar = u.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(BusCardResultViewModel.class), null, uVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            v vVar = v.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(BusCardStackViewModel.class), null, vVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            w wVar = w.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(ConfirmServiceInVoiceViewModel.class), null, wVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
            a aVar = a.a;
            StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(EntranceViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier10);
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory10, false, 4, null);
            new Pair(module, factoryInstanceFactory10);
            C0645b c0645b = C0645b.a;
            StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(MiConfirmServiceInVoiceViewModel.class), null, c0645b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier11);
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory11, false, 4, null);
            new Pair(module, factoryInstanceFactory11);
            c cVar = c.a;
            StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition12 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(OpenBusCardViewModel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, rootScopeQualifier12);
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, factoryInstanceFactory12, false, 4, null);
            new Pair(module, factoryInstanceFactory12);
            d dVar = d.a;
            StringQualifier rootScopeQualifier13 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition13 = new BeanDefinition(rootScopeQualifier13, Reflection.getOrCreateKotlinClass(OpenedBusCardsViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, rootScopeQualifier13);
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, factoryInstanceFactory13, false, 4, null);
            new Pair(module, factoryInstanceFactory13);
            e eVar = e.a;
            StringQualifier rootScopeQualifier14 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition14 = new BeanDefinition(rootScopeQualifier14, Reflection.getOrCreateKotlinClass(RechargeViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, rootScopeQualifier14);
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, factoryInstanceFactory14, false, 4, null);
            new Pair(module, factoryInstanceFactory14);
            f fVar = f.a;
            StringQualifier rootScopeQualifier15 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition15 = new BeanDefinition(rootScopeQualifier15, Reflection.getOrCreateKotlinClass(ServiceChargeViewModel.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, rootScopeQualifier15);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, factoryInstanceFactory15, false, 4, null);
            new Pair(module, factoryInstanceFactory15);
            g gVar = g.a;
            StringQualifier rootScopeQualifier16 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition16 = new BeanDefinition(rootScopeQualifier16, Reflection.getOrCreateKotlinClass(TradeRecordViewModel.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, rootScopeQualifier16);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, factoryInstanceFactory16, false, 4, null);
            new Pair(module, factoryInstanceFactory16);
            h hVar = h.a;
            StringQualifier rootScopeQualifier17 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition17 = new BeanDefinition(rootScopeQualifier17, Reflection.getOrCreateKotlinClass(ShiftCardViewModel.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, rootScopeQualifier17);
            FactoryInstanceFactory factoryInstanceFactory17 = new FactoryInstanceFactory(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, factoryInstanceFactory17, false, 4, null);
            new Pair(module, factoryInstanceFactory17);
            i iVar = i.a;
            StringQualifier rootScopeQualifier18 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition18 = new BeanDefinition(rootScopeQualifier18, Reflection.getOrCreateKotlinClass(ShiftOutTipsCardViewModel.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, rootScopeQualifier18);
            FactoryInstanceFactory factoryInstanceFactory18 = new FactoryInstanceFactory(beanDefinition18);
            Module.saveMapping$default(module, strIndexKey18, factoryInstanceFactory18, false, 4, null);
            new Pair(module, factoryInstanceFactory18);
            j jVar = j.a;
            StringQualifier rootScopeQualifier19 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition19 = new BeanDefinition(rootScopeQualifier19, Reflection.getOrCreateKotlinClass(RemindOpenBusCardViewModel.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, rootScopeQualifier19);
            FactoryInstanceFactory factoryInstanceFactory19 = new FactoryInstanceFactory(beanDefinition19);
            Module.saveMapping$default(module, strIndexKey19, factoryInstanceFactory19, false, 4, null);
            new Pair(module, factoryInstanceFactory19);
            l lVar = l.a;
            StringQualifier rootScopeQualifier20 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition20 = new BeanDefinition(rootScopeQualifier20, Reflection.getOrCreateKotlinClass(ShiftCardMiViewModel.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey20 = BeanDefinitionKt.indexKey(beanDefinition20.getPrimaryType(), null, rootScopeQualifier20);
            FactoryInstanceFactory factoryInstanceFactory20 = new FactoryInstanceFactory(beanDefinition20);
            Module.saveMapping$default(module, strIndexKey20, factoryInstanceFactory20, false, 4, null);
            new Pair(module, factoryInstanceFactory20);
            m mVar = m.a;
            StringQualifier rootScopeQualifier21 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition21 = new BeanDefinition(rootScopeQualifier21, Reflection.getOrCreateKotlinClass(ImgViewModel.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey21 = BeanDefinitionKt.indexKey(beanDefinition21.getPrimaryType(), null, rootScopeQualifier21);
            FactoryInstanceFactory factoryInstanceFactory21 = new FactoryInstanceFactory(beanDefinition21);
            Module.saveMapping$default(module, strIndexKey21, factoryInstanceFactory21, false, 4, null);
            new Pair(module, factoryInstanceFactory21);
            n nVar = n.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition22 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NavigationController.class), null, nVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey22 = BeanDefinitionKt.indexKey(beanDefinition22.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition22);
            Module.saveMapping$default(module, strIndexKey22, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            o oVar = o.a;
            BeanDefinition beanDefinition23 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NfcNotificationApi.class), null, oVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey23 = BeanDefinitionKt.indexKey(beanDefinition23.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition23);
            Module.saveMapping$default(module, strIndexKey23, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
        }
    }

    @NotNull
    public static final IWalletRes deviceRes() {
        return (IWalletRes) Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), WALLET_SCOPE_DEVICE, QualifierKt.named(WALLET_SCOPE_DEVICE), null, 4, null).get(Reflection.getOrCreateKotlinClass(IWalletRes.class), QualifierKt.named(WALLET_SCOPE_DEVICE_RES), null);
    }

    @NotNull
    public static final Module getWalletRepoModule() {
        return b;
    }

    @NotNull
    public static final Module getWalletViewModelModule() {
        return a;
    }
}
