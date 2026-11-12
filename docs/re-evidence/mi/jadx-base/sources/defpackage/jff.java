package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jff extends ViewDataBinding {
    public final AppCompatImageView A;
    public final RelativeLayout B;
    public final TextView C;

    public jff(Object obj, View view, int i, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = relativeLayout;
        this.C = textView;
    }
}
