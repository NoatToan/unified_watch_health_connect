package com.xiaomi.infra.galaxy.fds.buffer;

import com.xiaomi.infra.galaxy.fds.exception.BucketAllocatorException;
import com.xiaomi.infra.galaxy.fds.exception.CacheFullException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes22.dex */
public final class BucketAllocator {
    public static final int FEWEST_ITEMS_IN_BUCKET = 4;
    public static final Log h = LogFactory.getLog(BucketAllocator.class);
    private static final int[] i = {5120, 9216, 17408, 33792, 41984, 50176, 58368, 66560, 99328, 132096, 197632, 263168, 394240, 525312};
    public static final /* synthetic */ boolean j = false;
    private final int[] a;
    private final int b;
    private final long c;
    private Bucket[] d;
    private a[] e;
    private final long f;
    private long g = 0;

    public static final class Bucket {
        public static final /* synthetic */ boolean h = false;
        private long a;
        private int b;
        private int c = -1;
        private int d;
        private int[] e;
        private int f;
        private int g;

        public Bucket(long j) {
            this.a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(long j) {
            int i = (int) ((j - this.a) / ((long) this.b));
            this.g--;
            int[] iArr = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            iArr[i2] = i;
        }

        private boolean g(int i) {
            for (int i2 = 0; i2 < this.f; i2++) {
                if (this.e[i2] == i) {
                    return true;
                }
            }
            return false;
        }

        public long allocate() {
            this.g++;
            long j = this.a;
            int[] iArr = this.e;
            int i = this.f - 1;
            this.f = i;
            return j + ((long) (iArr[i] * this.b));
        }

        public int freeCount() {
            return this.f;
        }

        public long getBaseOffset() {
            return this.a;
        }

        public int getFreeBytes() {
            return this.f * this.b;
        }

        public int getItemAllocationSize() {
            return this.b;
        }

        public int getUsedBytes() {
            return this.g * this.b;
        }

        public void h(int i, int[] iArr, long j) {
            if (i < 0 || i >= iArr.length) {
                throw new IndexOutOfBoundsException();
            }
            this.c = i;
            int i2 = iArr[i];
            this.b = i2;
            int i3 = (int) (j / ((long) i2));
            this.d = i3;
            this.f = i3;
            this.g = 0;
            this.e = new int[i3];
            for (int i4 = 0; i4 < this.f; i4++) {
                this.e[i4] = i4;
            }
        }

        public boolean hasFreeSpace() {
            return this.f > 0;
        }

        public boolean isCompletelyFree() {
            return this.g == 0;
        }

        public boolean isUninstantiated() {
            return this.c == -1;
        }

        public int sizeIndex() {
            return this.c;
        }

        public int usedCount() {
            return this.g;
        }
    }

    public final class a {
        public static final /* synthetic */ boolean f = false;
        private List<Bucket> a = new LinkedList();
        private List<Bucket> b = new LinkedList();
        private List<Bucket> c = new LinkedList();
        private int d;

        public a(int i) {
            this.d = i;
        }

        private synchronized void f(Bucket bucket) {
            this.a.remove(bucket);
            this.b.remove(bucket);
            this.c.remove(bucket);
        }

        public long a() {
            Bucket bucketD;
            if (this.b.size() > 0) {
                List<Bucket> list = this.b;
                bucketD = list.get(list.size() - 1);
            } else {
                bucketD = null;
            }
            if (bucketD == null && (bucketD = BucketAllocator.this.d()) != null) {
                e(bucketD);
            }
            if (bucketD == null) {
                return -1L;
            }
            long jAllocate = bucketD.allocate();
            b(bucketD);
            return jAllocate;
        }

        public void b(Bucket bucket) {
            if (!bucket.isCompletelyFree()) {
                this.c.remove(bucket);
            }
            if (bucket.hasFreeSpace()) {
                return;
            }
            this.b.remove(bucket);
        }

        public Bucket c() {
            if (this.a.size() == 1 || this.c.size() <= 0) {
                return null;
            }
            Bucket bucket = this.c.get(0);
            f(bucket);
            return bucket;
        }

        public void d(Bucket bucket, long j) {
            bucket.f(j);
            if (!this.b.contains(bucket)) {
                this.b.add(bucket);
            }
            if (bucket.isCompletelyFree()) {
                this.c.add(bucket);
            }
        }

        public synchronized void e(Bucket bucket) {
            bucket.h(this.d, BucketAllocator.this.a, BucketAllocator.this.c);
            this.a.add(bucket);
            this.b.add(bucket);
            this.c.add(bucket);
        }

        public int g() {
            return this.d;
        }

        public synchronized b h() {
            long jFreeCount;
            long jUsedCount;
            jFreeCount = 0;
            jUsedCount = 0;
            for (Bucket bucket : this.a) {
                jFreeCount += (long) bucket.freeCount();
                jUsedCount += (long) bucket.usedCount();
            }
            return new b(jFreeCount, jUsedCount, BucketAllocator.this.a[this.d]);
        }

        public String toString() {
            return "BucketSizeInfo{sizeIndex=" + this.d + ", bucketSize=" + BucketAllocator.this.a[this.d] + '}';
        }
    }

