package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class avb extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final RecyclerView D;
    public final RadioGroup E;
    public final AppCompatTextView F;

    public avb(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, RecyclerView recyclerView, RadioGroup radioGroup, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = textView2;
        this.D = recyclerView;
        this.E = radioGroup;
        this.F = appCompatTextView;
    }
}
