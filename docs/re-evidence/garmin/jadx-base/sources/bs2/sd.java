package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Short f20483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Byte f20484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Short f20485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Short f20486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Integer f20487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Integer f20488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Long f20489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Float f20490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Double f20491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Short f20492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Integer f20493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Long f20494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Short f20495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Long f20496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f20497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final BigInteger f20498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f20499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashMap<Integer, Object> f20500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap<Integer, Object> f20501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final HashMap<Integer, Object> f20502v;

    public enum a {
        V1_0(1, 0),
        V2_0(2, 0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20507b;

        a(int i14, int i15) {
            this.f20506a = i14;
            this.f20507b = i15;
        }
    }

    static {
        a aVar = a.V2_0;
        aVar.getClass();
        f20481a = aVar.f20506a;
        f20482b = aVar.f20507b;
        new String();
        Short shDecode = Short.decode("0xFF");
        f20483c = shDecode;
        Byte bValueOf = Byte.valueOf(Ascii.DEL);
        Byte bValueOf2 = Byte.valueOf(UnsignedBytes.MAX_POWER_OF_TWO);
        Byte bDecode = Byte.decode("0x7F");
        f20484d = bDecode;
        Short shDecode2 = Short.decode("0xFF");
        f20485e = shDecode2;
        Short shDecode3 = Short.decode("0x7FFF");
        f20486f = shDecode3;
        Integer numDecode = Integer.decode("0xFFFF");
        Integer numDecode2 = Integer.decode("0");
        Integer numDecode3 = Integer.decode("0xFFFF");
        f20487g = numDecode3;
        Integer numDecode4 = Integer.decode("0x7FFFFFFF");
        f20488h = numDecode4;
        Long lDecode = Long.decode("0xFFFFFFFF");
        Long lDecode2 = Long.decode("0");
        Long lDecode3 = Long.decode("0xFFFFFFFF");
        f20489i = lDecode3;
        String str = new String();
        Float fValueOf = Float.valueOf(Float.intBitsToFloat(-1));
        f20490j = fValueOf;
        Float fValueOf2 = Float.valueOf(Float.MAX_VALUE);
        Float fValueOf3 = Float.valueOf(-3.4028235E38f);
        Double dValueOf = Double.valueOf(Double.longBitsToDouble(-1L));
        f20491k = dValueOf;
        Double dValueOf2 = Double.valueOf(Double.MAX_VALUE);
        Double dValueOf3 = Double.valueOf(-1.7976931348623157E308d);
        Short shDecode4 = Short.decode("0x00");
        f20492l = shDecode4;
        Integer numDecode5 = Integer.decode("0x0000");
        f20493m = numDecode5;
        Long lDecode4 = Long.decode("0xFFFFFFFF");
        Long lDecode5 = Long.decode("0");
        Long lDecode6 = Long.decode("0x00000000");
        f20494n = lDecode6;
        f20495o = (short) 255;
        Long lDecode7 = Long.decode("0x7FFFFFFFFFFFFFFF");
        f20496p = lDecode7;
        BigInteger bigInteger = new BigInteger("FFFFFFFFFFFFFFFF", 16);
        BigInteger bigInteger2 = new BigInteger("00000000000000000");
        BigInteger bigInteger3 = new BigInteger("FFFFFFFFFFFFFFFF", 16);
        f20497q = bigInteger3;
        BigInteger bigInteger4 = new BigInteger("FFFFFFFFFFFFFFFF", 16);
        BigInteger bigInteger5 = new BigInteger("0000000000000000");
        BigInteger bigInteger6 = new BigInteger("0000000000000000", 16);
        f20498r = bigInteger6;
        f20499s = new int[]{1, 1, 1, 2, 2, 4, 4, 1, 4, 8, 1, 2, 4, 1, 8, 8, 8};
        HashMap<Integer, Object> map = new HashMap<>(20);
        f20500t = map;
        map.put(0, shDecode);
        map.put(1, bDecode);
        map.put(2, shDecode2);
        map.put(131, shDecode3);
        map.put(132, numDecode3);
        map.put(133, numDecode4);
        Integer numValueOf = Integer.valueOf(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        map.put(numValueOf, lDecode3);
        map.put(7, str);
        Integer numValueOf2 = Integer.valueOf(SyslogConstants.LOG_LOCAL1);
        map.put(numValueOf2, fValueOf);
        map.put(137, dValueOf);
        map.put(10, shDecode4);
        map.put(139, numDecode5);
        map.put(140, lDecode6);
        map.put(13, (short) 255);
        map.put(142, lDecode7);
        map.put(143, bigInteger3);
        Integer numValueOf3 = Integer.valueOf(SyslogConstants.LOG_LOCAL2);
        map.put(numValueOf3, bigInteger6);
        HashMap<Integer, Object> map2 = new HashMap<>(20);
        f20501u = map2;
        map2.put(0, (short) 0);
        map2.put(1, bValueOf2);
        map2.put(2, (short) 0);
        map2.put(131, Short.MIN_VALUE);
        map2.put(132, numDecode2);
        map2.put(133, Integer.MIN_VALUE);
        map2.put(numValueOf, lDecode2);
        map2.put(numValueOf2, fValueOf3);
        map2.put(137, dValueOf3);
        map2.put(10, (short) 0);
        map2.put(139, 0);
        map2.put(140, lDecode5);
        map2.put(13, (short) 0);
        map2.put(142, Long.MIN_VALUE);
        map2.put(143, bigInteger2);
        map2.put(numValueOf3, bigInteger5);
        HashMap<Integer, Object> map3 = new HashMap<>(20);
        f20502v = map3;
        map3.put(0, (short) 255);
        map3.put(1, bValueOf);
        map3.put(2, (short) 255);
        map3.put(131, Short.MAX_VALUE);
        map3.put(132, numDecode);
        map3.put(133, Integer.MAX_VALUE);
        map3.put(numValueOf, lDecode);
        map3.put(numValueOf2, fValueOf2);
        map3.put(137, dValueOf2);
        map3.put(10, (short) 255);
        map3.put(139, 65535);
        map3.put(140, lDecode4);
        map3.put(13, (short) 255);
        map3.put(142, Long.MAX_VALUE);
        map3.put(143, bigInteger);
        map3.put(numValueOf3, bigInteger4);
    }
}
