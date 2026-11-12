package vq2;

import android.view.View;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import v.b0;
import vn2.k1;

/* JADX INFO: loaded from: classes11.dex */
public interface f extends c {
    public static final /* synthetic */ int A0 = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq2/f$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f179463a;

        static {
            new a();
            int i14 = gt2.c.f79010a;
            f179463a = gt2.b.f79005a.h("PAY#SnackbarSupport");
        }

        private a() {
        }
    }

    static {
        Logger logger = a.f179463a;
    }

    default void Q6() {
        a.f179463a.trace("showSnackbar()");
        getF52032a().runOnUiThread(new b0((k1) this, 15));
    }

    View W0();

    default void s7(String str) {
        a.f179463a.trace("showSnackbar()");
        getF52032a().runOnUiThread(new vg1.d(7, this, str));
    }
}
