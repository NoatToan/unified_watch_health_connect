package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zce extends ViewDataBinding {
    public final EditText A;
    public final EditText B;
    public final TextView C;
    public final RatingBar D;
    public final RecyclerView E;
    public final DataTitleSimpleView F;
    public final TextView G;
    public final TextView H;

    public zce(Object obj, View view, int i, EditText editText, EditText editText2, TextView textView, RatingBar ratingBar, RecyclerView recyclerView, DataTitleSimpleView dataTitleSimpleView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = editText;
        this.B = editText2;
        this.C = textView;
        this.D = ratingBar;
        this.E = recyclerView;
        this.F = dataTitleSimpleView;
        this.G = textView2;
        this.H = textView3;
    }

    public static zce A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static zce B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zce) ViewDataBinding.G(layoutInflater, ivi.e1, viewGroup, z, obj);
    }
}
