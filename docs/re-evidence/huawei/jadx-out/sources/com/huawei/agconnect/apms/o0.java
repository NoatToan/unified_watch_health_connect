package com.huawei.agconnect.apms;

import java.io.IOException;
import java.util.EventObject;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 extends EventObject {
    public long abc;
    public Exception bcd;

    public o0(Object obj, long j, IOException iOException) {
        super(obj);
        this.abc = j;
        this.bcd = iOException;
    }
}
