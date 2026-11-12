package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fga extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final ConstraintLayout C;
    public final View D;
    public final RecyclerView E;
    public final ImageView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;

    public fga(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, ConstraintLayout constraintLayout, View view2, RecyclerView recyclerView, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = constraintLayout;
        this.D = view2;
        this.E = recyclerView;
        this.F = imageView;
        this.G = appCompatTextView;
        this.H = appCompatTextView2;
    }

    public static fga A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static fga B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fga) ViewDataBinding.G(layoutInflater, ivi.W, viewGroup, z, obj);
    }
}
