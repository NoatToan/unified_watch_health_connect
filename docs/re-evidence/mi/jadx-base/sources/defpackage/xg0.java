package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xg0 extends ViewDataBinding {
    public final RecyclerView A;
    public final ImageView B;
    public final ClearEditText C;
    public final LinearLayout D;

    public xg0(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, ClearEditText clearEditText, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = imageView;
        this.C = clearEditText;
        this.D = linearLayout;
    }
}
