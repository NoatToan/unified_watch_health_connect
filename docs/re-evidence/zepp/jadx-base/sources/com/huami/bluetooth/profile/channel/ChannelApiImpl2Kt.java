package com.huami.bluetooth.profile.channel;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"", "", "index", "a", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ChannelApiImpl2Kt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] a(byte[] bArr, int i) {
        if (i < 0 || i >= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(bArr, i + 1, bArr2, i, (bArr.length - i) - 1);
        return bArr2;
    }
}
