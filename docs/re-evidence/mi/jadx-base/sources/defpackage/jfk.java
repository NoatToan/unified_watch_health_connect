package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jfk extends ViewDataBinding {
    public final EditText A;
    public final TextView B;
    public final DividerView C;
    public final RecyclerView D;
    public final TextView E;

    public jfk(Object obj, View view, int i, EditText editText, TextView textView, DividerView dividerView, RecyclerView recyclerView, TextView textView2) {
        super(obj, view, i);
        this.A = editText;
        this.B = textView;
        this.C = dividerView;
        this.D = recyclerView;
        this.E = textView2;
    }
}
