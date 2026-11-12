package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanSpreadBuilder extends PrimitiveSpreadBuilder<boolean[]> {

    @NotNull
    private final boolean[] values;

    public BooleanSpreadBuilder(int i) {
        super(i);
        this.values = new boolean[i];
    }

    public final void add(boolean z) {
        boolean[] zArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        zArr[position] = z;
    }

    @NotNull
    public final boolean[] toArray() {
        return toArray(this.values, new boolean[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }
}
