package defpackage;

import android.icu.text.AlphabeticIndex;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class xdo {
    private static xdo f;
    private final b g;
    private final Locale k;
    private String n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale f52741a = new Locale("ar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale f52742b = new Locale("fa");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale f52743c = new Locale("el");
    public static final Locale e = new Locale("he");
    public static final Locale j = new Locale("th");
    public static final Locale h = new Locale("uk");
    public static final Locale d = new Locale("hi");
    private static final String i = Locale.JAPANESE.getLanguage();

    static class d extends b {
        d(Locale locale) {
            super(locale);
        }
    }

    private xdo(Locale locale) {
        if (locale == null) {
            this.k = Locale.getDefault();
        } else {
            this.k = locale;
        }
        String language = this.k.getLanguage();
        this.n = language;
        if (language.equals(i)) {
            this.g = new e(this.k);
        } else if (this.k.equals(Locale.CHINA)) {
            this.g = new d(this.k);
        } else {
            this.g = new b(this.k);
        }
    }

    public static xdo d() {
        xdo xdoVar;
        synchronized (xdo.class) {
            xdo xdoVar2 = f;
            if (xdoVar2 == null || !xdoVar2.d(Locale.getDefault())) {
                f = new xdo(null);
            }
            xdoVar = f;
        }
        return xdoVar;
    }

    public int a(String str) {
        return this.g.c(str);
    }

    public String a(int i2) {
        return this.g.c(i2);
    }

    public String b(String str) {
        char cCharAt;
        char cCharAt2;
        if (!TextUtils.isEmpty(str)) {
            if ("TW".equals(this.k.getCountry()) && (cCharAt2 = d(str).charAt(0)) >= 12549 && cCharAt2 <= 12585) {
                return String.valueOf(cCharAt2);
            }
            if ("ar".equals(this.k.getLanguage()) && (cCharAt = d(str).charAt(0)) < 1574 && cCharAt > 1569) {
                return "آ";
            }
        }
        return a(a(d(str)));
    }

    public String d(String str) {
        return this.g.b(str);
    }

    public boolean d(Locale locale) {
        return this.k.equals(locale);
    }

    static class e extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Set<Character.UnicodeBlock> f52746b;
        private final int d;

        static {
            HashSet hashSet = new HashSet();
            hashSet.add(Character.UnicodeBlock.HIRAGANA);
            hashSet.add(Character.UnicodeBlock.KATAKANA);
            hashSet.add(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS);
            hashSet.add(Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
            hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
            hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
            hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
            hashSet.add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
            hashSet.add(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
            hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY);
            hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS);
            hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
            hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
            f52746b = Collections.unmodifiableSet(hashSet);
        }

        e(Locale locale) {
            super(locale);
            this.d = super.c("日");
        }

        private static boolean e(int i) {
            return f52746b.contains(Character.UnicodeBlock.of(i));
        }

        @Override // xdo.b
        public int c(String str) {
            int iC = super.c(str);
            return ((iC != this.d || e(Character.codePointAt(str, 0))) && iC <= this.d) ? iC : iC + 1;
        }

        @Override // xdo.b
        public int e() {
            return super.e() + 1;
        }

        @Override // xdo.b
        public String c(int i) {
            int i2 = this.d;
            if (i == i2) {
                return "他";
            }
            if (i > i2) {
                i--;
            }
            return super.c(i);
        }
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected AlphabeticIndex.ImmutableIndex f52745c;
        private final Locale d;
        private int e;

        b(Locale locale) {
            this.f52745c = null;
            this.e = 0;
            this.f52744b = 0;
            this.d = locale;
            AlphabeticIndex.ImmutableIndex immutableIndexBuildImmutableIndex = new AlphabeticIndex(locale).setMaxLabelCount(300).addLabels(Locale.ENGLISH).addLabels(Locale.JAPANESE).addLabels(Locale.KOREAN).addLabels(xdo.j).addLabels("fa".equals(locale.getLanguage()) ? xdo.f52742b : xdo.f52741a).addLabels(xdo.e).addLabels(xdo.f52743c).addLabels(xdo.h).addLabels(xdo.d).buildImmutableIndex();
            this.f52745c = immutableIndexBuildImmutableIndex;
            int bucketCount = immutableIndexBuildImmutableIndex.getBucketCount();
            this.f52744b = bucketCount;
            this.e = bucketCount - 1;
        }

        private boolean e(int i) {
            return (!Character.isSpaceChar(i) && i != 43) && (i != 40) && (i != 35) && ((i != 41 && i != 46) & (i != 45));
        }

        public String b(String str) {
            return str;
        }

        public int c(String str) {
            if (str == null) {
                Log.w("HwSectionLocaleUtils", "getBucketIndex: displayName is null!");
                return -1;
            }
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = Character.codePointAt(str, iCharCount);
                if (Character.isDigit(iCodePointAt) || e(iCodePointAt)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            int bucketIndex = this.f52745c.getBucketIndex(str);
            if (bucketIndex < 0) {
                return -1;
            }
            if (bucketIndex >= this.e) {
                return bucketIndex + 1;
            }
            if ("TW".equals(this.d.getCountry()) && length > iCharCount) {
                int iCodePointAt2 = Character.codePointAt(str, iCharCount);
                if (iCodePointAt2 >= 12549 && iCodePointAt2 <= 12573) {
                    return iCodePointAt2 - 12548;
                }
                if (iCodePointAt2 >= 12573 && iCodePointAt2 <= 12585) {
                    return iCodePointAt2 - 12549;
                }
            }
            return bucketIndex;
        }

        public int e() {
            return this.f52744b + 1;
        }

        public String c(int i) {
            if (i < 0 || i >= e()) {
                return "";
            }
            if (i == 0) {
                return "#";
            }
            if (i > this.e) {
                i--;
            }
            return this.f52745c.getBucket(i) == null ? "" : this.f52745c.getBucket(i).getLabel();
        }
    }
}
