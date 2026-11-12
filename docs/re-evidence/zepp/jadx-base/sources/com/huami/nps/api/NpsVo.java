package com.huami.nps.api;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003Jo\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b(\u0010'R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/huami/nps/api/NpsVo;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "Lcom/huami/nps/api/AdExtension;", "component9", "id", "title", "sub_title", "image", "describe", "target", "mode", "status", GPXTrackPoint.XML.TAG_EXTENSIONS, "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getSub_title", "getImage", "getDescribe", "getTarget", LogUtil.I, "getMode", "()I", "getStatus", "Lcom/huami/nps/api/AdExtension;", "getExtensions", "()Lcom/huami/nps/api/AdExtension;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/huami/nps/api/AdExtension;)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NpsVo {

    @Nullable
    private final String describe;

    @Nullable
    private final AdExtension extensions;

    @NotNull
    private final String id;

    @Nullable
    private final String image;
    private final int mode;
    private final int status;

    @Nullable
    private final String sub_title;

    @Nullable
    private final String target;

    @Nullable
    private final String title;

    public NpsVo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, @Nullable AdExtension adExtension) {
        this.id = str;
        this.title = str2;
        this.sub_title = str3;
        this.image = str4;
        this.describe = str5;
        this.target = str6;
        this.mode = i;
        this.status = i2;
        this.extensions = adExtension;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSub_title() {
        return this.sub_title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AdExtension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final NpsVo copy(@NotNull String id, @Nullable String title, @Nullable String sub_title, @Nullable String image, @Nullable String describe, @Nullable String target, int mode, int status, @Nullable AdExtension extensions) {
        return new NpsVo(id, title, sub_title, image, describe, target, mode, status, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsVo)) {
            return false;
        }
        NpsVo npsVo = (NpsVo) other;
        return Intrinsics.areEqual(this.id, npsVo.id) && Intrinsics.areEqual(this.title, npsVo.title) && Intrinsics.areEqual(this.sub_title, npsVo.sub_title) && Intrinsics.areEqual(this.image, npsVo.image) && Intrinsics.areEqual(this.describe, npsVo.describe) && Intrinsics.areEqual(this.target, npsVo.target) && this.mode == npsVo.mode && this.status == npsVo.status && Intrinsics.areEqual(this.extensions, npsVo.extensions);
    }

    @Nullable
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    public final AdExtension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSub_title() {
        return this.sub_title;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sub_title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.describe;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.target;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.mode) * 31) + this.status) * 31;
        AdExtension adExtension = this.extensions;
        return iHashCode6 + (adExtension != null ? adExtension.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NpsVo(id=" + this.id + ", title=" + this.title + ", sub_title=" + this.sub_title + ", image=" + this.image + ", describe=" + this.describe + ", target=" + this.target + ", mode=" + this.mode + ", status=" + this.status + ", extensions=" + this.extensions + ")";
    }

    public /* synthetic */ NpsVo(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, AdExtension adExtension, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, adExtension);
    }
}
