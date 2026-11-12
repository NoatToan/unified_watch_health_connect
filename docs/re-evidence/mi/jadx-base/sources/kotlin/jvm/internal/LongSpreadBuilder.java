package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LongSpreadBuilder extends PrimitiveSpreadBuilder<long[]> {

    @NotNull
    private final long[] values;

    public LongSpreadBuilder(int i) {
        super(i);
        this.values = new long[i];
    }

    public final void add(long j) {
        long[] jArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        jArr[position] = j;
    }

    @NotNull
    public final long[] toArray() {
        return toArray(this.values, new long[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }
}
