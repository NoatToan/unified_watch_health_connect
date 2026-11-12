package com.huami.healthlabel.repository;

import androidx.annotation.WorkerThread;
import androidx.p008lifecycle.LiveData;
import com.huami.healthlabel.db.po.HomeLabel;
import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J$\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b0\n2\b\b\u0002\u0010\t\u001a\u00020\u0007H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H'J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0016\u0010\u0014\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&JI\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H'J \u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H'J\b\u0010$\u001a\u00020\u0005H'J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020!H'¨\u0006'"}, d2 = {"Lcom/huami/healthlabel/repository/HealthLabelRepo;", "", "", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "labels", "", "updateHomeLabel", "", "deleteAndUpdateHomeLabel", "shouldFetch", "Landroidx/lifecycle/LiveData;", "Lcom/huami/healthlabel/repository/Resource;", "loadAllManagerLabel", "Lcom/huami/healthlabel/db/po/HomeLabel;", "loadAllManagerLabelFromLocal", "loadShowHomeLabel", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "labelHealthTag", "insertMyHealthRecord", "labelHealthTags", "insertMyHealthRecordFromDb", "", "limit", "", "startTime", "endTime", "nextTime", "loadRecordLabel", "(IJJLjava/lang/Long;)Landroidx/lifecycle/LiveData;", "reverse", "loadRecordLabelFromNet", "(IJJLjava/lang/Long;Z)Ljava/util/List;", "loadRecordLabelFromLocal", "", "labelText", "deleteRecordLabel", "clearHomeLabelCache", "body", "markDeleteHomeLabel", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public interface HealthLabelRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData loadAllManagerLabel$default(HealthLabelRepo healthLabelRepo, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAllManagerLabel");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return healthLabelRepo.loadAllManagerLabel(z);
        }

        public static /* synthetic */ LiveData loadRecordLabel$default(HealthLabelRepo healthLabelRepo, int i, long j, long j2, Long l, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRecordLabel");
            }
            if ((i2 & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Long.MAX_VALUE;
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                l = null;
            }
            return healthLabelRepo.loadRecordLabel(i, j3, j4, l);
        }

        public static /* synthetic */ List loadRecordLabelFromLocal$default(HealthLabelRepo healthLabelRepo, int i, long j, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRecordLabelFromLocal");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            if ((i2 & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return healthLabelRepo.loadRecordLabelFromLocal(i, j3, j2);
        }

        public static /* synthetic */ List loadRecordLabelFromNet$default(HealthLabelRepo healthLabelRepo, int i, long j, long j2, Long l, boolean z, int i2, Object obj) {
            if (obj == null) {
                return healthLabelRepo.loadRecordLabelFromNet(i, j, j2, (i2 & 8) != 0 ? null : l, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRecordLabelFromNet");
        }
    }

    @WorkerThread
    void clearHomeLabelCache();

    @WorkerThread
    boolean deleteAndUpdateHomeLabel(@NotNull List<HomeHealthLabel> labels);

    @WorkerThread
    boolean deleteRecordLabel(@NotNull String labelText, long startTime, long endTime);

    void insertMyHealthRecord(@NotNull HealthTagRecord labelHealthTag);

    void insertMyHealthRecordFromDb(@NotNull List<HealthTagRecord> labelHealthTags);

    @NotNull
    LiveData<Resource<List<HomeHealthLabel>>> loadAllManagerLabel(boolean shouldFetch);

    @WorkerThread
    @NotNull
    List<HomeLabel> loadAllManagerLabelFromLocal();

    @NotNull
    LiveData<Resource<List<HealthTagRecord>>> loadRecordLabel(int limit, long startTime, long endTime, @Nullable Long nextTime);

    @WorkerThread
    @NotNull
    List<HealthTagRecord> loadRecordLabelFromLocal(int limit, long startTime, long endTime);

    @NotNull
    List<HealthTagRecord> loadRecordLabelFromNet(int limit, long startTime, long endTime, @Nullable Long nextTime, boolean reverse);

    @WorkerThread
    @NotNull
    List<HomeLabel> loadShowHomeLabel();

    @WorkerThread
    void markDeleteHomeLabel(@NotNull String body);

    void updateHomeLabel(@NotNull List<HomeHealthLabel> labels);
}
