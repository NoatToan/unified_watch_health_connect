package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jqe extends ViewDataBinding {
    public final FrameLayout A;
    public final AppCompatImageView B;
    public final TextView C;

    public jqe(Object obj, View view, int i, FrameLayout frameLayout, AppCompatImageView appCompatImageView, TextView textView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = appCompatImageView;
        this.C = textView;
    }
}
