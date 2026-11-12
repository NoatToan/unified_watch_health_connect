package defpackage;

import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class w4i extends dzo {
    public static final String[] d = {".notdef", ".null", "nonmarkingreturn", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", "A", com.xiaomi.onetrack.api.c.f13755a, "C", "D", "E", "F", "G", com.xiaomi.onetrack.api.c.f13756b, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, e.f13808a, "m", "n", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "q", "r", "s", DeviceTagInterface.CUSTOM_TAG_TYPE, "u", "v", Constants.DEVICE_TYPE_WEAR, "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "Adieresis", "Aring", "Ccedilla", "Eacute", "Ntilde", "Odieresis", "Udieresis", "aacute", "agrave", "acircumflex", "adieresis", "atilde", "aring", "ccedilla", "eacute", "egrave", "ecircumflex", "edieresis", "iacute", "igrave", "icircumflex", "idieresis", "ntilde", "oacute", "ograve", "ocircumflex", "odieresis", "otilde", "uacute", "ugrave", "ucircumflex", "udieresis", "dagger", "degree", "cent", "sterling", "section", "bullet", "paragraph", "germandbls", "registered", "copyright", "trademark", "acute", "dieresis", "notequal", "AE", "Oslash", "infinity", "plusminus", "lessequal", "greaterequal", "yen", "mu", "partialdiff", "summation", "product", "pi", "integral", "ordfeminine", "ordmasculine", "Omega", "ae", "oslash", "questiondown", "exclamdown", "logicalnot", "radical", "florin", "approxequal", "Delta", "guillemotleft", "guillemotright", "ellipsis", "nonbreakingspace", "Agrave", "Atilde", "Otilde", "OE", "oe", "endash", "emdash", "quotedblleft", "quotedblright", "quoteleft", "quoteright", "divide", "lozenge", "ydieresis", "Ydieresis", "fraction", "currency", "guilsinglleft", "guilsinglright", "fi", "fl", "daggerdbl", "periodcentered", "quotesinglbase", "quotedblbase", "perthousand", "Acircumflex", "Ecircumflex", "Aacute", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Oacute", "Ocircumflex", "apple", "Ograve", "Uacute", "Ucircumflex", "Ugrave", "dotlessi", "circumflex", "tilde", "macron", "breve", "dotaccent", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "Lslash", "lslash", "Scaron", "scaron", "Zcaron", "zcaron", "brokenbar", "Eth", "eth", "Yacute", "yacute", "Thorn", "thorn", "minus", "multiply", "onesuperior", "twosuperior", "threesuperior", "onehalf", "onequarter", "threequarters", "franc", "Gbreve", "gbreve", "Idotaccent", "Scedilla", "scedilla", "Cacute", "cacute", "Ccaron", "ccaron", "dcroat"};
    public AtomicReference<List<String>> c;

    public static class b extends fzo<w4i> {
        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public w4i o(jgj jgjVar) {
            return new w4i(u(), jgjVar);
        }
    }

    public enum c {
        version(0),
        italicAngle(4),
        underlinePosition(8),
        underlineThickness(10),
        isFixedPitch(12),
        minMemType42(16),
        maxMemType42(20),
        minMemType1(24),
        maxMemType1(28),
        numberOfGlyphs(32),
        glyphNameIndex(34);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37613a;

        c(int i) {
            this.f37613a = i;
        }
    }

    public final List<String> l() {
        List<String> listQ = this.c.get();
        if (listQ == null && r() == 131072) {
            synchronized (this.c) {
                try {
                    listQ = this.c.get();
                    if (listQ == null) {
                        listQ = q();
                        d8i.a(this.c, null, listQ);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return listQ;
    }

    public String m(int i) {
        int iO = o();
        if (iO > 0 && (i < 0 || i >= iO)) {
            throw new IndexOutOfBoundsException();
        }
        if (r() != 65536) {
            if (r() != 131072) {
                return null;
            }
            i = this.f39611a.v(c.glyphNameIndex.f37613a + (i * 2));
        }
        return i < 258 ? d[i] : l().get(i - SportSummary.VERSION_102);
    }

    public int o() {
        if (r() == 65536) {
            return SportSummary.VERSION_102;
        }
        if (r() == 131072) {
            return this.f39611a.v(c.numberOfGlyphs.f37613a);
        }
        return -1;
    }

    public final List<String> q() {
        if (r() != 131072) {
            if (r() != 65536) {
                return null;
            }
            throw new IllegalStateException("Not meaningful to parse version 1 table");
        }
        ArrayList arrayList = new ArrayList();
        int i = c.glyphNameIndex.f37613a;
        int iO = o() * 2;
        while (true) {
            i += iO;
            if (i >= e()) {
                return arrayList;
            }
            int iS = this.f39611a.s(i);
            byte[] bArr = new byte[iS];
            this.f39611a.n(i + 1, bArr, 0, iS);
            try {
                arrayList.add(new String(bArr, "ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
            }
            iO = iS + 1;
        }
    }

    public int r() {
        return this.f39611a.p(c.version.f37613a);
    }

    public w4i(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
        this.c = new AtomicReference<>();
    }
}
