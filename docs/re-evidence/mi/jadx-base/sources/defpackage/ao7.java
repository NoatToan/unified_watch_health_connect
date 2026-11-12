package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.widget.HrLevelView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ao7 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final HrLevelView C;
    public final TextView D;

    public ao7(Object obj, View view, int i, ImageView imageView, TextView textView, HrLevelView hrLevelView, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = hrLevelView;
        this.D = textView2;
    }
}
