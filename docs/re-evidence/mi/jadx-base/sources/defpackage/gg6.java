package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.widget.SideBar;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gg6 extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final RecyclerView C;
    public final EditText D;
    public final SideBar E;

    public gg6(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, EditText editText, SideBar sideBar) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = recyclerView;
        this.D = editText;
        this.E = sideBar;
    }
}
