package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.access.AccessViewModel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x30 extends ViewDataBinding {
    public final ImageView A;
    public final Button B;
    public final TextView C;
    public AccessViewModel D;

    public x30(Object obj, View view, int i, ImageView imageView, Button button, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = button;
        this.C = textView;
    }
}
