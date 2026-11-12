package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes13.dex */
final class DefaultEbmlReader implements EbmlReader {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private EbmlProcessor processor;
    private final byte[] scratch = new byte[8];
    private final ArrayDeque<MasterElement> masterElementsStack = new ArrayDeque<>();
    private final VarintReader varintReader = new VarintReader();

    public static final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        private MasterElement(int i14, long j8) {
            this.elementId = i14;
            this.elementEndPosition = j8;
        }
    }

    private long maybeResyncToNextLevel1Element(ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.scratch, 0, 4);
            int unsignedVarintLength = VarintReader.parseUnsignedVarintLength(this.scratch[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) VarintReader.assembleVarint(this.scratch, unsignedVarintLength, false);
                if (this.processor.isLevel1Element(iAssembleVarint)) {
                    extractorInput.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    private double readFloat(ExtractorInput extractorInput, int i14) {
        long integer = readInteger(extractorInput, i14);
        return i14 == 4 ? Float.intBitsToFloat((int) integer) : Double.longBitsToDouble(integer);
    }

    private long readInteger(ExtractorInput extractorInput, int i14) {
        extractorInput.readFully(this.scratch, 0, i14);
        long j8 = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            j8 = (j8 << 8) | ((long) (this.scratch[i15] & UnsignedBytes.MAX_VALUE));
        }
        return j8;
    }

    private static String readString(ExtractorInput extractorInput, int i14) {
        if (i14 == 0) {
            return "";
        }
        byte[] bArr = new byte[i14];
        extractorInput.readFully(bArr, 0, i14);
        while (i14 > 0 && bArr[i14 - 1] == 0) {
            i14--;
        }
        return new String(bArr, 0, i14);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void init(EbmlProcessor ebmlProcessor) {
        this.processor = ebmlProcessor;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public boolean read(ExtractorInput extractorInput) throws ParserException {
        Assertions.checkStateNotNull(this.processor);
        while (true) {
            MasterElement masterElementPeek = this.masterElementsStack.peek();
            if (masterElementPeek != null && extractorInput.getPosition() >= masterElementPeek.elementEndPosition) {
                this.processor.endMasterElement(this.masterElementsStack.pop().elementId);
                return true;
            }
            if (this.elementState == 0) {
                long unsignedVarint = this.varintReader.readUnsignedVarint(extractorInput, true, false, 4);
                if (unsignedVarint == -2) {
                    unsignedVarint = maybeResyncToNextLevel1Element(extractorInput);
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.elementId = (int) unsignedVarint;
                this.elementState = 1;
            }
            if (this.elementState == 1) {
                this.elementContentSize = this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
                this.elementState = 2;
            }
            int elementType = this.processor.getElementType(this.elementId);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = extractorInput.getPosition();
                    this.masterElementsStack.push(new MasterElement(this.elementId, this.elementContentSize + position));
                    this.processor.startMasterElement(this.elementId, position, this.elementContentSize);
                    this.elementState = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j8 = this.elementContentSize;
                    if (j8 <= 8) {
                        this.processor.integerElement(this.elementId, readInteger(extractorInput, (int) j8));
                        this.elementState = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(42);
                    sb3.append("Invalid integer size: ");
                    sb3.append(j8);
                    throw ParserException.createForMalformedContainer(sb3.toString(), null);
                }
                if (elementType == 3) {
                    long j14 = this.elementContentSize;
                    if (j14 <= 2147483647L) {
                        this.processor.stringElement(this.elementId, readString(extractorInput, (int) j14));
                        this.elementState = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(41);
                    sb4.append("String element size: ");
                    sb4.append(j14);
                    throw ParserException.createForMalformedContainer(sb4.toString(), null);
                }
                if (elementType == 4) {
                    this.processor.binaryElement(this.elementId, (int) this.elementContentSize, extractorInput);
                    this.elementState = 0;
                    return true;
                }
                if (elementType != 5) {
                    StringBuilder sb5 = new StringBuilder(32);
                    sb5.append("Invalid element type ");
                    sb5.append(elementType);
                    throw ParserException.createForMalformedContainer(sb5.toString(), null);
                }
                long j15 = this.elementContentSize;
                if (j15 == 4 || j15 == 8) {
                    this.processor.floatElement(this.elementId, readFloat(extractorInput, (int) j15));
                    this.elementState = 0;
                    return true;
                }
                StringBuilder sb6 = new StringBuilder(40);
                sb6.append("Invalid float size: ");
                sb6.append(j15);
                throw ParserException.createForMalformedContainer(sb6.toString(), null);
            }
            extractorInput.skipFully((int) this.elementContentSize);
            this.elementState = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void reset() {
        this.elementState = 0;
        this.masterElementsStack.clear();
        this.varintReader.reset();
    }
}
