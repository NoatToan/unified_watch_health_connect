package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.SleepBloodSugarData;
import com.xiaomi.fit.fitness.export.data.aggregation.SportBloodSugarData;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseAGPDetailHolder;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseLevelDetailHolder;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseSleepAdapter;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseSportAdapter;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseDayDetailViewHolder;
import com.xiaomi.fitness.health.sleep.ui.SleepFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.CollapsiblePanel;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.ni4;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b0\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u0018\u0010,\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseDayDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "", "initViewAndHolder", "(Landroid/view/View;)V", "titleView", "initBloodGlucoseSport", "initBloodGlucoseSleep", "Landroid/content/Context;", "context", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "data", "bindData", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "bindGMIAndAGP", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;)V", "Lcom/xiaomi/fitness/view/CollapsiblePanel;", "mCollapsiblePanel", "Lcom/xiaomi/fitness/view/CollapsiblePanel;", "Landroid/widget/TextView;", "mBtnPanelControl", "Landroid/widget/TextView;", "mBottomDivider", "Landroid/view/View;", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSportAdapter;", "mBloodGlucoseSportHolder", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSportAdapter;", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseLevelDetailHolder;", "mBloodGlucoseLevelDetailHolder", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseLevelDetailHolder;", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSleepAdapter;", "mBloodGlucoseSleepHolder", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSleepAdapter;", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseAGPDetailHolder;", "mBloodGlucoseAGPDetailHolder", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseAGPDetailHolder;", "mContext", "Landroid/content/Context;", "mLevelView", "mSleepView", "mSportView", "mAGPView", "", "mReportSleepTime", "J", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseDayDetailViewHolder extends RecyclerView.d0 {

    @Nullable
    private View mAGPView;

    @Nullable
    private BloodGlucoseAGPDetailHolder mBloodGlucoseAGPDetailHolder;

    @Nullable
    private BloodGlucoseLevelDetailHolder mBloodGlucoseLevelDetailHolder;

    @Nullable
    private BloodGlucoseSleepAdapter mBloodGlucoseSleepHolder;

    @Nullable
    private BloodGlucoseSportAdapter mBloodGlucoseSportHolder;

    @Nullable
    private View mBottomDivider;

    @Nullable
    private TextView mBtnPanelControl;

    @Nullable
    private CollapsiblePanel mCollapsiblePanel;

    @Nullable
    private Context mContext;

    @Nullable
    private View mLevelView;
    private long mReportSleepTime;

    @Nullable
    private View mSleepView;

    @Nullable
    private View mSportView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodGlucoseDayDetailViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.mReportSleepTime = TimeDateUtil.changZeroOfTheDay(System.currentTimeMillis() / ((long) 1000));
        initViewAndHolder(itemView);
    }

    private final void initBloodGlucoseSleep(View titleView) {
        View viewFindViewById = titleView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) titleView.findViewById(eri.Bl);
        CollapsiblePanel collapsiblePanel = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel);
        ((AppCompatImageView) viewFindViewById).setBackgroundDrawable(ni4.e(collapsiblePanel.getContext(), pni.V));
        View viewFindViewById2 = titleView.findViewById(eri.W);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: yw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseDayDetailViewHolder.initBloodGlucoseSleep$lambda$1(this.f40632a, view);
            }
        });
        CollapsiblePanel collapsiblePanel2 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel2);
        textView.setText(collapsiblePanel2.getContext().getString(c0j.Z0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBloodGlucoseSleep$lambda$1(BloodGlucoseDayDetailViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(this$0.mReportSleepTime));
        HealthUtil.INSTANCE.gotoPage(this$0.mContext, SleepFragment.class, bundle, null);
    }

    private final void initBloodGlucoseSport(View titleView) {
        View viewFindViewById = titleView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) titleView.findViewById(eri.Bl);
        CollapsiblePanel collapsiblePanel = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel);
        ((AppCompatImageView) viewFindViewById).setBackgroundDrawable(ni4.e(collapsiblePanel.getContext(), pni.C3));
        CollapsiblePanel collapsiblePanel2 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel2);
        textView.setText(collapsiblePanel2.getContext().getString(c0j.c1));
    }

    private final void initViewAndHolder(View itemView) {
        this.mCollapsiblePanel = (CollapsiblePanel) itemView.findViewById(eri.F0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(itemView.getContext());
        View viewInflate = layoutInflaterFrom.inflate(jui.J2, (ViewGroup) this.mCollapsiblePanel, false);
        View viewInflate2 = layoutInflaterFrom.inflate(jui.E7, (ViewGroup) this.mCollapsiblePanel, false);
        Intrinsics.checkNotNull(viewInflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate2;
        this.mBtnPanelControl = (TextView) linearLayout.findViewById(eri.d1);
        View viewFindViewById = linearLayout.findViewById(eri.X3);
        this.mBottomDivider = viewFindViewById;
        if (viewFindViewById != null) {
            ViewExtKt.setVisible(viewFindViewById, false);
        }
        TextView textView = this.mBtnPanelControl;
        Intrinsics.checkNotNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: zw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseDayDetailViewHolder.initViewAndHolder$lambda$0(this.f41739a, view);
            }
        });
        CollapsiblePanel collapsiblePanel = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel);
        collapsiblePanel.e(viewInflate);
        CollapsiblePanel collapsiblePanel2 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel2);
        collapsiblePanel2.setBottomView(linearLayout);
        CollapsiblePanel collapsiblePanel3 = this.mCollapsiblePanel;
        this.mLevelView = collapsiblePanel3 != null ? collapsiblePanel3.findViewById(eri.A0) : null;
        CollapsiblePanel collapsiblePanel4 = this.mCollapsiblePanel;
        this.mSleepView = collapsiblePanel4 != null ? collapsiblePanel4.findViewById(eri.B0) : null;
        CollapsiblePanel collapsiblePanel5 = this.mCollapsiblePanel;
        this.mSportView = collapsiblePanel5 != null ? collapsiblePanel5.findViewById(eri.D0) : null;
        CollapsiblePanel collapsiblePanel6 = this.mCollapsiblePanel;
        this.mAGPView = collapsiblePanel6 != null ? collapsiblePanel6.findViewById(eri.y0) : null;
        CollapsiblePanel collapsiblePanel7 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel7);
        this.mBloodGlucoseLevelDetailHolder = new BloodGlucoseLevelDetailHolder(collapsiblePanel7);
        CollapsiblePanel collapsiblePanel8 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel8);
        RecyclerView recyclerView = (RecyclerView) collapsiblePanel8.findViewById(eri.M0);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        CollapsiblePanel collapsiblePanel9 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel9);
        Context context = collapsiblePanel9.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mBloodGlucoseSportHolder = new BloodGlucoseSportAdapter(context);
        CollapsiblePanel collapsiblePanel10 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel10);
        View viewFindViewById2 = collapsiblePanel10.findViewById(eri.D0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CollapsiblePanel collapsiblePanel11 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel11);
        View viewFindViewById3 = collapsiblePanel11.findViewById(eri.B0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        initBloodGlucoseSport(viewFindViewById2);
        initBloodGlucoseSleep(viewFindViewById3);
        recyclerView.setAdapter(this.mBloodGlucoseSportHolder);
        CollapsiblePanel collapsiblePanel12 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel12);
        RecyclerView recyclerView2 = (RecyclerView) collapsiblePanel12.findViewById(eri.L0);
        recyclerView2.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        CollapsiblePanel collapsiblePanel13 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel13);
        Context context2 = collapsiblePanel13.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        BloodGlucoseSleepAdapter bloodGlucoseSleepAdapter = new BloodGlucoseSleepAdapter(context2);
        this.mBloodGlucoseSleepHolder = bloodGlucoseSleepAdapter;
        recyclerView2.setAdapter(bloodGlucoseSleepAdapter);
        CollapsiblePanel collapsiblePanel14 = this.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel14);
        this.mBloodGlucoseAGPDetailHolder = new BloodGlucoseAGPDetailHolder(collapsiblePanel14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewAndHolder$lambda$0(BloodGlucoseDayDetailViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CollapsiblePanel collapsiblePanel = this$0.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel);
        if (collapsiblePanel.j()) {
            CollapsiblePanel collapsiblePanel2 = this$0.mCollapsiblePanel;
            Intrinsics.checkNotNull(collapsiblePanel2);
            collapsiblePanel2.k();
            TextView textView = this$0.mBtnPanelControl;
            Intrinsics.checkNotNull(textView);
            textView.setText(c0j.r5);
            return;
        }
        CollapsiblePanel collapsiblePanel3 = this$0.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel3);
        LinearLayout linearLayout = (LinearLayout) collapsiblePanel3.findViewById(eri.G0);
        if (linearLayout.getMeasuredHeight() != 0) {
            CollapsiblePanel collapsiblePanel4 = this$0.mCollapsiblePanel;
            Intrinsics.checkNotNull(collapsiblePanel4);
            collapsiblePanel4.setViewHeight(linearLayout.getMeasuredHeight());
        }
        CollapsiblePanel collapsiblePanel5 = this$0.mCollapsiblePanel;
        Intrinsics.checkNotNull(collapsiblePanel5);
        collapsiblePanel5.f();
        TextView textView2 = this$0.mBtnPanelControl;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(c0j.q5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0060  */
    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    public final void bindData(@NotNull Context context, @NotNull DailyBloodSugarReport data) {
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.mContext = context;
        if (data.getSleepDataList() != null) {
            List<SleepBloodSugarData> sleepDataList = data.getSleepDataList();
            Intrinsics.checkNotNull(sleepDataList);
            if (!sleepDataList.isEmpty()) {
                View view2 = this.mSleepView;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                List<SleepBloodSugarData> sleepDataList2 = data.getSleepDataList();
                Intrinsics.checkNotNull(sleepDataList2);
                this.mReportSleepTime = TimeDateUtil.changZeroOfTheDay(sleepDataList2.get(0).getSleepReport().getTimestamp());
                BloodGlucoseSleepAdapter bloodGlucoseSleepAdapter = this.mBloodGlucoseSleepHolder;
                Intrinsics.checkNotNull(bloodGlucoseSleepAdapter);
                List<SleepBloodSugarData> sleepDataList3 = data.getSleepDataList();
                Intrinsics.checkNotNull(sleepDataList3);
                bloodGlucoseSleepAdapter.setDataList(sleepDataList3);
                BloodGlucoseSleepAdapter bloodGlucoseSleepAdapter2 = this.mBloodGlucoseSleepHolder;
                Intrinsics.checkNotNull(bloodGlucoseSleepAdapter2);
                bloodGlucoseSleepAdapter2.notifyDataSetChanged();
            } else {
                view = this.mSleepView;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        } else {
            view = this.mSleepView;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (data.getSportDataList() == null) {
            View view3 = this.mSportView;
            if (view3 != null) {
                view3.setVisibility(8);
                return;
            }
            return;
        }
        View view4 = this.mSportView;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        BloodGlucoseSportAdapter bloodGlucoseSportAdapter = this.mBloodGlucoseSportHolder;
        Intrinsics.checkNotNull(bloodGlucoseSportAdapter);
        List<SportBloodSugarData> sportDataList = data.getSportDataList();
        Intrinsics.checkNotNull(sportDataList);
        bloodGlucoseSportAdapter.setDataList(sportDataList);
        BloodGlucoseSportAdapter bloodGlucoseSportAdapter2 = this.mBloodGlucoseSportHolder;
        Intrinsics.checkNotNull(bloodGlucoseSportAdapter2);
        bloodGlucoseSportAdapter2.notifyDataSetChanged();
    }

    public final void bindGMIAndAGP(@NotNull Context context, @Nullable BloodSugarGMIAndAGPResult data) {
        Intrinsics.checkNotNullParameter(context, "context");
        BloodGlucoseLevelDetailHolder bloodGlucoseLevelDetailHolder = this.mBloodGlucoseLevelDetailHolder;
        Intrinsics.checkNotNull(bloodGlucoseLevelDetailHolder);
        bloodGlucoseLevelDetailHolder.bindData(data);
        BloodGlucoseAGPDetailHolder bloodGlucoseAGPDetailHolder = this.mBloodGlucoseAGPDetailHolder;
        Intrinsics.checkNotNull(bloodGlucoseAGPDetailHolder);
        bloodGlucoseAGPDetailHolder.bindData(context, data);
    }
}
