package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class b implements WorkSpecDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f3233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<WorkSpec> f3234b;
    public final EntityDeletionOrUpdateAdapter<WorkSpec> c;
    public final SharedSQLiteStatement d;
    public final SharedSQLiteStatement e;
    public final SharedSQLiteStatement f;
    public final SharedSQLiteStatement g;
    public final SharedSQLiteStatement h;
    public final SharedSQLiteStatement i;
    public final SharedSQLiteStatement j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SharedSQLiteStatement f3235k;
    public final SharedSQLiteStatement l;
    public final SharedSQLiteStatement m;
    public final SharedSQLiteStatement n;
    public final SharedSQLiteStatement o;
    public final SharedSQLiteStatement p;
    public final SharedSQLiteStatement q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SharedSQLiteStatement f3236r;

    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.b$b, reason: collision with other inner class name */
    public class C0090b extends SharedSQLiteStatement {
        public C0090b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class f extends SharedSQLiteStatement {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    public class h extends SharedSQLiteStatement {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    public class i implements Callable<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3245a;

        public i(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3245a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3245a, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(cursorQuery.getString(0));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3245a.release();
        }
    }

    public class j implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3247a;

        public j(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3247a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3247a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(0);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    b.this.d(map);
                    b.this.c(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = cursorQuery.getString(0);
                        WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                        Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                        int i = cursorQuery.getInt(3);
                        int i2 = cursorQuery.getInt(4);
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i2, cursorQuery.getLong(21), cursorQuery.getInt(22), (ArrayList) map.get(cursorQuery.getString(0)), (ArrayList) map2.get(cursorQuery.getString(0))));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3247a.release();
        }
    }

    public class k extends EntityInsertionAdapter<WorkSpec> {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
            supportSQLiteStatement.bindString(1, workSpec.id);
            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
            supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
            supportSQLiteStatement.bindString(3, workSpec.workerClassName);
            supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
            supportSQLiteStatement.bindBlob(5, Data.toByteArrayInternalV1(workSpec.input));
            supportSQLiteStatement.bindBlob(6, Data.toByteArrayInternalV1(workSpec.output));
            supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
            supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
            supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
            supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
            supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
            supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
            supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
            supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
            supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
            supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
            supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
            supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
            supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
            supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
            supportSQLiteStatement.bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
            supportSQLiteStatement.bindLong(22, workSpec.getStopReason());
            if (workSpec.getTraceTag() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, workSpec.getTraceTag());
            }
            Constraints constraints = workSpec.constraints;
            supportSQLiteStatement.bindLong(24, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
            supportSQLiteStatement.bindBlob(25, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat()));
            supportSQLiteStatement.bindLong(26, constraints.getRequiresCharging() ? 1L : 0L);
            supportSQLiteStatement.bindLong(27, constraints.getRequiresDeviceIdle() ? 1L : 0L);
            supportSQLiteStatement.bindLong(28, constraints.getRequiresBatteryNotLow() ? 1L : 0L);
            supportSQLiteStatement.bindLong(29, constraints.getRequiresStorageNotLow() ? 1L : 0L);
            supportSQLiteStatement.bindLong(30, constraints.getContentTriggerUpdateDelayMillis());
            supportSQLiteStatement.bindLong(31, constraints.getContentTriggerMaxDelayMillis());
            supportSQLiteStatement.bindBlob(32, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class l implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3250a;

        public l(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3250a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3250a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(0);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    b.this.d(map);
                    b.this.c(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = cursorQuery.getString(0);
                        WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                        Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                        int i = cursorQuery.getInt(3);
                        int i2 = cursorQuery.getInt(4);
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i2, cursorQuery.getLong(21), cursorQuery.getInt(22), (ArrayList) map.get(cursorQuery.getString(0)), (ArrayList) map2.get(cursorQuery.getString(0))));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3250a.release();
        }
    }

    public class m implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3252a;

        public m(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3252a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3252a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(0);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    b.this.d(map);
                    b.this.c(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = cursorQuery.getString(0);
                        WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                        Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                        int i = cursorQuery.getInt(3);
                        int i2 = cursorQuery.getInt(4);
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i2, cursorQuery.getLong(21), cursorQuery.getInt(22), (ArrayList) map.get(cursorQuery.getString(0)), (ArrayList) map2.get(cursorQuery.getString(0))));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3252a.release();
        }
    }

    public class n implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3254a;

        public n(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3254a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3254a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(0);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    b.this.d(map);
                    b.this.c(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = cursorQuery.getString(0);
                        WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                        Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                        int i = cursorQuery.getInt(3);
                        int i2 = cursorQuery.getInt(4);
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i2, cursorQuery.getLong(21), cursorQuery.getInt(22), (ArrayList) map.get(cursorQuery.getString(0)), (ArrayList) map2.get(cursorQuery.getString(0))));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3254a.release();
        }
    }

    public class o implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3256a;

        public o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3256a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3256a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(0);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    b.this.d(map);
                    b.this.c(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = cursorQuery.getString(0);
                        WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                        Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                        int i = cursorQuery.getInt(3);
                        int i2 = cursorQuery.getInt(4);
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i2, cursorQuery.getLong(21), cursorQuery.getInt(22), (ArrayList) map.get(cursorQuery.getString(0)), (ArrayList) map2.get(cursorQuery.getString(0))));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3256a.release();
        }
    }

    public class p implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3258a;

        public p(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3258a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            b.this.f3233a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3258a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(0);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    b.this.d(map);
                    b.this.c(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = cursorQuery.getString(0);
                        WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                        Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                        int i = cursorQuery.getInt(3);
                        int i2 = cursorQuery.getInt(4);
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i2, cursorQuery.getLong(21), cursorQuery.getInt(22), (ArrayList) map.get(cursorQuery.getString(0)), (ArrayList) map2.get(cursorQuery.getString(0))));
                    }
                    b.this.f3233a.setTransactionSuccessful();
                    cursorQuery.close();
                    b.this.f3233a.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                b.this.f3233a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.f3258a.release();
        }
    }

    public class q implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3260a;

        public q(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3260a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3260a, false, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorQuery.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.f3260a.release();
        }
    }

    public class r implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3262a;

        public r(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3262a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(b.this.f3233a, this.f3262a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.f3262a.release();
        }
    }

    public class s extends EntityDeletionOrUpdateAdapter<WorkSpec> {
        public s(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
            supportSQLiteStatement.bindString(1, workSpec.id);
            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
            supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
            supportSQLiteStatement.bindString(3, workSpec.workerClassName);
            supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
            supportSQLiteStatement.bindBlob(5, Data.toByteArrayInternalV1(workSpec.input));
            supportSQLiteStatement.bindBlob(6, Data.toByteArrayInternalV1(workSpec.output));
            supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
            supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
            supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
            supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
            supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
            supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
            supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
            supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
            supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
            supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
            supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
            supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
            supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
            supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
            supportSQLiteStatement.bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
            supportSQLiteStatement.bindLong(22, workSpec.getStopReason());
            if (workSpec.getTraceTag() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, workSpec.getTraceTag());
            }
            Constraints constraints = workSpec.constraints;
            supportSQLiteStatement.bindLong(24, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
            supportSQLiteStatement.bindBlob(25, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat()));
            supportSQLiteStatement.bindLong(26, constraints.getRequiresCharging() ? 1L : 0L);
            supportSQLiteStatement.bindLong(27, constraints.getRequiresDeviceIdle() ? 1L : 0L);
            supportSQLiteStatement.bindLong(28, constraints.getRequiresBatteryNotLow() ? 1L : 0L);
            supportSQLiteStatement.bindLong(29, constraints.getRequiresStorageNotLow() ? 1L : 0L);
            supportSQLiteStatement.bindLong(30, constraints.getContentTriggerUpdateDelayMillis());
            supportSQLiteStatement.bindLong(31, constraints.getContentTriggerMaxDelayMillis());
            supportSQLiteStatement.bindBlob(32, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
            supportSQLiteStatement.bindString(33, workSpec.id);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public class t extends SharedSQLiteStatement {
        public t(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class u extends SharedSQLiteStatement {
        public u(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    public class v extends SharedSQLiteStatement {
        public v(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    public class w extends SharedSQLiteStatement {
        public w(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    public class x extends SharedSQLiteStatement {
        public x(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class y extends SharedSQLiteStatement {
        public y(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    public class z extends SharedSQLiteStatement {
        public z(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.f3233a = roomDatabase;
        this.f3234b = new k(roomDatabase);
        this.c = new s(roomDatabase);
        this.d = new t(roomDatabase);
        this.e = new u(roomDatabase);
        this.f = new v(roomDatabase);
        this.g = new w(roomDatabase);
        this.h = new x(roomDatabase);
        this.i = new y(roomDatabase);
        this.j = new z(roomDatabase);
        this.f3235k = new a(roomDatabase);
        this.l = new C0090b(roomDatabase);
        this.m = new c(roomDatabase);
        this.n = new d(roomDatabase);
        this.o = new e(roomDatabase);
        this.p = new f(roomDatabase);
        this.q = new g(roomDatabase);
        this.f3236r = new h(roomDatabase);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public final void c(HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: mnr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return this.f27034a.i((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i2, it.next());
            i2++;
        }
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                cursorQuery.close();
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<Data> arrayList = map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
                }
            }
            cursorQuery.close();
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public final void d(HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: lnr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return this.f25253a.j((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i2, it.next());
            i2++;
        }
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                cursorQuery.close();
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(cursorQuery.getString(0));
                }
            }
            cursorQuery.close();
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.d.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.d.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i2);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6));
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j5 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i5 = i3;
                    long j7 = cursorQuery.getLong(i5);
                    int i6 = columnIndexOrThrow;
                    int i7 = columnIndexOrThrow15;
                    long j8 = cursorQuery.getLong(i7);
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i8 = columnIndexOrThrow18;
                    int i9 = cursorQuery.getInt(i8);
                    columnIndexOrThrow18 = i8;
                    int i10 = columnIndexOrThrow19;
                    int i11 = cursorQuery.getInt(i10);
                    columnIndexOrThrow19 = i10;
                    int i12 = columnIndexOrThrow20;
                    long j9 = cursorQuery.getLong(i12);
                    columnIndexOrThrow20 = i12;
                    int i13 = columnIndexOrThrow21;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow21 = i13;
                    int i15 = columnIndexOrThrow22;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow22 = i15;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    String string4 = cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    int i17 = columnIndexOrThrow25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i17));
                    columnIndexOrThrow25 = i17;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow26) != 0;
                    boolean z4 = cursorQuery.getInt(columnIndexOrThrow27) != 0;
                    boolean z5 = cursorQuery.getInt(columnIndexOrThrow28) != 0;
                    boolean z6 = cursorQuery.getInt(columnIndexOrThrow29) != 0;
                    long j10 = cursorQuery.getLong(columnIndexOrThrow30);
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    int i18 = columnIndexOrThrow31;
                    long j11 = cursorQuery.getLong(i18);
                    columnIndexOrThrow31 = i18;
                    int i19 = columnIndexOrThrow32;
                    columnIndexOrThrow32 = i19;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z3, z4, z5, z6, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i19))), i4, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z2, outOfQuotaPolicyIntToOutOfQuotaPolicy, i9, i11, j9, i14, i16, string4));
                    columnIndexOrThrow = i6;
                    i3 = i5;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        return this.f3233a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, (Callable) new i(RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0)));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQueryAcquire.bindLong(1, i2);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6));
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j5 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i5 = i3;
                    long j7 = cursorQuery.getLong(i5);
                    int i6 = columnIndexOrThrow;
                    int i7 = columnIndexOrThrow15;
                    long j8 = cursorQuery.getLong(i7);
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i8 = columnIndexOrThrow18;
                    int i9 = cursorQuery.getInt(i8);
                    columnIndexOrThrow18 = i8;
                    int i10 = columnIndexOrThrow19;
                    int i11 = cursorQuery.getInt(i10);
                    columnIndexOrThrow19 = i10;
                    int i12 = columnIndexOrThrow20;
                    long j9 = cursorQuery.getLong(i12);
                    columnIndexOrThrow20 = i12;
                    int i13 = columnIndexOrThrow21;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow21 = i13;
                    int i15 = columnIndexOrThrow22;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow22 = i15;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    String string4 = cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    int i17 = columnIndexOrThrow25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i17));
                    columnIndexOrThrow25 = i17;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow26) != 0;
                    boolean z4 = cursorQuery.getInt(columnIndexOrThrow27) != 0;
                    boolean z5 = cursorQuery.getInt(columnIndexOrThrow28) != 0;
                    boolean z6 = cursorQuery.getInt(columnIndexOrThrow29) != 0;
                    long j10 = cursorQuery.getLong(columnIndexOrThrow30);
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    int i18 = columnIndexOrThrow31;
                    long j11 = cursorQuery.getLong(i18);
                    columnIndexOrThrow31 = i18;
                    int i19 = columnIndexOrThrow32;
                    columnIndexOrThrow32 = i19;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z3, z4, z5, z6, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i19))), i4, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z2, outOfQuotaPolicyIntToOutOfQuotaPolicy, i9, i11, j9, i14, i16, string4));
                    columnIndexOrThrow = i6;
                    i3 = i5;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6));
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j5 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i4 = i2;
                    long j7 = cursorQuery.getLong(i4);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    long j8 = cursorQuery.getLong(i6);
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i7 = columnIndexOrThrow18;
                    int i8 = cursorQuery.getInt(i7);
                    columnIndexOrThrow18 = i7;
                    int i9 = columnIndexOrThrow19;
                    int i10 = cursorQuery.getInt(i9);
                    columnIndexOrThrow19 = i9;
                    int i11 = columnIndexOrThrow20;
                    long j9 = cursorQuery.getLong(i11);
                    columnIndexOrThrow20 = i11;
                    int i12 = columnIndexOrThrow21;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow21 = i12;
                    int i14 = columnIndexOrThrow22;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow22 = i14;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    String string4 = cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    int i16 = columnIndexOrThrow25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i16));
                    columnIndexOrThrow25 = i16;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow26) != 0;
                    boolean z4 = cursorQuery.getInt(columnIndexOrThrow27) != 0;
                    boolean z5 = cursorQuery.getInt(columnIndexOrThrow28) != 0;
                    boolean z6 = cursorQuery.getInt(columnIndexOrThrow29) != 0;
                    long j10 = cursorQuery.getLong(columnIndexOrThrow30);
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    int i17 = columnIndexOrThrow31;
                    long j11 = cursorQuery.getLong(i17);
                    columnIndexOrThrow31 = i17;
                    int i18 = columnIndexOrThrow32;
                    columnIndexOrThrow32 = i18;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z3, z4, z5, z6, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i18))), i3, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z2, outOfQuotaPolicyIntToOutOfQuotaPolicy, i8, i10, j9, i13, i15, string4));
                    columnIndexOrThrow = i5;
                    i2 = i4;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6));
                    long j3 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j6 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j7 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i4 = i2;
                    long j8 = cursorQuery.getLong(i4);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    long j9 = cursorQuery.getLong(i6);
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i7 = columnIndexOrThrow18;
                    int i8 = cursorQuery.getInt(i7);
                    columnIndexOrThrow18 = i7;
                    int i9 = columnIndexOrThrow19;
                    int i10 = cursorQuery.getInt(i9);
                    columnIndexOrThrow19 = i9;
                    int i11 = columnIndexOrThrow20;
                    long j10 = cursorQuery.getLong(i11);
                    columnIndexOrThrow20 = i11;
                    int i12 = columnIndexOrThrow21;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow21 = i12;
                    int i14 = columnIndexOrThrow22;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow22 = i14;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    String string4 = cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    int i16 = columnIndexOrThrow25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i16));
                    columnIndexOrThrow25 = i16;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow26) != 0;
                    boolean z4 = cursorQuery.getInt(columnIndexOrThrow27) != 0;
                    boolean z5 = cursorQuery.getInt(columnIndexOrThrow28) != 0;
                    boolean z6 = cursorQuery.getInt(columnIndexOrThrow29) != 0;
                    long j11 = cursorQuery.getLong(columnIndexOrThrow30);
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    int i17 = columnIndexOrThrow31;
                    long j12 = cursorQuery.getLong(i17);
                    columnIndexOrThrow31 = i17;
                    int i18 = columnIndexOrThrow32;
                    columnIndexOrThrow32 = i18;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j3, j4, j5, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z3, z4, z5, z6, j11, j12, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i18))), i3, backoffPolicyIntToBackoffPolicy, j6, j7, j8, j9, z2, outOfQuotaPolicyIntToOutOfQuotaPolicy, i8, i10, j10, i13, i15, string4));
                    columnIndexOrThrow = i5;
                    i2 = i4;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6));
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j5 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i4 = i2;
                    long j7 = cursorQuery.getLong(i4);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    long j8 = cursorQuery.getLong(i6);
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i7 = columnIndexOrThrow18;
                    int i8 = cursorQuery.getInt(i7);
                    columnIndexOrThrow18 = i7;
                    int i9 = columnIndexOrThrow19;
                    int i10 = cursorQuery.getInt(i9);
                    columnIndexOrThrow19 = i9;
                    int i11 = columnIndexOrThrow20;
                    long j9 = cursorQuery.getLong(i11);
                    columnIndexOrThrow20 = i11;
                    int i12 = columnIndexOrThrow21;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow21 = i12;
                    int i14 = columnIndexOrThrow22;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow22 = i14;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    String string4 = cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    int i16 = columnIndexOrThrow25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i16));
                    columnIndexOrThrow25 = i16;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow26) != 0;
                    boolean z4 = cursorQuery.getInt(columnIndexOrThrow27) != 0;
                    boolean z5 = cursorQuery.getInt(columnIndexOrThrow28) != 0;
                    boolean z6 = cursorQuery.getInt(columnIndexOrThrow29) != 0;
                    long j10 = cursorQuery.getLong(columnIndexOrThrow30);
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    int i17 = columnIndexOrThrow31;
                    long j11 = cursorQuery.getLong(i17);
                    columnIndexOrThrow31 = i17;
                    int i18 = columnIndexOrThrow32;
                    columnIndexOrThrow32 = i18;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z3, z4, z5, z6, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i18))), i3, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z2, outOfQuotaPolicyIntToOutOfQuotaPolicy, i8, i10, j9, i13, i15, string4));
                    columnIndexOrThrow = i5;
                    i2 = i4;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        return this.f3233a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, (Callable) new r(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6));
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j5 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i4 = i2;
                    long j7 = cursorQuery.getLong(i4);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    long j8 = cursorQuery.getLong(i6);
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i7 = columnIndexOrThrow18;
                    int i8 = cursorQuery.getInt(i7);
                    columnIndexOrThrow18 = i7;
                    int i9 = columnIndexOrThrow19;
                    int i10 = cursorQuery.getInt(i9);
                    columnIndexOrThrow19 = i9;
                    int i11 = columnIndexOrThrow20;
                    long j9 = cursorQuery.getLong(i11);
                    columnIndexOrThrow20 = i11;
                    int i12 = columnIndexOrThrow21;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow21 = i12;
                    int i14 = columnIndexOrThrow22;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow22 = i14;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    String string4 = cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    int i16 = columnIndexOrThrow25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i16));
                    columnIndexOrThrow25 = i16;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow26) != 0;
                    boolean z4 = cursorQuery.getInt(columnIndexOrThrow27) != 0;
                    boolean z5 = cursorQuery.getInt(columnIndexOrThrow28) != 0;
                    boolean z6 = cursorQuery.getInt(columnIndexOrThrow29) != 0;
                    long j10 = cursorQuery.getLong(columnIndexOrThrow30);
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    int i17 = columnIndexOrThrow31;
                    long j11 = cursorQuery.getLong(i17);
                    columnIndexOrThrow31 = i17;
                    int i18 = columnIndexOrThrow32;
                    columnIndexOrThrow32 = i18;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z3, z4, z5, z6, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i18))), i3, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z2, outOfQuotaPolicyIntToOutOfQuotaPolicy, i8, i10, j9, i13, i15, string4));
                    columnIndexOrThrow = i5;
                    i2 = i4;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        WorkInfo.State stateIntToState = null;
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                Integer numValueOf = cursorQuery.isNull(0) ? null : Integer.valueOf(cursorQuery.getInt(0));
                if (numValueOf != null) {
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    stateIntToState = WorkTypeConverters.intToState(numValueOf.intValue());
                }
            }
            return stateIntToState;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                if (cursorQuery.moveToFirst()) {
                    workSpec = new WorkSpec(cursorQuery.getString(columnIndexOrThrow), WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2)), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow5)), Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow6)), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getLong(columnIndexOrThrow8), cursorQuery.getLong(columnIndexOrThrow9), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(columnIndexOrThrow25)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow24)), cursorQuery.getInt(columnIndexOrThrow26) != 0, cursorQuery.getInt(columnIndexOrThrow27) != 0, cursorQuery.getInt(columnIndexOrThrow28) != 0, cursorQuery.getInt(columnIndexOrThrow29) != 0, cursorQuery.getLong(columnIndexOrThrow30), cursorQuery.getLong(columnIndexOrThrow31), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(columnIndexOrThrow32))), cursorQuery.getInt(columnIndexOrThrow10), WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getLong(columnIndexOrThrow13), cursorQuery.getLong(columnIndexOrThrow14), cursorQuery.getLong(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0, WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow17)), cursorQuery.getInt(columnIndexOrThrow18), cursorQuery.getInt(columnIndexOrThrow19), cursorQuery.getLong(columnIndexOrThrow20), cursorQuery.getInt(columnIndexOrThrow21), cursorQuery.getInt(columnIndexOrThrow22), cursorQuery.isNull(columnIndexOrThrow23) ? null : cursorQuery.getString(columnIndexOrThrow23));
                } else {
                    workSpec = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new WorkSpec.IdAndState(cursorQuery.getString(0), WorkTypeConverters.intToState(cursorQuery.getInt(1))));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowDataForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = list.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i2, it.next());
            i2++;
        }
        return CoroutinesRoom.createFlow(this.f3233a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new l(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        return CoroutinesRoom.createFlow(this.f3233a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new p(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        return CoroutinesRoom.createFlow(this.f3233a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new m(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            WorkSpec.WorkInfoPojo workInfoPojo = null;
            Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorQuery.moveToPosition(-1);
                d(map);
                c(map2);
                if (cursorQuery.moveToFirst()) {
                    String string3 = cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                    int i2 = cursorQuery.getInt(3);
                    int i3 = cursorQuery.getInt(4);
                    workInfoPojo = new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i2, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i3, cursorQuery.getLong(21), cursorQuery.getInt(22), map.get(cursorQuery.getString(0)), map2.get(cursorQuery.getString(0)));
                }
                this.f3233a.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                this.f3233a.endTransaction();
                return workInfoPojo;
            } catch (Throwable th) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f3233a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = list.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i2, it.next());
            i2++;
        }
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorQuery.moveToPosition(-1);
                d(map);
                c(map2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new WorkSpec.WorkInfoPojo(cursorQuery.getString(0), WorkTypeConverters.intToState(cursorQuery.getInt(1)), Data.fromByteArray(cursorQuery.getBlob(2)), cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), cursorQuery.getInt(3), WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), cursorQuery.getInt(4), cursorQuery.getLong(21), cursorQuery.getInt(22), map.get(cursorQuery.getString(0)), map2.get(cursorQuery.getString(0))));
                }
                this.f3233a.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                this.f3233a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f3233a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorQuery.moveToPosition(-1);
                d(map);
                c(map2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                    int i2 = cursorQuery.getInt(3);
                    int i3 = cursorQuery.getInt(4);
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i2, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i3, cursorQuery.getLong(21), cursorQuery.getInt(22), map.get(cursorQuery.getString(0)), map2.get(cursorQuery.getString(0))));
                }
                this.f3233a.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                this.f3233a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f3233a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.f3233a, roomSQLiteQueryAcquire, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorQuery.moveToPosition(-1);
                d(map);
                c(map2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.getBlob(2));
                    int i2 = cursorQuery.getInt(3);
                    int i3 = cursorQuery.getInt(4);
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorQuery.getLong(14), cursorQuery.getLong(15), cursorQuery.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorQuery.getInt(5)), cursorQuery.getInt(7) != 0, cursorQuery.getInt(8) != 0, cursorQuery.getInt(9) != 0, cursorQuery.getInt(10) != 0, cursorQuery.getLong(11), cursorQuery.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(13))), i2, WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(17)), cursorQuery.getLong(18), cursorQuery.getLong(19), cursorQuery.getInt(20), i3, cursorQuery.getLong(21), cursorQuery.getInt(22), map.get(cursorQuery.getString(0)), map2.get(cursorQuery.getString(0))));
                }
                this.f3233a.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                this.f3233a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f3233a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = list.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i2, it.next());
            i2++;
        }
        return this.f3233a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, (Callable) new j(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        return this.f3233a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, (Callable) new o(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        return this.f3233a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, (Callable) new n(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<Boolean> hasUnfinishedWorkFlow() {
        return CoroutinesRoom.createFlow(this.f3233a, false, new String[]{"workspec"}, new q(RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    public final /* synthetic */ Unit i(HashMap map) {
        c(map);
        return Unit.INSTANCE;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.q.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.q.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.q.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.g.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.g.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.j.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f3233a.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.j.release(supportSQLiteStatementAcquire);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.j.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            this.f3234b.insert(workSpec);
            this.f3233a.setTransactionSuccessful();
        } finally {
            this.f3233a.endTransaction();
        }
    }

    public final /* synthetic */ Unit j(HashMap map) {
        d(map);
        return Unit.INSTANCE;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j2) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.n.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j2);
        supportSQLiteStatementAcquire.bindString(2, str);
        try {
            this.f3233a.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.n.release(supportSQLiteStatementAcquire);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.n.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.p.acquire();
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.p.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.p.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.o.acquire();
        try {
            this.f3233a.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.o.release(supportSQLiteStatementAcquire);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.o.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(String str, int i2) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.m.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        supportSQLiteStatementAcquire.bindLong(2, i2);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.m.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.m.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f3235k.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f3233a.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.f3235k.release(supportSQLiteStatementAcquire);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f3235k.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f3233a.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.f.release(supportSQLiteStatementAcquire);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(String str, long j2) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.i.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j2);
        supportSQLiteStatementAcquire.bindString(2, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.i.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.i.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(String str, long j2) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.l.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j2);
        supportSQLiteStatementAcquire.bindString(2, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.l.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.l.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.h.acquire();
        supportSQLiteStatementAcquire.bindBlob(1, Data.toByteArrayInternalV1(data));
        supportSQLiteStatementAcquire.bindString(2, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.h.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.h.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String str) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, WorkTypeConverters.stateToInt(state));
        supportSQLiteStatementAcquire.bindString(2, str);
        try {
            this.f3233a.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.e.release(supportSQLiteStatementAcquire);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.e.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(String str, int i2) {
        this.f3233a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f3236r.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i2);
        supportSQLiteStatementAcquire.bindString(2, str);
        try {
            this.f3233a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f3233a.setTransactionSuccessful();
                this.f3233a.endTransaction();
                this.f3236r.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f3233a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f3236r.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec) {
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            this.c.handle(workSpec);
            this.f3233a.setTransactionSuccessful();
        } finally {
            this.f3233a.endTransaction();
        }
    }
}
