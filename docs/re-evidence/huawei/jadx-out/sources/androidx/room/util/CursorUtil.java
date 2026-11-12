package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.util.Log;
import defpackage.yzk;
import defpackage.zby;
import defpackage.zcp;
import defpackage.zes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a#\u0010\u0003\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a)\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010\u001a/\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"copyAndClose", "Landroid/database/Cursor;", "c", "findColumnIndexBySuffix", "", "cursor", "name", "", "columnNames", "", "([Ljava/lang/String;Ljava/lang/String;)I", "getColumnIndex", "getColumnIndexOrThrow", "wrapMappedColumns", "mapping", "", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "useCursor", "R", "block", "Lkotlin/Function1;", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CursorUtil {
    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        return -1;
    }

    public static final int getColumnIndex(Cursor cursor, String str) {
        zcp.c(cursor, "");
        zcp.c(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(cursor, str);
    }

    public static final int getColumnIndexOrThrow(Cursor cursor, String str) {
        String strA;
        zcp.c(cursor, "");
        zcp.c(str, "");
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            zcp.b((Object) columnNames, "");
            strA = yzk.a(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strA = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strA);
    }

    public static final int findColumnIndexBySuffix(String[] strArr, String str) {
        zcp.c(strArr, "");
        zcp.c(str, "");
        String str2 = "." + str;
        String str3 = "." + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            if (str4.length() >= str.length() + 2 && (zes.c(str4, str2, false, 2, (Object) null) || (str4.charAt(0) == '`' && zes.c(str4, str3, false, 2, (Object) null)))) {
                return i2;
            }
            i++;
            i2++;
        }
        return -1;
    }

    public static final <R> R useCursor(Cursor cursor, Function1<? super Cursor, ? extends R> function1) throws IOException {
        zcp.c(cursor, "");
        zcp.c(function1, "");
        Cursor cursor2 = cursor;
        try {
            R rInvoke = function1.invoke(cursor2);
            zby.d(cursor2, null);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(cursor2, th);
                throw th2;
            }
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] strArr, final int[] iArr) {
        zcp.c(cursor, "");
        zcp.c(strArr, "");
        zcp.c(iArr, "");
        if (strArr.length != iArr.length) {
            throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
        }
        return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
            @Override // android.database.CursorWrapper, android.database.Cursor
            public int getColumnIndex(String columnName) {
                zcp.c(columnName, "");
                String[] strArr2 = strArr;
                int[] iArr2 = iArr;
                int length = strArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (zes.d(strArr2[i], columnName, true)) {
                        return iArr2[i2];
                    }
                    i++;
                    i2++;
                }
                return super.getColumnIndex(columnName);
            }
        };
    }

    public static final Cursor copyAndClose(Cursor cursor) throws IOException {
        zcp.c(cursor, "");
        Cursor cursor2 = cursor;
        try {
            Cursor cursor3 = cursor2;
            MatrixCursor matrixCursor = new MatrixCursor(cursor3.getColumnNames(), cursor3.getCount());
            while (cursor3.moveToNext()) {
                Object[] objArr = new Object[cursor3.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor3.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor3.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor3.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor3.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor3.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            zby.d(cursor2, null);
            return matrixCursor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zby.d(cursor2, th);
                throw th2;
            }
        }
    }
}
