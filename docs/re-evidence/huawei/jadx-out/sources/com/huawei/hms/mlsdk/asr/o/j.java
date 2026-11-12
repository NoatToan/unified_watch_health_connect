package com.huawei.hms.mlsdk.asr.o;

import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14418b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList f14417a = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14419c = 0;
    private byte[] d = null;

    public j(int i) {
        this.f14418b = i;
    }

    public final void a(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            if (length == 0) {
                return;
            }
            if (this.f14419c == 0) {
                int i2 = this.f14418b;
                this.d = new byte[i2];
                this.f14419c = i2;
            }
            int i3 = this.f14419c;
            if (i3 >= length) {
                System.arraycopy(bArr, 0, this.d, this.f14418b - i3, length);
                int i4 = this.f14419c - length;
                this.f14419c = i4;
                if (i4 != 0 || this.f14417a.offer(this.d)) {
                    return;
                }
                SmartLogger.e("AudioBlockSplit", "offer failed");
                return;
            }
            int i5 = this.f14418b;
            int i6 = i3 / i5;
            if (i3 % i5 != 0) {
                i6++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                if (i8 != i6 - 1 || (i = this.f14419c) <= 0) {
                    int i9 = this.f14418b;
                    byte[] bArr2 = new byte[i9];
                    this.d = bArr2;
                    int i10 = i8 * i9;
                    System.arraycopy(bArr, i10, bArr2, 0, i9);
                    i7 = i10;
                } else {
                    this.d = Arrays.copyOfRange(bArr, i7, i);
                }
                if (!this.f14417a.offer(this.d)) {
                    SmartLogger.e("AudioBlockSplit", "offer failed");
                }
            }
            this.f14419c = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            SmartLogger.e("AudioBlockSplit", "setInput error" + e.getMessage());
        }
    }

    public final byte[] b() {
        return this.f14417a.size() == 0 ? new byte[0] : (byte[]) this.f14417a.poll();
    }

    public final int c() {
        return this.f14417a.size();
    }

    public final void a() {
        this.f14417a.clear();
    }
}
