package com.xiaomi.fitness.active.pk.ui.recyclerview.holder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.PkScoreItem;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.UserPkDetail;
import com.xiaomi.fitness.active.pk.util.ImageUtils;
import com.xiaomi.fitness.active.pk.util.PkBarChartUtil;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.active.pk.widget.PkBarChart;
import com.xiaomi.fitness.active.pk.widget.PkScoreView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.ozi;
import defpackage.wqi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J$\u0010\b\u001a\u00020\u00072\u000b\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/PkProcessRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/active/pk/util/PkStatus;", "status", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "pkRecordDetail", "", "updateOwnAndOppSubtitle", "(ILcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;)V", "bindData", "(Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;)V", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "oppAvatar", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "ownAvatar", "Landroid/widget/TextView;", "oppNickName", "Landroid/widget/TextView;", "ownNickName", "oppSubTitle", "ownSubTitle", "Lcom/xiaomi/fitness/active/pk/widget/PkScoreView;", "pkScoreView", "Lcom/xiaomi/fitness/active/pk/widget/PkScoreView;", "Lcom/xiaomi/fitness/active/pk/widget/PkBarChart;", "pkBarChart", "Lcom/xiaomi/fitness/active/pk/widget/PkBarChart;", "tvPkSettleTime", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkProcessRecordViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "PkProcessRecordViewHolder";

    @NotNull
    private final RoundImageView oppAvatar;

    @NotNull
    private final TextView oppNickName;

    @NotNull
    private final TextView oppSubTitle;

    @NotNull
    private final RoundImageView ownAvatar;

    @NotNull
    private final TextView ownNickName;

    @NotNull
    private final TextView ownSubTitle;

    @NotNull
    private final PkBarChart pkBarChart;

    @NotNull
    private final PkScoreView pkScoreView;

    @NotNull
    private final TextView tvPkSettleTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkProcessRecordViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(wqi.K);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.oppAvatar = (RoundImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(wqi.O);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.ownAvatar = (RoundImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(wqi.h1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.oppNickName = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(wqi.n1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.ownNickName = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(wqi.j1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.oppSubTitle = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(wqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.ownSubTitle = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(wqi.z0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.pkScoreView = (PkScoreView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(wqi.v0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.pkBarChart = (PkBarChart) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(wqi.w1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.tvPkSettleTime = (TextView) viewFindViewById9;
    }

    private final void updateOwnAndOppSubtitle(int status, PkRecordDetail pkRecordDetail) {
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        UserPkDetail ownPkDetail = pkRecordDetail.getOwnPkDetail();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        long totalScore = ownPkDetail != null ? ownPkDetail.getTotalScore() : 0L;
        long totalScore2 = oppPkDetail != null ? oppPkDetail.getTotalScore() : 0L;
        if (status == 0) {
            this.ownSubTitle.setText("--");
            this.oppSubTitle.setText("--");
            return;
        }
        if (status == 2) {
            this.ownSubTitle.setText(ResourceExtKt.getString(ozi.Y));
            this.oppSubTitle.setText(ResourceExtKt.getString(ozi.Y));
            return;
        }
        if (status == 3) {
            this.ownSubTitle.setText(ResourceExtKt.getString(ozi.R));
            this.oppSubTitle.setText(ResourceExtKt.getString(ozi.R));
            return;
        }
        if (status == 4) {
            if (totalScore > totalScore2) {
                this.ownSubTitle.setText(ResourceExtKt.getString(ozi.b0));
                this.oppSubTitle.setText("");
                return;
            } else if (totalScore < totalScore2) {
                this.oppSubTitle.setText(ResourceExtKt.getString(ozi.b0));
                this.ownSubTitle.setText("");
                return;
            } else {
                this.ownSubTitle.setText(ResourceExtKt.getString(ozi.n));
                this.oppSubTitle.setText(ResourceExtKt.getString(ozi.n));
                return;
            }
        }
        PkBarChartUtil pkBarChartUtil = PkBarChartUtil.INSTANCE;
        Map<Long, PkScoreItem> mapConvertPkScoreListToMap = pkBarChartUtil.convertPkScoreListToMap(ownPkDetail != null ? ownPkDetail.getPkScoreList() : null);
        Map<Long, PkScoreItem> mapConvertPkScoreListToMap2 = pkBarChartUtil.convertPkScoreListToMap(oppPkDetail != null ? oppPkDetail.getPkScoreList() : null);
        PkScoreItem pkScoreItem = mapConvertPkScoreListToMap.get(Long.valueOf(jChangZeroOfTheDay));
        String string = ResourceExtKt.getString(ozi.Z, "0");
        if (pkScoreItem != null) {
            this.ownSubTitle.setText(ResourceExtKt.getString(ozi.Z, String.valueOf(pkScoreItem.getScore())));
        } else {
            this.ownSubTitle.setText(string);
        }
        PkScoreItem pkScoreItem2 = mapConvertPkScoreListToMap2.get(Long.valueOf(jChangZeroOfTheDay));
        if (pkScoreItem2 != null) {
            this.oppSubTitle.setText(ResourceExtKt.getString(ozi.Z, String.valueOf(pkScoreItem2.getScore())));
        } else {
            this.oppSubTitle.setText(string);
        }
    }

    public final void bindData(@NotNull PkRecordDetail pkRecordDetail) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(pkRecordDetail, "pkRecordDetail");
        PkLogger.INSTANCE.i(TAG, "bindData:" + pkRecordDetail, new Object[0]);
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        UserPkDetail ownPkDetail = pkRecordDetail.getOwnPkDetail();
        PkBarChartUtil pkBarChartUtil = PkBarChartUtil.INSTANCE;
        int pkStatus = pkBarChartUtil.getPkStatus(pkRecordDetail);
        this.pkBarChart.updateScoreList(pkBarChartUtil.convertPkRecordDetailToChartItem(pkRecordDetail), pkStatus == 0, pkRecordDetail.getPkStartTime());
        this.pkScoreView.setScore(ownPkDetail != null ? ownPkDetail.getTotalScore() : 0L, oppPkDetail != null ? oppPkDetail.getTotalScore() : 0L, pkStatus);
        UserInfo userInfo = oppPkDetail != null ? oppPkDetail.getUserInfo() : null;
        UserInfo userInfo2 = ownPkDetail != null ? ownPkDetail.getUserInfo() : null;
        ImageUtils imageUtils = ImageUtils.INSTANCE;
        imageUtils.loadAvatar(this.oppAvatar, userInfo != null ? userInfo.getIcon() : null);
        imageUtils.loadAvatar(this.ownAvatar, userInfo2 != null ? userInfo2.getIcon() : null);
        TextView textView = this.oppNickName;
        if (userInfo == null || (strValueOf = userInfo.getNickName()) == null) {
            strValueOf = String.valueOf(userInfo != null ? Long.valueOf(userInfo.getUserId()) : null);
        }
        textView.setText(strValueOf);
        this.ownNickName.setText(ResourceExtKt.getString(ozi.G));
        updateOwnAndOppSubtitle(pkStatus, pkRecordDetail);
        pkBarChartUtil.updatePkStatusTextView(this.tvPkSettleTime, pkStatus, pkRecordDetail);
    }
}
