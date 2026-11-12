package com.huami.ai.speech.xiaoai.koin;

import android.content.Context;
import com.huami.ai.helper.DeviceCheck;
import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.skill.BatterySkill;
import com.huami.ai.skill.CustomSkill;
import com.huami.ai.skill.NFCSkill;
import com.huami.ai.skill.NavigateSkill;
import com.huami.ai.skill.PhoneCallSkill;
import com.huami.ai.skill.PlayControlSkill;
import com.huami.ai.skill.PlayInfoSkill;
import com.huami.ai.skill.SetBrightnessSkill;
import com.huami.ai.skill.SystemSettingSkill;
import com.huami.ai.skill.UnSupportOperation;
import com.huami.ai.skill.VolumeControlSkill;
import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomInstruction;
import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomSkillInstruction;
import com.huami.ai.speech.xiaoai.capability.skill.CustomSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.MiBandNewBleExceptionNotifyImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NFCSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NavigateSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NewBleBatterySkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NewBlePlayInfoSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NewBleSystemSettingSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NewCustomSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.NewSetBrightnessSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.OldBleBatterySkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.OldBlePlayControlSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.OldBlePlayInfoSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.PhoneCallSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.PlayControlSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.SetBrightnessSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.SystemSettingSkillImpl;
import com.huami.ai.speech.xiaoai.capability.skill.UnSupportOperationImpl;
import com.huami.ai.speech.xiaoai.capability.skill.VolumeControlSkillImpl;
import com.huami.ai.speech.xiaoai.interceptor.InterceptorChain;
import com.huami.ai.speech.xiaoai.interceptor.MiAiInterceptorChainImpl;
import com.huami.ai.speech.xiaoai.utils.DeviceSpeechIDImpl;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.core.AivsConfig;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/ai/helper/DeviceCheck;", "deviceCheck", "", "Lorg/koin/core/module/Module;", "getXiaoAiModuleByDevice", "a", "Lorg/koin/core/module/Module;", "xiaoaiModule", "b", "oldBleModule", "c", "newBleModule", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class XiaoAiModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, c.a, 1, null);

    @NotNull
    private static final Module b = ModuleKt.module$default(false, b.a, 1, null);

    @NotNull
    private static final Module c = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.ai.speech.xiaoai.koin.XiaoAiModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/CustomSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0282a extends Lambda implements Function2<Scope, ParametersHolder, CustomSkill> {
            public static final C0282a a = new C0282a();

            public C0282a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewCustomSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (SetBrightnessSkill) scope.get(Reflection.getOrCreateKotlinClass(SetBrightnessSkill.class), null, null), (BatterySkill) scope.get(Reflection.getOrCreateKotlinClass(BatterySkill.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/SetBrightnessSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, SetBrightnessSkill> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetBrightnessSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewSetBrightnessSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/SystemSettingSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SystemSettingSkill> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SystemSettingSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleSystemSettingSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/PlayInfoSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PlayInfoSkill> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlayInfoSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBlePlayInfoSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), ((VoiceConfigGot) scope.get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, null)).getVoiceConfig());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/notify/EngineExceptionNotify;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, EngineExceptionNotify> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EngineExceptionNotify invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MiBandNewBleExceptionNotifyImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/BatterySkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, BatterySkill> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BatterySkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NewBleBatterySkillImpl((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/PlayControlSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, PlayControlSkill> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlayControlSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PlayControlSkillImpl((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), (VoiceConfigGot) scope.get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/NavigateSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, NavigateSkill> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NavigateSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NavigateSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/NFCSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, NFCSkill> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NFCSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NFCSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null));
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
            C0282a c0282a = C0282a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomSkill.class), null, c0282a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SetBrightnessSkill.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SystemSettingSkill.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PlayInfoSkill.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EngineExceptionNotify.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BatterySkill.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            g gVar = g.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PlayControlSkill.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            h hVar = h.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NavigateSkill.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory8, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory8);
            }
            new Pair(module, singleInstanceFactory8);
            i iVar = i.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NFCSkill.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, singleInstanceFactory9, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory9);
            }
            new Pair(module, singleInstanceFactory9);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/helper/DeviceSpeechID;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, DeviceSpeechID> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceSpeechID invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceSpeechIDImpl();
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.xiaoai.koin.XiaoAiModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/SetBrightnessSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0283b extends Lambda implements Function2<Scope, ParametersHolder, SetBrightnessSkill> {
            public static final C0283b a = new C0283b();

            public C0283b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetBrightnessSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SetBrightnessSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/SystemSettingSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SystemSettingSkill> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SystemSettingSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SystemSettingSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/PlayInfoSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PlayInfoSkill> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlayInfoSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OldBlePlayInfoSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/CustomSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, CustomSkill> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CustomSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null), (SetBrightnessSkill) scope.get(Reflection.getOrCreateKotlinClass(SetBrightnessSkill.class), null, null), (BatterySkill) scope.get(Reflection.getOrCreateKotlinClass(BatterySkill.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/BatterySkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, BatterySkill> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BatterySkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OldBleBatterySkillImpl((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/PlayControlSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, PlayControlSkill> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlayControlSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OldBlePlayControlSkillImpl((SpeechDevice) scope.get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), (DeviceSpeechID) scope.get(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0283b c0283b = C0283b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SetBrightnessSkill.class), null, c0283b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SystemSettingSkill.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PlayInfoSkill.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomSkill.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BatterySkill.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            g gVar = g.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PlayControlSkill.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/xiaomi/ai/android/core/Engine;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, Engine> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Engine invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return Engine.create((Context) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Context.class)), (AivsConfig) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(AivsConfig.class)), (Settings.ClientInfo) parametersHolder.elementAt(2, Reflection.getOrCreateKotlinClass(Settings.ClientInfo.class)), ((Number) parametersHolder.elementAt(3, Reflection.getOrCreateKotlinClass(Integer.class))).intValue());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/speech/xiaoai/capability/instruction/custom/CustomInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, CustomInstruction> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomInstruction invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CustomSkillInstruction((CustomSkill) scope.get(Reflection.getOrCreateKotlinClass(CustomSkill.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.xiaoai.koin.XiaoAiModuleKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/speech/xiaoai/interceptor/InterceptorChain;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0284c extends Lambda implements Function2<Scope, ParametersHolder, InterceptorChain> {
            public static final C0284c a = new C0284c();

            public C0284c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterceptorChain invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MiAiInterceptorChainImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/UnSupportOperation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, UnSupportOperation> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnSupportOperation invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UnSupportOperationImpl((EngineExceptionNotify) scope.get(Reflection.getOrCreateKotlinClass(EngineExceptionNotify.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/VolumeControlSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, VolumeControlSkill> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VolumeControlSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new VolumeControlSkillImpl((HMBaseDevice) scope.get(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null), (DeviceSpeechID) scope.getOrNull(Reflection.getOrCreateKotlinClass(DeviceSpeechID.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/skill/PhoneCallSkill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, PhoneCallSkill> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PhoneCallSkill invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PhoneCallSkillImpl((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/ai/speech/xiaoai/koin/TranslateNotSupportLanguage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, TranslateNotSupportLanguage> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TranslateNotSupportLanguage invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TranslateNotSupportLanguageImpl(((VoiceConfigGot) scope.get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, null)).getVoiceConfig());
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Engine.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomInstruction.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            C0284c c0284c = C0284c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InterceptorChain.class), null, c0284c, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UnSupportOperation.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VolumeControlSkill.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PhoneCallSkill.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            g gVar = g.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TranslateNotSupportLanguage.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
        }
    }

    @NotNull
    public static final List<Module> getXiaoAiModuleByDevice(@NotNull DeviceCheck deviceCheck) {
        return deviceCheck.isSupportNewBleProtocol() ? a.plus(c) : a.plus(b);
    }
}
