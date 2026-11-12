package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder<double[]> {

    @NotNull
    private final double[] d;

    public DoubleSpreadBuilder(int i) {
        super(i);
        this.d = new double[i];
    }

    public final void add(double d) {
        double[] dArr = this.d;
        int position = getPosition();
        setPosition(position + 1);
        dArr[position] = d;
    }

    @NotNull
    public final double[] toArray() {
        return toArray(this.d, new double[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull double[] dArr) {
        return dArr.length;
    }
}
