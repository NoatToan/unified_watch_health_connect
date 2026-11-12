package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xde extends ViewDataBinding {
    public final LevelBarView A;
    public final RecyclerView B;
    public final RecyclerView C;
    public final CardUnderstandView D;
    public final LinearLayout E;
    public final View F;

    public xde(Object obj, View view, int i, LevelBarView levelBarView, RecyclerView recyclerView, RecyclerView recyclerView2, CardUnderstandView cardUnderstandView, LinearLayout linearLayout, View view2) {
        super(obj, view, i);
        this.A = levelBarView;
        this.B = recyclerView;
        this.C = recyclerView2;
        this.D = cardUnderstandView;
        this.E = linearLayout;
        this.F = view2;
    }
}
