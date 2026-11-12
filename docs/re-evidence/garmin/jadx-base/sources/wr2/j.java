package wr2;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/j;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f186862a = new j();

    private j() {
    }

    public static void a(String str, String str2) {
        Bundle bundleD = tn.k.d("EcomFailureSource", str, "EcomFailureReason", str2);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "GarminPayDeeplinkFailure");
    }

    public static void b(String str) {
        Bundle bundleD = b71.i.d("EcomFinishReason", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "GarminPayDeeplinkAttemptFinish");
    }

    public static void c(String str) {
        Bundle bundleD = tn.k.d("InstallationId", hb2.g.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c()), Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "nfcServiceError");
    }
}
