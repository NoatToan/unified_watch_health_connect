package defpackage;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.constant.MimeType;
import com.huawei.pluginfitnessadvice.FitWorkout;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class zuz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f54595c = new int[0];
    private static final Map<Integer, e> e = new ConcurrentHashMap();

    static {
        c(0, "text/plain", "txt", true);
        a(16, "application/cose; cose-type=\"cose-encrypt0\"", "cbor");
        a(17, "application/cose; cose-type=\"cose-mac0\"", "cbor");
        a(18, "application/cose; cose-type=\"cose-sign1\"", "cbor");
        a(19, "application/ace+cbor", "cbor");
        a(21, MimeType.GIF, MetaCreativeType.GIF);
        a(22, "image/jpeg", "jpeg");
        a(23, "image/png", "png");
        c(40, "application/link-format", "wlnk", false);
        c(41, "application/xml", "xml", false);
        a(42, FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM, NavigationFileParser.BIN);
        c(46, "application/xmpp+xml", "xmpp", false);
        a(47, "application/exi", "exi");
        c(50, "application/json", "json", false);
        c(51, "application/json-patch+json", "json", false);
        c(52, "application/merge-patch+json", "json", false);
        a(60, "application/cbor", "cbor");
        a(61, "application/cwt", "cwt");
        a(62, "application/multipart-core", "part");
        a(63, "application/cbor-seq", "cbor");
        a(96, "application/cose; cose-type=\"cose-encrypt\"", "cbor");
        a(97, "application/cose; cose-type=\"cose-mac\"", "cbor");
        a(98, "application/cose; cose-type=\"cose-sign\"", "cbor");
        a(101, "application/cose-key", "cbor");
        a(102, "application/cose-key-set", "cbor");
        c(110, "application/senml+json", "json", false);
        c(111, "application/sensml+json", "json", false);
        a(112, "application/senml+cbor", "cbor");
        a(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, "application/sensml+cbor", "cbor");
        a(114, "application/senml+exi", "exi");
        a(115, "application/sensml+exi", "exi");
        c(256, "application/coap-group+json", "json", false);
        a(OldToNewMotionPath.SPORT_TYPE_BASKETBALL, "application/dots+cbor", "cbor");
        a(272, "application/missing-blocks+cbor-seq", "cbor");
        a(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, "application/pkcs7-mime; smime-type=\"server-generated-key\"", "pkcs");
        a(281, "application/pkcs7-mime; smime-type=\"certs-only\"", "pkcs");
        a(FitWorkout.CATEGORY_REAL_SCENE, "application/pkcs8", "pkcs");
        a(285, "application/csattrs", "csattrs");
        a(286, "application/pkcs10", "pkcs");
        a(287, "application/pkix-cert", "pkix");
        c(310, "application/senml+xml", "xml", false);
        c(311, "application/sensml+xml", "xml", false);
        c(GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, "application/senml-etch+json", "json", false);
        a(322, "application/senml-etch+cbor", "cbor");
        c(ErrorCode.ERROR_CODE_NO_PACKAGE, "application/td+json", "json", false);
        a(10000, "application/vnd.ocf+cbor", "cbor");
        a(10001, "application/oscore", "oscore");
        c(10002, "application/javascript", "js", false);
        a(11542, "application/vnd.oma.lwm2m+tlv", "tlv");
        c(11543, "application/vnd.oma.lwm2m+json", "json", false);
        a(11544, "application/vnd.oma.lwm2m+cbor", "cbor");
        c(20000, "text/css", "css", false);
        c(30000, "image/svg+xml", "xml", false);
    }

    public static boolean d(int i) {
        e eVar = e.get(Integer.valueOf(i));
        if (eVar != null) {
            return eVar.c();
        }
        return false;
    }

    public static String[] d(String str) {
        if (str == null) {
            throw new NullPointerException("mime must not be null!");
        }
        String[] strArr = new String[2];
        String[] strArrSplit = str.split(";", 2);
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            strArr[i] = strTrim;
            if (strTrim.isEmpty()) {
                strArr[i] = null;
            }
        }
        return strArr;
    }

    public static String a(int i) {
        if (i == -1) {
            return "undefined";
        }
        e eVar = e.get(Integer.valueOf(i));
        if (eVar != null) {
            return eVar.e();
        }
        return "unknown/" + i;
    }

    private static void a(int i, String str, String str2) {
        c(new e(Integer.valueOf(i), str, str2));
    }

    private static void c(int i, String str, String str2, boolean z) {
        c(new e(Integer.valueOf(i), str, str2, z));
    }

    public static void c(e eVar) {
        e.put(eVar.b(), eVar);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f54596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f54597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f54598c;
        private final String d;
        private final String e;
        private final Integer g;
        private final String h;

        public e(Integer num, String str, String str2) {
            if (num == null) {
                throw new NullPointerException("type must not be null!");
            }
            if (str == null) {
                throw new NullPointerException("mime must not be null!");
            }
            if (str2 == null) {
                throw new NullPointerException("file extension must not be null!");
            }
            this.g = num;
            this.f54596a = str;
            String[] strArrD = zuz.d(str);
            this.h = strArrD[0];
            this.d = strArrD[1];
            this.e = str2;
            this.f54597b = false;
            this.f54598c = false;
        }

        public e(Integer num, String str, String str2, boolean z) {
            if (num == null) {
                throw new NullPointerException("type must not be null!");
            }
            if (str == null) {
                throw new NullPointerException("mime must not be null!");
            }
            if (str2 == null) {
                throw new NullPointerException("file extension must not be null!");
            }
            this.g = num;
            this.f54596a = str;
            String[] strArrD = zuz.d(str);
            this.h = strArrD[0];
            this.d = strArrD[1];
            this.e = str2;
            this.f54597b = true;
            this.f54598c = z;
        }

        public Integer b() {
            return this.g;
        }

        public String e() {
            return this.f54596a;
        }

        public boolean c() {
            return this.f54597b;
        }
    }
}
