package com.xiaomi.hm.health.smalltool.model;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016JA\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/ITool;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "isSupport", "", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "supportFilters", "notSupportFilters", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;)Z", "open", "Lcom/xiaomi/hm/health/smalltool/model/INavigate;", "navigations", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)Z", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ITool {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean isSupport(@NotNull ITool iTool, @NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return false;
        }

        public static boolean isSupport(@NotNull ITool iTool, @NotNull Context context, @Nullable HMDeviceSource hMDeviceSource, @Nullable IFilter[] iFilterArr, @Nullable IFilter[] iFilterArr2) {
            boolean z;
            boolean z2 = false;
            if (iFilterArr != null) {
                int length = iFilterArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    IFilter iFilter = iFilterArr[i];
                    i++;
                    if (iFilter.match(context, hMDeviceSource)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return z;
            }
            if (iFilterArr2 != null) {
                int length2 = iFilterArr2.length;
                int i2 = 0;
                while (i2 < length2) {
                    IFilter iFilter2 = iFilterArr2[i2];
                    i2++;
                    if (iFilter2.match(context, hMDeviceSource)) {
                        z2 = true;
                        break;
                    }
                }
            }
            return !z2;
        }

        public static boolean open(@NotNull ITool iTool, @NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return false;
        }

        public static boolean open(@NotNull ITool iTool, @NotNull Context context, @Nullable HMDeviceSource hMDeviceSource, @Nullable INavigate[] iNavigateArr) {
            if (iNavigateArr == null) {
                return false;
            }
            int length = iNavigateArr.length;
            int i = 0;
            while (i < length) {
                INavigate iNavigate = iNavigateArr[i];
                i++;
                if (iNavigate.to(context, hMDeviceSource)) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean isSupport(@NotNull Context context, @Nullable HMDeviceSource device);

    boolean isSupport(@NotNull Context context, @Nullable HMDeviceSource device, @Nullable IFilter[] supportFilters, @Nullable IFilter[] notSupportFilters);

    boolean open(@NotNull Context context, @Nullable HMDeviceSource device);

    boolean open(@NotNull Context context, @Nullable HMDeviceSource device, @Nullable INavigate[] navigations);
}
