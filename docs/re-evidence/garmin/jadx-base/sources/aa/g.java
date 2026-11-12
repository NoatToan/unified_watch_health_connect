package aa;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VolumeProvider f2186e;

    public static abstract class a {
        public abstract void onVolumeChanged(g gVar);
    }

    public g(int i14, int i15, int i16, String str) {
        this.f2182a = i14;
        this.f2183b = i15;
        this.f2185d = i16;
        this.f2184c = str;
    }

    public g(int i14, int i15, int i16) {
        this(i14, i15, i16, null);
    }
}
