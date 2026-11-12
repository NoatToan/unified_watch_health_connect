package com.xiaomi.hm.health.device.feature.sync.analytic;

import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.report.speed.RateDto;
import com.huami.device.core.sync.report.speed.TransferItem;
import com.huami.device.core.sync.report.speed.TransferRateService;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApi;
import com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApiManager;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.DataTransferRate;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0018j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/analytic/SpeedRateAnalytic;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApi;", "Lcom/huami/device/core/sync/report/speed/TransferRateService;", "", "", "subTasks", "", "Lcom/huami/device/core/sync/report/speed/TransferItem;", "findSubTaskRate", "Lcom/huami/device/core/sync/api/type/JobType;", "type", "convertJobTypeToGDSPTypes", "", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/DataTransferRate;", "rate", "onRate", Configs.Params.RESET, "Lcom/huami/device/core/sync/report/speed/RateDto;", "findByType", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "dataMap", "Ljava/util/HashMap;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SpeedRateAnalytic implements DataTransferSniffApi, TransferRateService {

    @NotNull
    private static final String intentFilter = "SyncAnalytic";

    @NotNull
    private final HashMap<Integer, DataTransferRate> dataMap = new HashMap<>();

    @NotNull
    private final HMBaseDevice device;

    public SpeedRateAnalytic(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    private final Iterable<Integer> convertJobTypeToGDSPTypes(JobType type) {
        Iterable iterableArrayListOf;
        int value = type.getValue();
        JobType.Companion companion = JobType.INSTANCE;
        if (value == companion.getActivities().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 1);
        } else if (value == companion.getSportRecords().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 5, (byte) 6);
        } else if (value == companion.getHR().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 2);
        } else if (value == companion.getECG().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 3, (byte) 42);
        } else if (value == companion.getBODY_TEMPERATURE().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 4);
        } else if (value == companion.getDEVICE_STATISTIC().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 7);
        } else if (value == companion.getAF().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 8, (byte) 11, (byte) 30, (byte) 17);
        } else if (value == companion.getPAI().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 13);
        } else if (value == companion.getPRESSURE().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 19, (byte) 18);
        } else if (value == companion.getSPO2().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 37, (byte) 43, (byte) 39, (byte) 38, (byte) 40);
        } else if (value == companion.getFIRST_BEAT().getValue()) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 35, (byte) 36, Byte.valueOf(MiLiProProfile.ECF_WRITE_PAI_DATA));
        } else if (value == companion.getWEIGHT_FAT().getValue() || value == companion.getFEMALE_HEALTH().getValue()) {
            iterableArrayListOf = new ArrayList();
        } else if (value == 18) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 58);
        } else if (value == 16) {
            iterableArrayListOf = CollectionsKt__CollectionsKt.arrayListOf((byte) 52, (byte) 53, (byte) 54, (byte) 55);
        } else {
            iterableArrayListOf = value == 17 ? CollectionsKt__CollectionsKt.arrayListOf((byte) 56, (byte) 57) : CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableArrayListOf, 10));
        Iterator it2 = iterableArrayListOf.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it2.next()).byteValue()));
        }
        return arrayList;
    }

    private final List<TransferItem> findSubTaskRate(Iterable<Integer> subTasks) {
        Iterator<Integer> it2 = subTasks.iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            try {
                int iIntValue = it2.next().intValue();
                DataTransferRate dataTransferRate = this.dataMap.get(Integer.valueOf(iIntValue));
                int timeUsage = 0;
                int dataSize = dataTransferRate == null ? 0 : dataTransferRate.getDataSize();
                if (dataTransferRate != null) {
                    timeUsage = dataTransferRate.getTimeUsage();
                }
                arrayList.add(new TransferItem(iIntValue, dataSize, timeUsage));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    @Override // com.huami.device.core.sync.report.speed.TransferRateService
    @NotNull
    public RateDto findByType(@NotNull JobType type) {
        try {
            try {
                List<TransferItem> listFindSubTaskRate = findSubTaskRate(convertJobTypeToGDSPTypes(type));
                Iterator<T> it2 = listFindSubTaskRate.iterator();
                long dataSize = 0;
                while (it2.hasNext()) {
                    dataSize += ((TransferItem) it2.next()).getDataSize();
                }
                Iterator<T> it3 = listFindSubTaskRate.iterator();
                long bleCost = 0;
                while (it3.hasNext()) {
                    bleCost += ((TransferItem) it3.next()).getBleCost();
                }
                return new RateDto(type, dataSize, bleCost, listFindSubTaskRate);
            } catch (Exception unused) {
                return new RateDto(type, -1L, -1L, CollectionsKt__CollectionsKt.emptyList());
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApi
    public void onRate(@NotNull DataTransferRate rate) {
        this.dataMap.put(Integer.valueOf(rate.getType()), rate);
    }

    public final void register() {
        DataTransferSniffApiManager.INSTANCE.register(intentFilter, this);
    }

    public final void reset() {
        this.dataMap.clear();
    }

    public final void unregister() {
        DataTransferSniffApiManager.INSTANCE.unregister(intentFilter);
    }
}
