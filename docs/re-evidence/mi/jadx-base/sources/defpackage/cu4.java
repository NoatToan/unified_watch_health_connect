package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cu4 extends ViewDataBinding {
    public final TextView A;
    public final RatioImageView B;
    public final TextView C;

    public cu4(Object obj, View view, int i, TextView textView, RatioImageView ratioImageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = ratioImageView;
        this.C = textView2;
    }

    public static cu4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static cu4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cu4) ViewDataBinding.G(layoutInflater, dvi.course_launch_layout_video, viewGroup, z, obj);
    }
}
