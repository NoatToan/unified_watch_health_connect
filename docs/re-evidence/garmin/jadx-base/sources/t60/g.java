package t60;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt60/g;", "", "", "screen", "<init>", "(Ljava/lang/String;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162711a;

    public g(String str) {
        str.getClass();
        this.f162711a = str;
    }

    public final void a() {
        Bundle bundle = new Bundle();
        bundle.putString("Screen", this.f162711a);
        bundle.putString("Action", "VisitGarminShop");
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "UserAction");
    }
}
