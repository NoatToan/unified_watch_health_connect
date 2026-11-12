package my2;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmy2/g;", "Lokhttp3/RequestBody;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaType f121556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz2.b f121557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f121558c;

    public g(MediaType mediaType, dz2.b bVar, a aVar) {
        this.f121556a = mediaType;
        this.f121557b = bVar;
        this.f121558c = aVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f121557b.getF61810d();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF121556a() {
        return this.f121556a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(w63.f fVar) {
        fVar.getClass();
        while (true) {
            dz2.b bVar = this.f121557b;
            if (!bVar.d()) {
                return;
            } else {
                fVar.write(bVar.e(this.f121558c.f121527b));
            }
        }
    }
}
