package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f16191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f16192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f16193c;
    public static final Set d;
    public static final Set e;
    public static final Set f;
    public static final Set g;
    private static final Map h;

    static {
        EnumSet enumSetOf = EnumSet.of(BarcodeFormat.QR_CODE);
        d = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(BarcodeFormat.AZTEC);
        e = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        f = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(BarcodeFormat.PDF_417);
        g = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f16193c = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8);
        f16191a = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf6);
        f16192b = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf5);
        HashMap map = new HashMap();
        h = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("PRODUCT_MODE", enumSetOf6);
        map.put("AZTEC_MODE", enumSetOf2);
        map.put("DATA_MATRIX_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
