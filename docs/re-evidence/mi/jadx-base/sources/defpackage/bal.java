package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class bal implements dk4<ResponseBody, Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bal f3990a = new bal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double convert(ResponseBody responseBody) throws IOException {
        return Double.valueOf(responseBody.string());
    }
}
