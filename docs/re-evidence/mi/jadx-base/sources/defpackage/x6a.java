package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class x6a extends ViewDataBinding {
    public final DividerView A;
    public final View B;
    public final TextView C;
    public final LinearLayout D;
    public final PhotoBgPicker E;
    public final RecyclerView F;
    public final TextView G;

    public x6a(Object obj, View view, int i, DividerView dividerView, View view2, TextView textView, LinearLayout linearLayout, PhotoBgPicker photoBgPicker, RecyclerView recyclerView, TextView textView2) {
        super(obj, view, i);
        this.A = dividerView;
        this.B = view2;
        this.C = textView;
        this.D = linearLayout;
        this.E = photoBgPicker;
        this.F = recyclerView;
        this.G = textView2;
    }
}
