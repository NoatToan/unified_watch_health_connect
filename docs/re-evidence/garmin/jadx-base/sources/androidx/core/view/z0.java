package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/core/view/z0;", "", "Landroid/view/View;", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 implements Iterator<View>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6591b;

    public z0(ViewGroup viewGroup) {
        this.f6591b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6590a < this.f6591b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i14 = this.f6590a;
        this.f6590a = i14 + 1;
        View childAt = this.f6591b.getChildAt(i14);
        if (childAt != null) {
            return childAt;
        }
        o2.c.q();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i14 = this.f6590a - 1;
        this.f6590a = i14;
        this.f6591b.removeViewAt(i14);
    }
}
