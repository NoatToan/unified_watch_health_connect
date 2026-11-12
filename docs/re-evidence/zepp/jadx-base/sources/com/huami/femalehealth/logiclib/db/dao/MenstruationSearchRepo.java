package com.huami.femalehealth.logiclib.db.dao;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.dto.Section;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.ext.DtoExKt;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0016\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/dao/MenstruationSearchRepo;", "", "Ljava/util/Date;", "start", "end", "", "Lcom/huami/femalehealth/logiclib/dto/Section;", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "c", "records", "a", "findAll", "", "sId", "findByServerId", "findByDateRange", "findByDateRangeKeepComplete", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "queryLastMenstruation2", "", com.google.android.exoplayer2.text.ttml.b.A0, "ascend", "findRecords", "findMenstruationServerId", "getIsEnd", "TAG", "Ljava/lang/String;", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationSearchRepo {

    @NotNull
    public static final MenstruationSearchRepo INSTANCE = new MenstruationSearchRepo();

    @NotNull
    public static final String TAG = "MenstruationDao";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<MenstruationRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("findAll all data = ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "findByDateRangeKeepComplete error " + this.a + ".message";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MenstruationRecord menstruationRecord) {
            super(0);
            this.a = menstruationRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("findMenstruationServerId, sId null, latest=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Date date, Date date2, String str) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "findMenstruationServerId section: " + NumberExtKt.dateFormat(this.a.getTime()) + " - " + NumberExtKt.dateFormat(this.b.getTime()) + ", sId=" + ((Object) this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<Section, List<MenstruationRecord>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Map<Section, ? extends List<MenstruationRecord>> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("findMenstruationServerId not single, map size=", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getIsEnd spend time:", Long.valueOf(System.currentTimeMillis() - this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Ref.ObjectRef<HistoryItemBean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, Date date, Ref.ObjectRef<HistoryItemBean> objectRef) {
            super(0);
            this.a = j;
            this.b = date;
            this.c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "queryLastMenstruation2 spend time:" + (System.currentTimeMillis() - this.a) + " day=" + DateHelper.convertUTCDate$default(DateHelper.INSTANCE, this.b.getTime(), false, 2, null) + " result =" + this.c.element;
        }
    }

    private MenstruationSearchRepo() {
    }

    private final List<MenstruationRecord> a(List<MenstruationRecord> records, Date start, Date end) {
        Object next;
        if (records.isEmpty() && start == null && end == null) {
            return records;
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(records, new Comparator() { // from class: com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo$fill$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((MenstruationRecord) t).getDate(), ((MenstruationRecord) t2).getDate());
            }
        });
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) records);
        Date date = start == null ? ((MenstruationRecord) CollectionsKt.first(listSortedWith)).getDate() : start;
        Date date2 = end == null ? ((MenstruationRecord) CollectionsKt.last(listSortedWith)).getDate() : end;
        ArrayList arrayList = new ArrayList();
        long time = date.getTime();
        long j = 86400000;
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(time, date2.getTime(), 86400000L);
        if (time <= progressionLastElement) {
            while (true) {
                long j2 = time + j;
                Iterator it2 = listSortedWith.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((MenstruationRecord) next).getDate().getTime() == AidKt.toMilli(AidKt.toDateTriple(new Milli(time))).getValue()));
                if (next == null) {
                    MenstruationRecord menstruationRecord = new MenstruationRecord(new Date(time), false);
                    mutableList.add(menstruationRecord);
                    arrayList.add(menstruationRecord);
                }
                if (time == progressionLastElement) {
                    break;
                }
                time = j2;
                j = 86400000;
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo$fill$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationRecord) t).getDate().getTime()), Long.valueOf(((MenstruationRecord) t2).getDate().getTime()));
            }
        });
    }

    public static /* synthetic */ List b(MenstruationSearchRepo menstruationSearchRepo, List list, Date date, Date date2, int i, Object obj) {
        if ((i & 2) != 0) {
            date = null;
        }
        if ((i & 4) != 0) {
            date2 = null;
        }
        return menstruationSearchRepo.a(list, date, date2);
    }

    private final Map<Section, List<MenstruationRecord>> c(Date start, Date end) {
        Object next;
        Object next2;
        long time;
        long time2;
        long jLongValue;
        Boolean isEnd;
        List<MenstruationRecord> listFindByDateRangeKeepComplete = findByDateRangeKeepComplete(start, end);
        Iterator<T> it2 = listFindByDateRangeKeepComplete.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long time3 = ((MenstruationRecord) next).getDate().getTime();
                do {
                    Object next3 = it2.next();
                    long time4 = ((MenstruationRecord) next3).getDate().getTime();
                    if (time3 > time4) {
                        next = next3;
                        time3 = time4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        MenstruationRecord menstruationRecord = (MenstruationRecord) next;
        Iterator<T> it3 = listFindByDateRangeKeepComplete.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                long time5 = ((MenstruationRecord) next2).getDate().getTime();
                do {
                    Object next4 = it3.next();
                    long time6 = ((MenstruationRecord) next4).getDate().getTime();
                    if (time5 < time6) {
                        next2 = next4;
                        time5 = time6;
                    }
                } while (it3.hasNext());
            }
        } else {
            next2 = null;
        }
        MenstruationRecord menstruationRecord2 = (MenstruationRecord) next2;
        Date date = menstruationRecord == null ? null : menstruationRecord.getDate();
        if (date == null) {
            date = new Date(start.getTime());
        }
        Date date2 = menstruationRecord2 == null ? null : menstruationRecord2.getDate();
        if (date2 == null) {
            date2 = new Date(start.getTime());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<MenstruationRecord> it4 = a(listFindByDateRangeKeepComplete, date, date2).iterator();
        loop0: while (true) {
            time = 0;
            time2 = 0;
            jLongValue = 0;
            isEnd = null;
            while (true) {
                if (!it4.hasNext()) {
                    break loop0;
                }
                MenstruationRecord next5 = it4.next();
                if (next5.getInPeriod()) {
                    if (time == 0) {
                        time = next5.getDate().getTime();
                    }
                    if (next5.getDate().getTime() > time2) {
                        time2 = next5.getDate().getTime();
                    }
                    Long l = next5.getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String();
                    jLongValue = l == null ? 0L : l.longValue();
                    isEnd = next5.getIsEnd();
                    arrayList.add(next5);
                } else if (time <= 0 || time2 <= 0 || time > time2) {
                }
            }
            linkedHashMap.put(new Section(time, time2, jLongValue, null, 8, null), arrayList);
            arrayList.clear();
        }
        if (time > 0 && time2 > 0 && time <= time2) {
            linkedHashMap.put(new Section(time, time2, jLongValue, isEnd), arrayList);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ List findRecords$default(MenstruationSearchRepo menstruationSearchRepo, boolean z, boolean z2, Date date, Date date2, int i, Object obj) {
        if ((i & 4) != 0) {
            date = null;
        }
        if ((i & 8) != 0) {
            date2 = null;
        }
        return menstruationSearchRepo.findRecords(z, z2, date, date2);
    }

    @NotNull
    public final List<MenstruationRecord> findAll() {
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadAllHistory = DataCacheManager.INSTANCE.loadAllHistory(true);
        if (!(apiResponseLoadAllHistory instanceof ApiSuccessResponse)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List items = ((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory).getBody()).getItems();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            h.addAll(arrayList, DtoExKt.toMenstruationRecordList((HistoryItemBean) it2.next()));
        }
        HMLog.info("xys_MenstruationDao", new a(arrayList));
        return arrayList;
    }

    @NotNull
    public final List<MenstruationRecord> findByDateRange(@NotNull Date start, @NotNull Date end) {
        return findByDateRangeKeepComplete(start, end);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    @NotNull
    public final synchronized List<MenstruationRecord> findByDateRangeKeepComplete(@NotNull Date start, @NotNull Date end) {
        boolean z;
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadAllHistory = DataCacheManager.INSTANCE.loadAllHistory(true);
        if (apiResponseLoadAllHistory instanceof ApiSuccessResponse) {
            List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory).getBody()).getItems(), new Comparator() { // from class: com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo$findByDateRangeKeepComplete$lambda-7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryItemBean) t).getMenstrualPeriod()), Long.valueOf(((HistoryItemBean) t2).getMenstrualPeriod()));
                }
            });
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listSortedWith) {
                    HistoryItemBean historyItemBean = (HistoryItemBean) obj;
                    if (historyItemBean.getMenstrualPeriod() <= start.getTime() || historyItemBean.getMenstrualEndTime().longValue() >= end.getTime()) {
                        long menstrualPeriod = historyItemBean.getMenstrualPeriod();
                        long jLongValue = historyItemBean.getMenstrualEndTime().longValue();
                        long time = start.getTime();
                        if (!(menstrualPeriod <= time && time <= jLongValue)) {
                            long menstrualPeriod2 = historyItemBean.getMenstrualPeriod();
                            long jLongValue2 = historyItemBean.getMenstrualEndTime().longValue();
                            long time2 = end.getTime();
                            z = (menstrualPeriod2 > time2 ? 1 : (menstrualPeriod2 == time2 ? 0 : -1)) <= 0 && (time2 > jLongValue2 ? 1 : (time2 == jLongValue2 ? 0 : -1)) <= 0;
                        }
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    h.addAll(arrayList2, DtoExKt.toMenstruationRecordList((HistoryItemBean) it2.next()));
                }
                return arrayList2;
            } catch (Exception e2) {
                HMLog.warn$default(TAG, null, new b(e2), 2, null);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final List<MenstruationRecord> findByServerId(@NotNull String sId) {
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadAllHistory = DataCacheManager.INSTANCE.loadAllHistory(true);
        HistoryItemBean historyItemBean = null;
        Object obj = null;
        if (apiResponseLoadAllHistory instanceof ApiSuccessResponse) {
            for (Object obj2 : ((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory).getBody()).getItems()) {
                if (Intrinsics.areEqual(((HistoryItemBean) obj2).getId(), sId)) {
                    obj = obj2;
                    break;
                }
            }
            historyItemBean = (HistoryItemBean) obj;
        }
        return DtoExKt.toMenstruationRecordList(historyItemBean);
    }

    @Nullable
    public final String findMenstruationServerId(@NotNull Date start, @NotNull Date end) {
        Object next;
        Map<Section, List<MenstruationRecord>> mapC = c(start, end);
        if (mapC.size() == 1) {
            Map.Entry entry = (Map.Entry) CollectionsKt.first(mapC.entrySet());
            if (((Section) entry.getKey()).getStart() == start.getTime() && ((Section) entry.getKey()).getEnd() == end.getTime()) {
                Iterator it2 = ((Iterable) entry.getValue()).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Long l = ((MenstruationRecord) next).getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String();
                        long jLongValue = l == null ? 0L : l.longValue();
                        do {
                            Object next2 = it2.next();
                            Long l2 = ((MenstruationRecord) next2).getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String();
                            long jLongValue2 = l2 == null ? 0L : l2.longValue();
                            if (jLongValue < jLongValue2) {
                                next = next2;
                                jLongValue = jLongValue2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                MenstruationRecord menstruationRecord = (MenstruationRecord) next;
                if (menstruationRecord != null) {
                    String sId = menstruationRecord.getSId();
                    if (sId == null) {
                        HMLog.error$default(TAG, null, null, new c(menstruationRecord), 6, null);
                    } else {
                        HMLog.info(TAG, new d(start, end, sId));
                    }
                    return sId;
                }
            }
        } else {
            HMLog.error$default(TAG, null, null, new e(mapC), 6, null);
        }
        return null;
    }

    @NotNull
    public final List<MenstruationRecord> findRecords(boolean filled, boolean ascend, @Nullable Date start, @Nullable Date end) {
        List<MenstruationRecord> listFindAll = (start == null || end == null) ? findAll() : findByDateRangeKeepComplete(start, end);
        if (filled) {
            listFindAll = a(listFindAll, start, end);
        }
        return ascend ? CollectionsKt___CollectionsKt.sortedWith(listFindAll, new Comparator() { // from class: com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo$findRecords$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationRecord) t).getDate().getTime()), Long.valueOf(((MenstruationRecord) t2).getDate().getTime()));
            }
        }) : CollectionsKt___CollectionsKt.sortedWith(listFindAll, new Comparator() { // from class: com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo$findRecords$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationRecord) t2).getDate().getTime()), Long.valueOf(((MenstruationRecord) t).getDate().getTime()));
            }
        });
    }

    @WorkerThread
    public final boolean getIsEnd(@NotNull String sId) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadAllHistory = DataCacheManager.INSTANCE.loadAllHistory(true);
        HistoryItemBean historyItemBean = null;
        Object obj = null;
        if (apiResponseLoadAllHistory instanceof ApiSuccessResponse) {
            for (Object obj2 : ((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory).getBody()).getItems()) {
                if (Intrinsics.areEqual(((HistoryItemBean) obj2).getId(), sId)) {
                    obj = obj2;
                    break;
                }
            }
            historyItemBean = (HistoryItemBean) obj;
        }
        HMLog.info("xys_MenstruationDao", new f(jCurrentTimeMillis));
        if (historyItemBean == null) {
            return true;
        }
        return historyItemBean.isEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    @Nullable
    public final HistoryItemBean queryLastMenstruation2(@NotNull Date d2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadAllHistory = DataCacheManager.INSTANCE.loadAllHistory(true);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = 0;
        Object obj = null;
        if (apiResponseLoadAllHistory instanceof ApiSuccessResponse) {
            long jResetZeroHour = AidKt.resetZeroHour(d2.getTime());
            for (Object obj2 : CollectionsKt___CollectionsKt.sortedWith(((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory).getBody()).getItems(), new Comparator() { // from class: com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo$queryLastMenstruation2$lambda-12$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryItemBean) t3).getMenstrualPeriod()), Long.valueOf(((HistoryItemBean) t2).getMenstrualPeriod()));
                }
            })) {
                if (((HistoryItemBean) obj2).getMenstrualPeriod() <= jResetZeroHour) {
                    obj = obj2;
                    break;
                }
            }
            t = (HistoryItemBean) obj;
        }
        objectRef.element = t;
        HMLog.info("xys_MenstruationDao", new g(jCurrentTimeMillis, d2, objectRef));
        return (HistoryItemBean) objectRef.element;
    }
}
