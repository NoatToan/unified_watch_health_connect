package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.ui.SleepAnalyzeLevelView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j1c extends ViewDataBinding {
    public final Barrier A;
    public final SleepAnalyzeLevelView B;
    public final View C;
    public final TextView D;
    public final TextView E;

    public j1c(Object obj, View view, int i, Barrier barrier, SleepAnalyzeLevelView sleepAnalyzeLevelView, View view2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = barrier;
        this.B = sleepAnalyzeLevelView;
        this.C = view2;
        this.D = textView;
        this.E = textView2;
    }

    public static j1c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static j1c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j1c) ViewDataBinding.G(layoutInflater, jui.c5, viewGroup, z, obj);
    }
}
