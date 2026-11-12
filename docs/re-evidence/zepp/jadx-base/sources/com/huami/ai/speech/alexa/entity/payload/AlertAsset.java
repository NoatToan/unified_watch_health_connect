package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/AlertAsset;", "", "", "component1", "component2", "assetId", "url", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAssetId", "()Ljava/lang/String;", "b", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlertAsset {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("assetId")
    @NotNull
    private final String assetId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("url")
    @NotNull
    private final String url;

    public AlertAsset(@NotNull String str, @NotNull String str2) {
        this.assetId = str;
        this.url = str2;
    }

    public static /* synthetic */ AlertAsset copy$default(AlertAsset alertAsset, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertAsset.assetId;
        }
        if ((i & 2) != 0) {
            str2 = alertAsset.url;
        }
        return alertAsset.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final AlertAsset copy(@NotNull String assetId, @NotNull String url) {
        return new AlertAsset(assetId, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertAsset)) {
            return false;
        }
        AlertAsset alertAsset = (AlertAsset) other;
        return Intrinsics.areEqual(this.assetId, alertAsset.assetId) && Intrinsics.areEqual(this.url, alertAsset.url);
    }

    @NotNull
    public final String getAssetId() {
        return this.assetId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.assetId.hashCode() * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertAsset(assetId=" + this.assetId + ", url=" + this.url + ')';
    }
}
