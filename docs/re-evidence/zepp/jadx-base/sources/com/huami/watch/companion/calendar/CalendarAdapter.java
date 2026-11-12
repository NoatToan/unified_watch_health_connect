package com.huami.watch.companion.calendar;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.DensityUtil;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarAdapter extends BaseQuickAdapter<CalendarDate, BaseViewHolder> {
    public CalendarAdapter() {
        super(R.layout.item_calendar);
    }

    @NonNull
    private GradientDrawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(DateManager.get().getMaskColor()));
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(i, i);
        return gradientDrawable;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, CalendarDate calendarDate) {
        int i = R.id.tv_day;
        TextView textView = (TextView) baseViewHolder.getView(i);
        if (DateDay.from(calendarDate.millis()).after(DateDay.from(DateManager.get().getStopDate().millis())) || DateDay.from(calendarDate.millis()).before(DateDay.from(DateManager.get().getStartDate().millis()))) {
            textView.setBackgroundResource(0);
            textView.setTextColor(this.mContext.getResources().getColor(R.color.grey_text));
        } else if (DateManager.get().getCurrentSelectDay().date().equals(calendarDate.date())) {
            textView.setBackgroundDrawable(a((int) DensityUtil.dpToPx(this.mContext, 28.0f)));
            textView.setTextColor(this.mContext.getResources().getColor(R.color.white));
        } else {
            textView.setBackgroundResource(0);
            textView.setTextColor(this.mContext.getResources().getColor(R.color.black));
        }
        baseViewHolder.setText(i, calendarDate.getDay() == 0 ? "" : String.valueOf(calendarDate.getDay()));
        View view = baseViewHolder.getView(R.id.iv_mask);
        if (DateManager.get().getMonthMasks() == null || !DateManager.get().getMonthMasks().contains(calendarDate.date())) {
            view.setBackgroundResource(0);
            view.setVisibility(4);
        } else {
            view.setBackgroundDrawable(a((int) DensityUtil.dpToPx(this.mContext, 4.0f)));
            view.setVisibility(0);
        }
    }
}
