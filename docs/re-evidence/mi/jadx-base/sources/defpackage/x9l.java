package defpackage;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class x9l<T> implements dk4<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x9l<Object> f38892a = new x9l<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MediaType f38893b = MediaType.get("text/plain; charset=UTF-8");

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) throws IOException {
        return RequestBody.create(f38893b, String.valueOf(t));
    }
}
