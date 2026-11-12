package com.huami.ai.koin;

import com.huami.ai.helper.DeviceCheck;
import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.Locales;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.SpeechDeviceImpl;
import com.huami.ai.helper.TimeZone;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.koin.common.ArticleSkillImpl;
import com.huami.ai.koin.common.DefaultListTemplateSkillImpl;
import com.huami.ai.koin.common.DefaultLocalesImpl;
import com.huami.ai.koin.common.DefaultWeatherSkillImpl;
import com.huami.ai.koin.common.FindPhoneSkillImpl;
import com.huami.ai.koin.common.NewBleAlertSkillImpl;
import com.huami.ai.koin.common.NewBleAudioPlaySkillImpl;
import com.huami.ai.koin.common.NewBleCaptionChannelImpl;
import com.huami.ai.koin.common.NewBleFindPhoneSkill;
import com.huami.ai.koin.common.NewBleListTemplateSkillImpl;
import com.huami.ai.koin.common.NewBleVoiceCaptureNotifyImpl;
import com.huami.ai.koin.common.NewBleWeatherSkillImpl;
import com.huami.ai.koin.common.OldBelCaptionChannelImpl;
import com.huami.ai.koin.common.TimeZoneImpl;
import com.huami.ai.notify.DialogState;
import com.huami.ai.notify.VADSendState;
import com.huami.ai.notify.VoiceCaptureNotify;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.skill.ArticleSkill;
import com.huami.ai.skill.AudioPlaySkill;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.skill.FindPhoneSkill;
import com.huami.ai.skill.ListTemplateSkill;
import com.huami.ai.skill.WeatherSkill;
import com.huami.ai.speech.api.scpoe.SpeechScope;
import com.huami.ai.unsupport.check.LanguageCheck;
import com.huami.ai.unsupport.check.LanguageCheckImpl;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
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
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/ai/helper/DeviceCheck;", "deviceCheck", "", "Lorg/koin/core/module/Module;", "getSkillCommonModuleByDevice", "a", "Lorg/koin/core/module/Module;", "oldBleSkillImpModule", "b", "newBleSkillImplModule", "c", "skillCommonModule", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class CommonModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, b.a, 1, null);

    @NotNull
    private static final Module b = ModuleKt.module$default(false, a.a, 1, null);

    @NotNull
    private static final Module c = ModuleKt.module$default(false, c.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.ai.koin.CommonModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/CaptionChannel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0274a extends Lambda implements Function2<Scope, ParametersHolder, CaptionChannel> {
            public static final C0274a a = new C0274a();

            public C0274a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CaptionChannel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleCaptionChannelImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), (VoiceConfigGot) scope.get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/AlertSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, AlertSkill> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AlertSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleAlertSkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), ((VoiceConfigGot) scope.get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, null)).getVoiceConfig());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/ListTemplateSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, ListTemplateSkill> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ListTemplateSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleListTemplateSkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/WeatherSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, WeatherSkill> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeatherSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleWeatherSkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/AudioPlaySkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, AudioPlaySkill> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AudioPlaySkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleAudioPlaySkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, VoiceCaptureNotify> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VoiceCaptureNotify invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleVoiceCaptureNotifyImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), (DialogState) scope.get(Reflection.getOrCreateKotlinClass(DialogState.class), null, null), (VADSendState) scope.get(Reflection.getOrCreateKotlinClass(VADSendState.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/FindPhoneSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, FindPhoneSkill> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FindPhoneSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleFindPhoneSkill((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/ArticleSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, ArticleSkill> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArticleSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ArticleSkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null));
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
            C0274a c0274a = C0274a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CaptionChannel.class), null, c0274a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AlertSkill.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ListTemplateSkill.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WeatherSkill.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AudioPlaySkill.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VoiceCaptureNotify.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            g gVar = g.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FindPhoneSkill.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            h hVar = h.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ArticleSkill.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory8, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory8);
            }
            new Pair(module, singleInstanceFactory8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/CaptionChannel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, CaptionChannel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CaptionChannel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OldBelCaptionChannelImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.koin.CommonModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/ListTemplateSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0275b extends Lambda implements Function2<Scope, ParametersHolder, ListTemplateSkill> {
            public static final C0275b a = new C0275b();

            public C0275b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ListTemplateSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DefaultListTemplateSkillImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/WeatherSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, WeatherSkill> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeatherSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DefaultWeatherSkillImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/FindPhoneSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, FindPhoneSkill> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FindPhoneSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FindPhoneSkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CaptionChannel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0275b c0275b = C0275b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ListTemplateSkill.class), null, c0275b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WeatherSkill.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FindPhoneSkill.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/helper/TimeZone;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, TimeZone> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeZone invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TimeZoneImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/notify/DialogState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DialogState> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DialogState invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DialogState(0);
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.koin.CommonModuleKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/notify/VADSendState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0276c extends Lambda implements Function2<Scope, ParametersHolder, VADSendState> {
            public static final C0276c a = new C0276c();

            public C0276c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VADSendState invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new VADSendState(1);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/unsupport/check/LanguageCheck;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, LanguageCheck> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LanguageCheck invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LanguageCheckImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/helper/Locales;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, Locales> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Locales invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DefaultLocalesImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/ai/helper/VoiceConfigGot;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, VoiceConfigGot> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VoiceConfigGot invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new VoiceConfigGot((VoiceConfig) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(VoiceConfig.class)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/helper/SpeechDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, SpeechDevice> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SpeechDevice invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SpeechDeviceImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, SpeechScope> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SpeechScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SpeechScope();
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TimeZone.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DialogState.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            C0276c c0276c = C0276c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VADSendState.class), null, c0276c, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LanguageCheck.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Locales.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            g gVar = g.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            h hVar = h.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SpeechScope.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory8, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory8);
            }
            new Pair(module, singleInstanceFactory8);
        }
    }

    @NotNull
    public static final List<Module> getSkillCommonModuleByDevice(@NotNull DeviceCheck deviceCheck) {
        return deviceCheck.isSupportNewBleProtocol() ? c.plus(b) : c.plus(a);
    }
}
