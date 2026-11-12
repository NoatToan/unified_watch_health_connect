package p002j6;

import a5.j;
import android.view.View;
import f5.d0;
import h5.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97194a = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"j6/b$a", "La5/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements a5.a {
    }

    public static final void a(View view2, e0 e0Var) {
        long jE = d0.e(e0Var.P.f81682c);
        int iRound = Math.round(Float.intBitsToFloat((int) (jE >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jE & 4294967295L)));
        view2.layout(iRound, iRound2, view2.getMeasuredWidth() + iRound, view2.getMeasuredHeight() + iRound2);
    }

    public static final int b(int i14) {
        if (i14 == 0) {
            j.f1233b.getClass();
            return j.f1234c;
        }
        j.f1233b.getClass();
        return j.f1235d;
    }
}
