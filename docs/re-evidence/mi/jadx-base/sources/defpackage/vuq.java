package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.LocalSportBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vuq extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public LocalSportBean D;

    public vuq(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
    }

    public static vuq A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vuq B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vuq) ViewDataBinding.G(layoutInflater, dvi.D1, viewGroup, z, obj);
    }

    public abstract void C0(LocalSportBean localSportBean);
}
