package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class aj6 extends ViewDataBinding {
    public final TextView A;
    public final Button B;
    public final Button C;
    public final EditText D;
    public final NestedScrollView E;
    public final ImageView F;

    public aj6(Object obj, View view, int i, TextView textView, Button button, Button button2, EditText editText, NestedScrollView nestedScrollView, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = button;
        this.C = button2;
        this.D = editText;
        this.E = nestedScrollView;
        this.F = imageView;
    }
}
