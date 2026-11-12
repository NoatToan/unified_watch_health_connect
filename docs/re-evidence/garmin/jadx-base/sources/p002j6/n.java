package p002j6;

import android.view.View;
import h4.r;
import m4.a0;
import m4.m;
import m4.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj6/n;", "Lh4/r$c;", "Lm4/a0;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends r.c implements a0 {
    @Override // m4.a0
    public final void P1(y yVar) {
        View viewC = g.c(this);
        yVar.b(getNode().getIsAttached() && g.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            yVar.a(m.a(viewFindFocus, viewC));
        }
    }
}
