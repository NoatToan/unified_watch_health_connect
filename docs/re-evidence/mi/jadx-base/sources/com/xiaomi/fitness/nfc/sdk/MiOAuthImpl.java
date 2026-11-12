package com.xiaomi.fitness.nfc.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.account.IMiOAuth;
import com.miui.tsmclient.account.OAuthAccountManager;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import defpackage.vqg;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes9.dex */
public class MiOAuthImpl implements IMiOAuth {
    private static ExecutorService sExecutor = Executors.newCachedThreadPool();
    private volatile boolean isInValidate = false;
    TokenManager tokenManager;

    public MiOAuthImpl(TokenManager tokenManager) {
        this.tokenManager = tokenManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$getAccessToken$0(String str) throws Exception {
        Bundle bundle = new Bundle();
        vqg.d("MiOAuthImpl getAccessToken isInValidate:" + this.isInValidate);
        MiAccessToken serviceToken = this.tokenManager.getServiceToken(str, this.isInValidate, 2);
        String str2 = serviceToken.getServiceToken() + "," + serviceToken.getSecurity();
        String userId = serviceToken.getUserId();
        vqg.d("MiOAuthImpl  tokenIsNull:" + TextUtils.isEmpty(str2) + "    uidIsNull:" + TextUtils.isEmpty(userId));
        bundle.putString(OAuthAccountManager.MiOAuthConstant.TOKEN, str2);
        bundle.putString("userId", userId);
        return bundle;
    }

    @Override // com.miui.tsmclient.account.IMiOAuth
    public Future<Bundle> getAccessToken(final String str) {
        return sExecutor.submit(new Callable() { // from class: ivf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22132a.lambda$getAccessToken$0(str);
            }
        });
    }

    @Override // com.miui.tsmclient.account.IMiOAuth
    public void invalidateAccessToken(String str, String str2) {
        vqg.d("accessToken invalidateAccessToken");
        this.isInValidate = true;
    }
}
