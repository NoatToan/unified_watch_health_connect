package z4;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lz4/a;", "", "a", "keyCode", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final long A;
    public static final long B;
    public static final long C;
    public static final long D;
    public static final long E;
    public static final long F;
    public static final long G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3769a f202280b = new C3769a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f202281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f202282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f202283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f202284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f202285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f202286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f202287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f202288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f202289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f202290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f202291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f202292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f202293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f202294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f202295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f202296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f202297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f202298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f202299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f202300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f202301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f202302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f202303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f202304z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f202305a;

    static {
        l2.i(0, 1, 2, 3, 3);
        f202281c = f.a(4);
        f.a(259);
        f202282d = f.a(260);
        f202283e = f.a(261);
        l2.i(262, 263, 280, 281, 282);
        f.a(283);
        f.a(5);
        f.a(6);
        f202284f = f.a(19);
        f202285g = f.a(20);
        f202286h = f.a(21);
        f202287i = f.a(22);
        f202288j = f.a(23);
        l2.i(268, 269, 270, 271, 24);
        l2.i(25, 26, 27, 28, 7);
        l2.i(8, 9, 10, 11, 12);
        l2.i(13, 14, 15, 16, 81);
        f.a(69);
        f.a(17);
        f.a(70);
        f.a(18);
        f202289k = f.a(29);
        f.a(30);
        f202290l = f.a(31);
        f.a(32);
        f.a(33);
        f.a(34);
        f.a(35);
        f202291m = f.a(36);
        l2.i(37, 38, 39, 40, 41);
        l2.i(42, 43, 44, 45, 46);
        f.a(47);
        f.a(48);
        f.a(49);
        f202292n = f.a(50);
        f.a(51);
        f202293o = f.a(52);
        f202294p = f.a(53);
        f202295q = f.a(54);
        l2.i(55, 56, 57, 58, 59);
        f.a(60);
        f202296r = f.a(61);
        f202297s = f.a(62);
        f.a(63);
        f.a(64);
        f.a(65);
        f202298t = f.a(66);
        f202299u = f.a(67);
        f202300v = f.a(112);
        f202301w = f.a(111);
        l2.i(113, 114, 115, 116, 117);
        f.a(118);
        f.a(119);
        f.a(120);
        f.a(121);
        f202302x = f.a(122);
        f202303y = f.a(123);
        f202304z = f.a(124);
        A = f.a(277);
        B = f.a(278);
        C = f.a(279);
        f.a(68);
        f.a(71);
        f.a(72);
        f.a(76);
        D = f.a(73);
        l2.i(74, 75, 77, 78, 79);
        f.a(80);
        f.a(82);
        f.a(83);
        f.a(84);
        E = f.a(92);
        F = f.a(93);
        l2.i(94, 95, 96, 97, 98);
        l2.i(99, 100, 101, 102, 103);
        l2.i(104, 105, 106, 107, 108);
        l2.i(109, 110, TsExtractor.TS_PACKET_SIZE, PsExtractor.PRIVATE_STREAM_1, 190);
        l2.i(191, 192, 193, 194, 195);
        l2.i(196, 197, 198, 199, 200);
        l2.i(201, 202, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 125, 131);
        l2.i(132, 133, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_E_AC3, SyslogConstants.LOG_LOCAL1);
        l2.i(137, TsExtractor.TS_STREAM_TYPE_DTS, 139, 140, 141);
        l2.i(142, 143, SyslogConstants.LOG_LOCAL2, 145, 146);
        l2.i(147, 148, 149, 150, 151);
        l2.i(SyslogConstants.LOG_LOCAL3, 153, 154, ModuleDescriptor.MODULE_VERSION, 156);
        f.a(157);
        f.a(158);
        f.a(159);
        G = f.a(SyslogConstants.LOG_LOCAL4);
        l2.i(161, 162, 163, 126, 127);
        l2.i(85, 86, 130, 87, 88);
        l2.i(89, 90, 128, 222, 129);
        l2.i(226, 272, 273, 274, 275);
        l2.i(91, 164, 165, 166, 167);
        l2.i(168, 169, 170, 171, TsExtractor.TS_STREAM_TYPE_AC4);
        l2.i(173, 174, 175, SyslogConstants.LOG_LOCAL6, 177);
        l2.i(178, 179, 180, 181, 182);
        l2.i(183, SyslogConstants.LOG_LOCAL7, 185, 186, 187);
        l2.i(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 208);
        l2.i(209, 210, 211, 212, 213);
        l2.i(214, 215, 216, 217, 218);
        l2.i(219, 220, 221, 223, 224);
        l2.i(276, 225, 229, 230, 231);
        l2.i(232, 233, 234, 235, 236);
        l2.i(237, 238, 239, PsExtractor.VIDEO_STREAM_MASK, 241);
        l2.i(242, 243, 244, 245, 246);
        l2.i(247, 248, 249, 250, 251);
        l2.i(252, 253, 254, 255, 256);
        l2.i(TsExtractor.TS_STREAM_TYPE_AIT, 258, 264, 265, 266);
        l2.i(267, 284, 285, 286, 287);
        l2.i(288, -1000000001, -1000000002, -1000000003, -1000000004);
        l2.i(-1000000005, -1000000006, -1000000007, -1000000008, -1000000009);
        f.a(-1000000010);
    }

    public static final boolean a(long j8, long j14) {
        return j8 == j14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f202305a == ((a) obj).f202305a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f202305a);
    }

    public final String toString() {
        return org.apache.commons.lang3.e.e(this.f202305a, "Key code: ");
    }

    /* JADX INFO: renamed from: z4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz4/a$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3769a {
        public /* synthetic */ C3769a(j jVar) {
            this();
        }

        private C3769a() {
        }
    }
}
