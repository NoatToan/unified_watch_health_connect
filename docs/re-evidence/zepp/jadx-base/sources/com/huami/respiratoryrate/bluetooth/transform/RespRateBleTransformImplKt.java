package com.huami.respiratoryrate.bluetooth.transform;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"", "toCurrentMin", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class RespRateBleTransformImplKt {
    public static final long toCurrentMin(long j) {
        long j2 = j / ((long) 1000);
        return j2 - (j2 % ((long) 60));
    }
}
