package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c83.h<ResponseBody, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f82500a = new b();

    @Override // c83.h
    public final Boolean convert(ResponseBody responseBody) {
        return Boolean.valueOf(responseBody.string());
    }
}
