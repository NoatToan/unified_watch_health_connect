package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ezk extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final MoreRecyclerView C;
    public MyTrackLibraryVM D;

    public ezk(Object obj, View view, int i, TextView textView, View view2, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = moreRecyclerView;
    }
}
