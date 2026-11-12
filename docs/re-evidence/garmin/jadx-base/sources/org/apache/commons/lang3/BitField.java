package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes3.dex */
public class BitField {
    private final int _mask;
    private final int _shift_count;

    public BitField(int i14) {
        this._mask = i14;
        this._shift_count = i14 == 0 ? 0 : Integer.numberOfTrailingZeros(i14);
    }

    public int clear(int i14) {
        return i14 & (~this._mask);
    }

    public byte clearByte(byte b14) {
        return (byte) clear(b14);
    }

    public short clearShort(short s8) {
        return (short) clear(s8);
    }

    public int getRawValue(int i14) {
        return i14 & this._mask;
    }

    public short getShortRawValue(short s8) {
        return (short) getRawValue(s8);
    }

    public short getShortValue(short s8) {
        return (short) getValue(s8);
    }

    public int getValue(int i14) {
        return getRawValue(i14) >> this._shift_count;
    }

    public boolean isAllSet(int i14) {
        int i15 = this._mask;
        return (i14 & i15) == i15;
    }

    public boolean isSet(int i14) {
        return (i14 & this._mask) != 0;
    }

    public int set(int i14) {
        return i14 | this._mask;
    }

    public int setBoolean(int i14, boolean z14) {
        return z14 ? set(i14) : clear(i14);
    }

    public byte setByte(byte b14) {
        return (byte) set(b14);
    }

    public byte setByteBoolean(byte b14, boolean z14) {
        return z14 ? setByte(b14) : clearByte(b14);
    }

    public short setShort(short s8) {
        return (short) set(s8);
    }

    public short setShortBoolean(short s8, boolean z14) {
        return z14 ? setShort(s8) : clearShort(s8);
    }

    public short setShortValue(short s8, short s14) {
        return (short) setValue(s8, s14);
    }

    public int setValue(int i14, int i15) {
        int i16 = this._mask;
        return (i14 & (~i16)) | ((i15 << this._shift_count) & i16);
    }
}
