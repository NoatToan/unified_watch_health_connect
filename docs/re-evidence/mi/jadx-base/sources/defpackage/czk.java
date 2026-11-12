package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;

/* JADX INFO: loaded from: classes8.dex */
public abstract class czk extends ViewDataBinding {
    public final View A;
    public final MoreRecyclerView B;
    public MyTrackLibraryVM C;

    public czk(Object obj, View view, int i, View view2, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = view2;
        this.B = moreRecyclerView;
    }
}
