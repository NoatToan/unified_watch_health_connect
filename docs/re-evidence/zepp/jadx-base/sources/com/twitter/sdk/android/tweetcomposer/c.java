package com.twitter.sdk.android.tweetcomposer;

import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
class c implements b {
    private final e a;

    public c(e eVar) {
        Objects.requireNonNull(eVar, "scribeClient must not be null");
        this.a = eVar;
    }

    @Override // com.twitter.sdk.android.tweetcomposer.b
    public void a() {
        this.a.a(g.j.setComponent("").setElement("").setAction("impression").builder(), Collections.EMPTY_LIST);
    }

    @Override // com.twitter.sdk.android.tweetcomposer.b
    public void b(String str) {
        this.a.a(g.j.setComponent("").setElement(str).setAction("click").builder(), Collections.EMPTY_LIST);
    }
}
