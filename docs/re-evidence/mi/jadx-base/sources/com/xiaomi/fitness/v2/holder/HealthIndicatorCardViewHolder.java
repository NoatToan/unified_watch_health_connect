package com.xiaomi.fitness.v2.holder;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.HealthAdapterV2;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;
import defpackage.c0j;
import defpackage.hz2;
import defpackage.iji;
import defpackage.km5;
import defpackage.kp5;
import defpackage.l2c;
import defpackage.nf2;
import defpackage.oxb;
import defpackage.pz2;
import defpackage.ul5;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\u00060*j\u0002`+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/v2/holder/HealthIndicatorCardViewHolder;", "Lnf2;", "Lkm5;", "dataModel", "", "updateAxisView", "(Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "isValidReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showEmpty", "showRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "showBloodPressureReport", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "showSleepReport", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "updateBindData", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Loxb;", "binding", "Loxb;", "getBinding", "()Loxb;", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "cardTitleView", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "levelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "Landroidx/appcompat/widget/AppCompatImageView;", "emptyView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "talkback", "Ljava/lang/StringBuilder;", "<init>", "(Landroid/content/Context;Loxb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthIndicatorCardViewHolder extends nf2 {

    @NotNull
    private final oxb binding;

    @NotNull
    private final HomeCardCommonTitleView cardTitleView;

    @NotNull
    private final Context context;

    @NotNull
    private final AppCompatImageView emptyView;

    @NotNull
    private final LevelBarView levelBarView;

    @NotNull
    private StringBuilder talkback;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthIndicatorCardViewHolder(@NotNull Context context, @NotNull oxb binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.context = context;
        this.binding = binding;
        HomeCardCommonTitleView cardTitleView = binding.A;
        Intrinsics.checkNotNullExpressionValue(cardTitleView, "cardTitleView");
        this.cardTitleView = cardTitleView;
        LevelBarView levelBarView = binding.C;
        Intrinsics.checkNotNullExpressionValue(levelBarView, "levelBarView");
        this.levelBarView = levelBarView;
        AppCompatImageView ivEmpty = binding.B;
        Intrinsics.checkNotNullExpressionValue(ivEmpty, "ivEmpty");
        this.emptyView = ivEmpty;
        XAxisView xAxisView = binding.E;
        Intrinsics.checkNotNullExpressionValue(xAxisView, "xAxisView");
        this.xAxisView = xAxisView;
        this.talkback = new StringBuilder();
    }

    private final boolean isValidReport(DailyBasicReport report) {
        return (report instanceof AllDaySleepReport) || (report instanceof DailyBloodPressureReport);
    }

    private final void showBloodPressureReport(km5 dataModel, DailyBloodPressureReport report) {
        BloodPressureItem latestRecord = report.getLatestRecord();
        Integer numValueOf = latestRecord == null ? null : Integer.valueOf(pz2.a(latestRecord));
        if (latestRecord == null || numValueOf == null || !new IntRange(1, 4).contains(numValueOf.intValue())) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
                return;
            }
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%d/%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(latestRecord.getHighPressure()), Integer.valueOf(latestRecord.getLowPressure()), this.context.getString(c0j.D2)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{TimeUtils.formatDate(ResourceExtKt.getString(c0j.h), Long.valueOf(latestRecord.getTime() * ((long) 1000))), ResourceExtKt.getString(hz2.f(numValueOf.intValue()))}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.cardTitleView.showValueAndDesc(str, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LevelBarView.LevelItem(iji.h));
        arrayList.add(new LevelBarView.LevelItem(iji.i));
        arrayList.add(new LevelBarView.LevelItem(iji.j));
        arrayList.add(new LevelBarView.LevelItem(iji.s0));
        this.levelBarView.setLevels(arrayList);
        this.levelBarView.setLevel(numValueOf.intValue() - 1);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(this.context.getString(c0j.v1));
        sbClear.append(", ");
        sbClear.append(str2);
        sbClear.append(", ");
        sbClear.append(str);
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
    }

    private final void showEmpty(km5 dataModel) {
        String string;
        ViewExtKt.setVisible(this.levelBarView, false);
        ViewExtKt.setVisible(this.emptyView, true);
        boolean z = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel() == 0;
        int i = dataModel.f23979b;
        if (i == 6) {
            HomeCardCommonTitleView homeCardCommonTitleView = this.cardTitleView;
            String string2 = this.context.getString(z ? c0j.Sb : c0j.Tb);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            HomeCardCommonTitleView.showEmpty$default(homeCardCommonTitleView, string2, null, 2, null);
            string = this.context.getString(z ? c0j.Sb : c0j.Tb);
        } else if (i != 16) {
            string = "";
        } else {
            HomeCardCommonTitleView homeCardCommonTitleView2 = this.cardTitleView;
            String string3 = this.context.getString(z ? c0j.Nb : c0j.Qb);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            HomeCardCommonTitleView.showEmpty$default(homeCardCommonTitleView2, string3, null, 2, null);
            string = this.context.getString(z ? c0j.Nb : c0j.Qb);
        }
        Intrinsics.checkNotNull(string);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.Iq, l2c.b(dataModel.f23979b)));
        sbClear.append(", ");
        sbClear.append(string);
    }

    private final void showRecord(km5 dataModel, DailyBasicReport report) {
        ViewExtKt.setVisible(this.levelBarView, true);
        ViewExtKt.setVisible(this.emptyView, false);
        if (report instanceof AllDaySleepReport) {
            showSleepReport(dataModel, (AllDaySleepReport) report);
        } else if (report instanceof DailyBloodPressureReport) {
            showBloodPressureReport(dataModel, (DailyBloodPressureReport) report);
        }
    }

    private final void showSleepReport(km5 dataModel, AllDaySleepReport report) {
        int i;
        int score = report.getScore();
        if (score <= 0) {
            i = 0;
        } else if (score < 60) {
            i = 1;
        } else if (score < 80) {
            i = 2;
        } else {
            i = score < 90 ? 3 : 4;
        }
        if (i <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
                return;
            }
            return;
        }
        String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(report.getTotalDuration());
        String string = ResourceExtKt.getString(c0j.we, TimeDateUtil.getDateMMddFormat(report.getTime()), SleepExtKt.getSleepShortEvaluation(this.context, score));
        this.cardTitleView.showValueAndDesc(zNTimeWithMin, string);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LevelBarView.LevelItem(iji.z1));
        arrayList.add(new LevelBarView.LevelItem(iji.A1));
        arrayList.add(new LevelBarView.LevelItem(iji.B1));
        arrayList.add(new LevelBarView.LevelItem(iji.C1));
        this.levelBarView.setLevels(arrayList);
        this.levelBarView.setLevel(i - 1);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(string);
        sbClear.append(", ");
        sbClear.append(zNTimeWithMin);
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
    }

    private final void updateAxisView(km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 6) {
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.Wh));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.Th));
        } else {
            if (i != 16) {
                return;
            }
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.y2));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.x2));
        }
    }

    @NotNull
    public final oxb getBinding() {
        return this.binding;
    }

    public final void updateBindData(@NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        kp5 kp5VarA = ul5.c().a(dataModel.f23979b);
        this.cardTitleView.updateCardBgAndTitle(kp5VarA.c, kp5VarA.f24128b);
        updateAxisView(dataModel);
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !isValidReport(dailyBasicReport)) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
        } else {
            showRecord(dataModel, dailyBasicReport);
        }
        Logger.d(HealthAdapterV2.TAG, "talkback content:" + ((Object) this.talkback));
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
    }
}
