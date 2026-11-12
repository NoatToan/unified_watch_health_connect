package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class otr extends ViewDataBinding {
    public final AppCompatButton A;
    public final LinearLayout B;
    public final AppCompatButton C;
    public final ixq D;

    public otr(Object obj, View view, int i, AppCompatButton appCompatButton, LinearLayout linearLayout, AppCompatButton appCompatButton2, ixq ixqVar) {
        super(obj, view, i);
        this.A = appCompatButton;
        this.B = linearLayout;
        this.C = appCompatButton2;
        this.D = ixqVar;
    }
}
