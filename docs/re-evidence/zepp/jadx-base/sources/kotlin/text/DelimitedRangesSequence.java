package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class DelimitedRangesSequence implements Sequence<IntRange> {

    @NotNull
    private final CharSequence a;
    private final int b;
    private final int c;

    @NotNull
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> d;

    /* JADX INFO: renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<IntRange>, KMappedMarker {
        private int a = -1;
        private int b;
        private int c;

        @Nullable
        private IntRange d;
        private int e;

        public AnonymousClass1() {
            int iCoerceIn = kotlin.ranges.e.coerceIn(DelimitedRangesSequence.this.b, 0, DelimitedRangesSequence.this.a.length());
            this.b = iCoerceIn;
            this.c = iCoerceIn;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void a() {
            Pair pair;
            if (this.c < 0) {
                this.a = 0;
                this.d = null;
                return;
            }
            if (DelimitedRangesSequence.this.c > 0) {
                int i = this.e + 1;
                this.e = i;
                if (i >= DelimitedRangesSequence.this.c) {
                    this.d = new IntRange(this.b, StringsKt__StringsKt.getLastIndex(DelimitedRangesSequence.this.a));
                    this.c = -1;
                } else if (this.c > DelimitedRangesSequence.this.a.length() && (pair = (Pair) DelimitedRangesSequence.this.d.invoke(DelimitedRangesSequence.this.a, Integer.valueOf(this.c))) != null) {
                    int iIntValue = ((Number) pair.component1()).intValue();
                    int iIntValue2 = ((Number) pair.component2()).intValue();
                    this.d = kotlin.ranges.e.until(this.b, iIntValue);
                    int i2 = iIntValue + iIntValue2;
                    this.b = i2;
                    this.c = i2 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.d = new IntRange(this.b, StringsKt__StringsKt.getLastIndex(DelimitedRangesSequence.this.a));
                    this.c = -1;
                }
            } else if (this.c > DelimitedRangesSequence.this.a.length()) {
                this.d = new IntRange(this.b, StringsKt__StringsKt.getLastIndex(DelimitedRangesSequence.this.a));
                this.c = -1;
            } else {
                int iIntValue3 = ((Number) pair.component1()).intValue();
                int iIntValue4 = ((Number) pair.component2()).intValue();
                this.d = kotlin.ranges.e.until(this.b, iIntValue3);
                int i3 = iIntValue3 + iIntValue4;
                this.b = i3;
                this.c = i3 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.a = 1;
        }

        public final int getCounter() {
            return this.e;
        }

        public final int getCurrentStartIndex() {
            return this.b;
        }

        @Nullable
        public final IntRange getNextItem() {
            return this.d;
        }

        public final int getNextSearchIndex() {
            return this.c;
        }

        public final int getNextState() {
            return this.a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCounter(int i) {
            this.e = i;
        }

        public final void setCurrentStartIndex(int i) {
            this.b = i;
        }

        public final void setNextItem(@Nullable IntRange intRange) {
            this.d = intRange;
        }

        public final void setNextSearchIndex(int i) {
            this.c = i;
        }

        public final void setNextState(int i) {
            this.a = i;
        }

        @Override // java.util.Iterator
        @NotNull
        public IntRange next() {
            if (this.a == -1) {
                a();
            }
            if (this.a == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.d;
            Objects.requireNonNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.d = null;
            this.a = -1;
            return intRange;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(@NotNull CharSequence charSequence, int i, int i2, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = function2;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IntRange> iterator() {
        return new AnonymousClass1();
    }
}
