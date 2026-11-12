package com.xiaomi.fitness.account.manager;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 %2\u00020\u0001:\u0001%J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016H&J\u001c\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016H&J\b\u0010\u0019\u001a\u00020\u0003H&J+\u0010\u001a\u001a\u00020\u00032!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u0016H&J\u001c\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0016H&J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H&J\u0014\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u0007H'R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0018\u0010\t\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountManager;", "", "init", "", "sid", "", "isLogin", "", "()Z", "loggingIn", "getLoggingIn", "setLoggingIn", "(Z)V", "isStaging", "setStaging", "isUseSystem", "isUseLocal", "accessAccount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "callback", "Lkotlin/Function1;", "Landroid/os/Bundle;", "removeLoginCallback", TrackConstants.LOGOUT, "addAccountListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/ParameterName;", "name", "removeAccountListener", "getUserId", "getUserData", "key", "getMiAccountCoreInfoSync", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "forceRefresh", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccountManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int TYPE_ERROR_NOT_SUPPORT = 2;
    public static final int TYPE_ERROR_NO_PERMISSION = 1;
    public static final int TYPE_ERROR_PRE_ANDROID_O = 0;
    public static final int TYPE_INTENT_LOCAL_LOGIN_PAGE = 4;
    public static final int TYPE_INTENT_SYSTEM_LOGIN_PAGE = 3;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountManager$Companion;", "", "<init>", "()V", "TYPE_ERROR_PRE_ANDROID_O", "", "TYPE_ERROR_NO_PERMISSION", "TYPE_ERROR_NOT_SUPPORT", "TYPE_INTENT_SYSTEM_LOGIN_PAGE", "TYPE_INTENT_LOCAL_LOGIN_PAGE", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int TYPE_ERROR_NOT_SUPPORT = 2;
        public static final int TYPE_ERROR_NO_PERMISSION = 1;
        public static final int TYPE_ERROR_PRE_ANDROID_O = 0;
        public static final int TYPE_INTENT_LOCAL_LOGIN_PAGE = 4;
        public static final int TYPE_INTENT_SYSTEM_LOGIN_PAGE = 3;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AccountCoreInfo getMiAccountCoreInfoSync$default(AccountManager accountManager, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMiAccountCoreInfoSync");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return accountManager.getMiAccountCoreInfoSync(z);
        }
    }

    @Nullable
    Object accessAccount(@NotNull Continuation<? super Integer> continuation);

    void addAccountListener(@NotNull Function1<? super Boolean, Unit> listener);

    boolean getLoggingIn();

    @Nullable
    AccountCoreInfo getMiAccountCoreInfoSync(boolean forceRefresh);

    @NotNull
    String getUserData(@NotNull String key);

    @Nullable
    String getUserId();

    void init(@NotNull String sid);

    boolean isLogin();

    boolean isStaging();

    boolean isUseLocal();

    boolean isUseSystem();

    void login(@NotNull Function1<? super Bundle, Unit> callback);

    void logout();

    void removeAccountListener(@NotNull Function1<? super Boolean, Unit> listener);

    void removeLoginCallback(@NotNull Function1<? super Bundle, Unit> callback);

    void setLoggingIn(boolean z);

    void setStaging(boolean z);
}
