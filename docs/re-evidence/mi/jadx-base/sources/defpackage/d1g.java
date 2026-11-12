package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.view.MultipleStyleBannerView;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.vip.MineVipView;
import com.xiaomi.fitness.mine.widget.MedalEntranceView;
import com.xiaomi.fitness.mine.widget.MineActivePKPlayChannelView;
import com.xiaomi.fitness.mine.widget.MineActivePKView;
import com.xiaomi.fitness.mine.widget.MineAssetsView;
import com.xiaomi.fitness.mine.widget.MineHabitView;
import com.xiaomi.fitness.mine.widget.MineUserInfoView;
import com.xiaomi.fitness.mine.widget.MineWeekReportView;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d1g extends ViewDataBinding {
    public final MineActivePKView A;
    public final View B;
    public final RightArrowBindingSingleLineTextView C;
    public final RecyclerView D;
    public final ConstraintLayout E;
    public final MultipleStyleBannerView F;
    public final MineAssetsView G;
    public final MineHabitView H;
    public final MineUserInfoView I;
    public final MedalEntranceView J;
    public final ConstraintLayout K;
    public final View L;
    public final ConstraintLayout M;
    public final HomeHeaderTabTitleView N;
    public final TextView O;
    public final MineActivePKPlayChannelView P;
    public final LinearLayoutCompat Q;
    public final NestedScrollView R;
    public final SpringBackLayout S;
    public final MineVipView T;
    public final MineWeekReportView U;
    public MineV4ViewModel V;

    public d1g(Object obj, View view, int i, MineActivePKView mineActivePKView, View view2, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, RecyclerView recyclerView, ConstraintLayout constraintLayout, MultipleStyleBannerView multipleStyleBannerView, MineAssetsView mineAssetsView, MineHabitView mineHabitView, MineUserInfoView mineUserInfoView, MedalEntranceView medalEntranceView, ConstraintLayout constraintLayout2, View view3, ConstraintLayout constraintLayout3, HomeHeaderTabTitleView homeHeaderTabTitleView, TextView textView, MineActivePKPlayChannelView mineActivePKPlayChannelView, LinearLayoutCompat linearLayoutCompat, NestedScrollView nestedScrollView, SpringBackLayout springBackLayout, MineVipView mineVipView, MineWeekReportView mineWeekReportView) {
        super(obj, view, i);
        this.A = mineActivePKView;
        this.B = view2;
        this.C = rightArrowBindingSingleLineTextView;
        this.D = recyclerView;
        this.E = constraintLayout;
        this.F = multipleStyleBannerView;
        this.G = mineAssetsView;
        this.H = mineHabitView;
        this.I = mineUserInfoView;
        this.J = medalEntranceView;
        this.K = constraintLayout2;
        this.L = view3;
        this.M = constraintLayout3;
        this.N = homeHeaderTabTitleView;
        this.O = textView;
        this.P = mineActivePKPlayChannelView;
        this.Q = linearLayoutCompat;
        this.R = nestedScrollView;
        this.S = springBackLayout;
        this.T = mineVipView;
        this.U = mineWeekReportView;
    }
}
