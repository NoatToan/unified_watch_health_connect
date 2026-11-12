package ra;

import android.net.Uri;
import androidx.media3.common.b0;
import ha.e;
import java.util.List;
import na.c;

/* JADX INFO: loaded from: classes.dex */
public final class a<T extends c> implements androidx.media3.exoplayer.upstream.c.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.c.a<? extends T> f151454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b0> f151455b;

    public a(androidx.media3.exoplayer.upstream.c.a<? extends T> aVar, List<b0> list) {
        this.f151454a = aVar;
        this.f151455b = list;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    public final Object a(Uri uri, e eVar) {
        c cVar = (c) this.f151454a.a(uri, eVar);
        List<b0> list = this.f151455b;
        return (list == null || list.isEmpty()) ? cVar : (c) cVar.a(list);
    }
}
