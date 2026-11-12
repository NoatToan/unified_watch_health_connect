package com.mi.health_provider;

import android.os.RemoteException;
import com.mi.health_provider.HealthProviderApiImpl;
import com.mi.health_provider.data.MedicalAidRecord;
import com.mi.health_provider.data.RecentDailyDataItem;
import com.mi.health_provider.data.RecordValueItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.RecentAbnormalDataItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import defpackage.bxc;
import defpackage.dxc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/mi/health_provider/HealthProviderApiImpl;", "Lcom/mi/health_provider/a$a;", "Lcom/xiaomi/fit/fitness/export/data/item/RecentDailyDataItem;", "recentDailyDataItem", "Lcom/mi/health_provider/data/RecentDailyDataItem;", "convertHealthData", "(Lcom/xiaomi/fit/fitness/export/data/item/RecentDailyDataItem;)Lcom/mi/health_provider/data/RecentDailyDataItem;", "Lcom/xiaomi/fit/fitness/export/data/item/MedicalAidRecord;", "medicalAidRecord", "Lcom/mi/health_provider/data/MedicalAidRecord;", "convertMedicalCardData", "(Lcom/xiaomi/fit/fitness/export/data/item/MedicalAidRecord;)Lcom/mi/health_provider/data/MedicalAidRecord;", "Lbxc;", "callback", "", "getHealthData", "(Lbxc;)V", "Ldxc;", "getMedicalCardData", "(Ldxc;)V", "", "getVersion", "()I", "Lcom/mi/health_provider/HealthNoteDataProvider;", "healthNodeDataProvider", "Lcom/mi/health_provider/HealthNoteDataProvider;", "<init>", "()V", "Companion", "health-provider_release"}, k = 1, mv = {2, 0, 0})
public final class HealthProviderApiImpl extends a.AbstractBinderC0309a {

    @NotNull
    public static final String TAG = "HealthProviderApiImpl";
    public static final int health_provider_version = 1;

    @NotNull
    private final HealthNoteDataProvider healthNodeDataProvider = new HealthNoteDataProvider();

    private final RecentDailyDataItem convertHealthData(com.xiaomi.fit.fitness.export.data.item.RecentDailyDataItem recentDailyDataItem) {
        RecentDailyDataItem recentDailyDataItem2 = new RecentDailyDataItem();
        recentDailyDataItem2.setTime(recentDailyDataItem != null ? recentDailyDataItem.getTime() : 0L);
        if ((recentDailyDataItem != null ? recentDailyDataItem.getLastHrItem() : null) != null) {
            RecordValueItem recordValueItem = new RecordValueItem();
            HrItem lastHrItem = recentDailyDataItem.getLastHrItem();
            Intrinsics.checkNotNull(lastHrItem);
            recordValueItem.setValue(lastHrItem.getHr());
            HrItem lastHrItem2 = recentDailyDataItem.getLastHrItem();
            Intrinsics.checkNotNull(lastHrItem2);
            recordValueItem.setTime(lastHrItem2.getTime());
            recentDailyDataItem2.setLastHrItem(recordValueItem);
        }
        if ((recentDailyDataItem != null ? recentDailyDataItem.getLasSpo2Item() : null) != null) {
            RecordValueItem recordValueItem2 = new RecordValueItem();
            Spo2Item lasSpo2Item = recentDailyDataItem.getLasSpo2Item();
            Intrinsics.checkNotNull(lasSpo2Item);
            recordValueItem2.setValue(lasSpo2Item.getSpo2());
            Spo2Item lasSpo2Item2 = recentDailyDataItem.getLasSpo2Item();
            Intrinsics.checkNotNull(lasSpo2Item2);
            recordValueItem2.setTime(lasSpo2Item2.getTime());
            recentDailyDataItem2.setLasSpo2Item(recordValueItem2);
        }
        if ((recentDailyDataItem != null ? recentDailyDataItem.getAbnormalHighHrItem() : null) != null) {
            RecentAbnormalDataItem abnormalHighHrItem = recentDailyDataItem.getAbnormalHighHrItem();
            Intrinsics.checkNotNull(abnormalHighHrItem);
            com.mi.health_provider.data.RecentAbnormalDataItem recentAbnormalDataItem = new com.mi.health_provider.data.RecentAbnormalDataItem();
            recentAbnormalDataItem.setStartTime(abnormalHighHrItem.getStartTime());
            recentAbnormalDataItem.setEndTime(abnormalHighHrItem.getEndTime());
            recentAbnormalDataItem.setLowValue(abnormalHighHrItem.getLowValue());
            recentAbnormalDataItem.setHighValue(abnormalHighHrItem.getHighValue());
            recentAbnormalDataItem.setMulti(abnormalHighHrItem.getMulti());
            recentDailyDataItem2.setAbnormalHighHrItem(recentAbnormalDataItem);
        }
        if ((recentDailyDataItem != null ? recentDailyDataItem.getAbnormalLowHrItem() : null) != null) {
            RecentAbnormalDataItem abnormalLowHrItem = recentDailyDataItem.getAbnormalLowHrItem();
            Intrinsics.checkNotNull(abnormalLowHrItem);
            com.mi.health_provider.data.RecentAbnormalDataItem recentAbnormalDataItem2 = new com.mi.health_provider.data.RecentAbnormalDataItem();
            recentAbnormalDataItem2.setStartTime(abnormalLowHrItem.getStartTime());
            recentAbnormalDataItem2.setEndTime(abnormalLowHrItem.getEndTime());
            recentAbnormalDataItem2.setLowValue(abnormalLowHrItem.getLowValue());
            recentAbnormalDataItem2.setHighValue(abnormalLowHrItem.getHighValue());
            recentAbnormalDataItem2.setMulti(abnormalLowHrItem.getMulti());
            recentDailyDataItem2.setAbnormalHighHrItem(recentAbnormalDataItem2);
        }
        if ((recentDailyDataItem != null ? recentDailyDataItem.getAbnormalSpo2Item() : null) != null) {
            RecentAbnormalDataItem abnormalSpo2Item = recentDailyDataItem.getAbnormalSpo2Item();
            Intrinsics.checkNotNull(abnormalSpo2Item);
            com.mi.health_provider.data.RecentAbnormalDataItem recentAbnormalDataItem3 = new com.mi.health_provider.data.RecentAbnormalDataItem();
            recentAbnormalDataItem3.setStartTime(abnormalSpo2Item.getStartTime());
            recentAbnormalDataItem3.setEndTime(abnormalSpo2Item.getEndTime());
            recentAbnormalDataItem3.setLowValue(abnormalSpo2Item.getLowValue());
            recentAbnormalDataItem3.setHighValue(abnormalSpo2Item.getHighValue());
            recentAbnormalDataItem3.setMulti(abnormalSpo2Item.getMulti());
            recentDailyDataItem2.setAbnormalHighHrItem(recentAbnormalDataItem3);
        }
        return recentDailyDataItem2;
    }

