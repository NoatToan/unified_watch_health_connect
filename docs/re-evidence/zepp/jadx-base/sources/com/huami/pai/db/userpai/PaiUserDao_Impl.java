package com.huami.pai.db.userpai;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai.vo.PAIDataVoMin;
import com.xiaomi.hm.health.Constant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiUserDao_Impl implements PaiUserDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<PAIDataVo> b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public class a implements Callable<Long> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public a(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class b implements Callable<List<PAIDataVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f = cursorQuery.getFloat(columnIndexOrThrow4);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow5);
                    float f3 = cursorQuery.getFloat(columnIndexOrThrow6);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow9);
                    float f4 = cursorQuery.getFloat(columnIndexOrThrow10);
                    float f5 = cursorQuery.getFloat(columnIndexOrThrow11);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow12);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow13);
                    int i7 = i;
                    int i8 = cursorQuery.getInt(i7);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    int i11 = cursorQuery.getInt(i10);
                    columnIndexOrThrow15 = i10;
                    int i12 = columnIndexOrThrow16;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow16 = i12;
                    int i14 = columnIndexOrThrow17;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow17 = i14;
                    int i16 = columnIndexOrThrow18;
                    int i17 = cursorQuery.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    long j = cursorQuery.getLong(i18);
                    columnIndexOrThrow19 = i18;
                    int i19 = columnIndexOrThrow20;
                    long j2 = cursorQuery.getLong(i19);
                    columnIndexOrThrow20 = i19;
                    int i20 = columnIndexOrThrow21;
                    long j3 = cursorQuery.getLong(i20);
                    columnIndexOrThrow21 = i20;
                    int i21 = columnIndexOrThrow22;
                    int i22 = cursorQuery.getInt(i21);
                    columnIndexOrThrow22 = i21;
                    int i23 = columnIndexOrThrow23;
                    int i24 = cursorQuery.getInt(i23);
                    columnIndexOrThrow23 = i23;
                    int i25 = columnIndexOrThrow24;
                    long j4 = cursorQuery.getLong(i25);
                    columnIndexOrThrow24 = i25;
                    int i26 = columnIndexOrThrow25;
                    int i27 = cursorQuery.getInt(i26);
                    columnIndexOrThrow25 = i26;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    arrayList.add(new PAIDataVo(string, string2, string3, f, f2, f3, i2, i3, i4, f4, f5, i5, i6, i8, i11, i13, i15, i17, j, j2, j3, i22, i24, j4, i27, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                    columnIndexOrThrow = i9;
                    i = i7;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class c implements Callable<List<PAIDataVoMin>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVoMin> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new PAIDataVoMin(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5)));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class d implements Callable<List<PAIDataVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVo> call() throws Exception {
            d dVar;
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                    int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        float f = cursorQuery.getFloat(columnIndexOrThrow4);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow5);
                        float f3 = cursorQuery.getFloat(columnIndexOrThrow6);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow8);
                        int i4 = cursorQuery.getInt(columnIndexOrThrow9);
                        float f4 = cursorQuery.getFloat(columnIndexOrThrow10);
                        float f5 = cursorQuery.getFloat(columnIndexOrThrow11);
                        int i5 = cursorQuery.getInt(columnIndexOrThrow12);
                        int i6 = cursorQuery.getInt(columnIndexOrThrow13);
                        int i7 = i;
                        int i8 = cursorQuery.getInt(i7);
                        int i9 = columnIndexOrThrow;
                        int i10 = columnIndexOrThrow15;
                        int i11 = cursorQuery.getInt(i10);
                        columnIndexOrThrow15 = i10;
                        int i12 = columnIndexOrThrow16;
                        int i13 = cursorQuery.getInt(i12);
                        columnIndexOrThrow16 = i12;
                        int i14 = columnIndexOrThrow17;
                        int i15 = cursorQuery.getInt(i14);
                        columnIndexOrThrow17 = i14;
                        int i16 = columnIndexOrThrow18;
                        int i17 = cursorQuery.getInt(i16);
                        columnIndexOrThrow18 = i16;
                        int i18 = columnIndexOrThrow19;
                        long j = cursorQuery.getLong(i18);
                        columnIndexOrThrow19 = i18;
                        int i19 = columnIndexOrThrow20;
                        long j2 = cursorQuery.getLong(i19);
                        columnIndexOrThrow20 = i19;
                        int i20 = columnIndexOrThrow21;
                        long j3 = cursorQuery.getLong(i20);
                        columnIndexOrThrow21 = i20;
                        int i21 = columnIndexOrThrow22;
                        int i22 = cursorQuery.getInt(i21);
                        columnIndexOrThrow22 = i21;
                        int i23 = columnIndexOrThrow23;
                        int i24 = cursorQuery.getInt(i23);
                        columnIndexOrThrow23 = i23;
                        int i25 = columnIndexOrThrow24;
                        long j4 = cursorQuery.getLong(i25);
                        columnIndexOrThrow24 = i25;
                        int i26 = columnIndexOrThrow25;
                        int i27 = cursorQuery.getInt(i26);
                        columnIndexOrThrow25 = i26;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        arrayList.add(new PAIDataVo(string, string2, string3, f, f2, f3, i2, i3, i4, f4, f5, i5, i6, i8, i11, i13, i15, i17, j, j2, j3, i22, i24, j4, i27, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                        columnIndexOrThrow = i9;
                        i = i7;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    dVar = this;
                    cursorQuery.close();
                    dVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dVar = this;
            }
        }
    }

    public class e implements Callable<Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ boolean b;

        public e(final List val$timestampList, final boolean val$isUpload) {
            this.a = val$timestampList;
            this.b = val$isUpload;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
            sbNewStringBuilder.append("UPDATE PAIDataVo SET isUpload = ");
            sbNewStringBuilder.append("?");
            sbNewStringBuilder.append(" WHERE timestamp in (");
            StringUtil.appendPlaceholders(sbNewStringBuilder, this.a.size());
            sbNewStringBuilder.append(")");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = PaiUserDao_Impl.this.a.compileStatement(sbNewStringBuilder.toString());
            supportSQLiteStatementCompileStatement.bindLong(1, this.b ? 1L : 0L);
            int i = 2;
            for (Long l : this.a) {
                if (l == null) {
                    supportSQLiteStatementCompileStatement.bindNull(i);
                } else {
                    supportSQLiteStatementCompileStatement.bindLong(i, l.longValue());
                }
                i++;
            }
            PaiUserDao_Impl.this.a.beginTransaction();
            try {
                supportSQLiteStatementCompileStatement.executeUpdateDelete();
                PaiUserDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                PaiUserDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class f extends EntityInsertionAdapter<PAIDataVo> {
        public f(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, PAIDataVo pAIDataVo) {
            if (pAIDataVo.getDate() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, pAIDataVo.getDate());
            }
            if (pAIDataVo.getActivityScore() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, pAIDataVo.getActivityScore());
            }
            if (pAIDataVo.getNextActivityScore() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, pAIDataVo.getNextActivityScore());
            }
            supportSQLiteStatement.bindDouble(4, pAIDataVo.getLp());
            supportSQLiteStatement.bindDouble(5, pAIDataVo.getMp());
            supportSQLiteStatement.bindDouble(6, pAIDataVo.getHp());
            supportSQLiteStatement.bindLong(7, pAIDataVo.getLm());
            supportSQLiteStatement.bindLong(8, pAIDataVo.getMm());
            supportSQLiteStatement.bindLong(9, pAIDataVo.getHm());
            supportSQLiteStatement.bindDouble(10, pAIDataVo.getDp());
            supportSQLiteStatement.bindDouble(11, pAIDataVo.getTp());
            supportSQLiteStatement.bindLong(12, pAIDataVo.getAge());
            supportSQLiteStatement.bindLong(13, pAIDataVo.getGd());
            supportSQLiteStatement.bindLong(14, pAIDataVo.getLhr());
            supportSQLiteStatement.bindLong(15, pAIDataVo.getMhr());
            supportSQLiteStatement.bindLong(16, pAIDataVo.getHhr());
            supportSQLiteStatement.bindLong(17, pAIDataVo.getRestHr());
            supportSQLiteStatement.bindLong(18, pAIDataVo.getMaxHr());
            supportSQLiteStatement.bindLong(19, pAIDataVo.getTimestamp());
            supportSQLiteStatement.bindLong(20, pAIDataVo.getTime());
            supportSQLiteStatement.bindLong(21, pAIDataVo.getTimeZone());
            supportSQLiteStatement.bindLong(22, pAIDataVo.getIndex());
            supportSQLiteStatement.bindLong(23, pAIDataVo.getVersion());
            supportSQLiteStatement.bindLong(24, pAIDataVo.getUploadTimestamp());
            supportSQLiteStatement.bindLong(25, pAIDataVo.getDeviceSource());
            if (pAIDataVo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindString(26, pAIDataVo.getDeviceId());
            }
            if (pAIDataVo.getSn() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, pAIDataVo.getSn());
            }
            if (pAIDataVo.getUserId() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindString(28, pAIDataVo.getUserId());
            }
            if (pAIDataVo.getEventType() == null) {
                supportSQLiteStatement.bindNull(29);
            } else {
                supportSQLiteStatement.bindString(29, pAIDataVo.getEventType());
            }
            if (pAIDataVo.getSubType() == null) {
                supportSQLiteStatement.bindNull(30);
            } else {
                supportSQLiteStatement.bindString(30, pAIDataVo.getSubType());
            }
            supportSQLiteStatement.bindLong(31, pAIDataVo.isUpload() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `PAIDataVo` (`date`,`activityScore`,`nextActivityScore`,`lp`,`mp`,`hp`,`lm`,`mm`,`hm`,`dp`,`tp`,`age`,`gd`,`lhr`,`mhr`,`hhr`,`restHr`,`maxHr`,`timestamp`,`time`,`timeZone`,`index`,`version`,`uploadTimestamp`,`deviceSource`,`deviceId`,`sn`,`userId`,`eventType`,`subType`,`isUpload`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM PAIDataVo";
        }
    }

    public class h extends SharedSQLiteStatement {
        public h(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE PAIDataVo SET isUpload = ?";
        }
    }

    public class i implements Callable<Unit> {
        public final /* synthetic */ List a;

        public i(final List val$paiDataVo) {
            this.a = val$paiDataVo;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            PaiUserDao_Impl.this.a.beginTransaction();
            try {
                PaiUserDao_Impl.this.b.insert((Iterable) this.a);
                PaiUserDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                PaiUserDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class j implements Callable<Unit> {
        public final /* synthetic */ boolean a;

        public j(final boolean val$isUpload) {
            this.a = val$isUpload;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementAcquire = PaiUserDao_Impl.this.d.acquire();
            supportSQLiteStatementAcquire.bindLong(1, this.a ? 1L : 0L);
            PaiUserDao_Impl.this.a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                PaiUserDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                PaiUserDao_Impl.this.a.endTransaction();
                PaiUserDao_Impl.this.d.release(supportSQLiteStatementAcquire);
            }
        }
    }

    public class k implements Callable<List<PAIDataVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public k(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f = cursorQuery.getFloat(columnIndexOrThrow4);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow5);
                    float f3 = cursorQuery.getFloat(columnIndexOrThrow6);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow9);
                    float f4 = cursorQuery.getFloat(columnIndexOrThrow10);
                    float f5 = cursorQuery.getFloat(columnIndexOrThrow11);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow12);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow13);
                    int i7 = i;
                    int i8 = cursorQuery.getInt(i7);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    int i11 = cursorQuery.getInt(i10);
                    columnIndexOrThrow15 = i10;
                    int i12 = columnIndexOrThrow16;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow16 = i12;
                    int i14 = columnIndexOrThrow17;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow17 = i14;
                    int i16 = columnIndexOrThrow18;
                    int i17 = cursorQuery.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    long j = cursorQuery.getLong(i18);
                    columnIndexOrThrow19 = i18;
                    int i19 = columnIndexOrThrow20;
                    long j2 = cursorQuery.getLong(i19);
                    columnIndexOrThrow20 = i19;
                    int i20 = columnIndexOrThrow21;
                    long j3 = cursorQuery.getLong(i20);
                    columnIndexOrThrow21 = i20;
                    int i21 = columnIndexOrThrow22;
                    int i22 = cursorQuery.getInt(i21);
                    columnIndexOrThrow22 = i21;
                    int i23 = columnIndexOrThrow23;
                    int i24 = cursorQuery.getInt(i23);
                    columnIndexOrThrow23 = i23;
                    int i25 = columnIndexOrThrow24;
                    long j4 = cursorQuery.getLong(i25);
                    columnIndexOrThrow24 = i25;
                    int i26 = columnIndexOrThrow25;
                    int i27 = cursorQuery.getInt(i26);
                    columnIndexOrThrow25 = i26;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    arrayList.add(new PAIDataVo(string, string2, string3, f, f2, f3, i2, i3, i4, f4, f5, i5, i6, i8, i11, i13, i15, i17, j, j2, j3, i22, i24, j4, i27, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                    columnIndexOrThrow = i9;
                    i = i7;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class l implements Callable<List<PAIDataVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public l(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVo> call() throws Exception {
            l lVar;
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                    int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        float f = cursorQuery.getFloat(columnIndexOrThrow4);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow5);
                        float f3 = cursorQuery.getFloat(columnIndexOrThrow6);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow8);
                        int i4 = cursorQuery.getInt(columnIndexOrThrow9);
                        float f4 = cursorQuery.getFloat(columnIndexOrThrow10);
                        float f5 = cursorQuery.getFloat(columnIndexOrThrow11);
                        int i5 = cursorQuery.getInt(columnIndexOrThrow12);
                        int i6 = cursorQuery.getInt(columnIndexOrThrow13);
                        int i7 = i;
                        int i8 = cursorQuery.getInt(i7);
                        int i9 = columnIndexOrThrow;
                        int i10 = columnIndexOrThrow15;
                        int i11 = cursorQuery.getInt(i10);
                        columnIndexOrThrow15 = i10;
                        int i12 = columnIndexOrThrow16;
                        int i13 = cursorQuery.getInt(i12);
                        columnIndexOrThrow16 = i12;
                        int i14 = columnIndexOrThrow17;
                        int i15 = cursorQuery.getInt(i14);
                        columnIndexOrThrow17 = i14;
                        int i16 = columnIndexOrThrow18;
                        int i17 = cursorQuery.getInt(i16);
                        columnIndexOrThrow18 = i16;
                        int i18 = columnIndexOrThrow19;
                        long j = cursorQuery.getLong(i18);
                        columnIndexOrThrow19 = i18;
                        int i19 = columnIndexOrThrow20;
                        long j2 = cursorQuery.getLong(i19);
                        columnIndexOrThrow20 = i19;
                        int i20 = columnIndexOrThrow21;
                        long j3 = cursorQuery.getLong(i20);
                        columnIndexOrThrow21 = i20;
                        int i21 = columnIndexOrThrow22;
                        int i22 = cursorQuery.getInt(i21);
                        columnIndexOrThrow22 = i21;
                        int i23 = columnIndexOrThrow23;
                        int i24 = cursorQuery.getInt(i23);
                        columnIndexOrThrow23 = i23;
                        int i25 = columnIndexOrThrow24;
                        long j4 = cursorQuery.getLong(i25);
                        columnIndexOrThrow24 = i25;
                        int i26 = columnIndexOrThrow25;
                        int i27 = cursorQuery.getInt(i26);
                        columnIndexOrThrow25 = i26;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        arrayList.add(new PAIDataVo(string, string2, string3, f, f2, f3, i2, i3, i4, f4, f5, i5, i6, i8, i11, i13, i15, i17, j, j2, j3, i22, i24, j4, i27, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                        columnIndexOrThrow = i9;
                        i = i7;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    lVar = this;
                    cursorQuery.close();
                    lVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                lVar = this;
            }
        }
    }

    public class m implements Callable<List<PAIDataVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public m(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVo> call() throws Exception {
            m mVar;
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                    int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        float f = cursorQuery.getFloat(columnIndexOrThrow4);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow5);
                        float f3 = cursorQuery.getFloat(columnIndexOrThrow6);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow8);
                        int i4 = cursorQuery.getInt(columnIndexOrThrow9);
                        float f4 = cursorQuery.getFloat(columnIndexOrThrow10);
                        float f5 = cursorQuery.getFloat(columnIndexOrThrow11);
                        int i5 = cursorQuery.getInt(columnIndexOrThrow12);
                        int i6 = cursorQuery.getInt(columnIndexOrThrow13);
                        int i7 = i;
                        int i8 = cursorQuery.getInt(i7);
                        int i9 = columnIndexOrThrow;
                        int i10 = columnIndexOrThrow15;
                        int i11 = cursorQuery.getInt(i10);
                        columnIndexOrThrow15 = i10;
                        int i12 = columnIndexOrThrow16;
                        int i13 = cursorQuery.getInt(i12);
                        columnIndexOrThrow16 = i12;
                        int i14 = columnIndexOrThrow17;
                        int i15 = cursorQuery.getInt(i14);
                        columnIndexOrThrow17 = i14;
                        int i16 = columnIndexOrThrow18;
                        int i17 = cursorQuery.getInt(i16);
                        columnIndexOrThrow18 = i16;
                        int i18 = columnIndexOrThrow19;
                        long j = cursorQuery.getLong(i18);
                        columnIndexOrThrow19 = i18;
                        int i19 = columnIndexOrThrow20;
                        long j2 = cursorQuery.getLong(i19);
                        columnIndexOrThrow20 = i19;
                        int i20 = columnIndexOrThrow21;
                        long j3 = cursorQuery.getLong(i20);
                        columnIndexOrThrow21 = i20;
                        int i21 = columnIndexOrThrow22;
                        int i22 = cursorQuery.getInt(i21);
                        columnIndexOrThrow22 = i21;
                        int i23 = columnIndexOrThrow23;
                        int i24 = cursorQuery.getInt(i23);
                        columnIndexOrThrow23 = i23;
                        int i25 = columnIndexOrThrow24;
                        long j4 = cursorQuery.getLong(i25);
                        columnIndexOrThrow24 = i25;
                        int i26 = columnIndexOrThrow25;
                        int i27 = cursorQuery.getInt(i26);
                        columnIndexOrThrow25 = i26;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        arrayList.add(new PAIDataVo(string, string2, string3, f, f2, f3, i2, i3, i4, f4, f5, i5, i6, i8, i11, i13, i15, i17, j, j2, j3, i22, i24, j4, i27, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                        columnIndexOrThrow = i9;
                        i = i7;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    mVar = this;
                    cursorQuery.close();
                    mVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mVar = this;
            }
        }
    }

    public class n implements Callable<List<PAIDataVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public n(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PAIDataVo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(PaiUserDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f = cursorQuery.getFloat(columnIndexOrThrow4);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow5);
                    float f3 = cursorQuery.getFloat(columnIndexOrThrow6);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow9);
                    float f4 = cursorQuery.getFloat(columnIndexOrThrow10);
                    float f5 = cursorQuery.getFloat(columnIndexOrThrow11);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow12);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow13);
                    int i7 = i;
                    int i8 = cursorQuery.getInt(i7);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    int i11 = cursorQuery.getInt(i10);
                    columnIndexOrThrow15 = i10;
                    int i12 = columnIndexOrThrow16;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow16 = i12;
                    int i14 = columnIndexOrThrow17;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow17 = i14;
                    int i16 = columnIndexOrThrow18;
                    int i17 = cursorQuery.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    long j = cursorQuery.getLong(i18);
                    columnIndexOrThrow19 = i18;
                    int i19 = columnIndexOrThrow20;
                    long j2 = cursorQuery.getLong(i19);
                    columnIndexOrThrow20 = i19;
                    int i20 = columnIndexOrThrow21;
                    long j3 = cursorQuery.getLong(i20);
                    columnIndexOrThrow21 = i20;
                    int i21 = columnIndexOrThrow22;
                    int i22 = cursorQuery.getInt(i21);
                    columnIndexOrThrow22 = i21;
                    int i23 = columnIndexOrThrow23;
                    int i24 = cursorQuery.getInt(i23);
                    columnIndexOrThrow23 = i23;
                    int i25 = columnIndexOrThrow24;
                    long j4 = cursorQuery.getLong(i25);
                    columnIndexOrThrow24 = i25;
                    int i26 = columnIndexOrThrow25;
                    int i27 = cursorQuery.getInt(i26);
                    columnIndexOrThrow25 = i26;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    arrayList.add(new PAIDataVo(string, string2, string3, f, f2, f3, i2, i3, i4, f4, f5, i5, i6, i8, i11, i13, i15, i17, j, j2, j3, i22, i24, j4, i27, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                    columnIndexOrThrow = i9;
                    i = i7;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public PaiUserDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new f(__db);
        this.c = new g(__db);
        this.d = new h(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public void cleanData() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object getAllUploadPaiList(boolean z, Continuation<? super List<PAIDataVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from PAIDataVo where isUpload = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, z ? 1L : 0L);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new m(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public List<PAIDataVo> getCountPaiList(final int limit) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from PAIDataVo ORDER BY timestamp desc LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow4);
                    float f3 = cursorQuery.getFloat(columnIndexOrThrow5);
                    float f4 = cursorQuery.getFloat(columnIndexOrThrow6);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow7);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow9);
                    float f5 = cursorQuery.getFloat(columnIndexOrThrow10);
                    float f6 = cursorQuery.getFloat(columnIndexOrThrow11);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow12);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow13);
                    int i8 = i2;
                    int i9 = cursorQuery.getInt(i8);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    int i12 = cursorQuery.getInt(i11);
                    columnIndexOrThrow15 = i11;
                    int i13 = columnIndexOrThrow16;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow16 = i13;
                    int i15 = columnIndexOrThrow17;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow17 = i15;
                    int i17 = columnIndexOrThrow18;
                    int i18 = cursorQuery.getInt(i17);
                    columnIndexOrThrow18 = i17;
                    int i19 = columnIndexOrThrow19;
                    long j2 = cursorQuery.getLong(i19);
                    columnIndexOrThrow19 = i19;
                    int i20 = columnIndexOrThrow20;
                    long j3 = cursorQuery.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    long j4 = cursorQuery.getLong(i21);
                    columnIndexOrThrow21 = i21;
                    int i22 = columnIndexOrThrow22;
                    int i23 = cursorQuery.getInt(i22);
                    columnIndexOrThrow22 = i22;
                    int i24 = columnIndexOrThrow23;
                    int i25 = cursorQuery.getInt(i24);
                    columnIndexOrThrow23 = i24;
                    int i26 = columnIndexOrThrow24;
                    long j5 = cursorQuery.getLong(i26);
                    columnIndexOrThrow24 = i26;
                    int i27 = columnIndexOrThrow25;
                    int i28 = cursorQuery.getInt(i27);
                    columnIndexOrThrow25 = i27;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    arrayList.add(new PAIDataVo(string, string2, string3, f2, f3, f4, i3, i4, i5, f5, f6, i6, i7, i9, i12, i14, i16, i18, j2, j3, j4, i23, i25, j5, i28, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                    columnIndexOrThrow = i10;
                    i2 = i8;
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

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object getLimitUploadPaiList(boolean z, int i2, Continuation<? super List<PAIDataVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from PAIDataVo where isUpload = ? ORDER BY timestamp DESC LIMIT?", 2);
        roomSQLiteQueryAcquire.bindLong(1, z ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(2, i2);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new d(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Flow<List<PAIDataVo>> getLimitUserDataFlow(final int count) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM PAIDataVo ORDER BY timestamp desc LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, count);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"PAIDataVo"}, new b(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Flow<List<PAIDataVoMin>> getLimitUserDataFlowMin(final int count) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT date,nextActivityScore,dp,tp,timestamp FROM PAIDataVo ORDER BY timestamp desc LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, count);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"PAIDataVo"}, new c(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object getMaxTimeStamp(final Continuation<? super Long> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT MAX(timestamp) FROM PAIDataVo", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new a(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public LiveData<List<PAIDataVo>> getUserAllPaiData() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"PAIDataVo"}, false, new k(RoomSQLiteQuery.acquire("select * from PAIDataVo order by date desc", 0)));
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public List<PAIDataVo> getUserAllPaiList() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from PAIDataVo order by date desc", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow4);
                    float f3 = cursorQuery.getFloat(columnIndexOrThrow5);
                    float f4 = cursorQuery.getFloat(columnIndexOrThrow6);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow7);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow9);
                    float f5 = cursorQuery.getFloat(columnIndexOrThrow10);
                    float f6 = cursorQuery.getFloat(columnIndexOrThrow11);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow12);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow13);
                    int i8 = i2;
                    int i9 = cursorQuery.getInt(i8);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    int i12 = cursorQuery.getInt(i11);
                    columnIndexOrThrow15 = i11;
                    int i13 = columnIndexOrThrow16;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow16 = i13;
                    int i15 = columnIndexOrThrow17;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow17 = i15;
                    int i17 = columnIndexOrThrow18;
                    int i18 = cursorQuery.getInt(i17);
                    columnIndexOrThrow18 = i17;
                    int i19 = columnIndexOrThrow19;
                    long j2 = cursorQuery.getLong(i19);
                    columnIndexOrThrow19 = i19;
                    int i20 = columnIndexOrThrow20;
                    long j3 = cursorQuery.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    long j4 = cursorQuery.getLong(i21);
                    columnIndexOrThrow21 = i21;
                    int i22 = columnIndexOrThrow22;
                    int i23 = cursorQuery.getInt(i22);
                    columnIndexOrThrow22 = i22;
                    int i24 = columnIndexOrThrow23;
                    int i25 = cursorQuery.getInt(i24);
                    columnIndexOrThrow23 = i24;
                    int i26 = columnIndexOrThrow24;
                    long j5 = cursorQuery.getLong(i26);
                    columnIndexOrThrow24 = i26;
                    int i27 = columnIndexOrThrow25;
                    int i28 = cursorQuery.getInt(i27);
                    columnIndexOrThrow25 = i27;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    arrayList.add(new PAIDataVo(string, string2, string3, f2, f3, f4, i3, i4, i5, f5, f6, i6, i7, i9, i12, i14, i16, i18, j2, j3, j4, i23, i25, j5, i28, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                    columnIndexOrThrow = i10;
                    i2 = i8;
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

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object getUserAllPaiListSuspend(final Continuation<? super List<PAIDataVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from PAIDataVo order by date desc", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new l(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Flow<List<PAIDataVo>> getUserDataFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"PAIDataVo"}, new n(RoomSQLiteQuery.acquire("SELECT * FROM PAIDataVo ORDER BY DATE desc", 0)));
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public List<PAIDataVo> getUserPaiDataBetween(final String startDate, final String endDate) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from PAIDataVo where date >= ? and date <=?", 2);
        if (startDate == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, startDate);
        }
        if (endDate == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, endDate);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityScore");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextActivityScore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_GENDER);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LHR);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MHR);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HHR);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_RHR);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadTimestamp");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow4);
                    float f3 = cursorQuery.getFloat(columnIndexOrThrow5);
                    float f4 = cursorQuery.getFloat(columnIndexOrThrow6);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow7);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow9);
                    float f5 = cursorQuery.getFloat(columnIndexOrThrow10);
                    float f6 = cursorQuery.getFloat(columnIndexOrThrow11);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow12);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow13);
                    int i8 = i2;
                    int i9 = cursorQuery.getInt(i8);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    int i12 = cursorQuery.getInt(i11);
                    columnIndexOrThrow15 = i11;
                    int i13 = columnIndexOrThrow16;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow16 = i13;
                    int i15 = columnIndexOrThrow17;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow17 = i15;
                    int i17 = columnIndexOrThrow18;
                    int i18 = cursorQuery.getInt(i17);
                    columnIndexOrThrow18 = i17;
                    int i19 = columnIndexOrThrow19;
                    long j2 = cursorQuery.getLong(i19);
                    columnIndexOrThrow19 = i19;
                    int i20 = columnIndexOrThrow20;
                    long j3 = cursorQuery.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    long j4 = cursorQuery.getLong(i21);
                    columnIndexOrThrow21 = i21;
                    int i22 = columnIndexOrThrow22;
                    int i23 = cursorQuery.getInt(i22);
                    columnIndexOrThrow22 = i22;
                    int i24 = columnIndexOrThrow23;
                    int i25 = cursorQuery.getInt(i24);
                    columnIndexOrThrow23 = i24;
                    int i26 = columnIndexOrThrow24;
                    long j5 = cursorQuery.getLong(i26);
                    columnIndexOrThrow24 = i26;
                    int i27 = columnIndexOrThrow25;
                    int i28 = cursorQuery.getInt(i27);
                    columnIndexOrThrow25 = i27;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    arrayList.add(new PAIDataVo(string, string2, string3, f2, f3, f4, i3, i4, i5, f5, f6, i6, i7, i9, i12, i14, i16, i18, j2, j3, j4, i23, i25, j5, i28, cursorQuery.isNull(columnIndexOrThrow26) ? null : cursorQuery.getString(columnIndexOrThrow26), cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getString(columnIndexOrThrow27), cursorQuery.isNull(columnIndexOrThrow28) ? null : cursorQuery.getString(columnIndexOrThrow28), cursorQuery.isNull(columnIndexOrThrow29) ? null : cursorQuery.getString(columnIndexOrThrow29), cursorQuery.isNull(columnIndexOrThrow30) ? null : cursorQuery.getString(columnIndexOrThrow30), cursorQuery.getInt(columnIndexOrThrow31) != 0));
                    columnIndexOrThrow = i10;
                    i2 = i8;
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

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object insertOrUpdateUserPai(final List<PAIDataVo> paiDataVo, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new i(paiDataVo), continuation);
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object setUploadSuspend(final boolean isUpload, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new j(isUpload), continuation);
    }

    @Override // com.huami.pai.db.userpai.PaiUserDao
    public Object updateListUploadSuspend(final boolean isUpload, final List<Long> timestampList, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new e(timestampList, isUpload), continuation);
    }
}
