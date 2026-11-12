package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vsl extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final EditText C;

    public vsl(Object obj, View view, int i, TextView textView, TextView textView2, EditText editText) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = editText;
    }
}
