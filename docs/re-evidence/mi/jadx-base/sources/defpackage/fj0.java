package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fj0 extends ViewDataBinding {
    public final Button A;
    public final EditText B;
    public final ImageView C;
    public final TextView D;

    public fj0(Object obj, View view, int i, Button button, EditText editText, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = button;
        this.B = editText;
        this.C = imageView;
        this.D = textView;
    }
}
