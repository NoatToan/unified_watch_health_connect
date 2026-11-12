package com.huami.account.ui.login.state;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.login.entity.PasswordAttemptData;
import com.huami.message.api.WebConst;
import com.huami.passport.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed;", "", "<init>", "()V", "AccountAlreadyRegister", "AccountException", "AccountFrozen", "AccountOrPasswordIncorrect", "AccountV2NotRegister", "AttemptLimit", "CommonLoginError", "CustomMessageTip", "IgnoredError", "NormalMessageError", "RegionLimit", "RegisterErrorUrl", "ThirdPartNotRegister", "Lcom/huami/account/ui/login/state/LoginFailed$RegionLimit;", "Lcom/huami/account/ui/login/state/LoginFailed$NormalMessageError;", "Lcom/huami/account/ui/login/state/LoginFailed$CustomMessageTip;", "Lcom/huami/account/ui/login/state/LoginFailed$AccountFrozen;", "Lcom/huami/account/ui/login/state/LoginFailed$AccountException;", "Lcom/huami/account/ui/login/state/LoginFailed$ThirdPartNotRegister;", "Lcom/huami/account/ui/login/state/LoginFailed$RegisterErrorUrl;", "Lcom/huami/account/ui/login/state/LoginFailed$CommonLoginError;", "Lcom/huami/account/ui/login/state/LoginFailed$AccountOrPasswordIncorrect;", "Lcom/huami/account/ui/login/state/LoginFailed$AccountAlreadyRegister;", "Lcom/huami/account/ui/login/state/LoginFailed$AccountV2NotRegister;", "Lcom/huami/account/ui/login/state/LoginFailed$AttemptLimit;", "Lcom/huami/account/ui/login/state/LoginFailed$IgnoredError;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class LoginFailed {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$AccountAlreadyRegister;", "Lcom/huami/account/ui/login/state/LoginFailed;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AccountAlreadyRegister extends LoginFailed {

        @NotNull
        public static final AccountAlreadyRegister INSTANCE = new AccountAlreadyRegister();

        private AccountAlreadyRegister() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$AccountException;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "<init>", "(Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AccountException extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String userId;

        public AccountException(@NotNull String str) {
            super(null);
            this.userId = str;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$AccountFrozen;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "b", "getUserId", "userId", "c", "getUrl", "url", GoogleApiAvailabilityLight.a, "getAppToken", "appToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AccountFrozen extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String userId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final String url;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private final String appToken;

        public AccountFrozen(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
            super(null);
            this.provider = str;
            this.userId = str2;
            this.url = str3;
            this.appToken = str4;
        }

        @Nullable
        public final String getAppToken() {
            return this.appToken;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$AccountOrPasswordIncorrect;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "Lcom/huami/account/ui/login/entity/PasswordAttemptData;", "b", "Lcom/huami/account/ui/login/entity/PasswordAttemptData;", "getAttemptData", "()Lcom/huami/account/ui/login/entity/PasswordAttemptData;", "attemptData", "<init>", "(Ljava/lang/String;Lcom/huami/account/ui/login/entity/PasswordAttemptData;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AccountOrPasswordIncorrect extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final PasswordAttemptData attemptData;

        public AccountOrPasswordIncorrect(@NotNull String str, @Nullable PasswordAttemptData passwordAttemptData) {
            super(null);
            this.provider = str;
            this.attemptData = passwordAttemptData;
        }

        @Nullable
        public final PasswordAttemptData getAttemptData() {
            return this.attemptData;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$AccountV2NotRegister;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "Lcom/huami/passport/ErrorCode;", "b", "Lcom/huami/passport/ErrorCode;", "getErrorCode", "()Lcom/huami/passport/ErrorCode;", "errorCode", "c", "getSpecifiedCountryCode", "specifiedCountryCode", "<init>", "(Ljava/lang/String;Lcom/huami/passport/ErrorCode;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AccountV2NotRegister extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ErrorCode errorCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String specifiedCountryCode;

        public AccountV2NotRegister(@NotNull String str, @NotNull ErrorCode errorCode, @Nullable String str2) {
            super(null);
            this.provider = str;
            this.errorCode = errorCode;
            this.specifiedCountryCode = str2;
        }

        @NotNull
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }

        @Nullable
        public final String getSpecifiedCountryCode() {
            return this.specifiedCountryCode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$AttemptLimit;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "b", "getUsername", "username", "", "c", "Ljava/lang/Integer;", "getBlockTime", "()Ljava/lang/Integer;", "blockTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AttemptLimit extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String username;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Integer blockTime;

        public /* synthetic */ AttemptLimit(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, num);
        }

        @Nullable
        public final Integer getBlockTime() {
            return this.blockTime;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }

        @NotNull
        public final String getUsername() {
            return this.username;
        }

        public AttemptLimit(@NotNull String str, @NotNull String str2, @Nullable Integer num) {
            super(null);
            this.provider = str;
            this.username = str2;
            this.blockTime = num;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$CommonLoginError;", "Lcom/huami/account/ui/login/state/LoginFailed;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class CommonLoginError extends LoginFailed {

        @NotNull
        public static final CommonLoginError INSTANCE = new CommonLoginError();

        private CommonLoginError() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$CustomMessageTip;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "", WebConst.QueryParam.MESSAGE_ID, "(I)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class CustomMessageTip extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final String message;

        public CustomMessageTip(@Nullable String str) {
            super(null);
            this.message = str;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public CustomMessageTip(int i) {
            this(AccountExternalsKt.getAppContext().getString(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$IgnoredError;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class IgnoredError extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String message;

        public IgnoredError(@NotNull String str) {
            super(null);
            this.message = str;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$NormalMessageError;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "", WebConst.QueryParam.MESSAGE_ID, "(I)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class NormalMessageError extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final String message;

        public NormalMessageError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public NormalMessageError(int i) {
            this(AccountExternalsKt.getAppContext().getString(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$RegionLimit;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Z", "isLogin", "()Z", "<init>", "(Z)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class RegionLimit extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isLogin;

        public RegionLimit() {
            this(false, 1, null);
        }

        public RegionLimit(boolean z) {
            super(null);
            this.isLogin = z;
        }

        /* JADX INFO: renamed from: isLogin, reason: from getter */
        public final boolean getIsLogin() {
            return this.isLogin;
        }

        public /* synthetic */ RegionLimit(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$RegisterErrorUrl;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "href", "<init>", "(Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class RegisterErrorUrl extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String href;

        public RegisterErrorUrl(@NotNull String str) {
            super(null);
            this.href = str;
        }

        @NotNull
        public final String getHref() {
            return this.href;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/state/LoginFailed$ThirdPartNotRegister;", "Lcom/huami/account/ui/login/state/LoginFailed;", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "b", "getAccessToken", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ThirdPartNotRegister extends LoginFailed {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final String accessToken;

        public ThirdPartNotRegister(@NotNull String str, @Nullable String str2) {
            super(null);
            this.provider = str;
            this.accessToken = str2;
        }

        @Nullable
        public final String getAccessToken() {
            return this.accessToken;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }
    }

    private LoginFailed() {
    }

    public /* synthetic */ LoginFailed(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
