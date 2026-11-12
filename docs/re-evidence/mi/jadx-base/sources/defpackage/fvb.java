package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.calendar.view.DayThreeCircleFiveLineCalendarView;
import com.xiaomi.fitness.baseui.calendar.view.WeekBar;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fvb extends ViewDataBinding {
    public final ShareAccountInfoView A;
    public final CardView B;
    public final ConstraintLayout C;
    public final View D;
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final DayThreeCircleFiveLineCalendarView I;
    public final TextView J;
    public final TextView K;
    public final NestedScrollView L;
    public final LinearLayout M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final WeekBar Q;

    public fvb(Object obj, View view, int i, ShareAccountInfoView shareAccountInfoView, CardView cardView, ConstraintLayout constraintLayout, View view2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, DayThreeCircleFiveLineCalendarView dayThreeCircleFiveLineCalendarView, TextView textView4, TextView textView5, NestedScrollView nestedScrollView, LinearLayout linearLayout2, TextView textView6, TextView textView7, TextView textView8, WeekBar weekBar) {
        super(obj, view, i);
        this.A = shareAccountInfoView;
        this.B = cardView;
        this.C = constraintLayout;
        this.D = view2;
        this.E = linearLayout;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
        this.I = dayThreeCircleFiveLineCalendarView;
        this.J = textView4;
        this.K = textView5;
        this.L = nestedScrollView;
        this.M = linearLayout2;
        this.N = textView6;
        this.O = textView7;
        this.P = textView8;
        this.Q = weekBar;
    }
}
