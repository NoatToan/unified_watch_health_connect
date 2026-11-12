package androidx.paging;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 &*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001&B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007B3\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003JE\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J.\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Landroidx/paging/TransformablePage;", "T", "", "originalPageOffset", "", "data", "", "(ILjava/util/List;)V", "originalPageOffsets", "", "hintOriginalPageOffset", "hintOriginalIndices", "([ILjava/util/List;ILjava/util/List;)V", "getData", "()Ljava/util/List;", "getHintOriginalIndices", "getHintOriginalPageOffset", "()I", "getOriginalPageOffsets", "()[I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "viewportHintFor", "Landroidx/paging/ViewportHint$Access;", "index", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
public final /* data */ class TransformablePage<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TransformablePage<Object> EMPTY_INITIAL_PAGE = new TransformablePage<>(0, CollectionsKt__CollectionsKt.emptyList());

    @NotNull
    private final List<T> data;

    @Nullable
    private final List<Integer> hintOriginalIndices;
    private final int hintOriginalPageOffset;

    @NotNull
    private final int[] originalPageOffsets;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0001\u0010\b*\u00020\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/paging/TransformablePage$Companion;", "", "()V", "EMPTY_INITIAL_PAGE", "Landroidx/paging/TransformablePage;", "getEMPTY_INITIAL_PAGE", "()Landroidx/paging/TransformablePage;", "empty", "T", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> TransformablePage<T> empty() {
            TransformablePage<T> transformablePage = (TransformablePage<T>) getEMPTY_INITIAL_PAGE();
            if (transformablePage != null) {
                return transformablePage;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<T>");
        }

        @NotNull
        public final TransformablePage<Object> getEMPTY_INITIAL_PAGE() {
            return TransformablePage.EMPTY_INITIAL_PAGE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformablePage(@NotNull int[] originalPageOffsets, @NotNull List<? extends T> data, int i, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        this.originalPageOffsets = originalPageOffsets;
        this.data = data;
        this.hintOriginalPageOffset = i;
        this.hintOriginalIndices = list;
        if (!(!(originalPageOffsets.length == 0))) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("If originalIndices (size = ");
        Intrinsics.checkNotNull(list);
        sb.append(list.size());
        sb.append(") is provided,");
        sb.append(" it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransformablePage copy$default(TransformablePage transformablePage, int[] iArr, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iArr = transformablePage.originalPageOffsets;
        }
        if ((i2 & 2) != 0) {
            list = transformablePage.data;
        }
        if ((i2 & 4) != 0) {
            i = transformablePage.hintOriginalPageOffset;
        }
        if ((i2 & 8) != 0) {
            list2 = transformablePage.hintOriginalIndices;
        }
        return transformablePage.copy(iArr, list, i, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int[] getOriginalPageOffsets() {
        return this.originalPageOffsets;
    }

    @NotNull
    public final List<T> component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHintOriginalPageOffset() {
        return this.hintOriginalPageOffset;
    }

    @Nullable
    public final List<Integer> component4() {
        return this.hintOriginalIndices;
    }

    @NotNull
    public final TransformablePage<T> copy(@NotNull int[] originalPageOffsets, @NotNull List<? extends T> data, int hintOriginalPageOffset, @Nullable List<Integer> hintOriginalIndices) {
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        return new TransformablePage<>(originalPageOffsets, data, hintOriginalPageOffset, hintOriginalIndices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TransformablePage.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        TransformablePage transformablePage = (TransformablePage) other;
        return Arrays.equals(this.originalPageOffsets, transformablePage.originalPageOffsets) && !(Intrinsics.areEqual(this.data, transformablePage.data) ^ true) && this.hintOriginalPageOffset == transformablePage.hintOriginalPageOffset && !(Intrinsics.areEqual(this.hintOriginalIndices, transformablePage.hintOriginalIndices) ^ true);
    }

    @NotNull
    public final List<T> getData() {
        return this.data;
    }

    @Nullable
    public final List<Integer> getHintOriginalIndices() {
        return this.hintOriginalIndices;
    }

    public final int getHintOriginalPageOffset() {
        return this.hintOriginalPageOffset;
    }

    @NotNull
    public final int[] getOriginalPageOffsets() {
        return this.originalPageOffsets;
    }

    public int hashCode() {
        int iHashCode = ((((Arrays.hashCode(this.originalPageOffsets) * 31) + this.data.hashCode()) * 31) + this.hintOriginalPageOffset) * 31;
        List<Integer> list = this.hintOriginalIndices;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.originalPageOffsets) + ", data=" + this.data + ", hintOriginalPageOffset=" + this.hintOriginalPageOffset + ", hintOriginalIndices=" + this.hintOriginalIndices + ")";
    }

    @NotNull
    public final ViewportHint.Access viewportHintFor(int index, int presentedItemsBefore, int presentedItemsAfter, int originalPageOffsetFirst, int originalPageOffsetLast) {
        IntRange indices;
        int i = this.hintOriginalPageOffset;
        List<Integer> list = this.hintOriginalIndices;
        if (list != null && (indices = CollectionsKt__CollectionsKt.getIndices(list)) != null && indices.contains(index)) {
            index = this.hintOriginalIndices.get(index).intValue();
        }
        return new ViewportHint.Access(i, index, presentedItemsBefore, presentedItemsAfter, originalPageOffsetFirst, originalPageOffsetLast);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i, @NotNull List<? extends T> data) {
        this(new int[]{i}, data, i, null);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
