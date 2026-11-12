package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mq4 extends ViewDataBinding {
    public final TextView A;
    public final RatioImageView B;
    public final TextView C;

    public mq4(Object obj, View view, int i, TextView textView, RatioImageView ratioImageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = ratioImageView;
        this.C = textView2;
    }

    public static mq4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static mq4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mq4) ViewDataBinding.G(layoutInflater, fvi.course_eco_launch_layout_video, viewGroup, z, obj);
    }
}
