package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.view.UnderstandItemView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ila extends ViewDataBinding {
    public final UnderstandItemView A;
    public final UnderstandItemView B;
    public final UnderstandItemView C;

    public ila(Object obj, View view, int i, UnderstandItemView understandItemView, UnderstandItemView understandItemView2, UnderstandItemView understandItemView3) {
        super(obj, view, i);
        this.A = understandItemView;
        this.B = understandItemView2;
        this.C = understandItemView3;
    }
}
