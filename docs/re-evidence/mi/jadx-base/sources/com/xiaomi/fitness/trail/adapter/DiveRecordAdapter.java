package com.xiaomi.fitness.trail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.SportRecordExKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.trail.adapter.DiveRecordAdapter;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.jp5;
import defpackage.kp5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u001b\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b)\u0010*J'\u0010\b\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkotlin/Function2;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Landroid/view/View;", "", "longClickListener", "setLongClickListener", "(Lkotlin/jvm/functions/Function2;)V", "", "sportList", "", "", "", "divingDetailMap", "updateData", "(Ljava/util/List;Ljava/util/Map;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function1;", "onItemClick", "Lkotlin/jvm/functions/Function1;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "", "mSportReportList", "Ljava/util/List;", "mDivePointDetailMap", "Ljava/util/Map;", "mLongClickListener", "Lkotlin/jvm/functions/Function2;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "DiveItemHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DiveRecordAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @Nullable
    private Map<Integer, String> mDivePointDetailMap;

    @Nullable
    private Function2<? super SportBasicReport, ? super View, Unit> mLongClickListener;

    @NotNull
    private final List<SportBasicReport> mSportReportList;

    @NotNull
    private final Function1<SportBasicReport, Unit> onItemClick;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter$DiveItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "uiSportType", "convertDivingSportType", "(I)I", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicReport", "", "divingPointName", "", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "iconIv", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "sportNameTv", "Landroid/widget/TextView;", "maxDepthTv", "divingPointTv", "dateTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/trail/adapter/DiveRecordAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DiveItemHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView dateTv;

        @NotNull
        private final TextView divingPointTv;

        @NotNull
        private final ImageView iconIv;

        @NotNull
        private final TextView maxDepthTv;

        @NotNull
        private final TextView sportNameTv;
        final /* synthetic */ DiveRecordAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiveItemHolder(@NotNull DiveRecordAdapter diveRecordAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = diveRecordAdapter;
            View viewFindViewById = itemView.findViewById(bsi.T6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.iconIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.V6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.sportNameTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bsi.g4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.maxDepthTv = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(bsi.F1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.divingPointTv = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(bsi.f1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.dateTv = (TextView) viewFindViewById5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(DiveRecordAdapter this$0, SportBasicReport basicReport, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.getOnItemClick().invoke2(basicReport);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bindData$lambda$1(DiveRecordAdapter this$0, SportBasicReport basicReport, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
            Function2 function2 = this$0.mLongClickListener;
            if (function2 == null) {
                return true;
            }
            Intrinsics.checkNotNull(view);
            function2.invoke(basicReport, view);
            return true;
        }

        private final int convertDivingSportType(int uiSportType) {
            switch (uiSportType) {
                case 116:
                default:
                    return SportReportBaseParser.ReportType.avgDivingDepth;
                case 117:
                    return SportReportBaseParser.ReportType.avgAscentRate;
                case 118:
                    return SportReportBaseParser.ReportType.avgDescentRate;
            }
        }

        public final void bindData(@NotNull final SportBasicReport basicReport, @Nullable String divingPointName) {
            Intrinsics.checkNotNullParameter(basicReport, "basicReport");
            kp5 kp5VarA = jp5.c().a(convertDivingSportType(basicReport.getSportType()));
            this.sportNameTv.setText(kp5VarA.f24128b);
            this.iconIv.setImageResource(kp5VarA.c);
            String string = ApplicationExtKt.getApplication().getString(j1j.I1);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.maxDepthTv.setText(SportRecordExKt.buildSpanWithUnit$default(basicReport.getMaxDivingDepth() + string, string, 0.0f, 4, null));
            this.divingPointTv.setText(divingPointName);
            this.dateTv.setText(TimeDateUtil.getDateYYYYMMddLocalFormat(basicReport.getTimeStamp() * ((long) 1000)));
            View view = this.itemView;
            final DiveRecordAdapter diveRecordAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: i07
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DiveRecordAdapter.DiveItemHolder.bindData$lambda$0(diveRecordAdapter, basicReport, (View) obj);
                }
            }, 1, null);
            View view2 = this.itemView;
            final DiveRecordAdapter diveRecordAdapter2 = this.this$0;
            view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: j07
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view3) {
                    return DiveRecordAdapter.DiveItemHolder.bindData$lambda$1(diveRecordAdapter2, basicReport, view3);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiveRecordAdapter(@NotNull Function1<? super SportBasicReport, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.onItemClick = onItemClick;
        this.mSportReportList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mSportReportList.size();
    }

    @NotNull
    public final Function1<SportBasicReport, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        String string;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof DiveItemHolder) {
            SportBasicReport sportBasicReport = this.mSportReportList.get(position);
            Map<Integer, String> map = this.mDivePointDetailMap;
            if (map == null || (string = map.get(sportBasicReport.getDivingAreaId())) == null) {
                string = ResourceExtKt.getString(j1j.Aa);
            }
            ((DiveItemHolder) holder).bindData(sportBasicReport, string);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.T1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new DiveItemHolder(this, viewInflate);
    }

    public final void setLongClickListener(@NotNull Function2<? super SportBasicReport, ? super View, Unit> longClickListener) {
        Intrinsics.checkNotNullParameter(longClickListener, "longClickListener");
        this.mLongClickListener = longClickListener;
    }

    public final void updateData(@NotNull List<SportBasicReport> sportList, @Nullable Map<Integer, String> divingDetailMap) {
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        this.mSportReportList.clear();
        this.mSportReportList.addAll(sportList);
        this.mDivePointDetailMap = divingDetailMap;
        notifyDataSetChanged();
    }
}
