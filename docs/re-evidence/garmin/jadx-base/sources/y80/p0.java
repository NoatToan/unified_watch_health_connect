package y80;

import android.net.Uri;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly80/p0;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f195200a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f195201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f195202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String> f195203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<String> f195204e;

    static {
        String str = a2.BIC + "-SetupWizardUtil";
        int i14 = gt2.c.f79010a;
        f195201b = gt2.b.f79005a.h(str);
        f195203d = new AtomicReference<>();
        f195204e = new AtomicReference<>();
    }

    private p0() {
    }

    public static l90.d a(Uri uri) {
        Long lValueOf;
        uri.getClass();
        String queryParameter = uri.getQueryParameter("productNumber");
        String queryParameter2 = uri.getQueryParameter("applicationKey");
        String queryParameter3 = uri.getQueryParameter("deviceId");
        if (TextUtils.isEmpty(queryParameter3)) {
            lValueOf = null;
        } else {
            queryParameter3.getClass();
            lValueOf = Long.valueOf(Long.parseLong(queryParameter3));
        }
        return new l90.d(lValueOf, queryParameter, queryParameter2, true);
    }
}
