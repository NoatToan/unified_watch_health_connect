package androidx.gridlayout.widget;

import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends GridLayout.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GridLayout.h f7521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GridLayout.h f7522b;

    public a(GridLayout.h hVar, GridLayout.h hVar2) {
        this.f7521a = hVar;
        this.f7522b = hVar2;
    }

    @Override // androidx.gridlayout.widget.GridLayout.h
    public final int a(View view2, int i14, int i15) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return (view2.getLayoutDirection() == 1 ? this.f7522b : this.f7521a).a(view2, i14, i15);
    }

    @Override // androidx.gridlayout.widget.GridLayout.h
    public final String c() {
        return "SWITCHING[L:" + this.f7521a.c() + ", R:" + this.f7522b.c() + "]";
    }

    @Override // androidx.gridlayout.widget.GridLayout.h
    public final int d(int i14, View view2) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return (view2.getLayoutDirection() == 1 ? this.f7522b : this.f7521a).d(i14, view2);
    }
}
