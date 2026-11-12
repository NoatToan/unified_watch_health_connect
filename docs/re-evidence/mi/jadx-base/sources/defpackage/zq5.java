package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.TimeZone;
import miuix.pickerwidget.date.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class zq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3i.e<Calendar> f41561a = r3i.b(new a(), 1);

    public class a extends r3i.d<Calendar> {
        @Override // r3i.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar a() {
            return new Calendar();
        }
    }

    public static String a(Context context, long j, int i) {
        StringBuilder sbAcquire = r3i.c().acquire();
        String string = b(context, sbAcquire, j, i, null).toString();
        r3i.c().release(sbAcquire);
        return string;
    }

    public static StringBuilder b(Context context, StringBuilder sb, long j, int i, TimeZone timeZone) {
        if ((i & 16) == 0 && (i & 32) == 0) {
            i |= DateFormat.is24HourFormat(context) ? 32 : 16;
        }
        String string = context.getString(d(i));
        StringBuilder sbAcquire = r3i.c().acquire();
        Calendar calendarAcquire = f41561a.acquire();
        calendarAcquire.setTimeZone(timeZone);
        calendarAcquire.setTimeInMillis(j);
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = string.charAt(i2);
            if (cCharAt == 'D') {
                sbAcquire.append(context.getString(c(i)));
            } else if (cCharAt == 'T') {
                sbAcquire.append(context.getString(e(calendarAcquire, i)));
            } else if (cCharAt != 'W') {
                sbAcquire.append(cCharAt);
            } else {
                sbAcquire.append(context.getString(f(i)));
            }
        }
        calendarAcquire.format(context, sb, sbAcquire);
        r3i.c().release(sbAcquire);
        f41561a.release(calendarAcquire);
        return sb;
    }

    public static int c(int i) {
        if ((i & 32768) == 32768) {
            if ((i & 512) == 512) {
                if ((i & 256) == 256) {
                    return (i & 128) == 128 ? b2j.f3719r : b2j.q;
                }
                return b2j.p;
            }
            if ((i & 256) == 256) {
                return (i & 128) == 128 ? b2j.o : b2j.n;
            }
            if ((i & 128) == 128) {
                return b2j.m;
            }
            throw new IllegalArgumentException("no any time date");
        }
        if ((i & 4096) == 4096) {
            if ((i & 512) == 512) {
                if ((i & 256) == 256) {
                    return (i & 128) == 128 ? b2j.v : b2j.u;
                }
                return b2j.z;
            }
            if ((i & 256) == 256) {
                return (i & 128) == 128 ? b2j.t : b2j.s;
            }
            if ((i & 128) == 128) {
                return b2j.h;
            }
            throw new IllegalArgumentException("no any time date");
        }
        if ((i & 512) == 512) {
            if ((i & 256) == 256) {
                return (i & 128) == 128 ? b2j.l : b2j.f3718k;
            }
            return b2j.z;
        }
        if ((i & 256) == 256) {
            return (i & 128) == 128 ? b2j.j : b2j.i;
        }
        if ((i & 128) == 128) {
            return b2j.h;
        }
        throw new IllegalArgumentException("no any time date");
    }

    public static int d(int i) {
        if ((i & 1024) == 1024) {
            if ((i & 896) != 0) {
                if ((i & 15) != 0) {
                    return (i & 2048) == 2048 ? b2j.Y : b2j.X;
                }
                return (i & 2048) == 2048 ? b2j.Z : b2j.W;
            }
            if ((i & 15) != 0) {
                return (i & 2048) == 2048 ? b2j.d0 : b2j.c0;
            }
            return (i & 2048) == 2048 ? b2j.e0 : b2j.V;
        }
        if ((i & 896) != 0) {
            if ((i & 15) != 0) {
                return (i & 2048) == 2048 ? b2j.x : b2j.w;
            }
            return (i & 2048) == 2048 ? b2j.y : b2j.g;
        }
        if ((i & 15) != 0) {
            return (i & 2048) == 2048 ? b2j.T : b2j.A;
        }
        return (i & 2048) == 2048 ? b2j.U : b2j.e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b A[PHI: r0
      0x003b: PHI (r0v8 int) = (r0v6 int), (r0v7 int), (r0v7 int), (r0v6 int) binds: [B:15:0x0028, B:17:0x0032, B:19:0x0036, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static int e(Calendar calendar, int i) {
        if ((i & 16384) == 16384 && (((i & 1) != 1 || calendar.get(22) == 0) && (i & 14) != 0)) {
            int i2 = i & (-2);
            if (((i & 2) != 2 || calendar.get(21) == 0) && (i & 12) != 0) {
                i2 = i & (-4);
                if (calendar.get(20) != 0 || (i & 8) == 0) {
                    i = i2;
                } else {
                    i &= -8;
                }
            } else {
                i = i2;
            }
        }
        if ((i & 8) != 8) {
            if ((i & 4) == 4) {
                if ((i & 2) == 2) {
                    return (i & 1) == 1 ? b2j.Q : b2j.P;
                }
                return b2j.O;
            }
            if ((i & 2) == 2) {
                return (i & 1) == 1 ? b2j.S : b2j.R;
            }
            if ((i & 1) == 1) {
                return b2j.N;
            }
            throw new IllegalArgumentException("no any time date");
        }
        if ((i & 16) != 16) {
            if ((i & 4) != 4) {
                return b2j.J;
            }
            if ((i & 2) == 2) {
                return (i & 1) == 1 ? b2j.M : b2j.L;
            }
            return b2j.K;
        }
        if ((i & 64) == 64) {
            if ((i & 4) != 4) {
                return b2j.B;
            }
            if ((i & 2) == 2) {
                return (i & 1) == 1 ? b2j.F : b2j.E;
            }
            return b2j.C;
        }
        if ((i & 4) != 4) {
            return b2j.I;
        }
        if ((i & 2) == 2) {
            return (i & 1) == 1 ? b2j.G : b2j.H;
        }
        return b2j.D;
    }

    public static int f(int i) {
        return (i & 8192) == 8192 ? b2j.b0 : b2j.a0;
    }
}
