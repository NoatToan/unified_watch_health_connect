package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mk6 extends ViewDataBinding {
    public final AppCompatCheckedTextView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;

    public mk6(Object obj, View view, int i, AppCompatCheckedTextView appCompatCheckedTextView, TextView textView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.A = appCompatCheckedTextView;
        this.B = textView;
        this.C = textView2;
        this.D = imageView;
    }
}
