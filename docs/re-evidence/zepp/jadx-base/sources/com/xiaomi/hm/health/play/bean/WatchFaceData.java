package com.xiaomi.hm.health.play.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b!\u0010 R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0012\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010\u000bR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "()Ljava/lang/Integer;", "Lcom/xiaomi/hm/health/play/bean/Metas;", "component7", "id", "name", "downLoadUrl", "image", "customizable", "size", "metas", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lcom/xiaomi/hm/health/play/bean/Metas;)Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "toString", "hashCode", "other", "equals", LogUtil.I, "getId", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getDownLoadUrl", "getImage", "Z", "getCustomizable", "()Z", "Ljava/lang/Integer;", "getSize", "Lcom/xiaomi/hm/health/play/bean/Metas;", "getMetas", "()Lcom/xiaomi/hm/health/play/bean/Metas;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lcom/xiaomi/hm/health/play/bean/Metas;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchFaceData {
    private final boolean customizable;

    @SerializedName("download_url")
    @NotNull
    private final String downLoadUrl;
    private final int id;

    @Nullable
    private final String image;

    @Nullable
    private final Metas metas;

    @NotNull
    private final String name;

    @Nullable
    private final Integer size;

    public WatchFaceData(int i, @NotNull String str, @NotNull String str2, @Nullable String str3, boolean z, @Nullable Integer num, @Nullable Metas metas) {
        this.id = i;
        this.name = str;
        this.downLoadUrl = str2;
        this.image = str3;
        this.customizable = z;
        this.size = num;
        this.metas = metas;
    }

    public static /* synthetic */ WatchFaceData copy$default(WatchFaceData watchFaceData, int i, String str, String str2, String str3, boolean z, Integer num, Metas metas, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = watchFaceData.id;
        }
        if ((i2 & 2) != 0) {
            str = watchFaceData.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = watchFaceData.downLoadUrl;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = watchFaceData.image;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            z = watchFaceData.customizable;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            num = watchFaceData.size;
        }
        Integer num2 = num;
        if ((i2 & 64) != 0) {
            metas = watchFaceData.metas;
        }
        return watchFaceData.copy(i, str4, str5, str6, z2, num2, metas);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDownLoadUrl() {
        return this.downLoadUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Metas getMetas() {
        return this.metas;
    }

    @NotNull
    public final WatchFaceData copy(int id, @NotNull String name, @NotNull String downLoadUrl, @Nullable String image, boolean customizable, @Nullable Integer size, @Nullable Metas metas) {
        return new WatchFaceData(id, name, downLoadUrl, image, customizable, size, metas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceData)) {
            return false;
        }
        WatchFaceData watchFaceData = (WatchFaceData) other;
        return this.id == watchFaceData.id && Intrinsics.areEqual(this.name, watchFaceData.name) && Intrinsics.areEqual(this.downLoadUrl, watchFaceData.downLoadUrl) && Intrinsics.areEqual(this.image, watchFaceData.image) && this.customizable == watchFaceData.customizable && Intrinsics.areEqual(this.size, watchFaceData.size) && Intrinsics.areEqual(this.metas, watchFaceData.metas);
    }

    public final boolean getCustomizable() {
        return this.customizable;
    }

    @NotNull
    public final String getDownLoadUrl() {
        return this.downLoadUrl;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final Metas getMetas() {
        return this.metas;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.id * 31) + this.name.hashCode()) * 31) + this.downLoadUrl.hashCode()) * 31;
        String str = this.image;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.customizable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        Integer num = this.size;
        int iHashCode3 = (i + (num == null ? 0 : num.hashCode())) * 31;
        Metas metas = this.metas;
        return iHashCode3 + (metas != null ? metas.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WatchFaceData(id=" + this.id + ", name=" + this.name + ", downLoadUrl=" + this.downLoadUrl + ", image=" + this.image + ", customizable=" + this.customizable + ", size=" + this.size + ", metas=" + this.metas + ")";
    }
}
