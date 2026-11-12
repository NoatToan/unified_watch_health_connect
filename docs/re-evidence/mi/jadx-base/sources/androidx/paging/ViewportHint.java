package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Landroidx/paging/ViewportHint;", "", "presentedItemsBefore", "", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIII)V", "getOriginalPageOffsetFirst", "()I", "getOriginalPageOffsetLast", "getPresentedItemsAfter", "getPresentedItemsBefore", "equals", "", "other", "hashCode", "Access", "Initial", "Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint$Access;", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class ViewportHint {
    private final int originalPageOffsetFirst;
    private final int originalPageOffsetLast;
    private final int presentedItemsAfter;
    private final int presentedItemsBefore;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "pageOffset", "", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIIIII)V", "getIndexInPage", "()I", "getPageOffset", "equals", "", "other", "", "hashCode", "toString", "", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Access extends ViewportHint {
        private final int indexInPage;
        private final int pageOffset;

        public Access(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, null);
            this.pageOffset = i;
            this.indexInPage = i2;
        }

        @Override // androidx.paging.ViewportHint
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Access)) {
                return false;
            }
            Access access = (Access) other;
            return this.pageOffset == access.pageOffset && this.indexInPage == access.indexInPage && getPresentedItemsBefore() == access.getPresentedItemsBefore() && getPresentedItemsAfter() == access.getPresentedItemsAfter() && getOriginalPageOffsetFirst() == access.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == access.getOriginalPageOffsetLast();
        }

        public final int getIndexInPage() {
            return this.indexInPage;
        }

        public final int getPageOffset() {
            return this.pageOffset;
        }

        @Override // androidx.paging.ViewportHint
        public int hashCode() {
            return super.hashCode() + Integer.hashCode(this.pageOffset) + Integer.hashCode(this.indexInPage);
        }

        @NotNull
        public String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "presentedItemsBefore", "", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIII)V", "toString", "", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Initial extends ViewportHint {
        public Initial(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, null);
        }

        @NotNull
        public String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Initial(\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    private ViewportHint(int i, int i2, int i3, int i4) {
        this.presentedItemsBefore = i;
        this.presentedItemsAfter = i2;
        this.originalPageOffsetFirst = i3;
        this.originalPageOffsetLast = i4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewportHint)) {
            return false;
        }
        ViewportHint viewportHint = (ViewportHint) other;
        return this.presentedItemsBefore == viewportHint.presentedItemsBefore && this.presentedItemsAfter == viewportHint.presentedItemsAfter && this.originalPageOffsetFirst == viewportHint.originalPageOffsetFirst && this.originalPageOffsetLast == viewportHint.originalPageOffsetLast;
    }

    public final int getOriginalPageOffsetFirst() {
        return this.originalPageOffsetFirst;
    }

    public final int getOriginalPageOffsetLast() {
        return this.originalPageOffsetLast;
    }

    public final int getPresentedItemsAfter() {
        return this.presentedItemsAfter;
    }

    public final int getPresentedItemsBefore() {
        return this.presentedItemsBefore;
    }

    public int hashCode() {
        return Integer.hashCode(this.presentedItemsBefore) + Integer.hashCode(this.presentedItemsAfter) + Integer.hashCode(this.originalPageOffsetFirst) + Integer.hashCode(this.originalPageOffsetLast);
    }

    public /* synthetic */ ViewportHint(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4);
    }
}
