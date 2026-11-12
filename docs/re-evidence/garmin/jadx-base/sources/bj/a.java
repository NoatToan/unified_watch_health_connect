package bj;

import aj.h;
import aj.n;
import aj.o;
import aj.p;
import aj.s;
import com.bumptech.glide.load.data.j;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.io.InputStream;
import java.util.ArrayDeque;
import ui.g;

/* JADX INFO: loaded from: classes7.dex */
public class a implements o<h, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g<Integer> f18300b = g.b(Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<h, h> f18301a;

    /* JADX INFO: renamed from: bj.a$a, reason: collision with other inner class name */
    public static class C0265a implements p<h, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<h, h> f18302a = new n<>(500);

        @Override // aj.p
        public final o<h, InputStream> d(s sVar) {
            return new a(this.f18302a);
        }
    }

    public a(n<h, h> nVar) {
        this.f18301a = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // aj.o
    public final o.a<InputStream> a(h hVar, int i14, int i15, ui.h hVar2) {
        h hVar3 = hVar;
        n<h, h> nVar = this.f18301a;
        if (nVar != null) {
            n.a aVar = nVar.f3367a;
            n.b bVarA = n.b.a(hVar3);
            B bA = aVar.a(bVarA);
            ArrayDeque arrayDeque = n.b.f3368b;
            synchronized (arrayDeque) {
                arrayDeque.offer(bVarA);
            }
            h hVar4 = (h) bA;
            if (hVar4 == null) {
                aVar.d(n.b.a(hVar3), hVar3);
            } else {
                hVar3 = hVar4;
            }
        }
        return new o.a<>(hVar3, new j(hVar3, ((Integer) hVar2.c(f18300b)).intValue()));
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(h hVar) {
        return true;
    }

    public a() {
        this(null);
    }
}
