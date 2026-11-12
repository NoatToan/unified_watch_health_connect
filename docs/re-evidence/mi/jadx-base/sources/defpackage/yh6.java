package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yh6 extends ViewDataBinding {
    public final LinearLayout A;
    public final DividerView B;
    public final LinearLayout C;
    public final ImageView D;
    public final RecyclerView E;
    public final EditText F;
    public final mk6 G;
    public final TextView H;

    public yh6(Object obj, View view, int i, LinearLayout linearLayout, DividerView dividerView, LinearLayout linearLayout2, ImageView imageView, RecyclerView recyclerView, EditText editText, mk6 mk6Var, TextView textView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = dividerView;
        this.C = linearLayout2;
        this.D = imageView;
        this.E = recyclerView;
        this.F = editText;
        this.G = mk6Var;
        this.H = textView;
    }
}
