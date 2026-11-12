package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public class MentionEntity extends a {

    @SerializedName("id")
    public final long id;

    @SerializedName("id_str")
    public final String idStr;

    @SerializedName("name")
    public final String name;

    @SerializedName("screen_name")
    public final String screenName;

    public MentionEntity(long j, String str, String str2, String str3, int i, int i2) {
        super(i, i2);
        this.id = j;
        this.idStr = str;
        this.name = str2;
        this.screenName = str3;
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
