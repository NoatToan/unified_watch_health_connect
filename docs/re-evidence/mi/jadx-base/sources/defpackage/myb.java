package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class myb extends ViewDataBinding {
    public final AppCompatImageView A;
    public final AppCompatImageView B;
    public final a7e C;
    public final RecyclerView D;
    public final TextView E;

    public myb(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, a7e a7eVar, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = appCompatImageView2;
        this.C = a7eVar;
        this.D = recyclerView;
        this.E = textView;
    }
}
