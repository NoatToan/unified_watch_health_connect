package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.expandable.ExpandableTextView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dx4 extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final ExpandableTextView C;
    public final TextView D;

    public dx4(Object obj, View view, int i, TextView textView, ImageView imageView, ExpandableTextView expandableTextView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = expandableTextView;
        this.D = textView2;
    }

    public static dx4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static dx4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (dx4) ViewDataBinding.G(layoutInflater, sti.course_series_info_head, viewGroup, z, obj);
    }
}
