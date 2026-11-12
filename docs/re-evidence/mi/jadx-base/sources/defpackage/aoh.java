package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aoh extends ViewDataBinding {
    public final AppCompatImageView A;
    public final AppCompatImageView B;
    public final TextView C;

    public aoh(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = appCompatImageView2;
        this.C = textView;
    }
}
