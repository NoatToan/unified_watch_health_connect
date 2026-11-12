package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.huawei.hms.network.embedded.k;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "()V", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SupportSQLiteCompat {
    private SupportSQLiteCompat() {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007JI\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0007¨\u0006 "}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "()V", "cancel", "", "cancellationSignal", "Landroid/os/CancellationSignal;", "createCancellationSignal", "deleteDatabase", "", "file", "Ljava/io/File;", "disableWriteAheadLogging", "sQLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "isWriteAheadLoggingEnabled", "rawQueryWithFactory", "Landroid/database/Cursor;", "sql", "", "selectionArgs", "", "editTable", "cursorFactory", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "setForeignKeyConstraintsEnabled", k.g, "setWriteAheadLoggingEnabled", "sQLiteOpenHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "enabled", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @JvmStatic
        public static final void cancel(CancellationSignal cancellationSignal) {
            zcp.c(cancellationSignal, "");
            cancellationSignal.cancel();
        }

        @JvmStatic
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @JvmStatic
        public static final boolean deleteDatabase(File file) {
            zcp.c(file, "");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @JvmStatic
        public static final Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String editTable, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
            zcp.c(sQLiteDatabase, "");
            zcp.c(sql, "");
            zcp.c(selectionArgs, "");
            zcp.c(cancellationSignal, "");
            zcp.c(cursorFactory, "");
            Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, editTable, cancellationSignal);
            zcp.b((Object) cursorRawQueryWithFactory, "");
            return cursorRawQueryWithFactory;
        }

        @JvmStatic
        public static final void setForeignKeyConstraintsEnabled(SQLiteDatabase sQLiteDatabase, boolean enable) {
            zcp.c(sQLiteDatabase, "");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(enable);
        }

        @JvmStatic
        public static final void disableWriteAheadLogging(SQLiteDatabase sQLiteDatabase) {
            zcp.c(sQLiteDatabase, "");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @JvmStatic
        public static final boolean isWriteAheadLoggingEnabled(SQLiteDatabase sQLiteDatabase) {
            zcp.c(sQLiteDatabase, "");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @JvmStatic
        public static final void setWriteAheadLoggingEnabled(SQLiteOpenHelper sQLiteOpenHelper, boolean enabled) {
            zcp.c(sQLiteOpenHelper, "");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(enabled);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "()V", "getNotificationUri", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @JvmStatic
        public static final Uri getNotificationUri(Cursor cursor) {
            zcp.c(cursor, "");
            Uri notificationUri = cursor.getNotificationUri();
            zcp.b((Object) notificationUri, "");
            return notificationUri;
        }

        @JvmStatic
        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            zcp.c(activityManager, "");
            return activityManager.isLowRamDevice();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "()V", "getNoBackupFilesDir", "Ljava/io/File;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @JvmStatic
        public static final File getNoBackupFilesDir(Context context) {
            zcp.c(context, "");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            zcp.b((Object) noBackupFilesDir, "");
            return noBackupFilesDir;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "()V", "setExtras", "", "cursor", "Landroid/database/Cursor;", JsbMapKeyNames.H5_EXTRAS, "Landroid/os/Bundle;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @JvmStatic
        public static final void setExtras(Cursor cursor, Bundle extras) {
            zcp.c(cursor, "");
            zcp.c(extras, "");
            cursor.setExtras(extras);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "()V", "getNotificationUris", "", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "setNotificationUris", "", "cr", "Landroid/content/ContentResolver;", "uris", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void setNotificationUris(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
            zcp.c(cursor, "");
            zcp.c(cr, "");
            zcp.c(uris, "");
            cursor.setNotificationUris(cr, uris);
        }

        @JvmStatic
        public static final List<Uri> getNotificationUris(Cursor cursor) {
            zcp.c(cursor, "");
            List<Uri> notificationUris = cursor.getNotificationUris();
            zcp.e(notificationUris);
            return notificationUris;
        }
    }
}
