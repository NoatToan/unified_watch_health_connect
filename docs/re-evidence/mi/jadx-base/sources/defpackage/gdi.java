package defpackage;

import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public class gdi {
    public static int a(ReadableArray readableArray, float[] fArr) {
        int length = readableArray.size() > fArr.length ? fArr.length : readableArray.size();
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        return readableArray.size();
    }

    public static float[] b(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        float[] fArr = new float[readableArray.size()];
        a(readableArray, fArr);
        return fArr;
    }
}
