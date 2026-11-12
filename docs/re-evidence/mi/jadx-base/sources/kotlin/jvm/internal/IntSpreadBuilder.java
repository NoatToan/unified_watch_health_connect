package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IntSpreadBuilder extends PrimitiveSpreadBuilder<int[]> {

    @NotNull
    private final int[] values;

    public IntSpreadBuilder(int i) {
        super(i);
        this.values = new int[i];
    }

    public final void add(int i) {
        int[] iArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        iArr[position] = i;
    }

    @NotNull
    public final int[] toArray() {
        return toArray(this.values, new int[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }
}
