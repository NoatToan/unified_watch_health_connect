package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x1g extends ViewDataBinding {
    public final EditText A;
    public final TextView B;
    public final Button C;

    public x1g(Object obj, View view, int i, EditText editText, TextView textView, Button button) {
        super(obj, view, i);
        this.A = editText;
        this.B = textView;
        this.C = button;
    }
}
