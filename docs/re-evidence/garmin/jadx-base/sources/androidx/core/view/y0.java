package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class y0 implements e23.l<View, Iterator<? extends View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f6589a = new y0();

    @Override // e23.l
    public final Iterator<? extends View> invoke(View view2) {
        View view3 = view2;
        ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
        if (viewGroup != null) {
            return new x0(viewGroup).iterator();
        }
        return null;
    }
}
