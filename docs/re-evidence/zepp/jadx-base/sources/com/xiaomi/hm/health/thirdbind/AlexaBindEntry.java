package com.xiaomi.hm.health.thirdbind;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.third.alexa.AlexaBind;
import com.huami.third.alexa.AuthCallback;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.util.AlexaUtils;
import com.huami.watch.companion.util.Broadcaster;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/AlexaBindEntry;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", DTransferConstants.PID, "deviceId", "Lcom/huami/third/alexa/AuthCallback;", "authCallback", "", "open", "<init>", "()V", "AuthCallbackAdapter", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlexaBindEntry {

    @NotNull
    public static final AlexaBindEntry INSTANCE = new AlexaBindEntry();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/AlexaBindEntry$AuthCallbackAdapter;", "Lcom/huami/third/alexa/AuthCallback;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "onLoginFailed", "", "accessToken", "onLoginSuccess", "onLogoutFailed", "onLogoutSuccess", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static abstract class AuthCallbackAdapter implements AuthCallback {
        @Override // com.huami.third.alexa.AuthCallback
        public void onLoginFailed(@NotNull FragmentActivity activity) {
        }

        @Override // com.huami.third.alexa.AuthCallback
        public void onLoginSuccess(@NotNull FragmentActivity activity, @Nullable String accessToken) {
        }

        @Override // com.huami.third.alexa.AuthCallback
        public void onLogoutFailed(@NotNull FragmentActivity activity) {
        }

        @Override // com.huami.third.alexa.AuthCallback
        public void onLogoutSuccess(@NotNull FragmentActivity activity) {
        }
    }

    private AlexaBindEntry() {
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull String pid, @Nullable String deviceId, @Nullable final AuthCallback authCallback) {
        AlexaBind.open(context, pid, deviceId, new AuthCallback() { // from class: com.xiaomi.hm.health.thirdbind.AlexaBindEntry.open.1
            @Override // com.huami.third.alexa.AuthCallback
            public void onLoginFailed(@NotNull FragmentActivity activity) {
                AuthCallback authCallback2 = authCallback;
                if (authCallback2 == null) {
                    return;
                }
                authCallback2.onLoginFailed(activity);
            }

            @Override // com.huami.third.alexa.AuthCallback
            public void onLoginSuccess(@NotNull FragmentActivity activity, @Nullable String accessToken) {
                AlexaUtils.setAlexaAuthorized(!TextUtils.isEmpty(accessToken));
                AuthCallback authCallback2 = authCallback;
                if (authCallback2 == null) {
                    return;
                }
                authCallback2.onLoginSuccess(activity, accessToken);
            }

            @Override // com.huami.third.alexa.AuthCallback
            public void onLogoutFailed(@NotNull FragmentActivity activity) {
                AuthCallback authCallback2 = authCallback;
                if (authCallback2 == null) {
                    return;
                }
                authCallback2.onLoginFailed(activity);
            }

            @Override // com.huami.third.alexa.AuthCallback
            public void onLogoutSuccess(@NotNull FragmentActivity activity) {
                Broadcaster.sendLocalBroadcast(activity, ConstantsKt.LOGOUT_ACTION);
                AlexaUtils.setAlexaAuthorized(false);
                AuthCallback authCallback2 = authCallback;
                if (authCallback2 == null) {
                    return;
                }
                authCallback2.onLogoutSuccess(activity);
            }
        });
    }

    public static /* synthetic */ void open$default(Context context, String str, String str2, AuthCallback authCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            authCallback = null;
        }
        open(context, str, str2, authCallback);
    }
}
