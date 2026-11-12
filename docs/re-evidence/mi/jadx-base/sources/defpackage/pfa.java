package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.SportRecordRunningRouteView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pfa extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final SportRecordRunningRouteView C;

    public pfa(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, SportRecordRunningRouteView sportRecordRunningRouteView) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = sportRecordRunningRouteView;
    }

    public static pfa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static pfa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (pfa) ViewDataBinding.G(layoutInflater, ivi.P, viewGroup, z, obj);
    }
}
