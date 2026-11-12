package com.xiaomi.fitness.watch.face.view;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/FunInfo;", "", "funPos", "", "funId", "<init>", "(II)V", "getFunPos", "()I", "getFunId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FunInfo {
    private final int funId;
    private final int funPos;

    public FunInfo(int i, int i2) {
        this.funPos = i;
        this.funId = i2;
    }

    public static /* synthetic */ FunInfo copy$default(FunInfo funInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = funInfo.funPos;
        }
        if ((i3 & 2) != 0) {
            i2 = funInfo.funId;
        }
        return funInfo.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFunPos() {
        return this.funPos;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFunId() {
        return this.funId;
    }

    @NotNull
    public final FunInfo copy(int funPos, int funId) {
        return new FunInfo(funPos, funId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunInfo)) {
            return false;
        }
        FunInfo funInfo = (FunInfo) other;
        return this.funPos == funInfo.funPos && this.funId == funInfo.funId;
    }

    public final int getFunId() {
        return this.funId;
    }

    public final int getFunPos() {
        return this.funPos;
    }

    public int hashCode() {
        return (Integer.hashCode(this.funPos) * 31) + Integer.hashCode(this.funId);
    }

    @NotNull
    public String toString() {
        return "FunInfo(funPos=" + this.funPos + ", funId=" + this.funId + ")";
    }
}
