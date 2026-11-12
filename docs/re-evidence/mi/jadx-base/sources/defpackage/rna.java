package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rna extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final DataTitleView C;
    public final uzb D;

    public rna(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, DataTitleView dataTitleView, uzb uzbVar) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = dataTitleView;
        this.D = uzbVar;
    }
}
