package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fzg extends ViewDataBinding {
    public final AppCompatButton A;
    public final LinearLayout B;
    public final AppCompatButton C;
    public final RecyclerView D;

    public fzg(Object obj, View view, int i, AppCompatButton appCompatButton, LinearLayout linearLayout, AppCompatButton appCompatButton2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = appCompatButton;
        this.B = linearLayout;
        this.C = appCompatButton2;
        this.D = recyclerView;
    }
}
