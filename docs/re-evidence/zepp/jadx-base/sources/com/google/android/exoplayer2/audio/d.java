package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 10000;
    private static final int m = 10000000;
    private static final int n = 500000;
    private static final int o = 500000;

    @Nullable
    private final a a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    @RequiresApi(19)
    public static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public d(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.a = new a(audioTrack);
            h();
        } else {
            this.a = null;
            i(3);
        }
    }

    private void i(int state) {
        this.b = state;
        if (state == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (state == 1) {
            this.d = 10000L;
            return;
        }
        if (state == 2 || state == 3) {
            this.d = 10000000L;
        } else {
            if (state != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }

    public void a() {
        if (this.b == 4) {
            h();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.a;
        return aVar != null ? aVar.b() : C.TIME_UNSET;
    }

    public boolean d() {
        return this.b == 2;
    }

    public boolean e() {
        int i2 = this.b;
        return i2 == 1 || i2 == 2;
    }

    @TargetApi(19)
    public boolean f(long systemTimeUs) {
        a aVar = this.a;
        if (aVar == null || systemTimeUs - this.e < this.d) {
            return false;
        }
        this.e = systemTimeUs;
        boolean zC = aVar.c();
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        h();
                    }
                } else if (!zC) {
                    h();
                }
            } else if (!zC) {
                h();
            } else if (this.a.a() > this.f) {
                i(2);
            }
        } else if (zC) {
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            i(1);
        } else if (systemTimeUs - this.c > 500000) {
            i(3);
        }
        return zC;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.a != null) {
            i(0);
        }
    }
}
