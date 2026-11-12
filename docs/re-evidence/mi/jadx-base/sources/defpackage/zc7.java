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
public abstract class zc7 extends ViewDataBinding {
    public final ScrollView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final EcoDeviceNormalGuideView E;
    public final View F;
    public final EcoDeviceBindStatusView G;
    public final EcoDeviceBindStatusView H;
    public final EcoDeviceBindStatusView I;
    public final TextView J;
    public EcoBindViewModel K;
    public EcoAddDeviceInfo L;

    public zc7(Object obj, View view, int i, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, EcoDeviceNormalGuideView ecoDeviceNormalGuideView, View view2, EcoDeviceBindStatusView ecoDeviceBindStatusView, EcoDeviceBindStatusView ecoDeviceBindStatusView2, EcoDeviceBindStatusView ecoDeviceBindStatusView3, TextView textView4) {
        super(obj, view, i);
        this.A = scrollView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = ecoDeviceNormalGuideView;
        this.F = view2;
        this.G = ecoDeviceBindStatusView;
        this.H = ecoDeviceBindStatusView2;
        this.I = ecoDeviceBindStatusView3;
        this.J = textView4;
    }
}
