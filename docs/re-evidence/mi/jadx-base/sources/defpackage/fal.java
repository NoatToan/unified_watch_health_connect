package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class fal implements dk4<ResponseBody, Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fal f17605a = new fal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short convert(ResponseBody responseBody) throws IOException {
        return Short.valueOf(responseBody.string());
    }
}
