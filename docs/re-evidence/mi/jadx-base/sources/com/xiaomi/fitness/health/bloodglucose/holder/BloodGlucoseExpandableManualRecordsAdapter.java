package com.xiaomi.fitness.health.bloodglucose.holder;

import android.graphics.drawable.Drawable;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.data.model.WrapperBloodGlucoseFibRecord;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseExpandableManualRecordsAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/data/model/WrapperBloodGlucoseFibRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "<init>", "()V", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseExpandableManualRecordsAdapter extends BaseMonthExpandableAdapter<WrapperBloodGlucoseFibRecord, BloodSugarItem> {

    @NotNull
    public static final String TAG = "BloodGlucoseExpandableManualRecordsAdapter";

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperBloodGlucoseFibRecord) {
            BloodSugarItem bloodSugarItem = ((WrapperBloodGlucoseFibRecord) data).getBloodSugarItem();
            String quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.e, (int) bloodSugarItem.bloodSugar(), Float.valueOf(bloodSugarItem.bloodSugar()));
            String strConvertDataItemToMMDDHHMMString = AllRecordsPageUtilKt.convertDataItemToMMDDHHMMString(bloodSugarItem.getTime());
            if (bloodSugarItem.getSid() != null) {
                String sid = bloodSugarItem.getSid();
                Intrinsics.checkNotNull(sid);
                if (!StringsKt__StringsKt.isBlank(sid)) {
                    String sid2 = bloodSugarItem.getSid();
                    Intrinsics.checkNotNull(sid2);
                    if (Intrinsics.areEqual(sid2, "xiaomiwear_app_manually")) {
                        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
                        Integer measurePeriod = bloodSugarItem.getMeasurePeriod();
                        strConvertDataItemToMMDDHHMMString = strConvertDataItemToMMDDHHMMString + " " + ResourceExtKt.getString(bloodGlucoseDataUtil.getBloodGlucoseStrByConstant(measurePeriod != null ? measurePeriod.intValue() : -1));
                    }
                }
            }
            BloodGlucoseDataUtil bloodGlucoseDataUtil2 = BloodGlucoseDataUtil.INSTANCE;
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, quantityString, null, strConvertDataItemToMMDDHHMMString, ResourceExtKt.getString(bloodGlucoseDataUtil2.getTypeStingRes(BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null))), true, false, true, true, true, 2, null);
            int recordLevelDrawable = bloodGlucoseDataUtil2.getRecordLevelDrawable(BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null));
            int recordLevelTextColor = bloodGlucoseDataUtil2.getRecordLevelTextColor(BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null));
            Drawable drawable = AppUtil.getApp().getDrawable(recordLevelDrawable);
            Intrinsics.checkNotNull(drawable);
            viewHolder.updateAbnormalBg(drawable, recordLevelTextColor);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperBloodGlucoseFibRecord convertDailyRecordItemToWrapper(@NotNull BloodSugarItem item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperBloodGlucoseFibRecord(item.getTimestamp() * ((long) 1000), monthTimeMillis, item);
    }
}
