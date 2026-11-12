package com.xiaomi.fitness.health.curse.adapter;

import android.content.res.Resources;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import defpackage.c0j;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/CurseExpandableAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter;", "Lcom/xiaomi/fitness/health/curse/adapter/WrapperCurseRecord;", "<init>", "()V", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseExpandableAdapter extends BaseExpandableAdapter<WrapperCurseRecord> {
    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperCurseRecord) {
            Resources resources = viewHolder.itemView.getResources();
            WrapperCurseRecord wrapperCurseRecord = (WrapperCurseRecord) data;
            int interval = wrapperCurseRecord.getInterval() > 0 ? wrapperCurseRecord.getInterval() : CurseManager.INSTANCE.getInstance().getInterval();
            long zeroMills = CurseExtKt.getZeroMills(wrapperCurseRecord.getStartMills());
            long zeroMills2 = CurseExtKt.getZeroMills(wrapperCurseRecord.getEndMills());
            long todayZeroMills = CurseExtKt.getTodayZeroMills();
            boolean z = false;
            if (zeroMills <= todayZeroMills && todayZeroMills < zeroMills2) {
                z = true;
            }
            String string = z ? resources.getString(c0j.z6, TimeDateUtil.getDateMdFormat(wrapperCurseRecord.getStartMills())) : resources.getString(c0j.A7, TimeDateUtil.getDateMdFormat(wrapperCurseRecord.getStartMills()), TimeDateUtil.getDateMdFormat(wrapperCurseRecord.getEndMills()));
            Intrinsics.checkNotNull(string);
            String string2 = z ? resources.getString(c0j.U5) : resources.getQuantityString(qxi.M, interval, Integer.valueOf(interval));
            Intrinsics.checkNotNull(string2);
            String quantityString = resources.getQuantityString(qxi.common_unit_day_desc, wrapperCurseRecord.getInDays(), Integer.valueOf(wrapperCurseRecord.getInDays()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, string, string2, quantityString, null, false, false, false, !z, false, 376, null);
        }
    }
}
