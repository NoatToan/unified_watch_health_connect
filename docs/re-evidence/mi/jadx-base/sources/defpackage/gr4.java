package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.widget.CourseInfoHeaderPreView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingStartBtn;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gr4 extends ViewDataBinding {
    public final LinearLayout A;
    public final DividerView B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public final Group F;
    public final TextView G;
    public final CourseInfoHeaderPreView H;
    public final LinearLayout I;
    public final TextView J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final TextView M;
    public final TextView N;
    public final RecyclerView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TrainingStartBtn S;

    public gr4(Object obj, View view, int i, LinearLayout linearLayout, DividerView dividerView, TextView textView, LinearLayout linearLayout2, TextView textView2, Group group, TextView textView3, CourseInfoHeaderPreView courseInfoHeaderPreView, LinearLayout linearLayout3, TextView textView4, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView5, TextView textView6, RecyclerView recyclerView, TextView textView7, TextView textView8, TextView textView9, TrainingStartBtn trainingStartBtn) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = dividerView;
        this.C = textView;
        this.D = linearLayout2;
        this.E = textView2;
        this.F = group;
        this.G = textView3;
        this.H = courseInfoHeaderPreView;
        this.I = linearLayout3;
        this.J = textView4;
        this.K = linearLayout4;
        this.L = linearLayout5;
        this.M = textView5;
        this.N = textView6;
        this.O = recyclerView;
        this.P = textView7;
        this.Q = textView8;
        this.R = textView9;
        this.S = trainingStartBtn;
    }
}
