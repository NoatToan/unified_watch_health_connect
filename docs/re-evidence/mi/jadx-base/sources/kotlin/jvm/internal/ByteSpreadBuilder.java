package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteSpreadBuilder extends PrimitiveSpreadBuilder<byte[]> {

    @NotNull
    private final byte[] values;

    public ByteSpreadBuilder(int i) {
        super(i);
        this.values = new byte[i];
    }

    public final void add(byte b2) {
        byte[] bArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        bArr[position] = b2;
    }

    @NotNull
    public final byte[] toArray() {
        return toArray(this.values, new byte[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }
}
