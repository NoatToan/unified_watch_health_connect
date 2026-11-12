package com.huami.health.afppg.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.remote.dto.HealthEvents;
import com.huami.health.afppg.data.remote.dto.HeartHealthExtra;
import com.huami.health.afppg.service.ConvertContinuousAFibService;
import com.huami.health.afppg.usecase.PostAFibUseCase;
import com.huami.health.afppg.utils.GsonConvertorKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/huami/health/afppg/service/ConvertContinuousAFibService;", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "lastAFib", "", GoogleApiAvailabilityLight.a, "", "value", "c", "", "uid", "", "data", "Lcom/huami/health/afppg/data/remote/dto/HealthEvents;", "getAFibEvents", "", "a", "J", "AFIB_UNIT_DURATION", "b", LogUtil.I, "TIME_UNIT_SECOND", "TIME_UNIT_MINUTE_ONE", "TIME_UNIT_MINUTE_HALF", "e", "TIME_UNIT_MILLS", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class ConvertContinuousAFibService {

    @NotNull
    public static final ConvertContinuousAFibService INSTANCE = new ConvertContinuousAFibService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final long AFIB_UNIT_DURATION = 71;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int TIME_UNIT_SECOND = 60;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int TIME_UNIT_MINUTE_ONE = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int TIME_UNIT_MINUTE_HALF = 30;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final long TIME_UNIT_MILLS = 1000;

    private ConvertContinuousAFibService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(AFibData aFibData, AFibData aFibData2) {
        return Intrinsics.compare(aFibData.getTimestamp(), aFibData2.getTimestamp());
    }

    private final boolean c(int value) {
        return value == 1;
    }

    private final boolean d(AFibData lastAFib) {
        return lastAFib == null || !c(lastAFib.getValue());
    }

    @NotNull
    public final HealthEvents getAFibEvents(@NotNull String uid, @NotNull List<AFibData> data) {
        g.sortWith(data, new Comparator() { // from class: yz0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ConvertContinuousAFibService.b((AFibData) obj, (AFibData) obj2);
            }
        });
        AFibData aFibData = null;
        HealthEvents healthEvents = new HealthEvents(null, 1, null);
        HashMap map = new HashMap();
        long timestamp = -1;
        for (AFibData aFibData2 : data) {
            ConvertContinuousAFibService convertContinuousAFibService = INSTANCE;
            if (convertContinuousAFibService.c(aFibData2.getValue())) {
                if (convertContinuousAFibService.d(aFibData)) {
                    timestamp = aFibData2.getTimestamp();
                    map.put(Long.valueOf(timestamp), new ArrayList());
                    ((List) map.get(Long.valueOf(timestamp))).add(aFibData2);
                } else if (convertContinuousAFibService.c(aFibData.getValue())) {
                    ((List) map.get(Long.valueOf(timestamp))).add(aFibData2);
                }
            }
            aFibData = aFibData2;
        }
        for (Map.Entry entry : map.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            long timestamp2 = (((AFibData) list.get(list.size() - 1)).getTimestamp() - jLongValue) + AFIB_UNIT_DURATION;
            int i = ((int) timestamp2) / 60;
            if (timestamp2 % ((long) 60) >= 30) {
                i++;
            }
            int i2 = i <= 0 ? 1 : i;
            AFibData aFibData3 = (AFibData) list.get(0);
            healthEvents.getItems().add(new HealthEvents.EventItem(uid, "heart_health", 0, null, null, 0, null, PostAFibUseCase.PARAM_SUBTYPE_ABNORMAL_HEART, (jLongValue - AFIB_UNIT_DURATION) * 1000, GsonConvertorKt.toJson(new HeartHealthExtra(i2, 0, 0, null, ((AFibData) list.get(0)).getDeviceSource(), aFibData3.getAppName(), aFibData3.getSn(), aFibData3.getDeviceId(), 14, null)), null, 1148, null));
        }
        return healthEvents;
    }
}
