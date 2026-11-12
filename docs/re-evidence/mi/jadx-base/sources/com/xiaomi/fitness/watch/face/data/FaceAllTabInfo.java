package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceAllTabInfo;", "", "tabId", "", "tabName", "", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getTabId", "()I", "getTabName", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceAllTabInfo {

    @Nullable
    private final List<FaceData> list;

    @SerializedName(FaceTabListFragment.TAB_ID)
    private final int tabId;

    @SerializedName(FaceTabListFragment.TAB_NAME)
    @NotNull
    private final String tabName;

    public FaceAllTabInfo(int i, @NotNull String tabName, @Nullable List<FaceData> list) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        this.tabId = i;
        this.tabName = tabName;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceAllTabInfo copy$default(FaceAllTabInfo faceAllTabInfo, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = faceAllTabInfo.tabId;
        }
        if ((i2 & 2) != 0) {
            str = faceAllTabInfo.tabName;
        }
        if ((i2 & 4) != 0) {
            list = faceAllTabInfo.list;
        }
        return faceAllTabInfo.copy(i, str, list);
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

    @Nullable
    public final List<FaceData> component3() {
        return this.list;
    }

    @NotNull
    public final FaceAllTabInfo copy(int tabId, @NotNull String tabName, @Nullable List<FaceData> list) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        return new FaceAllTabInfo(tabId, tabName, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceAllTabInfo)) {
            return false;
        }
        FaceAllTabInfo faceAllTabInfo = (FaceAllTabInfo) other;
        return this.tabId == faceAllTabInfo.tabId && Intrinsics.areEqual(this.tabName, faceAllTabInfo.tabName) && Intrinsics.areEqual(this.list, faceAllTabInfo.list);
    }

    @Nullable
    public final List<FaceData> getList() {
        return this.list;
    }

    public final int getTabId() {
        return this.tabId;
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.tabId) * 31) + this.tabName.hashCode()) * 31;
        List<FaceData> list = this.list;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "FaceAllTabInfo(tabId=" + this.tabId + ", tabName=" + this.tabName + ", list=" + this.list + ")";
    }
}
