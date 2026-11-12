package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jcd implements hj1<int[]> {
    @Override // defpackage.hj1
    public int b() {
        return 4;
    }

    @Override // defpackage.hj1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.hj1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // defpackage.hj1
    public String getTag() {
        return "IntegerArrayPool";
    }
}
