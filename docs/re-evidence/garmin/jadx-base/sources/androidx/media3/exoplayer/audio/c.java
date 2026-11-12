package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.C;
import fa.z;
import j20.x;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import ka.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public fa.c I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f8770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f8772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f8776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f8780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f8788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f8792y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8793z;

    public interface a {
        void onInvalidLatency(long j8);

        void onPositionAdvancing(long j8);

        void onPositionFramesMismatch(long j8, long j14, long j15, long j16);

        void onSystemTimeUsMismatch(long j8, long j14, long j15, long j16);

        void onUnderrun(int i14, long j8);
    }

    public c(a aVar) {
        aVar.getClass();
        this.f8768a = aVar;
        try {
            this.f8780m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f8769b = new long[10];
        this.I = fa.c.f70004a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x019d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4 A[Catch: Exception -> 0x01da, TRY_LEAVE, TryCatch #0 {Exception -> 0x01da, blocks: (B:91:0x01b1, B:93:0x01d4), top: B:130:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    public final long a(boolean z14) {
        long j8;
        boolean z15;
        long jS;
        g gVar;
        g.a aVar;
        long j14;
        long j15;
        boolean z16;
        boolean timestamp;
        long j16;
        long j17;
        long jS2;
        long j18;
        long j19;
        long j24;
        Method method;
        long jMax;
        AudioTimestamp audioTimestamp;
        int i14;
        long j25;
        long j26;
        AudioTrack audioTrack = this.f8770c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        a aVar2 = this.f8768a;
        if (playState == 3) {
            long jNanoTime = this.I.nanoTime() / 1000;
            if (jNanoTime - this.f8779l >= 30000) {
                long jS3 = z.S(this.f8773f, b());
                if (jS3 == 0) {
                    j8 = 0;
                    z15 = true;
                } else {
                    int i15 = this.f8789v;
                    long jZ = z.z(jS3, this.f8776i) - jNanoTime;
                    long[] jArr = this.f8769b;
                    jArr[i15] = jZ;
                    this.f8789v = (this.f8789v + 1) % 10;
                    int i16 = this.f8790w;
                    if (i16 < 10) {
                        this.f8790w = i16 + 1;
                    }
                    this.f8779l = jNanoTime;
                    this.f8778k = 0L;
                    int i17 = 0;
                    while (true) {
                        int i18 = this.f8790w;
                        if (i17 >= i18) {
                            break;
                        }
                        this.f8778k = (jArr[i17] / ((long) i18)) + this.f8778k;
                        i17++;
                    }
                    if (this.f8774g) {
                        j8 = 0;
                        z15 = true;
                    } else {
                        gVar = this.f8772e;
                        gVar.getClass();
                        aVar = gVar.f103682a;
                        if (aVar != null) {
                            audioTimestamp = aVar.f103689b;
                            j15 = 500000;
                            j14 = 0;
                            if (jNanoTime - gVar.f103686e < gVar.f103685d) {
                                gVar.f103686e = jNanoTime;
                                timestamp = aVar.f103688a.getTimestamp(audioTimestamp);
                                if (timestamp) {
                                    j25 = audioTimestamp.framePosition;
                                    j26 = aVar.f103691d;
                                    if (j26 > j25) {
                                        if (aVar.f103693f) {
                                            aVar.f103694g += j26;
                                            aVar.f103693f = false;
                                        } else {
                                            aVar.f103690c++;
                                        }
                                    }
                                    aVar.f103691d = j25;
                                    aVar.f103692e = j25 + aVar.f103694g + (aVar.f103690c << 32);
                                }
                                i14 = gVar.f103683b;
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            if (i14 != 3) {
                                                if (i14 != 4) {
                                                    x.h();
                                                    return 0L;
                                                }
                                            } else if (timestamp) {
                                                gVar.a();
                                            }
                                        } else if (!timestamp) {
                                            gVar.a();
                                        }
                                    } else if (timestamp) {
                                        gVar.a();
                                    } else if (aVar.f103692e > gVar.f103687f) {
                                        gVar.b(2);
                                    }
                                    z16 = true;
                                } else if (timestamp) {
                                    z16 = true;
                                    if (jNanoTime - gVar.f103684c > 500000) {
                                        gVar.b(3);
                                    }
                                } else if (audioTimestamp.nanoTime / 1000 >= gVar.f103684c) {
                                    gVar.f103687f = aVar.f103692e;
                                    z16 = true;
                                    gVar.b(1);
                                } else {
                                    z16 = true;
                                }
                                if (timestamp) {
                                    if (aVar != null) {
                                        j16 = aVar.f103689b.nanoTime / 1000;
                                    } else {
                                        j16 = C.TIME_UNSET;
                                    }
                                    if (aVar != null) {
                                        j17 = aVar.f103692e;
                                    } else {
                                        j17 = -1;
                                    }
                                    jS2 = z.S(this.f8773f, b());
                                    if (Math.abs(j16 - jNanoTime) > 5000000) {
                                        j18 = jNanoTime;
                                        z15 = z16;
                                        aVar2 = aVar2;
                                        j8 = j14;
                                        aVar2.onSystemTimeUsMismatch(j17, j16, j18, jS2);
                                        gVar.b(4);
                                    } else {
                                        j18 = jNanoTime;
                                        z15 = z16;
                                        j19 = j16;
                                        j24 = j17;
                                        aVar2 = aVar2;
                                        j8 = j14;
                                        if (Math.abs(z.S(this.f8773f, j24) - jS2) > 5000000) {
                                            aVar2.onPositionFramesMismatch(j24, j19, j18, jS2);
                                            gVar.b(4);
                                        } else if (gVar.f103683b == 4) {
                                            gVar.a();
                                        }
                                    }
                                } else {
                                    z15 = z16;
                                    j18 = jNanoTime;
                                    aVar2 = aVar2;
                                    j8 = j14;
                                }
                                if (this.f8783p && (method = this.f8780m) != null && j18 - this.f8784q >= j15) {
                                    try {
                                        AudioTrack audioTrack2 = this.f8770c;
                                        audioTrack2.getClass();
                                        Integer num = (Integer) method.invoke(audioTrack2, null);
                                        int i19 = z.f70071a;
                                        long jIntValue = (((long) num.intValue()) * 1000) - this.f8775h;
                                        this.f8781n = jIntValue;
                                        jMax = Math.max(jIntValue, j8);
                                        this.f8781n = jMax;
                                        if (jMax > 5000000) {
                                            aVar2.onInvalidLatency(jMax);
                                            this.f8781n = j8;
                                        }
                                    } catch (Exception unused) {
                                        this.f8780m = null;
                                    }
                                    this.f8784q = j18;
                                }
                            }
                            timestamp = false;
                            if (timestamp) {
                                z15 = z16;
                                j18 = jNanoTime;
                                aVar2 = aVar2;
                                j8 = j14;
                            } else {
                                if (aVar != null) {
                                    j16 = aVar.f103689b.nanoTime / 1000;
                                } else {
                                    j16 = C.TIME_UNSET;
                                }
                                if (aVar != null) {
                                    j17 = aVar.f103692e;
                                } else {
                                    j17 = -1;
                                }
                                jS2 = z.S(this.f8773f, b());
                                if (Math.abs(j16 - jNanoTime) > 5000000) {
                                    j18 = jNanoTime;
                                    z15 = z16;
                                    aVar2 = aVar2;
                                    j8 = j14;
                                    aVar2.onSystemTimeUsMismatch(j17, j16, j18, jS2);
                                    gVar.b(4);
                                } else {
                                    j18 = jNanoTime;
                                    z15 = z16;
                                    j19 = j16;
                                    j24 = j17;
                                    aVar2 = aVar2;
                                    j8 = j14;
                                    if (Math.abs(z.S(this.f8773f, j24) - jS2) > 5000000) {
                                        aVar2.onPositionFramesMismatch(j24, j19, j18, jS2);
                                        gVar.b(4);
                                    } else if (gVar.f103683b == 4) {
                                        gVar.a();
                                    }
                                }
                            }
                            if (this.f8783p) {
                                AudioTrack audioTrack3 = this.f8770c;
                                audioTrack3.getClass();
                                Integer num2 = (Integer) method.invoke(audioTrack3, null);
                                int i110 = z.f70071a;
                                long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f8775h;
                                this.f8781n = jIntValue2;
                                jMax = Math.max(jIntValue2, j8);
                                this.f8781n = jMax;
                                if (jMax > 5000000) {
                                    aVar2.onInvalidLatency(jMax);
                                    this.f8781n = j8;
                                }
                                this.f8784q = j18;
                            }
                        } else {
                            j14 = 0;
                            j15 = 500000;
                        }
                        aVar2 = aVar2;
                        z16 = true;
                        timestamp = false;
                        if (timestamp) {
                            z15 = z16;
                            j18 = jNanoTime;
                            aVar2 = aVar2;
                            j8 = j14;
                        } else {
                            if (aVar != null) {
                                j16 = aVar.f103689b.nanoTime / 1000;
                            } else {
                                j16 = C.TIME_UNSET;
                            }
                            if (aVar != null) {
                                j17 = aVar.f103692e;
                            } else {
                                j17 = -1;
                            }
                            jS2 = z.S(this.f8773f, b());
                            if (Math.abs(j16 - jNanoTime) > 5000000) {
                                j18 = jNanoTime;
                                z15 = z16;
                                aVar2 = aVar2;
                                j8 = j14;
                                aVar2.onSystemTimeUsMismatch(j17, j16, j18, jS2);
                                gVar.b(4);
                            } else {
                                j18 = jNanoTime;
                                z15 = z16;
                                j19 = j16;
                                j24 = j17;
                                aVar2 = aVar2;
                                j8 = j14;
                                if (Math.abs(z.S(this.f8773f, j24) - jS2) > 5000000) {
                                    aVar2.onPositionFramesMismatch(j24, j19, j18, jS2);
                                    gVar.b(4);
                                } else if (gVar.f103683b == 4) {
                                    gVar.a();
                                }
                            }
                        }
                        if (this.f8783p) {
                            AudioTrack audioTrack4 = this.f8770c;
                            audioTrack4.getClass();
                            Integer num3 = (Integer) method.invoke(audioTrack4, null);
                            int i111 = z.f70071a;
                            long jIntValue3 = (((long) num3.intValue()) * 1000) - this.f8775h;
                            this.f8781n = jIntValue3;
                            jMax = Math.max(jIntValue3, j8);
                            this.f8781n = jMax;
                            if (jMax > 5000000) {
                                aVar2.onInvalidLatency(jMax);
                                this.f8781n = j8;
                            }
                            this.f8784q = j18;
                        }
                    }
                }
            } else if (this.f8774g) {
                j8 = 0;
                z15 = true;
            } else {
                gVar = this.f8772e;
                gVar.getClass();
                aVar = gVar.f103682a;
                if (aVar != null) {
                    audioTimestamp = aVar.f103689b;
                    j15 = 500000;
                    j14 = 0;
                    if (jNanoTime - gVar.f103686e < gVar.f103685d) {
                        gVar.f103686e = jNanoTime;
                        timestamp = aVar.f103688a.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j25 = audioTimestamp.framePosition;
                            j26 = aVar.f103691d;
                            if (j26 > j25) {
                                if (aVar.f103693f) {
                                    aVar.f103694g += j26;
                                    aVar.f103693f = false;
                                } else {
                                    aVar.f103690c++;
                                }
                            }
                            aVar.f103691d = j25;
                            aVar.f103692e = j25 + aVar.f103694g + (aVar.f103690c << 32);
                        }
                        i14 = gVar.f103683b;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        if (i14 != 4) {
                                            x.h();
                                            return 0L;
                                        }
                                    } else if (timestamp) {
                                        gVar.a();
                                    }
                                } else if (!timestamp) {
                                    gVar.a();
                                }
                            } else if (timestamp) {
                                gVar.a();
                            } else if (aVar.f103692e > gVar.f103687f) {
                                gVar.b(2);
                            }
                            z16 = true;
                        } else if (timestamp) {
                            z16 = true;
                            if (jNanoTime - gVar.f103684c > 500000) {
                                gVar.b(3);
                            }
                        } else if (audioTimestamp.nanoTime / 1000 >= gVar.f103684c) {
                            gVar.f103687f = aVar.f103692e;
                            z16 = true;
                            gVar.b(1);
                        } else {
                            z16 = true;
                        }
                        if (timestamp) {
                            z15 = z16;
                            j18 = jNanoTime;
                            aVar2 = aVar2;
                            j8 = j14;
                        } else {
                            if (aVar != null) {
                                j16 = aVar.f103689b.nanoTime / 1000;
                            } else {
                                j16 = C.TIME_UNSET;
                            }
                            if (aVar != null) {
                                j17 = aVar.f103692e;
                            } else {
                                j17 = -1;
                            }
                            jS2 = z.S(this.f8773f, b());
                            if (Math.abs(j16 - jNanoTime) > 5000000) {
                                j18 = jNanoTime;
                                z15 = z16;
                                aVar2 = aVar2;
                                j8 = j14;
                                aVar2.onSystemTimeUsMismatch(j17, j16, j18, jS2);
                                gVar.b(4);
                            } else {
                                j18 = jNanoTime;
                                z15 = z16;
                                j19 = j16;
                                j24 = j17;
                                aVar2 = aVar2;
                                j8 = j14;
                                if (Math.abs(z.S(this.f8773f, j24) - jS2) > 5000000) {
                                    aVar2.onPositionFramesMismatch(j24, j19, j18, jS2);
                                    gVar.b(4);
                                } else if (gVar.f103683b == 4) {
                                    gVar.a();
                                }
                            }
                        }
                        if (this.f8783p) {
                            AudioTrack audioTrack5 = this.f8770c;
                            audioTrack5.getClass();
                            Integer num4 = (Integer) method.invoke(audioTrack5, null);
                            int i112 = z.f70071a;
                            long jIntValue4 = (((long) num4.intValue()) * 1000) - this.f8775h;
                            this.f8781n = jIntValue4;
                            jMax = Math.max(jIntValue4, j8);
                            this.f8781n = jMax;
                            if (jMax > 5000000) {
                                aVar2.onInvalidLatency(jMax);
                                this.f8781n = j8;
                            }
                            this.f8784q = j18;
                        }
                    }
                    timestamp = false;
                    if (timestamp) {
                        z15 = z16;
                        j18 = jNanoTime;
                        aVar2 = aVar2;
                        j8 = j14;
                    } else {
                        if (aVar != null) {
                            j16 = aVar.f103689b.nanoTime / 1000;
                        } else {
                            j16 = C.TIME_UNSET;
                        }
                        if (aVar != null) {
                            j17 = aVar.f103692e;
                        } else {
                            j17 = -1;
                        }
                        jS2 = z.S(this.f8773f, b());
                        if (Math.abs(j16 - jNanoTime) > 5000000) {
                            j18 = jNanoTime;
                            z15 = z16;
                            aVar2 = aVar2;
                            j8 = j14;
                            aVar2.onSystemTimeUsMismatch(j17, j16, j18, jS2);
                            gVar.b(4);
                        } else {
                            j18 = jNanoTime;
                            z15 = z16;
                            j19 = j16;
                            j24 = j17;
                            aVar2 = aVar2;
                            j8 = j14;
                            if (Math.abs(z.S(this.f8773f, j24) - jS2) > 5000000) {
                                aVar2.onPositionFramesMismatch(j24, j19, j18, jS2);
                                gVar.b(4);
                            } else if (gVar.f103683b == 4) {
                                gVar.a();
                            }
                        }
                    }
                    if (this.f8783p) {
                        AudioTrack audioTrack6 = this.f8770c;
                        audioTrack6.getClass();
                        Integer num5 = (Integer) method.invoke(audioTrack6, null);
                        int i113 = z.f70071a;
                        long jIntValue5 = (((long) num5.intValue()) * 1000) - this.f8775h;
                        this.f8781n = jIntValue5;
                        jMax = Math.max(jIntValue5, j8);
                        this.f8781n = jMax;
                        if (jMax > 5000000) {
                            aVar2.onInvalidLatency(jMax);
                            this.f8781n = j8;
                        }
                        this.f8784q = j18;
                    }
                } else {
                    j14 = 0;
                    j15 = 500000;
                }
                aVar2 = aVar2;
                z16 = true;
                timestamp = false;
                if (timestamp) {
                    z15 = z16;
                    j18 = jNanoTime;
                    aVar2 = aVar2;
                    j8 = j14;
                } else {
                    if (aVar != null) {
                        j16 = aVar.f103689b.nanoTime / 1000;
                    } else {
                        j16 = C.TIME_UNSET;
                    }
                    if (aVar != null) {
                        j17 = aVar.f103692e;
                    } else {
                        j17 = -1;
                    }
                    jS2 = z.S(this.f8773f, b());
                    if (Math.abs(j16 - jNanoTime) > 5000000) {
                        j18 = jNanoTime;
                        z15 = z16;
                        aVar2 = aVar2;
                        j8 = j14;
                        aVar2.onSystemTimeUsMismatch(j17, j16, j18, jS2);
                        gVar.b(4);
                    } else {
                        j18 = jNanoTime;
                        z15 = z16;
                        j19 = j16;
                        j24 = j17;
                        aVar2 = aVar2;
                        j8 = j14;
                        if (Math.abs(z.S(this.f8773f, j24) - jS2) > 5000000) {
                            aVar2.onPositionFramesMismatch(j24, j19, j18, jS2);
                            gVar.b(4);
                        } else if (gVar.f103683b == 4) {
                            gVar.a();
                        }
                    }
                }
                if (this.f8783p) {
                    AudioTrack audioTrack7 = this.f8770c;
                    audioTrack7.getClass();
                    Integer num6 = (Integer) method.invoke(audioTrack7, null);
                    int i114 = z.f70071a;
                    long jIntValue6 = (((long) num6.intValue()) * 1000) - this.f8775h;
                    this.f8781n = jIntValue6;
                    jMax = Math.max(jIntValue6, j8);
                    this.f8781n = jMax;
                    if (jMax > 5000000) {
                        aVar2.onInvalidLatency(jMax);
                        this.f8781n = j8;
                    }
                    this.f8784q = j18;
                }
            }
        } else {
            j8 = 0;
            z15 = true;
        }
        long jNanoTime2 = this.I.nanoTime() / 1000;
        g gVar2 = this.f8772e;
        gVar2.getClass();
        g.a aVar3 = gVar2.f103682a;
        boolean z17 = gVar2.f103683b == 2 ? z15 : false;
        if (z17) {
            jS = z.w(jNanoTime2 - (aVar3 != null ? aVar3.f103689b.nanoTime / 1000 : C.TIME_UNSET), this.f8776i) + z.S(this.f8773f, aVar3 != null ? aVar3.f103692e : -1L);
        } else {
            jS = this.f8790w == 0 ? z.S(this.f8773f, b()) : z.w(this.f8778k + jNanoTime2, this.f8776i);
            if (!z14) {
                jS = Math.max(j8, jS - this.f8781n);
            }
        }
        if (this.D != z17) {
            this.F = this.C;
            this.E = this.B;
        }
        long j27 = jNanoTime2 - this.F;
        if (j27 < 1000000) {
            long jW = z.w(j27, this.f8776i) + this.E;
            long j28 = (j27 * 1000) / 1000000;
            jS = (((1000 - j28) * jW) + (jS * j28)) / 1000;
        }
        if (!this.f8777j) {
            long j29 = this.B;
            if (jS > j29) {
                this.f8777j = z15;
                aVar2.onPositionAdvancing(this.I.currentTimeMillis() - z.Y(z.z(z.Y(jS - j29), this.f8776i)));
            }
        }
        this.C = jNanoTime2;
        this.B = jS;
        this.D = z17;
        return jS;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    public final long b() {
        long j8;
        long jElapsedRealtime = this.I.elapsedRealtime();
        if (this.f8791x != C.TIME_UNSET) {
            AudioTrack audioTrack = this.f8770c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f8793z;
            }
            return Math.min(this.A, this.f8793z + z.U(z.w(z.O(jElapsedRealtime) - this.f8791x, this.f8776i), this.f8773f, 1000000L, RoundingMode.UP));
        }
        if (jElapsedRealtime - this.f8785r >= 5) {
            AudioTrack audioTrack2 = this.f8770c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f8774g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f8788u = this.f8786s;
                    }
                    playbackHeadPosition += this.f8788u;
                }
                if (z.f70071a > 29) {
                    j8 = this.f8786s;
                    if (j8 > playbackHeadPosition) {
                        if (this.G) {
                            this.H += j8;
                            this.G = false;
                        } else {
                            this.f8787t++;
                        }
                    }
                    this.f8786s = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f8786s <= 0 || playState != 3) {
                    this.f8792y = C.TIME_UNSET;
                    j8 = this.f8786s;
                    if (j8 > playbackHeadPosition) {
                        if (this.G) {
                            this.H += j8;
                            this.G = false;
                        } else {
                            this.f8787t++;
                        }
                    }
                    this.f8786s = playbackHeadPosition;
                } else if (this.f8792y == C.TIME_UNSET) {
                    this.f8792y = jElapsedRealtime;
                }
            }
            this.f8785r = jElapsedRealtime;
        }
        return this.f8786s + this.H + (this.f8787t << 32);
    }

    public final boolean c(long j8) {
        long jA = a(false);
        int i14 = this.f8773f;
        int i15 = z.f70071a;
        if (j8 > z.U(jA, i14, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f8774g) {
            AudioTrack audioTrack = this.f8770c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.f8778k = 0L;
        this.f8790w = 0;
        this.f8789v = 0;
        this.f8779l = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f8777j = false;
    }
}
