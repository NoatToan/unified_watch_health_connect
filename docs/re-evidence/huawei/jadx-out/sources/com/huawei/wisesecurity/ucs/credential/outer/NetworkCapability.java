package com.huawei.wisesecurity.ucs.credential.outer;

import defpackage.yqj;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public interface NetworkCapability {
    NetworkResponse get(NetworkRequest networkRequest) throws IOException;

    void initConfig(int i, int i2) throws yqj;

    NetworkResponse post(NetworkRequest networkRequest) throws IOException;
}
