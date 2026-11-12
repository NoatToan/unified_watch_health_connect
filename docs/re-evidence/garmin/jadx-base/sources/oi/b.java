package oi;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loi/b;", "Lokhttp3/RequestBody;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh.d f132187a;

    public b(wh.d dVar) {
        this.f132187a = dVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f132187a.getF185216a();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getContentType() {
        return MediaType.INSTANCE.get(this.f132187a.getF185244d());
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return this.f132187a instanceof wh.j;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(w63.f fVar) {
        fVar.getClass();
        this.f132187a.a(fVar);
    }
}
