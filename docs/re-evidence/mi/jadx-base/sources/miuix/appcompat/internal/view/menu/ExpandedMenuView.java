package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedMenuView extends ListView implements d.c, i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26493b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
    }

    @Override // miuix.appcompat.internal.view.menu.d.c
    public boolean a(f fVar, int i) {
        return this.f26492a.I(fVar, i);
    }

    @Override // miuix.appcompat.internal.view.menu.i
    public boolean b(int i) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.i
    public void c(d dVar) {
        this.f26492a = dVar;
    }

    @Override // miuix.appcompat.internal.view.menu.i
    public boolean d() {
        return false;
    }

    public int getWindowAnimations() {
        return this.f26493b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((f) getAdapter().getItem(i), 0);
    }
}
