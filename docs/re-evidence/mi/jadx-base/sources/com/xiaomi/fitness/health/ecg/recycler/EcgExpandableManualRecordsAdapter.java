package com.xiaomi.fitness.health.ecg.recycler;

import android.app.Application;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.data.model.WrapperEcgManualItem;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/recycler/EcgExpandableManualRecordsAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/data/model/WrapperEcgManualItem;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "<init>", "()V", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgExpandableManualRecordsAdapter extends BaseMonthExpandableAdapter<WrapperEcgManualItem, EcgMedicalItemReport> {

    @NotNull
    public static final String TAG = "HrmExpandableManualRecordsAdapter";

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        String string;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperEcgManualItem) {
            EcgMedicalItemReport ecgItem = ((WrapperEcgManualItem) data).getEcgItem();
            Integer avgHr = ecgItem.getAvgHr();
            String strValueOf = (avgHr != null && avgHr.intValue() == 0) ? "--" : String.valueOf(ecgItem.getAvgHr());
            Application application = ApplicationExtKt.getApplication();
            int i = qxi.b0;
            Integer avgHr2 = ecgItem.getAvgHr();
            String quantityString = ResourceExtKt.getQuantityString(application, i, avgHr2 != null ? avgHr2.intValue() : 0, strValueOf);
            String strConvertDataItemToMMDDHHMMString = AllRecordsPageUtilKt.convertDataItemToMMDDHHMMString(ecgItem.getMeasureTime());
            int interpretStatus = ecgItem.getInterpretStatus();
            if (interpretStatus == 0) {
                string = ExtUtilKt.getString(c0j.La);
            } else if (interpretStatus == 1) {
                string = ExtUtilKt.getString(c0j.Ia);
            } else if (interpretStatus != 2) {
                string = interpretStatus != 3 ? "" : ExtUtilKt.getString(c0j.la);
            } else {
                string = ExtUtilKt.getString(c0j.Ha);
            }
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, quantityString, null, strConvertDataItemToMMDDHHMMString, string, true, false, true, true, true, 2, null);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperEcgManualItem convertDailyRecordItemToWrapper(@NotNull EcgMedicalItemReport item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperEcgManualItem(item.getMeasureTime() * ((long) 1000), monthTimeMillis, item);
    }
}
