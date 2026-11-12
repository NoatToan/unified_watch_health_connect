package defpackage;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;

/* JADX INFO: loaded from: classes9.dex */
public class hme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TrackGroup f36901a;
    private int d;
    private Format e;

    public hme(int i, TrackGroup trackGroup, Format format) {
        this.d = i;
        this.f36901a = trackGroup;
        this.e = format;
    }

    public int e() {
        return this.d;
    }

    public TrackGroup b() {
        return this.f36901a;
    }

    public Format d() {
        return this.e;
    }
}
