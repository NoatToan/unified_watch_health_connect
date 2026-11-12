package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class dal implements dk4<ResponseBody, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dal f15318a = new dal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer convert(ResponseBody responseBody) throws IOException {
        return Integer.valueOf(responseBody.string());
    }
}
