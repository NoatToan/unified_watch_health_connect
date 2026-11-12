package defpackage;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.upstream.i;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class an9 implements l9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9c f1234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f1235b;

    public an9(l9c l9cVar, List<StreamKey> list) {
        this.f1234a = l9cVar;
        this.f1235b = list;
    }

    @Override // defpackage.l9c
    public i.a<k9c> a(b bVar, c cVar) {
        return new bn9(this.f1234a.a(bVar, cVar), this.f1235b);
    }

    @Override // defpackage.l9c
    public i.a<k9c> b() {
        return new bn9(this.f1234a.b(), this.f1235b);
    }
}
