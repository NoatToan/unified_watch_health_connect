package com.huami.phn.core.source.impl;

import android.content.Context;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao;
import com.huami.phn.core.source.impl.db.PHNDataBase;
import com.huami.phn.core.source.impl.db.PHNProjectRecordDao;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b/\u00100J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0016J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0016J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0016\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u001dH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016R\u0019\u0010%\u001a\u00020 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001d\u0010.\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b!\u0010-¨\u00061"}, d2 = {"Lcom/huami/phn/core/source/impl/LocalDataSourceImpl;", "Lcom/huami/phn/core/source/LocalDataSource;", "", "Lcom/huami/phn/core/model/PHNProjectRecord;", "records", "", "saveProjectFromWeb", "saveOrUpdateProject", "", "timestamp", "queryProject", "", "count", "lastTimestamp", "(ILjava/lang/Long;)Ljava/util/List;", "queryUnSyncedProject", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "entities", "saveDailyResultFromWeb", "saveDailyResult", "queryDailyResult", "queryUnSyncedDailyResult", "projectId", "queryDailyResultByPlanId", "(ILjava/lang/Long;J)Ljava/util/List;", "queryOldestDailyResultByPlanId", "queryOldestDailyResult", "", "clearDBData", "Lkotlinx/coroutines/flow/Flow;", "queryLatestProjectAsFlow", "queryOldestProject", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/phn/core/source/impl/db/PHNProjectRecordDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/phn/core/source/impl/db/PHNProjectRecordDao;", "phnRecordDao", "Lcom/huami/phn/core/source/impl/db/PHNDailyAnaResultDao;", "c", "()Lcom/huami/phn/core/source/impl/db/PHNDailyAnaResultDao;", "phnDailyResultDao", "<init>", "(Landroid/content/Context;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class LocalDataSourceImpl implements LocalDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy phnRecordDao = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy phnDailyResultDao = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/core/source/impl/db/PHNDailyAnaResultDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PHNDailyAnaResultDao> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PHNDailyAnaResultDao invoke() {
            return PHNDataBase.INSTANCE.getInstance(LocalDataSourceImpl.this.getContext()).phnDailyAnaResultDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/core/source/impl/db/PHNProjectRecordDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PHNProjectRecordDao> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PHNProjectRecordDao invoke() {
            return PHNDataBase.INSTANCE.getInstance(LocalDataSourceImpl.this.getContext()).phnProjectRecordDao();
        }
    }

    public LocalDataSourceImpl(@NotNull Context context) {
        this.context = context;
    }

    private final PHNDailyAnaResultDao a() {
        return (PHNDailyAnaResultDao) this.phnDailyResultDao.getValue();
    }

    private final PHNProjectRecordDao b() {
        return (PHNProjectRecordDao) this.phnRecordDao.getValue();
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    public void clearDBData() {
        String strInvoke = PHNProjectModuleKt.getPhnUserId().invoke();
        if (strInvoke == null || strInvoke.length() == 0) {
            HMLog.i("LocalDataSourceImpl", "clearDBData but no userid", new Object[0]);
        } else {
            a().clearAll();
            b().clearAll();
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNDailyAnalysisResult> queryDailyResult(int count, @Nullable Long lastTimestamp) {
        List<PHNDailyAnalysisResult> listQueryAllPHNResultBeforeTimestamp;
        if (count <= 0) {
            count = -1;
        }
        if (lastTimestamp == null) {
            listQueryAllPHNResultBeforeTimestamp = null;
        } else {
            listQueryAllPHNResultBeforeTimestamp = a().queryAllPHNResultBeforeTimestamp(count, lastTimestamp.longValue());
        }
        return listQueryAllPHNResultBeforeTimestamp == null ? a().queryAllPHNResult(count) : listQueryAllPHNResultBeforeTimestamp;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNDailyAnalysisResult> queryDailyResultByPlanId(int count, @Nullable Long lastTimestamp, long projectId) {
        List<PHNDailyAnalysisResult> listQueryPHNResultByPlanIdAndBeforeTimeStamp;
        if (count <= 0) {
            count = -1;
        }
        if (lastTimestamp == null) {
            listQueryPHNResultByPlanIdAndBeforeTimeStamp = null;
        } else {
            listQueryPHNResultByPlanIdAndBeforeTimeStamp = a().queryPHNResultByPlanIdAndBeforeTimeStamp(count, lastTimestamp.longValue(), projectId);
        }
        return listQueryPHNResultByPlanIdAndBeforeTimeStamp == null ? a().queryPHNResultByPlanId(count, projectId) : listQueryPHNResultByPlanIdAndBeforeTimeStamp;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public Flow<List<PHNProjectRecord>> queryLatestProjectAsFlow() {
        return FlowKt.distinctUntilChanged(b().queryLatestPHNProjectAsFlow());
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNDailyAnalysisResult> queryOldestDailyResult() {
        return a().queryOldestPHNResult();
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNDailyAnalysisResult> queryOldestDailyResultByPlanId(long projectId) {
        return a().queryOldestPHNResultByPlanId(projectId);
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @Nullable
    public PHNProjectRecord queryOldestProject() {
        return b().queryOldestPHNProject();
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @Nullable
    public PHNProjectRecord queryProject(long timestamp) {
        return b().queryPHNProject(timestamp);
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNDailyAnalysisResult> queryUnSyncedDailyResult() {
        return a().queryAllUnSyncedPHNResult(-1, 0L);
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNProjectRecord> queryUnSyncedProject() {
        return b().queryUnSyncedPHNProject(-1, 0L);
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    public boolean saveDailyResult(@NotNull List<PHNDailyAnalysisResult> entities) {
        Iterator<T> it2 = entities.iterator();
        while (it2.hasNext()) {
            ((PHNDailyAnalysisResult) it2.next()).stateChangeByApp();
        }
        a().insertOrUpdateResults(entities);
        return true;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    public boolean saveDailyResultFromWeb(@NotNull List<PHNDailyAnalysisResult> entities) {
        Iterator<T> it2 = entities.iterator();
        while (it2.hasNext()) {
            ((PHNDailyAnalysisResult) it2.next()).stateChangeByServer();
        }
        a().insertOrUpdateResults(entities);
        return true;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    public boolean saveOrUpdateProject(@NotNull List<PHNProjectRecord> records) {
        Iterator<T> it2 = records.iterator();
        while (it2.hasNext()) {
            ((PHNProjectRecord) it2.next()).stateChangeByApp();
        }
        b().insertOrUpdateRecords(records);
        HMLog.i("LocalDataSourceImpl", "saveProjectFromDevice", new Object[0]);
        return true;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    public boolean saveProjectFromWeb(@NotNull List<PHNProjectRecord> records) {
        Iterator<T> it2 = records.iterator();
        while (it2.hasNext()) {
            ((PHNProjectRecord) it2.next()).stateChangeByServer();
        }
        b().insertOrUpdateRecords(records);
        HMLog.i("LocalDataSourceImpl", "saveProject", new Object[0]);
        return true;
    }

    @Override // com.huami.phn.core.source.LocalDataSource
    @NotNull
    public List<PHNProjectRecord> queryProject(int count, @Nullable Long lastTimestamp) {
        long jLongValue = lastTimestamp == null ? 0L : lastTimestamp.longValue();
        if (count <= 0) {
            count = -1;
        }
        return b().queryPHNProject(count, jLongValue);
    }
}
