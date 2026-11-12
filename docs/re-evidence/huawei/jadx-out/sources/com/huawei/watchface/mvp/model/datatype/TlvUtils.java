package com.huawei.watchface.mvp.model.datatype;

import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.i1;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;

/* JADX INFO: loaded from: classes20.dex */
public class TlvUtils {
    private static final int DATA_WRAPPER_BASE_LENGTH_HIGH_MIN = 128;
    private static final int ERROR_CODE = 127;
    private static final int ERROR_CODE_TIMEOUT = 100009;
    private static final int MESSAGE_SUB_LENGTH = 8;
    private static final int REMOVE_BYTE_HIGH_VALUE = 127;
    private static final int SHIFT_OPERATOR_SEVEN = 7;
    private static final String TAG = "TlvUtils";
    private static final int UNIT_HEX_LENGTH = 2;

    public static class ValuePosition {
        private int mPosition;
        private int mValue;

        private ValuePosition(int i, int i2) {
            this.mValue = i;
            this.mPosition = i2;
        }

        public int getPosition() {
            return this.mPosition;
        }

        public int getValue() {
            return this.mValue;
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        public void setValue(int i) {
            this.mValue = i;
        }
    }

    private void buildTlvTransfer(TlvTransfer tlvTransfer, int i, int i2, String str, String str2) throws TlvException {
        if ((IntegerUtils.c(str, 16) >>> 7) != 1) {
            String string = Integer.toString(IntegerUtils.c(str, 16));
            if (string.charAt(0) == '0') {
                string = SafeString.substring(string, 1, string.length());
            }
            tlvTransfer.mTlvTransfers.add(new TlvTransfer(i, string, string));
            return;
        }
        String string2 = Integer.toString(IntegerUtils.c(str, 16) & 127);
        if (string2.charAt(0) == '0') {
            string2 = SafeString.substring(string2, 1, string2.length());
        }
        tlvTransfer.mTlvTransfers.add(new TlvTransfer(i, string2, string2));
        builderTlvTransfer(tlvTransfer, str2, i2);
    }

    private ValuePosition getLengthAndPosition(String str, int i) throws TlvException {
        int i2;
        try {
            int iC = IntegerUtils.c(SafeString.substring(str, i, i + 2), 16);
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (((iC >>> 7) & 1) == 1) {
                if (i3 >= 4) {
                    throw new TlvException();
                }
                int i6 = i + 2;
                int i7 = iC & 127;
                if (i3 == 0) {
                    i4 = i7;
                } else if (i3 != 1) {
                    HwLog.w(TAG, "getLengthAndPosition default");
                } else {
                    i5 = i7;
                }
                iC = IntegerUtils.c(SafeString.substring(str, i6, i + 4), 16);
                i3++;
                i = i6;
            }
            if (i3 != 2) {
                if (i3 == 1) {
                    i2 = i4 * 128;
                }
                return new ValuePosition(iC, i + 2);
            }
            i2 = (i4 * 16384) + (i5 * 128);
            iC += i2;
            return new ValuePosition(iC, i + 2);
        } catch (IndexOutOfBoundsException unused) {
            throw new TlvException();
        }
    }

    public static boolean isTimeout(byte[] bArr) {
        if (bArr[2] != 127) {
            return false;
        }
        String strA = i1.a(bArr);
        try {
            return IntegerUtils.c(SafeString.substring(strA, 8, strA.length()), 16) == ERROR_CODE_TIMEOUT;
        } catch (NumberFormatException unused) {
            HwLog.e(TAG, "isTimeout exception");
            return false;
        }
    }

    public TlvFather builderTlvList(String str) throws TlvException {
        TlvFather tlvFather = new TlvFather();
        if (str == null) {
            HwLog.w(TAG, "hexString is null");
            return tlvFather;
        }
        int position = 0;
        while (position != str.length()) {
            try {
                String strSubstring = SafeString.substring(str, position, position + 2);
                ValuePosition lengthAndPosition = getLengthAndPosition(str, position + strSubstring.length());
                int value = lengthAndPosition.getValue();
                position = lengthAndPosition.getPosition();
                if (value != 0) {
                    int i = (value * 2) + position;
                    if (i > str.length()) {
                        throw new TlvException();
                    }
                    String strSubstring2 = SafeString.substring(str, position, i);
                    position += strSubstring2.length();
                    if ((IntegerUtils.c(strSubstring, 16) >>> 7) == 1) {
                        tlvFather.getTlvFatherList().add(builderTlvList(strSubstring2));
                    } else {
                        tlvFather.getTlvList().add(new Tlv(strSubstring, value, strSubstring2));
                    }
                } else {
                    tlvFather.getTlvList().add(new Tlv(strSubstring, value, ""));
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new TlvException();
            }
        }
        return tlvFather;
    }

    public TlvTransfer builderTlvTransfer(TlvTransfer tlvTransfer, String str, int i) throws TlvException {
        if (tlvTransfer == null || str == null || i < 0) {
            return null;
        }
        int position = 0;
        while (position != str.length()) {
            try {
                String strSubstring = SafeString.substring(str, position, position + 2);
                int i2 = (i + position) / 2;
                ValuePosition lengthAndPosition = getLengthAndPosition(str, position + strSubstring.length());
                int value = lengthAndPosition.getValue();
                position = lengthAndPosition.getPosition();
                if (value != 0) {
                    int i3 = (value * 2) + position;
                    if (i3 > str.length()) {
                        throw new TlvException();
                    }
                    String strSubstring2 = SafeString.substring(str, position, i3);
                    int length = strSubstring2.length() + position;
                    buildTlvTransfer(tlvTransfer, i2, i + position, strSubstring, strSubstring2);
                    position = length;
                } else {
                    String string = Integer.toString(IntegerUtils.c(strSubstring, 16));
                    if (string.charAt(0) == '0') {
                        string = SafeString.substring(string, 1, string.length());
                    }
                    tlvTransfer.mTlvTransfers.add(new TlvTransfer(i2, string, string));
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new TlvException();
            }
        }
        return tlvTransfer;
    }
}
