package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.sleep.ui.SleepHealthBannerCardSetLayout;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oba extends ViewDataBinding {
    public final lbe A;
    public final jce B;
    public final jbe C;
    public final LinearLayout D;
    public final SleepHealthBannerCardSetLayout E;
    public final View F;
    public final RecyclerView G;
    public final xbe H;
    public final vbe I;
    public final View J;
    public final CardUnderstandView K;

    public oba(Object obj, View view, int i, lbe lbeVar, jce jceVar, jbe jbeVar, LinearLayout linearLayout, SleepHealthBannerCardSetLayout sleepHealthBannerCardSetLayout, View view2, RecyclerView recyclerView, xbe xbeVar, vbe vbeVar, View view3, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = lbeVar;
        this.B = jceVar;
        this.C = jbeVar;
        this.D = linearLayout;
        this.E = sleepHealthBannerCardSetLayout;
        this.F = view2;
        this.G = recyclerView;
        this.H = xbeVar;
        this.I = vbeVar;
        this.J = view3;
        this.K = cardUnderstandView;
    }
}
