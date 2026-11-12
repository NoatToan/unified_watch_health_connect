package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.i;
import defpackage.ym9;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bn9<T extends ym9<T>> implements i.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.a<? extends T> f4389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f4390b;

    public bn9(i.a<? extends T> aVar, List<StreamKey> list) {
        this.f4389a = aVar;
        this.f4390b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T tA = this.f4389a.a(uri, inputStream);
        List<StreamKey> list = this.f4390b;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f4390b);
    }
}
