package vt2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class q extends ArrayList<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<Integer, String> f180211b;

    public q(byte[] bArr) {
        this.f180211b = new HashMap<>();
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 2;
            int i16 = ByteBuffer.wrap(bArr, i14, 2).getShort() + i15;
            this.f180211b.put(Integer.valueOf(i14), new String(Arrays.copyOfRange(bArr, i15, i16 - 1), "UTF-8"));
            i14 = i16;
        }
    }

    public q() {
    }
}
