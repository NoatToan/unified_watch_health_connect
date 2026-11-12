package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sub extends ViewDataBinding {
    public final AppBarLayout A;
    public final uxb B;
    public final RecyclerView C;
    public final AppCompatTextView D;
    public final TitleBarAlphaView E;
    public final ConstraintLayout F;
    public final AppCompatTextView G;

    public sub(Object obj, View view, int i, AppBarLayout appBarLayout, uxb uxbVar, RecyclerView recyclerView, AppCompatTextView appCompatTextView, TitleBarAlphaView titleBarAlphaView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.A = appBarLayout;
        this.B = uxbVar;
        this.C = recyclerView;
        this.D = appCompatTextView;
        this.E = titleBarAlphaView;
        this.F = constraintLayout;
        this.G = appCompatTextView2;
    }
}
