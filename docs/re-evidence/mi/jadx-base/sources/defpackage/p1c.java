package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p1c extends ViewDataBinding {
    public final AppCompatImageView A;
    public final TextView B;

    public p1c(Object obj, View view, int i, AppCompatImageView appCompatImageView, TextView textView) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = textView;
    }
}
