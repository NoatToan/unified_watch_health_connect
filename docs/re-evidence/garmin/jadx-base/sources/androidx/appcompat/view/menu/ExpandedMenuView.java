package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.w0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h.b, o, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4671b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f4672a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 w0VarG = w0.g(context, attributeSet, f4671b, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(w0VarG.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(w0VarG.b(1));
        }
        w0VarG.h();
    }

    @Override // androidx.appcompat.view.menu.h.b
    public final boolean a(j jVar) {
        return this.f4672a.performItemAction(jVar, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void initialize(h hVar) {
        this.f4672a = hVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view2, int i14, long j8) {
        a((j) getAdapter().getItem(i14));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
