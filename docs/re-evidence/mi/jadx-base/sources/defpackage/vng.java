package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vng extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final TextView C;
    public final TextView D;
    public final LinearLayout E;
    public final GridView F;
    public final EditText G;
    public final TextView H;

    public vng(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, TextView textView2, TextView textView3, LinearLayout linearLayout, GridView gridView, EditText editText, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = textView2;
        this.D = textView3;
        this.E = linearLayout;
        this.F = gridView;
        this.G = editText;
        this.H = textView4;
    }
}
