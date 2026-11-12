package com.xiaomi.fitness.common.utils;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bvc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ9\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011JC\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0010¢\u0006\u0002\u0010\u0013J|\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u00150\u001a¢\u0006\u0002\u0010\u001fJ \u0010\u0004\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nJA\u0010\u0012\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0010¢\u0006\u0002\u0010$J~\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u00150\u001a¢\u0006\u0002\u0010%J*\u0010&\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+J\u0018\u0010,\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+J1\u0010-\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010/¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SafeDBUtil;", "", "<init>", "()V", "safeInsert", "Landroid/net/Uri;", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "safeDelete", "", "where", "", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "safeUpdate", "(Landroid/content/Context;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "safeQuery", "T", "projection", "selection", "sortOrder", "handler", "Lkotlin/Function1;", "Landroid/database/Cursor;", "Lkotlin/ParameterName;", "name", "cursor", "(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "tableName", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "safeRegisterContentObserver", "", "notifyForDescendants", "", "observer", "Landroid/database/ContentObserver;", "safeUnregisterContentObserver", "safeRegisterBroadcastReceiver", "receiver", "Landroid/content/BroadcastReceiver;", "intentFilter", "Landroid/content/IntentFilter;", "flag", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)V", "safeUnregisterBroadcastReceiver", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeDBUtil {

    @NotNull
    public static final SafeDBUtil INSTANCE = new SafeDBUtil();

    private SafeDBUtil() {
    }

    public final int safeDelete(@NotNull Context context, @Nullable Uri uri, @Nullable String where, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            return contentResolver.delete(uri, where, selectionArgs);
        } catch (Exception e) {
            Logger.w("Failed to delete from context: " + context + ", uri: " + uri + ", where: " + where + ", error: " + e, new Object[0]);
            return -1;
        }
    }

    @Nullable
    public final Uri safeInsert(@NotNull Context context, @Nullable Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            return contentResolver.insert(uri, values);
        } catch (Exception e) {
            Logger.INSTANCE.w("Failed to insert to context: " + context + ", uri: " + uri, e);
            return null;
        }
    }

    public final <T> T safeQuery(@NotNull Context context, @Nullable Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull Function1<? super Cursor, ? extends T> handler) throws Throwable {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            cursorQuery = contentResolver.query(uri, projection, selection, selectionArgs, sortOrder);
            try {
                try {
                    T tInvoke = handler.invoke(cursorQuery);
                    bvc.a(cursorQuery);
                    return tInvoke;
                } catch (Exception e) {
                    e = e;
                    Logger.w("Failed to query from context: " + context + ", uri: " + uri + ", projection: " + projection + ", selection: " + selection + ", sortOrder: " + sortOrder + ", handler: " + handler + ", error: " + e, new Object[0]);
                    bvc.a(cursorQuery);
                    return handler.invoke(null);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                bvc.a(cursor);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            bvc.a(cursor);
            throw th;
        }
    }

    public final void safeRegisterBroadcastReceiver(@NotNull Context context, @Nullable BroadcastReceiver receiver, @Nullable IntentFilter intentFilter, @Nullable Integer flag) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (receiver == null) {
            Logger.w("registerBroadcastReceiver,receiver is null ", new Object[0]);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                Intrinsics.checkNotNull(flag);
                context.registerReceiver(receiver, intentFilter, flag.intValue());
            } else {
                context.registerReceiver(receiver, intentFilter);
            }
        } catch (Exception e) {
            Logger.INSTANCE.w("Failed to register broad cast " + receiver, e);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void safeRegisterContentObserver(@NotNull Context context, @Nullable Uri uri, boolean notifyForDescendants, @Nullable ContentObserver observer) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            Intrinsics.checkNotNull(observer);
            contentResolver.registerContentObserver(uri, notifyForDescendants, observer);
        } catch (Exception unused) {
            Logger.w("Failed to register observer " + observer + " to " + uri, observer, uri);
        }
    }

    public final void safeUnregisterBroadcastReceiver(@NotNull Context context, @Nullable BroadcastReceiver receiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (receiver == null) {
            Logger.w("unregisterBroadcastReceiver,receiver is null ", new Object[0]);
            return;
        }
        try {
            context.unregisterReceiver(receiver);
        } catch (Exception e) {
            Logger.INSTANCE.w("Failed to unregister receiver " + receiver, e);
        }
    }

    public final void safeUnregisterContentObserver(@NotNull Context context, @Nullable ContentObserver observer) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(observer);
            contentResolver.unregisterContentObserver(observer);
        } catch (Exception unused) {
            Logger.w("Failed to unregister observer " + observer, new Object[0]);
        }
    }

    public final int safeUpdate(@NotNull Context context, @Nullable Uri uri, @Nullable ContentValues values, @Nullable String where, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            return contentResolver.update(uri, values, where, selectionArgs);
        } catch (Exception e) {
            Logger.w("Failed to update to context: " + context + ", uri: " + uri + ", where: " + where + ", error: " + e, new Object[0]);
            return -1;
        }
    }

    public final long safeInsert(@NotNull SQLiteDatabase db, @NotNull String tableName, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        try {
            if (values == null) {
                Logger.w("Table name or values is null, db: " + db + ", table: " + tableName + ", values: " + values, new Object[0]);
                return -1L;
            }
            return db.insert(tableName, null, values);
        } catch (Exception e) {
            Logger.INSTANCE.w("Failed to insert to db: " + db + ", table: " + tableName, e);
            return -1L;
        }
    }

    public final int safeUpdate(@NotNull SQLiteDatabase db, @NotNull String tableName, @Nullable ContentValues values, @Nullable String where, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        try {
            if (values == null) {
                Logger.w("Table name or values is null, db: " + db + ", table: " + tableName + ", values: " + values, new Object[0]);
                return -1;
            }
            return db.update(tableName, values, where, selectionArgs);
        } catch (Exception e) {
            Logger.w("Failed to update to db: " + db + ", table: " + tableName + ", where: " + where + ", error: " + e, new Object[0]);
            return -1;
        }
    }

    public final <T> T safeQuery(@NotNull SQLiteDatabase db, @NotNull String tableName, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull Function1<? super Cursor, ? extends T> handler) throws Throwable {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Cursor cursorQuery = null;
        try {
            if (projection != null) {
                str = ", table: ";
                str2 = ", projection: ";
                try {
                    cursorQuery = db.query(tableName, projection, selection, selectionArgs, null, null, sortOrder, null);
                    try {
                        T tInvoke = handler.invoke(cursorQuery);
                        bvc.a(cursorQuery);
                        return tInvoke;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursorQuery = null;
                } catch (Throwable th) {
                    th = th;
                    cursorQuery = null;
                    bvc.a(cursorQuery);
                    throw th;
                }
            } else {
                try {
                    Logger.w("Table name or projection is null, db: " + db + ", table: " + tableName + ", projection: " + projection, new Object[0]);
                    T tInvoke2 = handler.invoke(null);
                    bvc.a(null);
                    return tInvoke2;
                } catch (Exception e3) {
                    e = e3;
                    str = ", table: ";
                    str2 = ", projection: ";
                }
            }
            Logger.w("Failed to query from db: " + db + str + tableName + str2 + projection + ", selection: " + selection + ", sortOrder: " + sortOrder + ", error: " + e, new Object[0]);
            bvc.a(cursorQuery);
            return handler.invoke(null);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
