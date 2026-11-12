package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n56 extends ViewDataBinding {
    public final RecyclerView A;
    public final h86 B;
    public DeviceSettingListViewModel C;

    public n56(Object obj, View view, int i, RecyclerView recyclerView, h86 h86Var) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = h86Var;
    }
}
