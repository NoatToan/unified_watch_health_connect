package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements c83.h<ResponseBody, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f82506a = new h();

    @Override // c83.h
    public final Long convert(ResponseBody responseBody) {
        return Long.valueOf(responseBody.string());
    }
}
