package defpackage;

import android.graphics.Bitmap;
import health.compact.a.CommonUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class lrz {
    public byte[] b(Bitmap bitmap) {
        byte[] bArr = null;
        if (bitmap == null) {
            return null;
        }
        ArrayList<Integer> arrayListA = a(bitmap);
        if (arrayListA != null && arrayListA.size() != 0) {
            bArr = new byte[arrayListA.size()];
            for (int i = 0; i < arrayListA.size(); i++) {
                bArr[i] = (byte) arrayListA.get(i).intValue();
            }
        }
        return bArr;
    }

    private ArrayList<Integer> a(Bitmap bitmap) {
        ArrayList<Integer> arrayList = new ArrayList<>(16);
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ArrayList<String> arrayListD = d(width, height, bitmap);
            for (int i = 0; i < width; i++) {
                int i2 = height / 8;
                String strE = e(arrayListD, height, i);
                if (i2 == 0) {
                    arrayList.add(Integer.valueOf(CommonUtil.b(strE, 2)));
                } else {
                    int i3 = 0;
                    while (i3 < i2) {
                        int i4 = i3 + 1;
                        arrayList.add(Integer.valueOf(CommonUtil.b(strE.substring(i3 * 8, i4 * 8), 2)));
                        i3 = i4;
                    }
                    if (height % 8 != 0) {
                        String strSubstring = strE.substring(i2 * 8);
                        arrayList.add(Integer.valueOf(CommonUtil.b("00000000".substring(strSubstring.length()) + strSubstring, 2)));
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<String> d(int i, int i2, Bitmap bitmap) {
        ArrayList<String> arrayList = new ArrayList<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            StringBuilder sb = new StringBuilder(16);
            for (int i4 = 0; i4 < i; i4++) {
                if (((short) (bitmap.getPixel(i4, i3) & 255)) <= 127) {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private String e(ArrayList<String> arrayList, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i; i3++) {
            if (arrayList != null && arrayList.size() > i3) {
                String str = arrayList.get(i3);
                if (StringUtils.j(str) && str.length() > i2) {
                    sb.append(str.charAt(i2));
                }
            }
        }
        return sb.toString();
    }
}
