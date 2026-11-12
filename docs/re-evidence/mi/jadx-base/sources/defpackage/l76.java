package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l76 extends ViewDataBinding {
    public final RecyclerView A;
    public DeviceTabV4ViewModel B;
    public TabContentItem C;

    public l76(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
