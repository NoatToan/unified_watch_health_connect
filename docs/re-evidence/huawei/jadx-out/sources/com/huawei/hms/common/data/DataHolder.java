package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String[] f13032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f13033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f13034c;
        private final HashMap<Object, Integer> d;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null);
        }

        public Builder setDataForContentValuesHashMap(HashMap<String, Object> map) {
            int iIntValue;
            boolean z;
            Object obj;
            Preconditions.checkNotNull(map, "contentValuesHashMap cannot be null");
            String str = this.f13034c;
            if (str == null || (obj = map.get(str)) == null) {
                iIntValue = 0;
                z = false;
            } else {
                Integer num = this.d.get(obj);
                if (num != null) {
                    iIntValue = num.intValue();
                    z = true;
                } else {
                    this.d.put(obj, Integer.valueOf(this.f13033b.size()));
                    iIntValue = 0;
                    z = false;
                }
            }
            if (!z) {
                this.f13033b.add(map);
                return this;
            }
            this.f13033b.remove(iIntValue);
            this.f13033b.add(iIntValue, map);
            return this;
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> map = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(map);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.f13032a = strArr;
            this.f13033b = new ArrayList<>();
            this.f13034c = str;
            this.d = new HashMap<>();
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1);
        }

        Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(BUILDER, i, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int numRows;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                numRows = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                numRows = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, numRows, count));
            CursorWindow[] cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
            hMSCursorWrapper.close();
            return cursorWindowArr;
        } catch (Throwable th) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d A[Catch: RuntimeException -> 0x0098, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0098, blocks: (B:4:0x001c, B:6:0x0022, B:12:0x0048, B:13:0x0050, B:15:0x0057, B:18:0x0068, B:20:0x006d), top: B:31:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3 A[LOOP:1: B:24:0x009d->B:26:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x006d, please report this as an issue */
    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i, List list) {
        CursorWindow cursorWindow;
        Iterator<CursorWindow> it;
        boolean zPutValue;
        int i2;
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow2 = new CursorWindow((String) null);
        cursorWindow2.setNumColumns(builder.f13032a.length);
        arrayList.add(cursorWindow2);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                if (cursorWindow2.allocRow()) {
                    HashMap map = (HashMap) list.get(i3);
                    zPutValue = true;
                    while (i2 < builder.f13032a.length) {
                    }
                    if (!zPutValue) {
                        HMSLog.d(TAG, "fail to put data for row " + i3);
                        cursorWindow2.freeLastRow();
                        CursorWindow cursorWindow3 = new CursorWindow((String) null);
                        cursorWindow3.setStartPosition(i3);
                        cursorWindow3.setNumColumns(builder.f13032a.length);
                        arrayList.add(cursorWindow3);
                        break;
                        break;
                    }
                    continue;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().close();
                    }
                    HMSLog.w(TAG, "iter CursorWindow failed, RuntimeException occured.");
                    cursorWindow2 = cursorWindow;
                } else {
                    HMSLog.d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    try {
                        cursorWindow.setStartPosition(i3);
                        cursorWindow.setNumColumns(builder.f13032a.length);
                        if (!cursorWindow.allocRow()) {
                            HMSLog.e(TAG, "Failed to retry to allocate a row");
                            break;
                        }
                        arrayList.add(cursorWindow);
                        cursorWindow2 = cursorWindow;
                        HashMap map2 = (HashMap) list.get(i3);
                        zPutValue = true;
                        for (i2 = 0; i2 < builder.f13032a.length && (zPutValue = putValue(cursorWindow2, map2.get(builder.f13032a[i2]), i3, i2)); i2++) {
                        }
                        if (!zPutValue) {
                            HMSLog.d(TAG, "fail to put data for row " + i3);
                            cursorWindow2.freeLastRow();
                            CursorWindow cursorWindow4 = new CursorWindow((String) null);
                            cursorWindow4.setStartPosition(i3);
                            cursorWindow4.setNumColumns(builder.f13032a.length);
                            arrayList.add(cursorWindow4);
                            break;
                        }
                        continue;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().close();
                        }
                        HMSLog.w(TAG, "iter CursorWindow failed, RuntimeException occured.");
                        cursorWindow2 = cursorWindow;
                    } catch (RuntimeException unused) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().close();
                        }
                        HMSLog.w(TAG, "iter CursorWindow failed, RuntimeException occured.");
                        cursorWindow2 = cursorWindow;
                    }
                }
            } catch (RuntimeException unused2) {
                cursorWindow = cursorWindow2;
            }
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i, int i2) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i < i2 && hMSCursorWrapper.moveToPosition(i)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i);
                hMSCursorWrapper.fillWindow(i, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i, int i2) throws IllegalArgumentException {
        if (obj == null) {
            return cursorWindow.putNull(i, i2);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i, i2);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i, i2);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i, i2);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i, i2);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i, i2);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i, i2);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.mClosed) {
                for (CursorWindow cursorWindow : this.cursorWindows) {
                    cursorWindow.close();
                }
                this.mClosed = true;
            }
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        String[] strArr = this.columns;
        int i = 0;
        if (strArr == null || strArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.columns;
            if (i2 >= strArr2.length) {
                break;
            }
            this.columnsBundle.putInt(strArr2[i2], i2);
            i2++;
        }
        CursorWindow[] cursorWindowArr = this.cursorWindows;
        if (cursorWindowArr == null || cursorWindowArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        this.perCursorCounts = new int[cursorWindowArr.length];
        int startPosition = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = this.cursorWindows;
            if (i >= cursorWindowArr2.length) {
                this.dataCount = startPosition;
                return;
            } else {
                this.perCursorCounts[i] = startPosition;
                startPosition = cursorWindowArr2[i].getStartPosition() + this.cursorWindows[i].getNumRows();
                i++;
            }
        }
    }

    public final void copyToBuffer(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i);
        this.cursorWindows[i2].copyStringToBuffer(i, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    protected final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    public final Object getValue(String str, int i, int i2, String str2) {
        str2.hashCode();
        str2.hashCode();
        switch (str2) {
            case "type_float":
                checkAvailable(str, i);
                return Float.valueOf(this.cursorWindows[i2].getFloat(i, this.columnsBundle.getInt(str)));
            case "type_boolean":
                checkAvailable(str, i);
                return Boolean.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)) == 1);
            case "type_int":
                checkAvailable(str, i);
                return Integer.valueOf(this.cursorWindows[i2].getInt(i, this.columnsBundle.getInt(str)));
            case "type_double":
                checkAvailable(str, i);
                return Double.valueOf(this.cursorWindows[i2].getDouble(i, this.columnsBundle.getInt(str)));
            case "type_long":
                checkAvailable(str, i);
                return Long.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)));
            case "type_string":
                checkAvailable(str, i);
                return this.cursorWindows[i2].getString(i, this.columnsBundle.getInt(str));
            case "type_byte_array":
                checkAvailable(str, i);
                return this.cursorWindows[i2].getBlob(i, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i) {
        int[] iArr;
        int i2 = 0;
        Preconditions.checkArgument(i >= 0 || i < this.dataCount, "rowIndex is out of index:" + i);
        while (true) {
            iArr = this.perCursorCounts;
            if (i2 >= iArr.length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == iArr.length ? i2 - 1 : i2;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i, int i2) {
        checkAvailable(str, i);
        return this.cursorWindows[i2].getType(i, this.columnsBundle.getInt(str)) == 0;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    private void checkAvailable(String str, int i) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = "cannot find column: " + str;
        } else if (isClosed()) {
            str2 = "buffer has been closed";
        } else if (i < 0 || i >= this.dataCount) {
            str2 = "row is out of index:" + i;
        } else {
            str2 = "";
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i2;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i, bundle);
    }

    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.f13032a, getCursorWindows(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, Bundle bundle, int i2) {
        this(builder.f13032a, getCursorWindows(builder, -1), i, bundle);
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i) {
        if (builder.f13032a.length != 0) {
            if (i < 0 || i >= builder.f13033b.size()) {
                i = builder.f13033b.size();
            }
            ArrayList<CursorWindow> arrayListIterCursorWindow = iterCursorWindow(builder, i, builder.f13033b.subList(0, i));
            return (CursorWindow[]) arrayListIterCursorWindow.toArray(new CursorWindow[arrayListIterCursorWindow.size()]);
        }
        return new CursorWindow[0];
    }
}
