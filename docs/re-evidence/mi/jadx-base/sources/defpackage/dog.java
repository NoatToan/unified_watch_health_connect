package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.InfoInputEditTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dog extends ViewDataBinding {
    public final InfoInputEditTextView A;
    public final TextView B;
    public final LinearLayout C;
    public final InfoInputEditTextView D;
    public final InfoInputEditTextView E;
    public final View F;

    public dog(Object obj, View view, int i, InfoInputEditTextView infoInputEditTextView, TextView textView, LinearLayout linearLayout, InfoInputEditTextView infoInputEditTextView2, InfoInputEditTextView infoInputEditTextView3, View view2) {
        super(obj, view, i);
        this.A = infoInputEditTextView;
        this.B = textView;
        this.C = linearLayout;
        this.D = infoInputEditTextView2;
        this.E = infoInputEditTextView3;
        this.F = view2;
    }
}
