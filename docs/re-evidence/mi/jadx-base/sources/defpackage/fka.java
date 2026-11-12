package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.watch.face.view.FaceWaterMarkView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel;
import com.xiaomi.fitness.watch.face.widget.StateLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fka extends ViewDataBinding {
    public final EditText A;
    public final Group B;
    public final TextView C;
    public final StateLayout D;
    public final MoreRecyclerView E;
    public final FaceWaterMarkView F;
    public FaceTabListViewModel G;

    public fka(Object obj, View view, int i, EditText editText, Group group, TextView textView, StateLayout stateLayout, MoreRecyclerView moreRecyclerView, FaceWaterMarkView faceWaterMarkView) {
        super(obj, view, i);
        this.A = editText;
        this.B = group;
        this.C = textView;
        this.D = stateLayout;
        this.E = moreRecyclerView;
        this.F = faceWaterMarkView;
    }
}
