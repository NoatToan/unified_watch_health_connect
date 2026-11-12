package com.xiaomi.hm.health.device.setting.appsort.repo.iddesc;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "", "", "", "ids", "", "parse", "appId", "getDesc", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IdDescApi {
    @NotNull
    String getDesc(@NotNull String appId);

    boolean parse(@NotNull List<String> ids);
}
