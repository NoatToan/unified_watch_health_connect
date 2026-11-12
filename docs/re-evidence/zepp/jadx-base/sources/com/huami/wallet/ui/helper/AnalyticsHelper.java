package com.huami.wallet.ui.helper;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.wallet.ui.utils.AnalyticConst;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/wallet/ui/helper/AnalyticsHelper;", "", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/huami/wallet/ui/helper/AnalyticsHelper$Companion;", "", "Lcom/huami/wallet/ui/helper/BusDetailOutType;", "busDetailOutType", "", "deviceModel", "", "recordBusDetailOutEvent", "appcode", "recordAddBusEvent", "recordEnterBusEvent", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void recordAddBusEvent(@NotNull String appcode, @NotNull String deviceModel) {
            HashMap map = new HashMap(2);
            map.put("DeviceSource", deviceModel);
            map.put(AnalyticConst.ParamKey.APP_CODE, appcode);
            Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.ADD_BUS_OUT).putExtras(map));
        }

        @JvmStatic
        public final void recordBusDetailOutEvent(@NotNull BusDetailOutType busDetailOutType, @NotNull String deviceModel) {
            HashMap map = new HashMap(2);
            map.put("DeviceSource", deviceModel);
            map.put(AnalyticConst.ParamKey.BUS_DETAIL_OUT_TYPE, busDetailOutType.getType());
            Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.BUS_DETAIL_OUT).putExtras(map));
        }

        @JvmStatic
        public final void recordEnterBusEvent(@NotNull String deviceModel) {
            HashMap map = new HashMap(2);
            map.put("DeviceSource", deviceModel);
            Analytics.recordEvent(new CountEventBuilder(AnalyticConst.EventId.BUS_VIEW_NUM).putExtras(map));
        }
    }

    @JvmStatic
    public static final void recordAddBusEvent(@NotNull String str, @NotNull String str2) {
        INSTANCE.recordAddBusEvent(str, str2);
    }

    @JvmStatic
    public static final void recordBusDetailOutEvent(@NotNull BusDetailOutType busDetailOutType, @NotNull String str) {
        INSTANCE.recordBusDetailOutEvent(busDetailOutType, str);
    }

    @JvmStatic
    public static final void recordEnterBusEvent(@NotNull String str) {
        INSTANCE.recordEnterBusEvent(str);
    }
}
