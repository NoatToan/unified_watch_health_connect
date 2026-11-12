package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class yc5 {
    public static Cursor a(Map<String, ?> map, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            strArr = (String[]) map.keySet().toArray(new String[0]);
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, 1);
        Object[] objArr = new Object[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            objArr[i] = map.get(strArr[i]);
        }
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    public static Cursor b(List<Map<String, ?>> list, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            strArr = (String[]) list.get(0).keySet().toArray(new String[0]);
        }
        int size = list.size();
        MatrixCursor matrixCursor = new MatrixCursor(strArr, size);
        for (int i = 0; i < size; i++) {
            Object[] objArr = new Object[strArr.length];
            Map<String, ?> map = list.get(i);
            for (int i2 = 0; i2 < strArr.length; i2++) {
                objArr[i2] = map.get(strArr[i2]);
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }
}
