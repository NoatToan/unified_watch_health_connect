package com.twitter.sdk.android.tweetcomposer;

import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class f implements e {
    private final DefaultScribeClient a;

    public f(DefaultScribeClient defaultScribeClient) {
        this.a = defaultScribeClient;
    }

    @Override // com.twitter.sdk.android.tweetcomposer.e
    public void a(EventNamespace eventNamespace, List<ScribeItem> list) {
        DefaultScribeClient defaultScribeClient = this.a;
        if (defaultScribeClient != null) {
            defaultScribeClient.scribe(eventNamespace, list);
        }
    }
}
