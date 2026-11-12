package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.mi.health.sport.RunningRouteListMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zn0 extends ViewDataBinding {
    public final RelativeLayout A;
    public final Button B;
    public final CoordinatorLayout C;
    public final RunningRouteListMap D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final RecyclerView G;
    public final uae H;
    public final TabLayout I;
    public final LinearLayoutCompat J;
    public final sae K;

    public zn0(Object obj, View view, int i, RelativeLayout relativeLayout, Button button, CoordinatorLayout coordinatorLayout, RunningRouteListMap runningRouteListMap, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, RecyclerView recyclerView, uae uaeVar, TabLayout tabLayout, LinearLayoutCompat linearLayoutCompat, sae saeVar) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = button;
        this.C = coordinatorLayout;
        this.D = runningRouteListMap;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = recyclerView;
        this.H = uaeVar;
        this.I = tabLayout;
        this.J = linearLayoutCompat;
        this.K = saeVar;
    }
}
