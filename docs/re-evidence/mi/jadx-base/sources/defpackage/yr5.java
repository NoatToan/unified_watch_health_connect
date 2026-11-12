package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class yr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f40448a = Pattern.compile(",");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<BarcodeFormat> f40449b;
    public static final Set<BarcodeFormat> c;
    public static final Set<BarcodeFormat> d;
    public static final Set<BarcodeFormat> e;
    public static final Set<BarcodeFormat> f;
    public static final Set<BarcodeFormat> g;
    public static final Set<BarcodeFormat> h;
    public static final Map<String, Set<BarcodeFormat>> i;

    static {
        EnumSet enumSetOf = EnumSet.of(BarcodeFormat.QR_CODE);
        e = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        f = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(BarcodeFormat.AZTEC);
        g = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(BarcodeFormat.PDF_417);
        h = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED);
        f40449b = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        c = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        d = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        i = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
