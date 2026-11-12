package e53;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.C;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Le53/j;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements Comparable<j>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f63112c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f63113d = new j(-31557014167219200L, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f63114e = new j(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63116b;

    public j(long j8, int i14) {
        this.f63115a = j8;
        this.f63116b = i14;
        if (-31557014167219200L > j8 || j8 >= 31556889864403200L) {
            vb.h.s("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        jVar.getClass();
        int i14 = s.i(this.f63115a, jVar.f63115a);
        return i14 != 0 ? i14 : s.h(this.f63116b, jVar.f63116b);
    }

    public final j b(long j8) {
        c.a aVar = c.f63094b;
        long j14 = c.j(j8, f.SECONDS);
        int iF = c.f(j8);
        if (j14 == 0 && iF == 0) {
            return this;
        }
        long j15 = this.f63115a;
        long j16 = j15 + j14;
        if ((j15 ^ j16) < 0 && (j14 ^ j15) >= 0) {
            return j8 > 0 ? f63114e : f63113d;
        }
        long j17 = this.f63116b + iF;
        f63112c.getClass();
        return a.b(j16, j17);
    }

    public final long c() {
        long j8 = this.f63115a;
        int i14 = this.f63116b;
        long j14 = 1000;
        if (j8 >= 0) {
            if (j8 != 1) {
                if (j8 != 0) {
                    long j15 = j8 * 1000;
                    if (j15 / 1000 != j8) {
                        return Long.MAX_VALUE;
                    }
                    j14 = j15;
                } else {
                    j14 = 0;
                }
            }
            long j16 = i14 / 1000000;
            long j17 = j14 + j16;
            if ((j14 ^ j17) >= 0 || (j16 ^ j14) < 0) {
                return j17;
            }
            return Long.MAX_VALUE;
        }
        long j18 = j8 + 1;
        if (j18 != 1) {
            if (j18 != 0) {
                long j19 = j18 * 1000;
                if (j19 / 1000 != j18) {
                    return Long.MIN_VALUE;
                }
                j14 = j19;
            } else {
                j14 = 0;
            }
        }
        long j24 = (i14 / 1000000) - 1000;
        long j25 = j14 + j24;
        if ((j14 ^ j25) >= 0 || (j24 ^ j14) < 0) {
            return j25;
        }
        return Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f63115a == jVar.f63115a && this.f63116b == jVar.f63116b;
    }

    public final int hashCode() {
        return (this.f63116b * 51) + Long.hashCode(this.f63115a);
    }

    public final String toString() {
        int[] iArr;
        StringBuilder sb3 = new StringBuilder();
        r.f63131h.getClass();
        long j8 = this.f63115a;
        long j14 = j8 / 86400;
        long j15 = 0;
        if ((j8 ^ 86400) < 0 && j14 * 86400 != j8) {
            j14--;
        }
        long j16 = j8 % 86400;
        int i14 = (int) (j16 + (86400 & (((j16 ^ 86400) & ((-j16) | j16)) >> 63)));
        long j17 = (j14 + ((long) 719528)) - ((long) 60);
        if (j17 < 0) {
            long j18 = 146097;
            long j19 = ((j17 + 1) / j18) - 1;
            j15 = ((long) 400) * j19;
            j17 += (-j19) * j18;
        }
        long j24 = 400;
        long j25 = ((j24 * j17) + ((long) 591)) / ((long) 146097);
        long j26 = 365;
        long j27 = 4;
        long j28 = 100;
        long j29 = j17 - ((j25 / j24) + (((j25 / j27) + (j26 * j25)) - (j25 / j28)));
        if (j29 < 0) {
            j25--;
            j29 = j17 - ((j25 / j24) + (((j25 / j27) + (j26 * j25)) - (j25 / j28)));
        }
        int i15 = (int) j29;
        int i16 = ((i15 * 5) + 2) / 153;
        int i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        int i18 = i14 - (i17 * DateTimeConstants.SECONDS_PER_HOUR);
        int i19 = i18 / 60;
        r rVar = new r((int) (j25 + j15 + ((long) (i16 / 10))), ((i16 + 2) % 12) + 1, (i15 - (((i16 * 306) + 5) / 10)) + 1, i17, i19, i18 - (i19 * 60), this.f63116b);
        int i24 = rVar.f63132a;
        int i25 = 0;
        if (Math.abs(i24) < 1000) {
            StringBuilder sb4 = new StringBuilder();
            if (i24 >= 0) {
                sb4.append(i24 + 10000);
                sb4.deleteCharAt(0).getClass();
            } else {
                sb4.append(i24 - 10000);
                sb4.deleteCharAt(1).getClass();
            }
            sb3.append((CharSequence) sb4);
        } else {
            if (i24 >= 10000) {
                sb3.append('+');
            }
            sb3.append(i24);
        }
        sb3.append('-');
        l.a(sb3, sb3, rVar.f63133b);
        sb3.append('-');
        l.a(sb3, sb3, rVar.f63134c);
        sb3.append('T');
        l.a(sb3, sb3, rVar.f63135d);
        sb3.append(CoreConstants.COLON_CHAR);
        l.a(sb3, sb3, rVar.f63136e);
        sb3.append(CoreConstants.COLON_CHAR);
        l.a(sb3, sb3, rVar.f63137f);
        int i26 = rVar.f63138g;
        if (i26 != 0) {
            sb3.append('.');
            while (true) {
                int i27 = i25 + 1;
                iArr = l.f63118a;
                if (i26 % iArr[i27] != 0) {
                    break;
                }
                i25 = i27;
            }
            int i28 = i25 - (i25 % 3);
            String strValueOf = String.valueOf((i26 / iArr[i28]) + iArr[9 - i28]);
            strValueOf.getClass();
            sb3.append(strValueOf.substring(1));
        }
        sb3.append('Z');
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le53/j$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(long j8) {
            long j14 = j8 / 1000;
            if ((j8 ^ 1000) < 0 && j14 * 1000 != j8) {
                j14--;
            }
            long j15 = j8 % 1000;
            int i14 = (int) ((j15 + (1000 & (((j15 ^ 1000) & ((-j15) | j15)) >> 63))) * ((long) 1000000));
            if (j14 < -31557014167219200L) {
                return j.f63113d;
            }
            return j14 > 31556889864403199L ? j.f63114e : b(j14, i14);
        }

        public static j b(long j8, long j14) {
            long j15 = j14 / C.NANOS_PER_SECOND;
            if ((j14 ^ C.NANOS_PER_SECOND) < 0 && j15 * C.NANOS_PER_SECOND != j14) {
                j15--;
            }
            long j16 = j8 + j15;
            if ((j8 ^ j16) < 0 && (j15 ^ j8) >= 0) {
                if (j8 > 0) {
                    j.f63112c.getClass();
                    return j.f63114e;
                }
                j.f63112c.getClass();
                return j.f63113d;
            }
            if (j16 < -31557014167219200L) {
                return j.f63113d;
            }
            if (j16 > 31556889864403199L) {
                return j.f63114e;
            }
            long j17 = j14 % C.NANOS_PER_SECOND;
            return new j(j16, (int) (j17 + ((((j17 ^ C.NANOS_PER_SECOND) & ((-j17) | j17)) >> 63) & C.NANOS_PER_SECOND)));
        }

        private a() {
        }
    }
}
