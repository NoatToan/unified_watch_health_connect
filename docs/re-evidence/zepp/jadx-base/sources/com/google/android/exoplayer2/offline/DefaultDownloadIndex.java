package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import defpackage.oc1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDownloadIndex implements WritableDownloadIndex {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 10;
    private static final int H = 11;
    private static final int I = 12;
    private static final int J = 13;
    private static final int K = 14;
    private static final String L = "id = ?";
    private static final String M = "state = 2";
    private static final String P = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    private static final String Q = "1";
    private static final String f = "ExoPlayerDownloads";

    @VisibleForTesting
    public static final int g = 3;
    private static final String h = "id";
    private static final String j = "uri";
    private static final String m = "data";
    private static final String n = "state";
    private static final String r = "stop_reason";
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;
    private final String a;
    private final String b;
    private final DatabaseProvider c;
    private final Object d;

    @GuardedBy("initializationLock")
    private boolean e;
    private static final String N = h(3, 4);
    private static final String i = "mime_type";
    private static final String k = "stream_keys";
    private static final String l = "custom_cache_key";
    private static final String o = "start_time_ms";
    private static final String p = "update_time_ms";
    private static final String q = "content_length";
    private static final String s = "failure_reason";
    private static final String t = "percent_downloaded";
    private static final String u = "bytes_downloaded";
    private static final String v = "key_set_id";
    private static final String[] O = {"id", i, "uri", k, l, "data", "state", o, p, q, "stop_reason", s, t, u, v};

    public static final class b implements DownloadCursor {
        private final Cursor a;

        @Override // com.google.android.exoplayer2.offline.DownloadCursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public int getCount() {
            return this.a.getCount();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public Download getDownload() {
            return DefaultDownloadIndex.f(this.a);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public int getPosition() {
            return this.a.getPosition();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isAfterLast() {
            return oc1.a(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isBeforeFirst() {
            return oc1.b(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isFirst() {
            return oc1.c(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isLast() {
            return oc1.d(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToFirst() {
            return oc1.e(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToLast() {
            return oc1.f(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToNext() {
            return oc1.g(this);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public boolean moveToPosition(int position) {
            return this.a.moveToPosition(position);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToPrevious() {
            return oc1.h(this);
        }

        private b(Cursor cursor) {
            this.a = cursor;
        }
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider) {
        this(databaseProvider, "");
    }

    private static List<StreamKey> b(@Nullable String encodedStreamKeys) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(encodedStreamKeys)) {
            return arrayList;
        }
        for (String str : Util.split(encodedStreamKeys, ",")) {
            String[] strArrSplit = Util.split(str, "\\.");
            Assertions.checkState(strArrSplit.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
        }
        return arrayList;
    }

    @VisibleForTesting
    public static String c(List<StreamKey> streamKeys) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < streamKeys.size(); i2++) {
            StreamKey streamKey = streamKeys.get(i2);
            sb.append(streamKey.periodIndex);
            sb.append('.');
            sb.append(streamKey.groupIndex);
            sb.append('.');
            sb.append(streamKey.trackIndex);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private void d() throws DatabaseIOException {
        synchronized (this.d) {
            if (this.e) {
                return;
            }
            try {
                int version = VersionTable.getVersion(this.c.getReadableDatabase(), 0, this.a);
                if (version != 3) {
                    SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        VersionTable.setVersion(writableDatabase, 0, this.a, 3);
                        List<Download> listJ = version == 2 ? j(writableDatabase) : new ArrayList<>();
                        String strValueOf = String.valueOf(this.b);
                        writableDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
                        String str = this.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 415);
                        sb.append("CREATE TABLE ");
                        sb.append(str);
                        sb.append(" ");
                        sb.append(P);
                        writableDatabase.execSQL(sb.toString());
                        Iterator<Download> it2 = listJ.iterator();
                        while (it2.hasNext()) {
                            k(it2.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.e = true;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }
    }

    private Cursor e(String selection, @Nullable String[] selectionArgs) throws DatabaseIOException {
        try {
            return this.c.getReadableDatabase().query(this.b, O, selection, selectionArgs, null, null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Download f(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        DownloadRequest.Builder streamKeys = new DownloadRequest.Builder((String) Assertions.checkNotNull(cursor.getString(0)), Uri.parse((String) Assertions.checkNotNull(cursor.getString(2)))).setMimeType(cursor.getString(1)).setStreamKeys(b(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestBuild = streamKeys.setKeySetId(blob).setCustomCacheKey(cursor.getString(4)).setData(cursor.getBlob(5)).build();
        DownloadProgress downloadProgress = new DownloadProgress();
        downloadProgress.bytesDownloaded = cursor.getLong(13);
        downloadProgress.percentDownloaded = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new Download(downloadRequestBuild, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    private static Download g(Cursor cursor) {
        DownloadRequest downloadRequestBuild = new DownloadRequest.Builder((String) Assertions.checkNotNull(cursor.getString(0)), Uri.parse((String) Assertions.checkNotNull(cursor.getString(2)))).setMimeType(i(cursor.getString(1))).setStreamKeys(b(cursor.getString(3))).setCustomCacheKey(cursor.getString(4)).setData(cursor.getBlob(5)).build();
        DownloadProgress downloadProgress = new DownloadProgress();
        downloadProgress.bytesDownloaded = cursor.getLong(13);
        downloadProgress.percentDownloaded = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new Download(downloadRequestBuild, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    private static String h(int... states) {
        if (states.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state");
        sb.append(" IN (");
        for (int i2 = 0; i2 < states.length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(states[i2]);
        }
        sb.append(')');
        return sb.toString();
    }

    private static String i(@Nullable String downloadType) {
        if ("dash".equals(downloadType)) {
            return MimeTypes.APPLICATION_MPD;
        }
        if ("hls".equals(downloadType)) {
            return MimeTypes.APPLICATION_M3U8;
        }
        return "ss".equals(downloadType) ? MimeTypes.APPLICATION_SS : MimeTypes.VIDEO_UNKNOWN;
    }

    private List<Download> j(SQLiteDatabase database) {
        ArrayList arrayList = new ArrayList();
        if (!Util.tableExists(database, this.b)) {
            return arrayList;
        }
        Cursor cursorQuery = database.query(this.b, new String[]{"id", "title", "uri", k, l, "data", "state", o, p, q, "stop_reason", s, t, u}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(g(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private void k(Download download, SQLiteDatabase database) {
        byte[] bArr = download.request.keySetId;
        if (bArr == null) {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", download.request.id);
        contentValues.put(i, download.request.mimeType);
        contentValues.put("uri", download.request.uri.toString());
        contentValues.put(k, c(download.request.streamKeys));
        contentValues.put(l, download.request.customCacheKey);
        contentValues.put("data", download.request.data);
        contentValues.put("state", Integer.valueOf(download.state));
        contentValues.put(o, Long.valueOf(download.startTimeMs));
        contentValues.put(p, Long.valueOf(download.updateTimeMs));
        contentValues.put(q, Long.valueOf(download.contentLength));
        contentValues.put("stop_reason", Integer.valueOf(download.stopReason));
        contentValues.put(s, Integer.valueOf(download.failureReason));
        contentValues.put(t, Float.valueOf(download.getPercentDownloaded()));
        contentValues.put(u, Long.valueOf(download.getBytesDownloaded()));
        contentValues.put(v, bArr);
        database.replaceOrThrow(this.b, null, contentValues);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadIndex
    @Nullable
    public Download getDownload(String id) throws DatabaseIOException {
        d();
        try {
            Cursor cursorE = e(L, new String[]{id});
            try {
                if (cursorE.getCount() == 0) {
                    cursorE.close();
                    return null;
                }
                cursorE.moveToNext();
                Download downloadF = f(cursorE);
                cursorE.close();
                return downloadF;
            } catch (Throwable th) {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
        throw new DatabaseIOException(e);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadIndex
    public DownloadCursor getDownloads(int... states) throws DatabaseIOException {
        d();
        return new b(e(h(states), null));
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void putDownload(Download download) throws DatabaseIOException {
        d();
        try {
            k(download, this.c.getWritableDatabase());
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void removeDownload(String id) throws DatabaseIOException {
        d();
        try {
            this.c.getWritableDatabase().delete(this.b, L, new String[]{id});
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setDownloadingStatesToQueued() throws DatabaseIOException {
        d();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.c.getWritableDatabase().update(this.b, contentValues, M, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStatesToRemoving() throws DatabaseIOException {
        d();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put(s, (Integer) 0);
            this.c.getWritableDatabase().update(this.b, contentValues, null, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStopReason(int stopReason) throws DatabaseIOException {
        d();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(stopReason));
            this.c.getWritableDatabase().update(this.b, contentValues, N, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider, String name) {
        this.a = name;
        this.c = databaseProvider;
        String strValueOf = String.valueOf(name);
        this.b = strValueOf.length() != 0 ? f.concat(strValueOf) : new String(f);
        this.d = new Object();
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStopReason(String id, int stopReason) throws DatabaseIOException {
        d();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(stopReason));
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            String str = this.b;
            String str2 = N;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 11);
            sb.append(str2);
            sb.append(" AND ");
            sb.append(L);
            writableDatabase.update(str, contentValues, sb.toString(), new String[]{id});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
