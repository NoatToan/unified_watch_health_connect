package defpackage;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class aal implements dk4<ResponseBody, Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aal f839a = new aal();

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(ResponseBody responseBody) throws IOException {
        String strString = responseBody.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
