package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class l6q extends m6q {
    public final a m;
    public final Context n;
    public int o;

    public class a {
        public a() {
        }
    }

    public l6q(Context context) {
        super(context);
        this.o = -1;
        this.n = context;
        this.m = new a();
    }

    public void F(String str) {
        r(h5q.c(str));
    }

    public void G(int i) {
        s(i, true);
    }

    public void H(String str) {
        G(h5q.c(str));
    }

    public void I(int i) {
        s(i, false);
    }

    public void J(String str) {
        I(h5q.c(str));
    }
}
