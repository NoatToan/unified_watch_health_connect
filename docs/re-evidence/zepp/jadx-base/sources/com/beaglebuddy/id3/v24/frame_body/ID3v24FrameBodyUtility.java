package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.pojo.Price;
import com.beaglebuddy.util.Utility;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyUtility extends Utility {
    public int nextNullTerminatorIndex;
    public int nullTerminatorIndex;

    public static int getNextNullTerminator(byte[] bArr, int i, Encoding encoding) {
        if (encoding.getNumBytesInNullTerminator() == 1) {
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
        } else {
            while (true) {
                int i2 = i + 1;
                if (i2 >= bArr.length || (bArr[i] == 0 && bArr[i2] == 0)) {
                    break;
                }
                i += 2;
            }
        }
        return i;
    }

    public static String pricesToString(List<Price> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Price price : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(stringBuffer.length() == 0 ? "" : FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            sb.append(price);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public static byte[] stringToBytes(Encoding encoding, String str) {
        byte[] bytes = str.getBytes(encoding.getCharacterSet());
        byte[] bArr = new byte[bytes.length + encoding.getNumBytesInNullTerminator()];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        if (encoding.getNumBytesInNullTerminator() == 2) {
            bArr[bytes.length + 1] = 0;
        }
        return bArr;
    }
}
