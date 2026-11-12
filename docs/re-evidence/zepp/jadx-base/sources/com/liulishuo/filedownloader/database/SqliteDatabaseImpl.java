package com.liulishuo.filedownloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.ConnectionModel;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SqliteDatabaseImpl implements FileDownloadDatabase {
    public static final String CONNECTION_TABLE_NAME = "filedownloaderConnection";
    public static final String TABLE_NAME = "filedownloader";
    private final SQLiteDatabase a = new SqliteDatabaseOpenHelper(FileDownloadHelper.getAppContext()).getWritableDatabase();

    public class Maintainer implements FileDownloadDatabase.Maintainer {
        private final SparseArray<FileDownloadModel> a;
        private a b;
        private final SparseArray<FileDownloadModel> c;
        private final SparseArray<List<ConnectionModel>> d;

        public Maintainer(SqliteDatabaseImpl sqliteDatabaseImpl) {
            this(null, null);
        }

        @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase.Maintainer
        public void changeFileDownloadModelId(int i, FileDownloadModel fileDownloadModel) {
            this.a.put(i, fileDownloadModel);
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            a aVar = SqliteDatabaseImpl.this.new a();
            this.b = aVar;
            return aVar;
        }

        @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase.Maintainer
        public void onFinishMaintain() {
            a aVar = this.b;
            if (aVar != null) {
                aVar.b();
            }
            int size = this.a.size();
            if (size < 0) {
                return;
            }
            SqliteDatabaseImpl.this.a.beginTransaction();
            for (int i = 0; i < size; i++) {
                try {
                    int iKeyAt = this.a.keyAt(i);
                    FileDownloadModel fileDownloadModel = this.a.get(iKeyAt);
                    SqliteDatabaseImpl.this.a.delete(SqliteDatabaseImpl.TABLE_NAME, "_id = ?", new String[]{String.valueOf(iKeyAt)});
                    SqliteDatabaseImpl.this.a.insert(SqliteDatabaseImpl.TABLE_NAME, null, fileDownloadModel.toContentValues());
                    if (fileDownloadModel.getConnectionCount() > 1) {
                        List<ConnectionModel> listFindConnectionModel = SqliteDatabaseImpl.this.findConnectionModel(iKeyAt);
                        if (listFindConnectionModel.size() > 0) {
                            SqliteDatabaseImpl.this.a.delete(SqliteDatabaseImpl.CONNECTION_TABLE_NAME, "id = ?", new String[]{String.valueOf(iKeyAt)});
                            for (ConnectionModel connectionModel : listFindConnectionModel) {
                                connectionModel.setId(fileDownloadModel.getId());
                                SqliteDatabaseImpl.this.a.insert(SqliteDatabaseImpl.CONNECTION_TABLE_NAME, null, connectionModel.toContentValues());
                            }
                        }
                    }
                } catch (Throwable th) {
                    SqliteDatabaseImpl.this.a.endTransaction();
                    throw th;
                }
            }
            SparseArray<FileDownloadModel> sparseArray = this.c;
            if (sparseArray != null && this.d != null) {
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int id = this.c.valueAt(i2).getId();
                    List<ConnectionModel> listFindConnectionModel2 = SqliteDatabaseImpl.this.findConnectionModel(id);
                    if (listFindConnectionModel2 != null && listFindConnectionModel2.size() > 0) {
                        this.d.put(id, listFindConnectionModel2);
                    }
                }
            }
            SqliteDatabaseImpl.this.a.setTransactionSuccessful();
            SqliteDatabaseImpl.this.a.endTransaction();
        }

        @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase.Maintainer
        public void onRefreshedValidData(FileDownloadModel fileDownloadModel) {
            SparseArray<FileDownloadModel> sparseArray = this.c;
            if (sparseArray != null) {
                sparseArray.put(fileDownloadModel.getId(), fileDownloadModel);
            }
        }

        @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase.Maintainer
        public void onRemovedInvalidData(FileDownloadModel fileDownloadModel) {
        }

        public Maintainer(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<ConnectionModel>> sparseArray2) {
            this.a = new SparseArray<>();
            this.c = sparseArray;
            this.d = sparseArray2;
        }
    }

    public static class Maker implements FileDownloadHelper.DatabaseCustomMaker {
        @Override // com.liulishuo.filedownloader.util.FileDownloadHelper.DatabaseCustomMaker
        public FileDownloadDatabase customMake() {
            return new SqliteDatabaseImpl();
        }
    }

    public class a implements Iterator<FileDownloadModel> {
        private final Cursor a;
        private final List<Integer> b = new ArrayList();
        private int c;

        public a() {
            this.a = SqliteDatabaseImpl.this.a.rawQuery("SELECT * FROM filedownloader", null);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            FileDownloadModel fileDownloadModelC = SqliteDatabaseImpl.c(this.a);
            this.c = fileDownloadModelC.getId();
            return fileDownloadModelC;
        }

        public void b() {
            this.a.close();
            if (this.b.isEmpty()) {
                return;
            }
            String strJoin = TextUtils.join(", ", this.b);
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "delete %s", strJoin);
            }
            SqliteDatabaseImpl.this.a.execSQL(FileDownloadUtils.formatString("DELETE FROM %s WHERE %s IN (%s);", SqliteDatabaseImpl.TABLE_NAME, "_id", strJoin));
            SqliteDatabaseImpl.this.a.execSQL(FileDownloadUtils.formatString("DELETE FROM %s WHERE %s IN (%s);", SqliteDatabaseImpl.CONNECTION_TABLE_NAME, "id", strJoin));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.moveToNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.b.add(Integer.valueOf(this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileDownloadModel c(Cursor cursor) {
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        fileDownloadModel.setId(cursor.getInt(cursor.getColumnIndex("_id")));
        fileDownloadModel.setUrl(cursor.getString(cursor.getColumnIndex("url")));
        fileDownloadModel.setPath(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex(FileDownloadModel.PATH_AS_DIRECTORY)) == 1);
        fileDownloadModel.setStatus((byte) cursor.getShort(cursor.getColumnIndex("status")));
        fileDownloadModel.setSoFar(cursor.getLong(cursor.getColumnIndex(FileDownloadModel.SOFAR)));
        fileDownloadModel.setTotal(cursor.getLong(cursor.getColumnIndex("total")));
        fileDownloadModel.setErrMsg(cursor.getString(cursor.getColumnIndex(FileDownloadModel.ERR_MSG)));
        fileDownloadModel.setETag(cursor.getString(cursor.getColumnIndex(FileDownloadModel.ETAG)));
        fileDownloadModel.setFilename(cursor.getString(cursor.getColumnIndex(FileDownloadModel.FILENAME)));
        fileDownloadModel.setConnectionCount(cursor.getInt(cursor.getColumnIndex(FileDownloadModel.CONNECTION_COUNT)));
        return fileDownloadModel;
    }

    public static Maker createMaker() {
        return new Maker();
    }

    private void d(int i, ContentValues contentValues) {
        this.a.update(TABLE_NAME, contentValues, "_id = ? ", new String[]{String.valueOf(i)});
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void clear() {
        this.a.delete(TABLE_NAME, null, null);
        this.a.delete(CONNECTION_TABLE_NAME, null, null);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public FileDownloadModel find(int i) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        try {
            cursorRawQuery = this.a.rawQuery(FileDownloadUtils.formatString("SELECT * FROM %s WHERE %s = ?", TABLE_NAME, "_id"), new String[]{Integer.toString(i)});
            try {
                if (!cursorRawQuery.moveToNext()) {
                    cursorRawQuery.close();
                    return null;
                }
                FileDownloadModel fileDownloadModelC = c(cursorRawQuery);
                cursorRawQuery.close();
                return fileDownloadModelC;
            } catch (Throwable th2) {
                th = th2;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public List<ConnectionModel> findConnectionModel(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.a.rawQuery(FileDownloadUtils.formatString("SELECT * FROM %s WHERE %s = ?", CONNECTION_TABLE_NAME, "id"), new String[]{Integer.toString(i)});
            while (cursorRawQuery.moveToNext()) {
                ConnectionModel connectionModel = new ConnectionModel();
                connectionModel.setId(i);
                connectionModel.setIndex(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(ConnectionModel.INDEX)));
                connectionModel.setStartOffset(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(ConnectionModel.START_OFFSET)));
                connectionModel.setCurrentOffset(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(ConnectionModel.CURRENT_OFFSET)));
                connectionModel.setEndOffset(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(ConnectionModel.END_OFFSET)));
                arrayList.add(connectionModel);
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void insert(FileDownloadModel fileDownloadModel) {
        this.a.insert(TABLE_NAME, null, fileDownloadModel.toContentValues());
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void insertConnectionModel(ConnectionModel connectionModel) {
        this.a.insert(CONNECTION_TABLE_NAME, null, connectionModel.toContentValues());
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public FileDownloadDatabase.Maintainer maintainer() {
        return new Maintainer(this);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void onTaskStart(int i) {
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public boolean remove(int i) {
        return this.a.delete(TABLE_NAME, "_id = ?", new String[]{String.valueOf(i)}) != 0;
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void removeConnections(int i) {
        this.a.execSQL("DELETE FROM filedownloaderConnection WHERE id = " + i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            FileDownloadLog.w(this, "update but model == null!", new Object[0]);
        } else if (find(fileDownloadModel.getId()) == null) {
            insert(fileDownloadModel);
        } else {
            this.a.update(TABLE_NAME, fileDownloadModel.toContentValues(), "_id = ? ", new String[]{String.valueOf(fileDownloadModel.getId())});
        }
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateCompleted(int i, long j) {
        remove(i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateConnected(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put("total", Long.valueOf(j));
        contentValues.put(FileDownloadModel.ETAG, str);
        contentValues.put(FileDownloadModel.FILENAME, str2);
        d(i, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateConnectionCount(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.CONNECTION_COUNT, Integer.valueOf(i2));
        this.a.update(TABLE_NAME, contentValues, "_id = ? ", new String[]{Integer.toString(i)});
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateConnectionModel(int i, int i2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConnectionModel.CURRENT_OFFSET, Long.valueOf(j));
        this.a.update(CONNECTION_TABLE_NAME, contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateError(int i, Throwable th, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.ERR_MSG, th.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j));
        d(i, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateOldEtagOverdue(int i, String str, long j, long j2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j));
        contentValues.put("total", Long.valueOf(j2));
        contentValues.put(FileDownloadModel.ETAG, str);
        contentValues.put(FileDownloadModel.CONNECTION_COUNT, Integer.valueOf(i2));
        d(i, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updatePause(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j));
        d(i, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updatePending(int i) {
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateProgress(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j));
        d(i, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateRetry(int i, Throwable th) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.ERR_MSG, th.toString());
        contentValues.put("status", (Byte) (byte) 5);
        d(i, contentValues);
    }

    public FileDownloadDatabase.Maintainer maintainer(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<ConnectionModel>> sparseArray2) {
        return new Maintainer(sparseArray, sparseArray2);
    }
}
