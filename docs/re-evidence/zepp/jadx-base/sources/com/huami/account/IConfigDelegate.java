package com.huami.account;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/account/IConfigDelegate;", "", "", "debug", "supportSetServerHost", "supportOverseaAccountBind", "supportRegister", "supportXiaomiConvertToken", "isShowXiaomiAccountWhenFail", "allowSkipBindPhone", "", "userPropertyPrefix", "isAutoMutexLogin", "supportNoAreaBindPhone", "userPrivacyPagePath", "enableEdmFeature", "countryCode", "isShowUxAgreement", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface IConfigDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean allowSkipBindPhone(@NotNull IConfigDelegate iConfigDelegate) {
            return true;
        }

        public static boolean enableEdmFeature(@NotNull IConfigDelegate iConfigDelegate) {
            return true;
        }

        public static boolean isAutoMutexLogin(@NotNull IConfigDelegate iConfigDelegate) {
            return true;
        }

        public static boolean isShowUxAgreement(@NotNull IConfigDelegate iConfigDelegate, @Nullable String str) {
            return true;
        }

        public static boolean isShowXiaomiAccountWhenFail(@NotNull IConfigDelegate iConfigDelegate) {
            return true;
        }

        public static boolean supportNoAreaBindPhone(@NotNull IConfigDelegate iConfigDelegate) {
            return false;
        }

        public static boolean supportRegister(@NotNull IConfigDelegate iConfigDelegate) {
            return true;
        }

        public static boolean supportXiaomiConvertToken(@NotNull IConfigDelegate iConfigDelegate) {
            return false;
        }

        @NotNull
        public static String userPrivacyPagePath(@NotNull IConfigDelegate iConfigDelegate) {
            return "t/posts/mifit?category=100&meta_key=tag&meta_value=privacy";
        }

        @NotNull
        public static String userPropertyPrefix(@NotNull IConfigDelegate iConfigDelegate) {
            return "huami.mifit.user";
        }
    }

    boolean allowSkipBindPhone();

    boolean debug();

    boolean enableEdmFeature();

    boolean isAutoMutexLogin();

    boolean isShowUxAgreement(@Nullable String countryCode);

    boolean isShowXiaomiAccountWhenFail();

    boolean supportNoAreaBindPhone();

    boolean supportOverseaAccountBind();

    boolean supportRegister();

    boolean supportSetServerHost();

    boolean supportXiaomiConvertToken();

    @NotNull
    String userPrivacyPagePath();

    @NotNull
    String userPropertyPrefix();
}
