package com.miui.tsmclient.sesdk;

import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface IRawProbe {
    default void afterProbe() {
        LogUtils.d("IRawProbe afterProbe");
    }

    default void beforeProbe() {
        LogUtils.d("IRawProbe beforeProbe");
    }

    String probe(MifareClassicTag mifareClassicTag, int i, int i2, int i3) throws IOException;
}
