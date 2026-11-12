package f03;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f67755a;

    public b(a aVar) {
        this.f67755a = aVar;
    }

    @JavascriptInterface
    public void onError(String str) {
        for (e eVar : e.values()) {
            if (eVar.f67765a.equals(str)) {
                this.f67755a.b(eVar);
            }
        }
        eVar = e.UNKNOWN_ERROR;
        this.f67755a.b(eVar);
    }

    @JavascriptInterface
    public void onSuccess() {
        this.f67755a.a();
    }

    @JavascriptInterface
    public void onSuccess(String str) {
        this.f67755a.onSuccess();
    }
}