    private final MedicalAidRecord convertMedicalCardData(com.xiaomi.fit.fitness.export.data.item.MedicalAidRecord medicalAidRecord) {
        MedicalAidRecord medicalAidRecord2 = new MedicalAidRecord();
        medicalAidRecord2.setName(medicalAidRecord.getName());
        medicalAidRecord2.setGender(medicalAidRecord.getGender());
        medicalAidRecord2.setAge(medicalAidRecord.getAge());
        medicalAidRecord2.setBlood(medicalAidRecord.getBlood());
        medicalAidRecord2.setAllergy(medicalAidRecord.getAllergy());
        medicalAidRecord2.setDisease(medicalAidRecord.getDisease());
        medicalAidRecord2.setMedical(medicalAidRecord.getMedical());
        return medicalAidRecord2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHealthData$lambda$0(bxc bxcVar, HealthProviderApiImpl this$0, com.xiaomi.fit.fitness.export.data.item.RecentDailyDataItem recentDailyDataItem) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "RecentDailyDataItem : " + recentDailyDataItem);
        if (bxcVar != null) {
            bxcVar.E0(this$0.convertHealthData(recentDailyDataItem));
        }
        return Unit.INSTANCE;
    }

    @Override // com.mi.health_provider.a
    public void getHealthData(@Nullable final bxc callback) {
        FitnessLogUtils.i(TAG, "getHealthData , callback:" + callback);
        this.healthNodeDataProvider.getHealthDailyRecord(new Function1() { // from class: s0c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HealthProviderApiImpl.getHealthData$lambda$0(callback, this, (com.xiaomi.fit.fitness.export.data.item.RecentDailyDataItem) obj);
            }
        });
    }

    @Override // com.mi.health_provider.a
    public void getMedicalCardData(@Nullable dxc callback) throws RemoteException {
        FitnessLogUtils.i(TAG, "getMedicalCardData callback:" + callback);
        com.xiaomi.fit.fitness.export.data.item.MedicalAidRecord medicalAidRecord = this.healthNodeDataProvider.getMedicalAidRecord();
        FitnessLogUtils.i(TAG, "medicalAidRecord : " + medicalAidRecord + " ");
        if (callback != null) {
            callback.W4(convertMedicalCardData(medicalAidRecord));
        }
    }

    @Override // com.mi.health_provider.a
    public int getVersion() {
        return 1;
    }
}
