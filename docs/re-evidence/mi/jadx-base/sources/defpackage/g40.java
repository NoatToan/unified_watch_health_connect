package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g40 extends ViewDataBinding {
    public final RecyclerView A;
    public final View B;
    public final FrameLayout C;
    public final RightArrowSingleLineTextView D;
    public AccessDeviceManagerViewModel E;

    public g40(Object obj, View view, int i, RecyclerView recyclerView, View view2, FrameLayout frameLayout, RightArrowSingleLineTextView rightArrowSingleLineTextView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = view2;
        this.C = frameLayout;
        this.D = rightArrowSingleLineTextView;
    }
}
