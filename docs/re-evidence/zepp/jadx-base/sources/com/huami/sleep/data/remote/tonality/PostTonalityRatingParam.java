package com.huami.sleep.data.remote.tonality;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JA\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/huami/sleep/data/remote/tonality/PostTonalityRatingParam;", "", "", "component1", "component2", "component3", "", "Lcom/huami/sleep/data/remote/tonality/PostTonalityRatingDataParam;", "component4", "", "component5", "sId", "uId", "devices", "data", "version", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSId", "()Ljava/lang/String;", "b", "getUId", "c", "getDevices", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getData", "()Ljava/util/List;", "e", "J", "getVersion", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PostTonalityRatingParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sid")
    @NotNull
    private final String sId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("uid")
    @NotNull
    private final String uId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("devices")
    @NotNull
    private final String devices;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("data")
    @NotNull
    private final List<PostTonalityRatingDataParam> data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("version")
    private final long version;

    public PostTonalityRatingParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<PostTonalityRatingDataParam> list, long j) {
        this.sId = str;
        this.uId = str2;
        this.devices = str3;
        this.data = list;
        this.version = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostTonalityRatingParam copy$default(PostTonalityRatingParam postTonalityRatingParam, String str, String str2, String str3, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postTonalityRatingParam.sId;
        }
        if ((i & 2) != 0) {
            str2 = postTonalityRatingParam.uId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = postTonalityRatingParam.devices;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = postTonalityRatingParam.data;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            j = postTonalityRatingParam.version;
        }
        return postTonalityRatingParam.copy(str, str4, str5, list2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSId() {
        return this.sId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUId() {
        return this.uId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevices() {
        return this.devices;
    }

    @NotNull
    public final List<PostTonalityRatingDataParam> component4() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    public final PostTonalityRatingParam copy(@NotNull String sId, @NotNull String uId, @NotNull String devices, @NotNull List<PostTonalityRatingDataParam> data, long version) {
        return new PostTonalityRatingParam(sId, uId, devices, data, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostTonalityRatingParam)) {
            return false;
        }
        PostTonalityRatingParam postTonalityRatingParam = (PostTonalityRatingParam) other;
        return Intrinsics.areEqual(this.sId, postTonalityRatingParam.sId) && Intrinsics.areEqual(this.uId, postTonalityRatingParam.uId) && Intrinsics.areEqual(this.devices, postTonalityRatingParam.devices) && Intrinsics.areEqual(this.data, postTonalityRatingParam.data) && this.version == postTonalityRatingParam.version;
    }

    @NotNull
    public final List<PostTonalityRatingDataParam> getData() {
        return this.data;
    }

    @NotNull
    public final String getDevices() {
        return this.devices;
    }

    @NotNull
    public final String getSId() {
        return this.sId;
    }

    @NotNull
    public final String getUId() {
        return this.uId;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((this.sId.hashCode() * 31) + this.uId.hashCode()) * 31) + this.devices.hashCode()) * 31) + this.data.hashCode()) * 31) + b.a(this.version);
    }

    @NotNull
    public String toString() {
        return "PostTonalityRatingParam(sId=" + this.sId + ", uId=" + this.uId + ", devices=" + this.devices + ", data=" + this.data + ", version=" + this.version + ")";
    }

    public /* synthetic */ PostTonalityRatingParam(String str, String str2, String str3, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? 1647848687L : j);
    }
}
