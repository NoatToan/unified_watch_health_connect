package defpackage;

import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class x4i {
    public static final String[] c;
    public static final Map<String, Integer> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final apr f38684a = apr.C(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f38685b;

    public enum a {
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
        public final int f38688a;

        a(int i) {
            this.f38688a = i;
        }
    }

    static {
        String[] strArr = {".notdef", ".null", "nonmarkingreturn", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", "A", c.f13755a, "C", "D", "E", "F", "G", c.f13756b, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, e.f13808a, "m", "n", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "q", "r", "s", DeviceTagInterface.CUSTOM_TAG_TYPE, "u", "v", Constants.DEVICE_TYPE_WEAR, "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "Adieresis", "Aring", "Ccedilla", "Eacute", "Ntilde", "Odieresis", "Udieresis", "aacute", "agrave", "acircumflex", "adieresis", "atilde", "aring", "ccedilla", "eacute", "egrave", "ecircumflex", "edieresis", "iacute", "igrave", "icircumflex", "idieresis", "ntilde", "oacute", "ograve", "ocircumflex", "odieresis", "otilde", "uacute", "ugrave", "ucircumflex", "udieresis", "dagger", "degree", "cent", "sterling", "section", "bullet", "paragraph", "germandbls", "registered", "copyright", "trademark", "acute", "dieresis", "notequal", "AE", "Oslash", "infinity", "plusminus", "lessequal", "greaterequal", "yen", "mu", "partialdiff", "summation", "product", "pi", "integral", "ordfeminine", "ordmasculine", "Omega", "ae", "oslash", "questiondown", "exclamdown", "logicalnot", "radical", "florin", "approxequal", "Delta", "guillemotleft", "guillemotright", "ellipsis", "nonbreakingspace", "Agrave", "Atilde", "Otilde", "OE", "oe", "endash", "emdash", "quotedblleft", "quotedblright", "quoteleft", "quoteright", "divide", "lozenge", "ydieresis", "Ydieresis", "fraction", "currency", "guilsinglleft", "guilsinglright", "fi", "fl", "daggerdbl", "periodcentered", "quotesinglbase", "quotedblbase", "perthousand", "Acircumflex", "Ecircumflex", "Aacute", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Oacute", "Ocircumflex", "apple", "Ograve", "Uacute", "Ucircumflex", "Ugrave", "dotlessi", "circumflex", "tilde", "macron", "breve", "dotaccent", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "Lslash", "lslash", "Scaron", "scaron", "Zcaron", "zcaron", "brokenbar", "Eth", "eth", "Yacute", "yacute", "Thorn", "thorn", "minus", "multiply", "onesuperior", "twosuperior", "threesuperior", "onehalf", "onequarter", "threequarters", "franc", "Gbreve", "gbreve", "Idotaccent", "Scedilla", "scedilla", "Cacute", "cacute", "Ccaron", "ccaron", "dcroat"};
        c = strArr;
        d = c(strArr);
    }

    public static Map<String, Integer> c(String[] strArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i], Integer.valueOf(i));
        }
        return map;
    }

    public jgj a() {
        int i;
        if (this.f38685b == null) {
            return this.f38684a;
        }
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = this.f38685b.size();
        int i2 = SportSummary.VERSION_102;
        for (String str : this.f38685b) {
            Map<String, Integer> map = d;
            if (map.containsKey(str)) {
                int iIntValue = map.get(str).intValue();
                i = i2;
                i2 = iIntValue;
            } else {
                i = i2 + 1;
                byteArrayOutputStream.write(str.length());
                try {
                    byteArrayOutputStream.write(str.getBytes("ISO-8859-1"));
                } catch (UnsupportedEncodingException unused) {
                } catch (IOException e) {
                    throw new RuntimeException("Unable to write post table data", e);
                }
            }
            arrayList.add(Integer.valueOf(i2));
            i2 = i;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        apr aprVarC = apr.C((size * 2) + 34 + byteArray.length);
        this.f38684a.j(aprVarC);
        aprVarC.J(a.version.f38688a, 131072);
        aprVarC.Q(a.numberOfGlyphs.f38688a, size);
        int iQ = a.glyphNameIndex.f38688a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iQ += aprVarC.Q(iQ, ((Integer) it.next()).intValue());
        }
        if (byteArray.length > 0) {
            aprVarC.I(iQ, byteArray, 0, byteArray.length);
        }
        return aprVarC;
    }

    public void b(w4i w4iVar) {
        w4iVar.f().A(0, 32).j(this.f38684a);
    }

    public void d(List<String> list) {
        this.f38685b = list;
    }
}
