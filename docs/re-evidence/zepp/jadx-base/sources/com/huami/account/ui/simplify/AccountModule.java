package com.huami.account.ui.simplify;

import android.app.Application;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.IAccountDelegate;
import com.huami.account.ICommonDelegate;
import com.huami.account.IConfigDelegate;
import com.huami.account.ui.simplify.external.ExternalInitializer;
import com.huami.account.ui.simplify.external.WebActivityModuleKt;
import com.huami.account.utils.AppChannelKt;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContextKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/simplify/AccountModule;", "", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/ui/simplify/AccountInitParams;", "params", PointCategory.INIT, "Lorg/koin/core/module/Module;", "a", "", "b", "<init>", "()V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public final class AccountModule {

    @NotNull
    public static final AccountModule INSTANCE = new AccountModule();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/koin/core/module/Module;", "", "invoke", "(Lorg/koin/core/module/Module;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ AccountInitParams a;

        /* JADX INFO: renamed from: com.huami.account.ui.simplify.AccountModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/account/IAccountDelegate;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/account/IAccountDelegate;"}, k = 3, mv = {1, 4, 1})
        public static final class C0269a extends Lambda implements Function2<Scope, DefinitionParameters, IAccountDelegate> {
            public C0269a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IAccountDelegate invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return a.this.a.getDelegate();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/account/ICommonDelegate;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/account/ICommonDelegate;"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function2<Scope, DefinitionParameters, ICommonDelegate> {
            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ICommonDelegate invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return a.this.a.getCommon();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/account/IConfigDelegate;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/account/IConfigDelegate;"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function2<Scope, DefinitionParameters, IConfigDelegate> {
            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IConfigDelegate invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return a.this.a.getConfig();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AccountInitParams accountInitParams) {
            super(1);
            this.a = accountInitParams;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0269a c0269a = new C0269a();
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            BeanDefinition beanDefinition = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(IAccountDelegate.class));
            beanDefinition.setDefinition(c0269a);
            beanDefinition.setKind(kind);
            module.declareDefinition(beanDefinition, new Options(false, false));
            b bVar = new b();
            DefinitionFactory definitionFactory2 = DefinitionFactory.INSTANCE;
            Kind kind2 = Kind.Single;
            BeanDefinition beanDefinition2 = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(ICommonDelegate.class));
            beanDefinition2.setDefinition(bVar);
            beanDefinition2.setKind(kind2);
            module.declareDefinition(beanDefinition2, new Options(false, false));
            c cVar = new c();
            DefinitionFactory definitionFactory3 = DefinitionFactory.INSTANCE;
            Kind kind3 = Kind.Single;
            BeanDefinition beanDefinition3 = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(IConfigDelegate.class));
            beanDefinition3.setDefinition(cVar);
            beanDefinition3.setKind(kind3);
            module.declareDefinition(beanDefinition3, new Options(false, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getValidUid", "()J", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements HMPersonInfo.Callback {
        public static final b a = new b();

        @Override // com.xiaomi.hm.health.model.account.HMPersonInfo.Callback
        public final long getValidUid() {
            return HMLoginManager.getValidUid();
        }
    }

    private AccountModule() {
    }

    private final Module a(AccountInitParams params) {
        return ModuleKt.module$default(false, false, new a(params), 3, null);
    }

    private final void b(AccountInitParams params) {
        AppChannelKt.setAccountSampleChannel(params.getFlavor());
    }

    @JvmStatic
    @NotNull
    public static final Application init(@NotNull Application context, @NotNull AccountInitParams params) {
        String appId;
        AccountModule accountModule = INSTANCE;
        accountModule.b(params);
        ExternalInitializer externalInitializer = params.getExternalInitializer();
        externalInitializer.initGlobalUtil(context, "account", "internal", false);
        externalInitializer.initLog(context);
        externalInitializer.initWebKeeper(context, "account");
        externalInitializer.initHttp(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(accountModule.a(params));
        h.addAll(arrayList, WebActivityModuleKt.getWebModules());
        GlobalContextKt.loadKoinModules(arrayList);
        AccountManager accountManager = AccountManager.getDefault(context);
        if (accountManager.isLogin()) {
            AccountExternalsKt.getAccountDelegate().initDB(context, accountManager.getUserInfo().getThirdId(), accountManager.getCurrentUid());
        }
        TpaConfig tpaConfig = Utils.getTpaConfigs(context).get("xiaomi");
        if (tpaConfig == null || (appId = tpaConfig.getAppId()) == null) {
            throw new RuntimeException("请在 tpac.json 配置小米三方");
        }
        externalInitializer.initAppConfig(context, Long.parseLong(appId), AppChannelKt.getAppName());
        HMLoginManager.init(context);
        HMPersonInfo.initCallback(b.a);
        externalInitializer.initWebContainer();
        return context;
    }
}
