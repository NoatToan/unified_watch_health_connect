package defpackage;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ifi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<DecodeHintType, Object> f21093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<DecodeHintType, Object> f21094b;
    public static final Map<DecodeHintType, Object> c;
    public static final Map<DecodeHintType, Object> d;
    public static final Map<DecodeHintType, Object> e;
    public static final Map<DecodeHintType, Object> f;
    public static final Map<DecodeHintType, Object> g;

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        f21093a = enumMap;
        ArrayList arrayList = new ArrayList();
        BarcodeFormat barcodeFormat = BarcodeFormat.AZTEC;
        arrayList.add(barcodeFormat);
        BarcodeFormat barcodeFormat2 = BarcodeFormat.CODABAR;
        arrayList.add(barcodeFormat2);
        BarcodeFormat barcodeFormat3 = BarcodeFormat.CODE_39;
        arrayList.add(barcodeFormat3);
        BarcodeFormat barcodeFormat4 = BarcodeFormat.CODE_93;
        arrayList.add(barcodeFormat4);
        BarcodeFormat barcodeFormat5 = BarcodeFormat.CODE_128;
        arrayList.add(barcodeFormat5);
        BarcodeFormat barcodeFormat6 = BarcodeFormat.DATA_MATRIX;
        arrayList.add(barcodeFormat6);
        BarcodeFormat barcodeFormat7 = BarcodeFormat.EAN_8;
        arrayList.add(barcodeFormat7);
        BarcodeFormat barcodeFormat8 = BarcodeFormat.EAN_13;
        arrayList.add(barcodeFormat8);
        BarcodeFormat barcodeFormat9 = BarcodeFormat.ITF;
        arrayList.add(barcodeFormat9);
        BarcodeFormat barcodeFormat10 = BarcodeFormat.MAXICODE;
        arrayList.add(barcodeFormat10);
        BarcodeFormat barcodeFormat11 = BarcodeFormat.PDF_417;
        arrayList.add(barcodeFormat11);
        BarcodeFormat barcodeFormat12 = BarcodeFormat.QR_CODE;
        arrayList.add(barcodeFormat12);
        BarcodeFormat barcodeFormat13 = BarcodeFormat.RSS_14;
        arrayList.add(barcodeFormat13);
        BarcodeFormat barcodeFormat14 = BarcodeFormat.RSS_EXPANDED;
        arrayList.add(barcodeFormat14);
        BarcodeFormat barcodeFormat15 = BarcodeFormat.UPC_A;
        arrayList.add(barcodeFormat15);
        BarcodeFormat barcodeFormat16 = BarcodeFormat.UPC_E;
        arrayList.add(barcodeFormat16);
        BarcodeFormat barcodeFormat17 = BarcodeFormat.UPC_EAN_EXTENSION;
        arrayList.add(barcodeFormat17);
        DecodeHintType decodeHintType = DecodeHintType.POSSIBLE_FORMATS;
        enumMap.put(decodeHintType, arrayList);
        DecodeHintType decodeHintType2 = DecodeHintType.TRY_HARDER;
        Boolean bool = Boolean.TRUE;
        enumMap.put(decodeHintType2, bool);
        DecodeHintType decodeHintType3 = DecodeHintType.CHARACTER_SET;
        enumMap.put(decodeHintType3, "utf-8");
        EnumMap enumMap2 = new EnumMap(DecodeHintType.class);
        f21094b = enumMap2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(barcodeFormat2);
        arrayList2.add(barcodeFormat3);
        arrayList2.add(barcodeFormat4);
        arrayList2.add(barcodeFormat5);
        arrayList2.add(barcodeFormat7);
        arrayList2.add(barcodeFormat8);
        arrayList2.add(barcodeFormat9);
        arrayList2.add(barcodeFormat11);
        arrayList2.add(barcodeFormat13);
        arrayList2.add(barcodeFormat14);
        arrayList2.add(barcodeFormat15);
        arrayList2.add(barcodeFormat16);
        arrayList2.add(barcodeFormat17);
        enumMap2.put(decodeHintType, arrayList2);
        enumMap2.put(decodeHintType2, bool);
        enumMap2.put(decodeHintType3, "utf-8");
        EnumMap enumMap3 = new EnumMap(DecodeHintType.class);
        c = enumMap3;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(barcodeFormat);
        arrayList3.add(barcodeFormat6);
        arrayList3.add(barcodeFormat10);
        arrayList3.add(barcodeFormat12);
        enumMap3.put(decodeHintType, arrayList3);
        enumMap3.put(decodeHintType2, bool);
        enumMap3.put(decodeHintType3, "utf-8");
        EnumMap enumMap4 = new EnumMap(DecodeHintType.class);
        d = enumMap4;
        enumMap4.put(decodeHintType, Collections.singletonList(barcodeFormat12));
        enumMap4.put(decodeHintType2, bool);
        enumMap4.put(decodeHintType3, "utf-8");
        EnumMap enumMap5 = new EnumMap(DecodeHintType.class);
        e = enumMap5;
        enumMap5.put(decodeHintType, Collections.singletonList(barcodeFormat5));
        enumMap5.put(decodeHintType2, bool);
        enumMap5.put(decodeHintType3, "utf-8");
        EnumMap enumMap6 = new EnumMap(DecodeHintType.class);
        f = enumMap6;
        enumMap6.put(decodeHintType, Collections.singletonList(barcodeFormat8));
        enumMap6.put(decodeHintType2, bool);
        enumMap6.put(decodeHintType3, "utf-8");
        EnumMap enumMap7 = new EnumMap(DecodeHintType.class);
        g = enumMap7;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(barcodeFormat12);
        arrayList4.add(barcodeFormat15);
        arrayList4.add(barcodeFormat8);
        arrayList4.add(barcodeFormat5);
        enumMap7.put(decodeHintType, arrayList4);
        enumMap7.put(decodeHintType2, bool);
        enumMap7.put(decodeHintType3, "utf-8");
    }

    public static String a(Bitmap bitmap) {
        v6j v6jVar;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            v6jVar = new v6j(width, height, iArr);
            try {
                return new dag().a(new cj2(new ync(v6jVar)), f21093a).f();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                if (v6jVar != null) {
                    try {
                        return new dag().a(new cj2(new n0b(v6jVar)), f21093a).f();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            v6jVar = null;
        }
    }
}
