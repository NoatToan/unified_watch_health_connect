package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0015\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/paging/GenerationalViewportHint;", "", "generationId", "", "hint", "Landroidx/paging/ViewportHint;", "(ILandroidx/paging/ViewportHint;)V", "getGenerationId", "()I", "getHint", "()Landroidx/paging/ViewportHint;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "presentedItemsBeyondAnchor", "loadType", "Landroidx/paging/LoadType;", "presentedItemsBeyondAnchor$paging_common", "toString", "", "paging-common"}, k = 1, mv = {1, 4, 2})
@VisibleForTesting
public final /* data */ class GenerationalViewportHint {
    private final int generationId;

    @NotNull
    private final ViewportHint hint;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
        }
    }

    public GenerationalViewportHint(int i, @NotNull ViewportHint hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.generationId = i;
        this.hint = hint;
    }

    public static /* synthetic */ GenerationalViewportHint copy$default(GenerationalViewportHint generationalViewportHint, int i, ViewportHint viewportHint, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = generationalViewportHint.generationId;
        }
        if ((i2 & 2) != 0) {
            viewportHint = generationalViewportHint.hint;
        }
        return generationalViewportHint.copy(i, viewportHint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGenerationId() {
        return this.generationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ViewportHint getHint() {
        return this.hint;
    }

    @NotNull
    public final GenerationalViewportHint copy(int generationId, @NotNull ViewportHint hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        return new GenerationalViewportHint(generationId, hint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) other;
        return this.generationId == generationalViewportHint.generationId && Intrinsics.areEqual(this.hint, generationalViewportHint.hint);
    }

    public final int getGenerationId() {
        return this.generationId;
    }

    @NotNull
    public final ViewportHint getHint() {
        return this.hint;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.generationId) * 31;
        ViewportHint viewportHint = this.hint;
        return iHashCode + (viewportHint != null ? viewportHint.hashCode() : 0);
    }

    public final int presentedItemsBeyondAnchor$paging_common(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i == 2) {
            return this.hint.getPresentedItemsBefore();
        }
        if (i == 3) {
            return this.hint.getPresentedItemsAfter();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.generationId + ", hint=" + this.hint + ")";
    }
}
