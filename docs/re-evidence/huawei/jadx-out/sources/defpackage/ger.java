package defpackage;

import com.huawei.health.musicservice.api.IAudioPlayer;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes29.dex */
public class ger {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34994c;
    private int d;
    private volatile gdy e;
    private final List<gdy> f = new CopyOnWriteArrayList();
    private final List<gdy> j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34992a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34993b = false;
    private boolean g = false;

    public gdy c() {
        return this.e;
    }

    public gdy c(int i) {
        if (i < 0 || i > this.f.size() - 1) {
            LogUtil.d("R_TrackProvider", "getItemByIndex failed, index out of range, index: " + i + ", size: " + this.f.size());
            return null;
        }
        return this.f.get(i);
    }

    public gdy c(boolean z) {
        if (this.f.isEmpty()) {
            LogUtil.e("R_TrackProvider", "getNextTrack failed, list is empty, please check if you have called setPlayList(), or track has all been removed...");
            return null;
        }
        if (this.e == null) {
            this.e = (this.f34992a ? this.j : this.f).get(0);
            return this.e;
        }
        if (this.f34992a) {
            if (this.f34994c < this.j.size() - 1) {
                return this.j.get(this.f34994c + 1);
            }
            return this.j.get(0);
        }
        if (this.g) {
            if (this.d < this.f.size() - 1) {
                return this.f.get(this.d + 1);
            }
            return this.f.get(0);
        }
        if (this.f34993b) {
            if (z) {
                return null;
            }
            if (this.d < this.f.size() - 1) {
                return this.f.get(this.d + 1);
            }
            return this.f.get(0);
        }
        if (this.d < this.f.size() - 1) {
            return this.f.get(this.d + 1);
        }
        if (this.d == this.f.size() - 1 && z) {
            return null;
        }
        return this.f.get(0);
    }

    public gdy b() {
        if (this.f.isEmpty()) {
            LogUtil.e("R_TrackProvider", "getPreviousTrack failed, list is empty, please check if you have called setPlayList(), or track has all been removed...");
            return null;
        }
        if (this.e == null) {
            this.e = (this.f34992a ? this.j : this.f).get(0);
            return this.e;
        }
        if (this.f.size() == 1) {
            return this.e;
        }
        if (this.f34992a) {
            int i = this.f34994c;
            if (i > 0) {
                return this.j.get(i - 1);
            }
            List<gdy> list = this.j;
            return list.get(list.size() - 1);
        }
        int i2 = this.d;
        if (i2 > 0 && i2 <= this.f.size()) {
            return this.f.get(this.d - 1);
        }
        List<gdy> list2 = this.f;
        return list2.get(list2.size() - 1);
    }

    public void b(gdy gdyVar) {
        if (gdyVar == null) {
            return;
        }
        this.e = gdyVar;
        int i = 0;
        if (this.f34992a) {
            while (i < this.j.size()) {
                if (gdyVar.equals(this.j.get(i))) {
                    this.f34994c = i;
                    this.d = this.f.indexOf(gdyVar);
                    return;
                }
                i++;
            }
            return;
        }
        while (i < this.f.size()) {
            if (gdyVar.equals(this.f.get(i))) {
                LogUtil.b("R_TrackProvider", "currentSequenceIndex updated, " + this.d + " -> " + i);
                this.d = i;
                return;
            }
            i++;
        }
    }

    public void e(List<gdy> list) {
        this.f.addAll(list);
        a();
    }

    public boolean e(gdy gdyVar) {
        this.f.remove(gdyVar);
        this.j.remove(gdyVar);
        if (this.f.size() == 0) {
            this.e = null;
            return true;
        }
        if (gdyVar != null && gdyVar.equals(this.e)) {
            if (this.f34992a) {
                this.e = this.f34994c >= this.j.size() ? this.j.get(0) : this.j.get(this.f34994c);
            } else {
                this.e = this.d >= this.f.size() ? this.f.get(0) : this.f.get(this.d);
            }
        } else {
            b(this.e);
        }
        return false;
    }

    public void e() {
        this.f.clear();
        this.j.clear();
    }

    public void e(IAudioPlayer.PlayMode playMode) {
        this.f34993b = false;
        this.f34992a = false;
        this.g = false;
        ReleaseLogUtil.c("R_TrackProvider", "parse play mode, current: " + playMode);
        int i = AnonymousClass1.f34995b[playMode.ordinal()];
        if (i == 1) {
            this.f34992a = true;
            a();
        } else if (i == 2) {
            this.f34993b = true;
        } else {
            if (i != 3) {
                return;
            }
            this.g = true;
        }
    }

    /* JADX INFO: renamed from: ger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34995b;

        static {
            int[] iArr = new int[IAudioPlayer.PlayMode.values().length];
            f34995b = iArr;
            try {
                iArr[IAudioPlayer.PlayMode.RANDOM_CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34995b[IAudioPlayer.PlayMode.PLAY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34995b[IAudioPlayer.PlayMode.SEQUENCE_CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34995b[IAudioPlayer.PlayMode.SEQUENCE_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public List<gdy> d() {
        return this.f;
    }

    private void a() {
        if (this.f.isEmpty()) {
            ReleaseLogUtil.d("R_TrackProvider", "generate random list failed, source list is empty");
            return;
        }
        this.j.clear();
        this.j.addAll(this.f);
        Collections.shuffle(this.j);
        this.f34994c = 0;
        if (this.e != null) {
            this.j.remove(this.e);
            this.j.add(0, this.e);
        }
    }
}
