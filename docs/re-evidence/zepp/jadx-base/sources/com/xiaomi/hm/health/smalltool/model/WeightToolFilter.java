package com.xiaomi.hm.health.smalltool.model;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00060\bj\u0002`\t¢\u0006\u0004\b\u0013\u0010\u0014B)\b\u0016\u0012\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0013\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R,\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR2\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/WeightToolFilter;", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/smalltool/model/DeviceFilter;", "a", "Lkotlin/jvm/functions/Function1;", "filter1", "Lkotlin/Function2;", "Lcom/xiaomi/hm/health/smalltool/model/ContextDeviceFilter;", "b", "Lkotlin/jvm/functions/Function2;", "filter2", "filter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function2;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public class WeightToolFilter implements IFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super HMDeviceSource, Boolean> filter1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Context, ? super HMDeviceSource, Boolean> filter2;

    public WeightToolFilter(@NotNull Function1<? super HMDeviceSource, Boolean> function1) {
        this.filter1 = function1;
    }

    @Override // com.xiaomi.hm.health.smalltool.model.IFilter
    public boolean match(@Nullable HMDeviceSource hMDeviceSource) {
        return IFilter.DefaultImpls.match(this, hMDeviceSource);
    }

    @Override // com.xiaomi.hm.health.smalltool.model.IFilter
    public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
        boolean zBooleanValue;
        if (!Filter.SCALE.match(device)) {
            return false;
        }
        Function1<? super HMDeviceSource, Boolean> function1 = this.filter1;
        Boolean boolValueOf = function1 == null ? null : Boolean.valueOf(function1.invoke(device).booleanValue());
        if (boolValueOf == null) {
            Function2<? super Context, ? super HMDeviceSource, Boolean> function2 = this.filter2;
            zBooleanValue = function2 == null ? false : function2.invoke(context, device).booleanValue();
        } else {
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public WeightToolFilter(@NotNull Function2<? super Context, ? super HMDeviceSource, Boolean> function2) {
        this.filter2 = function2;
    }
}
