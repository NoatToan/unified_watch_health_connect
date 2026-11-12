package yn2;

import android.content.DialogInterface;
import c2.r;
import cw1.k0;
import e23.l;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vn2.t;

/* JADX INFO: loaded from: classes11.dex */
public interface b extends vq2.b {
    public static final /* synthetic */ int G0 = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyn2/b$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f198202a;

        static {
            new a();
            int i14 = gt2.c.f79010a;
            f198202a = gt2.b.f79005a.h("PAY#FelicaDialogSupport");
        }

        private a() {
        }
    }

    static {
        Logger logger = a.f198202a;
    }

    default void C1(l<? super DialogInterface, Unit> lVar) {
        a.f198202a.trace("showHasBeenPunchedErrorDialog()");
        Z5(new wr1.d(lVar, 16));
    }

    default void C3(int i14, String str, String str2, int i15, l<? super DialogInterface, Unit> lVar) {
        str2.getClass();
        a.f198202a.trace("showCallCenterDialog()");
        Z5(new r(i14, str, i15, lVar, this, str2));
    }

    default void O6(t tVar) {
        a.f198202a.trace("showTransactionHistoryErrorDialog()");
        Z5(new xa2.g(tVar, 22));
    }

    default void R1() {
        a.f198202a.trace("showExportPDFFailedDialog()");
        Z5(new ya1.h(26));
    }

    default void e2(l<? super DialogInterface, Unit> lVar) {
        a.f198202a.trace("showServerInUrgentMaintenanceErrorDialog()");
        Z5(new wr1.d(lVar, 15));
    }

    default void o6(e23.a aVar, String str, int i14) {
        str.getClass();
        a.f198202a.trace("showOperationFailedErrorDialog()");
        Z5(new k0(i14, str, this, aVar, 17));
    }
}
