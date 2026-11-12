package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    public DataHolder(Cursor cursor, int i14, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
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
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i14, bundle);
        } catch (Throwable th3) {
            cursorWrapper.close();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @KeepForSdk
    public static DataHolder empty(int i14) {
        return new DataHolder(zaf, i14, (Bundle) null);
    }

    private final void zae(String str, int i14) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            h.s("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            h.s("Buffer is closed.");
        } else if (i14 < 0 || i14 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i14, this.zad);
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i14) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i15 = 0;
        boolean z14 = false;
        while (i15 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i15);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i15);
                int i16 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i16 >= builder.zaa.length) {
                        z14 = zPutDouble ? false : true;
                        i15++;
                    } else if (zPutDouble) {
                        String str = builder.zaa[i16];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i15, i16);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i15, i16);
                        } else if (obj instanceof Long) {
                            zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i15, i16);
                        } else if (obj instanceof Integer) {
                            zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i15, i16);
                        } else if (obj instanceof Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i15, i16);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i15, i16);
                        } else if (obj instanceof Double) {
                            zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i15, i16);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i15, i16);
                        }
                        i16++;
                    }
                    if (z14) {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i15);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    i15--;
                    i15++;
                }
            } catch (RuntimeException e4) {
                int size2 = arrayList2.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ((CursorWindow) arrayList2.get(i17)).close();
                }
                throw e4;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i14 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i14 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i14].close();
                        i14++;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getLong(i14, this.zab.getInt(str)) == 1;
    }

    @KeepForSdk
    public byte[] getByteArray(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getBlob(i14, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getInt(i14, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getLong(i14, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @KeepForSdk
    public String getString(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getString(i14, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i14) {
        int length;
        int i15 = 0;
        Preconditions.checkState(i14 >= 0 && i14 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i15 >= length) {
                break;
            }
            if (i14 < iArr[i15]) {
                i15--;
                break;
            }
            i15++;
        }
        return i15 == length ? i15 - 1 : i15;
    }

    @KeepForSdk
    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].isNull(i14, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z14;
        synchronized (this) {
            z14 = this.zae;
        }
        return z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        String[] strArr = this.zag;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i14, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i14 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getDouble(i14, this.zab.getInt(str));
    }

    public final float zab(String str, int i14, int i15) {
        zae(str, i14);
        return this.zah[i15].getFloat(i14, this.zab.getInt(str));
    }

    public final void zac(String str, int i14, int i15, CharArrayBuffer charArrayBuffer) {
        zae(str, i14);
        this.zah[i15].copyStringToBuffer(i14, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i15 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i15], i15);
            i15++;
        }
        this.zac = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i14 >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.zac[i14] = numRows;
            numRows += this.zah[i14].getNumRows() - (numRows - cursorWindowArr[i14].getStartPosition());
            i14++;
        }
    }

    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @KeepForSdk
        public DataHolder build(int i14, Bundle bundle) {
            return new DataHolder(this, i14, bundle);
        }

        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        @CanIgnoreReturnValue
        public Builder zaa(HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @KeepForSdk
        public DataHolder build(int i14) {
            return new DataHolder(this, i14);
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i14, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i15, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i14;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i15;
        this.zaj = bundle;
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i14, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i14;
        this.zaj = bundle;
        zad();
    }

    private DataHolder(Builder builder, int i14, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i14, (Bundle) null);
    }
}
