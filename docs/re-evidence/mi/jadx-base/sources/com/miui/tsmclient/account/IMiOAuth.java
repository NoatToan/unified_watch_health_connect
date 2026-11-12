package com.miui.tsmclient.account;

import android.os.Bundle;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public interface IMiOAuth {
    Future<Bundle> getAccessToken(String str);

    void invalidateAccessToken(String str, String str2);
}
