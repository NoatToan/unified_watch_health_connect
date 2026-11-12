package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.common.HealthRemindSelectCountView;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z1c extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final SwitchButtonBindingSingleLineTextView B;
    public final HealthRemindSelectCountView C;
    public final LinearLayoutCompat D;
    public final NestedScrollView E;

    public z1c(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView, HealthRemindSelectCountView healthRemindSelectCountView, LinearLayoutCompat linearLayoutCompat2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = switchButtonBindingSingleLineTextView;
        this.C = healthRemindSelectCountView;
        this.D = linearLayoutCompat2;
        this.E = nestedScrollView;
    }
}
