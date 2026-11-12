package p006l2;

import b2.e;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public static final void a(int i14, int i15) {
        if (!(i14 > 0 && i15 > 0)) {
            e.a("both minLines " + i14 + " and maxLines " + i15 + " must be greater than zero");
        }
        if (i14 <= i15) {
            return;
        }
        e.a("minLines " + i14 + " must be less than or equal to maxLines " + i15);
    }
}
