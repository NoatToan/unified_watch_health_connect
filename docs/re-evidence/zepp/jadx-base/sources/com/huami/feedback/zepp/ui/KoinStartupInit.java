package com.huami.feedback.zepp.ui;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.startup.Initializer;
import com.huami.account.service.AccountService;
import com.huami.feedback.api.FeedbackService;
import com.huami.feedback.domain.CheckChineseUserUseCase;
import com.huami.feedback.domain.CheckContactValidateUseCase;
import com.huami.feedback.domain.CheckSyncLogConnectEnvUseCase;
import com.huami.feedback.domain.CheckSyncLogDeviceEnvUseCase;
import com.huami.feedback.domain.ConvertUserContactUseCase;
import com.huami.feedback.repo.BluetoothStateRepository;
import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.repo.IssueRepository;
import com.huami.feedback.repo.UserFormRepository;
import com.huami.feedback.zepp.ui.domain.CheckFeedbackEnvUseCase;
import com.huami.koinstartup.KoinInitializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/feedback/zepp/ui/KoinStartupInit;", "Lcom/huami/koinstartup/KoinInitializer;", "Lorg/koin/core/KoinApplication;", "koinApplication", "", "startKoin", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "module", "<init>", "()V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class KoinStartupInit implements KoinInitializer {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Module module = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.KoinStartupInit$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/api/FeedbackService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0389a extends Lambda implements Function2<Scope, ParametersHolder, FeedbackService> {
            public static final C0389a a = new C0389a();

            public C0389a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FeedbackService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FeedbackServiceImpl((IssueRepository) scope.get(Reflection.getOrCreateKotlinClass(IssueRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, CheckFeedbackEnvUseCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckFeedbackEnvUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CheckFeedbackEnvUseCase((CheckContactValidateUseCase) scope.get(Reflection.getOrCreateKotlinClass(CheckContactValidateUseCase.class), null, null), (CheckSyncLogConnectEnvUseCase) scope.get(Reflection.getOrCreateKotlinClass(CheckSyncLogConnectEnvUseCase.class), null, null), (CheckSyncLogDeviceEnvUseCase) scope.get(Reflection.getOrCreateKotlinClass(CheckSyncLogDeviceEnvUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, FeedbackViewModel> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FeedbackViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FeedbackViewModel((DeviceRepository) scope.get(Reflection.getOrCreateKotlinClass(DeviceRepository.class), null, null), (BluetoothStateRepository) scope.get(Reflection.getOrCreateKotlinClass(BluetoothStateRepository.class), null, null), (IssueRepository) scope.get(Reflection.getOrCreateKotlinClass(IssueRepository.class), null, null), (AccountService) scope.get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null), (CheckChineseUserUseCase) scope.get(Reflection.getOrCreateKotlinClass(CheckChineseUserUseCase.class), null, null), (ConvertUserContactUseCase) scope.get(Reflection.getOrCreateKotlinClass(ConvertUserContactUseCase.class), null, null), (CheckFeedbackEnvUseCase) scope.get(Reflection.getOrCreateKotlinClass(CheckFeedbackEnvUseCase.class), null, null), (UserFormRepository) scope.get(Reflection.getOrCreateKotlinClass(UserFormRepository.class), null, null));
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
            C0389a c0389a = C0389a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(FeedbackService.class), null, c0389a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(CheckFeedbackEnvUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(FeedbackViewModel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
        }
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // com.huami.koinstartup.KoinInitializer, androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return KoinInitializer.DefaultImpls.dependencies(this);
    }

    @Override // com.huami.koinstartup.KoinInitializer
    public void startKoin(@NotNull KoinApplication koinApplication) {
        koinApplication.modules(this.module);
    }

    @Override // com.huami.koinstartup.KoinInitializer
    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        KoinInitializer.DefaultImpls.create(this, context);
    }
}
