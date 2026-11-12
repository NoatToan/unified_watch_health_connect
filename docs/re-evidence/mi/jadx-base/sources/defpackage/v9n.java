package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchViewModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v9n extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final View C;
    public final ImageView D;
    public final TextView E;
    public JustDanceLaunchViewModel F;

    public v9n(Object obj, View view, int i, ImageView imageView, TextView textView, View view2, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = view2;
        this.D = imageView2;
        this.E = textView2;
    }
}
