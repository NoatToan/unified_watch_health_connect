package com.huami.moving.sport.ui.view.chart.dataprovider.common;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.DeviceList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/common/UnSupportChartTypeSource;", "", "<init>", "()V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class UnSupportChartTypeSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Integer> a = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/common/UnSupportChartTypeSource$Companion;", "", "", "a", "", "sportSource", "", "unSupportStepChartDeviceSource", "", DeviceList.ELEM_NAME, "Ljava/util/List;", "getDeviceList", "()Ljava/util/List;", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a() {
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_PEYTO.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_PEYTO_L.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_PEYTO_WL.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_DTH.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_DTH_W.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_TEMPO.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_TOKYO.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_TONLESAP.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_TONLESAP_L.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_TONLESAP_O.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_TONLESAP_OL.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_GARDA.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_HAWK.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_HAWK_WL.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_HAWK_W.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_HAWK_SWK.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_HAWK_SWK_W.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_FALCON.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_FALCON_DISNEY.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_FALCON_L.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_FALCON_W.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_FALCON_WL.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_KESTREL.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_KESTREL_L.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_KESTREL_W.getValue()));
            getDeviceList().add(Integer.valueOf(HMDeviceSource.MILI_KESTREL_WL.getValue()));
        }

        @NotNull
        public final List<Integer> getDeviceList() {
            return UnSupportChartTypeSource.a;
        }

        public final boolean unSupportStepChartDeviceSource(int sportSource) {
            int value;
            if (getDeviceList().isEmpty()) {
                a();
            }
            if (sportSource >= 100) {
                value = sportSource - 100;
            } else if (sportSource == DataTypeSource.RunSource.RUN_SOURCE_CHAOHU.getValue()) {
                value = HMDeviceSource.MILI_PEYTO.getValue();
            } else if (sportSource == DataTypeSource.RunSource.RUN_SOURCE_TEMPO.getValue()) {
                value = HMDeviceSource.MILI_TEMPO.getValue();
            } else {
                value = sportSource == DataTypeSource.RunSource.RUN_SOURCE_DONGTINGHU.getValue() ? HMDeviceSource.MILI_DTH.getValue() : -1;
            }
            return getDeviceList().contains(Integer.valueOf(value));
        }
    }
}
