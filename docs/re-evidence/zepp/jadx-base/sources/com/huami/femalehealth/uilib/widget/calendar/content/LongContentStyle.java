package com.huami.femalehealth.uilib.widget.calendar.content;

import android.content.res.Resources;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/content/LongContentStyle;", "Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;", "", "dur", "", "periodPos", "dur2", "periodPosWithForecast", "", "isToday", "periodFinish", "forecastPeriodFinish", "forecastPeriodStart", "periodStart", "remaining", "forecastPeriodWithRemaining", "periodWithRemaining", "total", "forecastPeriodWithOvulation", "ovulationDay", "forecastPregnantBeforeOvulation", "pregnantDur", "forecastPregnantAfterOvulation", "pregnantFinish", "forecastPregnantStart", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class LongContentStyle extends BaseCardContentStyle {
    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPeriodFinish(boolean isToday) {
        return ResourceHelper.INSTANCE.getString(isToday ? R.string.fh_status_in_real_period_finish_today_remain : R.string.fh_status_in_predict_period_finish_this_day);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPeriodStart(int dur) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_status_for_predict_period), Arrays.copyOf(new Object[]{toDayString$uilib_release(dur)}, 1));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPeriodWithOvulation(int dur, int total) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_card_status_desc_ovulation_now), Arrays.copyOf(new Object[]{toTheDayTotalString$uilib_release(dur, total)}, 1));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPeriodWithRemaining(int dur, int remaining) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_status_in_predict_period_remain_plurals, remaining, toTheDayString$uilib_release(dur), toDayString$uilib_release(remaining))) == null) ? "" : quantityString;
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPregnantAfterOvulation(int pregnantDur, int total, int ovulationDay) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_card_status_desc_after_ovulation), Arrays.copyOf(new Object[]{toTheDayTotalString$uilib_release(pregnantDur, total), toDayString$uilib_release(ovulationDay)}, 2));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPregnantBeforeOvulation(int ovulationDay, int total) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_card_status_desc_before_ovulation), Arrays.copyOf(new Object[]{toTheDayTotalString$uilib_release(6 - ovulationDay, total), toDayString$uilib_release(ovulationDay)}, 2));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String forecastPregnantStart(int dur) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_status_for_pregnancy), Arrays.copyOf(new Object[]{toDayString$uilib_release(dur)}, 1));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String periodFinish(boolean isToday) {
        return ResourceHelper.INSTANCE.getString(isToday ? R.string.fh_status_in_real_period_finish_today : R.string.fh_status_in_real_period_finish_this_day);
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String periodPos(int dur) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_status_in_real_period), Arrays.copyOf(new Object[]{toTheDayString$uilib_release(dur)}, 1));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String periodPosWithForecast(int dur, int dur2) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_status_in_real_period_predict_remain_plurals, dur2, toTheDayString$uilib_release(dur), toDayString$uilib_release(dur2))) == null) ? "" : quantityString;
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String periodStart(int dur) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_status_for_period), Arrays.copyOf(new Object[]{toDayString$uilib_release(dur)}, 1));
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String periodWithRemaining(int dur, int remaining) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_status_in_period_remain_plurals, remaining, toTheDayString$uilib_release(dur), toDayString$uilib_release(remaining))) == null) ? "" : quantityString;
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle
    @NotNull
    public String pregnantFinish(boolean isToday, int periodStart) {
        if (isToday) {
            return forecastPregnantAfterOvulation(10, 10, periodStart);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(ResourceHelper.INSTANCE.getString(R.string.fh_card_status_desc_pregnant_end), Arrays.copyOf(new Object[]{toDayString$uilib_release(periodStart)}, 1));
    }
}
