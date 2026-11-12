package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class li0 extends ViewDataBinding {
    public final View A;
    public final SwitchButtonBindingTwoLineTextView B;
    public final ImageView C;
    public final RecyclerView D;
    public final NestedScrollView E;
    public final TextView F;
    public final TextView G;
    public DeviceDualAuthorizationViewModel H;

    public li0(Object obj, View view, int i, View view2, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, ImageView imageView, RecyclerView recyclerView, NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = view2;
        this.B = switchButtonBindingTwoLineTextView;
        this.C = imageView;
        this.D = recyclerView;
        this.E = nestedScrollView;
        this.F = textView;
        this.G = textView2;
    }
}
