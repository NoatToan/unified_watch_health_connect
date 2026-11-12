package org.ahocorasick.trie;

import defpackage.zul;

/* JADX INFO: loaded from: classes46.dex */
public abstract class Token {
    private String fragment;

    public abstract zul getEmit();

    public abstract boolean isMatch();

    public Token(String str) {
        this.fragment = str;
    }

    public String getFragment() {
        return this.fragment;
    }
}
