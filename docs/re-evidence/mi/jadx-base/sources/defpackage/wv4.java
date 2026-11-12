package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wv4 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final View E;

    public wv4(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = view2;
    }

    public static wv4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static wv4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wv4) ViewDataBinding.G(layoutInflater, sti.course_open_vip_item, viewGroup, z, obj);
    }
}
