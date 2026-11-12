package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import defpackage.xfp;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements e.b, MenuView, AdapterView.OnItemClickListener {
    public static final int[] c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1480b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void b(e eVar) {
        this.f1479a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean f(g gVar) {
        return this.f1479a.N(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1480b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        f((g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        xfp xfpVarV = xfp.v(context, attributeSet, c, i, 0);
        if (xfpVarV.s(0)) {
            setBackgroundDrawable(xfpVarV.g(0));
        }
        if (xfpVarV.s(1)) {
            setDivider(xfpVarV.g(1));
        }
        xfpVarV.w();
    }
}
