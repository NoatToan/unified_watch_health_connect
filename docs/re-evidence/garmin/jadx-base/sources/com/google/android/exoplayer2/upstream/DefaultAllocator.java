package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z14, int i14, int i15) {
        Assertions.checkArgument(i14 > 0);
        Assertions.checkArgument(i15 >= 0);
        this.trimOnReset = z14;
        this.individualAllocationSize = i14;
        this.availableCount = i15;
        this.availableAllocations = new Allocation[i15 + 100];
        if (i15 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i15 * i14];
        for (int i16 = 0; i16 < i15; i16++) {
            this.availableAllocations[i16] = new Allocation(this.initialAllocationBlock, i16 * i14);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        try {
            this.allocatedCount++;
            int i14 = this.availableCount;
            if (i14 > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i15 = i14 - 1;
                this.availableCount = i15;
                allocation = (Allocation) Assertions.checkNotNull(allocationArr[i15]);
                this.availableAllocations[this.availableCount] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
                int i16 = this.allocatedCount;
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i16 > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.availableAllocations;
                int i14 = this.availableCount;
                this.availableCount = i14 + 1;
                allocationArr[i14] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        notifyAll();
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i14) {
        boolean z14 = i14 < this.targetBufferSize;
        this.targetBufferSize = i14;
        if (z14) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
        try {
            int i14 = 0;
            int iMax = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i15 = this.availableCount;
            if (iMax >= i15) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i16 = i15 - 1;
                while (i14 <= i16) {
                    Allocation allocation = (Allocation) Assertions.checkNotNull(this.availableAllocations[i14]);
                    if (allocation.data == this.initialAllocationBlock) {
                        i14++;
                    } else {
                        Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.availableAllocations[i16]);
                        if (allocation2.data != this.initialAllocationBlock) {
                            i16--;
                        } else {
                            Allocation[] allocationArr = this.availableAllocations;
                            allocationArr[i14] = allocation2;
                            allocationArr[i16] = allocation;
                            i16--;
                            i14++;
                        }
                    }
                }
                iMax = Math.max(iMax, i14);
                if (iMax >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, iMax, this.availableCount, (Object) null);
            this.availableCount = iMax;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i14 = this.availableCount;
        this.availableCount = i14 + 1;
        allocationArr[i14] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    public DefaultAllocator(boolean z14, int i14) {
        this(z14, i14, 0);
    }
}
