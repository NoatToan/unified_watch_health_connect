package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/core/view/x0;", "Lc53/j;", "Landroid/view/View;", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 implements c53.j<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6586a;

    public x0(ViewGroup viewGroup) {
        this.f6586a = viewGroup;
    }

    @Override // c53.j
    public final Iterator<View> iterator() {
        return new z0(this.f6586a);
    }
}
