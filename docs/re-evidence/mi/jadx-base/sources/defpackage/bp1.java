package defpackage;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public final class bp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4435b;
    public long c;
    public long d;
    public long e;
    public long f;

    @RequiresApi(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f4436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f4437b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;

        public a(AudioTrack audioTrack) {
            this.f4436a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.f4437b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f4436a.getTimestamp(this.f4437b);
            if (timestamp) {
                long j = this.f4437b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public bp1(AudioTrack audioTrack) {
        if (wlq.f38110a >= 19) {
            this.f4434a = new a(audioTrack);
            g();
        } else {
            this.f4434a = null;
            h(3);
        }
    }

    public void a() {
        if (this.f4435b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f4434a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f4434a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f4435b == 2;
    }

    @TargetApi(19)
    public boolean e(long j) {
        a aVar = this.f4434a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean zC = aVar.c();
        int i = this.f4435b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        g();
                    }
                } else if (!zC) {
                    g();
                }
            } else if (!zC) {
                g();
            } else if (this.f4434a.a() > this.f) {
                h(2);
            }
        } else if (zC) {
            if (this.f4434a.b() < this.c) {
                return false;
            }
            this.f = this.f4434a.a();
            h(1);
        } else if (j - this.c > 500000) {
            h(3);
        }
        return zC;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f4434a != null) {
            h(0);
        }
    }

    public final void h(int i) {
        this.f4435b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
