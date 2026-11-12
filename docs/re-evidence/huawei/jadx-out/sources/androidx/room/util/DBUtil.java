package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zby;
import defpackage.zcp;
import defpackage.zes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"createCancellationSignal", "Landroid/os/CancellationSignal;", "dropFtsSyncTriggers", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "foreignKeyCheck", "tableName", "", "processForeignKeyCheckFailure", "cursor", "Landroid/database/Cursor;", "query", "Landroidx/room/RoomDatabase;", "sqLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "maybeCopy", "", "signal", "readVersion", "", "databaseFile", "Ljava/io/File;", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DBUtil {
    @Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z) {
        zcp.c(roomDatabase, "");
        zcp.c(supportSQLiteQuery, "");
        return query(roomDatabase, supportSQLiteQuery, z, null);
    }

    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        zcp.c(roomDatabase, "");
        zcp.c(supportSQLiteQuery, "");
        Cursor cursorQuery = roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }

    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
        zcp.c(supportSQLiteDatabase, "");
        List listC = yzp.c();
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                listC.add(cursor.getString(0));
            }
            yzc yzcVar = yzc.e;
            zby.d(cursorQuery, null);
            for (String str : yzp.c(listC)) {
                zcp.b((Object) str, "");
                if (zes.e(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                    supportSQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + str);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static final void foreignKeyCheck(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        zcp.c(supportSQLiteDatabase, "");
        zcp.c(str, "");
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            if (cursor.getCount() > 0) {
                throw new SQLiteConstraintException(processForeignKeyCheckFailure(cursor));
            }
            yzc yzcVar = yzc.e;
            zby.d(cursorQuery, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static final int readVersion(File file) throws IOException {
        zcp.c(file, "");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel fileChannel = channel;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            fileChannel.tryLock(60L, 4L, true);
            fileChannel.position(60L);
            if (fileChannel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            zby.d(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(channel, th);
                throw th2;
            }
        }
    }

    public static final CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                zcp.b((Object) string, "");
                String string2 = cursor.getString(2);
                zcp.b((Object) string2, "");
                linkedHashMap.put(string, string2);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(count);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        String string3 = sb.toString();
        zcp.b((Object) string3, "");
        return string3;
    }
}
