package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zw8 extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final SwitchButtonBindingTwoLineTextView C;
    public final SwitchButtonBindingTwoLineTextView D;
    public FaceDesignerViewModel E;

    public zw8(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = switchButtonBindingTwoLineTextView;
        this.D = switchButtonBindingTwoLineTextView2;
    }
}
