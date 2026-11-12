package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class er4 extends ViewDataBinding {
    public final ImageView A;
    public final Button B;
    public final Button C;
    public final Button D;
    public final Spinner E;
    public final Button F;
    public final Button G;
    public final TextView H;
    public final TextView I;

    public er4(Object obj, View view, int i, ImageView imageView, Button button, Button button2, Button button3, Spinner spinner, Button button4, Button button5, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = button;
        this.C = button2;
        this.D = button3;
        this.E = spinner;
        this.F = button4;
        this.G = button5;
        this.H = textView;
        this.I = textView2;
    }

    public static er4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static er4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (er4) ViewDataBinding.G(layoutInflater, sti.course_fragment_float_window, viewGroup, z, obj);
    }
}
