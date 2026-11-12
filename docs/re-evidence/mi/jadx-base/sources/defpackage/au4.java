package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class au4 extends ViewDataBinding {
    public final RatioImageView A;
    public final TextView B;

    public au4(Object obj, View view, int i, RatioImageView ratioImageView, TextView textView) {
        super(obj, view, i);
        this.A = ratioImageView;
        this.B = textView;
    }

    public static au4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static au4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (au4) ViewDataBinding.G(layoutInflater, dvi.course_launch_layout_post, viewGroup, z, obj);
    }
}
