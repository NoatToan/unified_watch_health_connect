package com.huami.account.di;

import com.huami.account.AccountExternalContainer;
import com.huami.account.HMLoginManager;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.keeper.AnonymousKeeper;
import com.huami.account.service.AccountService;
import com.huami.account.service.AnonymousInfo;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.account.service.AreaService;
import com.huami.account.service.model.AccountProviderInfo;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.EmailInfo;
import com.huami.account.service.model.FacebookInfo;
import com.huami.account.service.model.GoogleInfo;
import com.huami.account.service.model.LineInfo;
import com.huami.account.service.model.PhoneInfo;
import com.huami.account.service.model.UnknownInfo;
import com.huami.account.service.model.WeChatInfo;
import com.huami.account.service.model.XiaomiInfo;
import com.huami.account.service.proxy.KoinComponentAdapter;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.UserInfo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/account/di/AccountServiceImpl;", "Lcom/huami/account/service/AccountService;", "Lcom/huami/account/service/proxy/KoinComponentAdapter;", "", "Lcom/huami/account/bean/LegalInfoType;", "a", "", "appTokenOrThrow", "userIdOrThrow", "", "getRegisterDate", "userRegionOrThrow", "userCountryCode", "Lcom/huami/account/service/model/Area;", "getUserArea", "getUserOrDeviceArea", "Lcom/huami/account/service/model/AccountProviderInfo;", "getCurrentProviderInfo", "", "isStartUpAgreementAgree", "Lcom/huami/account/service/AreaService;", "Lkotlin/Lazy;", "b", "()Lcom/huami/account/service/AreaService;", "areaService", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountServiceImpl implements AccountService, KoinComponentAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy areaService;

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
            TokenInfo tokenInfo;
            com.huami.passport.entity.LoginToken loginToken = LoginToken.INSTANCE.getLoginToken();
            if (loginToken == null || (tokenInfo = loginToken.getTokenInfo()) == null) {
                return null;
            }
            return tokenInfo.getAppToken();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "匿名用户协议状态：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            TokenInfo tokenInfo;
            com.huami.passport.entity.LoginToken loginToken = LoginToken.INSTANCE.getLoginToken();
            if (loginToken == null || (tokenInfo = loginToken.getTokenInfo()) == null) {
                return null;
            }
            return tokenInfo.getUserId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountServiceImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.areaService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AreaService>() { // from class: com.huami.account.di.AccountServiceImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.service.AreaService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AreaService getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AreaService.class), qualifier, objArr);
            }
        });
    }

    private final List<LegalInfoType> a() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) AnonymousKeeper.INSTANCE.getStartupAgreeTypes(), new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (String str : listSplit$default) {
                LegalInfoType legalInfoType = LegalInfoType.PRIVACY;
                if (!Intrinsics.areEqual(str, legalInfoType.getTypeName())) {
                    legalInfoType = LegalInfoType.AGREEMENT;
                    if (!Intrinsics.areEqual(str, legalInfoType.getTypeName())) {
                        legalInfoType = LegalInfoType.EXPERIENCE;
                        if (!Intrinsics.areEqual(str, legalInfoType.getTypeName())) {
                            legalInfoType = null;
                        }
                    }
                }
                if (legalInfoType != null) {
                    arrayList.add(legalInfoType);
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(CollectionsKt___CollectionsKt.toList(arrayList));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        List<LegalInfoType> list = (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    private final AreaService b() {
        return (AreaService) this.areaService.getValue();
    }

    @Override // com.huami.account.service.AccountService
    @NotNull
    public String appTokenOrThrow() {
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        return anonymousInfo != null ? anonymousInfo.getToken() : (String) LoginToken.INSTANCE.checkLoginState(a.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.huami.account.service.AccountService
    @NotNull
    public AccountProviderInfo getCurrentProviderInfo() {
        AccountManager accountManager = AccountManager.getDefault(AccountExternalContainer.INSTANCE.getAppContext());
        UserInfo userInfo = accountManager.getUserInfo();
        String provider = accountManager.getProvider();
        if (provider != null) {
            switch (provider.hashCode()) {
                case -1240244679:
                    if (provider.equals("google")) {
                        return new GoogleInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
                case -791770330:
                    if (provider.equals("wechat")) {
                        return new WeChatInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
                case -759499589:
                    if (provider.equals("xiaomi")) {
                        return new XiaomiInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
                case -433231361:
                    if (provider.equals("huami_phone")) {
                        return new PhoneInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
                case 3321844:
                    if (provider.equals("line")) {
                        return new LineInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
                case 99628432:
                    if (provider.equals("huami")) {
                        return new EmailInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
                case 497130182:
                    if (provider.equals("facebook")) {
                        return new FacebookInfo(userInfo.getThirdId(), userInfo.getNickName(), userInfo.getEmail());
                    }
                    break;
            }
        }
        return UnknownInfo.INSTANCE;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.account.service.AccountService
    public long getRegisterDate() {
        UserInfo.RegistInfo registInfo;
        UserInfo userInfo = AccountManager.getDefault(AccountExternalContainer.INSTANCE.getAppContext()).getUserInfo();
        if (userInfo == null || (registInfo = userInfo.getRegistInfo()) == null) {
            return 0L;
        }
        return registInfo.getRegistDate();
    }

    @Override // com.huami.account.service.AccountService
    @NotNull
    public Area getUserArea() {
        return b().getUserArea();
    }

    @Override // com.huami.account.service.AccountService
    @NotNull
    public Area getUserOrDeviceArea() {
        return b().getUserOrDeviceArea();
    }

    @Override // com.huami.account.service.AccountService
    public boolean isStartUpAgreementAgree() {
        if (!Language.isSimplifiedChinese() || !HMLoginManager.isUnInit()) {
            return true;
        }
        boolean z = false;
        LegalInfoType[] legalInfoTypeArr = {LegalInfoType.AGREEMENT, LegalInfoType.PRIVACY};
        for (int i = 0; i < 2; i++) {
            if (!a().contains(legalInfoTypeArr[i])) {
                HMLog.debug$default(null, new b(z), 1, null);
                return z;
            }
        }
        z = true;
        HMLog.debug$default(null, new b(z), 1, null);
        return z;
    }

    @Override // com.huami.account.service.AccountService
    @NotNull
    public String userCountryCode() {
        return b().userCountryCode();
    }

    @Override // com.huami.account.service.AccountService
    @NotNull
    public String userIdOrThrow() {
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        return anonymousInfo != null ? anonymousInfo.getUserId() : (String) LoginToken.INSTANCE.checkLoginState(c.a);
    }

    @Override // com.huami.account.service.AccountService
    @NotNull
    public String userRegionOrThrow() {
        return b().userRegionOrThrow();
    }
}
