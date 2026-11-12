package com.xiaomi.hm.health.bt.profile.gdsp.common.filter.header;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.filter.IGdspHeaderFilter;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/filter/header/GdspHeaderErrorActivitySizeFilter;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/filter/IGdspHeaderFilter;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "dataHeader", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "filter", "", "key", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspHeaderErrorActivitySizeFilter implements IGdspHeaderFilter {
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.filter.IGdspHeaderFilter
    @NotNull
    public GDSPErrorCode filter(@NotNull DataHeader dataHeader, @NotNull Calendar startTime) {
        return (!dataHeader.isSuccessfully() || dataHeader.size <= 129600) ? GDSPErrorCode.INSTANCE.fromValue(dataHeader.getErrorCode()) : GDSPErrorCode.INVALID_STATE;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.filter.IGdspHeaderFilter
    @NotNull
    public String key() {
        return "ActivityDataSize";
    }
}
