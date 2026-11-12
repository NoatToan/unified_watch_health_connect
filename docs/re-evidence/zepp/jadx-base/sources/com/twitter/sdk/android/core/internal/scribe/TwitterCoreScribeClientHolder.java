package com.twitter.sdk.android.core.internal.scribe;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.IdManager;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterCoreScribeClientHolder {

    @SuppressLint({"StaticFieldLeak"})
    private static DefaultScribeClient a;

    public static DefaultScribeClient getScribeClient() {
        return a;
    }

    public static void initialize(Context context, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager, String str, String str2) {
        a = new DefaultScribeClient(context, sessionManager, guestSessionProvider, idManager, DefaultScribeClient.getScribeConfig(str, str2));
    }
}
