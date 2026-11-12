package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public class SymbolEntity extends a {

    @SerializedName("text")
    public final String text;

    public SymbolEntity(String str, int i, int i2) {
        super(i, i2);
        this.text = str;
    }

    @Override // com.twitter.sdk.android.core.models.a
    public /* bridge */ /* synthetic */ int getEnd() {
        return super.getEnd();
    }

    @Override // com.twitter.sdk.android.core.models.a
    public /* bridge */ /* synthetic */ int getStart() {
        return super.getStart();
    }
}
