package com.xiaomi.fitness.login.token;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.account.OAuthAccountManager;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.kip;
import defpackage.n7h;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/login/token/TokenManagerRemoteImpl;", "Lkip$a;", "", "sid", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "serviceToken", "", "notifyTokenChange", "(Ljava/lang/String;Lcom/xiaomi/fitness/account/token/MiAccessToken;)V", "", "forceRefresh", "", "loginPolicy", "getServiceToken", "(Ljava/lang/String;ZI)Lcom/xiaomi/fitness/account/token/MiAccessToken;", OAuthAccountManager.MiOAuthConstant.TOKEN, "setServiceToken", "Ln7h;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addTokenChangeListener", "(Ljava/lang/String;Ln7h;)V", "update", "()V", "Lcom/xiaomi/fitness/account/token/TokenManager;", "mTokenManager", "Lcom/xiaomi/fitness/account/token/TokenManager;", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/os/RemoteCallbackList;", "mTokenChangeListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(Lcom/xiaomi/fitness/account/token/TokenManager;)V", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTokenManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenManagerRemoteImpl.kt\ncom/xiaomi/fitness/login/token/TokenManagerRemoteImpl\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,71:1\n90#2,19:72\n*S KotlinDebug\n*F\n+ 1 TokenManagerRemoteImpl.kt\ncom/xiaomi/fitness/login/token/TokenManagerRemoteImpl\n*L\n50#1:72,19\n*E\n"})
public final class TokenManagerRemoteImpl extends kip.a {
    public static final int KEY_TOKEN_MANAGER_BINDER = 9;

    @NotNull
    private final ConcurrentHashMap<String, RemoteCallbackList<n7h>> mTokenChangeListeners;

    @NotNull
    private final TokenManager mTokenManager;

    public TokenManagerRemoteImpl(@NotNull TokenManager mTokenManager) {
        Intrinsics.checkNotNullParameter(mTokenManager, "mTokenManager");
        this.mTokenManager = mTokenManager;
        this.mTokenChangeListeners = new ConcurrentHashMap<>();
    }

    private final void notifyTokenChange(String sid, MiAccessToken serviceToken) {
        RemoteCallbackList<n7h> remoteCallbackList = this.mTokenChangeListeners.get(sid);
        try {
            try {
                if (remoteCallbackList != null) {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((n7h) broadcastItem).onChange(sid, serviceToken);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    @Override // defpackage.kip
    public void addTokenChangeListener(@NotNull String sid, @NotNull n7h listener) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RemoteCallbackList<n7h> remoteCallbackList = this.mTokenChangeListeners.get(sid);
        if (remoteCallbackList == null) {
            remoteCallbackList = new RemoteCallbackList<>();
            this.mTokenChangeListeners.put(sid, remoteCallbackList);
        }
        remoteCallbackList.register(listener);
    }

    @Override // defpackage.kip
    @Nullable
    public MiAccessToken getServiceToken(@NotNull String sid, boolean forceRefresh, int loginPolicy) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        MiAccessToken serviceToken = this.mTokenManager.getServiceToken(sid, forceRefresh, loginPolicy);
        if (serviceToken != null && serviceToken.getUpdated()) {
            notifyTokenChange(sid, serviceToken);
        }
        return serviceToken;
    }

    @Override // defpackage.kip
    public void setServiceToken(@NotNull String sid, @NotNull MiAccessToken accessToken) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.mTokenManager.setServiceToken(sid, accessToken);
    }

    @Override // defpackage.kip
    public void update() {
        this.mTokenManager.update();
    }
}
