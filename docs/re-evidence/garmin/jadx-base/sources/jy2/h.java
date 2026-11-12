package jy2;

import c83.a0;
import o53.r;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljy2/h;", "Lc83/f;", "Lokhttp3/ResponseBody;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h implements c83.f<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r<JSONObject> f101891a;

    public h(r<JSONObject> rVar) {
        this.f101891a = rVar;
    }

    @Override // c83.f
    public final void a(c83.d<ResponseBody> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        this.f101891a.O(th3);
    }

    @Override // c83.f
    public final void c(c83.d<ResponseBody> dVar, a0<ResponseBody> a0Var) {
        MediaType mediaType;
        r<JSONObject> rVar = this.f101891a;
        dVar.getClass();
        ResponseBody responseBody = a0Var.f25746b;
        try {
            if (!a0Var.f25745a.isSuccessful()) {
                HttpException httpException = new HttpException(a0Var);
                d.f101869e.getClass();
                d.f101870f.error("Failed fetchUpdates", (Throwable) httpException);
                rVar.O(httpException);
                return;
            }
            ResponseBody responseBody2 = responseBody;
            String strString = null;
            if (s.g((responseBody2 == null || (mediaType = responseBody2.get$contentType()) == null) ? null : mediaType.subtype(), "octet-stream")) {
                ResponseBody responseBody3 = responseBody;
                byte[] bArrBytes = responseBody3 != null ? responseBody3.bytes() : null;
                if (bArrBytes == null) {
                    bArrBytes = new byte[0];
                }
                strString = new String(bArrBytes, d53.c.f57666b);
            } else {
                ResponseBody responseBody4 = responseBody;
                if (responseBody4 != null) {
                    strString = responseBody4.string();
                }
            }
            strString.getClass();
            rVar.p(new JSONObject(strString));
        } catch (Throwable th3) {
            d.f101869e.getClass();
            d.f101870f.error("Failed fetchUpdates", th3);
            rVar.O(th3);
        }
    }
}
