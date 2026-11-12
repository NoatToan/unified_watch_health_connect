package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p8e extends ViewDataBinding {
    public final EditText A;
    public final TextView B;
    public final TextView C;

    public p8e(Object obj, View view, int i, EditText editText, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = editText;
        this.B = textView;
        this.C = textView2;
    }
}
