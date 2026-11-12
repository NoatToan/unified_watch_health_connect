package defpackage;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceNormalGuideView;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoDeviceBindStatusView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class uq7 extends ViewDataBinding {
    public final ScrollView A;
    public final TextView B;
    public final EcoDeviceNormalGuideView C;
    public final View D;
    public final EcoDeviceBindStatusView E;
    public final EcoDeviceBindStatusView F;
    public final EcoDeviceBindStatusView G;
    public final TextView H;
    public EcoBindViewModel I;
    public EcoAddDeviceInfo J;

    public uq7(Object obj, View view, int i, ScrollView scrollView, TextView textView, EcoDeviceNormalGuideView ecoDeviceNormalGuideView, View view2, EcoDeviceBindStatusView ecoDeviceBindStatusView, EcoDeviceBindStatusView ecoDeviceBindStatusView2, EcoDeviceBindStatusView ecoDeviceBindStatusView3, TextView textView2) {
        super(obj, view, i);
        this.A = scrollView;
        this.B = textView;
        this.C = ecoDeviceNormalGuideView;
        this.D = view2;
        this.E = ecoDeviceBindStatusView;
        this.F = ecoDeviceBindStatusView2;
        this.G = ecoDeviceBindStatusView3;
        this.H = textView2;
    }
}
