package h83;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements c83.h<ResponseBody, Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f82502a = new d();

    @Override // c83.h
    public final Character convert(ResponseBody responseBody) throws IOException {
        String strString = responseBody.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        o2.c.r(strString.length(), "Expected body of length 1 for Character conversion but was ");
        return null;
    }
}
