package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class smn extends ViewDataBinding {
    public final GpsSignalView A;
    public final mpn B;
    public final umn C;
    public final ImageView D;
    public final ConstraintLayout E;

    public smn(Object obj, View view, int i, GpsSignalView gpsSignalView, mpn mpnVar, umn umnVar, ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = gpsSignalView;
        this.B = mpnVar;
        this.C = umnVar;
        this.D = imageView;
        this.E = constraintLayout;
    }
}
