package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements c83.h<ResponseBody, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f82504a = new f();

    @Override // c83.h
    public final Float convert(ResponseBody responseBody) {
        return Float.valueOf(responseBody.string());
    }
}
