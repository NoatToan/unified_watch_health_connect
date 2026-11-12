package f83;

import c83.b0;
import c83.h;
import gl1.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf83/b;", "Lc83/h$a;", "Lokhttp3/MediaType;", "contentType", "Lf83/e;", "serializer", "<init>", "(Lokhttp3/MediaType;Lf83/e;)V", "kotlinx-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaType f69951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f69952b;

    public b(MediaType mediaType, e eVar) {
        mediaType.getClass();
        eVar.getClass();
        this.f69951a = mediaType;
        this.f69952b = eVar;
    }

    @Override // c83.h.a
    public final h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        type.getClass();
        annotationArr2.getClass();
        e eVar = this.f69952b;
        eVar.getClass();
        return new d(this.f69951a, y.K(eVar.getF69956a().getF123894b(), type), eVar);
    }

    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        type.getClass();
        annotationArr.getClass();
        e eVar = this.f69952b;
        eVar.getClass();
        return new a(y.K(eVar.getF69956a().getF123894b(), type), eVar);
    }
}
