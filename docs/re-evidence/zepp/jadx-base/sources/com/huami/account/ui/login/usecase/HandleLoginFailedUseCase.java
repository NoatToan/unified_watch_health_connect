package com.huami.account.ui.login.usecase;

import android.net.Uri;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.bean.LoginResult;
import com.huami.account.bean.LoginResultKt;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.R;
import com.huami.account.ui.login.LoginActivity;
import com.huami.account.ui.login.entity.PasswordAttemptData;
import com.huami.account.ui.login.entity.XiaomiTempRefreshToken;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.passport.ErrorCode;
import com.huami.passport.Keeper;
import com.huami.passport.entity.Data;
import com.huami.passport.entity.NextActions;
import com.huami.passport.net.HttpConfig;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J1\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0014H\u0086\u0002R\u0019\u0010\"\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;", "", "", "provider", "Lcom/huami/passport/ErrorCode;", "errorCode", "Lcom/huami/account/ui/login/state/LoginFailed;", "h", "code", "Lcom/huami/account/ui/login/entity/PasswordAttemptData;", "i", "", z.j, "(Lcom/huami/passport/ErrorCode;)Ljava/lang/Integer;", "e", "specifiedCountryCode", "c", "b", "a", hl.k, "", "showLoginErrorFragment", "res", "Lcom/huami/account/bean/LoginResult$Failed;", "result", "f", "id", GoogleApiAvailabilityLight.a, "isRegAutoLogin", "invoke", "Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "getHandleLoginUnknownErrorUseCase", "()Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "handleLoginUnknownErrorUseCase", "<init>", "(Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;)V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HandleLoginFailedUseCase {

    @NotNull
    private static final String b = "block_time";

    @NotNull
    private static final String c = "attempts";

    @NotNull
    private static final String d = "max_attempts";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginUnknownErrorUseCase handleLoginUnknownErrorUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "注册错误：0129，未获取到 href";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "注册错误：0129，href = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ErrorCode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ErrorCode errorCode) {
            super(0);
            this.a = errorCode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onError:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Map<String, String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Map<String, String> map) {
            super(0);
            this.a = str;
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String str = this.a;
            return "onError-" + str + ":" + ((Object) this.b.get(str));
        }
    }

    public HandleLoginFailedUseCase(@NotNull HandleLoginUnknownErrorUseCase handleLoginUnknownErrorUseCase) {
        this.handleLoginUnknownErrorUseCase = handleLoginUnknownErrorUseCase;
    }

    private final LoginFailed a(String provider, ErrorCode errorCode) {
        Keeper.clearToken(AccountExternalsKt.getAppContext());
        HMAccountKeeper.INSTANCE.keepLoginData(null, null, null);
        String userId = errorCode.getUserId();
        return userId == null || userId.length() == 0 ? g(this, provider, false, 0, LoginResultKt.toResult(errorCode), 4, null) : new LoginFailed.AccountException(userId);
    }

    private final LoginFailed b(String provider, ErrorCode errorCode) {
        NextActions nextActions;
        String userId = errorCode.getUserId();
        List<NextActions> nextActions2 = errorCode.getNextActions();
        String href = (nextActions2 == null || (nextActions = (NextActions) CollectionsKt.getOrNull(nextActions2, 0)) == null) ? null : nextActions.getHref();
        Data data = errorCode.getData();
        String appToken = data != null ? data.getAppToken() : null;
        if (!(userId == null || userId.length() == 0)) {
            if (!(href == null || href.length() == 0)) {
                LoginFailed.AccountFrozen accountFrozen = new LoginFailed.AccountFrozen(provider, userId, href, appToken);
                Keeper.clearToken(AccountExternalsKt.getAppContext());
                return accountFrozen;
            }
        }
        return g(this, provider, true, 0, LoginResultKt.toResult(errorCode), 4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r6.equals("facebook") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r6.equals("huami") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r6.equals("line") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r6.equals("huami_phone") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r6.equals("xiaomi") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r6.equals("wechat") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r6.equals("google") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return new com.huami.account.ui.login.state.LoginFailed.AccountV2NotRegister(r6, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return new com.huami.account.ui.login.state.LoginFailed.ThirdPartNotRegister(r6, r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final LoginFailed c(ErrorCode errorCode, String provider, String specifiedCountryCode) {
        String accessToken = errorCode.getData() == null ? null : errorCode.getData().getAccessToken();
        XiaomiTempRefreshToken xiaomiTempRefreshToken = XiaomiTempRefreshToken.INSTANCE;
        Data data = errorCode.getData();
        xiaomiTempRefreshToken.setRefreshToken(data != null ? data.getRefreshToken() : null);
        switch (provider.hashCode()) {
            case -1240244679:
                break;
            case -791770330:
                break;
            case -759499589:
                break;
            case -433231361:
                break;
            case 3321844:
                break;
            case 99628432:
                break;
            case 497130182:
                break;
            default:
                return new LoginFailed.IgnoredError("未知三方类型");
        }
    }

    private final String d(int id) {
        return AccountExternalsKt.getAppContext().getString(id);
    }

    private final LoginFailed e(ErrorCode errorCode, String provider) {
        NextActions nextActions;
        Keeper.clearToken(AccountExternalsKt.getAppContext());
        List<NextActions> nextActions2 = errorCode.getNextActions();
        String href = (nextActions2 == null || (nextActions = (NextActions) CollectionsKt.firstOrNull((List) nextActions2)) == null) ? null : nextActions.getHref();
        if (href == null || href.length() == 0) {
            HMLog.info$default(null, a.a, 1, null);
            return g(this, provider, true, 0, LoginResultKt.toResult(errorCode), 4, null);
        }
        HMLog.info$default(null, new b(href), 1, null);
        return new LoginFailed.RegisterErrorUrl(href);
    }

    private final LoginFailed f(String provider, boolean showLoginErrorFragment, int res, LoginResult.Failed result) {
        return this.handleLoginUnknownErrorUseCase.invoke(provider, showLoginErrorFragment, res, result);
    }

    public static /* synthetic */ LoginFailed g(HandleLoginFailedUseCase handleLoginFailedUseCase, String str, boolean z, int i, LoginResult.Failed failed, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = R.string.account_ui_login_failed;
        }
        return handleLoginFailedUseCase.f(str, z, i, failed);
    }

    private final LoginFailed h(String provider, ErrorCode errorCode) {
        Map<String, String> headers = HttpConfig.getHeaders();
        Iterator<String> it2 = headers.keySet().iterator();
        while (it2.hasNext()) {
            HMLog.info(LoginActivity.TAG, new d(it2.next(), headers));
        }
        return g(this, provider, true, 0, LoginResultKt.toResult(errorCode), 4, null);
    }

    private final PasswordAttemptData i(ErrorCode code) {
        try {
            Result.Companion companion = Result.Companion;
            Uri uri = Uri.parse(code.getExtras());
            String queryParameter = uri.getQueryParameter(c);
            Integer numValueOf = queryParameter == null ? null : Integer.valueOf(Integer.parseInt(queryParameter));
            String queryParameter2 = uri.getQueryParameter(d);
            Integer numValueOf2 = queryParameter2 == null ? null : Integer.valueOf(Integer.parseInt(queryParameter2));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
            return new PasswordAttemptData(numValueOf.intValue(), numValueOf2.intValue());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            return (PasswordAttemptData) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        }
    }

    public static /* synthetic */ LoginFailed invoke$default(HandleLoginFailedUseCase handleLoginFailedUseCase, String str, ErrorCode errorCode, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return handleLoginFailedUseCase.invoke(str, errorCode, str2, z);
    }

    private final Integer j(ErrorCode errorCode) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String queryParameter = Uri.parse(errorCode.getExtras()).getQueryParameter(b);
            objM3845constructorimpl = Result.m3845constructorimpl(queryParameter == null ? null : Integer.valueOf(Integer.parseInt(queryParameter)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private final LoginFailed k(String provider) {
        String strD;
        int iHashCode = provider.hashCode();
        if (iHashCode == -1240244679) {
            if (provider.equals("google")) {
                strD = d(R.string.account_ui_no_google_play_services_title);
                return new LoginFailed.NormalMessageError(strD);
            }
            return new LoginFailed.IgnoredError("不合法的 provider: " + provider);
        }
        if (iHashCode == -791770330) {
            if (provider.equals("wechat")) {
                strD = d(R.string.account_ui_wechat_uninstall);
                return new LoginFailed.NormalMessageError(strD);
            }
            return new LoginFailed.IgnoredError("不合法的 provider: " + provider);
        }
        if (iHashCode == 497130182 && provider.equals("facebook")) {
            strD = d(R.string.account_ui_facebook_uninstall);
            return new LoginFailed.NormalMessageError(strD);
        }
        return new LoginFailed.IgnoredError("不合法的 provider: " + provider);
    }

    @NotNull
    public final HandleLoginUnknownErrorUseCase getHandleLoginUnknownErrorUseCase() {
        return this.handleLoginUnknownErrorUseCase;
    }

    @NotNull
    public final LoginFailed invoke(@NotNull String provider, @Nullable ErrorCode errorCode, @Nullable String specifiedCountryCode, boolean isRegAutoLogin) {
        LoginFailed attemptLimit;
        HMLog.info(LoginActivity.TAG, new c(errorCode));
        if (errorCode == null) {
            return h(provider, null);
        }
        String errorCode2 = errorCode.getErrorCode();
        if (Intrinsics.areEqual(errorCode2, ErrorCode.USER_CANCEL_ERROR)) {
            Keeper.clearToken(AccountExternalsKt.getAppContext());
            return new LoginFailed.IgnoredError("登录取消");
        }
        if (Intrinsics.areEqual(errorCode2, ErrorCode.UNINSTALL_TPAPP_ERROR)) {
            k(provider);
            Keeper.clearToken(AccountExternalsKt.getAppContext());
            return new LoginFailed.IgnoredError("三方错误");
        }
        if (HMLoginManager.accountExceptionErrorCodes().contains(errorCode2)) {
            return a(provider, errorCode);
        }
        if (Intrinsics.areEqual(errorCode2, HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_NOT_REGISTER)) {
            return c(errorCode, provider, specifiedCountryCode);
        }
        if (Intrinsics.areEqual(errorCode2, HMWebAccess.AUTH_SERVER_ERROR_FROZEN)) {
            return b(provider, errorCode);
        }
        if (Intrinsics.areEqual(errorCode2, HMWebAccess.AUTH_SERVER_ERROR_USER_IN_ERROR_REGION)) {
            return new LoginFailed.RegionLimit(!isRegAutoLogin);
        }
        if (HMLoginManager.thirdPartOauthErrorCodes().contains(errorCode2)) {
            return f(provider, false, R.string.account_ui_third_part_oauth_error, LoginResultKt.toResult(errorCode));
        }
        if (Intrinsics.areEqual(errorCode2, "0129")) {
            return e(errorCode, provider);
        }
        if (Intrinsics.areEqual(errorCode2, "401")) {
            Integer numJ = j(errorCode);
            if (numJ != null) {
                return new LoginFailed.AttemptLimit(provider, null, numJ, 2, null);
            }
            attemptLimit = new LoginFailed.AccountOrPasswordIncorrect(provider, i(errorCode));
        } else {
            if (Intrinsics.areEqual(errorCode2, HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_ALREADY_REGISTER)) {
                return LoginFailed.AccountAlreadyRegister.INSTANCE;
            }
            if (!Intrinsics.areEqual(errorCode2, "429")) {
                return h(provider, errorCode);
            }
            attemptLimit = new LoginFailed.AttemptLimit(provider, null, j(errorCode), 2, null);
        }
        return attemptLimit;
    }
}
