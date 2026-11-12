package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class gal implements dk4<ResponseBody, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gal f18786a = new gal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String convert(ResponseBody responseBody) throws IOException {
        return responseBody.string();
    }
}
