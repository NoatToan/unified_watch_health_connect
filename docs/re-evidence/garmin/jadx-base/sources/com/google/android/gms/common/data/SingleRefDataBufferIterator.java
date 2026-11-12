package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import n23.j;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        boolean zHasNext = hasNext();
        int i14 = this.zab;
        if (!zHasNext) {
            j.s(am.j.h(i14, "Cannot advance the iterator beyond "));
            return null;
        }
        int i15 = i14 + 1;
        this.zab = i15;
        if (i15 == 0) {
            Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof DataBufferRef)) {
                h.z(am.j.m("DataBuffer reference of type ", String.valueOf(objCheckNotNull.getClass()), " is not movable"));
                return null;
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
