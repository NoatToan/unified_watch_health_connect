package wi2;

import android.webkit.JavascriptInterface;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwi2/n;", "", "Lkotlin/Function1;", "", "", "onMessageReceived", "<init>", "(Le23/l;)V", "json", "handleEvent", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<String, Unit> f185678a;

    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.l<? super String, Unit> lVar) {
        lVar.getClass();
        this.f185678a = lVar;
    }

    @JavascriptInterface
    public final void handleEvent(String json) {
        json.getClass();
        this.f185678a.invoke(json);
    }
}
