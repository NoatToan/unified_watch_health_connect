package com.xiaomi.fit.fitness.export.api;

import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J`\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0015H&J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0015H&J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\fH&J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\fH&J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH&J\b\u0010$\u001a\u00020\fH&J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\fH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150)H&J\u0012\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u0003H&J\u0018\u0010,\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH&¨\u0006-"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "", "insert", "", "record", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "deleteRecord", "updateRecord", "pre", "dest", "deleteSymptoms", "", "", "batchActionRecord", "updateSummary", "deleteToggle", "insertToggle", "updateOri", "Lkotlin/Pair;", "getLatestRecordByPage", "page", "", "pageNum", "getLatestEndedRecord", "startMills", "limit", "getLatestRecord", "getPeriod", "endMills", "getFirstAfter", "mills", "getBeforePeriod", "saveSymptom", EcgReportKey.symptom, "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "getSymptom", "getLastModifySec", "updateLastModify", "", "sec", "observerReportChange", "Lkotlinx/coroutines/flow/Flow;", "aggregateData", "force", "getCurseMaxUpdateTimeSec", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CurseApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void aggregateData$default(CurseApi curseApi, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: aggregateData");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            curseApi.aggregateData(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean batchActionRecord$default(CurseApi curseApi, List list, List list2, List list3, Pair pair, List list4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchActionRecord");
            }
            if ((i & 1) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            if ((i & 2) != 0) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list5 = list2;
            if ((i & 4) != 0) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list6 = list3;
            if ((i & 8) != 0) {
                pair = null;
            }
            Pair pair2 = pair;
            if ((i & 16) != 0) {
                list4 = CollectionsKt__CollectionsKt.emptyList();
            }
            return curseApi.batchActionRecord(list, list5, list6, pair2, list4);
        }
    }

    void aggregateData(boolean force);

    boolean batchActionRecord(@NotNull List<Record> updateSummary, @NotNull List<Record> deleteToggle, @NotNull List<Record> insertToggle, @Nullable Pair<Record, Record> updateOri, @NotNull List<Long> deleteSymptoms);

    boolean deleteRecord(@NotNull Record record);

    @Nullable
    Record getBeforePeriod(long startMills);

    long getCurseMaxUpdateTimeSec(long startMills, long endMills);

    @Nullable
    Record getFirstAfter(long mills);

    long getLastModifySec();

    @NotNull
    List<Record> getLatestEndedRecord(long startMills, int limit);

    @NotNull
    List<Record> getLatestRecord(long startMills, int limit);

    @NotNull
    List<Record> getLatestRecordByPage(int page, int pageNum);

    @NotNull
    List<Record> getPeriod(long startMills, long endMills);

    @NotNull
    WomenHealthSymptoms getSymptom(long mills);

    @NotNull
    List<WomenHealthSymptoms> getSymptom(long startMills, long endMills);

    boolean insert(@NotNull Record record);

    @NotNull
    Flow<Integer> observerReportChange();

    boolean saveSymptom(@NotNull WomenHealthSymptoms symptom);

    void updateLastModify(long sec);

    boolean updateRecord(@NotNull Record pre, @NotNull Record dest, @NotNull List<Long> deleteSymptoms);
}
