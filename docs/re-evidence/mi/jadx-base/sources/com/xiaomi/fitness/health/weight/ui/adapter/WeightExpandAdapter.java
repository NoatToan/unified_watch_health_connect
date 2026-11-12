package com.xiaomi.fitness.health.weight.ui.adapter;

import android.content.res.Resources;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightExpandAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WrapperWeightItem;", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "<init>", "()V", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightExpandAdapter extends BaseMonthExpandableAdapter<WrapperWeightItem, WeightItem> {
    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperWeightItem) {
            Resources resources = viewHolder.itemView.getResources();
            WeightItem weightItem = ((WrapperWeightItem) data).getWeightItem();
            int i = c0j.u4;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%1$.2f", Arrays.copyOf(new Object[]{Float.valueOf(weightItem.getWeight())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String string = resources.getString(i, str);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, string, null, TimeUtils.formatDate(resources.getString(c0j.h), Long.valueOf(weightItem.getTime() * ((long) 1000))), null, false, false, false, false, false, 474, null);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperWeightItem convertDailyRecordItemToWrapper(@NotNull WeightItem item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperWeightItem(item.getTime() * ((long) 1000), monthTimeMillis, item);
    }
}
