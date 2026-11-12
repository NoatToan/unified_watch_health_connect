package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.widget.SquareImageView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class su6 extends ViewDataBinding {
    public final LinearLayout A;
    public final SquareImageView B;
    public ScanDeviceViewModel C;

    public su6(Object obj, View view, int i, LinearLayout linearLayout, SquareImageView squareImageView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = squareImageView;
    }
}
