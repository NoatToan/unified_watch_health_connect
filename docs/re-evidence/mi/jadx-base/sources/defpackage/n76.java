package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.fitness.device.manager.ui.manager.DeviceSwipeView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n76 extends ViewDataBinding {
    public final DeviceSwipeView A;
    public DeviceDetail B;

    public n76(Object obj, View view, int i, DeviceSwipeView deviceSwipeView) {
        super(obj, view, i);
        this.A = deviceSwipeView;
    }
}
