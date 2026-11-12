package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.HomeHeaderView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class itq extends ViewDataBinding {
    public final HomeHeaderView A;
    public final View B;

    public itq(Object obj, View view, int i, HomeHeaderView homeHeaderView, View view2) {
        super(obj, view, i);
        this.A = homeHeaderView;
        this.B = view2;
    }
}
