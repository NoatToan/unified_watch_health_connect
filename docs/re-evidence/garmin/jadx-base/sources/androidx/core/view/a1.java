package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/view/a1;", "Lc53/j;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a1 implements c53.j<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6403a;

    public a1(ViewGroup viewGroup) {
        this.f6403a = viewGroup;
    }

    @Override // c53.j
    public final Iterator<View> iterator() {
        return new k0(new x0(this.f6403a).iterator(), y0.f6589a);
    }
}
