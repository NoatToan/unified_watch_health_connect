package xi;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements a<int[]> {
    @Override // xi.a
    public final int a(int[] iArr) {
        return iArr.length;
    }

    @Override // xi.a
    public final int b() {
        return 4;
    }

    @Override // xi.a
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // xi.a
    public final int[] newArray(int i14) {
        return new int[i14];
    }
}
