package com.xiaomi.fitness.active.pk.ui.recyclerview.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.UserPkDetail;
import com.xiaomi.fitness.active.pk.util.PkBarChartUtil;
import com.xiaomi.fitness.active.pk.widget.PkBarChart;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ozi;
import defpackage.wqi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/PkUserHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "pkRecordDetail", "", "isBottom", "", "bindData", "(Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;Z)V", "Landroid/widget/TextView;", "tvDateRange", "Landroid/widget/TextView;", "tvOppScore", "tvOwnScore", "Landroid/widget/ImageView;", "ivOppWin", "Landroid/widget/ImageView;", "ivOwnWin", "tvOppNickName", "tvOwnNickName", "Lcom/xiaomi/fitness/active/pk/widget/PkBarChart;", "pkBarChart", "Lcom/xiaomi/fitness/active/pk/widget/PkBarChart;", "Landroid/view/View;", "bottomDivider", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkUserHistoryViewHolder extends RecyclerView.d0 {

    @NotNull
    private final View bottomDivider;

    @NotNull
    private final ImageView ivOppWin;

    @NotNull
    private final ImageView ivOwnWin;

    @NotNull
    private final PkBarChart pkBarChart;

    @NotNull
    private final TextView tvDateRange;

    @NotNull
    private final TextView tvOppNickName;

    @NotNull
    private final TextView tvOppScore;

    @NotNull
    private final TextView tvOwnNickName;

    @NotNull
    private final TextView tvOwnScore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkUserHistoryViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(wqi.T0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.tvDateRange = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(wqi.i1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.tvOppScore = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(wqi.o1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.tvOwnScore = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(wqi.N);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.ivOppWin = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(wqi.R);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.ivOwnWin = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(wqi.h1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.tvOppNickName = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(wqi.n1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.tvOwnNickName = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(wqi.v0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.pkBarChart = (PkBarChart) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(wqi.A);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.bottomDivider = viewFindViewById9;
    }

    public final void bindData(@Nullable PkRecordDetail pkRecordDetail, boolean isBottom) {
        String nickName;
        UserInfo userInfo;
        if (pkRecordDetail == null) {
            return;
        }
        long pkStartTime = pkRecordDetail.getPkStartTime();
        long pkEndTime = pkRecordDetail.getPkEndTime();
        String string = ResourceExtKt.getString(ozi.e);
        TextView textView = this.tvDateRange;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(pkStartTime, string), TimeDateUtil.getDateStr(pkEndTime - 1, string)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        UserPkDetail ownPkDetail = pkRecordDetail.getOwnPkDetail();
        long totalScore = oppPkDetail != null ? oppPkDetail.getTotalScore() : 0L;
        long totalScore2 = ownPkDetail != null ? ownPkDetail.getTotalScore() : 0L;
        this.tvOppScore.setText(String.valueOf(totalScore));
        this.tvOwnScore.setText(String.valueOf(totalScore2));
        if (totalScore2 == totalScore) {
            ViewExtKt.setVisible(this.ivOwnWin, false);
            ViewExtKt.setVisible(this.ivOppWin, false);
        } else {
            ViewExtKt.setVisible(this.ivOwnWin, totalScore2 > totalScore);
            ViewExtKt.setVisible(this.ivOppWin, totalScore > totalScore2);
        }
        this.tvOwnNickName.setText(ResourceExtKt.getString(ozi.G));
        TextView textView2 = this.tvOppNickName;
        if (oppPkDetail == null || (userInfo = oppPkDetail.getUserInfo()) == null || (nickName = userInfo.getNickName()) == null) {
            nickName = "--";
        }
        textView2.setText(nickName);
        PkBarChart.updateScoreList$default(this.pkBarChart, PkBarChartUtil.INSTANCE.convertPkRecordDetailToChartItem(pkRecordDetail), false, pkRecordDetail.getPkStartTime(), 2, null);
        ViewExtKt.setVisible(this.bottomDivider, !isBottom);
    }
}
