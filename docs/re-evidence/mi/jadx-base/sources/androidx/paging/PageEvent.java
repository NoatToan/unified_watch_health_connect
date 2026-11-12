package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J;\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJK\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJE\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0001\u0003\u0012\u0013\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/paging/PageEvent;", "T", "", "()V", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "map", "Drop", "Insert", "LoadStateUpdate", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class PageEvent<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Landroidx/paging/PageEvent$Drop;", "T", "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "minPageOffset", "", "maxPageOffset", "placeholdersRemaining", "(Landroidx/paging/LoadType;III)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMaxPageOffset", "()I", "getMinPageOffset", "pageCount", "getPageCount", "getPlaceholdersRemaining", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class Drop<T> extends PageEvent<T> {

        @NotNull
        private final LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drop(@NotNull LoadType loadType, int i, int i2, int i3) {
            super(null);
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            this.loadType = loadType;
            this.minPageOffset = i;
            this.maxPageOffset = i2;
            this.placeholdersRemaining = i3;
            if (!(loadType != LoadType.REFRESH)) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (!(getPageCount() > 0)) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + getPageCount()).toString());
            }
            if (i3 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i3).toString());
        }

        public static /* synthetic */ Drop copy$default(Drop drop, LoadType loadType, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                loadType = drop.loadType;
            }
            if ((i4 & 2) != 0) {
                i = drop.minPageOffset;
            }
            if ((i4 & 4) != 0) {
                i2 = drop.maxPageOffset;
            }
            if ((i4 & 8) != 0) {
                i3 = drop.placeholdersRemaining;
            }
            return drop.copy(loadType, i, i2, i3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        @NotNull
        public final Drop<T> copy(@NotNull LoadType loadType, int minPageOffset, int maxPageOffset, int placeholdersRemaining) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            return new Drop<>(loadType, minPageOffset, maxPageOffset, placeholdersRemaining);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) other;
            return Intrinsics.areEqual(this.loadType, drop.loadType) && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public final int getPageCount() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public int hashCode() {
            LoadType loadType = this.loadType;
            return ((((((loadType != null ? loadType.hashCode() : 0) * 31) + Integer.hashCode(this.minPageOffset)) * 31) + Integer.hashCode(this.maxPageOffset)) * 31) + Integer.hashCode(this.placeholdersRemaining);
        }

        @NotNull
        public String toString() {
            return "Drop(loadType=" + this.loadType + ", minPageOffset=" + this.minPageOffset + ", maxPageOffset=" + this.maxPageOffset + ", placeholdersRemaining=" + this.placeholdersRemaining + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 2*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00012B;\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\rHÆ\u0003JM\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003J;\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%JK\u0010&\u001a\b\u0012\u0004\u0012\u0002H'0\u0003\"\b\b\u0002\u0010'*\u00020\u00022(\u0010(\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0)0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J\t\u0010*\u001a\u00020\nHÖ\u0001JE\u0010+\u001a\b\u0012\u0004\u0012\u0002H'0\u0003\"\b\b\u0002\u0010'*\u00020\u00022\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J9\u0010,\u001a\b\u0012\u0004\u0012\u0002H'0\u0000\"\b\b\u0002\u0010'*\u00020\u00022\u001e\u0010(\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0\b0-H\u0082\bJ\t\u0010.\u001a\u00020/HÖ\u0001JM\u00100\u001a\b\u0012\u0004\u0012\u0002H'0\u0000\"\b\b\u0002\u0010'*\u00020\u00022*\u0010(\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0\b0\u00070-H\u0080\bø\u0001\u0001¢\u0006\u0002\b1R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "T", "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersBefore", "", "placeholdersAfter", "combinedLoadStates", "Landroidx/paging/CombinedLoadStates;", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/CombinedLoadStates;)V", "getCombinedLoadStates", "()Landroidx/paging/CombinedLoadStates;", "getLoadType", "()Landroidx/paging/LoadType;", "getPages", "()Ljava/util/List;", "getPlaceholdersAfter", "()I", "getPlaceholdersBefore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "hashCode", "map", "mapPages", "Lkotlin/Function1;", "toString", "", "transformPages", "transformPages$paging_common", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class Insert<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Insert<Object> EMPTY_REFRESH_LOCAL;

        @NotNull
        private final CombinedLoadStates combinedLoadStates;

        @NotNull
        private final LoadType loadType;

        @NotNull
        private final List<TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ:\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJB\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "()V", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;", "Append", "T", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "combinedLoadStates", "Landroidx/paging/CombinedLoadStates;", "Prepend", "placeholdersBefore", "Refresh", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <T> Insert<T> Append(@NotNull List<TransformablePage<T>> pages, int placeholdersAfter, @NotNull CombinedLoadStates combinedLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(combinedLoadStates, "combinedLoadStates");
                return new Insert<>(LoadType.APPEND, pages, -1, placeholdersAfter, combinedLoadStates, null);
            }

            @NotNull
            public final <T> Insert<T> Prepend(@NotNull List<TransformablePage<T>> pages, int placeholdersBefore, @NotNull CombinedLoadStates combinedLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(combinedLoadStates, "combinedLoadStates");
                return new Insert<>(LoadType.PREPEND, pages, placeholdersBefore, -1, combinedLoadStates, null);
            }

            @NotNull
            public final <T> Insert<T> Refresh(@NotNull List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, @NotNull CombinedLoadStates combinedLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(combinedLoadStates, "combinedLoadStates");
                return new Insert<>(LoadType.REFRESH, pages, placeholdersBefore, placeholdersAfter, combinedLoadStates, null);
            }

            @NotNull
            public final Insert<Object> getEMPTY_REFRESH_LOCAL() {
                return Insert.EMPTY_REFRESH_LOCAL;
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            List<TransformablePage<T>> listListOf = CollectionsKt__CollectionsJVMKt.listOf(TransformablePage.INSTANCE.getEMPTY_INITIAL_PAGE());
            LoadState.NotLoading.Companion companion2 = LoadState.NotLoading.INSTANCE;
            EMPTY_REFRESH_LOCAL = companion.Refresh(listListOf, 0, 0, new CombinedLoadStates(companion2.getIncomplete$paging_common(), companion2.getComplete$paging_common(), companion2.getComplete$paging_common(), new LoadStates(companion2.getIncomplete$paging_common(), companion2.getComplete$paging_common(), companion2.getComplete$paging_common()), null, 16, null));
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i, int i2, CombinedLoadStates combinedLoadStates, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, combinedLoadStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Insert copy$default(Insert insert, LoadType loadType, List list, int i, int i2, CombinedLoadStates combinedLoadStates, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                loadType = insert.loadType;
            }
            if ((i3 & 2) != 0) {
                list = insert.pages;
            }
            List list2 = list;
            if ((i3 & 4) != 0) {
                i = insert.placeholdersBefore;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = insert.placeholdersAfter;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                combinedLoadStates = insert.combinedLoadStates;
            }
            return insert.copy(loadType, list2, i4, i5, combinedLoadStates);
        }

        private final <R> Insert<R> mapPages(Function1<? super TransformablePage<T>, TransformablePage<R>> transform) {
            LoadType loadType = getLoadType();
            List<TransformablePage<T>> pages = getPages();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(transform.invoke2(it.next()));
            }
            return new Insert<>(loadType, arrayList, getPlaceholdersBefore(), getPlaceholdersAfter(), getCombinedLoadStates(), null);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        @NotNull
        public final List<TransformablePage<T>> component2() {
            return this.pages;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final CombinedLoadStates getCombinedLoadStates() {
            return this.combinedLoadStates;
        }

        @NotNull
        public final Insert<T> copy(@NotNull LoadType loadType, @NotNull List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, @NotNull CombinedLoadStates combinedLoadStates) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(combinedLoadStates, "combinedLoadStates");
            return new Insert<>(loadType, pages, placeholdersBefore, placeholdersAfter, combinedLoadStates);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) other;
            return Intrinsics.areEqual(this.loadType, insert.loadType) && Intrinsics.areEqual(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && Intrinsics.areEqual(this.combinedLoadStates, insert.combinedLoadStates);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:25:0x0101 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0102  */
        /* JADX WARN: Code duplicated, block: B:36:0x013e  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0097 -> B:18:0x00bb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0102 -> B:27:0x0110). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public java.lang.Object filter(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<T>> r20) {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.filter(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009c  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:22:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:25:0x010b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x010c  */
        /* JADX WARN: Code duplicated, block: B:36:0x014d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009c -> B:18:0x00c0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x010c -> B:27:0x0118). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object flatMap(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r20) {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.flatMap(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final CombinedLoadStates getCombinedLoadStates() {
            return this.combinedLoadStates;
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.loadType;
        }

        @NotNull
        public final List<TransformablePage<T>> getPages() {
            return this.pages;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public int hashCode() {
            LoadType loadType = this.loadType;
            int iHashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            List<TransformablePage<T>> list = this.pages;
            int iHashCode2 = (((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter)) * 31;
            CombinedLoadStates combinedLoadStates = this.combinedLoadStates;
            return iHashCode2 + (combinedLoadStates != null ? combinedLoadStates.hashCode() : 0);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0091  */
        /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:22:0x00e7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0091 -> B:18:0x00b4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e8 -> B:24:0x00f0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object map(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r19) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.map(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public String toString() {
            return "Insert(loadType=" + this.loadType + ", pages=" + this.pages + ", placeholdersBefore=" + this.placeholdersBefore + ", placeholdersAfter=" + this.placeholdersAfter + ", combinedLoadStates=" + this.combinedLoadStates + ")";
        }

        @NotNull
        public final <R> Insert<R> transformPages$paging_common(@NotNull Function1<? super List<TransformablePage<T>>, ? extends List<TransformablePage<R>>> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return new Insert<>(getLoadType(), transform.invoke2(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getCombinedLoadStates(), null);
        }

        private Insert(LoadType loadType, List<TransformablePage<T>> list, int i, int i2, CombinedLoadStates combinedLoadStates) {
            super(null);
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
            this.combinedLoadStates = combinedLoadStates;
            if (!(loadType == LoadType.APPEND || i >= 0)) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i).toString());
            }
            if (loadType == LoadType.PREPEND || i2 >= 0) {
                if (!(loadType != LoadType.REFRESH || (list.isEmpty() ^ true))) {
                    throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                }
            } else {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i2).toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "T", "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "fromMediator", "", "loadState", "Landroidx/paging/LoadState;", "(Landroidx/paging/LoadType;ZLandroidx/paging/LoadState;)V", "getFromMediator", "()Z", "getLoadState", "()Landroidx/paging/LoadState;", "getLoadType", "()Landroidx/paging/LoadType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean fromMediator;

        @NotNull
        private final LoadState loadState;

        @NotNull
        private final LoadType loadType;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate$Companion;", "", "()V", "canDispatchWithoutInsert", "", "loadState", "Landroidx/paging/LoadState;", "fromMediator", "canDispatchWithoutInsert$paging_common", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean canDispatchWithoutInsert$paging_common(@NotNull LoadState loadState, boolean fromMediator) {
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                return (loadState instanceof LoadState.Loading) || (loadState instanceof LoadState.Error) || fromMediator;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(@NotNull LoadType loadType, boolean z, @NotNull LoadState loadState) {
            super(null);
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(loadState, "loadState");
            this.loadType = loadType;
            this.fromMediator = z;
            this.loadState = loadState;
            if (!((loadType == LoadType.REFRESH && !z && (loadState instanceof LoadState.NotLoading) && loadState.getEndOfPaginationReached()) ? false : true)) {
                throw new IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
            }
            if (!INSTANCE.canDispatchWithoutInsert$paging_common(loadState, z)) {
                throw new IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
            }
        }

        public static /* synthetic */ LoadStateUpdate copy$default(LoadStateUpdate loadStateUpdate, LoadType loadType, boolean z, LoadState loadState, int i, Object obj) {
            if ((i & 1) != 0) {
                loadType = loadStateUpdate.loadType;
            }
            if ((i & 2) != 0) {
                z = loadStateUpdate.fromMediator;
            }
            if ((i & 4) != 0) {
                loadState = loadStateUpdate.loadState;
            }
            return loadStateUpdate.copy(loadType, z, loadState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getFromMediator() {
            return this.fromMediator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final LoadState getLoadState() {
            return this.loadState;
        }

        @NotNull
        public final LoadStateUpdate<T> copy(@NotNull LoadType loadType, boolean fromMediator, @NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(loadState, "loadState");
            return new LoadStateUpdate<>(loadType, fromMediator, loadState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) other;
            return Intrinsics.areEqual(this.loadType, loadStateUpdate.loadType) && this.fromMediator == loadStateUpdate.fromMediator && Intrinsics.areEqual(this.loadState, loadStateUpdate.loadState);
        }

        public final boolean getFromMediator() {
            return this.fromMediator;
        }

        @NotNull
        public final LoadState getLoadState() {
            return this.loadState;
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            LoadType loadType = this.loadType;
            int iHashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            boolean z = this.fromMediator;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iHashCode + r2) * 31;
            LoadState loadState = this.loadState;
            return i + (loadState != null ? loadState.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LoadStateUpdate(loadType=" + this.loadType + ", fromMediator=" + this.fromMediator + ", loadState=" + this.loadState + ")";
        }
    }

    private PageEvent() {
    }

    public /* synthetic */ PageEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object filter$suspendImpl(PageEvent pageEvent, Function2 function2, Continuation continuation) {
        return pageEvent;
    }

    public static /* synthetic */ Object flatMap$suspendImpl(PageEvent pageEvent, Function2 function2, Continuation continuation) {
        if (pageEvent != null) {
            return pageEvent;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PageEvent<R>");
    }

    public static /* synthetic */ Object map$suspendImpl(PageEvent pageEvent, Function2 function2, Continuation continuation) {
        if (pageEvent != null) {
            return pageEvent;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PageEvent<R>");
    }

    @Nullable
    public Object filter(@NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super PageEvent<T>> continuation) {
        return filter$suspendImpl(this, function2, continuation);
    }

    @Nullable
    public <R> Object flatMap(@NotNull Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, @NotNull Continuation<? super PageEvent<R>> continuation) {
        return flatMap$suspendImpl(this, function2, continuation);
    }

    @Nullable
    public <R> Object map(@NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super PageEvent<R>> continuation) {
        return map$suspendImpl(this, function2, continuation);
    }
}
