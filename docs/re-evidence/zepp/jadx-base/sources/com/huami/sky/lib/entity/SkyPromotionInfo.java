package com.huami.sky.lib.entity;

import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003JG\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "Lcom/huami/sky/lib/entity/SkyPromotionExtensions;", "component6", "id", "title", "image", "target", "mode", GPXTrackPoint.XML.TAG_EXTENSIONS, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getImage", "getTarget", "getMode", "Lcom/huami/sky/lib/entity/SkyPromotionExtensions;", "getExtensions", "()Lcom/huami/sky/lib/entity/SkyPromotionExtensions;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/sky/lib/entity/SkyPromotionExtensions;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkyPromotionInfo {

    @Nullable
    private final SkyPromotionExtensions extensions;

    @NotNull
    private final String id;

    @NotNull
    private final String image;

    @NotNull
    private final String mode;

    @NotNull
    private final String target;

    @NotNull
    private final String title;

    public SkyPromotionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable SkyPromotionExtensions skyPromotionExtensions) {
        this.id = str;
        this.title = str2;
        this.image = str3;
        this.target = str4;
        this.mode = str5;
        this.extensions = skyPromotionExtensions;
    }

    public static /* synthetic */ SkyPromotionInfo copy$default(SkyPromotionInfo skyPromotionInfo, String str, String str2, String str3, String str4, String str5, SkyPromotionExtensions skyPromotionExtensions, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skyPromotionInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = skyPromotionInfo.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = skyPromotionInfo.image;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = skyPromotionInfo.target;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = skyPromotionInfo.mode;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            skyPromotionExtensions = skyPromotionInfo.extensions;
        }
        return skyPromotionInfo.copy(str, str6, str7, str8, str9, skyPromotionExtensions);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SkyPromotionExtensions getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final SkyPromotionInfo copy(@NotNull String id, @NotNull String title, @NotNull String image, @NotNull String target, @NotNull String mode, @Nullable SkyPromotionExtensions extensions) {
        return new SkyPromotionInfo(id, title, image, target, mode, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkyPromotionInfo)) {
            return false;
        }
        SkyPromotionInfo skyPromotionInfo = (SkyPromotionInfo) other;
        return Intrinsics.areEqual(this.id, skyPromotionInfo.id) && Intrinsics.areEqual(this.title, skyPromotionInfo.title) && Intrinsics.areEqual(this.image, skyPromotionInfo.image) && Intrinsics.areEqual(this.target, skyPromotionInfo.target) && Intrinsics.areEqual(this.mode, skyPromotionInfo.mode) && Intrinsics.areEqual(this.extensions, skyPromotionInfo.extensions);
    }

    @Nullable
    public final SkyPromotionExtensions getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.image.hashCode()) * 31) + this.target.hashCode()) * 31) + this.mode.hashCode()) * 31;
        SkyPromotionExtensions skyPromotionExtensions = this.extensions;
        return iHashCode + (skyPromotionExtensions == null ? 0 : skyPromotionExtensions.hashCode());
    }

    @NotNull
    public String toString() {
        return "SkyPromotionInfo(id=" + this.id + ", title=" + this.title + ", image=" + this.image + ", target=" + this.target + ", mode=" + this.mode + ", extensions=" + this.extensions + ")";
    }
}
