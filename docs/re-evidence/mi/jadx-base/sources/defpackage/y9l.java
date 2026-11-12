package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class y9l implements dk4<ResponseBody, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y9l f39965a = new y9l();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean convert(ResponseBody responseBody) throws IOException {
        return Boolean.valueOf(responseBody.string());
    }
}
