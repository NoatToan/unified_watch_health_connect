package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tng extends ViewDataBinding {
    public final LinearLayout A;
    public final RelativeLayout B;
    public final ListView C;

    public tng(Object obj, View view, int i, LinearLayout linearLayout, RelativeLayout relativeLayout, ListView listView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = relativeLayout;
        this.C = listView;
    }
}
