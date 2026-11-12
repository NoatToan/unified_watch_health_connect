package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public interface u6 {
    void onFailure(t6 t6Var, IOException iOException);

    void onResponse(t6 t6Var, v7 v7Var) throws IOException;
}
