package com.huami.ai.speech.simplify.inject.module;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.DeviceCheck;
import com.huami.ai.helper.Locales;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.koin.CommonModuleKt;
import com.huami.ai.notify.DialogState;
import com.huami.ai.skill.AudioChannel;
import com.huami.ai.speech.alexa.http.AlexaToken;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo;
import com.huami.ai.speech.simplify.inject.OuterOverrideImpModule;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.huami.ai.speech.simplify.inject.impl.alexa.AlexaTokenImpl;
import com.huami.ai.speech.simplify.inject.impl.alexa.ConvertDataAudioChannelImpl;
import com.huami.ai.speech.simplify.inject.impl.alexa.LocalesImpl;
import com.huami.ai.speech.simplify.inject.impl.miai.XiaoMiTokenImpl;
import com.huami.ai.speech.xiaoai.auth.XiaoMiToken;
import com.huami.ai.speech.xiaoai.koin.XiaoAiModuleKt;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.market.sdk.Constants;
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
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0005\u001a\u00020\u0002H\u0002\u001a\b\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\b\u0010\u0007\u001a\u00020\u0002H\u0002\u001a\b\u0010\b\u001a\u00020\u0002H\u0002\"\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n\"\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010\"\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r\"\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"", Constants.JSON_FEATURE, "", "loadModule", "unloadModule", "a", "c", "b", GoogleApiAvailabilityLight.a, "", "Z", "speechModuleLoaded", "Lorg/koin/core/module/Module;", "Lorg/koin/core/module/Module;", "outerModule", "", "Ljava/util/List;", "commonSkillModule", "simplifyAlexaModule", "e", "simplifyMiAiModule", "speech-simplify_release"}, k = 2, mv = {1, 5, 1})
public final class LoadModuleKt {
    private static boolean a;

    @Nullable
    private static Module b;

    @Nullable
    private static List<Module> c;

    @NotNull
    private static final Module d = ModuleKt.module$default(false, b.a, 1, null);

    @NotNull
    private static final Module e = ModuleKt.module$default(false, c.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "load module";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/speech/alexa/http/AlexaToken;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, AlexaToken> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AlexaToken invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AlexaTokenImpl((AuthApi) scope.get(Reflection.getOrCreateKotlinClass(AuthApi.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.simplify.inject.module.LoadModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/helper/Locales;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0279b extends Lambda implements Function2<Scope, ParametersHolder, Locales> {
            public static final C0279b a = new C0279b();

            public C0279b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Locales invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LocalesImpl((AlexaLanguageRepo) scope.get(Reflection.getOrCreateKotlinClass(AlexaLanguageRepo.class), null, null), (SwitchConfig) scope.get(Reflection.getOrCreateKotlinClass(SwitchConfig.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/AudioChannel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, AudioChannel> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AudioChannel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ConvertDataAudioChannelImpl((Function0) scope.get(Reflection.getOrCreateKotlinClass(Function0.class), null, null), (Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), ((VoiceConfigGot) scope.get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, null)).getVoiceConfig(), (DialogState) scope.get(Reflection.getOrCreateKotlinClass(DialogState.class), null, null));
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
            a aVar = a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AlexaToken.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0279b c0279b = C0279b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Locales.class), null, c0279b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AudioChannel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, XiaoMiToken> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaoMiToken invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaoMiTokenImpl((Function0) scope.get(Reflection.getOrCreateKotlinClass(Function0.class), null, null));
            }
        }

        public c() {
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XiaoMiToken.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "unload module";
        }
    }

    private static final void a() {
        List<Module> skillCommonModuleByDevice = CommonModuleKt.getSkillCommonModuleByDevice((DeviceCheck) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCheck.class), null, null));
        KoinHelperKt.getKoinApp().modules(skillCommonModuleByDevice);
        c = skillCommonModuleByDevice;
        KoinHelperKt.getKoinApp().modules(com.huami.ai.speech.alexa.koin.ModuleKt.getAlexaModule());
        KoinHelperKt.getKoinApp().modules(d);
    }

    private static final void b() {
        List<Module> skillCommonModuleByDevice = CommonModuleKt.getSkillCommonModuleByDevice((DeviceCheck) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCheck.class), null, null));
        KoinHelperKt.getKoinApp().modules(skillCommonModuleByDevice);
        c = skillCommonModuleByDevice;
        KoinHelperKt.getKoinApp().modules(XiaoAiModuleKt.getXiaoAiModuleByDevice((DeviceCheck) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCheck.class), null, null)));
        KoinHelperKt.getKoinApp().modules(e);
    }

    private static final void c() {
        KoinHelperKt.getKoinApp().unloadModules(d);
        KoinHelperKt.getKoinApp().unloadModules(com.huami.ai.speech.alexa.koin.ModuleKt.getAlexaModule());
        List<Module> list = c;
        if (list == null) {
            return;
        }
        KoinHelperKt.getKoinApp().unloadModules(list);
    }

    private static final void d() {
        KoinHelperKt.getKoinApp().unloadModules(e);
        KoinHelperKt.getKoinApp().unloadModules(XiaoAiModuleKt.getXiaoAiModuleByDevice((DeviceCheck) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCheck.class), null, null)));
        List<Module> list = c;
        if (list == null) {
            return;
        }
        KoinHelperKt.getKoinApp().unloadModules(list);
    }

    public static final void loadModule(int i) {
        HMLog.info("speech", a.a);
        if (a) {
            return;
        }
        if (i == 16) {
            a();
        } else if (i == 17) {
            b();
        }
        OuterOverrideImpModule outerOverrideImpModule = (OuterOverrideImpModule) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(OuterOverrideImpModule.class), null, null);
        Module moduleOuterModules = outerOverrideImpModule != null ? outerOverrideImpModule.outerModules() : null;
        if (moduleOuterModules != null) {
            KoinHelperKt.getKoinApp().modules(moduleOuterModules);
        }
        b = moduleOuterModules;
        a = true;
    }

    public static final void unloadModule(int i) {
        HMLog.info("speech", d.a);
        if (a) {
            if (i == 16) {
                c();
            } else if (i == 17) {
                d();
            }
            Module module = b;
            if (module != null) {
                KoinHelperKt.getKoinApp().unloadModules(module);
            }
            a = false;
        }
    }
}
