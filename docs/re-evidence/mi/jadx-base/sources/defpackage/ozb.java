package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ozb extends ViewDataBinding {
    public final AppCompatImageView A;
    public final qxb B;
    public final LinearLayout C;
    public final ConstraintLayout D;
    public final RecyclerView E;
    public final mxb F;
    public final mxb G;
    public final mxb H;
    public final mxb I;

    public ozb(Object obj, View view, int i, AppCompatImageView appCompatImageView, qxb qxbVar, LinearLayout linearLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, mxb mxbVar, mxb mxbVar2, mxb mxbVar3, mxb mxbVar4) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = qxbVar;
        this.C = linearLayout;
        this.D = constraintLayout;
        this.E = recyclerView;
        this.F = mxbVar;
        this.G = mxbVar2;
        this.H = mxbVar3;
        this.I = mxbVar4;
    }
}
