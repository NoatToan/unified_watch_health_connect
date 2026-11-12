package com.zjw.m65Acustomdialsdk;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.fas;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u001e\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005J\u0019\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0086 J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012¨\u0006\u0015"}, d2 = {"Lcom/zjw/m65Acustomdialsdk/LzoUtils;", "", "", "src", PluginDeviceInfo.FMODEL, "", "value", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, "i", "index", "Ljava/nio/ByteBuffer;", "dest", "initialPos", "", "length", "src_len", "compress", "", "<init>", "()V", "ZhbraceletSDK_release"}, k = 1, mv = {1, 7, 1})
public final class LzoUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LzoUtils f14564b;

    /* JADX INFO: renamed from: com.zjw.m65Acustomdialsdk.LzoUtils$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/zjw/m65Acustomdialsdk/LzoUtils$a;", "", "Lcom/zjw/m65Acustomdialsdk/LzoUtils;", PluginDeviceInfo.FMODEL, "lzoUtils", "Lcom/zjw/m65Acustomdialsdk/LzoUtils;", "<init>", "()V", "ZhbraceletSDK_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LzoUtils a() {
            if (LzoUtils.f14564b == null) {
                synchronized (LzoUtils.class) {
                    try {
                        if (LzoUtils.f14564b == null) {
                            LzoUtils.f14564b = new LzoUtils();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LzoUtils lzoUtils = LzoUtils.f14564b;
            Intrinsics.checkNotNull(lzoUtils);
            return lzoUtils;
        }
    }

    public LzoUtils() {
        System.loadLibrary("lzo");
    }

    public final byte[] b(int value) {
        return new byte[]{(byte) ((value >> 24) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 8) & 255), (byte) (value & 255)};
    }

    public final byte[] c(int value) {
        return new byte[]{(byte) (value & 255), (byte) ((value >> 8) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 24) & 255)};
    }

    public final native byte[] compress(byte[] src, int src_len);

    public final long[] b() {
        Object[] array = StringsKt__StringsKt.split$default((CharSequence) "281233934,654117070,3236494948,1962469351,2422755260,1962060297,4109789052,2495887132,3349395785,3807498825,4147392729,1338337615,4210607740,4002502406,618644983,3689026186,1737459875,1940712725,3440507702,347392801,1099336126,2615281589,3211314658,694848599,1329212063,3158202680,582062455,3104172638,4125625679,1118998233,474926060,283541754,901605776,918002975,4114895749,1073303182,3506942434,2523966937,2933149395,380654311,3743066953,1095588451,2639237362,988722692,3383765722,1970405101,1340980545,2765116599,3746584330,2104366547,2517091373,2831878279,1946870839,1763425552,2408954115,2286979222,3234308532,3847107231,4076999156,1504655602,1873132995,1871481870,705489870,3459407809,1050329215,1460915055,2486404243,1866191211,1936657029,931955905,1680875607,2482893172,1861172672,1440621832,1229359949,2085064903,3769654547,1933804952,2146248753,606496006,1790000298,1106610020,3023975831,4286056407,2267134510,4005449710,1364627059,1630139823,4008404916,3558536343,3573037851,3398536211,3058757014,2788813225,3901870828,2830785699,3198283787,3586986752,3573333868,658686947,1450613396,477167310,349956514,1838138303,1026037143,2153226209,1760075343,707793082,3053835523,2220503557,421789312,2453937816,1509474315,3180581129,571761322,1712598131,1425984383,4127887183,2112860310,2337309582,906600572,3667222800,436795693,3538776394,3840600302,3472350342,3730709011,1295322472,2933167942,818169416,1811798643,1796022755,1147720715,3560761836,1650671278,2506975123,1424798585,2170194889,1030305067,1429429228,3549763957,602434355,2519947237,358395839,3359139214,3423244534,3189905453,2052708254,2732626332,2956771204,2611102570,1055121406,4181709867,3864969308,2649354756,759631253,2076406079,3306972203,1576473511,3403578673,3920161971,3217700248,3254749128,3603966328,1244883722,633121664,441277445,1675847560,780358057,2889852795,1324818258,2900583189,964625512,1604796583,2679038868,2624878559,422079283,3564716311,1653280699,1714426659,3807116114,3687758937,2996367699,738973898,3610221008,4266608537,4018033122,957261294,388056539,645566222,2928628781,421573883,2368323155,1387175445,3754740926,3955361152,3143971764,2082724353,2207415306,1876323894,1822693170,3388173130,2260364896,2101159392,1905662047,2179291489,1708556750,424531005,2426215910,357172192,1763635124,1946010759,2678178327,3115981619,3770918617,1290086536,2520824205,3042038899,414353200,1601985299,2443601974,3554136038,472298063,3622235860,2384954027,4086521048,2365435015,4011305856,4291139995,2389803319,1634107817,3698052795,3689835849,1146768742,1418596261,4192916740,4127656180,1894463512,2660508101,4289413654,1921300321,4261170937,4232452119,1857592316,2646222278,511052013,945682697,3381683596,659141913,3801415211,2289705036,1841379976,4282181814,3172798148,1971856564,3828682070,2804229525,1282594158,283374847,938584184,3648298964,1098846516,3071587347,3691471520,2061950239,4287816703,4266852197,3058876732,2299679849,509575048,1651019366,2760999125,2715036407,3603788744,956268637,283308606,3295088322,1427589593,4090159415,2013047952,3824421899,3420342478,3740257181,2563893579,2443005206,1694445974,333527421,858093951,283012781,2234441902,1042462242,1117668093,3155948018,2888920921,1630588881,2310000149,3039305972,1091953995,2582521519,3682871310,2683900023,1525644018,3073775873,2124072238,3892083435,1285909563,4184284629,560432198,3458119844,3691631453,2645867771,3095337003,2492987287,4131634899,3719928781,2203283615,4152336757,2834032881,1578453364,950189128,1666641968,582012108,1313192329,1424797300,3433594289,3810623209,3075514454,4282355972,2016267975,2047433384,2144256452,1561522058,2756713858,4283235325,3120181997,3559377474,2319313824,504674466,2617841381,1600396804,2716788073,441642512,2408821910,1561649909,3574011185,598890365,356128985,2725706181,1951732209,2852621813,4193159456,308632723,330678985,996061859,313413425,1384136257,2415065972,1789595637,4257585567,4220917803,1227887628,4267745457,1639516869,4224794590,2111562327,2914304289,572563631,3345924233,3060969032,3539789888,2335503926,1522602443,2040323447,707308852,3654138613,1496191536,496719232,3747826733,691587227,1407621837,384856886,694039390,330661948,1856862383,841040195,2699436131,3814586408,645459538,2233741967,1313940379,731559445,523187335,3495216835,3386524941,2943271479,501117520,1210565532,1471750217,2998176529,3997562999,2842895652,1574091626,2792554505,3668348329,380919429,828851211,3258774550,2870065676,3283968712,1568973046,1166718807,2352655335,2043176084,3397065972,472835984,2519700278,2436128223,830356406,731836187,3459054772,1093291673,2928187062,1960220831,844377193,3107310552,3913427098,3429419170,2367448711,3017365258,569020259,2448946842,3029940182,1756191488,2274029648,1471497035,2464210862,1809501911,1743010057,2604573688,3900011809,2519122695,2652168266,3678636229,2310234369,1306795224,1961829885,3833029811,1425034941,4162757206,2372806688,3691120164,816795649,1924578635,3697322601,1332238721,2516023094,2813051345,2639084321,916572471,1937946051,1566108663,4277642331,2861880478,3345455011,2004366946,587106116,3364399781,2660896641,1588263155,356061316,609990433,364873362,3929344809,1624238036,2702818397,3731479252,311755740,455900393,3082625958,2289401582,1386352060,1946871015,1460088680,464204563,1410984510,1375230316,2712530106,3906256228,3897845556,2552226242,3087765285,1735517719,3512201651,2364487489,2720229794,4094010932,3500863746,2814803577,3110612910,847966071", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        long[] jArr = new long[strArr.length];
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            jArr[i] = Long.parseLong(strArr[i]);
        }
        return jArr;
    }

    public final void a(byte[] src, ByteBuffer dest, int initialPos) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dest, "dest");
        int length = src.length;
        for (int i = 0; i < length; i++) {
            dest.put(initialPos + i, src[i]);
        }
    }

    public final byte[] a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
    }

    public final byte[] a(int i, int index) {
        return a(index == 0 ? i & (-32769) : i | 32768);
    }

    public final byte[] a(byte[] src) {
        byte[] src2 = src;
        int i = 4096;
        Intrinsics.checkNotNullParameter(src2, "src");
        try {
            long[] jArrB = b();
            int length = src2.length % 4096;
            int length2 = src2.length / 4096;
            if (length != 0) {
                length2++;
            }
            int i2 = 26;
            ByteBuffer buffer = ByteBuffer.allocate((length2 * 2) + 26 + src2.length);
            buffer.put(b(-1347440894), 0, 4);
            buffer.put(c(src2.length), 0, 4);
            buffer.put(fas.a(src2, jArrB), 0, 4);
            byte[] bArr = {0, 0, 0, 0};
            buffer.put(bArr, 0, 4);
            buffer.put(bArr, 0, 4);
            buffer.put(bArr, 0, 4);
            buffer.put(a(length2), 0, 2);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(src2.length);
            int i3 = 0;
            int length3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                byteBufferAllocate.clear();
                if (i3 != length2 - 1 || length == 0) {
                    byteBufferAllocate.put(src2, i4, i);
                    i4 += i;
                } else {
                    byteBufferAllocate = ByteBuffer.allocate(length);
                    byteBufferAllocate.put(src2, i4, length);
                    i4 += length;
                }
                byte[] array = byteBufferAllocate.array();
                Intrinsics.checkNotNullExpressionValue(array, "array");
                byte[] bArrCompress = compress(array, array.length);
                int i5 = array.length <= bArrCompress.length ? 1 : 0;
                ByteBuffer byteBuffer = byteBufferAllocate;
                byteBufferAllocate2.put(i5 != 0 ? array : bArrCompress, 0, i5 != 0 ? array.length : bArrCompress.length);
                length3 += i5 != 0 ? array.length : bArrCompress.length;
                buffer.put(a(i5 != 0 ? array.length : bArrCompress.length, i5 ^ 1), 0, 2);
                i2 += 2;
                i3++;
                src2 = src;
                byteBufferAllocate = byteBuffer;
                i = 4096;
            }
            byte[] compressedTotalArray = byteBufferAllocate2.array();
            Intrinsics.checkNotNullExpressionValue(compressedTotalArray, "compressedTotalArray");
            byte[] bArrC = c(a(compressedTotalArray, length3).length);
            Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
            a(bArrC, buffer, 12);
            byte[] bArrA = fas.a(a(compressedTotalArray, length3), jArrB);
            Intrinsics.checkNotNullExpressionValue(bArrA, "getCRCNew32(filterByteAr…TotalPosition), table_32)");
            a(bArrA, buffer, 16);
            buffer.put(compressedTotalArray, 0, compressedTotalArray.length);
            byte[] bArrArray = buffer.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "buffer.array()");
            return a(bArrArray, i2 + length3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final byte[] a(byte[] src, int length) {
        Intrinsics.checkNotNullParameter(src, "src");
        byte[] bArr = new byte[length];
        System.arraycopy(src, 0, bArr, 0, length);
        return bArr;
    }
}
