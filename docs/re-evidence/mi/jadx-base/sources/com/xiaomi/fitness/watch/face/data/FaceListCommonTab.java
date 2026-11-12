package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;", "", "tabId", "", "tabName", "", "position", "downloadCount", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "(ILjava/lang/String;IILjava/util/List;)V", "getTabId", "()I", "getTabName", "()Ljava/lang/String;", "getPosition", "getDownloadCount", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceListCommonTab {

    @SerializedName("download_count")
    private final int downloadCount;

    @NotNull
    private final List<FaceData> list;
    private final int position;

    @SerializedName(FaceTabListFragment.TAB_ID)
    private final int tabId;

    @SerializedName(FaceTabListFragment.TAB_NAME)
    @NotNull
    private final String tabName;

    public FaceListCommonTab(int i, @NotNull String tabName, int i2, int i3, @NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(list, "list");
        this.tabId = i;
        this.tabName = tabName;
        this.position = i2;
        this.downloadCount = i3;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceListCommonTab copy$default(FaceListCommonTab faceListCommonTab, int i, String str, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = faceListCommonTab.tabId;
        }
        if ((i4 & 2) != 0) {
            str = faceListCommonTab.tabName;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            i2 = faceListCommonTab.position;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = faceListCommonTab.downloadCount;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            list = faceListCommonTab.list;
        }
        return faceListCommonTab.copy(i, str2, i5, i6, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTabId() {
        return this.tabId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDownloadCount() {
        return this.downloadCount;
    }

    @NotNull
    public final List<FaceData> component5() {
        return this.list;
    }

    @NotNull
    public final FaceListCommonTab copy(int tabId, @NotNull String tabName, int position, int downloadCount, @NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(list, "list");
        return new FaceListCommonTab(tabId, tabName, position, downloadCount, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceListCommonTab)) {
            return false;
        }
        FaceListCommonTab faceListCommonTab = (FaceListCommonTab) other;
        return this.tabId == faceListCommonTab.tabId && Intrinsics.areEqual(this.tabName, faceListCommonTab.tabName) && this.position == faceListCommonTab.position && this.downloadCount == faceListCommonTab.downloadCount && Intrinsics.areEqual(this.list, faceListCommonTab.list);
    }

    public final int getDownloadCount() {
        return this.downloadCount;
    }

    @NotNull
    public final List<FaceData> getList() {
        return this.list;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getTabId() {
        return this.tabId;
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.tabId) * 31) + this.tabName.hashCode()) * 31) + Integer.hashCode(this.position)) * 31) + Integer.hashCode(this.downloadCount)) * 31) + this.list.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceListCommonTab(tabId=" + this.tabId + ", tabName=" + this.tabName + ", position=" + this.position + ", downloadCount=" + this.downloadCount + ", list=" + this.list + ")";
    }

    public /* synthetic */ FaceListCommonTab(int i, String str, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? 2 : i2, i3, list);
    }
}
