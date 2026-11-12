package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements c83.h<ResponseBody, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f82505a = new g();

    @Override // c83.h
    public final Integer convert(ResponseBody responseBody) {
        return Integer.valueOf(responseBody.string());
    }
}
