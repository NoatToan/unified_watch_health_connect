package com.huawei.hwlogsmodel.impl.writer.str;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface IStrWriter {
    void clearLogCache();

    boolean write(File file, String str, boolean z);
}
