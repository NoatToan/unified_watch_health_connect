package com.xiaomi.hm.health.di.koin.module;

import android.content.Context;
import android.util.SparseArray;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.chart.data.ChartData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.pai.db.PaiDb;
import com.huami.pai.device.IPaiDevice;
import com.huami.pai.dto.HttpUserInfo;
import com.huami.pai.dto.IHttpUserInfoManager;
import com.huami.pai.dto.Myself;
import com.huami.pai.dto.SingleHttpInfoManager;
import com.huami.pai.koin.ModulesKt;
import com.huami.pai.koin.PaiQualifierNames;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.navigate.ExternalNavigator;
import com.huami.pai.navigate.ExternalUrlNavigator;
import com.huami.pai.p004const.SharedPrefConst;
import com.huami.pai.sp.ISharedPref;
import com.huami.pai.ui.heartrate.IPaiHeartRateRepo;
import com.huami.pai.ui.history.PAIBaseRepo;
import com.huami.pai.ui.history.PaiRemoteRepo;
import com.huami.pai.ui.hrsetting.IHeartRateSettingFactory;
import com.huami.pai.web.HttpInteraction;
import com.huami.pai.web.IPaiWebApi;
import com.huami.pai.web.PaiWebApiImpl;
import com.huami.pai_service.PaiDoService;
import com.huami.watch.util.Box;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.navigation.PaiExternalNavigator;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.ui.pai.PaiDoServiceImp;
import com.xiaomi.hm.health.ui.pai.PaiHelper;
import com.xiaomi.hm.health.ui.pai.hrsetting.HeartRateSettingFactory;
import com.xiaomi.hm.health.webapi.PaiHttpInteraction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
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
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getPaiExternalModule", "()Lorg/koin/core/module/Module;", "paiExternalModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class PaiModulesKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            ModulesKt.scopePai(module, new Function1<ScopeDSL, Unit>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/dto/Myself;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function2<Scope, ParametersHolder, Myself> {
                    public static final a a = new a();

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$a$a, reason: collision with other inner class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class C0922a extends Lambda implements Function0<Float> {
                        public static final C0922a a = new C0922a();

                        public C0922a() {
                            super(0);
                        }

                        public final float a() {
                            HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
                            return HMWeightUtils.calcuBMI(userInfo.getHeight(), userInfo.getWeight());
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Float invoke() {
                            return Float.valueOf(a());
                        }
                    }

                    public a() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Myself invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new Myself(UserModuleKt.mifitUserId(scope), UserModuleKt.mifitIsMale(scope), UserModuleKt.mifitUserAge(scope), C0922a.a);
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/dto/IHttpUserInfoManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function2<Scope, ParametersHolder, IHttpUserInfoManager> {
                    public static final b a = new b();

                    public b() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IHttpUserInfoManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        SingleHttpInfoManager singleHttpInfoManager = new SingleHttpInfoManager(null, 1, null);
                        singleHttpInfoManager.setCurrentUserInfo(new HttpUserInfo(UserModuleKt.mifitUserId(scope), "default", HMDeviceUtils.getDateTimestamp(AccountModuleKt.getAccountService().getRegisterDate()), HMPersonInfo.getInstance().getUserInfo().getAge(), HMPersonInfo.getInstance().getUserInfo().getGender()));
                        return singleHttpInfoManager;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai_service/PaiDoService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function2<Scope, ParametersHolder, PaiDoService> {
                    public static final c a = new c();

                    public c() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final PaiDoService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new PaiDoServiceImp((PaiDb) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PaiDb.class), null, null));
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$d */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class d extends Lambda implements Function2<Scope, ParametersHolder, String> {
                    public static final d a = new d();

                    public d() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return StringsKt__StringsKt.contains$default((CharSequence) HMServerDef.getHost(), (CharSequence) "staging", false, 2, (Object) null) ? "https://api-mifit-staging.huami.com/t/pai-test" : "https://api.huami.com/t/huami.pai";
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$e */
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
                        return UserModuleKt.mifitWebHost(scope);
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$f */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/web/HttpInteraction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class f extends Lambda implements Function2<Scope, ParametersHolder, HttpInteraction> {
                    public static final f a = new f();

                    public f() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final HttpInteraction invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new PaiHttpInteraction();
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$g */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/web/IPaiWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class g extends Lambda implements Function2<Scope, ParametersHolder, IPaiWebApi> {
                    public static final g a = new g();

                    public g() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IPaiWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new PaiWebApiImpl(ScopesAndQualifersKt.myself(scope).getUserId(), ScopesAndQualifersKt.paiWebHost(scope), (HttpInteraction) ScopesAndQualifersKt.paiScope(scope).get(Reflection.getOrCreateKotlinClass(HttpInteraction.class), null, null));
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$h */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/navigate/ExternalNavigator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class h extends Lambda implements Function2<Scope, ParametersHolder, ExternalNavigator> {
                    public static final h a = new h();

                    public h() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ExternalNavigator invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new PaiExternalNavigator();
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$i */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/ui/hrsetting/IHeartRateSettingFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class i extends Lambda implements Function2<Scope, ParametersHolder, IHeartRateSettingFactory> {
                    public static final i a = new i();

                    public i() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IHeartRateSettingFactory invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new HeartRateSettingFactory();
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$j */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/ui/history/PAIBaseRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class j extends Lambda implements Function2<Scope, ParametersHolder, PAIBaseRepo> {
                    public static final j a = new j();

                    public j() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final PAIBaseRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new PaiRemoteRepo((IHttpUserInfoManager) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IHttpUserInfoManager.class), null, null));
                    }
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
                    BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Myself.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                    StringQualifier stringQualifierNamed = QualifierKt.named(PaiQualifierNames.FITNESS_AGE_QUESTIONNAIRE);
                    d dVar = d.a;
                    BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                    StringQualifier stringQualifierNamed2 = QualifierKt.named(PaiQualifierNames.HOST);
                    e eVar = e.a;
                    BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed2, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                    f fVar = f.a;
                    BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HttpInteraction.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                    g gVar = g.a;
                    BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IPaiWebApi.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                    h hVar = h.a;
                    BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExternalNavigator.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                    i iVar = i.a;
                    BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IHeartRateSettingFactory.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                    AnonymousClass8 anonymousClass8 = new Function2<Scope, ParametersHolder, ExternalUrlNavigator>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.8
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final ExternalUrlNavigator invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new ExternalUrlNavigator() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.8.1
                                @NotNull
                                public final Flow<String> getHMDetailApi() {
                                    final MutableLiveData mutableLiveData = new MutableLiveData();
                                    HMSportWebAPI.getPaiMoreUrl(new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$8$1$getHMDetailApi$1
                                        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                                        public void onCancel(int type) {
                                        }

                                        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                                        public void onCompleted() {
                                        }

                                        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                                        public void onError(@NotNull Throwable throwable) {
                                        }

                                        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
                                        public void onItem(@NotNull HMHttpResponseData item) {
                                            if (item.isSuccess()) {
                                                try {
                                                    mutableLiveData.postValue(new JSONObject(new JSONObject(item.getResponseString()).getString("huami.web.urls")).getJSONObject("faqPai").getString("url"));
                                                } catch (JSONException e2) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                        }
                                    });
                                    return FlowLiveDataConversions.asFlow(mutableLiveData);
                                }

                                @Override // com.huami.pai.navigate.ExternalUrlNavigator
                                @NotNull
                                public Flow<String> getUrl() {
                                    return getHMDetailApi();
                                }

                                @Override // com.huami.pai.navigate.ExternalNavigator
                                public void navigateToWeb(@NotNull Context context, @NotNull String url) {
                                    WebHelper.launch(url);
                                    Analytics.recordEvent(new CountEventBuilder(StatEvent.SPORT_PAI_C).addExtra("tp", StatEvent.KNOWMORE));
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExternalUrlNavigator.class), null, anonymousClass8, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                    j jVar = j.a;
                    BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PAIBaseRepo.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
                    b bVar = b.a;
                    BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IHttpUserInfoManager.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
                    AnonymousClass11 anonymousClass11 = new Function2<Scope, ParametersHolder, ISharedPref>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.11
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final ISharedPref invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new ISharedPref() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.11.1
                                @Override // com.huami.pai.sp.ISharedPref
                                public boolean getBoolean(@NotNull String key) {
                                    if ("key_pai_guide_rollout".equals(key)) {
                                        return HMKeeper.getPaiGuideRollout();
                                    }
                                    return false;
                                }

                                @Override // com.huami.pai.sp.ISharedPref
                                public int getInt(@NotNull String key, int i2) {
                                    return key.equals("pai_total_value") ? HMKeeper.getPaiPopShowTotalValue() : Box.get().getInt(key, i2);
                                }

                                @Override // com.huami.pai.sp.ISharedPref
                                @NotNull
                                public String getString(@NotNull String key, @NotNull String str) {
                                    if ("pai_total_date".equals(key)) {
                                        return HMKeeper.getPaiPopShowTotalDate();
                                    }
                                    if ("pai_daily_date".equals(key)) {
                                        return HMKeeper.getPaiPopShowDailyDate();
                                    }
                                    if (!SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME.equals(key)) {
                                        return "";
                                    }
                                    String strValueOf = HMKeeper.valueOf(SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME);
                                    return strValueOf == null ? "0" : strValueOf;
                                }

                                @Override // com.huami.pai.sp.ISharedPref
                                public void saveBoolean(@NotNull String key, boolean value) {
                                    if ("key_pai_guide_rollout".equals(key)) {
                                        HMKeeper.savePaiGuideRollout(value);
                                    }
                                }

                                @Override // com.huami.pai.sp.ISharedPref
                                public void saveInt(@NotNull String key, int value) {
                                    if ("pai_total_value".equals(key)) {
                                        HMKeeper.setPaiPopShowTotalValue(value);
                                    }
                                    Box box = Box.get();
                                    if (box == null) {
                                        return;
                                    }
                                    box.put(key, value);
                                }

                                @Override // com.huami.pai.sp.ISharedPref
                                public void saveString(@NotNull String key, @NotNull String value) {
                                    if ("pai_total_date".equals(key)) {
                                        HMKeeper.setPaiPopShowTotalDate(value);
                                    }
                                    if ("pai_daily_date".equals(key)) {
                                        HMKeeper.setPaiPopShowDailyDate(value);
                                    }
                                    if (SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME.equals(key)) {
                                        HMKeeper.setValue(SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME, value);
                                    }
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ISharedPref.class), null, anonymousClass11, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
                    AnonymousClass12 anonymousClass12 = new Function2<Scope, ParametersHolder, IPaiDevice>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.12
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final IPaiDevice invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new IPaiDevice() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.12.1

                                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$12$1$a */
                                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$12$1$supportPaiButDisabled$1", f = "PaiModules.kt", i = {}, l = {WeightingState.state_weight_overload}, m = "invokeSuspend", n = {}, s = {})
                                public static final class a extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
                                    public int a;
                                    private /* synthetic */ Object b;
                                    public final /* synthetic */ Context c;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public a(Context context, Continuation<? super a> continuation) {
                                        super(2, continuation);
                                        this.c = context;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Object invoke(@NotNull LiveDataScope<Boolean> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((a) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        a aVar = new a(this.c, continuation);
                                        aVar.b = obj;
                                        return aVar;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                        int i = this.a;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            LiveDataScope liveDataScope = (LiveDataScope) this.b;
                                            Boolean boolBoxBoolean = Boxing.boxBoolean(PaiHelper.isSupportPaiButDisabled(this.c));
                                            this.a = 1;
                                            if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // com.huami.pai.device.IPaiDevice
                                @NotNull
                                public LiveData<Boolean> supportPaiButDisabled(@NotNull Context context) {
                                    return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new a(context, null), 3, (Object) null);
                                }

                                @Override // com.huami.pai.device.IPaiDevice
                                @NotNull
                                public LiveData<Boolean> supportPaiInDevice() {
                                    return PaiHelper.showPaiToast();
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IPaiDevice.class), null, anonymousClass12, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
                    AnonymousClass13 anonymousClass13 = new Function2<Scope, ParametersHolder, IPaiHeartRateRepo>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.13

                        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$a */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Constants.DATA_KEY_HR, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                        public static final class a extends Lambda implements Function1<Integer, Boolean> {
                            public static final a a = new a();

                            public a() {
                                super(1);
                            }

                            public final boolean a(int i) {
                                return i >= 9 && i < 254;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return Boolean.valueOf(a(num.intValue()));
                            }
                        }

                        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$a] */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final IPaiHeartRateRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.element = a.a;
                            return new IPaiHeartRateRepo() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt.paiExternalModule.1.1.13.1

                                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$1$a */
                                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlin.jvm.PlatformType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$1$heartRateData$1", f = "PaiModules.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
                                public static final class a extends SuspendLambda implements Function2<FlowCollector<? super byte[]>, Continuation<? super Unit>, Object> {
                                    public int a;
                                    private /* synthetic */ Object b;
                                    public final /* synthetic */ String c;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public a(String str, Continuation<? super a> continuation) {
                                        super(2, continuation);
                                        this.c = str;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        a aVar = new a(this.c, continuation);
                                        aVar.b = obj;
                                        return aVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull FlowCollector<? super byte[]> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                                        return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                        int i = this.a;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            FlowCollector flowCollector = (FlowCollector) this.b;
                                            byte[] bArrQueryWholeDayHeartRateByDay = HRDataManager.getInstance().queryWholeDayHeartRateByDay(this.c);
                                            this.a = 1;
                                            if (flowCollector.emit(bArrQueryWholeDayHeartRateByDay, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // com.huami.pai.ui.heartrate.IPaiHeartRateRepo
                                @NotNull
                                public Flow<android.util.Pair<SparseArray<ChartData>, Integer>> heartRateData(@NotNull CoroutineScope scope2, @NotNull String dateString, @NotNull String userId) {
                                    final Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new a(dateString, null)), Dispatchers.getIO());
                                    final Ref.ObjectRef<Function1<Integer, Boolean>> objectRef2 = objectRef;
                                    return new Flow<android.util.Pair<SparseArray<ChartData>, Integer>>() { // from class: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$1$heartRateData$$inlined$map$1

                                        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$1$heartRateData$$inlined$map$1$2, reason: invalid class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                                        public static final class AnonymousClass2 implements FlowCollector<byte[]> {
                                            public final /* synthetic */ FlowCollector a;
                                            public final /* synthetic */ Ref.ObjectRef b;

                                            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$1$heartRateData$$inlined$map$1$2$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.module.PaiModulesKt$paiExternalModule$1$1$13$1$heartRateData$$inlined$map$1$2", f = "PaiModules.kt", i = {}, l = {141}, m = "emit", n = {}, s = {})
                                            public static final class AnonymousClass1 extends ContinuationImpl {
                                                public /* synthetic */ Object a;
                                                public int b;
                                                public Object c;

                                                public AnonymousClass1(Continuation continuation) {
                                                    super(continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    this.a = obj;
                                                    this.b |= Integer.MIN_VALUE;
                                                    return AnonymousClass2.this.emit(null, this);
                                                }
                                            }

                                            public AnonymousClass2(FlowCollector flowCollector, Ref.ObjectRef objectRef) {
                                                this.a = flowCollector;
                                                this.b = objectRef;
                                            }

                                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                            @Override // kotlinx.coroutines.flow.FlowCollector
                                            @Nullable
                                            public Object emit(byte[] bArr, @NotNull Continuation continuation) {
                                                AnonymousClass1 anonymousClass1;
                                                if (continuation instanceof AnonymousClass1) {
                                                    anonymousClass1 = (AnonymousClass1) continuation;
                                                    int i = anonymousClass1.b;
                                                    if ((i & Integer.MIN_VALUE) != 0) {
                                                        anonymousClass1.b = i - Integer.MIN_VALUE;
                                                    } else {
                                                        anonymousClass1 = new AnonymousClass1(continuation);
                                                    }
                                                } else {
                                                    anonymousClass1 = new AnonymousClass1(continuation);
                                                }
                                                Object obj = anonymousClass1.a;
                                                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                                int i2 = anonymousClass1.b;
                                                if (i2 == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    FlowCollector flowCollector = this.a;
                                                    android.util.Pair<SparseArray<ChartData>, Integer> chartDataListFromWholeDayHr = HRDataManager.getInstance().parseChartDataListFromWholeDayHr(bArr, (Function1) this.b.element);
                                                    SparseArray sparseArray = (SparseArray) chartDataListFromWholeDayHr.first;
                                                    Integer num = (Integer) chartDataListFromWholeDayHr.second;
                                                    if (!((Boolean) ((Function1) this.b.element).invoke(num)).booleanValue()) {
                                                        throw Exceptions.propagate(new HRDataManager.NoWholeDayHeartRateException());
                                                    }
                                                    android.util.Pair pair = new android.util.Pair(sparseArray, num);
                                                    anonymousClass1.b = 1;
                                                    if (flowCollector.emit(pair, anonymousClass1) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i2 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlinx.coroutines.flow.Flow
                                        @Nullable
                                        public Object collect(@NotNull FlowCollector<? super android.util.Pair<SparseArray<ChartData>, Integer>> flowCollector, @NotNull Continuation continuation) {
                                            Object objCollect = flowFlowOn.collect(new AnonymousClass2(flowCollector, objectRef2), continuation);
                                            return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                        }
                                    };
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IPaiHeartRateRepo.class), null, anonymousClass13, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition13);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory13, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
                    c cVar = c.a;
                    BeanDefinition beanDefinition14 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PaiDoService.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(beanDefinition14);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey14, scopedInstanceFactory14, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory14);
                }
            });
        }
    }, 1, null);

    @NotNull
    public static final Module getPaiExternalModule() {
        return a;
    }
}
