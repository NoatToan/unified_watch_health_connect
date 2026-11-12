package com.xiaomi.fitness.health.temperature.adapter;

import android.content.res.Resources;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureExpandableAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/health/temperature/adapter/WrapperTemperatureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "<init>", "()V", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TemperatureExpandableAdapter extends BaseMonthExpandableAdapter<WrapperTemperatureItem, TemperatureItem> {
    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        String str;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperTemperatureItem) {
            Resources resources = viewHolder.itemView.getResources();
            TemperatureItem temperatureItem = ((WrapperTemperatureItem) data).getTemperatureItem();
            Float bodyTemp = temperatureItem.getBodyTemp();
            float fFloatValue = bodyTemp != null ? bodyTemp.floatValue() : 0.0f;
            Float skinTemp = temperatureItem.getSkinTemp();
            float fFloatValue2 = skinTemp != null ? skinTemp.floatValue() : 0.0f;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{resources.getString(c0j.dn), resources.getString(c0j.tn, Float.valueOf(fFloatValue))}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            String str3 = String.format("%s %s", Arrays.copyOf(new Object[]{resources.getString(c0j.nn), resources.getString(c0j.tn, Float.valueOf(fFloatValue2))}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            if (fFloatValue <= 0.0f || fFloatValue2 <= 0.0f) {
                str = fFloatValue > 0.0f ? str2 : str3;
            } else {
                str = String.format("%s\n%s", Arrays.copyOf(new Object[]{str3, str2}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, str, null, TimeUtils.formatDate(resources.getString(c0j.h), Long.valueOf(temperatureItem.getTime() * ((long) 1000))), null, false, false, false, false, false, 474, null);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperTemperatureItem convertDailyRecordItemToWrapper(@NotNull TemperatureItem item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperTemperatureItem(item.getTime() * ((long) 1000), monthTimeMillis, item);
    }
}
