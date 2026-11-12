package h83;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> implements c83.h<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<Object> f82498a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MediaType f82499b = MediaType.get("text/plain; charset=UTF-8");

    private a() {
    }

    @Override // c83.h
    public final RequestBody convert(Object obj) {
        return RequestBody.create(f82499b, String.valueOf(obj));
    }
}
