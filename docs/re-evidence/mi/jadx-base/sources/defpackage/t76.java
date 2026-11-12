package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t76 extends ViewDataBinding {
    public final TextView A;
    public DeviceInfo B;

    public t76(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }
}
