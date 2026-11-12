package j7;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d.e f97429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f97430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f97431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f97432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f97433h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f97436c;

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f97440f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f97441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f97443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f97444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f97445e;

        static {
            for (int i14 = 0; i14 < 1792; i14++) {
                f97440f[i14] = Character.getDirectionality(i14);
            }
        }

        public b(CharSequence charSequence, boolean z14) {
            this.f97441a = charSequence;
            this.f97442b = z14;
            this.f97443c = charSequence.length();
        }

        public final byte a() {
            char cCharAt;
            char cCharAt2;
            int i14 = this.f97444d - 1;
            CharSequence charSequence = this.f97441a;
            char cCharAt3 = charSequence.charAt(i14);
            this.f97445e = cCharAt3;
            boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt3);
            int i15 = this.f97444d;
            if (zIsLowSurrogate) {
                int iCodePointBefore = Character.codePointBefore(charSequence, i15);
                this.f97444d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f97444d = i15 - 1;
            char c14 = this.f97445e;
            byte directionality = c14 < 1792 ? f97440f[c14] : Character.getDirectionality(c14);
            if (this.f97442b) {
                char c15 = this.f97445e;
                if (c15 == '>') {
                    int i16 = this.f97444d;
                    while (true) {
                        int i17 = this.f97444d;
                        if (i17 <= 0) {
                            break;
                        }
                        int i18 = i17 - 1;
                        this.f97444d = i18;
                        char cCharAt4 = charSequence.charAt(i18);
                        this.f97445e = cCharAt4;
                        if (cCharAt4 == '<') {
                            return Ascii.FF;
                        }
                        if (cCharAt4 == '>') {
                            break;
                        }
                        if (cCharAt4 == '\"' || cCharAt4 == '\'') {
                            do {
                                int i19 = this.f97444d;
                                if (i19 <= 0) {
                                    break;
                                }
                                int i24 = i19 - 1;
                                this.f97444d = i24;
                                cCharAt2 = charSequence.charAt(i24);
                                this.f97445e = cCharAt2;
                            } while (cCharAt2 != cCharAt4);
                        }
                    }
                    this.f97444d = i16;
                    this.f97445e = '>';
                    return Ascii.CR;
                }
                if (c15 == ';') {
                    int i25 = this.f97444d;
                    do {
                        int i26 = this.f97444d;
                        if (i26 <= 0) {
                            break;
                        }
                        int i27 = i26 - 1;
                        this.f97444d = i27;
                        cCharAt = charSequence.charAt(i27);
                        this.f97445e = cCharAt;
                        if (cCharAt == '&') {
                            return Ascii.FF;
                        }
                    } while (cCharAt != ';');
                    this.f97444d = i25;
                    this.f97445e = ';';
                    return Ascii.CR;
                }
            }
            return directionality;
        }
    }

    static {
        d.e eVar = d.f97455c;
        f97429d = eVar;
        f97430e = Character.toString((char) 8206);
        f97431f = Character.toString((char) 8207);
        f97432g = new a(false, 2, eVar);
        f97433h = new a(true, 2, eVar);
    }

    public a(boolean z14, int i14, c cVar) {
        this.f97434a = z14;
        this.f97435b = i14;
        this.f97436c = cVar;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        char cCharAt;
        char cCharAt2;
        b bVar = new b(charSequence, false);
        bVar.f97444d = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = bVar.f97444d;
            int i18 = bVar.f97443c;
            if (i17 < i18 && i14 == 0) {
                CharSequence charSequence2 = bVar.f97441a;
                char cCharAt3 = charSequence2.charAt(i17);
                bVar.f97445e = cCharAt3;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt3);
                int i19 = bVar.f97444d;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i19);
                    bVar.f97444d = Character.charCount(iCodePointAt) + bVar.f97444d;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    bVar.f97444d = i19 + 1;
                    char c14 = bVar.f97445e;
                    directionality = c14 < 1792 ? b.f97440f[c14] : Character.getDirectionality(c14);
                    if (bVar.f97442b) {
                        char c15 = bVar.f97445e;
                        if (c15 == '<') {
                            int i24 = bVar.f97444d;
                            while (true) {
                                int i25 = bVar.f97444d;
                                if (i25 < i18) {
                                    bVar.f97444d = i25 + 1;
                                    char cCharAt4 = charSequence2.charAt(i25);
                                    bVar.f97445e = cCharAt4;
                                    if (cCharAt4 == '>') {
                                        directionality = 12;
                                    } else if (cCharAt4 == '\"' || cCharAt4 == '\'') {
                                        do {
                                            int i26 = bVar.f97444d;
                                            if (i26 >= i18) {
                                                break;
                                            }
                                            bVar.f97444d = i26 + 1;
                                            cCharAt2 = charSequence2.charAt(i26);
                                            bVar.f97445e = cCharAt2;
                                        } while (cCharAt2 != cCharAt4);
                                    }
                                } else {
                                    bVar.f97444d = i24;
                                    bVar.f97445e = '<';
                                    directionality = Ascii.CR;
                                }
                            }
                        } else if (c15 == '&') {
                            do {
                                int i27 = bVar.f97444d;
                                if (i27 < i18) {
                                    bVar.f97444d = i27 + 1;
                                    cCharAt = charSequence2.charAt(i27);
                                    bVar.f97445e = cCharAt;
                                }
                                directionality = 12;
                            } while (cCharAt != ';');
                            directionality = 12;
                        }
                    }
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i16 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i16++;
                                i15 = -1;
                                continue;
                            case 16:
                            case 17:
                                i16++;
                                i15 = 1;
                                continue;
                            case 18:
                                i16--;
                                i15 = 0;
                                continue;
                        }
                    }
                } else if (i16 == 0) {
                    return -1;
                }
                i14 = i16;
            }
        }
        if (i14 != 0) {
            if (i15 == 0) {
                while (bVar.f97444d > 0) {
                    switch (bVar.a()) {
                        case 14:
                        case 15:
                            if (i14 == i16) {
                                return -1;
                            }
                            i16--;
                            break;
                        case 16:
                        case 17:
                            if (i14 == i16) {
                                return 1;
                            }
                            i16--;
                            break;
                        case 18:
                            i16++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i15;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        b bVar = new b(charSequence, false);
        bVar.f97444d = bVar.f97443c;
        int i14 = 0;
        while (true) {
            int i15 = i14;
            while (bVar.f97444d > 0) {
                byte bA = bVar.a();
                if (bA == 0) {
                    if (i14 == 0) {
                        return -1;
                    }
                    if (i15 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i14 == 0) {
                        return 1;
                    }
                    if (i15 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i15 == i14) {
                                return -1;
                            }
                            i14--;
                            break;
                        case 16:
                        case 17:
                            if (i15 == i14) {
                                return 1;
                            }
                            i14--;
                            break;
                        case 18:
                            i14++;
                            break;
                        default:
                            if (i15 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static a c() {
        C1860a c1860a = new C1860a();
        int i14 = c1860a.f97438b;
        if (i14 == 2 && c1860a.f97439c == f97429d) {
            return c1860a.f97437a ? f97433h : f97432g;
        }
        return new a(c1860a.f97437a, i14, c1860a.f97439c);
    }

    public final SpannableStringBuilder d(CharSequence charSequence, c cVar) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zB = ((d.AbstractC1861d) cVar).b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i14 = this.f97435b & 2;
        String str2 = "";
        String str3 = f97431f;
        String str4 = f97430e;
        boolean z14 = this.f97434a;
        if (i14 != 0) {
            boolean zB2 = (zB ? d.f97454b : d.f97453a).b(charSequence.length(), charSequence);
            if (z14 || !(zB2 || a(charSequence) == 1)) {
                str = (!z14 || (zB2 && a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zB != z14) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? d.f97454b : d.f97453a).b(charSequence.length(), charSequence);
        if (!z14 && (zB3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z14 && (!zB3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: j7.a$a, reason: collision with other inner class name */
    public static final class C1860a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f97438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d.e f97439c;

        public C1860a() {
            Locale locale = Locale.getDefault();
            d.e eVar = a.f97429d;
            this.f97437a = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
            this.f97439c = a.f97429d;
            this.f97438b = 2;
        }

        public C1860a(boolean z14) {
            this.f97437a = z14;
            this.f97439c = a.f97429d;
            this.f97438b = 2;
        }

        public C1860a(Locale locale) {
            d.e eVar = a.f97429d;
            this.f97437a = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
            this.f97439c = a.f97429d;
            this.f97438b = 2;
        }
    }
}
