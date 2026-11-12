package com.huami.account.ui.login.state;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B!\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/login/state/RegistrationState;", "Lcom/huami/account/ui/login/state/PassportOperationState;", "", "b", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "c", "getCountryCode", "countryCode", GoogleApiAvailabilityLight.a, "getCountryState", Configs.Params.COUNTRY_STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "RegistrationBase", "RegistrationV2", "Lcom/huami/account/ui/login/state/RegistrationState$RegistrationBase;", "Lcom/huami/account/ui/login/state/RegistrationState$RegistrationV2;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class RegistrationState extends PassportOperationState {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String countryState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/account/ui/login/state/RegistrationState$RegistrationBase;", "Lcom/huami/account/ui/login/state/RegistrationState;", "", "provider", "countryCode", Configs.Params.COUNTRY_STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class RegistrationBase extends RegistrationState {
        public RegistrationBase(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(str, str2, str3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/state/RegistrationState$RegistrationV2;", "Lcom/huami/account/ui/login/state/RegistrationState;", "", "e", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "accessToken", "provider", "countryCode", Configs.Params.COUNTRY_STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class RegistrationV2 extends RegistrationState {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final String accessToken;

        public RegistrationV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            super(str, str2, str3, null);
            this.accessToken = str4;
        }

        @NotNull
        public final String getAccessToken() {
            return this.accessToken;
        }
    }

    private RegistrationState(String str, String str2, String str3) {
        super(str, null);
        this.provider = str;
        this.countryCode = str2;
        this.countryState = str3;
    }

    public /* synthetic */ RegistrationState(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCountryState() {
        return this.countryState;
    }

    @Override // com.huami.account.ui.login.state.PassportOperationState
    @NotNull
    public String getProvider() {
        return this.provider;
    }
}
