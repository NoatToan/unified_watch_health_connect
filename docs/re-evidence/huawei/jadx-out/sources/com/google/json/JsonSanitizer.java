package com.google.json;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.google.common.base.Ascii;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.operation.utils.Constants;
import java.math.BigInteger;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes.dex */
public final class JsonSanitizer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_NESTING_DEPTH = 64;
    private static final int[] DIGITS_BY_BASE_THAT_FIT_IN_63B;
    private static final char[] HEX_DIGITS;
    public static final int MAXIMUM_NESTING_DEPTH = 4096;
    private static final boolean SUPER_VERBOSE_AND_SLOW_LOGGING = false;
    private static final UnbracketedComma UNBRACKETED_COMMA;
    private int bracketDepth;
    private int cleaned;
    private boolean[] isMap;
    private final String jsonish;
    private final int maximumNestingDepth;
    private StringBuilder sanitizedJson;

    /* JADX INFO: loaded from: classes2.dex */
    enum State {
        START_ARRAY,
        BEFORE_ELEMENT,
        AFTER_ELEMENT,
        START_MAP,
        BEFORE_KEY,
        AFTER_KEY,
        BEFORE_VALUE,
        AFTER_VALUE
    }

    private static int hexVal(char c2) {
        int i = c2 | ' ';
        return i - (i <= 57 ? 48 : 87);
    }

    private static boolean isHex(char c2) {
        if ('0' <= c2 && c2 <= '9') {
            return true;
        }
        int i = c2 | ' ';
        return 97 <= i && i <= 102;
    }

    private static boolean isOct(char c2) {
        return '0' <= c2 && c2 <= '7';
    }

    public static String sanitize(String str) {
        return sanitize(str, 64);
    }

    public static String sanitize(String str, int i) {
        JsonSanitizer jsonSanitizer = new JsonSanitizer(str, i);
        jsonSanitizer.sanitize();
        return jsonSanitizer.toString();
    }

    JsonSanitizer(String str) {
        this(str, 64);
    }

    JsonSanitizer(String str, int i) {
        this.maximumNestingDepth = Math.min(Math.max(1, i), 4096);
        this.jsonish = str == null ? Constants.NULL : str;
    }

    int getMaximumNestingDepth() {
        return this.maximumNestingDepth;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131 A[Catch: UnbracketedComma -> 0x0235, TryCatch #1 {UnbracketedComma -> 0x0235, blocks: (B:5:0x001e, B:26:0x0050, B:32:0x006b, B:49:0x0093, B:51:0x009e, B:52:0x00a5, B:62:0x00b9, B:69:0x00c8, B:72:0x00cf, B:74:0x00d4, B:76:0x00de, B:77:0x00e0, B:79:0x00e4, B:81:0x00eb, B:87:0x0106, B:82:0x00f2, B:84:0x00f8, B:86:0x00fe, B:28:0x0055, B:173:0x021c, B:88:0x010a, B:90:0x010e, B:91:0x0119, B:103:0x0138, B:108:0x014a, B:109:0x014f, B:111:0x0153, B:114:0x015c, B:115:0x015f, B:100:0x012d, B:101:0x0131, B:102:0x0135, B:118:0x0165, B:120:0x016e, B:124:0x0179, B:126:0x0185, B:127:0x0189, B:128:0x018d, B:130:0x0192, B:131:0x0196, B:132:0x019d, B:134:0x01a2, B:138:0x01af, B:140:0x01b3, B:149:0x01ca, B:157:0x01e6, B:150:0x01cd, B:152:0x01d1, B:153:0x01d3, B:155:0x01dc, B:159:0x01e9, B:160:0x01ef, B:162:0x01f4, B:163:0x01fc, B:165:0x0200, B:166:0x0203, B:167:0x0206, B:168:0x020c, B:169:0x0212, B:170:0x0218, B:171:0x021a), top: B:220:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0135 A[Catch: UnbracketedComma -> 0x0235, TryCatch #1 {UnbracketedComma -> 0x0235, blocks: (B:5:0x001e, B:26:0x0050, B:32:0x006b, B:49:0x0093, B:51:0x009e, B:52:0x00a5, B:62:0x00b9, B:69:0x00c8, B:72:0x00cf, B:74:0x00d4, B:76:0x00de, B:77:0x00e0, B:79:0x00e4, B:81:0x00eb, B:87:0x0106, B:82:0x00f2, B:84:0x00f8, B:86:0x00fe, B:28:0x0055, B:173:0x021c, B:88:0x010a, B:90:0x010e, B:91:0x0119, B:103:0x0138, B:108:0x014a, B:109:0x014f, B:111:0x0153, B:114:0x015c, B:115:0x015f, B:100:0x012d, B:101:0x0131, B:102:0x0135, B:118:0x0165, B:120:0x016e, B:124:0x0179, B:126:0x0185, B:127:0x0189, B:128:0x018d, B:130:0x0192, B:131:0x0196, B:132:0x019d, B:134:0x01a2, B:138:0x01af, B:140:0x01b3, B:149:0x01ca, B:157:0x01e6, B:150:0x01cd, B:152:0x01d1, B:153:0x01d3, B:155:0x01dc, B:159:0x01e9, B:160:0x01ef, B:162:0x01f4, B:163:0x01fc, B:165:0x0200, B:166:0x0203, B:167:0x0206, B:168:0x020c, B:169:0x0212, B:170:0x0218, B:171:0x021a), top: B:220:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a A[Catch: UnbracketedComma -> 0x0235, TryCatch #1 {UnbracketedComma -> 0x0235, blocks: (B:5:0x001e, B:26:0x0050, B:32:0x006b, B:49:0x0093, B:51:0x009e, B:52:0x00a5, B:62:0x00b9, B:69:0x00c8, B:72:0x00cf, B:74:0x00d4, B:76:0x00de, B:77:0x00e0, B:79:0x00e4, B:81:0x00eb, B:87:0x0106, B:82:0x00f2, B:84:0x00f8, B:86:0x00fe, B:28:0x0055, B:173:0x021c, B:88:0x010a, B:90:0x010e, B:91:0x0119, B:103:0x0138, B:108:0x014a, B:109:0x014f, B:111:0x0153, B:114:0x015c, B:115:0x015f, B:100:0x012d, B:101:0x0131, B:102:0x0135, B:118:0x0165, B:120:0x016e, B:124:0x0179, B:126:0x0185, B:127:0x0189, B:128:0x018d, B:130:0x0192, B:131:0x0196, B:132:0x019d, B:134:0x01a2, B:138:0x01af, B:140:0x01b3, B:149:0x01ca, B:157:0x01e6, B:150:0x01cd, B:152:0x01d1, B:153:0x01d3, B:155:0x01dc, B:159:0x01e9, B:160:0x01ef, B:162:0x01f4, B:163:0x01fc, B:165:0x0200, B:166:0x0203, B:167:0x0206, B:168:0x020c, B:169:0x0212, B:170:0x0218, B:171:0x021a), top: B:220:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:115:0x015f A[Catch: UnbracketedComma -> 0x0235, TryCatch #1 {UnbracketedComma -> 0x0235, blocks: (B:5:0x001e, B:26:0x0050, B:32:0x006b, B:49:0x0093, B:51:0x009e, B:52:0x00a5, B:62:0x00b9, B:69:0x00c8, B:72:0x00cf, B:74:0x00d4, B:76:0x00de, B:77:0x00e0, B:79:0x00e4, B:81:0x00eb, B:87:0x0106, B:82:0x00f2, B:84:0x00f8, B:86:0x00fe, B:28:0x0055, B:173:0x021c, B:88:0x010a, B:90:0x010e, B:91:0x0119, B:103:0x0138, B:108:0x014a, B:109:0x014f, B:111:0x0153, B:114:0x015c, B:115:0x015f, B:100:0x012d, B:101:0x0131, B:102:0x0135, B:118:0x0165, B:120:0x016e, B:124:0x0179, B:126:0x0185, B:127:0x0189, B:128:0x018d, B:130:0x0192, B:131:0x0196, B:132:0x019d, B:134:0x01a2, B:138:0x01af, B:140:0x01b3, B:149:0x01ca, B:157:0x01e6, B:150:0x01cd, B:152:0x01d1, B:153:0x01d3, B:155:0x01dc, B:159:0x01e9, B:160:0x01ef, B:162:0x01f4, B:163:0x01fc, B:165:0x0200, B:166:0x0203, B:167:0x0206, B:168:0x020c, B:169:0x0212, B:170:0x0218, B:171:0x021a), top: B:220:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0242  */
    /* JADX WARN: Code duplicated, block: B:188:0x024f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0255  */
    /* JADX WARN: Code duplicated, block: B:196:0x0261  */
    /* JADX WARN: Code duplicated, block: B:199:0x0280  */
    /* JADX WARN: Code duplicated, block: B:201:0x0283  */
    /* JADX WARN: Code duplicated, block: B:207:0x0290  */
    /* JADX WARN: Code duplicated, block: B:208:0x0294  */
    /* JADX WARN: Code duplicated, block: B:211:0x029d  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:222:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x010a A[Catch: UnbracketedComma -> 0x0235, TryCatch #1 {UnbracketedComma -> 0x0235, blocks: (B:5:0x001e, B:26:0x0050, B:32:0x006b, B:49:0x0093, B:51:0x009e, B:52:0x00a5, B:62:0x00b9, B:69:0x00c8, B:72:0x00cf, B:74:0x00d4, B:76:0x00de, B:77:0x00e0, B:79:0x00e4, B:81:0x00eb, B:87:0x0106, B:82:0x00f2, B:84:0x00f8, B:86:0x00fe, B:28:0x0055, B:173:0x021c, B:88:0x010a, B:90:0x010e, B:91:0x0119, B:103:0x0138, B:108:0x014a, B:109:0x014f, B:111:0x0153, B:114:0x015c, B:115:0x015f, B:100:0x012d, B:101:0x0131, B:102:0x0135, B:118:0x0165, B:120:0x016e, B:124:0x0179, B:126:0x0185, B:127:0x0189, B:128:0x018d, B:130:0x0192, B:131:0x0196, B:132:0x019d, B:134:0x01a2, B:138:0x01af, B:140:0x01b3, B:149:0x01ca, B:157:0x01e6, B:150:0x01cd, B:152:0x01d1, B:153:0x01d3, B:155:0x01dc, B:159:0x01e9, B:160:0x01ef, B:162:0x01f4, B:163:0x01fc, B:165:0x0200, B:166:0x0203, B:167:0x0206, B:168:0x020c, B:169:0x0212, B:170:0x0218, B:171:0x021a), top: B:220:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0119 A[Catch: UnbracketedComma -> 0x0235, TryCatch #1 {UnbracketedComma -> 0x0235, blocks: (B:5:0x001e, B:26:0x0050, B:32:0x006b, B:49:0x0093, B:51:0x009e, B:52:0x00a5, B:62:0x00b9, B:69:0x00c8, B:72:0x00cf, B:74:0x00d4, B:76:0x00de, B:77:0x00e0, B:79:0x00e4, B:81:0x00eb, B:87:0x0106, B:82:0x00f2, B:84:0x00f8, B:86:0x00fe, B:28:0x0055, B:173:0x021c, B:88:0x010a, B:90:0x010e, B:91:0x0119, B:103:0x0138, B:108:0x014a, B:109:0x014f, B:111:0x0153, B:114:0x015c, B:115:0x015f, B:100:0x012d, B:101:0x0131, B:102:0x0135, B:118:0x0165, B:120:0x016e, B:124:0x0179, B:126:0x0185, B:127:0x0189, B:128:0x018d, B:130:0x0192, B:131:0x0196, B:132:0x019d, B:134:0x01a2, B:138:0x01af, B:140:0x01b3, B:149:0x01ca, B:157:0x01e6, B:150:0x01cd, B:152:0x01d1, B:153:0x01d3, B:155:0x01dc, B:159:0x01e9, B:160:0x01ef, B:162:0x01f4, B:163:0x01fc, B:165:0x0200, B:166:0x0203, B:167:0x0206, B:168:0x020c, B:169:0x0212, B:170:0x0218, B:171:0x021a), top: B:220:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0123  */
    void sanitize() {
        StringBuilder sb;
        int i;
        int i2;
        boolean[] zArr;
        int i3;
        char c2;
        boolean z;
        State stateRequireValueState;
        int iIndexOf;
        int i4;
        int i5;
        char c3;
        int i6;
        State state;
        char cCharAt;
        boolean z2 = false;
        this.cleaned = 0;
        this.bracketDepth = 0;
        this.sanitizedJson = null;
        State stateRequireValueState2 = State.START_ARRAY;
        int length = this.jsonish.length();
        int i7 = 0;
        while (i7 < length) {
            try {
                char cCharAt2 = this.jsonish.charAt(i7);
                if (cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r' || cCharAt2 == ' ') {
                    z = z2;
                } else {
                    try {
                        if (cCharAt2 == '\"') {
                            z = z2;
                        } else if (cCharAt2 == ',') {
                            z = z2;
                            if (this.bracketDepth == 0) {
                                throw UNBRACKETED_COMMA;
                            }
                            switch (AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()]) {
                                case 1:
                                    insert(i7, Constants.NULL);
                                    stateRequireValueState = State.BEFORE_KEY;
                                    break;
                                case 2:
                                case 6:
                                    insert(i7, Constants.NULL);
                                    stateRequireValueState = State.BEFORE_ELEMENT;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    elide(i7, i7 + 1);
                                    continue;
                                case 7:
                                    stateRequireValueState = State.BEFORE_ELEMENT;
                                    break;
                                case 8:
                                    stateRequireValueState = State.BEFORE_KEY;
                                    break;
                                default:
                                    continue;
                            }
                            stateRequireValueState2 = stateRequireValueState;
                        } else if (cCharAt2 == '/') {
                            z = z2;
                            int i8 = i7 + 1;
                            if (i8 < length) {
                                char cCharAt3 = this.jsonish.charAt(i8);
                                if (cCharAt3 == '*') {
                                    if (i7 + 3 < length) {
                                        iIndexOf = i7 + 2;
                                        while (true) {
                                            iIndexOf = this.jsonish.indexOf(47, iIndexOf + 1);
                                            if (iIndexOf >= 0) {
                                                if (this.jsonish.charAt(iIndexOf - 1) == '*') {
                                                    i8 = iIndexOf + 1;
                                                }
                                            }
                                        }
                                    }
                                    i8 = length;
                                } else if (cCharAt3 == '/') {
                                    iIndexOf = i7 + 2;
                                    while (true) {
                                        if (iIndexOf >= length) {
                                            i8 = length;
                                        } else {
                                            char cCharAt4 = this.jsonish.charAt(iIndexOf);
                                            if (cCharAt4 != '\n' && cCharAt4 != '\r' && cCharAt4 != 8232 && cCharAt4 != 8233) {
                                                iIndexOf++;
                                            }
                                            i8 = iIndexOf + 1;
                                        }
                                    }
                                }
                            }
                            elide(i7, i8);
                            i7 = i8 - 1;
                        } else if (cCharAt2 != ':') {
                            if (cCharAt2 != '[') {
                                if (cCharAt2 != ']') {
                                    if (cCharAt2 != '{') {
                                        if (cCharAt2 != '}') {
                                            switch (cCharAt2) {
                                                case '\'':
                                                    z = false;
                                                    break;
                                                case '(':
                                                case ')':
                                                    elide(i7, i7 + 1);
                                                    break;
                                                default:
                                                    int i9 = i7;
                                                    while (i9 < length && (('a' <= (cCharAt = this.jsonish.charAt(i9)) && cCharAt <= 'z') || (('0' <= cCharAt && cCharAt <= '9') || cCharAt == '+' || cCharAt == '-' || cCharAt == '.' || (('A' <= cCharAt && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == '$')))) {
                                                        i9++;
                                                    }
                                                    if (i9 == i7) {
                                                        elide(i7, i7 + 1);
                                                    } else {
                                                        stateRequireValueState2 = requireValueState(i7, stateRequireValueState2, true);
                                                        boolean z3 = ('0' <= cCharAt2 && cCharAt2 <= '9') || cCharAt2 == '.' || cCharAt2 == '+' || cCharAt2 == '-';
                                                        boolean z4 = !z3 && isKeyword(i7, i9);
                                                        if (!z3 && !z4) {
                                                            while (i9 < length && !isJsonSpecialChar(i9)) {
                                                                i9++;
                                                            }
                                                            if (i9 < length && this.jsonish.charAt(i9) == '\"') {
                                                                i9++;
                                                            }
                                                        }
                                                        if (stateRequireValueState2 == State.AFTER_KEY) {
                                                            insert(i7, '\"');
                                                            if (z3) {
                                                                canonicalizeNumber(i7, i9);
                                                                insert(i9, '\"');
                                                            } else {
                                                                sanitizeString(i7, i9);
                                                            }
                                                        } else if (z3) {
                                                            normalizeNumber(i7, i9);
                                                        } else if (!z4) {
                                                            insert(i7, '\"');
                                                            sanitizeString(i7, i9);
                                                        }
                                                        i7 = i9 - 1;
                                                    }
                                                    break;
                                            }
                                        } else if (this.bracketDepth == 0) {
                                            elide(i7, this.jsonish.length());
                                            if (stateRequireValueState2 == State.START_ARRAY) {
                                                insert(length, Constants.NULL);
                                                stateRequireValueState2 = State.AFTER_ELEMENT;
                                            }
                                            sb = this.sanitizedJson;
                                            if (sb != null) {
                                                return;
                                            } else {
                                                return;
                                            }
                                            if (this.sanitizedJson == null) {
                                                this.sanitizedJson = new StringBuilder(this.bracketDepth + length);
                                            }
                                            this.sanitizedJson.append((CharSequence) this.jsonish, this.cleaned, length);
                                            this.cleaned = length;
                                            i = AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()];
                                            if (i != 1) {
                                                this.sanitizedJson.append(Constants.NULL);
                                            } else if (i != 2) {
                                                elideTrailingComma(length);
                                            } else {
                                                elideTrailingComma(length);
                                            }
                                            while (true) {
                                                i2 = this.bracketDepth;
                                                if (i2 != 0) {
                                                    return;
                                                }
                                                StringBuilder sb2 = this.sanitizedJson;
                                                zArr = this.isMap;
                                                i3 = i2 - 1;
                                                this.bracketDepth = i3;
                                                if (zArr[i3]) {
                                                    c2 = '}';
                                                } else {
                                                    c2 = ']';
                                                }
                                                sb2.append(c2);
                                            }
                                        } else {
                                            i4 = AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()];
                                            if (i4 != 1) {
                                                insert(i7, Constants.NULL);
                                            } else if (i4 != 2) {
                                                elideTrailingComma(i7);
                                            } else {
                                                elideTrailingComma(i7);
                                            }
                                            i5 = this.bracketDepth - 1;
                                            this.bracketDepth = i5;
                                            if (this.isMap[i5]) {
                                                c3 = '}';
                                            } else {
                                                c3 = ']';
                                            }
                                            if (cCharAt2 != c3) {
                                                replace(i7, i7 + 1, c3);
                                            }
                                            i6 = this.bracketDepth;
                                            if (i6 == 0) {
                                                state = State.AFTER_ELEMENT;
                                            } else {
                                                state = State.AFTER_ELEMENT;
                                            }
                                            stateRequireValueState2 = state;
                                        }
                                    }
                                    stateRequireValueState2 = stateRequireValueState;
                                } else if (this.bracketDepth == 0) {
                                    elide(i7, this.jsonish.length());
                                    if (stateRequireValueState2 == State.START_ARRAY && this.bracketDepth == 0) {
                                        insert(length, Constants.NULL);
                                        stateRequireValueState2 = State.AFTER_ELEMENT;
                                    }
                                    sb = this.sanitizedJson;
                                    if ((sb != null || sb.length() == 0) && this.cleaned == 0 && this.bracketDepth == 0) {
                                        return;
                                    }
                                    if (this.sanitizedJson == null) {
                                        this.sanitizedJson = new StringBuilder(this.bracketDepth + length);
                                    }
                                    this.sanitizedJson.append((CharSequence) this.jsonish, this.cleaned, length);
                                    this.cleaned = length;
                                    i = AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()];
                                    if (i != 1) {
                                        this.sanitizedJson.append(Constants.NULL);
                                    } else if (i != 2 || i == 3) {
                                        elideTrailingComma(length);
                                    } else if (i == 4) {
                                        this.sanitizedJson.append(":null");
                                    }
                                    while (true) {
                                        i2 = this.bracketDepth;
                                        if (i2 != 0) {
                                            return;
                                        }
                                        StringBuilder sb3 = this.sanitizedJson;
                                        zArr = this.isMap;
                                        i3 = i2 - 1;
                                        this.bracketDepth = i3;
                                        if (zArr[i3]) {
                                            c2 = '}';
                                        } else {
                                            c2 = ']';
                                        }
                                        sb3.append(c2);
                                    }
                                } else {
                                    i4 = AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()];
                                    if (i4 != 1) {
                                        insert(i7, Constants.NULL);
                                    } else if (i4 != 2 || i4 == 3) {
                                        elideTrailingComma(i7);
                                    } else if (i4 == 4) {
                                        insert(i7, ":null");
                                    }
                                    i5 = this.bracketDepth - 1;
                                    this.bracketDepth = i5;
                                    if (this.isMap[i5]) {
                                        c3 = '}';
                                    } else {
                                        c3 = ']';
                                    }
                                    if (cCharAt2 != c3) {
                                        replace(i7, i7 + 1, c3);
                                    }
                                    i6 = this.bracketDepth;
                                    if (i6 == 0 && this.isMap[i6 - 1]) {
                                        state = State.AFTER_VALUE;
                                    } else {
                                        state = State.AFTER_ELEMENT;
                                    }
                                    stateRequireValueState2 = state;
                                }
                                z = false;
                            }
                            z = false;
                            requireValueState(i7, stateRequireValueState2, false);
                            if (this.isMap == null) {
                                this.isMap = new boolean[this.maximumNestingDepth];
                            }
                            boolean z5 = cCharAt2 == '{';
                            boolean[] zArr2 = this.isMap;
                            int i10 = this.bracketDepth;
                            zArr2[i10] = z5;
                            this.bracketDepth = i10 + 1;
                            stateRequireValueState = z5 ? State.START_MAP : State.START_ARRAY;
                            stateRequireValueState2 = stateRequireValueState;
                        } else {
                            z = z2;
                            if (stateRequireValueState2 == State.AFTER_KEY) {
                                stateRequireValueState = State.BEFORE_VALUE;
                                stateRequireValueState2 = stateRequireValueState;
                            } else {
                                elide(i7, i7 + 1);
                            }
                        }
                        int iEndOfQuotedString = endOfQuotedString(this.jsonish, i7);
                        sanitizeString(i7, iEndOfQuotedString);
                        i7 = iEndOfQuotedString - 1;
                        stateRequireValueState2 = stateRequireValueState;
                    } catch (UnbracketedComma unused) {
                        stateRequireValueState2 = stateRequireValueState;
                        elide(i7, this.jsonish.length());
                        if (stateRequireValueState2 == State.START_ARRAY) {
                            insert(length, Constants.NULL);
                            stateRequireValueState2 = State.AFTER_ELEMENT;
                        }
                        sb = this.sanitizedJson;
                        if (sb != null) {
                            return;
                        } else {
                            return;
                        }
                        if (this.sanitizedJson == null) {
                            this.sanitizedJson = new StringBuilder(this.bracketDepth + length);
                        }
                        this.sanitizedJson.append((CharSequence) this.jsonish, this.cleaned, length);
                        this.cleaned = length;
                        i = AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()];
                        if (i != 1) {
                            this.sanitizedJson.append(Constants.NULL);
                        } else if (i != 2) {
                            elideTrailingComma(length);
                        } else {
                            elideTrailingComma(length);
                        }
                        while (true) {
                            i2 = this.bracketDepth;
                            if (i2 != 0) {
                                return;
                            }
                            StringBuilder sb4 = this.sanitizedJson;
                            zArr = this.isMap;
                            i3 = i2 - 1;
                            this.bracketDepth = i3;
                            if (zArr[i3]) {
                                c2 = '}';
                            } else {
                                c2 = ']';
                            }
                            sb4.append(c2);
                        }
                    }
                    stateRequireValueState = requireValueState(i7, stateRequireValueState2, true);
                }
                i7++;
                z2 = z;
            } catch (UnbracketedComma unused2) {
            }
        }
        if (stateRequireValueState2 == State.START_ARRAY) {
            insert(length, Constants.NULL);
            stateRequireValueState2 = State.AFTER_ELEMENT;
        }
        sb = this.sanitizedJson;
        if (sb != null) {
            return;
        } else {
            return;
        }
        if (this.sanitizedJson == null) {
            this.sanitizedJson = new StringBuilder(this.bracketDepth + length);
        }
        this.sanitizedJson.append((CharSequence) this.jsonish, this.cleaned, length);
        this.cleaned = length;
        i = AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[stateRequireValueState2.ordinal()];
        if (i != 1) {
            this.sanitizedJson.append(Constants.NULL);
        } else if (i != 2) {
            elideTrailingComma(length);
        } else {
            elideTrailingComma(length);
        }
        while (true) {
            i2 = this.bracketDepth;
            if (i2 != 0) {
                return;
            }
            StringBuilder sb5 = this.sanitizedJson;
            zArr = this.isMap;
            i3 = i2 - 1;
            this.bracketDepth = i3;
            if (zArr[i3]) {
                c2 = '}';
            } else {
                c2 = ']';
            }
            sb5.append(c2);
        }
    }

    /* JADX INFO: renamed from: com.google.json.JsonSanitizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$json$JsonSanitizer$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$google$json$JsonSanitizer$State = iArr;
            try {
                iArr[State.BEFORE_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.BEFORE_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.BEFORE_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.AFTER_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.START_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.START_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.AFTER_ELEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$json$JsonSanitizer$State[State.AFTER_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:108:0x0185  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a A[PHI: r6
      0x006a: PHI (r6v32 int) = (r6v30 int), (r6v48 int) binds: [B:97:0x015b, B:38:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f A[LOOP:1: B:44:0x007c->B:46:0x007f, LOOP_END] */
    private void sanitizeString(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        boolean z = false;
        while (i5 < i2) {
            char cCharAt = this.jsonish.charAt(i5);
            if (cCharAt == '\t') {
                replace(i5, i5 + 1, "\\t");
            } else if (cCharAt == '\n') {
                replace(i5, i5 + 1, "\\n");
            } else if (cCharAt == '\r') {
                replace(i5, i5 + 1, "\\r");
            } else if (cCharAt == '\"' || cCharAt == '\'') {
                if (i5 != i) {
                    int i6 = i5 + 1;
                    if (i6 == i2) {
                        char cCharAt2 = this.jsonish.charAt(i);
                        if (cCharAt2 != '\'') {
                            cCharAt2 = '\"';
                        }
                        z = cCharAt2 == cCharAt;
                    }
                    if (z) {
                        if (cCharAt == '\'') {
                            replace(i5, i6, '\"');
                        }
                    } else if (cCharAt == '\"') {
                        insert(i5, IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                } else if (cCharAt == '\'') {
                    replace(i5, i5 + 1, '\"');
                }
            } else if (cCharAt != '<') {
                if (cCharAt == '>') {
                    int i7 = i5 - 2;
                    if (i7 >= i) {
                        int i8 = i5 - 1;
                        if ((runSlashPreceding(this.jsonish, i8) & 1) != 1) {
                            i7 = i8;
                        }
                        int iUnescapedCharRev = unescapedCharRev(this.jsonish, i7);
                        if ('-' == ((char) iUnescapedCharRev) && '-' == ((char) unescapedCharRev(this.jsonish, i7 - (iUnescapedCharRev >>> 16)))) {
                            replace(i5, i5 + 1, "\\u003e");
                        }
                    }
                } else if (cCharAt == '\\') {
                    int i9 = i5 + 1;
                    if (i9 == i2) {
                        elide(i5, i9);
                    } else {
                        char cCharAt3 = this.jsonish.charAt(i9);
                        if (cCharAt3 == '\"' || cCharAt3 == '\\' || cCharAt3 == 'b' || cCharAt3 == 'f' || cCharAt3 == 'n' || cCharAt3 == 'r') {
                            i5 = i9;
                        } else if (cCharAt3 != 'x') {
                            switch (cCharAt3) {
                                case '/':
                                    i5 = i9;
                                    break;
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                    int i10 = i5 + 2;
                                    if (i10 < i2 && isOctAt(i10)) {
                                        i10 = i5 + 3;
                                        if (cCharAt3 <= '3' && i10 < i2 && isOctAt(i10)) {
                                            i10 = i5 + 4;
                                        }
                                    }
                                    int iCharAt = 0;
                                    for (int i11 = i9; i11 < i10; i11++) {
                                        iCharAt = (iCharAt << 3) | (this.jsonish.charAt(i11) - '0');
                                    }
                                    replace(i9, i10, "u00");
                                    appendHex(iCharAt, 2);
                                    i5 = i10 - 1;
                                    break;
                                default:
                                    switch (cCharAt3) {
                                        case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                                            i5 = i9;
                                            break;
                                        case 'u':
                                            if (i5 + 6 < i2 && isHexAt(i5 + 2) && isHexAt(i5 + 3) && isHexAt(i5 + 4)) {
                                                i3 = i5 + 5;
                                                if (isHexAt(i3)) {
                                                    i5 = i3;
                                                }
                                            }
                                            elide(i5, i9);
                                            break;
                                        case AgrConstant.HEALTH_AGREEMENT_CODE /* 118 */:
                                            replace(i5, i5 + 2, "\\u0008");
                                            i5 = i9;
                                            break;
                                        default:
                                            elide(i5, i9);
                                            break;
                                    }
                                    break;
                            }
                        } else if (i5 + 4 < i2) {
                            int i12 = i5 + 2;
                            if (isHexAt(i12)) {
                                int i13 = i5 + 3;
                                if (isHexAt(i13)) {
                                    replace(i5, i12, "\\u00");
                                    i5 = i13;
                                } else {
                                    elide(i5, i9);
                                }
                            } else {
                                elide(i5, i9);
                            }
                        } else {
                            elide(i5, i9);
                        }
                    }
                } else if (cCharAt != ']') {
                    if (cCharAt == 8232) {
                        replace(i5, i5 + 1, "\\u2028");
                    } else if (cCharAt == 8233) {
                        replace(i5, i5 + 1, "\\u2029");
                    } else if (cCharAt < ' ') {
                        replace(i5, i5 + 1, "\\u");
                        i4 = 4;
                        while (true) {
                            i4--;
                            if (i4 >= 0) {
                                this.sanitizedJson.append(HEX_DIGITS[(cCharAt >>> (i4 << 2)) & 15]);
                            }
                        }
                    } else if (cCharAt >= 55296) {
                        if (cCharAt < 57344) {
                            if (Character.isHighSurrogate(cCharAt) && (i3 = i5 + 1) < i2 && Character.isLowSurrogate(this.jsonish.charAt(i3))) {
                                i5 = i3;
                            }
                        } else if (cCharAt <= 65533) {
                        }
                        replace(i5, i5 + 1, "\\u");
                        i4 = 4;
                        while (true) {
                            i4--;
                            if (i4 >= 0) {
                                this.sanitizedJson.append(HEX_DIGITS[(cCharAt >>> (i4 << 2)) & 15]);
                            }
                        }
                    }
                } else if (i5 + 2 < i2) {
                    int i14 = i5 + 1;
                    long jUnescapedChar = unescapedChar(this.jsonish, i14);
                    char c2 = (char) jUnescapedChar;
                    char cUnescapedChar = (char) unescapedChar(this.jsonish, (int) (((long) i14) + (jUnescapedChar >>> 16)));
                    if (']' == c2 && '>' == cUnescapedChar) {
                        replace(i5, i14, "\\u005d");
                    }
                }
            } else if (i5 + 3 < i2) {
                int i15 = i5 + 1;
                int iUnescapedChar = unescapedChar(this.jsonish, i15);
                char c3 = (char) iUnescapedChar;
                int i16 = (iUnescapedChar >>> 16) + i15;
                long jUnescapedChar2 = unescapedChar(this.jsonish, i16);
                char c4 = (char) jUnescapedChar2;
                int i17 = i5;
                char cUnescapedChar2 = (char) unescapedChar(this.jsonish, (int) (((long) i16) + (jUnescapedChar2 >>> 16)));
                char c5 = (char) (c3 | ' ');
                char c6 = (char) (c4 | ' ');
                char c7 = (char) (cUnescapedChar2 | ' ');
                if ((c3 == '!' && c4 == '-' && cUnescapedChar2 == '-') || ((c5 == 's' && c6 == 'c' && c7 == 'r') || (c3 == '/' && c6 == 's' && c7 == 'c'))) {
                    i5 = i17;
                    replace(i5, i15, "\\u003c");
                } else {
                    i5 = i17;
                }
            }
            i5++;
        }
        if (z) {
            return;
        }
        insert(i2, '\"');
    }

    private State requireValueState(int i, State state, boolean z) throws UnbracketedComma {
        switch (AnonymousClass1.$SwitchMap$com$google$json$JsonSanitizer$State[state.ordinal()]) {
            case 1:
                return State.AFTER_VALUE;
            case 2:
            case 6:
                return State.AFTER_ELEMENT;
            case 3:
            case 5:
                if (z) {
                    return State.AFTER_KEY;
                }
                insert(i, "\"\":");
                return State.AFTER_VALUE;
            case 4:
                insert(i, ':');
                return State.AFTER_VALUE;
            case 7:
                if (this.bracketDepth == 0) {
                    throw UNBRACKETED_COMMA;
                }
                insert(i, ',');
                return State.AFTER_ELEMENT;
            case 8:
                if (z) {
                    insert(i, ',');
                    return State.AFTER_KEY;
                }
                insert(i, ",\"\":");
                return State.AFTER_VALUE;
            default:
                throw new AssertionError();
        }
    }

    private void insert(int i, char c2) {
        replace(i, i, c2);
    }

    private void insert(int i, String str) {
        replace(i, i, str);
    }

    private void elide(int i, int i2) {
        if (this.sanitizedJson == null) {
            this.sanitizedJson = new StringBuilder(this.jsonish.length() + 16);
        }
        this.sanitizedJson.append((CharSequence) this.jsonish, this.cleaned, i);
        this.cleaned = i2;
    }

    private void replace(int i, int i2, char c2) {
        elide(i, i2);
        this.sanitizedJson.append(c2);
    }

    private void replace(int i, int i2, String str) {
        elide(i, i2);
        this.sanitizedJson.append(str);
    }

    private static int endOfQuotedString(String str, int i) {
        int i2;
        char cCharAt = str.charAt(i);
        int iIndexOf = i;
        do {
            iIndexOf = str.indexOf(cCharAt, iIndexOf + 1);
            if (iIndexOf >= 0) {
                i2 = iIndexOf;
                while (i2 > i && str.charAt(i2 - 1) == '\\') {
                    i2--;
                }
            } else {
                return str.length();
            }
        } while (((iIndexOf - i2) & 1) != 0);
        return iIndexOf + 1;
    }

    private void elideTrailingComma(int i) {
        while (true) {
            int i2 = i - 1;
            if (i2 >= this.cleaned) {
                char cCharAt = this.jsonish.charAt(i2);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    if (cCharAt == ',') {
                        elide(i2, i);
                        return;
                    } else {
                        throw new AssertionError("" + this.jsonish.charAt(i2));
                    }
                }
                i = i2;
            } else {
                int length = this.sanitizedJson.length();
                while (true) {
                    length--;
                    if (length >= 0) {
                        char cCharAt2 = this.sanitizedJson.charAt(length);
                        if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ') {
                            if (cCharAt2 == ',') {
                                this.sanitizedJson.setLength(length);
                                return;
                            } else {
                                throw new AssertionError("" + this.sanitizedJson.charAt(length));
                            }
                        }
                    } else {
                        throw new AssertionError("Trailing comma not found in " + this.jsonish + " or " + ((Object) this.sanitizedJson));
                    }
                }
            }
        }
    }

    private void normalizeNumber(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        if (i < i2) {
            char cCharAt2 = this.jsonish.charAt(i);
            if (cCharAt2 == '+') {
                int i7 = i + 1;
                elide(i, i7);
                i = i7;
            } else if (cCharAt2 == '-') {
                i++;
            }
        }
        int iEndOfDigitRun = endOfDigitRun(i, i2);
        if (i == iEndOfDigitRun) {
            insert(i, '0');
        } else if ('0' == this.jsonish.charAt(i)) {
            int i8 = iEndOfDigitRun - i;
            int i9 = 16;
            int iMax = 0;
            boolean z = true;
            if (i8 == 1 && iEndOfDigitRun < i2 && 120 == (this.jsonish.charAt(iEndOfDigitRun) | ' ')) {
                int i10 = iEndOfDigitRun + 1;
                int i11 = i10;
                while (i11 < i2) {
                    char cCharAt3 = this.jsonish.charAt(i11);
                    if ('0' > cCharAt3 || cCharAt3 > '9') {
                        char c2 = (char) (cCharAt3 | ' ');
                        if ('a' > c2 || c2 > 'f') {
                            break;
                        } else {
                            i6 = c2 - 'W';
                        }
                    } else {
                        i6 = cCharAt3 - '0';
                    }
                    iMax = Math.max(i6, iMax);
                    i11++;
                }
                i4 = iMax;
                i5 = 16;
                int i12 = i11;
                i3 = i10;
                iEndOfDigitRun = i12;
            } else if (i8 > 1) {
                for (int i13 = i; i13 < iEndOfDigitRun; i13++) {
                    int iCharAt = this.jsonish.charAt(i13) - '0';
                    if (iCharAt < 0) {
                        break;
                    }
                    iMax = Math.max(iCharAt, iMax);
                }
                i4 = iMax;
                i5 = 8;
                i3 = i;
            } else {
                i3 = -1;
                z = false;
                i4 = 0;
                i5 = 10;
            }
            if (z) {
                elide(i, iEndOfDigitRun);
                String strSubstring = this.jsonish.substring(i3, iEndOfDigitRun);
                int length = strSubstring.length();
                if (i5 > i4) {
                    i9 = i5;
                } else if (i4 <= 10) {
                    i9 = 10;
                }
                if (length == 0) {
                    this.sanitizedJson.append('0');
                } else if (DIGITS_BY_BASE_THAT_FIT_IN_63B[i9] >= length) {
                    this.sanitizedJson.append(Long.parseLong(strSubstring, i9));
                } else {
                    this.sanitizedJson.append(new BigInteger(strSubstring, i9));
                }
            }
        }
        if (iEndOfDigitRun < i2 && this.jsonish.charAt(iEndOfDigitRun) == '.') {
            int i14 = iEndOfDigitRun + 1;
            int iEndOfDigitRun2 = endOfDigitRun(i14, i2);
            if (iEndOfDigitRun2 == i14) {
                insert(i14, '0');
            }
            iEndOfDigitRun = iEndOfDigitRun2;
        }
        if (iEndOfDigitRun < i2 && 101 == (this.jsonish.charAt(iEndOfDigitRun) | ' ')) {
            int i15 = iEndOfDigitRun + 1;
            if (i15 < i2 && ((cCharAt = this.jsonish.charAt(i15)) == '+' || cCharAt == '-')) {
                i15 = iEndOfDigitRun + 2;
            }
            iEndOfDigitRun = endOfDigitRun(i15, i2);
            if (iEndOfDigitRun == i15) {
                insert(i15, '0');
            }
        }
        if (iEndOfDigitRun != i2) {
            elide(iEndOfDigitRun, i2);
        }
    }

    private boolean canonicalizeNumber(int i, int i2) {
        elide(i, i);
        int length = this.sanitizedJson.length();
        normalizeNumber(i, i2);
        elide(i2, i2);
        return canonicalizeNumber(this.sanitizedJson, length, this.sanitizedJson.length());
    }

    private static boolean canonicalizeNumber(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        char c2;
        char cCharAt;
        char cCharAt2;
        int i5 = i + (sb.charAt(i) == '-' ? 1 : 0);
        int i6 = i5;
        while (i6 < i2 && '0' <= (cCharAt2 = sb.charAt(i6)) && cCharAt2 <= '9') {
            i6++;
        }
        if (i6 != i2 && '.' == sb.charAt(i6)) {
            do {
                i6++;
                if (i6 >= i2 || '0' > (cCharAt = sb.charAt(i6))) {
                    break;
                }
            } while (cCharAt <= '9');
        }
        if (i6 == i2) {
            i3 = i2;
        } else {
            i3 = i6 + 1;
            if (sb.charAt(i3) == '+') {
                i3 = i6 + 2;
            }
        }
        if (i2 == i3) {
            i4 = 0;
        } else {
            try {
                i4 = Integer.parseInt(sb.substring(i3, i2), 10);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        int i7 = i5;
        int i8 = i7;
        boolean z = false;
        int i9 = 0;
        boolean z2 = true;
        while (i7 < i6) {
            char cCharAt3 = sb.charAt(i7);
            if (cCharAt3 == '.') {
                if (z2) {
                    i9 = 0;
                }
                z = true;
            } else {
                if ((!z2 || cCharAt3 != '0') && !z) {
                    i4++;
                }
                if (cCharAt3 == '0') {
                    i9++;
                } else {
                    if (z2) {
                        if (z) {
                            i4 -= i9;
                        }
                        i9 = 0;
                    }
                    while (true) {
                        if (i9 == 0 && cCharAt3 == 0) {
                            break;
                        }
                        if (i9 == 0) {
                            c2 = 0;
                        } else {
                            i9--;
                            c2 = cCharAt3;
                            cCharAt3 = '0';
                        }
                        sb.setCharAt(i8, cCharAt3);
                        i8++;
                        cCharAt3 = c2;
                    }
                    z2 = false;
                }
            }
            i7++;
        }
        sb.setLength(i8);
        int i10 = i8 - i5;
        if (z2) {
            sb.setLength(i);
            sb.append('0');
            return true;
        }
        if (i10 <= i4 && i4 <= 21) {
            while (i10 < i4) {
                sb.append('0');
                i10++;
            }
        } else if (i4 > 0 && i4 <= 21) {
            sb.insert(i5 + i4, FilenameUtils.EXTENSION_SEPARATOR);
        } else if (-6 < i4 && i4 <= 0) {
            sb.insert(i5, "0.000000".substring(0, 2 - i4));
        } else {
            if (i10 != 1) {
                sb.insert(i5 + 1, FilenameUtils.EXTENSION_SEPARATOR);
            }
            int i11 = i4 - 1;
            sb.append('e');
            sb.append(i11 >= 0 ? '+' : '-');
            sb.append(Math.abs(i11));
        }
        return true;
    }

    private boolean isKeyword(int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 5) {
            return "false".regionMatches(0, this.jsonish, i, i3);
        }
        if (i3 == 4) {
            return Constants.NULL.regionMatches(0, this.jsonish, i, i3) || "true".regionMatches(0, this.jsonish, i, i3);
        }
        return false;
    }

    private boolean isOctAt(int i) {
        return isOct(this.jsonish.charAt(i));
    }

    private boolean isHexAt(int i) {
        return isHex(this.jsonish.charAt(i));
    }

    private boolean isJsonSpecialChar(int i) {
        char cCharAt = this.jsonish.charAt(i);
        return cCharAt <= ' ' || cCharAt == '\"' || cCharAt == ',' || cCharAt == ':' || cCharAt == '[' || cCharAt == ']' || cCharAt == '{' || cCharAt == '}';
    }

    private void appendHex(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            int i3 = (i >>> (i2 * 4)) & 15;
            this.sanitizedJson.append((char) (i3 + (i3 < 10 ? 48 : 87)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class UnbracketedComma extends Exception {
        private static final long serialVersionUID = 783239978717247850L;

        private UnbracketedComma() {
        }

        /* synthetic */ UnbracketedComma(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private int endOfDigitRun(int i, int i2) {
        while (i < i2) {
            char cCharAt = this.jsonish.charAt(i);
            if ('0' > cCharAt || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return i2;
    }

    static {
        UnbracketedComma unbracketedComma = new UnbracketedComma(null);
        UNBRACKETED_COMMA = unbracketedComma;
        unbracketedComma.setStackTrace(new StackTraceElement[0]);
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        DIGITS_BY_BASE_THAT_FIT_IN_63B = new int[]{-1, -1, 63, 39, 31, 27, 24, 22, 21, 19, 18, 18, 17, 17, 16, 16, 15};
    }

    CharSequence toCharSequence() {
        CharSequence charSequence = this.sanitizedJson;
        if (charSequence == null) {
            charSequence = this.jsonish;
        }
        return charSequence;
    }

    public String toString() {
        StringBuilder sb = this.sanitizedJson;
        return sb != null ? sb.toString() : this.jsonish;
    }

    private static int unescapedChar(String str, int i) {
        int length = str.length();
        int iCharAt = 0;
        if (i >= length) {
            return 0;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt != '\\') {
            return cCharAt | Ascii.MIN;
        }
        int i2 = i + 1;
        if (i2 == length) {
            return 65536;
        }
        char cCharAt2 = str.charAt(i2);
        if (cCharAt2 == 'b') {
            return 131080;
        }
        if (cCharAt2 == 'f') {
            return 131084;
        }
        if (cCharAt2 == 'n') {
            return 131082;
        }
        if (cCharAt2 == 'r') {
            return 131085;
        }
        if (cCharAt2 != 'x') {
            switch (cCharAt2) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    int i3 = i + 2;
                    if (i3 < length && isOct(str.charAt(i3))) {
                        i3 = i + 3;
                        if (cCharAt2 <= '3' && i3 < length && isOct(str.charAt(i3))) {
                            i3 = i + 4;
                        }
                    }
                    while (i2 < i3) {
                        iCharAt = (str.charAt(i2) - '0') | (iCharAt << 3);
                        i2++;
                    }
                    return ((i3 - i) << 16) | iCharAt;
                default:
                    switch (cCharAt2) {
                        case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                            return 131081;
                        case 'u':
                            int i4 = i + 5;
                            if (i4 < length) {
                                char cCharAt3 = str.charAt(i + 2);
                                char cCharAt4 = str.charAt(i + 3);
                                char cCharAt5 = str.charAt(i + 4);
                                char cCharAt6 = str.charAt(i4);
                                if (isHex(cCharAt3) && isHex(cCharAt4) && isHex(cCharAt5) && isHex(cCharAt6)) {
                                    return hexVal(cCharAt6) | (hexVal(cCharAt5) << 4) | (hexVal(cCharAt3) << 12) | ARImageMetadata.HOT_PIXEL_MODE | (hexVal(cCharAt4) << 8);
                                }
                            }
                            break;
                        case AgrConstant.HEALTH_AGREEMENT_CODE /* 118 */:
                            return 131080;
                    }
                    break;
            }
        } else {
            int i5 = i + 3;
            if (i5 < length) {
                char cCharAt7 = str.charAt(i + 2);
                char cCharAt8 = str.charAt(i5);
                if (isHex(cCharAt7) && isHex(cCharAt8)) {
                    return hexVal(cCharAt8) | (hexVal(cCharAt7) << 4) | 262144;
                }
            }
        }
        return 0 | cCharAt2;
    }

    private static int unescapedCharRev(String str, int i) {
        int i2;
        if (i < 0) {
            return 0;
        }
        for (int i3 = 1; i3 < 6 && (i2 = i - i3) >= 0; i3++) {
            if (str.charAt(i2) == '\\') {
                int i4 = 1;
                while (true) {
                    int i5 = i2 - i4;
                    if (i5 < 0 || str.charAt(i5) != '\\') {
                        break;
                    }
                    i4++;
                }
                if ((i4 & 1) != 1) {
                    break;
                }
                int iUnescapedChar = unescapedChar(str, i2);
                if ((iUnescapedChar >>> 16) - 1 != i3) {
                    break;
                }
                return iUnescapedChar;
            }
        }
        return str.charAt(i) | Ascii.MIN;
    }

    private static int runSlashPreceding(String str, int i) {
        int i2 = i;
        while (i2 >= 0 && str.charAt(i2) == '\\') {
            i2--;
        }
        return i - i2;
    }
}
