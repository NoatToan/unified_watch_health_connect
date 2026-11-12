package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder<double[]> {

    @NotNull
    private final double[] values;

    public DoubleSpreadBuilder(int i) {
        super(i);
        this.values = new double[i];
    }

    public final void add(double d) {
        double[] dArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        dArr[position] = d;
    }

    @NotNull
    public final double[] toArray() {
        return toArray(this.values, new double[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }
}
