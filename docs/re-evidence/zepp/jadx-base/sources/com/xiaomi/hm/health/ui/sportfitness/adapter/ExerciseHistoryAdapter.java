package com.xiaomi.hm.health.ui.sportfitness.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.lib.view.quickadapter.MultiTypeDelegate;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportRecordAssembleUtil;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.dataprocess.HeartRateInfo;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.ui.sportfitness.model.HistoryRecordSection;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHistoryAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private static final int C = 1;
    public static final int TYPE_HISTORY_RECORD = 11;
    public static final int TYPE_SECTION_TITLE = 10;
    private boolean A;
    private boolean B;

    public class a extends MultiTypeDelegate<Object> {
        public a() {
        }

        @Override // com.huami.lib.view.quickadapter.MultiTypeDelegate
        public int getItemType(Object item) {
            return item instanceof HistoryRecordSection ? 10 : 11;
        }
    }

    public ExerciseHistoryAdapter() {
        super((List) null);
        this.A = false;
        this.B = false;
        setMultiTypeDelegate(l());
        this.B = UnitManager.getInstance().isMetric();
    }

    public static String formatDateTitle(Context context, long timeInMillis, boolean showWeekInfo) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timeInMillis);
            StringBuilder sb = new StringBuilder();
            if (showWeekInfo) {
                sb.append(TimeUtils.formatDate_E(BraceletApp.getContext(), calendar.getTime(), false, false));
            } else if (Calendar.getInstance().get(1) == calendar.get(1)) {
                sb.append(TimeUtils.formatDate_no_y(BraceletApp.getContext(), calendar.getTime(), false));
            } else {
                sb.append(TimeUtils.formatDate(BraceletApp.getContext(), calendar.getTime()));
            }
            return sb.toString();
        } catch (Exception e) {
            HMLog.i(BaseQuickAdapter.TAG, e.getLocalizedMessage(), new Object[0]);
            return "";
        }
    }

    private MultiTypeDelegate<Object> l() {
        a aVar = new a();
        aVar.registerItemType(10, R.layout.exercise_history_list_title);
        aVar.registerItemType(11, R.layout.exercise_history_list_item);
        return aVar;
    }

    private String m(Context context, long dateTimeInMilli) {
        return TimeUtils.formatTime(context, dateTimeInMilli);
    }

    private boolean n(int itemPos) {
        return itemPos > 0 && itemPos < this.mData.size() && getDefItemViewType(itemPos) == 11 && getDefItemViewType(itemPos - 1) == 10;
    }

    private boolean o(int itemPos) {
        return itemPos > 0 && itemPos < this.mData.size() && getDefItemViewType(itemPos) == 11 && (itemPos == this.mData.size() - 1 || getDefItemViewType(itemPos + 1) == 10);
    }

    private void p(BaseViewHolder holder, HistoryRecord item) {
        Context context = holder.itemView.getContext();
        int itemDataPosition = getItemDataPosition(holder);
        if (GlobalConfig.get().isBuildMidong()) {
            holder.setVisible(R.id.firstSplitLine, false);
            holder.setVisible(R.id.commonSplitLine, false);
            holder.setVisible(R.id.endSplitLine, true);
        } else {
            if (n(itemDataPosition)) {
                holder.setVisible(R.id.firstSplitLine, true);
                holder.setVisible(R.id.commonSplitLine, false);
            } else {
                holder.setVisible(R.id.firstSplitLine, false);
                holder.setVisible(R.id.commonSplitLine, true);
            }
            if (o(itemDataPosition)) {
                holder.setVisible(R.id.endSplitLine, true);
            } else {
                holder.setVisible(R.id.endSplitLine, false);
            }
        }
        holder.setText(R.id.sportsBegin, m(context, item.getBeginTimeInMilli()));
        holder.setText(R.id.sportCostTime, DataFormatter.getConsumeTime(item.getConsumeTime()));
        if (GlobalConfig.get().isBuildMidong()) {
            t(context, R.drawable.ic_time_14_s2, (TextView) holder.getView(R.id.sportCostTime));
        }
        if (item.isTraining()) {
            s(holder, item);
        } else {
            q(holder, item);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
    private void q(BaseViewHolder holder, HistoryRecord item) {
        String string;
        String str;
        Context context = holder.itemView.getContext();
        SportRecordAssembleUtil sportRecordAssembleUtil = SportRecordAssembleUtil.INSTANCE;
        int[] sportIconColorAndName = sportRecordAssembleUtil.getSportIconColorAndName(item.getType().intValue(), item.getSource().intValue(), item.getSportMode());
        ((ImageView) holder.getView(R.id.sportsTypeIcon)).setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (item.isTraining()) {
            holder.setImageResource(R.id.sportsTypeIcon, R.drawable.ic_train_30_s20);
            TintUtils.tintDrawable((ImageView) holder.getView(R.id.sportsTypeIcon), ContextCompat.getColor(context, R.color.s20));
        } else {
            holder.setImageResource(R.id.sportsTypeIcon, sportIconColorAndName[0]);
            TintUtils.tintDrawable((ImageView) holder.getView(R.id.sportsTypeIcon), ContextCompat.getColor(context, sportIconColorAndName[1]));
        }
        holder.getView(R.id.sportsTypeIcon).setBackground(TintUtils.tintDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.shape_sport_bg), ContextCompat.getColor(context, R.color.s4)));
        holder.setText(R.id.sportsType, sportRecordAssembleUtil.createSportTitle(context, item, sportIconColorAndName[2]));
        Integer avghr = item.getAvghr();
        if (avghr == null || avghr.intValue() == -1) {
            int iIntValue = item.getType().intValue();
            if (iIntValue == 1 || iIntValue == 22 || iIntValue == 8) {
                string = String.format(Locale.US, TimeModel.NUMBER_FORMAT, item.getSfreq());
            } else if (iIntValue == 9) {
                string = String.format(Locale.US, TimeModel.NUMBER_FORMAT, item.getClimbDisAscend());
            } else if (iIntValue == 25 || iIntValue == 26) {
                string = String.format(Locale.US, TimeModel.NUMBER_FORMAT, item.getSfreq());
            } else {
                string = context.getString(R.string.data_not_supported);
            }
            holder.setText(R.id.sportFreq, string);
        } else {
            holder.setText(R.id.sportFreq, HeartRateInfo.isHRValueValid(avghr.intValue()) ? String.valueOf(avghr) : context.getString(R.string.hr_empty_data));
        }
        sportRecordAssembleUtil.setTitleDataAndSubDataToRecord(item);
        if (item.getTitleDataUnitResId() > 0) {
            str = item.getTitleDataValue() + context.getString(item.getTitleDataUnitResId());
        } else {
            str = "";
        }
        String subDataValue = item.getSubDataValue();
        int subDataIconResId = item.getSubDataIconResId();
        holder.setVisible(R.id.sportsTypeData, !TextUtils.isEmpty(str));
        holder.setText(R.id.sportsTypeData, str);
        TextView textView = (TextView) holder.getView(R.id.sportSubData);
        textView.setText(subDataValue);
        if (GlobalConfig.get().isBuildMidong()) {
            t(context, subDataIconResId, textView);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(subDataIconResId, 0, 0, 0);
        }
        if (SportDeviceUtils.isWatchCategorySportSource(item.getSource().intValue())) {
            holder.setVisible(R.id.sportsDeviceIcon, true);
            if (SportDeviceUtils.isWatchCategoryForVenice(item.getSource().intValue())) {
                holder.setImageResource(R.id.sportsDeviceIcon, R.drawable.ic_18_watch_venice);
            } else {
                holder.setImageResource(R.id.sportsDeviceIcon, R.drawable.ic_18_watch);
            }
            TintUtils.tintDrawable((ImageView) holder.getView(R.id.sportsDeviceIcon), ContextCompat.getColor(context, R.color.s2));
            return;
        }
        boolean z = item.getType().intValue() == 9;
        boolean zIsRunningShoes = SportDeviceUtils.isRunningShoes(item.getDevice());
        if (z || (item.getFfpercent().intValue() <= 0 && !zIsRunningShoes)) {
            holder.setVisible(R.id.sportsDeviceIcon, false);
            return;
        }
        holder.setVisible(R.id.sportsDeviceIcon, true);
        holder.setImageResource(R.id.sportsDeviceIcon, R.drawable.ic_18_shoes);
        TintUtils.tintDrawable((ImageView) holder.getView(R.id.sportsDeviceIcon), ContextCompat.getColor(context, R.color.s2));
    }

    private void r(BaseViewHolder holder, HistoryRecordSection item) {
        holder.setText(R.id.titleDate, formatDateTitle(holder.itemView.getContext(), item.recordStartTime, this.A));
    }

    private void s(BaseViewHolder holder, HistoryRecord item) {
        Context context = holder.itemView.getContext();
        ((ImageView) holder.getView(R.id.sportsTypeIcon)).setScaleType(ImageView.ScaleType.CENTER);
        holder.setImageResource(R.id.sportsTypeIcon, R.drawable.ic_sporttype_train);
        TintUtils.tintDrawable((ImageView) holder.getView(R.id.sportsTypeIcon), ContextCompat.getColor(context, R.color.exercise_item_color));
        holder.getView(R.id.sportsTypeIcon).setBackground(TintUtils.tintDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.shape_sport_bg), ContextCompat.getColor(context, R.color.s4)));
        holder.setText(R.id.sportsType, item.getTrainingName());
        TextView textView = (TextView) holder.getView(R.id.sportSubData);
        textView.setText(String.format(Locale.US, TimeModel.NUMBER_FORMAT, Long.valueOf(item.getTrainingCal())));
        if (GlobalConfig.get().isBuildMidong()) {
            t(context, R.drawable.ic_calories_14_s2, textView);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_calories_14_s2, 0, 0, 0);
        }
        if (item.isCourseTraining()) {
            holder.setVisible(R.id.sportsTypeData, false);
        } else {
            holder.setVisible(R.id.sportsTypeData, true);
            holder.setText(R.id.sportsTypeData, context.getResources().getQuantityString(R.plurals.how_many_times, item.getTrainingNo(), Integer.valueOf(item.getTrainingNo())));
        }
        Integer numValueOf = Integer.valueOf(item.getTrainingAvgHr());
        if (numValueOf.intValue() != -1) {
            holder.setText(R.id.sportFreq, HeartRateInfo.isHRValueValid(numValueOf.intValue()) ? String.valueOf(numValueOf) : context.getString(R.string.hr_empty_data));
        } else {
            holder.setText(R.id.sportFreq, item.getTrainingSubSize());
        }
        if (GlobalConfig.get().isBuildMidong()) {
            t(context, R.drawable.ic_calories_14_s2, (TextView) holder.getView(R.id.sportFreq));
        }
        holder.setVisible(R.id.sportsDeviceIcon, false);
    }

    private void t(Context context, int icon, TextView textView) {
        Drawable drawable = ContextCompat.getDrawable(context, icon);
        int iDp2px = (int) ViewUtils.dp2px(context, 11.5f);
        drawable.setBounds(0, 0, iDp2px, iDp2px);
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object item) {
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 10) {
            r(holder, (HistoryRecordSection) item);
        } else {
            if (itemViewType != 11) {
                return;
            }
            p(holder, (HistoryRecord) item);
        }
    }

    public void setGroupByWeek(boolean groupByWeek) {
        this.A = groupByWeek;
    }
}
