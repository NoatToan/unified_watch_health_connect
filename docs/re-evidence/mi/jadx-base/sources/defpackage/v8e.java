package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class v8e extends ViewDataBinding {
    public final EditText A;
    public final TextView B;

    public v8e(Object obj, View view, int i, EditText editText, TextView textView) {
        super(obj, view, i);
        this.A = editText;
        this.B = textView;
    }
}
