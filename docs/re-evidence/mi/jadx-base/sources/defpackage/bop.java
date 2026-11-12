package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f4424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gy1 f4425b;

    public interface a {
        void b();
    }

    public final gy1 a() {
        return (gy1) rk1.e(this.f4425b);
    }

    public final void b(a aVar, gy1 gy1Var) {
        this.f4424a = aVar;
        this.f4425b = gy1Var;
    }

    public final void c() {
        a aVar = this.f4424a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public abstract void d(Object obj);

    public abstract cop e(rkk[] rkkVarArr, TrackGroupArray trackGroupArray, k.a aVar, v vVar) throws ExoPlaybackException;
}
