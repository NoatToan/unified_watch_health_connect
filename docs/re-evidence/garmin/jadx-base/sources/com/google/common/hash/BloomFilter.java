package com.google.common.hash;

import androidx.room.a0;
import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import i3.e5;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import n23.j;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = 912559;
    private final BloomFilterStrategies.LockFreeBitArray bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final Funnel<? super T> funnel;
        final int numHashFunctions;
        final Strategy strategy;

        public SerialForm(BloomFilter<T> bloomFilter) {
            this.data = BloomFilterStrategies.LockFreeBitArray.toPlainArray(((BloomFilter) bloomFilter).bits.data);
            this.numHashFunctions = ((BloomFilter) bloomFilter).numHashFunctions;
            this.funnel = ((BloomFilter) bloomFilter).funnel;
            this.strategy = ((BloomFilter) bloomFilter).strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    public interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t7, Funnel<? super T> funnel, int i14, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(@ParametricNullness T t7, Funnel<? super T> funnel, int i14, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i14, Funnel<? super T> funnel, Strategy strategy) {
        Preconditions.checkArgument(i14 > 0, "numHashFunctions (%s) must be > 0", i14);
        Preconditions.checkArgument(i14 <= 255, "numHashFunctions (%s) must be <= 255", i14);
        this.bits = (BloomFilterStrategies.LockFreeBitArray) Preconditions.checkNotNull(lockFreeBitArray);
        this.numHashFunctions = i14;
        this.funnel = (Funnel) Preconditions.checkNotNull(funnel);
        this.strategy = (Strategy) Preconditions.checkNotNull(strategy);
    }

    @VisibleForTesting
    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j8, double d14, Strategy strategy) {
        Preconditions.checkNotNull(funnel);
        Preconditions.checkArgument(j8 >= 0, "Expected insertions (%s) must be >= 0", j8);
        Preconditions.checkArgument(d14 > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d14));
        Preconditions.checkArgument(d14 < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d14));
        Preconditions.checkNotNull(strategy);
        if (j8 == 0) {
            j8 = 1;
        }
        long jOptimalNumOfBits = optimalNumOfBits(j8, d14);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.LockFreeBitArray(jOptimalNumOfBits), optimalNumOfHashFunctions(j8, jOptimalNumOfBits), funnel, strategy);
        } catch (IllegalArgumentException e4) {
            j.w(a0.f(jOptimalNumOfBits, "Could not create BloomFilter of ", " bits"), e4);
            return null;
        }
    }

    @VisibleForTesting
    public static long optimalNumOfBits(long j8, double d14) {
        if (d14 == 0.0d) {
            d14 = Double.MIN_VALUE;
        }
        return (long) ((Math.log(d14) * (-j8)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @VisibleForTesting
    public static int optimalNumOfHashFunctions(long j8, long j14) {
        return Math.max(1, (int) Math.round(Math.log(2.0d) * (j14 / j8)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i14;
        int i15;
        Preconditions.checkNotNull(inputStream, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        int i16 = -1;
        try {
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                byte b14 = dataInputStream.readByte();
                try {
                    i15 = UnsignedBytes.toInt(dataInputStream.readByte());
                    try {
                        i16 = dataInputStream.readInt();
                        BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[b14];
                        BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new BloomFilterStrategies.LockFreeBitArray(LongMath.checkedMultiply(i16, 64L));
                        for (int i17 = 0; i17 < i16; i17++) {
                            lockFreeBitArray.putData(i17, dataInputStream.readLong());
                        }
                        return new BloomFilter<>(lockFreeBitArray, i15, funnel, bloomFilterStrategies);
                    } catch (Exception e4) {
                        e = e4;
                        int i18 = i16;
                        i16 = b14;
                        i14 = i18;
                        StringBuilder sbJ = e5.j(i16, i15, "Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ", " numHashFunctions: ", " dataLength: ");
                        sbJ.append(i14);
                        throw new IOException(sbJ.toString(), e);
                    }
                } catch (Exception e14) {
                    e = e14;
                    i15 = -1;
                    i16 = b14;
                    i14 = -1;
                }
            } catch (IOException e15) {
                throw e15;
            }
        } catch (Exception e16) {
            e = e16;
            i14 = -1;
            i15 = -1;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t7) {
        return mightContain(t7);
    }

    public long approximateElementCount() {
        double dBitSize = this.bits.bitSize();
        return DoubleMath.roundToLong(((-Math.log1p(-(this.bits.bitCount() / dBitSize))) * dBitSize) / ((double) this.numHashFunctions), RoundingMode.HALF_UP);
    }

    @VisibleForTesting
    public long bitSize() {
        return this.bits.bitSize();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.copy(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) obj;
            if (this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy)) {
                return true;
            }
        }
        return false;
    }

    public double expectedFpp() {
        return Math.pow(this.bits.bitCount() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(@ParametricNullness T t7) {
        return this.strategy.mightContain(t7, this.funnel, this.numHashFunctions, this.bits);
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness T t7) {
        return this.strategy.put(t7, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        Preconditions.checkArgument(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i14 = this.numHashFunctions;
        int i15 = bloomFilter.numHashFunctions;
        Preconditions.checkArgument(i14 == i15, "BloomFilters must have the same number of hash functions (%s != %s)", i14, i15);
        Preconditions.checkArgument(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        Preconditions.checkArgument(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        Preconditions.checkArgument(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.putAll(bloomFilter.bits);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.checkedCast(this.strategy.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.checkedCast(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.data.length());
        for (int i14 = 0; i14 < this.bits.data.length(); i14++) {
            dataOutputStream.writeLong(this.bits.data.get(i14));
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j8, double d14) {
        return create(funnel, j8, d14, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i14, double d14) {
        return create(funnel, i14, d14);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i14) {
        return create(funnel, i14);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j8) {
        return create(funnel, j8, 0.03d);
    }
}
