package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.login.region.RegionSelectListViewModel;
import com.xiaomi.fitness.login.widget.QuickIndexView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class uqe extends ViewDataBinding {
    public final TextView A;
    public final QuickIndexView B;
    public final EditText C;
    public final TextView D;
    public final TextView E;
    public final RecyclerView F;
    public RegionSelectListViewModel G;

    public uqe(Object obj, View view, int i, TextView textView, QuickIndexView quickIndexView, EditText editText, TextView textView2, TextView textView3, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = quickIndexView;
        this.C = editText;
        this.D = textView2;
        this.E = textView3;
        this.F = recyclerView;
    }
}
