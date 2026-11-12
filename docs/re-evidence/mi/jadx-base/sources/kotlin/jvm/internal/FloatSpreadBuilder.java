package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {

    @NotNull
    private final float[] values;

    public FloatSpreadBuilder(int i) {
        super(i);
        this.values = new float[i];
    }

    public final void add(float f) {
        float[] fArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        fArr[position] = f;
    }

    @NotNull
    public final float[] toArray() {
        return toArray(this.values, new float[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }
}
