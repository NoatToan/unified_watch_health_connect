package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tqg extends ViewDataBinding {
    public final CheckBox A;
    public final ImageView B;
    public final View C;
    public final TextView D;
    public final LinearLayout E;
    public final TextView F;

    public tqg(Object obj, View view, int i, CheckBox checkBox, ImageView imageView, View view2, TextView textView, LinearLayout linearLayout, TextView textView2) {
        super(obj, view, i);
        this.A = checkBox;
        this.B = imageView;
        this.C = view2;
        this.D = textView;
        this.E = linearLayout;
        this.F = textView2;
    }
}
