package com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseData {
    protected int mSize;

    public abstract int getSize();

    public abstract DataOutputStream write(DataOutputStream dataOutputStream) throws IOException;
}
