package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.BankCardView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tpg extends ViewDataBinding {
    public final BankCardView A;
    public final View B;
    public final DeviceImageView C;
    public final DeviceImageView D;
    public final ConstraintLayout E;
    public final ImageView F;
    public final TextView G;
    public final ConstraintLayout H;

    public tpg(Object obj, View view, int i, BankCardView bankCardView, View view2, DeviceImageView deviceImageView, DeviceImageView deviceImageView2, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.A = bankCardView;
        this.B = view2;
        this.C = deviceImageView;
        this.D = deviceImageView2;
        this.E = constraintLayout;
        this.F = imageView;
        this.G = textView;
        this.H = constraintLayout2;
    }
}
