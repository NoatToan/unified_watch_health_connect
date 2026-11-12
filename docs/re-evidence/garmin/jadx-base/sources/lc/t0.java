package lc;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/t0;", "", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f111876a = new t0();

    private t0() {
    }

    public static final y a(View view2) {
        view2.getClass();
        f111876a.getClass();
        y yVar = (y) c53.c0.j(c53.c0.p(c53.q.e(new l72.b1(13), view2), new l72.b1(14)));
        if (yVar != null) {
            return yVar;
        }
        kg.f.o("View ", view2, " does not have a NavController set");
        return null;
    }
}
