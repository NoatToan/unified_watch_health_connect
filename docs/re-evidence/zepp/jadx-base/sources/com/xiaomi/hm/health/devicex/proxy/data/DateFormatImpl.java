package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.devicex.injection.data.DateFormatApi;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/DateFormatImpl;", "Lcom/huami/devicex/injection/data/DateFormatApi;", "", "getCreateTime", "time", "", "formatDateSimple", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DateFormatImpl implements DateFormatApi {
    @Override // com.huami.devicex.injection.data.DateFormatApi
    @NotNull
    public String formatDateSimple(long time) {
        return HMDateUtil.formatDateSimple(time);
    }

    @Override // com.huami.devicex.injection.data.DateFormatApi
    public long getCreateTime() {
        return HMDateUtil.getCreateTime().longValue();
    }
}
