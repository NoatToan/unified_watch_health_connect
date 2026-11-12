package com.xiaomi.hm.health.sleep.repository;

import com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.device.sport.OriginSportData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/HeartRateRepo;", "Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "", "data", "", "", "jsonToHrList", "userId", "date", "", "queryMiliDateHr", "queryEarbudDateHr", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeartRateRepo implements IHeartRateRepo {
    private final List<Integer> jsonToHrList(String data) {
        byte[] data2;
        List<Byte> list;
        OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(data);
        int i = 0;
        if (originSportDataJsonToSportData == null || (data2 = originSportDataJsonToSportData.getData()) == null || (list = ArraysKt___ArraysKt.toList(data2)) == null) {
            ArrayList arrayList = new ArrayList(1440);
            while (i < 1440) {
                i++;
                arrayList.add(0);
            }
            return arrayList;
        }
        if (!(list.size() == 11520)) {
            ArrayList arrayList2 = new ArrayList(1440);
            while (i < 1440) {
                i++;
                arrayList2.add(0);
            }
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((Number) obj).byteValue();
            if ((i2 + (-3)) % 8 == 0) {
                arrayList3.add(obj);
            }
            i2 = i3;
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            byte bByteValue = (byte) (((Number) it2.next()).byteValue() & (-1));
            if (bByteValue == 254) {
                bByteValue = 0;
            }
            arrayList4.add(Integer.valueOf(bByteValue));
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo
    @NotNull
    public List<Integer> queryEarbudDateHr(@NotNull String userId, @NotNull String date) {
        EarbudDateData earbudDateDataUniqueOrThrow;
        try {
            earbudDateDataUniqueOrThrow = HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().where(EarbudDateDataDao.Properties.Date.eq(date), new WhereCondition[0]).uniqueOrThrow();
        } catch (Exception unused) {
            earbudDateDataUniqueOrThrow = null;
        }
        ArrayList arrayList = new ArrayList();
        if (earbudDateDataUniqueOrThrow != null) {
            arrayList.addAll(jsonToHrList(earbudDateDataUniqueOrThrow.getData()));
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(1440);
            int i = 0;
            while (i < 1440) {
                i++;
                arrayList2.add(0);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo
    @NotNull
    public byte[] queryMiliDateHr(@NotNull String userId, @NotNull String date) {
        DateData dateDataUniqueOrThrow;
        byte[] data_hr;
        try {
            dateDataUniqueOrThrow = HMDaoManager.getInstance().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.eq(date), new WhereCondition[0]).uniqueOrThrow();
        } catch (Exception unused) {
            dateDataUniqueOrThrow = null;
        }
        DateData dateData = dateDataUniqueOrThrow;
        if (dateData != null && (data_hr = dateData.getData_hr()) != null) {
            int length = data_hr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte b = data_hr[i];
                i++;
                int i3 = i2 + 1;
                if (((byte) (b & (-1))) == 254) {
                    dateData.getData_hr()[i2] = 0;
                }
                i2 = i3;
            }
        }
        byte[] data_hr2 = dateData != null ? dateData.getData_hr() : null;
        return data_hr2 == null ? new byte[1440] : data_hr2;
    }
}
