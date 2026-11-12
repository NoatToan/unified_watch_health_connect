package com.xiaomi.account.auth;

import android.app.Activity;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public interface XiaomiOAuth {
    XiaomiOAuthResults startOAuth(WeakReference<Activity> weakReference, OAuthConfig oAuthConfig) throws Exception;
}
