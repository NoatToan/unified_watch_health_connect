package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ShortSpreadBuilder extends PrimitiveSpreadBuilder<short[]> {

    @NotNull
    private final short[] d;

    public ShortSpreadBuilder(int i) {
        super(i);
        this.d = new short[i];
    }

    public final void add(short s) {
        short[] sArr = this.d;
        int position = getPosition();
        setPosition(position + 1);
        sArr[position] = s;
    }

    @NotNull
    public final short[] toArray() {
        return toArray(this.d, new short[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull short[] sArr) {
        return sArr.length;
    }
}
