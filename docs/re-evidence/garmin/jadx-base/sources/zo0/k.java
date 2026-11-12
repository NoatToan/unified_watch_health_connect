package zo0;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.s0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/k;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f206161b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206162a;

    static {
        new a(null);
    }

    public k(q qVar) {
        qVar.getClass();
        this.f206162a = qVar;
    }

    @Override // zo0.p
    public final v0 b(final n nVar) {
        if (!(nVar instanceof n.e)) {
            return null;
        }
        Resources resourcesU5 = this.f206162a.u5();
        final bb2.i iVar = ((n.e) nVar).f206175a;
        String string = resourcesU5.getString(R.string.connect_iq_device_has_disconnected_title);
        string.getClass();
        String string2 = resourcesU5.getString(R.string.msg_device_disconnected_try_reconnect, iVar.f17364d);
        string2.getClass();
        s0.a aVar = s0.f149856f;
        String string3 = resourcesU5.getString(R.string.lbl_reconnect_device_bond);
        string3.getClass();
        final int i14 = 0;
        e23.a aVar2 = new e23.a(this) { // from class: zo0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f206158b;

            {
                this.f206158b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                bb2.i iVar2 = iVar;
                n nVar2 = nVar;
                k kVar = this.f206158b;
                switch (i15) {
                    case 0:
                        int i16 = k.f206161b;
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICES, "DeviceReconnectDialogHandler", "onDialog Reconnect Device " + nVar2);
                        ge1.b.T(kVar.f206162a.Q7(), null, null, new m(kVar, iVar2, null), 3);
                        break;
                    default:
                        int i17 = k.f206161b;
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICES, "DeviceReconnectDialogHandler", "onDialog Cancel " + nVar2);
                        ge1.b.T(kVar.f206162a.Q7(), null, null, new l(kVar, iVar2, null), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        String string4 = resourcesU5.getString(R.string.lbl_cancel);
        final int i15 = 1;
        return s0.a.a(aVar, string, string2, string3, aVar2, string4, new e23.a(this) { // from class: zo0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f206158b;

            {
                this.f206158b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                bb2.i iVar2 = iVar;
                n nVar2 = nVar;
                k kVar = this.f206158b;
                switch (i16) {
                    case 0:
                        int i17 = k.f206161b;
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICES, "DeviceReconnectDialogHandler", "onDialog Reconnect Device " + nVar2);
                        ge1.b.T(kVar.f206162a.Q7(), null, null, new m(kVar, iVar2, null), 3);
                        break;
                    default:
                        int i18 = k.f206161b;
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICES, "DeviceReconnectDialogHandler", "onDialog Cancel " + nVar2);
                        ge1.b.T(kVar.f206162a.Q7(), null, null, new l(kVar, iVar2, null), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 32);
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        bb2.i iVarC = CacheDatabase.i().g().c();
        if (iVarC == null) {
            return null;
        }
        long j8 = iVarC.f17361a;
        a2 a2Var = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceReconnectDialogHandler", "requestDialogData device needs bond " + iVarC);
        rd2.f.a().f152045a.getClass();
        if (rd2.j.i(j8, null) != null) {
            return new n.e(iVarC);
        }
        i2.a.b(a2Var, "DeviceReconnectDialogHandler", "requestDialogData device removed from user account in the meantime " + iVarC);
        CacheDatabase.i().g().a(j8);
        return c(dVar);
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        if (nVar instanceof n.p) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICES, "DeviceReconnectDialogHandler", "onDialogShown " + nVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
