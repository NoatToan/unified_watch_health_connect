package com.xiaomi.fitness.trail.holder;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.SportRecordExKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.trail.adapter.DiveRecordAdapter;
import com.xiaomi.fitness.trail.adapter.TwoColumnGridLayoutItemDecoration;
import com.xiaomi.fitness.trail.adapter.VerticalListItemDecoration;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.trail.holder.DivingTotalHolder;
import defpackage.byi;
import defpackage.lp5;
import defpackage.mrp;
import defpackage.orp;
import defpackage.pz9;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004JQ\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0019\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u00108\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/trail/holder/DivingTotalHolder;", "", "", "isFoldableDeviceAndExpandedState", "()Z", "", "accumulativeDivingCount", "", "maxDepth", "visitedRegionsCount", "visitedDivingPointCount", "", "mostFreqVisitedDPName", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Lkotlin/Function1;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "deleteCallback", "initHolder", "(IFIILjava/lang/String;Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function1;)V", "", "reportList", "", "divingDetailMap", "refreshAdapterData", "(Ljava/util/List;Ljava/util/Map;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lmrp;", "mBinding", "Lmrp;", "getMBinding", "()Lmrp;", "Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter;", "adapter", "Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lorp;", "statisticalCard", "Lorp;", "Landroid/widget/TextView;", "accumulativeTimesTv", "Landroid/widget/TextView;", "maxDepthTv", "visitedCountryOrRegionCountTv", "visitedDivingPointCountTv", "mostFreqVisitedDivingPointTv", "<init>", "(Landroid/content/Context;Lmrp;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DivingTotalHolder {

    @NotNull
    public static final String TAG = "DivingTotalHolder";

    @NotNull
    private final TextView accumulativeTimesTv;

    @Nullable
    private DiveRecordAdapter adapter;

    @NotNull
    private final Context context;

    @NotNull
    private final mrp mBinding;

    @NotNull
    private final TextView maxDepthTv;

    @NotNull
    private final TextView mostFreqVisitedDivingPointTv;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final orp statisticalCard;

    @NotNull
    private final TextView visitedCountryOrRegionCountTv;

    @NotNull
    private final TextView visitedDivingPointCountTv;

    public DivingTotalHolder(@NotNull Context context, @NotNull mrp mBinding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        this.context = context;
        this.mBinding = mBinding;
        RecyclerView divingRecycler = mBinding.B;
        Intrinsics.checkNotNullExpressionValue(divingRecycler, "divingRecycler");
        this.recyclerView = divingRecycler;
        orp divingStatisticsCard = mBinding.C;
        Intrinsics.checkNotNullExpressionValue(divingStatisticsCard, "divingStatisticsCard");
        this.statisticalCard = divingStatisticsCard;
        TextView accumulativeTimesValue = divingStatisticsCard.C;
        Intrinsics.checkNotNullExpressionValue(accumulativeTimesValue, "accumulativeTimesValue");
        this.accumulativeTimesTv = accumulativeTimesValue;
        TextView maxDepthValue = divingStatisticsCard.G;
        Intrinsics.checkNotNullExpressionValue(maxDepthValue, "maxDepthValue");
        this.maxDepthTv = maxDepthValue;
        TextView visitedRegionValue = divingStatisticsCard.R;
        Intrinsics.checkNotNullExpressionValue(visitedRegionValue, "visitedRegionValue");
        this.visitedCountryOrRegionCountTv = visitedRegionValue;
        TextView visitedDivingPointCountValue = divingStatisticsCard.O;
        Intrinsics.checkNotNullExpressionValue(visitedDivingPointCountValue, "visitedDivingPointCountValue");
        this.visitedDivingPointCountTv = visitedDivingPointCountValue;
        TextView mostFrequentDivingPointValue = divingStatisticsCard.I;
        Intrinsics.checkNotNullExpressionValue(mostFrequentDivingPointValue, "mostFrequentDivingPointValue");
        this.mostFreqVisitedDivingPointTv = mostFrequentDivingPointValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$1(DivingTotalHolder this$0, SportBasicReport it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", it.getTimeStamp());
        bundle.putSerializable("sport_report", it);
        bundle.putInt("sport_type", lp5.a(it));
        bundle.putString("sport_source", "workout_list_page");
        SportRecordApiKt.getSportRecordApi().goSportDetail(this$0.context, bundle, (ActivityOptions) null, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$3(FragmentActivity fragment, final Function1 deleteCallback, final SportBasicReport record, View view) {
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        Intrinsics.checkNotNullParameter(deleteCallback, "$deleteCallback");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(view, "view");
        SportRecordExKt.showDeletePopupWindow(view, fragment, new Function0() { // from class: n07
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DivingTotalHolder.initHolder$lambda$3$lambda$2(deleteCallback, record);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$3$lambda$2(Function1 deleteCallback, SportBasicReport record) {
        Intrinsics.checkNotNullParameter(deleteCallback, "$deleteCallback");
        Intrinsics.checkNotNullParameter(record, "$record");
        deleteCallback.invoke2(record);
        return Unit.INSTANCE;
    }

    private final boolean isFoldableDeviceAndExpandedState() {
        return SystemProperties.INSTANCE.isFoldDisplay() && !pz9.b(this.context);
    }

    @Nullable
    public final DiveRecordAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final mrp getMBinding() {
        return this.mBinding;
    }

    public final void initHolder(int accumulativeDivingCount, float maxDepth, int visitedRegionsCount, int visitedDivingPointCount, @NotNull String mostFreqVisitedDPName, @NotNull final FragmentActivity fragment, @NotNull final Function1<? super SportBasicReport, Unit> deleteCallback) {
        Intrinsics.checkNotNullParameter(mostFreqVisitedDPName, "mostFreqVisitedDPName");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(deleteCallback, "deleteCallback");
        String quantityString = this.context.getResources().getQuantityString(byi.common_unit_rowing_machine_count, accumulativeDivingCount);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        this.accumulativeTimesTv.setText(SportRecordExKt.buildSpanWithUnit$default(accumulativeDivingCount + quantityString, quantityString, 0.0f, 4, null));
        int i = (int) maxDepth;
        String quantityString2 = this.context.getResources().getQuantityString(byi.common_unit_meter_desc_new, i, Float.valueOf(maxDepth));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        String quantityString3 = this.context.getResources().getQuantityString(byi.a0, i);
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        this.maxDepthTv.setText(SportRecordExKt.buildSpanWithUnit$default(quantityString2, quantityString3, 0.0f, 4, null));
        String quantityString4 = this.context.getResources().getQuantityString(byi.q, 3);
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        String quantityString5 = this.context.getResources().getQuantityString(byi.p, visitedRegionsCount, Integer.valueOf(visitedRegionsCount));
        Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
        this.visitedCountryOrRegionCountTv.setText(SportRecordExKt.buildSpanWithUnit$default(quantityString5, quantityString4, 0.0f, 4, null));
        String quantityString6 = this.context.getResources().getQuantityString(byi.q, visitedDivingPointCount);
        Intrinsics.checkNotNullExpressionValue(quantityString6, "getQuantityString(...)");
        String quantityString7 = this.context.getResources().getQuantityString(byi.p, visitedDivingPointCount, Integer.valueOf(visitedDivingPointCount));
        Intrinsics.checkNotNullExpressionValue(quantityString7, "getQuantityString(...)");
        this.visitedDivingPointCountTv.setText(SportRecordExKt.buildSpanWithUnit$default(quantityString7, quantityString6, 0.0f, 4, null));
        this.mostFreqVisitedDivingPointTv.setText(mostFreqVisitedDPName);
        int i2 = isFoldableDeviceAndExpandedState() ? 2 : 1;
        this.recyclerView.setLayoutManager(new GridLayoutManager(this.context, i2));
        while (this.recyclerView.getItemDecorationCount() > 0) {
            this.recyclerView.removeItemDecorationAt(0);
        }
        this.recyclerView.addItemDecoration(new VerticalListItemDecoration(ExtUtilsKt.getDp(12)));
        if (i2 == 2) {
            this.recyclerView.addItemDecoration(new TwoColumnGridLayoutItemDecoration(ExtUtilsKt.getDp(6)));
        }
        DiveRecordAdapter diveRecordAdapter = new DiveRecordAdapter(new Function1() { // from class: o07
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DivingTotalHolder.initHolder$lambda$1(this.f28604a, (SportBasicReport) obj);
            }
        });
        this.adapter = diveRecordAdapter;
        diveRecordAdapter.setLongClickListener(new Function2() { // from class: p07
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DivingTotalHolder.initHolder$lambda$3(fragment, deleteCallback, (SportBasicReport) obj, (View) obj2);
            }
        });
        this.recyclerView.setAdapter(this.adapter);
    }

    public final void refreshAdapterData(@NotNull List<SportBasicReport> reportList, @Nullable Map<Integer, String> divingDetailMap) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        DiveRecordAdapter diveRecordAdapter = this.adapter;
        if (diveRecordAdapter != null) {
            diveRecordAdapter.updateData(reportList, divingDetailMap);
        }
    }

    public final void setAdapter(@Nullable DiveRecordAdapter diveRecordAdapter) {
        this.adapter = diveRecordAdapter;
    }
}
