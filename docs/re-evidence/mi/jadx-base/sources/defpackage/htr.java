package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.xms.wearable.widget.ProgressButton;

/* JADX INFO: loaded from: classes2.dex */
public abstract class htr extends ViewDataBinding {
    public final ProgressButton A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;

    public htr(Object obj, View view, int i, ProgressButton progressButton, TextView textView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.A = progressButton;
        this.B = textView;
        this.C = textView2;
        this.D = imageView;
    }

    public static htr A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static htr B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (htr) ViewDataBinding.G(layoutInflater, wvi.h, viewGroup, z, obj);
    }
}
