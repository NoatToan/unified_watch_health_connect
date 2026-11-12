package com.xiaomi.fitness.health.hrm.recycler;

import android.content.res.Resources;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.model.WrapperHrAndPaceFibRecord;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/recycler/HrmAndPaceExpandableFibRecordsAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/data/model/WrapperHrAndPaceFibRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "<init>", "()V", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmAndPaceExpandableFibRecordsAdapter extends BaseMonthExpandableAdapter<WrapperHrAndPaceFibRecord, LactateThresholdItem> {

    @NotNull
    public static final String TAG = "HrmAndPaceExpandableFibRecordsAdapter";

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        String str;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperHrAndPaceFibRecord) {
            LactateThresholdItem lactateThresholdItem = ((WrapperHrAndPaceFibRecord) data).getLactateThresholdItem();
            String str2 = "";
            if (lactateThresholdItem.getHeartRate() != null) {
                Resources resources = AppUtil.getApp().getResources();
                int i = qxi.Y0;
                Integer heartRate = lactateThresholdItem.getHeartRate();
                Intrinsics.checkNotNull(heartRate);
                int iIntValue = heartRate.intValue();
                Integer heartRate2 = lactateThresholdItem.getHeartRate();
                Intrinsics.checkNotNull(heartRate2);
                String quantityString = resources.getQuantityString(i, iIntValue, String.valueOf(heartRate2.intValue()));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                str2 = "" + quantityString;
            }
            if (lactateThresholdItem.getPace() != null) {
                Integer pace = lactateThresholdItem.getPace();
                Intrinsics.checkNotNull(pace);
                String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(pace.intValue());
                Resources resources2 = AppUtil.getApp().getResources();
                int i2 = qxi.Z0;
                Integer pace2 = lactateThresholdItem.getPace();
                Intrinsics.checkNotNull(pace2);
                String quantityString2 = resources2.getQuantityString(i2, pace2.intValue(), sportPaceStrWithSecDef);
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                str = str2 + "\n" + quantityString2;
            } else {
                str = str2;
            }
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, str, null, AllRecordsPageUtilKt.convertDataItemToMMDDHHMMString(lactateThresholdItem.getTime()), null, true, false, true, true, false, 266, null);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperHrAndPaceFibRecord convertDailyRecordItemToWrapper(@NotNull LactateThresholdItem item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperHrAndPaceFibRecord(item.getTimestamp() * ((long) 1000), monthTimeMillis, item);
    }
}
