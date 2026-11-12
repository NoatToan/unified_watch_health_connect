package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortSpreadBuilder extends PrimitiveSpreadBuilder<short[]> {

    @NotNull
    private final short[] values;

    public ShortSpreadBuilder(int i) {
        super(i);
        this.values = new short[i];
    }

    public final void add(short s) {
        short[] sArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        sArr[position] = s;
    }

    @NotNull
    public final short[] toArray() {
        return toArray(this.values, new short[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }
}
