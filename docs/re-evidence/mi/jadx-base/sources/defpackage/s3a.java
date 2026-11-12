package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s3a extends ViewDataBinding {
    public final LinearLayout A;
    public final ConstraintLayout B;
    public final TextView C;
    public final View D;
    public final AppCompatImageView E;
    public final RecyclerView F;
    public final androidx.recyclerview.widget.RecyclerView G;
    public final TextView H;

    public s3a(Object obj, View view, int i, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, View view2, AppCompatImageView appCompatImageView, RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView recyclerView2, TextView textView2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = constraintLayout;
        this.C = textView;
        this.D = view2;
        this.E = appCompatImageView;
        this.F = recyclerView;
        this.G = recyclerView2;
        this.H = textView2;
    }
}
