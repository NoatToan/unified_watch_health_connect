package com.huami.bloodpressure_ui.history;

import androidx.exifinterface.media.ExifInterface;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.DataExKt;
import com.huami.bloodpressure_ui.ext.TimeZoneExKt;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0014J \u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H&R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureTimeAdapter;", ExifInterface.LATITUDE_SOUTH, "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/huami/bloodpressure_ui/history/BloodPressureTimeEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "holder", "item", "", "convert", "onDataList", "Ljava/text/SimpleDateFormat;", "a", "Ljava/text/SimpleDateFormat;", "mYearFormat", "b", "mDateFormat", "", "dataList", "<init>", "(Ljava/util/List;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureTimeAdapter<S> extends BaseMultiItemQuickAdapter<BloodPressureTimeEntity<S>, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SimpleDateFormat mYearFormat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SimpleDateFormat mDateFormat;

    public BloodPressureTimeAdapter(@NotNull List<BloodPressureTimeEntity<S>> list) {
        super(list);
        addItemType(1, R.layout.item_bloodpressure_history_title);
        addItemType(3, R.layout.item_bloodpressure_history_title_year);
        addItemType(2, R.layout.item_bloodpressure_history_day);
    }

    public abstract void onDataList(@NotNull BaseViewHolder holder, @Nullable BloodPressureTimeEntity<S> item);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @Nullable BloodPressureTimeEntity<S> item) {
        this.mDateFormat = TimeZoneExKt.getChinaSDF(this.mContext.getResources().getString(R.string.blood_pressure_md));
        this.mYearFormat = TimeZoneExKt.getChinaSDF(this.mContext.getResources().getString(R.string.blood_pressure_y));
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 1) {
            if (item == null) {
                return;
            }
            if (DataExKt.isToday(item.getMLabelDate())) {
                holder.setText(R.id.item_bp_history_date, this.mContext.getResources().getString(R.string.blood_pressure_today));
                return;
            }
            int i = R.id.item_bp_history_date;
            long mLabelDate = item.getMLabelDate();
            SimpleDateFormat simpleDateFormat = this.mDateFormat;
            Objects.requireNonNull(simpleDateFormat);
            holder.setText(i, DataExKt.millis2String(mLabelDate, simpleDateFormat));
            return;
        }
        if (itemViewType == 2) {
            onDataList(holder, item);
            return;
        }
        if (itemViewType == 3 && item != null) {
            if (DataExKt.isToday(item.getMLabelDate())) {
                holder.setText(R.id.item_bp_year_date, this.mContext.getResources().getString(R.string.blood_pressure_today));
            } else {
                int i2 = R.id.item_bp_year_date;
                long mLabelDate2 = item.getMLabelDate();
                SimpleDateFormat simpleDateFormat2 = this.mDateFormat;
                Objects.requireNonNull(simpleDateFormat2);
                holder.setText(i2, DataExKt.millis2String(mLabelDate2, simpleDateFormat2));
            }
            int i3 = R.id.item_bp_year;
            long mLabelDate3 = item.getMLabelDate();
            SimpleDateFormat simpleDateFormat3 = this.mYearFormat;
            Objects.requireNonNull(simpleDateFormat3);
            holder.setText(i3, DataExKt.millis2String(mLabelDate3, simpleDateFormat3));
        }
    }
}
