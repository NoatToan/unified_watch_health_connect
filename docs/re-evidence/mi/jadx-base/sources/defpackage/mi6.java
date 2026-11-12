package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;
import com.xiaomi.fitness.devicesettings.widget.SideBar;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mi6 extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final RelativeLayout C;
    public final ClearEditText D;
    public final SideBar E;

    public mi6(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, RelativeLayout relativeLayout, ClearEditText clearEditText, SideBar sideBar) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = relativeLayout;
        this.D = clearEditText;
        this.E = sideBar;
    }
}
