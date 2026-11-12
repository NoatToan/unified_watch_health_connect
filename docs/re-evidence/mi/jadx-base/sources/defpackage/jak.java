package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class jak extends ryp {
    public static <V extends sf2> float q(RecyclerView recyclerView, V v, a52 a52Var, float f) {
        return (f - v.getAxisMinimum()) * s(recyclerView, v, a52Var);
    }

    public static <V extends sf2> float r(RecyclerView recyclerView, V v, a52 a52Var) {
        return ((((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a) - recyclerView.getPaddingTop()) - a52Var.f626b) / (v.getAxisMaximum() - v.getAxisMinimum());
    }

    public static <V extends sf2> float s(RecyclerView recyclerView, V v, a52 a52Var) {
        return ((((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a) - recyclerView.getPaddingTop()) - a52Var.f626b) / (v.getAxisMaximum() - v.getAxisMinimum());
    }
}
