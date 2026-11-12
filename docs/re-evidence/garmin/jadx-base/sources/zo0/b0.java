package zo0;

import android.content.res.Resources;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r22.s0;
import r22.v0;
import yr.o0;
import zb0.l1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/b0;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f206098b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206099a;

    static {
        new a(null);
    }

    public b0(q qVar) {
        qVar.getClass();
        this.f206099a = qVar;
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.p)) {
            return null;
        }
        Resources resourcesU5 = this.f206099a.u5();
        String string = resourcesU5.getString(R.string.msg_device_disconnected_try_reconnect, ((n.p) nVar).f206193a.getProductDisplayName());
        string.getClass();
        s0.a aVar = s0.f149856f;
        String string2 = resourcesU5.getString(R.string.connect_iq_device_has_disconnected_title);
        String string3 = resourcesU5.getString(R.string.lbl_reconnect_device_bond);
        string3.getClass();
        return s0.a.a(aVar, string2, string, string3, new z10.d(16, this, nVar), resourcesU5.getString(R.string.lbl_cancel), new o0(this, nVar), SyslogConstants.LOG_LOCAL4);
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        sd2.f fVarI;
        l1.f203565a.getClass();
        f12.l.f68084a.getClass();
        Set<String> setL1 = f12.l.a.a().L1("SystemBondingLostDeviceIds");
        a2 a2Var = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SystemBondingLostEventHandler", "checkSystemBondingLostCache " + setL1);
        String str = (String) h0.c0(setL1);
        if (str != null) {
            i2.a.b(a2Var, "SystemBondingLostEventHandler", "checkSystemBondingLostCache found device unit id ".concat(str));
            rd2.j jVar = rd2.f.a().f152045a;
            long j8 = Long.parseLong(str);
            jVar.getClass();
            fVarI = rd2.j.i(j8, null);
            if (fVarI != null) {
                i2.a.b(a2Var, "SystemBondingLostEventHandler", "checkSystemBondingLostCache found device " + fVarI);
            } else {
                i2.a.b(a2Var, "SystemBondingLostEventHandler", "checkSystemBondingLostCache no device found for device unit id ".concat(str));
                l1.a(str);
                fVarI = null;
            }
        } else {
            fVarI = null;
        }
        if (fVarI != null) {
            return new n.p(fVarI);
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        if (nVar instanceof n.p) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICES, "SystemBondingLostDialogHandler", "onDialogShown " + nVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lzo0/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GARMIN", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
