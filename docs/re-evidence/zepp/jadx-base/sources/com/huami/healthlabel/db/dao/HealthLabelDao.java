package com.huami.healthlabel.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.healthlabel.db.po.HealthLabel;
import com.huami.healthlabel.koin.LabelScopeNames;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J0\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\f2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH'J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\tH'J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H'J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH'J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH'¨\u0006\u0018"}, d2 = {"Lcom/huami/healthlabel/db/dao/HealthLabelDao;", "", "Lcom/huami/healthlabel/db/po/HealthLabel;", LabelScopeNames.HEALTH_LABEL, "", "insertLabel", "", "", "limit", "", "start", "end", "Landroidx/lifecycle/LiveData;", "queryLabel", "queryLabelList", "searchTime", "querySingleLabel", "", "labelText", "querySameLabels", "label", "startTime", "endTime", "deleteLabel", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public interface HealthLabelDao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData queryLabel$default(HealthLabelDao healthLabelDao, int i, long j, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryLabel");
            }
            if ((i2 & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return healthLabelDao.queryLabel(i, j3, j2);
        }

        public static /* synthetic */ List queryLabelList$default(HealthLabelDao healthLabelDao, int i, long j, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryLabelList");
            }
            if ((i2 & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return healthLabelDao.queryLabelList(i, j3, j2);
        }
    }

    @Query("delete from health_table where timestamp>=:startTime and timestamp<:endTime")
    void deleteLabel(long startTime, long endTime);

    @Query("delete from health_table where labelText==:label and timestamp>=:startTime and timestamp<:endTime")
    void deleteLabel(@NotNull String label, long startTime, long endTime);

    @Insert(onConflict = 1)
    void insertLabel(@NotNull HealthLabel healthLabel);

    @Insert(onConflict = 1)
    void insertLabel(@NotNull List<HealthLabel> healthLabel);

    @Query("select * from health_table where timestamp>=:start and timestamp<:end order by timestamp asc limit:limit")
    @NotNull
    LiveData<List<HealthLabel>> queryLabel(int limit, long start, long end);

    @Query("select * from health_table where timestamp>=:start and timestamp<:end order by timestamp desc limit:limit")
    @NotNull
    List<HealthLabel> queryLabelList(int limit, long start, long end);

    @Query("select * from health_table where timestamp>=:start and timestamp<:end and labelText==:labelText")
    @NotNull
    List<HealthLabel> querySameLabels(long start, long end, @NotNull String labelText);

    @Query("select * from health_table where timestamp==:searchTime")
    @Nullable
    HealthLabel querySingleLabel(long searchTime);
}
