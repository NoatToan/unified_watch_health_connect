package com.xmlywind.sdk.base.models;

import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public enum ViewState {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String toJavascriptString() {
        return toString().toLowerCase(Locale.US);
    }
}
