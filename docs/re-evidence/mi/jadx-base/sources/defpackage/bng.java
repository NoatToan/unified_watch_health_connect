package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardImageView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bng extends ViewDataBinding {
    public final AppCompatTextView A;
    public final CardImageView B;
    public final TextView C;
    public final DeviceImageView D;
    public final View E;
    public final TextView F;
    public final AppCompatTextView G;
    public final View H;

    public bng(Object obj, View view, int i, AppCompatTextView appCompatTextView, CardImageView cardImageView, TextView textView, DeviceImageView deviceImageView, View view2, TextView textView2, AppCompatTextView appCompatTextView2, View view3) {
        super(obj, view, i);
        this.A = appCompatTextView;
        this.B = cardImageView;
        this.C = textView;
        this.D = deviceImageView;
        this.E = view2;
        this.F = textView2;
        this.G = appCompatTextView2;
        this.H = view3;
    }
}
