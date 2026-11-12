package com.google.i18n.phonenumbers;

import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.bag;
import defpackage.bm4;
import defpackage.c8f;
import defpackage.kbk;
import defpackage.lbk;
import defpackage.qtf;
import defpackage.rtf;
import defpackage.ttf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public class PhoneNumberUtil {
    public static final String A;
    public static final Pattern B;
    public static final Pattern C;
    public static final Pattern D;
    public static final Pattern E;
    public static final Pattern F;
    public static PhoneNumberUtil G;
    public static final Logger h = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final Map<Integer, String> i;
    public static final Set<Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<Integer> f9444k;
    public static final Map<Character, Character> l;
    public static final Map<Character, Character> m;
    public static final Map<Character, Character> n;
    public static final Map<Character, Character> o;
    public static final Pattern p;
    public static final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f9445r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static final String y;
    public static final String z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttf f9446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, List<String>> f9447b;
    public final c8f c = kbk.b();
    public final Set<String> d = new HashSet(35);
    public final lbk e = new lbk(100);
    public final Set<String> f = new HashSet(320);
    public final Set<Integer> g = new HashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Leniency {
        private static final /* synthetic */ Leniency[] $VALUES;
        public static final Leniency EXACT_GROUPING;
        public static final Leniency POSSIBLE;
        public static final Leniency STRICT_GROUPING;
        public static final Leniency VALID;

        public final enum a extends Leniency {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                return phoneNumberUtil.B(phonenumber$PhoneNumber);
            }
        }

        public final enum b extends Leniency {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                if (phoneNumberUtil.E(phonenumber$PhoneNumber) && com.google.i18n.phonenumbers.a.b(phonenumber$PhoneNumber, charSequence.toString(), phoneNumberUtil)) {
                    return com.google.i18n.phonenumbers.a.c(phonenumber$PhoneNumber, phoneNumberUtil);
                }
                return false;
            }
        }

        public final enum c extends Leniency {

            public class a {
                public a() {
                }
            }

            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                String string = charSequence.toString();
                if (!phoneNumberUtil.E(phonenumber$PhoneNumber) || !com.google.i18n.phonenumbers.a.b(phonenumber$PhoneNumber, string, phoneNumberUtil) || com.google.i18n.phonenumbers.a.a(phonenumber$PhoneNumber, string) || !com.google.i18n.phonenumbers.a.c(phonenumber$PhoneNumber, phoneNumberUtil)) {
                    return false;
                }
                new a();
                throw null;
            }
        }

        public final enum d extends Leniency {

            public class a {
                public a() {
                }
            }

            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                String string = charSequence.toString();
                if (!phoneNumberUtil.E(phonenumber$PhoneNumber) || !com.google.i18n.phonenumbers.a.b(phonenumber$PhoneNumber, string, phoneNumberUtil) || com.google.i18n.phonenumbers.a.a(phonenumber$PhoneNumber, string) || !com.google.i18n.phonenumbers.a.c(phonenumber$PhoneNumber, phoneNumberUtil)) {
                    return false;
                }
                new a();
                throw null;
            }
        }

        static {
            a aVar = new a("POSSIBLE", 0);
            POSSIBLE = aVar;
            b bVar = new b("VALID", 1);
            VALID = bVar;
            c cVar = new c("STRICT_GROUPING", 2);
            STRICT_GROUPING = cVar;
            d dVar = new d("EXACT_GROUPING", 3);
            EXACT_GROUPING = dVar;
            $VALUES = new Leniency[]{aVar, bVar, cVar, dVar};
        }

        private Leniency(String str, int i) {
            super(str, i);
        }

        public static Leniency valueOf(String str) {
            return (Leniency) Enum.valueOf(Leniency.class, str);
        }

        public static Leniency[] values() {
            return (Leniency[]) $VALUES.clone();
        }

        public abstract boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar);

        public /* synthetic */ Leniency(String str, int i, com.google.i18n.phonenumbers.b bVar) {
            this(str, i);
        }
    }

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9451b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PhoneNumberType.values().length];
            c = iArr;
            try {
                iArr[PhoneNumberType.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[PhoneNumberType.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[PhoneNumberType.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[PhoneNumberType.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[PhoneNumberType.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[PhoneNumberType.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[PhoneNumberType.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[PhoneNumberType.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[PhoneNumberType.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[PhoneNumberType.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[PhoneNumberType.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[PhoneNumberFormat.values().length];
            f9451b = iArr2;
            try {
                iArr2[PhoneNumberFormat.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9451b[PhoneNumberFormat.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9451b[PhoneNumberFormat.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9451b[PhoneNumberFormat.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[Phonenumber$PhoneNumber.CountryCodeSource.values().length];
            f9450a = iArr3;
            try {
                iArr3[Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9450a[Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9450a[Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9450a[Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(54, UserConfig.KEY_LITE_SCENE_ORDER);
        i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f9444k = Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map<Character, Character> mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        m = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        n = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        l = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put(Character.valueOf(Typography.ndash), '-');
        map6.put(Character.valueOf(Typography.mdash), '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        o = Collections.unmodifiableMap(map6);
        p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map7 = m;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        q = string;
        f9445r = Pattern.compile("[+＋]+");
        s = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        t = Pattern.compile("(\\p{Nd})");
        u = Pattern.compile("[+＋\\p{Nd}]");
        v = Pattern.compile("[\\\\/] *x");
        w = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        x = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + string + "\\p{Nd}]*";
        y = str;
        String strE = e(",;xｘ#＃~～");
        z = strE;
        A = e("xｘ#＃~～");
        B = Pattern.compile("(?:" + strE + ")$", 66);
        C = Pattern.compile(str + "(?:" + strE + ")?", 66);
        D = Pattern.compile("(\\D+)");
        E = Pattern.compile("(\\$\\d)");
        F = Pattern.compile("\\(?\\$1\\)?");
        G = null;
    }

    public PhoneNumberUtil(ttf ttfVar, Map<Integer, List<String>> map) {
        this.f9446a = ttfVar;
        this.f9447b = map;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value.size() == 1 && "001".equals(value.get(0))) {
                this.g.add(entry.getKey());
            } else {
                this.f.addAll(value);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll(map.get(1));
    }

    public static boolean H(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return C.matcher(charSequence).matches();
    }

    public static StringBuilder M(StringBuilder sb) {
        if (x.matcher(sb).matches()) {
            sb.replace(0, sb.length(), P(sb, n, true));
        } else {
            sb.replace(0, sb.length(), O(sb));
        }
        return sb;
    }

    public static StringBuilder N(CharSequence charSequence, boolean z2) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            int iDigit = Character.digit(cCharAt, 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            } else if (z2) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public static String O(CharSequence charSequence) {
        return N(charSequence, false).toString();
    }

    public static String P(CharSequence charSequence, Map<Character, Character> map, boolean z2) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            Character ch = map.get(Character.valueOf(Character.toUpperCase(cCharAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z2) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static synchronized void U(PhoneNumberUtil phoneNumberUtil) {
        G = phoneNumberUtil;
    }

    public static void V(CharSequence charSequence, Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (charSequence.length() <= 1 || charSequence.charAt(0) != '0') {
            return;
        }
        phonenumber$PhoneNumber.setItalianLeadingZero(true);
        int i2 = 1;
        while (i2 < charSequence.length() - 1 && charSequence.charAt(i2) == '0') {
            i2++;
        }
        if (i2 != 1) {
            phonenumber$PhoneNumber.setNumberOfLeadingZeros(i2);
        }
    }

    public static Phonenumber$PhoneNumber d(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber2 = new Phonenumber$PhoneNumber();
        phonenumber$PhoneNumber2.setCountryCode(phonenumber$PhoneNumber.getCountryCode());
        phonenumber$PhoneNumber2.setNationalNumber(phonenumber$PhoneNumber.getNationalNumber());
        if (phonenumber$PhoneNumber.getExtension().length() > 0) {
            phonenumber$PhoneNumber2.setExtension(phonenumber$PhoneNumber.getExtension());
        }
        if (phonenumber$PhoneNumber.isItalianLeadingZero()) {
            phonenumber$PhoneNumber2.setItalianLeadingZero(true);
            phonenumber$PhoneNumber2.setNumberOfLeadingZeros(phonenumber$PhoneNumber.getNumberOfLeadingZeros());
        }
        return phonenumber$PhoneNumber2;
    }

    public static String e(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#";
    }

    public static PhoneNumberUtil f(qtf qtfVar) {
        if (qtfVar != null) {
            return g(new bag(qtfVar));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    public static PhoneNumberUtil g(ttf ttfVar) {
        if (ttfVar != null) {
            return new PhoneNumberUtil(ttfVar, bm4.a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    public static boolean h(Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        return (phonemetadata$PhoneNumberDesc.getPossibleLengthCount() == 1 && phonemetadata$PhoneNumberDesc.getPossibleLength(0) == -1) ? false : true;
    }

    public static CharSequence j(CharSequence charSequence) {
        Matcher matcher = u.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = w.matcher(charSequenceSubSequence);
        if (matcher2.find()) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = v.matcher(charSequenceSubSequence);
        return matcher3.find() ? charSequenceSubSequence.subSequence(0, matcher3.start()) : charSequenceSubSequence;
    }

    public static boolean k(String str) {
        return str.length() == 0 || F.matcher(str).matches();
    }

    public static synchronized PhoneNumberUtil m() {
        try {
            if (G == null) {
                U(f(rtf.f32887a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return G;
    }

    public boolean A(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        List<Integer> possibleLengthList = phonemetadata$PhoneNumberDesc.getPossibleLengthList();
        if (possibleLengthList.size() <= 0 || possibleLengthList.contains(Integer.valueOf(length))) {
            return this.c.a(str, phonemetadata$PhoneNumberDesc, false);
        }
        return false;
    }

    public boolean B(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        ValidationResult validationResultD = D(phonenumber$PhoneNumber);
        return validationResultD == ValidationResult.IS_POSSIBLE || validationResultD == ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
    }

    public ValidationResult C(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberType phoneNumberType) {
        String strQ = q(phonenumber$PhoneNumber);
        int countryCode = phonenumber$PhoneNumber.getCountryCode();
        return !w(countryCode) ? ValidationResult.INVALID_COUNTRY_CODE : X(strQ, p(countryCode, t(countryCode)), phoneNumberType);
    }

    public ValidationResult D(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        return C(phonenumber$PhoneNumber, PhoneNumberType.UNKNOWN);
    }

    public boolean E(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        return F(phonenumber$PhoneNumber, u(phonenumber$PhoneNumber));
    }

    public boolean F(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str) {
        int countryCode = phonenumber$PhoneNumber.getCountryCode();
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadataP = p(countryCode, str);
        if (phonemetadata$PhoneMetadataP != null) {
            return ("001".equals(str) || countryCode == l(str)) && s(q(phonenumber$PhoneNumber), phonemetadata$PhoneMetadataP) != PhoneNumberType.UNKNOWN;
        }
        return false;
    }

    public final boolean G(String str) {
        return str != null && this.f.contains(str);
    }

    public int I(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb, boolean z2, Phonenumber$PhoneNumber phonenumber$PhoneNumber) throws NumberParseException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        Phonenumber$PhoneNumber.CountryCodeSource countryCodeSourceK = K(sb2, phonemetadata$PhoneMetadata != null ? phonemetadata$PhoneMetadata.getInternationalPrefix() : "NonMatch");
        if (z2) {
            phonenumber$PhoneNumber.setCountryCodeSource(countryCodeSourceK);
        }
        if (countryCodeSourceK != Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int i2 = i(sb2, sb);
            if (i2 == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            phonenumber$PhoneNumber.setCountryCode(i2);
            return i2;
        }
        if (phonemetadata$PhoneMetadata != null) {
            int countryCode = phonemetadata$PhoneMetadata.getCountryCode();
            String strValueOf = String.valueOf(countryCode);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                Phonemetadata$PhoneNumberDesc generalDesc = phonemetadata$PhoneMetadata.getGeneralDesc();
                L(sb3, phonemetadata$PhoneMetadata, null);
                if ((!this.c.a(sb2, generalDesc, false) && this.c.a(sb3, generalDesc, false)) || W(sb2, phonemetadata$PhoneMetadata) == ValidationResult.TOO_LONG) {
                    sb.append((CharSequence) sb3);
                    if (z2) {
                        phonenumber$PhoneNumber.setCountryCodeSource(Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    phonenumber$PhoneNumber.setCountryCode(countryCode);
                    return countryCode;
                }
            }
        }
        phonenumber$PhoneNumber.setCountryCode(0);
        return 0;
    }

    public String J(StringBuilder sb) {
        Matcher matcher = B.matcher(sb);
        if (!matcher.find() || !H(sb.substring(0, matcher.start()))) {
            return "";
        }
        int iGroupCount = matcher.groupCount();
        for (int i2 = 1; i2 <= iGroupCount; i2++) {
            if (matcher.group(i2) != null) {
                String strGroup = matcher.group(i2);
                sb.delete(matcher.start(), sb.length());
                return strGroup;
            }
        }
        return "";
    }

    public Phonenumber$PhoneNumber.CountryCodeSource K(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f9445r.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            M(sb);
            return Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern patternA = this.e.a(str);
        M(sb);
        return T(patternA, sb) ? Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD : Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    public boolean L(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String nationalPrefixForParsing = phonemetadata$PhoneMetadata.getNationalPrefixForParsing();
        if (length != 0 && nationalPrefixForParsing.length() != 0) {
            Matcher matcher = this.e.a(nationalPrefixForParsing).matcher(sb);
            if (matcher.lookingAt()) {
                Phonemetadata$PhoneNumberDesc generalDesc = phonemetadata$PhoneMetadata.getGeneralDesc();
                boolean zA = this.c.a(sb, generalDesc, false);
                int iGroupCount = matcher.groupCount();
                String nationalPrefixTransformRule = phonemetadata$PhoneMetadata.getNationalPrefixTransformRule();
                if (nationalPrefixTransformRule == null || nationalPrefixTransformRule.length() == 0 || matcher.group(iGroupCount) == null) {
                    if (zA && !this.c.a(sb.substring(matcher.end()), generalDesc, false)) {
                        return false;
                    }
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
                StringBuilder sb3 = new StringBuilder(sb);
                sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
                if (zA && !this.c.a(sb3.toString(), generalDesc, false)) {
                    return false;
                }
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
                return true;
            }
        }
        return false;
    }

    public Phonenumber$PhoneNumber Q(CharSequence charSequence, String str) throws NumberParseException {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        R(charSequence, str, phonenumber$PhoneNumber);
        return phonenumber$PhoneNumber;
    }

    public void R(CharSequence charSequence, String str, Phonenumber$PhoneNumber phonenumber$PhoneNumber) throws NumberParseException {
        S(charSequence, str, false, true, phonenumber$PhoneNumber);
    }

    public final void S(CharSequence charSequence, String str, boolean z2, boolean z3, Phonenumber$PhoneNumber phonenumber$PhoneNumber) throws NumberParseException {
        int I;
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = charSequence.toString();
        a(string, sb);
        if (!H(sb)) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        if (z3 && !b(sb, str)) {
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z2) {
            phonenumber$PhoneNumber.setRawInput(string);
        }
        String strJ = J(sb);
        if (strJ.length() > 0) {
            phonenumber$PhoneNumber.setExtension(strJ);
        }
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadataO = o(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            I = I(sb, phonemetadata$PhoneMetadataO, sb2, z2, phonenumber$PhoneNumber);
        } catch (NumberParseException e) {
            Matcher matcher = f9445r.matcher(sb);
            if (e.getErrorType() != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                throw new NumberParseException(e.getErrorType(), e.getMessage());
            }
            I = I(sb.substring(matcher.end()), phonemetadata$PhoneMetadataO, sb2, z2, phonenumber$PhoneNumber);
            if (I == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (I != 0) {
            String strT = t(I);
            if (!strT.equals(str)) {
                phonemetadata$PhoneMetadataO = p(I, strT);
            }
        } else {
            sb2.append((CharSequence) M(sb));
            if (str != null) {
                phonenumber$PhoneNumber.setCountryCode(phonemetadata$PhoneMetadataO.getCountryCode());
            } else if (z2) {
                phonenumber$PhoneNumber.clearCountryCodeSource();
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (phonemetadata$PhoneMetadataO != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            L(sb4, phonemetadata$PhoneMetadataO, sb3);
            ValidationResult validationResultW = W(sb4, phonemetadata$PhoneMetadataO);
            if (validationResultW != ValidationResult.TOO_SHORT && validationResultW != ValidationResult.IS_POSSIBLE_LOCAL_ONLY && validationResultW != ValidationResult.INVALID_LENGTH) {
                if (z2 && sb3.length() > 0) {
                    phonenumber$PhoneNumber.setPreferredDomesticCarrierCode(sb3.toString());
                }
                sb2 = sb4;
            }
        }
        int length = sb2.length();
        if (length < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        V(sb2, phonenumber$PhoneNumber);
        phonenumber$PhoneNumber.setNationalNumber(Long.parseLong(sb2.toString()));
    }

    public final boolean T(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int iEnd = matcher.end();
        Matcher matcher2 = t.matcher(sb.substring(iEnd));
        if (matcher2.find() && O(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, iEnd);
        return true;
    }

    public final ValidationResult W(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        return X(charSequence, phonemetadata$PhoneMetadata, PhoneNumberType.UNKNOWN);
    }

    public final ValidationResult X(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDescR = r(phonemetadata$PhoneMetadata, phoneNumberType);
        List<Integer> possibleLengthList = phonemetadata$PhoneNumberDescR.getPossibleLengthList().isEmpty() ? phonemetadata$PhoneMetadata.getGeneralDesc().getPossibleLengthList() : phonemetadata$PhoneNumberDescR.getPossibleLengthList();
        List<Integer> possibleLengthLocalOnlyList = phonemetadata$PhoneNumberDescR.getPossibleLengthLocalOnlyList();
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            if (!h(r(phonemetadata$PhoneMetadata, PhoneNumberType.FIXED_LINE))) {
                return X(charSequence, phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            }
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDescR2 = r(phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            if (h(phonemetadata$PhoneNumberDescR2)) {
                ArrayList arrayList = new ArrayList(possibleLengthList);
                arrayList.addAll(phonemetadata$PhoneNumberDescR2.getPossibleLengthCount() == 0 ? phonemetadata$PhoneMetadata.getGeneralDesc().getPossibleLengthList() : phonemetadata$PhoneNumberDescR2.getPossibleLengthList());
                Collections.sort(arrayList);
                if (possibleLengthLocalOnlyList.isEmpty()) {
                    possibleLengthLocalOnlyList = phonemetadata$PhoneNumberDescR2.getPossibleLengthLocalOnlyList();
                } else {
                    ArrayList arrayList2 = new ArrayList(possibleLengthLocalOnlyList);
                    arrayList2.addAll(phonemetadata$PhoneNumberDescR2.getPossibleLengthLocalOnlyList());
                    Collections.sort(arrayList2);
                    possibleLengthLocalOnlyList = arrayList2;
                }
                possibleLengthList = arrayList;
            }
        }
        if (possibleLengthList.get(0).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (possibleLengthLocalOnlyList.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = possibleLengthList.get(0).intValue();
        if (iIntValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (iIntValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (possibleLengthList.get(possibleLengthList.size() - 1).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        return possibleLengthList.subList(1, possibleLengthList.size()).contains(Integer.valueOf(length)) ? ValidationResult.IS_POSSIBLE : ValidationResult.INVALID_LENGTH;
    }

    public final void a(String str, StringBuilder sb) {
        int iIndexOf = str.indexOf(";phone-context=");
        if (iIndexOf >= 0) {
            int i2 = iIndexOf + 15;
            if (i2 < str.length() - 1 && str.charAt(i2) == '+') {
                int iIndexOf2 = str.indexOf(59, i2);
                if (iIndexOf2 > 0) {
                    sb.append(str.substring(i2, iIndexOf2));
                } else {
                    sb.append(str.substring(i2));
                }
            }
            int iIndexOf3 = str.indexOf("tel:");
            sb.append(str.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            sb.append(j(str));
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
    }

    public final boolean b(CharSequence charSequence, String str) {
        if (G(str)) {
            return true;
        }
        return (charSequence == null || charSequence.length() == 0 || !f9445r.matcher(charSequence).lookingAt()) ? false : true;
    }

    public Phonemetadata$NumberFormat c(List<Phonemetadata$NumberFormat> list, String str) {
        for (Phonemetadata$NumberFormat phonemetadata$NumberFormat : list) {
            int leadingDigitsPatternCount = phonemetadata$NumberFormat.getLeadingDigitsPatternCount();
            if (leadingDigitsPatternCount == 0 || this.e.a(phonemetadata$NumberFormat.getLeadingDigitsPattern(leadingDigitsPatternCount - 1)).matcher(str).lookingAt()) {
                if (this.e.a(phonemetadata$NumberFormat.getPattern()).matcher(str).matches()) {
                    return phonemetadata$NumberFormat;
                }
            }
        }
        return null;
    }

    public int i(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb.substring(0, i2));
                if (this.f9447b.containsKey(Integer.valueOf(i3))) {
                    sb2.append(sb.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final int l(String str) {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadataO = o(str);
        if (phonemetadata$PhoneMetadataO != null) {
            return phonemetadata$PhoneMetadataO.getCountryCode();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    public Phonemetadata$PhoneMetadata n(int i2) {
        if (this.f9447b.containsKey(Integer.valueOf(i2))) {
            return this.f9446a.b(i2);
        }
        return null;
    }

    public Phonemetadata$PhoneMetadata o(String str) {
        if (G(str)) {
            return this.f9446a.a(str);
        }
        return null;
    }

    public final Phonemetadata$PhoneMetadata p(int i2, String str) {
        return "001".equals(str) ? n(i2) : o(str);
    }

    public String q(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.isItalianLeadingZero() && phonenumber$PhoneNumber.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[phonenumber$PhoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.getNationalNumber());
        return sb.toString();
    }

    public Phonemetadata$PhoneNumberDesc r(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        switch (a.c[phoneNumberType.ordinal()]) {
            case 1:
                return phonemetadata$PhoneMetadata.getPremiumRate();
            case 2:
                return phonemetadata$PhoneMetadata.getTollFree();
            case 3:
                return phonemetadata$PhoneMetadata.getMobile();
            case 4:
            case 5:
                return phonemetadata$PhoneMetadata.getFixedLine();
            case 6:
                return phonemetadata$PhoneMetadata.getSharedCost();
            case 7:
                return phonemetadata$PhoneMetadata.getVoip();
            case 8:
                return phonemetadata$PhoneMetadata.getPersonalNumber();
            case 9:
                return phonemetadata$PhoneMetadata.getPager();
            case 10:
                return phonemetadata$PhoneMetadata.getUan();
            case 11:
                return phonemetadata$PhoneMetadata.getVoicemail();
            default:
                return phonemetadata$PhoneMetadata.getGeneralDesc();
        }
    }

    public final PhoneNumberType s(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (!A(str, phonemetadata$PhoneMetadata.getGeneralDesc())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (A(str, phonemetadata$PhoneMetadata.getPremiumRate())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (A(str, phonemetadata$PhoneMetadata.getTollFree())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (A(str, phonemetadata$PhoneMetadata.getSharedCost())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (A(str, phonemetadata$PhoneMetadata.getVoip())) {
            return PhoneNumberType.VOIP;
        }
        if (A(str, phonemetadata$PhoneMetadata.getPersonalNumber())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (A(str, phonemetadata$PhoneMetadata.getPager())) {
            return PhoneNumberType.PAGER;
        }
        if (A(str, phonemetadata$PhoneMetadata.getUan())) {
            return PhoneNumberType.UAN;
        }
        if (A(str, phonemetadata$PhoneMetadata.getVoicemail())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (!A(str, phonemetadata$PhoneMetadata.getFixedLine())) {
            return (phonemetadata$PhoneMetadata.getSameMobileAndFixedLinePattern() || !A(str, phonemetadata$PhoneMetadata.getMobile())) ? PhoneNumberType.UNKNOWN : PhoneNumberType.MOBILE;
        }
        if (!phonemetadata$PhoneMetadata.getSameMobileAndFixedLinePattern() && !A(str, phonemetadata$PhoneMetadata.getMobile())) {
            return PhoneNumberType.FIXED_LINE;
        }
        return PhoneNumberType.FIXED_LINE_OR_MOBILE;
    }

    public String t(int i2) {
        List<String> list = this.f9447b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : list.get(0);
    }

    public String u(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int countryCode = phonenumber$PhoneNumber.getCountryCode();
        List<String> list = this.f9447b.get(Integer.valueOf(countryCode));
        if (list != null) {
            return list.size() == 1 ? list.get(0) : v(phonenumber$PhoneNumber, list);
        }
        h.log(Level.INFO, "Missing/invalid country_code (" + countryCode + ")");
        return null;
    }

    public final String v(Phonenumber$PhoneNumber phonenumber$PhoneNumber, List<String> list) {
        String strQ = q(phonenumber$PhoneNumber);
        for (String str : list) {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadataO = o(str);
            if (phonemetadata$PhoneMetadataO.hasLeadingDigits()) {
                if (this.e.a(phonemetadata$PhoneMetadataO.getLeadingDigits()).matcher(strQ).lookingAt()) {
                    return str;
                }
            } else if (s(strQ, phonemetadata$PhoneMetadataO) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    public final boolean w(int i2) {
        return this.f9447b.containsKey(Integer.valueOf(i2));
    }

    public final boolean x(Phonenumber$PhoneNumber phonenumber$PhoneNumber, Phonenumber$PhoneNumber phonenumber$PhoneNumber2) {
        String strValueOf = String.valueOf(phonenumber$PhoneNumber.getNationalNumber());
        String strValueOf2 = String.valueOf(phonenumber$PhoneNumber2.getNationalNumber());
        return strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf);
    }

    public MatchType y(Phonenumber$PhoneNumber phonenumber$PhoneNumber, Phonenumber$PhoneNumber phonenumber$PhoneNumber2) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumberD = d(phonenumber$PhoneNumber);
        Phonenumber$PhoneNumber phonenumber$PhoneNumberD2 = d(phonenumber$PhoneNumber2);
        if (phonenumber$PhoneNumberD.hasExtension() && phonenumber$PhoneNumberD2.hasExtension() && !phonenumber$PhoneNumberD.getExtension().equals(phonenumber$PhoneNumberD2.getExtension())) {
            return MatchType.NO_MATCH;
        }
        int countryCode = phonenumber$PhoneNumberD.getCountryCode();
        int countryCode2 = phonenumber$PhoneNumberD2.getCountryCode();
        if (countryCode != 0 && countryCode2 != 0) {
            if (phonenumber$PhoneNumberD.exactlySameAs(phonenumber$PhoneNumberD2)) {
                return MatchType.EXACT_MATCH;
            }
            return (countryCode == countryCode2 && x(phonenumber$PhoneNumberD, phonenumber$PhoneNumberD2)) ? MatchType.SHORT_NSN_MATCH : MatchType.NO_MATCH;
        }
        phonenumber$PhoneNumberD.setCountryCode(countryCode2);
        if (phonenumber$PhoneNumberD.exactlySameAs(phonenumber$PhoneNumberD2)) {
            return MatchType.NSN_MATCH;
        }
        return x(phonenumber$PhoneNumberD, phonenumber$PhoneNumberD2) ? MatchType.SHORT_NSN_MATCH : MatchType.NO_MATCH;
    }

    public MatchType z(Phonenumber$PhoneNumber phonenumber$PhoneNumber, CharSequence charSequence) {
        try {
            return y(phonenumber$PhoneNumber, Q(charSequence, "ZZ"));
        } catch (NumberParseException e) {
            if (e.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                String strT = t(phonenumber$PhoneNumber.getCountryCode());
                try {
                    if (!strT.equals("ZZ")) {
                        MatchType matchTypeY = y(phonenumber$PhoneNumber, Q(charSequence, strT));
                        return matchTypeY == MatchType.EXACT_MATCH ? MatchType.NSN_MATCH : matchTypeY;
                    }
                    Phonenumber$PhoneNumber phonenumber$PhoneNumber2 = new Phonenumber$PhoneNumber();
                    S(charSequence, null, false, false, phonenumber$PhoneNumber2);
                    return y(phonenumber$PhoneNumber, phonenumber$PhoneNumber2);
                } catch (NumberParseException unused) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }
}
