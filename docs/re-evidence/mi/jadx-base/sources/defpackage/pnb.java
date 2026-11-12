package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.CurseDataHolder;
import com.xiaomi.fitness.health.curse.view.CurseMoreView;
import com.xiaomi.fitness.health.curse.view.CurseNoticeCardView;
import com.xiaomi.fitness.health.curse.view.CurseResetCardView;
import com.xiaomi.fitness.health.curse.view.CurseSymptomHolder;
import com.xiaomi.fitness.health.curse.view.CurseTempViewHolder;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pnb extends ViewDataBinding {
    public final ConstraintLayout A;
    public final CurseTempViewHolder B;
    public final CurseDataHolder C;
    public final HealthBannerCardSetView D;
    public final CurseNoticeCardView E;
    public final CurseNoticeCardView F;
    public final CurseMoreView G;
    public final CurseNoticeCardView H;
    public final CurseResetCardView I;
    public final CurseResetCardView J;
    public final NestedScrollView K;
    public final CurseSymptomHolder L;

    public pnb(Object obj, View view, int i, ConstraintLayout constraintLayout, CurseTempViewHolder curseTempViewHolder, CurseDataHolder curseDataHolder, HealthBannerCardSetView healthBannerCardSetView, CurseNoticeCardView curseNoticeCardView, CurseNoticeCardView curseNoticeCardView2, CurseMoreView curseMoreView, CurseNoticeCardView curseNoticeCardView3, CurseResetCardView curseResetCardView, CurseResetCardView curseResetCardView2, NestedScrollView nestedScrollView, CurseSymptomHolder curseSymptomHolder) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = curseTempViewHolder;
        this.C = curseDataHolder;
        this.D = healthBannerCardSetView;
        this.E = curseNoticeCardView;
        this.F = curseNoticeCardView2;
        this.G = curseMoreView;
        this.H = curseNoticeCardView3;
        this.I = curseResetCardView;
        this.J = curseResetCardView2;
        this.K = nestedScrollView;
        this.L = curseSymptomHolder;
    }
}
