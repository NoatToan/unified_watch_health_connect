package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.login.region.RegionViewModel;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wqe extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public RegionViewModel C;

    public wqe(Object obj, View view, int i, Button button, TextView textView) {
        super(obj, view, i);
        this.A = button;
        this.B = textView;
    }
}
