package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class eal implements dk4<ResponseBody, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eal f16451a = new eal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long convert(ResponseBody responseBody) throws IOException {
        return Long.valueOf(responseBody.string());
    }
}
