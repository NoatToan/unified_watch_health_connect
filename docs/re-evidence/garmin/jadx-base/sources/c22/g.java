package c22;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/g;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f23056a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f23057b;

    static {
        int i14 = gt2.c.f79010a;
        f23057b = gt2.b.f79005a.h("AnalyticsUtil");
    }

    private g() {
    }

    public static void a(String str) {
        f23057b.debug("log Assistance Plus Analytic + -----> ".concat(str));
        Bundle bundle = new Bundle();
        bundle.putString("Screen", "AssistancePlus");
        bundle.putString("Action", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "UserAction");
    }

    public static void b(Uri uri) {
        String string = uri.toString();
        string.getClass();
        zk.a aVar = new zk.a("DEEP_LINK", p13.w.c(new zk.e("url", string)), false, 0L, 12, null);
        zk.c cVar = zk.c.f205034a;
        List listC = p13.w.c("GCS");
        cVar.getClass();
        new zk.d(cVar, null, listC).a(aVar);
    }
}
