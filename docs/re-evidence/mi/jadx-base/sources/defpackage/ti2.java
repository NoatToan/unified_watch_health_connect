package defpackage;

import android.text.SpannableStringBuilder;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class ti2 {
    public static final s7p d;
    public static final String e;
    public static final String f;
    public static final ti2 g;
    public static final ti2 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34724b;
    public final s7p c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34726b;
        public s7p c;

        public a() {
            c(ti2.e(Locale.getDefault()));
        }

        public static ti2 b(boolean z) {
            return z ? ti2.h : ti2.g;
        }

        public ti2 a() {
            return (this.f34726b == 2 && this.c == ti2.d) ? b(this.f34725a) : new ti2(this.f34725a, this.f34726b, this.c);
        }

        public final void c(boolean z) {
            this.f34725a = z;
            this.c = ti2.d;
            this.f34726b = 2;
        }
    }

    public static class b {
        public static final byte[] f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f34727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f34728b;
        public final int c;
        public int d;
        public char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.f34727a = charSequence;
            this.f34728b = z;
            this.c = charSequence.length();
        }

        public static byte c(char c) {
            return c < 1792 ? f[c] : Character.getDirectionality(c);
        }

        public byte a() {
            char cCharAt = this.f34727a.charAt(this.d - 1);
            this.e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f34727a, this.d);
                this.d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.d--;
            byte bC = c(this.e);
            if (!this.f34728b) {
                return bC;
            }
            char c = this.e;
            if (c == '>') {
                return h();
            }
            return c == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f34727a.charAt(this.d);
            this.e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f34727a, this.d);
                this.d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.d++;
            byte bC = c(this.e);
            if (!this.f34728b) {
                return bC;
            }
            char c = this.e;
            if (c == '<') {
                return i();
            }
            return c == '&' ? g() : bC;
        }

        public int d() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                    default:
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int e() {
            this.d = this.c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
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

        public final byte f() {
            char cCharAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f34727a;
                int i3 = i2 - 1;
                this.d = i3;
                cCharAt = charSequence.charAt(i3);
                this.e = cCharAt;
                if (cCharAt == '&') {
                    return AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
            } while (cCharAt != ';');
            this.d = i;
            this.e = ';';
            return HMProSyncDataBaseProfile.DATA_TYPE_PAI;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i = this.d;
                if (i >= this.c) {
                    return AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                CharSequence charSequence = this.f34727a;
                this.d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.e = cCharAt;
            } while (cCharAt != ';');
            return AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
        }

        public final byte h() {
            char cCharAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f34727a;
                int i3 = i2 - 1;
                this.d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.e = cCharAt2;
                if (cCharAt2 == '<') {
                    return AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f34727a;
                        int i5 = i4 - 1;
                        this.d = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.d = i;
            this.e = Typography.greater;
            return HMProSyncDataBaseProfile.DATA_TYPE_PAI;
        }

        public final byte i() {
            char cCharAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 >= this.c) {
                    this.d = i;
                    this.e = Typography.less;
                    return HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                CharSequence charSequence = this.f34727a;
                this.d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.e = cCharAt2;
                if (cCharAt2 == '>') {
                    return AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.d;
                        if (i3 >= this.c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f34727a;
                        this.d = i3 + 1;
                        cCharAt = charSequence2.charAt(i3);
                        this.e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        s7p s7pVar = t7p.c;
        d = s7pVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        g = new ti2(false, 2, s7pVar);
        h = new ti2(true, 2, s7pVar);
    }

    public ti2(boolean z, int i, s7p s7pVar) {
        this.f34723a = z;
        this.f34724b = i;
        this.c = s7pVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static ti2 c() {
        return new a().a();
    }

    public static boolean e(Locale locale) {
        return q8p.a(locale) == 1;
    }

    public boolean d() {
        return (this.f34724b & 2) != 0;
    }

    public final String f(CharSequence charSequence, s7p s7pVar) {
        boolean zA = s7pVar.a(charSequence, 0, charSequence.length());
        if (!this.f34723a && (zA || b(charSequence) == 1)) {
            return e;
        }
        if (this.f34723a) {
            return (!zA || b(charSequence) == -1) ? f : "";
        }
        return "";
    }

    public final String g(CharSequence charSequence, s7p s7pVar) {
        boolean zA = s7pVar.a(charSequence, 0, charSequence.length());
        if (!this.f34723a && (zA || a(charSequence) == 1)) {
            return e;
        }
        if (this.f34723a) {
            return (!zA || a(charSequence) == -1) ? f : "";
        }
        return "";
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, s7p s7pVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = s7pVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? t7p.f34430b : t7p.f34429a));
        }
        if (zA != this.f34723a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? t7p.f34430b : t7p.f34429a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.c, true);
    }

    public String k(String str, s7p s7pVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, s7pVar, z).toString();
    }
}
