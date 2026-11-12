package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.track.viewmodel.ExportTrackViewModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class skp extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final View C;
    public ExportTrackViewModel D;

    public skp(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, View view2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = view2;
    }
}
