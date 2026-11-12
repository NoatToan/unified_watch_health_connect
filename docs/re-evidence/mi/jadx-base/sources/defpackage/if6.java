package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.widget.TimePicker;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class if6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final RightArrowSingleLineTextView B;
    public final TimePicker C;
    public final TextView D;

    public if6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RightArrowSingleLineTextView rightArrowSingleLineTextView, TimePicker timePicker, TextView textView) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = rightArrowSingleLineTextView;
        this.C = timePicker;
        this.D = textView;
    }
}
