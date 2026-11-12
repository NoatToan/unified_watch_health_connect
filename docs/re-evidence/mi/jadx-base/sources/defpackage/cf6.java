package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.widget.SideBar;
import miuix.androidbasewidget.widget.EditText;
import miuix.core.widget.NestedScrollView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class cf6 extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final NestedScrollView C;
    public final EditText D;
    public final SideBar E;

    public cf6(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, NestedScrollView nestedScrollView, EditText editText, SideBar sideBar) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = nestedScrollView;
        this.D = editText;
        this.E = sideBar;
    }
}
