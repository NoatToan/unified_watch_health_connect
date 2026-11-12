package com.huami.health.afppg.service;

import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.DeviceConfig;
import com.huami.health.afppg.model.HighLowHrData;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/health/afppg/service/HighLowHrAnalysisService;", "", "", "result", "", "Lcom/huami/health/afppg/model/HighLowHrData;", "a", "Lcom/huami/health/afppg/model/DeviceConfig;", "config", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "fragments", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "createHLHRData", "", "Ljava/lang/String;", "PARAM_SUBTYPE_HIGH_HR", "b", "PARAM_SUBTYPE_LOW_HR", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class HighLowHrAnalysisService {

    @NotNull
    public static final HighLowHrAnalysisService INSTANCE = new HighLowHrAnalysisService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_SUBTYPE_HIGH_HR = "high_hr";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_SUBTYPE_LOW_HR = "low_hr";

    private HighLowHrAnalysisService() {
    }

    private final List<HighLowHrData> a(byte[] result) {
        ArrayList arrayList = null;
        if (result != null) {
            int i = 0;
            if (((result.length == 0) ^ true ? result : null) != null) {
                arrayList = new ArrayList();
                while (i < result.length) {
                    int iByteToInt = PPGExtensionsKt.byteToInt(result, i, 4);
                    int i2 = i + 4;
                    long jByteToLong = PPGExtensionsKt.byteToLong(result, i2, 8);
                    int i3 = i2 + 8;
                    int iByteToInt2 = PPGExtensionsKt.byteToInt(result, i3, 4);
                    int i4 = i3 + 4;
                    int iByteToInt3 = PPGExtensionsKt.byteToInt(result, i4, 4);
                    int i5 = i4 + 4;
                    int iByteToInt4 = PPGExtensionsKt.byteToInt(result, i5, 4);
                    int i6 = i5 + 4;
                    int iByteToInt5 = PPGExtensionsKt.byteToInt(result, i6, 4);
                    i = i6 + 4;
                    arrayList.add(new HighLowHrData(iByteToInt, jByteToLong, iByteToInt2, iByteToInt3, iByteToInt4, iByteToInt5));
                }
            }
        }
        return arrayList == null ? (List) b() : arrayList;
    }

    private static final Void b() {
        return null;
    }

    @NotNull
    public final List<HREventData> createHLHRData(@NotNull DeviceConfig config, @NotNull List<AFPPGDataFragment> fragments) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = fragments.iterator();
        while (it2.hasNext()) {
            List<HighLowHrData> listA = INSTANCE.a(CollectionsKt___CollectionsKt.toByteArray(((AFPPGDataFragment) it2.next()).getData()));
            List listEmptyList = null;
            if (listA != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listA, 10));
                for (HighLowHrData highLowHrData : listA) {
                    long timestamp = highLowHrData.getTimestamp() * ((long) 1000);
                    int deviceSource = config.getDeviceSource();
                    int maxHr = highLowHrData.getMaxHr();
                    int minHr = highLowHrData.getMinHr();
                    int duration = highLowHrData.getDuration();
                    String fwVer = config.getFwVer();
                    String sn = config.getSn();
                    arrayList2.add(new HREventData(config.getUserId(), "heart_health", highLowHrData.getAfResult() == 100 ? PARAM_SUBTYPE_HIGH_HR : PARAM_SUBTYPE_LOW_HR, timestamp, null, duration, maxHr, minHr, deviceSource, null, config.getDeviceId(), sn, fwVer, 0, PPGExtensionsKt.toYMDHMS$default(highLowHrData.getTimestamp(), null, 1, null), 8720, null));
                }
                listEmptyList = arrayList2;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList.addAll(listEmptyList);
        }
        return arrayList;
    }
}
