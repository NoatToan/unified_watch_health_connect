package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class m16 extends ViewDataBinding {
    public final RecyclerView A;
    public ManagerViewModel B;

    public m16(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
