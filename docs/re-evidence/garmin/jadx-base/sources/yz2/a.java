package yz2;

/* JADX INFO: loaded from: classes3.dex */
public class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence[] f200486b;

    public a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            vb.h.s("Cannot be null");
            throw null;
        }
        if (charSequenceArr.length == 7) {
            this.f200486b = charSequenceArr;
        } else {
            vb.h.s("Array must contain exactly 7 elements");
            throw null;
        }
    }

    @Override // yz2.h
    public final CharSequence format(int i14) {
        return this.f200486b[i14 - 1];
    }
}
