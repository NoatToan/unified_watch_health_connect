package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t8e extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final SwitchButton C;

    public t8e(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, SwitchButton switchButton) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = switchButton;
    }
}
