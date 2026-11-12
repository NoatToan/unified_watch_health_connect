package g6;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.audio.WavUtil;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/a;", "", "a", "value", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1525a f75987b = new C1525a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75988a;

    private /* synthetic */ a(long j8) {
        this.f75988a = j8;
    }

    public static final /* synthetic */ a a(long j8) {
        return new a(j8);
    }

    public static final long b(int i14, int i15, int i16, int i17) {
        if (i15 < i14 || i17 < i16 || i14 < 0 || i16 < 0) {
            j.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i14, i15, i16, i17);
    }

    public static /* synthetic */ long c(int i14, int i15, int i16, int i17, int i18, long j8) {
        if ((i18 & 1) != 0) {
            i14 = l(j8);
        }
        if ((i18 & 2) != 0) {
            i15 = j(j8);
        }
        if ((i18 & 4) != 0) {
            i16 = k(j8);
        }
        if ((i18 & 8) != 0) {
            i17 = i(j8);
        }
        return b(i14, i15, i16, i17);
    }

    public static final boolean d(long j8, long j14) {
        return j8 == j14;
    }

    public static final boolean e(long j8) {
        int i14 = (int) (3 & j8);
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        return (((int) (j8 >> (i15 + 46))) & ((1 << (18 - i15)) - 1)) != 0;
    }

    public static final boolean f(long j8) {
        int i14 = (int) (3 & j8);
        return (((int) (j8 >> 33)) & ((1 << fb1.c.d((i14 & 2) >> 1, 3, (i14 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean g(long j8) {
        int i14 = (int) (3 & j8);
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        int i16 = (1 << (18 - i15)) - 1;
        int i17 = ((int) (j8 >> (i15 + 15))) & i16;
        int i18 = ((int) (j8 >> (i15 + 46))) & i16;
        return i17 == (i18 == 0 ? Integer.MAX_VALUE : i18 - 1);
    }

    public static final boolean h(long j8) {
        int i14 = (int) (3 & j8);
        int iD = (1 << fb1.c.d((i14 & 2) >> 1, 3, (i14 & 1) << 1, 13)) - 1;
        int i15 = ((int) (j8 >> 2)) & iD;
        int i16 = ((int) (j8 >> 33)) & iD;
        return i15 == (i16 == 0 ? Integer.MAX_VALUE : i16 - 1);
    }

    public static final int i(long j8) {
        int i14 = (int) (3 & j8);
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        int i16 = ((int) (j8 >> (i15 + 46))) & ((1 << (18 - i15)) - 1);
        if (i16 == 0) {
            return Integer.MAX_VALUE;
        }
        return i16 - 1;
    }

    public static final int j(long j8) {
        int i14 = (int) (3 & j8);
        int i15 = (int) (j8 >> 33);
        int iD = i15 & ((1 << fb1.c.d((i14 & 2) >> 1, 3, (i14 & 1) << 1, 13)) - 1);
        if (iD == 0) {
            return Integer.MAX_VALUE;
        }
        return iD - 1;
    }

    public static final int k(long j8) {
        int i14 = (int) (3 & j8);
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        return ((int) (j8 >> (i15 + 15))) & ((1 << (18 - i15)) - 1);
    }

    public static final int l(long j8) {
        int i14 = (int) (3 & j8);
        return ((int) (j8 >> 2)) & ((1 << fb1.c.d((i14 & 2) >> 1, 3, (i14 & 1) << 1, 13)) - 1);
    }

    public static final boolean m(long j8) {
        int i14 = (int) (3 & j8);
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        return ((((int) (j8 >> 33)) & ((1 << (i15 + 13)) - 1)) - 1 == 0) | ((((int) (j8 >> (i15 + 46))) & ((1 << (18 - i15)) - 1)) - 1 == 0);
    }

    public static String n(long j8) {
        int iJ = j(j8);
        String strValueOf = iJ == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iJ);
        int i14 = i(j8);
        String strValueOf2 = i14 != Integer.MAX_VALUE ? String.valueOf(i14) : "Infinity";
        StringBuilder sb3 = new StringBuilder("Constraints(minWidth = ");
        sb3.append(l(j8));
        sb3.append(", maxWidth = ");
        sb3.append(strValueOf);
        sb3.append(", minHeight = ");
        sb3.append(k(j8));
        sb3.append(", maxHeight = ");
        return a0.m(sb3, strValueOf2, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f75988a == ((a) obj).f75988a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75988a);
    }

    public final String toString() {
        return n(this.f75988a);
    }

    /* JADX INFO: renamed from: g6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg6/a$a;", "", "<init>", "()V", "", "Infinity", "I", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1525a {
        public /* synthetic */ C1525a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(int i14, int i15, int i16, int i17) {
            int i18 = 262142;
            int iMin = Math.min(i16, 262142);
            int iMin2 = i17 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i17, 262142);
            int i19 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i19 >= 8191) {
                if (i19 < 32767) {
                    i18 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i19 < 65535) {
                    i18 = 32766;
                } else {
                    if (i19 >= 262143) {
                        b.l(i19);
                        o2.c.f();
                        return 0L;
                    }
                    i18 = 8190;
                }
            }
            return b.a(Math.min(i18, i14), i15 != Integer.MAX_VALUE ? Math.min(i18, i15) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public static long b(int i14, int i15, int i16, int i17) {
            int i18 = 262142;
            int iMin = Math.min(i14, 262142);
            int iMin2 = i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i15, 262142);
            int i19 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i19 >= 8191) {
                if (i19 < 32767) {
                    i18 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i19 < 65535) {
                    i18 = 32766;
                } else {
                    if (i19 >= 262143) {
                        b.l(i19);
                        o2.c.f();
                        return 0L;
                    }
                    i18 = 8190;
                }
            }
            return b.a(iMin, iMin2, Math.min(i18, i16), i17 != Integer.MAX_VALUE ? Math.min(i18, i17) : Integer.MAX_VALUE);
        }

        public static long c(int i14, int i15) {
            if (!((i15 >= 0) & (i14 >= 0))) {
                j.a("width and height must be >= 0");
            }
            return b.h(i14, i14, i15, i15);
        }

        private C1525a() {
        }
    }
}
