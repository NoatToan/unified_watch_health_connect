package com.xiaomi.hm.health.running.calori.source;

import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.running.EnergyDataProvider;
import com.xiaomi.hm.health.running.OverlapRemover;
import com.xiaomi.hm.health.running.TimeRange;
import com.xiaomi.hm.health.running.calori.CalorieDeviceFilterKt;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/source/CalorieMediator;", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieMediator;", "", "startTime", "endTime", "", "getSumCalori", "", "Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "getDistinctStep", "Lcom/huami/sport/service/model/HistoryRecord;", "get4ByteDeviceSports", "getDistinctAppSport", "", "c", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CalorieMediator extends ICalorieMediator {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "CalorieCheck";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HistoryRecord, TimeRange> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
            return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<HistoryRecord, TimeRange> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
            return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HistoryRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HistoryRecord historyRecord) {
            super(0);
            this.a = historyRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "appSport " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HistoryRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HistoryRecord historyRecord) {
            super(0);
            this.a = historyRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceSport " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<EnergyDataProvider.EnergyData, TimeRange> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeRange invoke(@NotNull EnergyDataProvider.EnergyData energyData) {
            return new TimeRange(energyData.getStartTime(), energyData.getStartTime() + EnergyDataProvider.INSTANCE.getCALORIE_TIME_DURATION());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<HistoryRecord, TimeRange> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
            return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ EnergyDataProvider.EnergyData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnergyDataProvider.EnergyData energyData) {
            super(0);
            this.a = energyData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "energyData EnergyData(startTime=" + this.a.getStartTime() + ", cal=" + this.a.getCal() + ")}";
        }
    }

    @NotNull
    public final List<HistoryRecord> get4ByteDeviceSports(long startTime, long endTime) {
        DeviceCalorieColleague mDeviceCalorieColleague = getMDeviceCalorieColleague();
        List<HistoryRecord> sportList = mDeviceCalorieColleague == null ? null : mDeviceCalorieColleague.getSportList(startTime, endTime);
        if (sportList == null) {
            sportList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : sportList) {
            if (CalorieDeviceFilterKt.is4ByteDevice(SportDeviceManager.convertSportSource2DeviceValue(((HistoryRecord) obj).getSource().intValue()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.running.calori.source.ICalorieMediator
    @NotNull
    public List<HistoryRecord> getDistinctAppSport(long startTime, long endTime) {
        ICalorieColleague mAppCalorieColleague = getMAppCalorieColleague();
        List<HistoryRecord> sportList = mAppCalorieColleague == null ? null : mAppCalorieColleague.getSportList(startTime, endTime);
        if (sportList != null) {
            Iterator<T> it2 = sportList.iterator();
            while (it2.hasNext()) {
                HMLog.info(this.TAG, new c((HistoryRecord) it2.next()));
            }
        }
        if (sportList == null) {
            sportList = CollectionsKt__CollectionsKt.emptyList();
        }
        DeviceCalorieColleague mDeviceCalorieColleague = getMDeviceCalorieColleague();
        List<HistoryRecord> sportList2 = mDeviceCalorieColleague != null ? mDeviceCalorieColleague.getSportList(startTime, endTime) : null;
        if (sportList2 != null) {
            Iterator<T> it3 = sportList2.iterator();
            while (it3.hasNext()) {
                HMLog.info(this.TAG, new d((HistoryRecord) it3.next()));
            }
        }
        if (sportList2 == null) {
            sportList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt___CollectionsKt.plus((Collection) OverlapRemover.INSTANCE.removeOverlaps(sportList, sportList2, a.a, b.a), (Iterable) get4ByteDeviceSports(startTime, endTime));
    }

    @Override // com.xiaomi.hm.health.running.calori.source.ICalorieMediator
    @NotNull
    public List<EnergyDataProvider.EnergyData> getDistinctStep(long startTime, long endTime) {
        DeviceCalorieColleague mDeviceCalorieColleague = getMDeviceCalorieColleague();
        List<EnergyDataProvider.EnergyData> stepCalorie = mDeviceCalorieColleague == null ? null : mDeviceCalorieColleague.getStepCalorie(startTime, endTime);
        if (stepCalorie != null) {
            for (EnergyDataProvider.EnergyData energyData : stepCalorie) {
                if (energyData.getCal() > 0) {
                    HMLog.info(this.TAG, new g(energyData));
                }
            }
        }
        if (stepCalorie == null) {
            stepCalorie = CollectionsKt__CollectionsKt.emptyList();
        }
        return OverlapRemover.INSTANCE.removeOverlaps(stepCalorie, get4ByteDeviceSports(startTime, endTime), e.a, f.a);
    }

    @Override // com.xiaomi.hm.health.running.calori.source.ICalorieMediator
    public int getSumCalori(long startTime, long endTime) {
        List<HistoryRecord> distinctAppSport = getDistinctAppSport(startTime, endTime);
        Iterator<T> it2 = getDistinctStep(startTime, endTime).iterator();
        int consumeCal = 0;
        int cal = 0;
        while (it2.hasNext()) {
            cal += (int) ((EnergyDataProvider.EnergyData) it2.next()).getCal();
        }
        Iterator<T> it3 = distinctAppSport.iterator();
        while (it3.hasNext()) {
            consumeCal += (int) ((HistoryRecord) it3.next()).getConsumeCal();
        }
        return cal + consumeCal;
    }
}
