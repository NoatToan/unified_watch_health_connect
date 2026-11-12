package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.ui.NfcSettingViewModel;
import com.xiaomi.fitness.nfc.widget.SetRightArrowView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rpg extends ViewDataBinding {
    public final SetRightArrowView A;
    public final SwitchButtonTwoLineTextView B;
    public final SetRightArrowView C;
    public final LinearLayout D;
    public final SetRightArrowView E;
    public final SetRightArrowView F;
    public NfcSettingViewModel G;

    public rpg(Object obj, View view, int i, SetRightArrowView setRightArrowView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, SetRightArrowView setRightArrowView2, LinearLayout linearLayout, SetRightArrowView setRightArrowView3, SetRightArrowView setRightArrowView4) {
        super(obj, view, i);
        this.A = setRightArrowView;
        this.B = switchButtonTwoLineTextView;
        this.C = setRightArrowView2;
        this.D = linearLayout;
        this.E = setRightArrowView3;
        this.F = setRightArrowView4;
    }
}
