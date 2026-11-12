package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.view.WidgetGroupView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qj6 extends ViewDataBinding {
    public final RecyclerView A;
    public final WidgetGroupView B;

    public qj6(Object obj, View view, int i, RecyclerView recyclerView, WidgetGroupView widgetGroupView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = widgetGroupView;
    }
}
