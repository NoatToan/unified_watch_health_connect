package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class cal implements dk4<ResponseBody, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cal f5131a = new cal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float convert(ResponseBody responseBody) throws IOException {
        return Float.valueOf(responseBody.string());
    }
}
