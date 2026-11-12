package f83;

import c83.h;
import i63.i;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf83/d;", "T", "Lc83/h;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "Li63/i;", "saver", "Lf83/e;", "serializer", "<init>", "(Lokhttp3/MediaType;Li63/i;Lf83/e;)V", "kotlinx-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaType f69953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<T> f69954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f69955c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(MediaType mediaType, i<? super T> iVar, e eVar) {
        mediaType.getClass();
        iVar.getClass();
        eVar.getClass();
        this.f69953a = mediaType;
        this.f69954b = iVar;
        this.f69955c = eVar;
    }

    @Override // c83.h
    public final RequestBody convert(Object obj) {
        return this.f69955c.c(this.f69953a, this.f69954b, obj);
    }
}
