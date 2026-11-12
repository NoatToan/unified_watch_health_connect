package com.xmlywind.sdk.base.models;

import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public enum PlacementType {
    INLINE,
    INTERSTITIAL;

    public String toJavascriptString() {
        return toString().toLowerCase(Locale.US);
    }
}
