package h83;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements c83.h<ResponseBody, Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f82501a = new c();

    @Override // c83.h
    public final Byte convert(ResponseBody responseBody) {
        return Byte.valueOf(responseBody.string());
    }
}
