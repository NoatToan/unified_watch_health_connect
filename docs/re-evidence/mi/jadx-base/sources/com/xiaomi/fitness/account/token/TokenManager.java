package com.xiaomi.fitness.account.token;

import com.miui.tsmclient.account.OAuthAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH'J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/account/token/TokenManager;", "", "getServiceToken", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "sid", "", "forceRefresh", "", "loginPolicy", "", "setServiceToken", "", OAuthAccountManager.MiOAuthConstant.TOKEN, "update", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TokenManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/account/token/TokenManager$Companion;", "", "<init>", "()V", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ MiAccessToken getServiceToken$default(TokenManager tokenManager, String str, boolean z, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServiceToken");
            }
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                i = 2;
            }
            return tokenManager.getServiceToken(str, z, i);
        }
    }

    @Nullable
    MiAccessToken getServiceToken(@NotNull String sid, boolean forceRefresh, int loginPolicy);

    void setServiceToken(@NotNull String sid, @NotNull MiAccessToken accessToken);

    void update();
}
