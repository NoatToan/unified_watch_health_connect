package com.xiaomi.fitness.watch.face.request;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceUserActionResult;", "", "actionList", "", "Lcom/xiaomi/fitness/watch/face/request/FaceUserAction;", "hasMore", "", "<init>", "(Ljava/util/List;Z)V", "getActionList", "()Ljava/util/List;", "getHasMore", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceUserActionResult {

    @SerializedName("user_action_list")
    @Nullable
    private final List<FaceUserAction> actionList;

    @SerializedName("has_more")
    private final boolean hasMore;

    public FaceUserActionResult(@Nullable List<FaceUserAction> list, boolean z) {
        this.actionList = list;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceUserActionResult copy$default(FaceUserActionResult faceUserActionResult, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = faceUserActionResult.actionList;
        }
        if ((i & 2) != 0) {
            z = faceUserActionResult.hasMore;
        }
        return faceUserActionResult.copy(list, z);
    }

    @Nullable
    public final List<FaceUserAction> component1() {
        return this.actionList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final FaceUserActionResult copy(@Nullable List<FaceUserAction> actionList, boolean hasMore) {
        return new FaceUserActionResult(actionList, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceUserActionResult)) {
            return false;
        }
        FaceUserActionResult faceUserActionResult = (FaceUserActionResult) other;
        return Intrinsics.areEqual(this.actionList, faceUserActionResult.actionList) && this.hasMore == faceUserActionResult.hasMore;
    }

    @Nullable
    public final List<FaceUserAction> getActionList() {
        return this.actionList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public int hashCode() {
        List<FaceUserAction> list = this.actionList;
        return ((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.hasMore);
    }

    @NotNull
    public String toString() {
        return "FaceUserActionResult(actionList=" + this.actionList + ", hasMore=" + this.hasMore + ")";
    }
}
