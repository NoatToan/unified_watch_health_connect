package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSelectCountView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ig6 extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final SwitchButtonTwoLineTextView B;
    public final ECGMeasureRemindSelectCountView C;
    public final RightArrowSingleLineTextView D;
    public final LinearLayoutCompat E;
    public final NestedScrollView F;

    public ig6(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, ECGMeasureRemindSelectCountView eCGMeasureRemindSelectCountView, RightArrowSingleLineTextView rightArrowSingleLineTextView, LinearLayoutCompat linearLayoutCompat2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = switchButtonTwoLineTextView;
        this.C = eCGMeasureRemindSelectCountView;
        this.D = rightArrowSingleLineTextView;
        this.E = linearLayoutCompat2;
        this.F = nestedScrollView;
    }
}
