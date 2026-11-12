package vq2;

import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import v.b0;

/* JADX INFO: loaded from: classes11.dex */
public interface e extends d {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f179461z0 = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq2/e$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f179462a;

        static {
            new a();
            int i14 = gt2.c.f79010a;
            f179462a = gt2.b.f79005a.h("PAY#ProgressOverlaySupport");
        }

        private a() {
        }
    }

    static {
        Logger logger = a.f179462a;
    }

    default void S5(String str, String str2) {
        a.f179462a.trace("showProgressOverlay()");
        M().runOnUiThread(new uj2.b(this, 8, str, str2));
    }

    default void U5(int i14) {
        S5(M().getString(i14), M().getString(R.string.wallet_dont_disconnect_device));
    }

    default void hideProgressOverlay() {
        a.f179462a.trace("hideProgressOverlay()");
        M().runOnUiThread(new b0(this, 14));
    }
}
