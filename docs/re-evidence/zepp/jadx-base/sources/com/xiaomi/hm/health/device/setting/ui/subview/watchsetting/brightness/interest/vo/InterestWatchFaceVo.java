package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestWatchFaceVo;", "", "", "component1", "component2", "component3", "id", "name", "iconUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", "c", "getIconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class InterestWatchFaceVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String iconUrl;

    public InterestWatchFaceVo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.id = str;
        this.name = str2;
        this.iconUrl = str3;
    }

    public static /* synthetic */ InterestWatchFaceVo copy$default(InterestWatchFaceVo interestWatchFaceVo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestWatchFaceVo.id;
        }
        if ((i & 2) != 0) {
            str2 = interestWatchFaceVo.name;
        }
        if ((i & 4) != 0) {
            str3 = interestWatchFaceVo.iconUrl;
        }
        return interestWatchFaceVo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final InterestWatchFaceVo copy(@NotNull String id, @NotNull String name, @NotNull String iconUrl) {
        return new InterestWatchFaceVo(id, name, iconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestWatchFaceVo)) {
            return false;
        }
        InterestWatchFaceVo interestWatchFaceVo = (InterestWatchFaceVo) other;
        return Intrinsics.areEqual(this.id, interestWatchFaceVo.id) && Intrinsics.areEqual(this.name, interestWatchFaceVo.name) && Intrinsics.areEqual(this.iconUrl, interestWatchFaceVo.iconUrl);
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "InterestWatchFaceVo(id=" + this.id + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ")";
    }
}
