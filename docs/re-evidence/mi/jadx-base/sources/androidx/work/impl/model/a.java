package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
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
public final class a implements RawWorkInfoDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f3228a;

    /* JADX INFO: renamed from: androidx.work.impl.model.a$a, reason: collision with other inner class name */
    public class CallableC0089a implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SupportSQLiteQuery f3229a;

        public CallableC0089a(SupportSQLiteQuery supportSQLiteQuery) {
            this.f3229a = supportSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            boolean z;
            boolean z2;
            boolean z3;
            Cursor cursorQuery = DBUtil.query(a.this.f3228a, this.f3229a, true, null);
            try {
                int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
                int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                HashMap map = new HashMap();
                int i = columnIndex13;
                HashMap map2 = new HashMap();
                while (cursorQuery.moveToNext()) {
                    int i2 = columnIndex12;
                    String string = cursorQuery.getString(columnIndex);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorQuery.getString(columnIndex);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                    columnIndex12 = i2;
                    columnIndex11 = columnIndex11;
                }
                int i3 = columnIndex11;
                int i4 = columnIndex12;
                cursorQuery.moveToPosition(-1);
                a.this.d(map);
                a.this.c(map2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                    WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                    Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                    long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                    long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                    long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                    boolean z4 = false;
                    int i5 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                    long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                    long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                    int i6 = i3 == -1 ? 0 : cursorQuery.getInt(i3);
                    int i7 = i4 == -1 ? 0 : cursorQuery.getInt(i4);
                    long j6 = i == -1 ? 0L : cursorQuery.getLong(i);
                    int i8 = columnIndex14 == -1 ? 0 : cursorQuery.getInt(columnIndex14);
                    NetworkType networkTypeIntToNetworkType = columnIndex15 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndex15));
                    NetworkRequestCompat networkRequest$work_runtime_release = columnIndex16 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(columnIndex16));
                    if (columnIndex17 == -1) {
                        z = false;
                    } else {
                        z = cursorQuery.getInt(columnIndex17) != 0;
                    }
                    if (columnIndex18 == -1) {
                        z2 = false;
                    } else {
                        z2 = cursorQuery.getInt(columnIndex18) != 0;
                    }
                    if (columnIndex19 == -1) {
                        z3 = false;
                    } else {
                        z3 = cursorQuery.getInt(columnIndex19) != 0;
                    }
                    if (columnIndex20 != -1 && cursorQuery.getInt(columnIndex20) != 0) {
                        z4 = true;
                    }
                    columnIndex20 = columnIndex20;
                    columnIndex21 = columnIndex21;
                    boolean z5 = z4;
                    long j7 = columnIndex21 == -1 ? 0L : cursorQuery.getLong(columnIndex21);
                    long j8 = columnIndex22 != -1 ? cursorQuery.getLong(columnIndex22) : 0L;
                    columnIndex22 = columnIndex22;
                    int i9 = columnIndex23;
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z, z2, z3, z5, j7, j8, i9 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i9))), i5, backoffPolicyIntToBackoffPolicy, j4, j5, i6, i7, j6, i8, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                    columnIndex23 = i9;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }
    }

    public class b implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SupportSQLiteQuery f3231a;

        public b(SupportSQLiteQuery supportSQLiteQuery) {
            this.f3231a = supportSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkSpec.WorkInfoPojo> call() throws Exception {
            boolean z;
            boolean z2;
            boolean z3;
            Cursor cursorQuery = DBUtil.query(a.this.f3228a, this.f3231a, true, null);
            try {
                int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
                int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                HashMap map = new HashMap();
                int i = columnIndex13;
                HashMap map2 = new HashMap();
                while (cursorQuery.moveToNext()) {
                    int i2 = columnIndex12;
                    String string = cursorQuery.getString(columnIndex);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorQuery.getString(columnIndex);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                    columnIndex12 = i2;
                    columnIndex11 = columnIndex11;
                }
                int i3 = columnIndex11;
                int i4 = columnIndex12;
                cursorQuery.moveToPosition(-1);
                a.this.d(map);
                a.this.c(map2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                    WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                    Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                    long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                    long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                    long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                    boolean z4 = false;
                    int i5 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                    long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                    long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                    int i6 = i3 == -1 ? 0 : cursorQuery.getInt(i3);
                    int i7 = i4 == -1 ? 0 : cursorQuery.getInt(i4);
                    long j6 = i == -1 ? 0L : cursorQuery.getLong(i);
                    int i8 = columnIndex14 == -1 ? 0 : cursorQuery.getInt(columnIndex14);
                    NetworkType networkTypeIntToNetworkType = columnIndex15 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndex15));
                    NetworkRequestCompat networkRequest$work_runtime_release = columnIndex16 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(columnIndex16));
                    if (columnIndex17 == -1) {
                        z = false;
                    } else {
                        z = cursorQuery.getInt(columnIndex17) != 0;
                    }
                    if (columnIndex18 == -1) {
                        z2 = false;
                    } else {
                        z2 = cursorQuery.getInt(columnIndex18) != 0;
                    }
                    if (columnIndex19 == -1) {
                        z3 = false;
                    } else {
                        z3 = cursorQuery.getInt(columnIndex19) != 0;
                    }
                    if (columnIndex20 != -1 && cursorQuery.getInt(columnIndex20) != 0) {
                        z4 = true;
                    }
                    columnIndex20 = columnIndex20;
                    columnIndex21 = columnIndex21;
                    boolean z5 = z4;
                    long j7 = columnIndex21 == -1 ? 0L : cursorQuery.getLong(columnIndex21);
                    long j8 = columnIndex22 != -1 ? cursorQuery.getLong(columnIndex22) : 0L;
                    columnIndex22 = columnIndex22;
                    int i9 = columnIndex23;
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z, z2, z3, z5, j7, j8, i9 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i9))), i5, backoffPolicyIntToBackoffPolicy, j4, j5, i6, i7, j6, i8, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                    columnIndex23 = i9;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }
    }

    public a(RoomDatabase roomDatabase) {
        this.f3228a = roomDatabase;
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
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: hcj
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return this.f19936a.i((HashMap) obj);
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
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i, it.next());
            i++;
        }
        Cursor cursorQuery = DBUtil.query(this.f3228a, roomSQLiteQueryAcquire, false, null);
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

    public final void d(HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: gcj
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return this.f18835a.j((HashMap) obj);
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
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i, it.next());
            i++;
        }
        Cursor cursorQuery = DBUtil.query(this.f3228a, roomSQLiteQueryAcquire, false, null);
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

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f3228a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f3228a, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
            int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
            int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
            int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
            int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
            int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
            int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i = columnIndex13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorQuery.moveToNext()) {
                int i2 = columnIndex12;
                String string = cursorQuery.getString(columnIndex);
                if (!map.containsKey(string)) {
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorQuery.getString(columnIndex);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i2;
                columnIndex11 = columnIndex11;
            }
            int i3 = columnIndex11;
            int i4 = columnIndex12;
            cursorQuery.moveToPosition(-1);
            d(map);
            c(map2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                boolean z4 = false;
                int i5 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                int i6 = i3 == -1 ? 0 : cursorQuery.getInt(i3);
                int i7 = i4 == -1 ? 0 : cursorQuery.getInt(i4);
                long j6 = i == -1 ? 0L : cursorQuery.getLong(i);
                columnIndex14 = columnIndex14;
                int i8 = columnIndex14 == -1 ? 0 : cursorQuery.getInt(columnIndex14);
                NetworkType networkTypeIntToNetworkType = columnIndex15 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndex15));
                NetworkRequestCompat networkRequest$work_runtime_release = columnIndex16 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(columnIndex16));
                if (columnIndex17 == -1) {
                    z = false;
                } else {
                    z = cursorQuery.getInt(columnIndex17) != 0;
                }
                if (columnIndex18 == -1) {
                    z2 = false;
                } else {
                    z2 = cursorQuery.getInt(columnIndex18) != 0;
                }
                if (columnIndex19 == -1) {
                    z3 = false;
                } else {
                    z3 = cursorQuery.getInt(columnIndex19) != 0;
                }
                if (columnIndex20 != -1 && cursorQuery.getInt(columnIndex20) != 0) {
                    z4 = true;
                }
                columnIndex20 = columnIndex20;
                columnIndex21 = columnIndex21;
                boolean z5 = z4;
                long j7 = columnIndex21 == -1 ? 0L : cursorQuery.getLong(columnIndex21);
                long j8 = columnIndex22 != -1 ? cursorQuery.getLong(columnIndex22) : 0L;
                columnIndex22 = columnIndex22;
                int i9 = columnIndex23;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z, z2, z3, z5, j7, j8, i9 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i9))), i5, backoffPolicyIntToBackoffPolicy, j4, j5, i6, i7, j6, i8, map.get(cursorQuery.getString(columnIndex)), map2.get(cursorQuery.getString(columnIndex))));
                columnIndex23 = i9;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(SupportSQLiteQuery supportSQLiteQuery) {
        return CoroutinesRoom.createFlow(this.f3228a, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new b(supportSQLiteQuery));
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery) {
        return this.f3228a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, (Callable) new CallableC0089a(supportSQLiteQuery));
    }

    public final /* synthetic */ Unit i(HashMap map) {
        c(map);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Unit j(HashMap map) {
        d(map);
        return Unit.INSTANCE;
    }
}
