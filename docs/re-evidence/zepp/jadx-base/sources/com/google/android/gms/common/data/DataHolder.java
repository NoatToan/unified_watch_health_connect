package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.huami.mifit.sportlib.common.DataTypeSource;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @RecentlyNonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();
    private static final Builder k = new a(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    private final int a;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] b;
    private Bundle c;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] d;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int e;

    @Nullable
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle f;
    private int[] g;
    private int h;
    private boolean i;
    private boolean j;

    @KeepForSdk
    public static class Builder {
        private final String[] a;
        private final ArrayList<HashMap<String, Object>> b;

        @Nullable
        private final String c;
        private final HashMap<Object, Integer> d;
        private boolean e;

        @Nullable
        private String f;

        private Builder(String[] strArr, @Nullable String str) {
            this.a = (String[]) Preconditions.checkNotNull(strArr);
            this.b = new ArrayList<>();
            this.c = null;
            this.d = new HashMap<>();
            this.e = false;
            this.f = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @RecentlyNonNull
        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null, (a) (0 == true ? 1 : 0));
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder withRow(@RecentlyNonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> map = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        @RecentlyNonNull
        public Builder zaa(@RecentlyNonNull HashMap<String, Object> map) {
            Object obj;
            int iIntValue;
            Asserts.checkNotNull(map);
            String str = this.c;
            if (str == null || (obj = map.get(str)) == null) {
                iIntValue = -1;
            } else {
                Integer num = this.d.get(obj);
                if (num == null) {
                    this.d.put(obj, Integer.valueOf(this.b.size()));
                    iIntValue = -1;
                } else {
                    iIntValue = num.intValue();
                }
            }
            if (iIntValue == -1) {
                this.b.add(map);
            } else {
                this.b.remove(iIntValue);
                this.b.add(iIntValue, map);
            }
            this.e = false;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public DataHolder build(int i, @RecentlyNonNull Bundle bundle) {
            return new DataHolder(this, i, bundle, -1, (a) null);
        }

        public /* synthetic */ Builder(String[] strArr, String str, a aVar) {
            this(strArr, null);
        }
    }

    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @Nullable @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.i = false;
        this.j = true;
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    private final void a(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "No such column: ".concat(strValueOf) : new String("No such column: "));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    private static CursorWindow[] b(Builder builder, int i) {
        if (builder.a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.b;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.a.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.a.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i2);
                boolean zPutDouble = true;
                for (int i3 = 0; i3 < builder.a.length && zPutDouble; i3++) {
                    String str = builder.a[i3];
                    Object obj = map.get(str);
                    if (obj == null) {
                        zPutDouble = cursorWindow.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        zPutDouble = cursorWindow.putString((String) obj, i2, i3);
                    } else if (obj instanceof Long) {
                        zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                    } else if (obj instanceof Integer) {
                        zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i2, i3);
                    } else if (obj instanceof Boolean) {
                        zPutDouble = cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i2, i3);
                    } else if (obj instanceof byte[]) {
                        zPutDouble = cursorWindow.putBlob((byte[]) obj, i2, i3);
                    } else if (obj instanceof Double) {
                        zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                    } else {
                        if (!(obj instanceof Float)) {
                            String strValueOf = String.valueOf(obj);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + strValueOf.length());
                            sb2.append("Unsupported object for column ");
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(strValueOf);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i2, i3);
                    }
                }
                if (zPutDouble) {
                    z = false;
                } else {
                    if (z) {
                        throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i2);
                    sb3.append(" - allocating new window.");
                    Log.d("DataHolder", sb3.toString());
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.a.length);
                    arrayList2.add(cursorWindow);
                    i2--;
                    z = true;
                }
                i2++;
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList2.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    @KeepForSdk
    public static Builder builder(@RecentlyNonNull String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    private static CursorWindow[] c(CursorWrapper cursorWrapper) {
        int startPosition;
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    @RecentlyNonNull
    @KeepForSdk
    public static DataHolder empty(int i) {
        return new DataHolder(k, i, (Bundle) null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.j && this.d.length > 0 && !isClosed()) {
                close();
                String string = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public final boolean getBoolean(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return Long.valueOf(this.d[i2].getLong(i, this.c.getInt(str))).longValue() == 1;
    }

    @RecentlyNonNull
    @KeepForSdk
    public final byte[] getByteArray(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getBlob(i, this.c.getInt(str));
    }

    @KeepForSdk
    public final int getCount() {
        return this.h;
    }

    @KeepForSdk
    public final int getInteger(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getInt(i, this.c.getInt(str));
    }

    @KeepForSdk
    public final long getLong(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getLong(i, this.c.getInt(str));
    }

    @RecentlyNullable
    @KeepForSdk
    public final Bundle getMetadata() {
        return this.f;
    }

    @KeepForSdk
    public final int getStatusCode() {
        return this.e;
    }

    @RecentlyNonNull
    @KeepForSdk
    public final String getString(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    @KeepForSdk
    public final int getWindowIndex(int i) {
        int[] iArr;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.h);
        while (true) {
            iArr = this.g;
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

    @KeepForSdk
    public final boolean hasColumn(@RecentlyNonNull String str) {
        return this.c.containsKey(str);
    }

    @KeepForSdk
    public final boolean hasNull(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].isNull(i, this.c.getInt(str));
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.b, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.d, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final void zaa() {
        this.c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i2], i2);
            i2++;
        }
        this.g = new int[this.d.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.d;
            if (i >= cursorWindowArr.length) {
                this.h = numRows;
                return;
            }
            this.g[i] = numRows;
            numRows += this.d[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    public final double zab(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getDouble(i, this.c.getInt(str));
    }

    @KeepForSdk
    public DataHolder(@RecentlyNonNull String[] strArr, @RecentlyNonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.i = false;
        this.j = true;
        this.a = 1;
        this.b = (String[]) Preconditions.checkNotNull(strArr);
        this.d = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.e = i;
        this.f = bundle;
        zaa();
    }

    public final float zaa(@RecentlyNonNull String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getFloat(i, this.c.getInt(str));
    }

    public final void zaa(@RecentlyNonNull String str, int i, int i2, @RecentlyNonNull CharArrayBuffer charArrayBuffer) {
        a(str, i);
        this.d[i2].copyStringToBuffer(i, this.c.getInt(str), charArrayBuffer);
    }

    private DataHolder(CursorWrapper cursorWrapper, int i, @Nullable Bundle bundle) {
        this(cursorWrapper.getColumnNames(), c(cursorWrapper), i, bundle);
    }

    @KeepForSdk
    public DataHolder(@RecentlyNonNull Cursor cursor, int i, @Nullable Bundle bundle) {
        this(new CursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, @Nullable Bundle bundle) {
        this(builder.a, b(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, @Nullable Bundle bundle, int i2) {
        this(builder.a, b(builder, -1), i, bundle);
    }

    public /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, a aVar) {
        this(builder, i, (Bundle) null);
    }

    public /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, int i2, a aVar) {
        this(builder, i, bundle, -1);
    }
}
