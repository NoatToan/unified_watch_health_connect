package com.huami.ecg.core.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.ecg.core.db.convert.Converters;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class EcgTagDao_Impl implements EcgTagDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<EcgTag> b;
    private final Converters c = new Converters();
    private final EntityInsertionAdapter<EcgTag> d;
    private final EntityDeletionOrUpdateAdapter<EcgTag> e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;

    public class a extends EntityInsertionAdapter<EcgTag> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgTag ecgTag) {
            supportSQLiteStatement.bindLong(1, ecgTag.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String());
            supportSQLiteStatement.bindLong(2, ecgTag.getSynced());
            EcgTagValue value = ecgTag.getValue();
            if (value == null) {
                supportSQLiteStatement.bindNull(3);
                supportSQLiteStatement.bindNull(4);
                supportSQLiteStatement.bindNull(5);
                supportSQLiteStatement.bindNull(6);
                return;
            }
            String strListToString = EcgTagDao_Impl.this.c.listToString(value.getStringTags());
            if (strListToString == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, strListToString);
            }
            if (value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String());
            }
            if (value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String());
            }
            supportSQLiteStatement.bindLong(6, value.getLocalVoiceUpdateTime());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ecg_tag` (`ecg_id`,`synced`,`stringTags`,`customTag`,`voiceTag`,`voiceUpdateTime`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class b extends EntityInsertionAdapter<EcgTag> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgTag ecgTag) {
            supportSQLiteStatement.bindLong(1, ecgTag.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String());
            supportSQLiteStatement.bindLong(2, ecgTag.getSynced());
            EcgTagValue value = ecgTag.getValue();
            if (value == null) {
                supportSQLiteStatement.bindNull(3);
                supportSQLiteStatement.bindNull(4);
                supportSQLiteStatement.bindNull(5);
                supportSQLiteStatement.bindNull(6);
                return;
            }
            String strListToString = EcgTagDao_Impl.this.c.listToString(value.getStringTags());
            if (strListToString == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, strListToString);
            }
            if (value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String());
            }
            if (value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String());
            }
            supportSQLiteStatement.bindLong(6, value.getLocalVoiceUpdateTime());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `ecg_tag` (`ecg_id`,`synced`,`stringTags`,`customTag`,`voiceTag`,`voiceUpdateTime`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class c extends EntityDeletionOrUpdateAdapter<EcgTag> {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgTag ecgTag) {
            supportSQLiteStatement.bindLong(1, ecgTag.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `ecg_tag` WHERE `ecg_id` = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_tag where ecg_id = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_tag";
        }
    }

    public class f implements Callable<EcgTag> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcgTag call() throws Exception {
            EcgTag ecgTag = null;
            EcgTagValue ecgTagValue = null;
            Cursor cursorQuery = DBUtil.query(EcgTagDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
                if (cursorQuery.moveToFirst()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow3) || !cursorQuery.isNull(columnIndexOrThrow4) || !cursorQuery.isNull(columnIndexOrThrow5) || !cursorQuery.isNull(columnIndexOrThrow6)) {
                        ecgTagValue = new EcgTagValue();
                        ecgTagValue.setStringTags(EcgTagDao_Impl.this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                        ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                        ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                        ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                    }
                    EcgTag ecgTag2 = new EcgTag();
                    ecgTag2.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                    ecgTag2.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                    ecgTag2.setValue(ecgTagValue);
                    ecgTag = ecgTag2;
                }
                return ecgTag;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class g implements Callable<List<EcgTag>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EcgTag> call() throws Exception {
            EcgTagValue ecgTagValue;
            Cursor cursorQuery = DBUtil.query(EcgTagDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.isNull(columnIndexOrThrow3) && cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5) && cursorQuery.isNull(columnIndexOrThrow6)) {
                        ecgTagValue = null;
                    } else {
                        ecgTagValue = new EcgTagValue();
                        ecgTagValue.setStringTags(EcgTagDao_Impl.this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                        ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                        ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                        ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                    }
                    EcgTag ecgTag = new EcgTag();
                    ecgTag.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                    ecgTag.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                    ecgTag.setValue(ecgTagValue);
                    arrayList.add(ecgTag);
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

    public class h implements Callable<List<EcgTag>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EcgTag> call() throws Exception {
            EcgTagValue ecgTagValue;
            Cursor cursorQuery = DBUtil.query(EcgTagDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.isNull(columnIndexOrThrow3) && cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5) && cursorQuery.isNull(columnIndexOrThrow6)) {
                        ecgTagValue = null;
                    } else {
                        ecgTagValue = new EcgTagValue();
                        ecgTagValue.setStringTags(EcgTagDao_Impl.this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                        ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                        ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                        ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                    }
                    EcgTag ecgTag = new EcgTag();
                    ecgTag.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                    ecgTag.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                    ecgTag.setValue(ecgTagValue);
                    arrayList.add(ecgTag);
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

    public EcgTagDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
        this.e = new c(roomDatabase);
        this.f = new d(roomDatabase);
        this.g = new e(roomDatabase);
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void clear() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void delete(EcgTag ecgTag) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.handle(ecgTag);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public EcgTag get(long j) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_tag where ecg_id = ? limit 1", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.a.assertNotSuspendingTransaction();
        EcgTag ecgTag = null;
        EcgTagValue ecgTagValue = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
            if (cursorQuery.moveToFirst()) {
                if (!cursorQuery.isNull(columnIndexOrThrow3) || !cursorQuery.isNull(columnIndexOrThrow4) || !cursorQuery.isNull(columnIndexOrThrow5) || !cursorQuery.isNull(columnIndexOrThrow6)) {
                    ecgTagValue = new EcgTagValue();
                    ecgTagValue.setStringTags(this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                    ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                    ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                    ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                }
                EcgTag ecgTag2 = new EcgTag();
                ecgTag2.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                ecgTag2.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                ecgTag2.setValue(ecgTagValue);
                ecgTag = ecgTag2;
            }
            return ecgTag;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public List<EcgTag> getAll() {
        EcgTagValue ecgTagValue;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_tag", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.isNull(columnIndexOrThrow3) && cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5) && cursorQuery.isNull(columnIndexOrThrow6)) {
                    ecgTagValue = null;
                } else {
                    ecgTagValue = new EcgTagValue();
                    ecgTagValue.setStringTags(this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                    ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                    ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                    ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                }
                EcgTag ecgTag = new EcgTag();
                ecgTag.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                ecgTag.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                ecgTag.setValue(ecgTagValue);
                arrayList.add(ecgTag);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public LiveData<List<EcgTag>> getAllData() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_tag"}, false, new g(RoomSQLiteQuery.acquire("select * from ecg_tag", 0)));
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public LiveData<EcgTag> getData(long j) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_tag where ecg_id = ? limit 1", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_tag"}, false, new f(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public List<EcgTag> getTags(List<Long> list) {
        EcgTagValue ecgTagValue;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" from ecg_tag where ecg_id in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindLong(i, l.longValue());
            }
            i++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.isNull(columnIndexOrThrow3) && cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5) && cursorQuery.isNull(columnIndexOrThrow6)) {
                    ecgTagValue = null;
                } else {
                    ecgTagValue = new EcgTagValue();
                    ecgTagValue.setStringTags(this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                    ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                    ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                    ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                }
                EcgTag ecgTag = new EcgTag();
                ecgTag.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                ecgTag.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                ecgTag.setValue(ecgTagValue);
                arrayList.add(ecgTag);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public LiveData<List<EcgTag>> getTagsData(List<Long> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" from ecg_tag where ecg_id in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindLong(i, l.longValue());
            }
            i++;
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_tag"}, false, new h(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public List<EcgTag> getUnSyncTag() {
        EcgTagValue ecgTagValue;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_tag where synced = 0 and ecg_id > 0", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.ECG_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.STRING_TAGS);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.CUSTOM_TAG);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.VOICE_TAG);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgTag.LOCAL_VOICE_UPDATE_TIME);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.isNull(columnIndexOrThrow3) && cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5) && cursorQuery.isNull(columnIndexOrThrow6)) {
                    ecgTagValue = null;
                } else {
                    ecgTagValue = new EcgTagValue();
                    ecgTagValue.setStringTags(this.c.stringToList(cursorQuery.getString(columnIndexOrThrow3)));
                    ecgTagValue.setCustomTag(cursorQuery.getString(columnIndexOrThrow4));
                    ecgTagValue.setVoiceTag(cursorQuery.getString(columnIndexOrThrow5));
                    ecgTagValue.setLocalVoiceUpdateTime(cursorQuery.getLong(columnIndexOrThrow6));
                }
                EcgTag ecgTag = new EcgTag();
                ecgTag.setEcgId(cursorQuery.getLong(columnIndexOrThrow));
                ecgTag.setSynced(cursorQuery.getInt(columnIndexOrThrow2));
                ecgTag.setValue(ecgTagValue);
                arrayList.add(ecgTag);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void insertIgnore(EcgTag ecgTag) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(ecgTag);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void insertOrReplace(EcgTag ecgTag) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ecgTag);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void delete(long j) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void insertIgnore(List<EcgTag> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void insertOrReplace(List<EcgTag> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void insertIgnore(EcgTag[] ecgTagArr) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(ecgTagArr);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgTagDao
    public void insertOrReplace(EcgTag[] ecgTagArr) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ecgTagArr);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
