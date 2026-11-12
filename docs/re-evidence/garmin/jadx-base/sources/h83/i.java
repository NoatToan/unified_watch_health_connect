package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements c83.h<ResponseBody, Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f82507a = new i();

    @Override // c83.h
    public final Short convert(ResponseBody responseBody) {
        return Short.valueOf(responseBody.string());
    }
}
