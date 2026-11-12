package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements c83.h<ResponseBody, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f82508a = new j();

    @Override // c83.h
    public final String convert(ResponseBody responseBody) {
        return responseBody.string();
    }
}
