package androidx.media3.exoplayer.source;

import android.net.Uri;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class v extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ha.g f9674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ha.d.a f9675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.q f9676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f9678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sa.o f9680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.media3.common.t f9681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ha.n f9682p;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ha.d.a f9683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.b f9684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9685c;

        public b(ha.d.a aVar) {
            aVar.getClass();
            this.f9683a = aVar;
            this.f9684b = new androidx.media3.exoplayer.upstream.a();
            this.f9685c = true;
        }
    }

    private v(String str, androidx.media3.common.t.k kVar, ha.d.a aVar, long j8, androidx.media3.exoplayer.upstream.b bVar, boolean z14, Object obj) {
        this.f9675i = aVar;
        this.f9677k = j8;
        this.f9678l = bVar;
        this.f9679m = z14;
        androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
        cVar.f8447b = Uri.EMPTY;
        String string = kVar.f8492a.toString();
        string.getClass();
        cVar.f8446a = string;
        cVar.f8453h = ImmutableList.copyOf((Collection) ImmutableList.of(kVar));
        cVar.f8455j = obj;
        androidx.media3.common.t tVarA = cVar.a();
        this.f9681o = tVarA;
        androidx.media3.common.q.b bVar2 = new androidx.media3.common.q.b();
        bVar2.f8411m = androidx.media3.common.x.n((String) MoreObjects.firstNonNull(kVar.f8493b, MimeTypes.TEXT_UNKNOWN));
        bVar2.f8402d = kVar.f8494c;
        bVar2.f8403e = kVar.f8495d;
        bVar2.f8404f = kVar.f8496e;
        bVar2.f8400b = kVar.f8497f;
        String str2 = kVar.f8498g;
        bVar2.f8399a = str2 != null ? str2 : str;
        this.f9676j = bVar2.a();
        ha.g.b bVar3 = new ha.g.b();
        bVar3.f82565a = kVar.f8492a;
        bVar3.f82573i = 1;
        this.f9674h = bVar3.a();
        this.f9680n = new sa.o(j8, true, false, false, (Object) null, tVarA);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        return new u(this.f9674h, this.f9675i, this.f9682p, this.f9676j, this.f9677k, this.f9678l, l(bVar), this.f9679m);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final androidx.media3.common.t getMediaItem() {
        return this.f9681o;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        ((u) iVar).f9661i.d(null);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p(ha.n nVar) {
        this.f9682p = nVar;
        q(this.f9680n);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r() {
    }
}
