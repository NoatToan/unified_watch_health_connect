package com.huawei.hms.network.base.common.trans;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public interface Binary {
    long getLength();

    void onWriteBinary(OutputStream outputStream);
}
