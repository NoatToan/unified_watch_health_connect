package com.xiaomi.hm.health.di.koin.module;

import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.sleepassistant.apilib.bean.UserType;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
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
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0001\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\u00020\u0001\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\u00020\u0001\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0001\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0001\"\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "userScope", "", "mifitWebHost", "mifitUserId", "Lkotlin/Function0;", "", "mifitUserAge", "", "mifitIsMale", "mifitHasBoundHrDevice", "mifitUserAvatar", "mifitUserNickName", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getUserModule", "()Lorg/koin/core/module/Module;", "userModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class UserModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0929a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0929a a = new C0929a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0930a extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends Boolean>> {
                public static final C0930a a = new C0930a();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0931a extends Lambda implements Function0<Boolean> {
                    public static final C0931a a = new C0931a();

                    public C0931a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Boolean invoke() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return DeviceCenter.getInstance().hasBoundBandHrDevice();
                    }
                }

                public C0930a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<Boolean> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0931a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "Lcom/huami/sleepassistant/apilib/bean/UserType;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends UserType>> {
                public static final b a = new b();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$b$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/UserType;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0932a extends Lambda implements Function0<UserType> {
                    public static final C0932a a = new C0932a();

                    public C0932a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final UserType invoke() {
                        return UserType.NORMAL;
                    }
                }

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<UserType> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0932a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, String> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return HMWebAccess.getToken();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, String> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return HMServerDef.getHost();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, String> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    String huamiId = HMLoginManager.getHuamiId();
                    return huamiId == null ? EcgData.DEFAULT_DIGIT_VALUE : huamiId;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends String>> {
                public static final f a = new f();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$f$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0933a extends Lambda implements Function0<String> {
                    public static final C0933a a = new C0933a();

                    public C0933a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
                        String nickname = userInfo.getNickname();
                        return nickname == null ? userInfo.getUserid() : nickname;
                    }
                }

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<String> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0933a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends String>> {
                public static final g a = new g();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$g$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0934a extends Lambda implements Function0<String> {
                    public static final C0934a a = new C0934a();

                    public C0934a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
                        String avatarPath = userInfo.getAvatarPath();
                        return avatarPath == null ? userInfo.getAvatar() : avatarPath;
                    }
                }

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<String> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0934a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends Integer>> {
                public static final h a = new h();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$h$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0935a extends Lambda implements Function0<Integer> {
                    public static final C0935a a = new C0935a();

                    public C0935a() {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final int invoke2() {
                        return HMPersonInfo.getInstance().getUserInfo().getAge();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Integer invoke() {
                        return Integer.valueOf(invoke2());
                    }
                }

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<Integer> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0935a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$i */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends Boolean>> {
                public static final i a = new i();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$i$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0936a extends Lambda implements Function0<Boolean> {
                    public static final C0936a a = new C0936a();

                    public C0936a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Boolean invoke() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return HMPersonInfo.getInstance().getUserInfo().getGender() == 1;
                    }
                }

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<Boolean> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0936a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$j */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class j extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends String>> {
                public static final j a = new j();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$j$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0937a extends Lambda implements Function0<String> {
                    public static final C0937a a = new C0937a();

                    public C0937a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return HMPersonInfo.getInstance().getUserInfo().getLocation();
                    }
                }

                public j() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<String> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0937a.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$k */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class k extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends String>> {
                public static final k a = new k();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.UserModuleKt$a$a$k$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0938a extends Lambda implements Function0<String> {
                    public static final C0938a a = new C0938a();

                    public C0938a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return HMPersonInfo.getInstance().getUserInfo().getUserIntroduction();
                    }
                }

                public k() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Function0<String> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return C0938a.a;
                }
            }

            public C0929a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier stringQualifierNamed = QualifierKt.named("Token");
                c cVar = c.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed2 = QualifierKt.named("Host");
                d dVar = d.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed2, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                StringQualifier stringQualifierNamed3 = QualifierKt.named("UserId");
                e eVar = e.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed3, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), stringQualifierNamed3, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                StringQualifier stringQualifierNamed4 = QualifierKt.named("Nickname");
                f fVar = f.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed4, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), stringQualifierNamed4, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                StringQualifier stringQualifierNamed5 = QualifierKt.named("Avatar");
                g gVar = g.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed5, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), stringQualifierNamed5, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                StringQualifier stringQualifierNamed6 = QualifierKt.named("Age");
                h hVar = h.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed6, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), stringQualifierNamed6, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                StringQualifier stringQualifierNamed7 = QualifierKt.named("Gender");
                i iVar = i.a;
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed7, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), stringQualifierNamed7, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                StringQualifier stringQualifierNamed8 = QualifierKt.named("Location");
                j jVar = j.a;
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed8, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), stringQualifierNamed8, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                StringQualifier stringQualifierNamed9 = QualifierKt.named(MiFitQualifiers.SUMMARY);
                k kVar = k.a;
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed9, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), stringQualifierNamed9, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
                StringQualifier stringQualifierNamed10 = QualifierKt.named(MiFitQualifiers.BOUND_HR_DEVICE);
                C0930a c0930a = C0930a.a;
                BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed10, c0930a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), stringQualifierNamed10, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
                StringQualifier stringQualifierNamed11 = QualifierKt.named("Type");
                b bVar = b.a;
                BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), stringQualifierNamed11, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), stringQualifierNamed11, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
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
            module.scope(QualifierKt.named("User"), C0929a.a);
        }
    }

    @NotNull
    public static final Module getUserModule() {
        return a;
    }

    @NotNull
    public static final Function0<Boolean> mifitHasBoundHrDevice(@NotNull Scope scope) {
        return (Function0) userScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named(MiFitQualifiers.BOUND_HR_DEVICE), null);
    }

    @NotNull
    public static final Function0<Boolean> mifitIsMale(@NotNull Scope scope) {
        return (Function0) userScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Gender"), null);
    }

    @NotNull
    public static final Function0<Integer> mifitUserAge(@NotNull Scope scope) {
        return (Function0) userScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Age"), null);
    }

    @NotNull
    public static final Function0<String> mifitUserAvatar(@NotNull Scope scope) {
        return (Function0) userScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Avatar"), null);
    }

    @NotNull
    public static final String mifitUserId(@NotNull Scope scope) {
        return (String) userScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("UserId"), null);
    }

    @NotNull
    public static final Function0<String> mifitUserNickName(@NotNull Scope scope) {
        return (Function0) userScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Nickname"), null);
    }

    @NotNull
    public static final String mifitWebHost(@NotNull Scope scope) {
        return (String) userScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("Host"), null);
    }

    @NotNull
    public static final synchronized Scope userScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "User", QualifierKt.named("User"), null, 4, null);
    }
}
