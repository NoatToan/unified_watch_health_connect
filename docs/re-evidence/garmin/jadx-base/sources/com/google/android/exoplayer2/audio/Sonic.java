package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public Sonic(int i14, int i15, float f14, float f15, int i16) {
        this.inputSampleRateHz = i14;
        this.channelCount = i15;
        this.speed = f14;
        this.pitch = f15;
        this.rate = i14 / i16;
        this.minPeriod = i14 / 400;
        int i17 = i14 / 65;
        this.maxPeriod = i17;
        int i18 = i17 * 2;
        this.maxRequiredFrameCount = i18;
        this.downSampleBuffer = new short[i18];
        this.inputBuffer = new short[i18 * i15];
        this.outputBuffer = new short[i18 * i15];
        this.pitchBuffer = new short[i18 * i15];
    }

    private void adjustRate(float f14, int i14) {
        int i15;
        int i16;
        if (this.outputFrameCount == i14) {
            return;
        }
        int i17 = this.inputSampleRateHz;
        int i18 = (int) (i17 / f14);
        while (true) {
            if (i18 <= 16384 && i17 <= 16384) {
                break;
            }
            i18 /= 2;
            i17 /= 2;
        }
        moveNewSamplesToPitchBuffer(i14);
        int i19 = 0;
        while (true) {
            int i24 = this.pitchFrameCount;
            if (i19 >= i24 - 1) {
                removePitchFrames(i24 - 1);
                return;
            }
            while (true) {
                i15 = this.oldRatePosition;
                int i25 = (i15 + 1) * i18;
                i16 = this.newRatePosition;
                if (i25 <= i16 * i17) {
                    break;
                }
                this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, 1);
                int i26 = 0;
                while (true) {
                    int i27 = this.channelCount;
                    if (i26 < i27) {
                        this.outputBuffer[(this.outputFrameCount * i27) + i26] = interpolate(this.pitchBuffer, (i27 * i19) + i26, i17, i18);
                        i26++;
                    }
                }
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            int i28 = i15 + 1;
            this.oldRatePosition = i28;
            if (i28 == i17) {
                this.oldRatePosition = 0;
                Assertions.checkState(i16 == i18);
                this.newRatePosition = 0;
            }
            i19++;
        }
    }

    private void changeSpeed(float f14) {
        int iInsertPitchPeriod;
        int i14 = this.inputFrameCount;
        if (i14 < this.maxRequiredFrameCount) {
            return;
        }
        int iSkipPitchPeriod = 0;
        do {
            if (this.remainingInputToCopyFrameCount > 0) {
                iInsertPitchPeriod = copyInputToOutput(iSkipPitchPeriod);
            } else {
                int iFindPitchPeriod = findPitchPeriod(this.inputBuffer, iSkipPitchPeriod);
                double d14 = f14;
                short[] sArr = this.inputBuffer;
                if (d14 > 1.0d) {
                    iSkipPitchPeriod = iFindPitchPeriod + skipPitchPeriod(sArr, iSkipPitchPeriod, f14, iFindPitchPeriod) + iSkipPitchPeriod;
                } else {
                    iInsertPitchPeriod = insertPitchPeriod(sArr, iSkipPitchPeriod, f14, iFindPitchPeriod);
                }
            }
            iSkipPitchPeriod += iInsertPitchPeriod;
        } while (this.maxRequiredFrameCount + iSkipPitchPeriod <= i14);
        removeProcessedInputFrames(iSkipPitchPeriod);
    }

    private int copyInputToOutput(int i14) {
        int iMin = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(this.inputBuffer, i14, iMin);
        this.remainingInputToCopyFrameCount -= iMin;
        return iMin;
    }

    private void copyToOutput(short[] sArr, int i14, int i15) {
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i15);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        int i16 = this.channelCount;
        System.arraycopy(sArr, i14 * i16, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount * i16, i16 * i15);
        this.outputFrameCount += i15;
    }

    private void downSampleInput(short[] sArr, int i14, int i15) {
        int i16 = this.maxRequiredFrameCount / i15;
        int i17 = this.channelCount;
        int i18 = i15 * i17;
        int i19 = i14 * i17;
        for (int i24 = 0; i24 < i16; i24++) {
            int i25 = 0;
            for (int i26 = 0; i26 < i18; i26++) {
                i25 += sArr[fb1.c.d(i24, i18, i19, i26)];
            }
            this.downSampleBuffer[i24] = (short) (i25 / i18);
        }
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i14, int i15) {
        int length = sArr.length;
        int i16 = this.channelCount;
        int i17 = length / i16;
        return i14 + i15 <= i17 ? sArr : Arrays.copyOf(sArr, (((i17 * 3) / 2) + i15) * i16);
    }

    private int findPitchPeriod(short[] sArr, int i14) {
        int iFindPitchPeriodInRange;
        int i15 = this.inputSampleRateHz;
        int i16 = i15 > AMDF_FREQUENCY ? i15 / AMDF_FREQUENCY : 1;
        if (this.channelCount == 1 && i16 == 1) {
            iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i14, this.minPeriod, this.maxPeriod);
        } else {
            downSampleInput(sArr, i14, i16);
            int iFindPitchPeriodInRange2 = findPitchPeriodInRange(this.downSampleBuffer, 0, this.minPeriod / i16, this.maxPeriod / i16);
            if (i16 != 1) {
                int i17 = iFindPitchPeriodInRange2 * i16;
                int i18 = i16 * 4;
                int i19 = i17 - i18;
                int i24 = i17 + i18;
                int i25 = this.minPeriod;
                if (i19 < i25) {
                    i19 = i25;
                }
                int i26 = this.maxPeriod;
                if (i24 > i26) {
                    i24 = i26;
                }
                if (this.channelCount == 1) {
                    iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i14, i19, i24);
                } else {
                    downSampleInput(sArr, i14, 1);
                    iFindPitchPeriodInRange = findPitchPeriodInRange(this.downSampleBuffer, 0, i19, i24);
                }
            } else {
                iFindPitchPeriodInRange = iFindPitchPeriodInRange2;
            }
        }
        int i27 = previousPeriodBetter(this.minDiff, this.maxDiff) ? this.prevPeriod : iFindPitchPeriodInRange;
        this.prevMinDiff = this.minDiff;
        this.prevPeriod = iFindPitchPeriodInRange;
        return i27;
    }

    private int findPitchPeriodInRange(short[] sArr, int i14, int i15, int i16) {
        int i17 = i14 * this.channelCount;
        int i18 = 255;
        int i19 = 1;
        int i24 = 0;
        int i25 = 0;
        while (i15 <= i16) {
            int iAbs = 0;
            for (int i26 = 0; i26 < i15; i26++) {
                iAbs += Math.abs(sArr[i17 + i26] - sArr[(i17 + i15) + i26]);
            }
            if (iAbs * i24 < i19 * i15) {
                i24 = i15;
                i19 = iAbs;
            }
            if (iAbs * i18 > i25 * i15) {
                i18 = i15;
                i25 = iAbs;
            }
            i15++;
        }
        this.minDiff = i19 / i24;
        this.maxDiff = i25 / i18;
        return i24;
    }

    private int insertPitchPeriod(short[] sArr, int i14, float f14, int i15) {
        int i16;
        if (f14 < 0.5f) {
            i16 = (int) ((i15 * f14) / (1.0f - f14));
        } else {
            this.remainingInputToCopyFrameCount = (int) ((((2.0f * f14) - 1.0f) * i15) / (1.0f - f14));
            i16 = i15;
        }
        int i17 = i15 + i16;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i17);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        int i18 = this.channelCount;
        System.arraycopy(sArr, i14 * i18, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount * i18, i18 * i15);
        overlapAdd(i16, this.channelCount, this.outputBuffer, this.outputFrameCount + i15, sArr, i14 + i15, sArr, i14);
        this.outputFrameCount += i17;
        return i16;
    }

    private short interpolate(short[] sArr, int i14, int i15, int i16) {
        short s8 = sArr[i14];
        short s14 = sArr[i14 + this.channelCount];
        int i17 = this.newRatePosition * i15;
        int i18 = this.oldRatePosition;
        int i19 = i18 * i16;
        int i24 = (i18 + 1) * i16;
        int i25 = i24 - i17;
        int i26 = i24 - i19;
        return (short) ((((i26 - i25) * s14) + (s8 * i25)) / i26);
    }

    private void moveNewSamplesToPitchBuffer(int i14) {
        int i15 = this.outputFrameCount - i14;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.pitchFrameCount, i15);
        this.pitchBuffer = sArrEnsureSpaceForAdditionalFrames;
        short[] sArr = this.outputBuffer;
        int i16 = this.channelCount;
        System.arraycopy(sArr, i14 * i16, sArrEnsureSpaceForAdditionalFrames, this.pitchFrameCount * i16, i16 * i15);
        this.outputFrameCount = i14;
        this.pitchFrameCount += i15;
    }

    private static void overlapAdd(int i14, int i15, short[] sArr, int i16, short[] sArr2, int i17, short[] sArr3, int i18) {
        for (int i19 = 0; i19 < i15; i19++) {
            int i24 = (i16 * i15) + i19;
            int i25 = (i18 * i15) + i19;
            int i26 = (i17 * i15) + i19;
            for (int i27 = 0; i27 < i14; i27++) {
                sArr[i24] = (short) (((sArr3[i25] * i27) + ((i14 - i27) * sArr2[i26])) / i14);
                i24 += i15;
                i26 += i15;
                i25 += i15;
            }
        }
    }

    private boolean previousPeriodBetter(int i14, int i15) {
        return i14 != 0 && this.prevPeriod != 0 && i15 <= i14 * 3 && i14 * 2 > this.prevMinDiff * 3;
    }

    private void processStreamInput() {
        int i14 = this.outputFrameCount;
        float f14 = this.speed;
        float f15 = this.pitch;
        float f16 = f14 / f15;
        float f17 = this.rate * f15;
        double d14 = f16;
        if (d14 > 1.00001d || d14 < 0.99999d) {
            changeSpeed(f16);
        } else {
            copyToOutput(this.inputBuffer, 0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        if (f17 != 1.0f) {
            adjustRate(f17, i14);
        }
    }

    private void removePitchFrames(int i14) {
        if (i14 == 0) {
            return;
        }
        short[] sArr = this.pitchBuffer;
        int i15 = this.channelCount;
        System.arraycopy(sArr, i14 * i15, sArr, 0, (this.pitchFrameCount - i14) * i15);
        this.pitchFrameCount -= i14;
    }

    private void removeProcessedInputFrames(int i14) {
        int i15 = this.inputFrameCount - i14;
        short[] sArr = this.inputBuffer;
        int i16 = this.channelCount;
        System.arraycopy(sArr, i14 * i16, sArr, 0, i16 * i15);
        this.inputFrameCount = i15;
    }

    private int skipPitchPeriod(short[] sArr, int i14, float f14, int i15) {
        int i16;
        if (f14 >= 2.0f) {
            i16 = (int) (i15 / (f14 - 1.0f));
        } else {
            this.remainingInputToCopyFrameCount = (int) (((2.0f - f14) * i15) / (f14 - 1.0f));
            i16 = i15;
        }
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i16);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        overlapAdd(i16, this.channelCount, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount, sArr, i14, sArr, i14 + i15);
        this.outputFrameCount += i16;
        return i16;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.prevMinDiff = 0;
        this.minDiff = 0;
        this.maxDiff = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.channelCount, this.outputFrameCount);
        shortBuffer.put(this.outputBuffer, 0, this.channelCount * iMin);
        int i14 = this.outputFrameCount - iMin;
        this.outputFrameCount = i14;
        short[] sArr = this.outputBuffer;
        int i15 = this.channelCount;
        System.arraycopy(sArr, iMin * i15, sArr, 0, i14 * i15);
    }

    public int getOutputSize() {
        return this.outputFrameCount * this.channelCount * 2;
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * 2;
    }

    public void queueEndOfStream() {
        int i14;
        int i15 = this.inputFrameCount;
        float f14 = this.speed;
        float f15 = this.pitch;
        int i16 = this.outputFrameCount + ((int) ((((i15 / (f14 / f15)) + this.pitchFrameCount) / (this.rate * f15)) + 0.5f));
        this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, i15, (this.maxRequiredFrameCount * 2) + i15);
        int i17 = 0;
        while (true) {
            i14 = this.maxRequiredFrameCount;
            int i18 = this.channelCount;
            if (i17 >= i14 * 2 * i18) {
                break;
            }
            this.inputBuffer[(i18 * i15) + i17] = 0;
            i17++;
        }
        this.inputFrameCount = (i14 * 2) + this.inputFrameCount;
        processStreamInput();
        if (this.outputFrameCount > i16) {
            this.outputFrameCount = i16;
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i14 = this.channelCount;
        int i15 = iRemaining / i14;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.inputBuffer, this.inputFrameCount, i15);
        this.inputBuffer = sArrEnsureSpaceForAdditionalFrames;
        shortBuffer.get(sArrEnsureSpaceForAdditionalFrames, this.inputFrameCount * this.channelCount, ((i14 * i15) * 2) / 2);
        this.inputFrameCount += i15;
        processStreamInput();
    }
}
