package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tt7 extends ViewDataBinding {
    public final RecyclerView A;
    public OtherDeviceTabV4ViewModel B;

    public tt7(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
