package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;", "", "key", "", "name", "watchface_list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getName", "getWatchface_list", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceMarketIndexItem {

    @SerializedName("key")
    @NotNull
    private final String key;

    @Nullable
    private final String name;

    @SerializedName("watchface_list")
    @NotNull
    private final List<FaceData> watchface_list;

    public DeviceFaceMarketIndexItem(@NotNull String key, @Nullable String str, @NotNull List<FaceData> watchface_list) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(watchface_list, "watchface_list");
        this.key = key;
        this.name = str;
        this.watchface_list = watchface_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceFaceMarketIndexItem copy$default(DeviceFaceMarketIndexItem deviceFaceMarketIndexItem, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceFaceMarketIndexItem.key;
        }
        if ((i & 2) != 0) {
            str2 = deviceFaceMarketIndexItem.name;
        }
        if ((i & 4) != 0) {
            list = deviceFaceMarketIndexItem.watchface_list;
        }
        return deviceFaceMarketIndexItem.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<FaceData> component3() {
        return this.watchface_list;
    }

    @NotNull
    public final DeviceFaceMarketIndexItem copy(@NotNull String key, @Nullable String name, @NotNull List<FaceData> watchface_list) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(watchface_list, "watchface_list");
        return new DeviceFaceMarketIndexItem(key, name, watchface_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceMarketIndexItem)) {
            return false;
        }
        DeviceFaceMarketIndexItem deviceFaceMarketIndexItem = (DeviceFaceMarketIndexItem) other;
        return Intrinsics.areEqual(this.key, deviceFaceMarketIndexItem.key) && Intrinsics.areEqual(this.name, deviceFaceMarketIndexItem.name) && Intrinsics.areEqual(this.watchface_list, deviceFaceMarketIndexItem.watchface_list);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<FaceData> getWatchface_list() {
        return this.watchface_list;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.name;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.watchface_list.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceFaceMarketIndexItem(key=" + this.key + ", name=" + this.name + ", watchface_list=" + this.watchface_list + ")";
    }
}
