package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    public static final class AllocationNode implements Allocator.AllocationNode {
        public Allocation allocation;
        public long endPosition;
        public AllocationNode next;
        public long startPosition;

        public AllocationNode(long j8, int i14) {
            reset(j8, i14);
        }

        public AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
            return (Allocation) Assertions.checkNotNull(this.allocation);
        }

        public void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }

        public void reset(long j8, int i14) {
            Assertions.checkState(this.allocation == null);
            this.startPosition = j8;
            this.endPosition = j8 + ((long) i14);
        }

        public int translateOffset(long j8) {
            return ((int) (j8 - this.startPosition)) + this.allocation.offset;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long j8) {
        while (j8 >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    private void postAppend(int i14) {
        long j8 = this.totalBytesWritten + ((long) i14);
        this.totalBytesWritten = j8;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j8 == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private int preAppend(int i14) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (allocationNode.allocation == null) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i14, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j8, byte[] bArr, int i14) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j8);
        int i15 = i14;
        while (i15 > 0) {
            int iMin = Math.min(i15, (int) (nodeContainingPosition.endPosition - j8));
            System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j8), bArr, i14 - i15, iMin);
            i15 -= iMin;
            j8 += (long) iMin;
            if (j8 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        long j8 = sampleExtrasHolder.offset;
        int unsignedShort = 1;
        parsableByteArray.reset(1);
        AllocationNode data = readData(allocationNode, j8, parsableByteArray.getData(), 1);
        long j14 = j8 + 1;
        byte b14 = parsableByteArray.getData()[0];
        boolean z14 = (b14 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i14 = b14 & Ascii.DEL;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        byte[] bArr = cryptoInfo.f52982iv;
        if (bArr == null) {
            cryptoInfo.f52982iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        AllocationNode data2 = readData(data, j14, cryptoInfo.f52982iv, i14);
        long j15 = j14 + ((long) i14);
        if (z14) {
            parsableByteArray.reset(2);
            data2 = readData(data2, j15, parsableByteArray.getData(), 2);
            j15 += 2;
            unsignedShort = parsableByteArray.readUnsignedShort();
        }
        int i15 = unsignedShort;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i15) {
            iArr = new int[i15];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i15) {
            iArr3 = new int[i15];
        }
        int[] iArr4 = iArr3;
        if (z14) {
            int i16 = i15 * 6;
            parsableByteArray.reset(i16);
            data2 = readData(data2, j15, parsableByteArray.getData(), i16);
            j15 += (long) i16;
            parsableByteArray.setPosition(0);
            for (int i17 = 0; i17 < i15; i17++) {
                iArr2[i17] = parsableByteArray.readUnsignedShort();
                iArr4[i17] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j15 - sampleExtrasHolder.offset));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(sampleExtrasHolder.cryptoData);
        cryptoInfo.set(i15, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.f52982iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j16 = sampleExtrasHolder.offset;
        int i18 = (int) (j15 - j16);
        sampleExtrasHolder.offset = j16 + ((long) i18);
        sampleExtrasHolder.size -= i18;
        return data2;
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, decoderInputBuffer, sampleExtrasHolder, parsableByteArray);
        }
        if (!decoderInputBuffer.hasSupplementalData()) {
            decoderInputBuffer.ensureSpaceForWrite(sampleExtrasHolder.size);
            return readData(allocationNode, sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
        }
        parsableByteArray.reset(4);
        AllocationNode data = readData(allocationNode, sampleExtrasHolder.offset, parsableByteArray.getData(), 4);
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        sampleExtrasHolder.offset += 4;
        sampleExtrasHolder.size -= 4;
        decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
        AllocationNode data2 = readData(data, sampleExtrasHolder.offset, decoderInputBuffer.data, unsignedIntToInt);
        sampleExtrasHolder.offset += (long) unsignedIntToInt;
        int i14 = sampleExtrasHolder.size - unsignedIntToInt;
        sampleExtrasHolder.size = i14;
        decoderInputBuffer.resetSupplementalData(i14);
        return readData(data2, sampleExtrasHolder.offset, decoderInputBuffer.supplementalData, sampleExtrasHolder.size);
    }

    public void discardDownstreamTo(long j8) {
        AllocationNode allocationNode;
        if (j8 == -1) {
            return;
        }
        while (true) {
            allocationNode = this.firstAllocationNode;
            if (j8 < allocationNode.endPosition) {
                break;
            }
            this.allocator.release(allocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
            this.readAllocationNode = allocationNode;
        }
    }

    public void discardUpstreamSampleBytes(long j8) {
        AllocationNode allocationNode;
        Assertions.checkArgument(j8 <= this.totalBytesWritten);
        this.totalBytesWritten = j8;
        if (j8 != 0) {
            AllocationNode allocationNode2 = this.firstAllocationNode;
            if (j8 != allocationNode2.startPosition) {
                while (true) {
                    long j14 = this.totalBytesWritten;
                    long j15 = allocationNode2.endPosition;
                    allocationNode = allocationNode2.next;
                    if (j14 <= j15) {
                        break;
                    } else {
                        allocationNode2 = allocationNode;
                    }
                }
                AllocationNode allocationNode3 = (AllocationNode) Assertions.checkNotNull(allocationNode);
                clearAllocationNodes(allocationNode3);
                AllocationNode allocationNode4 = new AllocationNode(allocationNode2.endPosition, this.allocationLength);
                allocationNode2.next = allocationNode4;
                if (this.totalBytesWritten == allocationNode2.endPosition) {
                    allocationNode2 = allocationNode4;
                }
                this.writeAllocationNode = allocationNode2;
                if (this.readAllocationNode == allocationNode3) {
                    this.readAllocationNode = allocationNode4;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode5 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode5;
        this.readAllocationNode = allocationNode5;
        this.writeAllocationNode = allocationNode5;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void peekToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void readToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public int sampleData(DataReader dataReader, int i14, boolean z14) throws EOFException {
        int iPreAppend = preAppend(i14);
        AllocationNode allocationNode = this.writeAllocationNode;
        int i15 = dataReader.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
        if (i15 != -1) {
            postAppend(i15);
            return i15;
        }
        if (z14) {
            return -1;
        }
        vb.h.m();
        return 0;
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i14) {
        while (i14 > 0) {
            int iPreAppend = preAppend(i14);
            AllocationNode allocationNode = this.writeAllocationNode;
            parsableByteArray.readBytes(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
            i14 -= iPreAppend;
            postAppend(iPreAppend);
        }
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j8, ByteBuffer byteBuffer, int i14) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j8);
        while (i14 > 0) {
            int iMin = Math.min(i14, (int) (nodeContainingPosition.endPosition - j8));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j8), iMin);
            i14 -= iMin;
            j8 += (long) iMin;
            if (j8 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }
}
