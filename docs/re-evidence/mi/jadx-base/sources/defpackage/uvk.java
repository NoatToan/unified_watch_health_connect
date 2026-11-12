package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class uvk extends ViewDataBinding {
    public final EditText A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;

    public uvk(Object obj, View view, int i, EditText editText, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = editText;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
    }
}
