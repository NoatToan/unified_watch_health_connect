package com.huami.wallet.lib.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/lib/entity/CarouseInfo;", "", "", "component1", "component2", "image", "url", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "b", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CarouseInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String url;

    public CarouseInfo(@NotNull String str, @NotNull String str2) {
        this.image = str;
        this.url = str2;
    }

    public static /* synthetic */ CarouseInfo copy$default(CarouseInfo carouseInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carouseInfo.image;
        }
        if ((i & 2) != 0) {
            str2 = carouseInfo.url;
        }
        return carouseInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final CarouseInfo copy(@NotNull String image, @NotNull String url) {
        return new CarouseInfo(image, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouseInfo)) {
            return false;
        }
        CarouseInfo carouseInfo = (CarouseInfo) other;
        return Intrinsics.areEqual(this.image, carouseInfo.image) && Intrinsics.areEqual(this.url, carouseInfo.url);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.image.hashCode() * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "CarouseInfo(image=" + this.image + ", url=" + this.url + ')';
    }
}
