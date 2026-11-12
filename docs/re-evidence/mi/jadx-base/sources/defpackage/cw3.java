package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cw3 implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14794a = mie.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f14795b;
    public final int c;
    public final Format d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    public final jdo i;

    public cw3(a aVar, b bVar, int i, Format format, int i2, Object obj, long j, long j2) {
        this.i = new jdo(aVar);
        this.f14795b = (b) rk1.e(bVar);
        this.c = i;
        this.d = format;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }

    public final long a() {
        return this.i.r();
    }

    public final long c() {
        return this.h - this.g;
    }

    public final Map<String, List<String>> d() {
        return this.i.t();
    }

    public final Uri e() {
        return this.i.s();
    }
}
