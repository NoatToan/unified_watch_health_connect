package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.widget.FeatureItemBindingView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d86 extends ViewDataBinding {
    public final FeatureItemBindingView A;
    public ScannedDeviceInfo B;

    public d86(Object obj, View view, int i, FeatureItemBindingView featureItemBindingView) {
        super(obj, view, i);
        this.A = featureItemBindingView;
    }
}
