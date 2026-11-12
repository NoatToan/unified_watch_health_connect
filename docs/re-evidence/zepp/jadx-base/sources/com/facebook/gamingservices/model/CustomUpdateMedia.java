package com.facebook.gamingservices.model;

import com.huami.ad.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/facebook/gamingservices/model/CustomUpdateMedia;", "", "Lorg/json/JSONObject;", "toJSONObject", "Lcom/facebook/gamingservices/model/CustomUpdateMediaInfo;", "component1", "component2", Constants.GIF_PATH, "video", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/facebook/gamingservices/model/CustomUpdateMediaInfo;", "getGif", "()Lcom/facebook/gamingservices/model/CustomUpdateMediaInfo;", "b", "getVideo", "<init>", "(Lcom/facebook/gamingservices/model/CustomUpdateMediaInfo;Lcom/facebook/gamingservices/model/CustomUpdateMediaInfo;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CustomUpdateMedia {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final CustomUpdateMediaInfo gif;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final CustomUpdateMediaInfo video;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomUpdateMedia() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public CustomUpdateMedia(@Nullable CustomUpdateMediaInfo customUpdateMediaInfo, @Nullable CustomUpdateMediaInfo customUpdateMediaInfo2) {
        this.gif = customUpdateMediaInfo;
        this.video = customUpdateMediaInfo2;
    }

    public static /* synthetic */ CustomUpdateMedia copy$default(CustomUpdateMedia customUpdateMedia, CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            customUpdateMediaInfo = customUpdateMedia.gif;
        }
        if ((i & 2) != 0) {
            customUpdateMediaInfo2 = customUpdateMedia.video;
        }
        return customUpdateMedia.copy(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomUpdateMediaInfo getGif() {
        return this.gif;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CustomUpdateMediaInfo getVideo() {
        return this.video;
    }

    @NotNull
    public final CustomUpdateMedia copy(@Nullable CustomUpdateMediaInfo gif, @Nullable CustomUpdateMediaInfo video) {
        return new CustomUpdateMedia(gif, video);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomUpdateMedia)) {
            return false;
        }
        CustomUpdateMedia customUpdateMedia = (CustomUpdateMedia) other;
        return Intrinsics.areEqual(this.gif, customUpdateMedia.gif) && Intrinsics.areEqual(this.video, customUpdateMedia.video);
    }

    @Nullable
    public final CustomUpdateMediaInfo getGif() {
        return this.gif;
    }

    @Nullable
    public final CustomUpdateMediaInfo getVideo() {
        return this.video;
    }

    public int hashCode() {
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        int iHashCode = (customUpdateMediaInfo != null ? customUpdateMediaInfo.hashCode() : 0) * 31;
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        return iHashCode + (customUpdateMediaInfo2 != null ? customUpdateMediaInfo2.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        if (customUpdateMediaInfo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", customUpdateMediaInfo.getUrl());
            jSONObject.put(Constants.GIF_PATH, jSONObject2);
        }
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        if (customUpdateMediaInfo2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", customUpdateMediaInfo2.getUrl());
            jSONObject.put("video", jSONObject3);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateMedia(gif=" + this.gif + ", video=" + this.video + ")";
    }

    public /* synthetic */ CustomUpdateMedia(CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customUpdateMediaInfo, (i & 2) != 0 ? null : customUpdateMediaInfo2);
    }
}
