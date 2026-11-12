package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.widget.SquareImageView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r76 extends ViewDataBinding {
    public final SquareImageView A;
    public final TextView B;
    public DeviceInfo C;

    public r76(Object obj, View view, int i, SquareImageView squareImageView, TextView textView) {
        super(obj, view, i);
        this.A = squareImageView;
        this.B = textView;
    }
}
