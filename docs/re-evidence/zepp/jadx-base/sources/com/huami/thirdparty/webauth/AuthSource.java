package com.huami.thirdparty.webauth;

import com.huami.account.AccountStatEvent;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&J:\u0010\u000b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0002H&J2\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H&J:\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&JS\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022*\u0010\u0018\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00170\u0010\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/huami/thirdparty/webauth/AuthSource;", "", "", "name", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "uid", "countryCode", "", HMUnbindBaseLogic.TAG, "state", "authStateChange", "refreshToken", "region", "Lcom/huami/thirdparty/webauth/TokenInfo;", "getToken", "getTokenAutoRefresh", "", "thirdNames", "", "getTokenList", "([Ljava/lang/String;)Ljava/util/List;", "tokenInfo", "checkNeedRefresh", "Lkotlin/Pair;", "pairs", "", "refreshEachToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V", "webauth_release"}, k = 1, mv = {1, 4, 1})
public interface AuthSource {
    boolean authStateChange(@NotNull String name, @NotNull String state);

    @Nullable
    TokenInfo checkNeedRefresh(@NotNull TokenInfo tokenInfo, @NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode, @NotNull String region);

    @Nullable
    TokenInfo getToken(@NotNull String thirdName);

    @Nullable
    TokenInfo getTokenAutoRefresh(@NotNull String name, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String region);

    @NotNull
    List<TokenInfo> getTokenList();

    @NotNull
    List<TokenInfo> getTokenList(@NotNull String... thirdNames);

    void refreshEachToken(@NotNull String uid, @NotNull String countryCode, @NotNull String region, @NotNull Pair<String, String>... pairs);

    @Nullable
    TokenInfo refreshToken(@NotNull String name, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String refreshToken, @NotNull String region);

    boolean unbind(@NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode);
}
