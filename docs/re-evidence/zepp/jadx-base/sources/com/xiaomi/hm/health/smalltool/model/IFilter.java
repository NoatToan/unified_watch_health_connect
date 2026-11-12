package com.xiaomi.hm.health.smalltool.model;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IFilter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean match(@NotNull IFilter iFilter, @NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return iFilter.match(hMDeviceSource);
        }

        public static boolean match(@NotNull IFilter iFilter, @Nullable HMDeviceSource hMDeviceSource) {
            return false;
        }
    }

    boolean match(@NotNull Context context, @Nullable HMDeviceSource device);

    boolean match(@Nullable HMDeviceSource device);
}
