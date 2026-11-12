package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.apprichtap.haptic.b.a.c;
import com.apprichtap.haptic.player.PlayerEventCallback;
import com.apprichtap.haptic.sync.SyncCallback;

/* JADX INFO: loaded from: classes4.dex */
public class pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45812c;
    public int d;
    public int e;
    public SyncCallback f;
    public int g;
    public pn h;
    public int i;
    public int j;
    public String k;
    public int l;
    public String m;
    public boolean n;
    public float o = 1.0f;
    public int p;
    public String q;
    public String r;
    public int s;
    public int t;
    private int w;
    public PlayerEventCallback x;

    private boolean d(int i) {
        return i >= 0 && i <= 9;
    }

    public String toString() {
        return "CurrentPlayingHeInfo{mHeString='" + this.f45811b + "', mStartTime=" + this.f45812c + ", mLoop=" + this.d + ", mAmplitude=" + this.f45810a + ", mFreq=" + this.e + ", mHeRoot=" + this.h + ", mSyncCallback=" + this.f + ", mStartPosition=" + this.g + ", mStatus:" + this.w + ", mSpeedMultiple:" + this.o + '}';
    }

    public void b() {
        Log.d("CurrentPlayingInfo", "reset!");
        this.f45811b = null;
        this.f45812c = 0L;
        this.d = 0;
        this.f45810a = 255;
        this.e = 0;
        this.j = 0;
        this.h = null;
        this.f = null;
        this.g = 0;
        this.w = 0;
        this.o = 1.0f;
        this.m = null;
        this.l = 0;
        this.q = null;
        this.s = 0;
        this.t = 0;
        this.r = null;
        String str = this.k;
        if (str != null && str.length() != 0) {
            pr.d(this.k);
        }
        this.k = null;
    }

    public void c() {
        String str = this.k;
        if (str != null && str.length() != 0) {
            pr.d(this.k);
        }
        String str2 = Process.myTid() + "," + SystemClock.elapsedRealtime();
        this.k = str2;
        pr.b(str2);
    }

    public int d() {
        return this.w;
    }

    public void c(int i, int i2) {
        String str;
        Log.d("CurrentPlayingInfo", "changePlayerStatus, from:" + this.w + ",to:" + i + ", code:" + i2);
        if (!d(this.w, i)) {
            str = "changePlayerStatus, invalid transition, from " + this.w + " to " + i;
        } else {
            if (i != this.w || i2 == 0) {
                this.w = i;
                PlayerEventCallback playerEventCallback = this.x;
                if (playerEventCallback != null) {
                    playerEventCallback.onPlayerStateChanged(i);
                    if (2 == this.w) {
                        this.x.onError(i2);
                        return;
                    }
                    return;
                }
                return;
            }
            str = "changePlayerStatus, needn't update";
        }
        Log.w("CurrentPlayingInfo", str);
    }

    public int e() {
        pn pnVar = this.h;
        if (pnVar == null) {
            return -1;
        }
        if (2 == pnVar.a()) {
            return this.h.f45702a.size();
        }
        if (1 == this.h.a()) {
            return 1;
        }
        Log.w("CurrentPlayingInfo", "getPatternCount(), invalid HE version!");
        return -1;
    }

    private boolean d(int i, int i2) {
        if (!d(i) || !d(i2)) {
            return false;
        }
        switch (i) {
            case 0:
                return i2 == 0 || 2 == i2 || 1 == i2 || 3 == i2;
            case 1:
                return 1 == i2;
            case 2:
                return 2 == i2;
            case 3:
                return i2 == 0 || 2 == i2 || 1 == i2 || 3 == i2 || 4 == i2 || 5 == i2;
            case 4:
                return 2 == i2 || i2 == 0 || 1 == i2 || 4 == i2 || 5 == i2;
            case 5:
                return 2 == i2 || i2 == 0 || 1 == i2 || 5 == i2 || 6 == i2 || 8 == i2;
            case 6:
            case 7:
                return 2 == i2 || i2 == 0 || 1 == i2 || 6 == i2 || 8 == i2 || 7 == i2 || 9 == i2;
            case 8:
                return 2 == i2 || i2 == 0 || 1 == i2 || 4 == i2 || 5 == i2 || 8 == i2;
            case 9:
                return 2 == i2 || i2 == 0 || 1 == i2 || 6 == i2 || 7 == i2 || 9 == i2;
            default:
                return false;
        }
    }

    public static boolean d(c cVar) {
        return c.a(cVar);
    }
}
