package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.axb;
import defpackage.c0j;
import defpackage.iji;
import defpackage.pni;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepShortSegmentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "report", "", "preViewType", "afterViewType", "", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/view/View;", "parentView", "Landroid/view/View;", "topTitleLayout", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "durationView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "splitLintView", "Landroid/widget/TextView;", "tvTimeRange", "Landroid/widget/TextView;", "tvOrigin", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Laxb;", "binding", "<init>", "(Laxb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepShortSegmentViewHolder extends RecyclerView.d0 {

    @NotNull
    private final DurationTextView durationView;

    @NotNull
    private final Context mContext;

    @NotNull
    private final View parentView;

    @NotNull
    private final View splitLintView;

    @NotNull
    private final View topTitleLayout;

    @NotNull
    private final TextView tvOrigin;

    @NotNull
    private final TextView tvTimeRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepShortSegmentViewHolder(@NotNull axb binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout llParent = binding.C;
        Intrinsics.checkNotNullExpressionValue(llParent, "llParent");
        this.parentView = llParent;
        LinearLayout llTopTitle = binding.D;
        Intrinsics.checkNotNullExpressionValue(llTopTitle, "llTopTitle");
        this.topTitleLayout = llTopTitle;
        DurationTextView durationView = binding.A;
        Intrinsics.checkNotNullExpressionValue(durationView, "durationView");
        this.durationView = durationView;
        View splitLineView = binding.E;
        Intrinsics.checkNotNullExpressionValue(splitLineView, "splitLineView");
        this.splitLintView = splitLineView;
        TextView tvTimeRange = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvTimeRange, "tvTimeRange");
        this.tvTimeRange = tvTimeRange;
        TextView tvOrigin = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvOrigin, "tvOrigin");
        this.tvOrigin = tvOrigin;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
    }

    public final void bindData(@NotNull SleepSegmentReport report, @Nullable Integer preViewType, @Nullable Integer afterViewType) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String name;
        Intrinsics.checkNotNullParameter(report, "report");
        Logger.i("SleepShortSegmentViewHolder", "bindData :" + report);
        boolean z = preViewType != null && preViewType.intValue() == 2;
        boolean z2 = afterViewType != null && afterViewType.intValue() == 2;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.parentView.getLayoutParams();
        if (z && z2) {
            ViewExtKt.setVisible(this.topTitleLayout, false);
            ViewExtKt.setVisible(this.splitLintView, true);
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = ExtUtilsKt.getDp(0);
            }
            ViewGroup.LayoutParams layoutParams = this.tvOrigin.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = ExtUtilsKt.getDp(12);
            }
            this.parentView.setBackgroundColor(this.mContext.getColor(iji.m));
        } else if (z) {
            ViewExtKt.setVisible(this.topTitleLayout, false);
            ViewExtKt.setVisible(this.splitLintView, true);
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = ExtUtilsKt.getDp(0);
            }
            ViewGroup.LayoutParams layoutParams2 = this.tvOrigin.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = ExtUtilsKt.getDp(21);
            }
            this.parentView.setBackgroundResource(pni.P2);
        } else if (z2) {
            ViewExtKt.setVisible(this.topTitleLayout, true);
            ViewExtKt.setVisible(this.splitLintView, false);
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = ExtUtilsKt.getDp(12);
            }
            ViewGroup.LayoutParams layoutParams3 = this.tvOrigin.getLayoutParams();
            marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = ExtUtilsKt.getDp(12);
            }
            this.parentView.setBackgroundResource(pni.Q2);
        } else {
            ViewExtKt.setVisible(this.topTitleLayout, true);
            ViewExtKt.setVisible(this.splitLintView, false);
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = ExtUtilsKt.getDp(12);
            }
            ViewGroup.LayoutParams layoutParams4 = this.tvOrigin.getLayoutParams();
            marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = ExtUtilsKt.getDp(21);
            }
            this.parentView.setBackgroundResource(pni.N2);
        }
        this.durationView.setDuration(TimeUnit.MINUTES.toMillis(report.getSleepDuration()));
        String sid = report.getSid();
        String string = "--";
        if (sid != null && !StringsKt__StringsKt.isBlank(sid)) {
            if (Intrinsics.areEqual(report.getSid(), "xiaomiwear_app_manually")) {
                string = this.mContext.getString(c0j.D);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                String sid2 = report.getSid();
                Intrinsics.checkNotNull(sid2);
                DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid2);
                if (deviceInfoInAll != null && (name = deviceInfoInAll.getName()) != null) {
                    string = name;
                }
            }
        }
        this.tvOrigin.setText(this.mContext.getString(c0j.Ze, string));
        this.tvTimeRange.setText(SleepExtKt.getSleepTimeRangeStr(this.mContext, report.getBedTime(), report.getWakeupTime()));
    }
}
