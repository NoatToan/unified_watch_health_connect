package com.google.android.gms.common.server.response;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import tn.k;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', CoreConstants.DOUBLE_QUOTE_CHAR};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', CoreConstants.DOUBLE_QUOTE_CHAR};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb3, char[] cArr2) throws ParseException, IOException {
        sb3.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            int i14 = bufferedReader.read(cArr);
            if (i14 == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            int i15 = 0;
            while (i15 < i14) {
                char c14 = cArr[i15];
                if (Character.isISOControl(c14) && (cArr2 == null || cArr2[0] != c14)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i16 = i15 + 1;
                if (c14 != '\"') {
                    if (c14 == '\\') {
                        z14 = !z14;
                        z15 = true;
                    }
                    i15 = i16;
                } else if (!z14) {
                    sb3.append(cArr, 0, i15);
                    bufferedReader.reset();
                    bufferedReader.skip(i16);
                    return z15 ? JsonUtils.unescapeString(sb3.toString()) : sb3.toString();
                }
                z14 = false;
                i15 = i16;
            }
            sb3.append(cArr, 0, i14);
            bufferedReader.mark(cArr.length);
        }
    }

    private final char zai(BufferedReader bufferedReader) {
        char[] cArr;
        if (bufferedReader.read(this.zao) != -1) {
            do {
                boolean zIsWhitespace = Character.isWhitespace(this.zao[0]);
                cArr = this.zao;
                if (!zIsWhitespace) {
                    return cArr[0];
                }
            } while (bufferedReader.read(cArr) != -1);
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i14;
        int i15;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c14 = cArr[0];
        int i16 = c14 == '-' ? Integer.MIN_VALUE : BleCommunicationException.UNSPECIFIED_FAILURE;
        int i17 = c14 == '-' ? 1 : 0;
        if (i17 < iZam) {
            i15 = i17 + 1;
            int iDigit = Character.digit(cArr[i17], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i14 = -iDigit;
        } else {
            i14 = 0;
            i15 = i17;
        }
        while (i15 < iZam) {
            int i18 = i15 + 1;
            int iDigit2 = Character.digit(cArr[i15], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i14 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i19 = i14 * 10;
            if (i19 < i16 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i14 = i19 - iDigit2;
            i15 = i18;
        }
        if (i17 == 0) {
            return -i14;
        }
        if (i15 > 1) {
            return i14;
        }
        throw new ParseException("No digits to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i14;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i14 = 0;
            boolean z14 = false;
            while (i14 < 1024 && bufferedReader.read(cArr, i14, 1) != -1) {
                char c14 = cArr[i14];
                if (Character.isISOControl(c14)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i15 = i14 + 1;
                if (c14 != '\"') {
                    if (c14 == '\\') {
                        z14 = !z14;
                    }
                    i14 = i15;
                } else if (!z14) {
                    bufferedReader.reset();
                    bufferedReader.skip(i15);
                    return i14;
                }
                z14 = false;
                i14 = i15;
            }
        } else {
            cArr[0] = cZai;
            i14 = 1;
            while (i14 < 1024 && bufferedReader.read(cArr, i14, 1) != -1) {
                char c15 = cArr[i14];
                if (c15 == '}' || c15 == ',' || Character.isWhitespace(c15) || cArr[i14] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i14 - 1);
                    cArr[i14] = 0;
                    return i14;
                }
                i14++;
            }
        }
        if (i14 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j8;
        int i14;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c14 = cArr[0];
        long j14 = c14 == '-' ? Long.MIN_VALUE : C.TIME_UNSET;
        int i15 = c14 == '-' ? 1 : 0;
        int i16 = 10;
        if (i15 < iZam) {
            i14 = i15 + 1;
            int iDigit = Character.digit(cArr[i15], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j8 = -iDigit;
        } else {
            j8 = 0;
            i14 = i15;
        }
        while (i14 < iZam) {
            int i17 = i14 + 1;
            int iDigit2 = Character.digit(cArr[i14], i16);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j8 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j15 = j8 * 10;
            long j16 = j14;
            long j17 = iDigit2;
            if (j15 < j16 + j17) {
                throw new ParseException("Number too large");
            }
            j8 = j15 - j17;
            i14 = i17;
            j14 = j16;
            i16 = 10;
        }
        if (i15 == 0) {
            return -j8;
        }
        if (i14 > 1) {
            return j8;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb3, char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb3, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai != ']') {
            if (cZai != '}') {
                throw new ParseException(k.f("Unexpected token: ", cZai));
            }
            zaw(2);
            return null;
        }
        zaw(2);
        zaw(1);
        zaw(5);
        return null;
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i14 = 1;
        if (cZai != '\"') {
            if (cZai == ',') {
                throw new ParseException("Missing value");
            }
            if (cZai == '[') {
                this.zat.push(5);
                bufferedReader.mark(32);
                if (zai(bufferedReader) == ']') {
                    zaw(5);
                } else {
                    bufferedReader.reset();
                    boolean z14 = false;
                    boolean z15 = false;
                    while (i14 > 0) {
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cZai2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cZai2 == '\"') {
                            if (!z15) {
                                z14 = !z14;
                            }
                            cZai2 = '\"';
                        }
                        if (cZai2 == '[') {
                            if (!z14) {
                                i14++;
                            }
                            cZai2 = '[';
                        }
                        if (cZai2 == ']' && !z14) {
                            i14--;
                        }
                        z15 = (cZai2 == '\\' && z14) ? !z15 : false;
                    }
                    zaw(5);
                }
            } else if (cZai != '{') {
                bufferedReader.reset();
                zam(bufferedReader, this.zaq);
            } else {
                this.zat.push(1);
                bufferedReader.mark(32);
                char cZai3 = zai(bufferedReader);
                if (cZai3 == '}') {
                    zaw(1);
                } else {
                    if (cZai3 != '\"') {
                        throw new ParseException(k.f("Unexpected token ", cZai3));
                    }
                    bufferedReader.reset();
                    zaq(bufferedReader);
                    while (zar(bufferedReader) != null) {
                    }
                    zaw(1);
                }
            }
        } else {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c14 = this.zao[0];
            boolean z16 = false;
            while (true) {
                if (c14 == '\"') {
                    if (!z16) {
                        break;
                    }
                    z16 = true;
                    c14 = '\"';
                }
                z16 = c14 == '\\' ? !z16 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c14 = this.zao[0];
                if (Character.isISOControl(c14)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 != '}') {
            throw new ParseException(k.f("Unexpected token ", cZai4));
        }
        zaw(2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new ParseException(k.f("Unexpected token: ", cZai));
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 != ']') {
                        throw new ParseException(k.f("Unexpected token: ", cZai2));
                    }
                    zaw(5);
                    return arrayList;
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e4) {
                throw new ParseException("Error instantiating inner object", e4);
            } catch (InstantiationException e14) {
                throw new ParseException("Error instantiating inner object", e14);
            }
        }
    }

    private final void zaw(int i14) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException(e0.f(i14, "Expected state ", " but had empty stack"));
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue != i14) {
            throw new ParseException(k.e(i14, iIntValue, "Expected state ", " but had "));
        }
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i14 = 0;
        while (true) {
            int length = cArr.length;
            if (i14 >= length) {
                return;
            }
            int i15 = bufferedReader.read(this.zap, 0, length - i14);
            if (i15 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i16 = 0; i16 < i15; i16++) {
                if (cArr[i16 + i14] != this.zap[i16]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i14 += i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z14) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z14) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z14 ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai != 't') {
            throw new ParseException(k.f("Unexpected token: ", cZai));
        }
        zax(bufferedReader, z14 ? zac : zab);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x024a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i14;
        HashMap map;
        char cZai;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strZaq = zaq(bufferedReader);
        if (strZaq == null) {
            zaw(1);
            return false;
        }
        while (strZaq != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaq);
            if (field == null) {
                strZaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i15 = field.zaa;
                switch (i15) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        } else {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        } else {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        } else {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        } else {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        } else {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        } else {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 6:
                        if (field.zab) {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        } else {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        } else {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 9:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 10:
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 'n') {
                            zax(bufferedReader, zaa);
                            map = null;
                        } else {
                            if (cZai2 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            map = new HashMap();
                            while (true) {
                                char cZai3 = zai(bufferedReader);
                                if (cZai3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cZai3 == '\"') {
                                    String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new ParseException("No map value found for key ".concat(String.valueOf(strZaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new ParseException("Expected String value for key ".concat(String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char cZai4 = zai(bufferedReader);
                                    if (cZai4 != ',') {
                                        if (cZai4 != '}') {
                                            throw new ParseException(k.f("Unexpected character while parsing string map: ", cZai4));
                                        }
                                        zaw(1);
                                    }
                                } else if (cZai3 == '}') {
                                    zaw(1);
                                }
                                i14 = 4;
                                zaw(i14);
                                zaw(2);
                                cZai = zai(bufferedReader);
                                if (cZai == ',') {
                                    strZaq = zaq(bufferedReader);
                                } else {
                                    if (cZai != '}') {
                                        throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                                    }
                                    strZaq = null;
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    case 11:
                        if (!field.zab) {
                            char cZai5 = zai(bufferedReader);
                            if (cZai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.zat.push(1);
                                if (cZai5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    zaz(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZad);
                                } catch (IllegalAccessException e4) {
                                    throw new ParseException("Error instantiating inner object", e4);
                                } catch (InstantiationException e14) {
                                    throw new ParseException("Error instantiating inner object", e14);
                                }
                            }
                            break;
                        } else {
                            char cZai6 = zai(bufferedReader);
                            if (cZai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.zat.push(5);
                                if (cZai6 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        }
                        i14 = 4;
                        zaw(i14);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException(k.f("Expected end of object or field separator, but found: ", cZai));
                            }
                            strZaq = null;
                        }
                        break;
                    default:
                        throw new ParseException(j.h(i15, "Invalid field type "));
                }
            }
        }
        zaw(1);
        return true;
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t7) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t7.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t7.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t7);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } catch (IOException e4) {
                throw new ParseException(e4);
            }
        } catch (Throwable th3) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th3;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str, Throwable th3) {
            super("Error instantiating inner object", th3);
        }

        public ParseException(String str) {
            super(str);
        }

        public ParseException(Throwable th3) {
            super(th3);
        }
    }
}
