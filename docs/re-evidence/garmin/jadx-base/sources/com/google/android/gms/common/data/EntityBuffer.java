package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i14 = 1; i14 < count; i14++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i14);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i14, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i14 + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i14));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i14) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i14);
        int i15 = 0;
        if (i14 >= 0 && i14 != this.zab.size()) {
            if (i14 == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i14)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i14 + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i14)).intValue();
            }
            int i16 = iIntValue - iIntValue2;
            if (i16 == 1) {
                int iZaa2 = zaa(i14);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i15 = 1;
                }
            } else {
                i15 = i16;
            }
        }
        return getEntry(iZaa, i15);
    }

    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    public abstract T getEntry(int i14, int i15);

    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i14) {
        if (i14 >= 0 && i14 < this.zab.size()) {
            return ((Integer) this.zab.get(i14)).intValue();
        }
        h.s(e0.f(i14, "Position ", " is out of bounds for this buffer"));
        return 0;
    }
}
