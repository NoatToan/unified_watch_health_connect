package com.xiaomi.hm.health.device.setting.appsort.condition;

import android.content.Context;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.appsort.AppSortConditionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/condition/DeviceAppSortConditionProvider;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortConditionProvider;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "", "getConditions", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceAppSortConditionProvider implements AppSortConditionProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_NESS_W.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_DAX.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_CRATER_W.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_CRATER_WL.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_WAST.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_WAST_W.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DeviceAppSortConditionProvider(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortConditionProvider
    @NotNull
    public List<Object> getConditions(@NotNull HMDeviceSource source) {
        switch (WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Object[]{new AppGroupCountCondition(255, 16, Integer.MIN_VALUE, this.context.getResources().getQuantityString(R.plurals.app_sort_tips_max, 16, 16), ""), new AppGroupCountCondition(7, 16, Integer.MIN_VALUE, this.context.getResources().getQuantityString(R.plurals.app_sort_tips_more_max, 16, 16), ""), new AppHideCondition(19, false, 2, null)});
            default:
                return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
