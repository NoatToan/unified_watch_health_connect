package g83;

import c83.h;
import com.google.protobuf.MessageLite;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T extends MessageLite> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f76452a = MediaType.get("application/x-protobuf");

    @Override // c83.h
    public final RequestBody convert(Object obj) {
        return RequestBody.create(f76452a, ((MessageLite) obj).toByteArray());
    }
}
