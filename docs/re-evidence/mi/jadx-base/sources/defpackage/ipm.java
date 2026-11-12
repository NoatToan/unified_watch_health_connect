package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ipm extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final View C;
    public final ConstraintLayout D;
    public final FlexboxLayout E;
    public final TextView F;

    public ipm(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, View view2, ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = view2;
        this.D = constraintLayout;
        this.E = flexboxLayout;
        this.F = textView2;
    }
}
