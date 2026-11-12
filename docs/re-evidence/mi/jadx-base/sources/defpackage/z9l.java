package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class z9l implements dk4<ResponseBody, Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z9l f41051a = new z9l();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte convert(ResponseBody responseBody) throws IOException {
        return Byte.valueOf(responseBody.string());
    }
}
