package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Configuration {

    @SerializedName("dm_text_character_limit")
    public final int dmTextCharacterLimit;

    @SerializedName("non_username_paths")
    public final List<String> nonUsernamePaths;

    @SerializedName("photo_size_limit")
    public final long photoSizeLimit;

    @SerializedName("photo_sizes")
    public final MediaEntity.Sizes photoSizes;

    @SerializedName("short_url_length_https")
    public final int shortUrlLengthHttps;

    public Configuration(int i, List<String> list, long j, MediaEntity.Sizes sizes, int i2) {
        this.dmTextCharacterLimit = i;
        this.nonUsernamePaths = ModelUtils.getSafeList(list);
        this.photoSizeLimit = j;
        this.photoSizes = sizes;
        this.shortUrlLengthHttps = i2;
    }
}
