package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class af6 extends ViewDataBinding {
    public final LinearLayout A;
    public final AppCompatTextView B;
    public final ImageView C;
    public final RecyclerView D;
    public final ClearEditText E;
    public final NestedScrollView F;

    public af6(Object obj, View view, int i, LinearLayout linearLayout, AppCompatTextView appCompatTextView, ImageView imageView, RecyclerView recyclerView, ClearEditText clearEditText, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = appCompatTextView;
        this.C = imageView;
        this.D = recyclerView;
        this.E = clearEditText;
        this.F = nestedScrollView;
    }
}
