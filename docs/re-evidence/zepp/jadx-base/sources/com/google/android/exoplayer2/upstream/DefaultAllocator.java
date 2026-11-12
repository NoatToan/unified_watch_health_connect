package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAllocator implements Allocator {
    private static final int i = 100;
    private final boolean a;
    private final int b;

    @Nullable
    private final byte[] c;
    private final Allocation[] d;
    private int e;
    private int f;
    private int g;
    private Allocation[] h;

    public DefaultAllocator(boolean trimOnReset, int individualAllocationSize) {
        this(trimOnReset, individualAllocationSize, 0);
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        this.f++;
        int i2 = this.g;
        if (i2 > 0) {
            Allocation[] allocationArr = this.h;
            int i3 = i2 - 1;
            this.g = i3;
            allocation = (Allocation) Assertions.checkNotNull(allocationArr[i3]);
            this.h[this.g] = null;
        } else {
            allocation = new Allocation(new byte[this.b], 0);
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.f * this.b;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.d;
        allocationArr[0] = allocation;
        release(allocationArr);
    }

    public synchronized void reset() {
        if (this.a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int targetBufferSize) {
        boolean z = targetBufferSize < this.e;
        this.e = targetBufferSize;
        if (z) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
        int i2 = 0;
        int iMax = Math.max(0, Util.ceilDivide(this.e, this.b) - this.f);
        int i3 = this.g;
        if (iMax >= i3) {
            return;
        }
        if (this.c != null) {
            int i4 = i3 - 1;
            while (i2 <= i4) {
                Allocation allocation = (Allocation) Assertions.checkNotNull(this.h[i2]);
                if (allocation.data == this.c) {
                    i2++;
                } else {
                    Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.h[i4]);
                    if (allocation2.data != this.c) {
                        i4--;
                    } else {
                        Allocation[] allocationArr = this.h;
                        allocationArr[i2] = allocation2;
                        allocationArr[i4] = allocation;
                        i4--;
                        i2++;
                    }
                }
            }
            iMax = Math.max(iMax, i2);
            if (iMax >= this.g) {
                return;
            }
        }
        Arrays.fill(this.h, iMax, this.g, (Object) null);
        this.g = iMax;
    }

    public DefaultAllocator(boolean trimOnReset, int individualAllocationSize, int initialAllocationCount) {
        Assertions.checkArgument(individualAllocationSize > 0);
        Assertions.checkArgument(initialAllocationCount >= 0);
        this.a = trimOnReset;
        this.b = individualAllocationSize;
        this.g = initialAllocationCount;
        this.h = new Allocation[initialAllocationCount + 100];
        if (initialAllocationCount > 0) {
            this.c = new byte[initialAllocationCount * individualAllocationSize];
            for (int i2 = 0; i2 < initialAllocationCount; i2++) {
                this.h[i2] = new Allocation(this.c, i2 * individualAllocationSize);
            }
        } else {
            this.c = null;
        }
        this.d = new Allocation[1];
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation[] allocations) {
        int i2 = this.g;
        int length = allocations.length + i2;
        Allocation[] allocationArr = this.h;
        if (length >= allocationArr.length) {
            this.h = (Allocation[]) Arrays.copyOf(allocationArr, Math.max(allocationArr.length * 2, i2 + allocations.length));
        }
        for (Allocation allocation : allocations) {
            Allocation[] allocationArr2 = this.h;
            int i3 = this.g;
            this.g = i3 + 1;
            allocationArr2[i3] = allocation;
        }
        this.f -= allocations.length;
        notifyAll();
    }
}
