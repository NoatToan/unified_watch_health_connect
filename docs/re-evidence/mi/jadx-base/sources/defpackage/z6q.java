package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class z6q extends a7q {
    public final Context s;
    public int t;

    public z6q(Context context, int i) {
        super(context, i);
        this.t = -1;
        this.s = context;
    }

    public void K(String str) {
        s(h5q.c(str));
    }

    public void L(int i) {
        t(i, true);
    }

    public void M(String str) {
        L(h5q.c(str));
    }

    public void N(int i) {
        t(i, false);
    }

    public void O(String str) {
        N(h5q.c(str));
    }
}
