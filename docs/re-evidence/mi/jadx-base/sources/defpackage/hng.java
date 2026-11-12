package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hng extends ViewDataBinding {
    public final LinearLayout A;
    public final ListView B;

    public hng(Object obj, View view, int i, LinearLayout linearLayout, ListView listView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = listView;
    }
}
