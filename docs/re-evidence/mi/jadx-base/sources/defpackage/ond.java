package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.about.bean.RnDeviceInfo;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ond extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public RnDeviceInfo C;

    public ond(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
    }
}
