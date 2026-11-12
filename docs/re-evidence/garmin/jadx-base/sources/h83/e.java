package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements c83.h<ResponseBody, Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f82503a = new e();

    @Override // c83.h
    public final Double convert(ResponseBody responseBody) {
        return Double.valueOf(responseBody.string());
    }
}