    public BucketAllocator(long j2, int[] iArr) {
        iArr = iArr == null ? i : iArr;
        this.a = iArr;
        Arrays.sort(iArr);
        int i2 = iArr[iArr.length - 1];
        this.b = i2;
        long j3 = i2 * 4;
        this.c = j3;
        Bucket[] bucketArr = new Bucket[(int) (j2 / j3)];
        this.d = bucketArr;
        if (bucketArr.length < iArr.length) {
            throw new BucketAllocatorException("Bucket allocator size too small - must have room for at least " + iArr.length + " buckets");
        }
        this.e = new a[iArr.length];
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.length; i4++) {
            this.e[i4] = new a(i4);
        }
        while (true) {
            Bucket[] bucketArr2 = this.d;
            if (i3 >= bucketArr2.length) {
                this.f = ((long) bucketArr2.length) * this.c;
                return;
            }
            bucketArr2[i3] = new Bucket(this.c * ((long) i3));
            a[] aVarArr = this.e;
            int[] iArr2 = this.a;
            aVarArr[i3 < iArr2.length ? i3 : iArr2.length - 1].e(this.d[i3]);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bucket d() {
        for (a aVar : this.e) {
            Bucket bucketC = aVar.c();
            if (bucketC != null) {
                return bucketC;
            }
        }
        return null;
    }

    public synchronized long allocateBlock(int i2) throws BucketAllocatorException, CacheFullException {
        long jA;
        a aVarRoundUpToBucketSizeInfo = roundUpToBucketSizeInfo(i2);
        if (aVarRoundUpToBucketSizeInfo == null) {
            throw new BucketAllocatorException("Allocation too big size=" + i2);
        }
        jA = aVarRoundUpToBucketSizeInfo.a();
        if (jA < 0) {
            throw new CacheFullException(i2, aVarRoundUpToBucketSizeInfo.g());
        }
        this.g += (long) this.a[aVarRoundUpToBucketSizeInfo.g()];
        return jA;
    }

    public void dumpToLog() {
        logStatistics();
        StringBuilder sb = new StringBuilder();
        for (Bucket bucket : this.d) {
            sb.append("Bucket:");
            sb.append(bucket.a);
            sb.append('\n');
            sb.append("  Size index: " + bucket.sizeIndex() + "; Free:" + bucket.f + "; used:" + bucket.g + "; freelist\n");
            for (int i2 = 0; i2 < bucket.freeCount(); i2++) {
                sb.append(bucket.e[i2]);
                sb.append(',');
            }
            sb.append('\n');
        }
        h.info(sb);
    }

    public synchronized int freeBlock(long j2) {
        Bucket bucket;
        bucket = this.d[(int) (j2 / this.c)];
        this.e[bucket.sizeIndex()].d(bucket, j2);
        this.g -= (long) bucket.getItemAllocationSize();
        return bucket.getItemAllocationSize();
    }

    public Bucket[] getBuckets() {
        return this.d;
    }

    public long getFreeSize() {
        return this.f - getUsedSize();
    }

    public b[] getIndexStatistics(b bVar) {
        b[] indexStatistics = getIndexStatistics();
        long jA = 0;
        long jG = 0;
        for (b bVar2 : indexStatistics) {
            jA += bVar2.a();
            jG += bVar2.g();
        }
        bVar.d(jA, jG, 1L);
        return indexStatistics;
    }

    public long getTotalSize() {
        return this.f;
    }

    public long getUsedSize() {
        return this.g;
    }

    public void logStatistics() {
        b bVar = new b();
        b[] indexStatistics = getIndexStatistics(bVar);
        Log log = h;
        log.info("Bucket allocator statistics follow:\n");
        log.info("  Free bytes=" + bVar.a() + "+; used bytes=" + bVar.g() + "; total bytes=" + bVar.e());
        for (b bVar2 : indexStatistics) {
            h.info("  Object size " + bVar2.c() + " used=" + bVar2.h() + "; free=" + bVar2.b() + "; total=" + bVar2.f());
        }
    }

    public a roundUpToBucketSizeInfo(int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                return null;
            }
            if (i2 <= iArr[i3]) {
                return this.e[i3];
            }
            i3++;
        }
    }

    public int sizeIndexOfAllocation(long j2) {
        return this.d[(int) (j2 / this.c)].sizeIndex();
    }

    public int sizeOfAllocation(long j2) {
        return this.d[(int) (j2 / this.c)].getItemAllocationSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        int i2 = 0;
        while (true) {
            Bucket[] bucketArr = this.d;
            if (i2 >= bucketArr.length) {
                return sb.toString();
            }
            Bucket bucket = bucketArr[i2];
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append("bucket.");
            sb.append(i2);
            sb.append(": size=");
            sb.append(bucket.getItemAllocationSize());
            sb.append(", freeCount=");
            sb.append(bucket.freeCount());
            sb.append(", used=");
            sb.append(bucket.usedCount());
            i2++;
        }
    }

    public static class b {
        private long a;
        private long b;
        private long c;
        private long d;

        public b(long j, long j2, long j3) {
            d(j, j2, j3);
        }

        public long a() {
            return this.a * this.c;
        }

        public long b() {
            return this.a;
        }

        public long c() {
            return this.c;
        }

        public void d(long j, long j2, long j3) {
            this.c = j3;
            this.a = j;
            this.b = j2;
            this.d = j + j2;
        }

        public long e() {
            return this.d * this.c;
        }

        public long f() {
            return this.d;
        }

        public long g() {
            return this.b * this.c;
        }

        public long h() {
            return this.b;
        }

        public b() {
            d(-1L, -1L, 0L);
        }
    }

    public long freeBlock(long[] jArr) {
        long jFreeBlock = 0;
        for (long j2 : jArr) {
            jFreeBlock += (long) freeBlock(j2);
        }
        return jFreeBlock;
    }

    public b[] getIndexStatistics() {
        int length = this.a.length;
        b[] bVarArr = new b[length];
        for (int i2 = 0; i2 < length; i2++) {
            bVarArr[i2] = this.e[i2].h();
        }
        return bVarArr;
    }
}
