package com.xiaomi.hm.health.utils;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsCallBack;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\b\u0010\f\u001a\u00020\u0006H\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0002\"\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", PointCategory.INIT, "sportStatusV", "sportStatusC", "sportStatusCStatusMore", "statusC", "", "event", "type", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "a", "c", "b", "", GoogleApiAvailabilityLight.a, "TAG", "Ljava/lang/String;", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class EcgAnalyticsKt {

    @NotNull
    public static final String TAG = "EcgAnalytics";

    private static final CountEventBuilder a(String str, String str2) {
        return c(str).addExtra("tp", str2).addExtra("source", b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        if (boundDeviceSource != hMDeviceSource) {
            return String.valueOf(boundDeviceSource.getValue());
        }
        HMDeviceSource boundDeviceSource2 = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH);
        return boundDeviceSource2 != hMDeviceSource ? String.valueOf(boundDeviceSource2.getValue()) : String.valueOf(hMDeviceSource.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountEventBuilder c(String str) {
        return d() ? new CountEventBuilder(str).setIdentified(true).setAnonymous(false) : new CountEventBuilder(str).setIdentified(false).setAnonymous(true);
    }

    private static final boolean d() {
        return HMLoginManager.isInMainland() || (HMLoginManager.isUnknown() && Country.isChina());
    }

    public static final void init() {
        EcgAnalyticsManagerKt.setEcgAnalyticsCallBack(new EcgAnalyticsCallBack() { // from class: com.xiaomi.hm.health.utils.EcgAnalyticsKt.init.1
            @Override // com.huami.watch.companion.ecg.analytics.EcgAnalyticsCallBack
            @NotNull
            public CountEventBuilder getCountEventBuilder(@NotNull String event) {
                return EcgAnalyticsKt.c(event);
            }

            @Override // com.huami.watch.companion.ecg.analytics.EcgAnalyticsCallBack
            @NotNull
            public String getDeviceSourceValue() {
                return EcgAnalyticsKt.b();
            }
        });
    }

    public static final void sportStatusC() {
        Analytics.recordEvent(a(StatEvent.SPORT_STATUS_C, EcgAnalyticsManagerKt.ECG));
    }

    public static final void sportStatusCStatusMore() {
        Analytics.recordEvent(a(StatEvent.SPORT_STATUS_C, EcgAnalyticsManagerKt.STATUS_MORE));
    }

    public static final void sportStatusV() {
        Analytics.recordEvent(a(StatEvent.SPORT_STATUS_V, EcgAnalyticsManagerKt.ECG));
    }

    public static final void statusC() {
        Analytics.recordEvent(a(StatEvent.STATUS_C, EcgAnalyticsManagerKt.ECG));
    }
}
