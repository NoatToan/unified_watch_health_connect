package ma2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f117660a;

    public static class a implements f, d, pj2.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pj2.k f117661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Logger f117662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f117663c;

        /* JADX INFO: renamed from: ma2.b$a$a, reason: collision with other inner class name */
        public class C2230a implements FutureCallback<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UUID f117664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UUID f117665b;

            public C2230a(UUID uuid, UUID uuid2) {
                this.f117664a = uuid;
                this.f117665b = uuid2;
            }

            public final void a(boolean z14) {
                a aVar = a.this;
                try {
                    aVar.f117663c.onBleCharacteristicNotificationSet(aVar.f117661a.getMacAddress(), this.f117664a, this.f117665b, z14);
                } catch (Exception e4) {
                    aVar.f117662b.error("Unexpected exception notifying legacy callback.", (Throwable) e4);
                }
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onFailure(Throwable th3) {
                a.this.f117662b.error("Set BLE characteristic failed", th3);
                a(false);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onSuccess(Void r14) {
                a(true);
            }
        }

        /* JADX INFO: renamed from: ma2.b$a$b, reason: collision with other inner class name */
        public class C2231b implements FutureCallback<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UUID f117667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UUID f117668b;

            public C2231b(UUID uuid, UUID uuid2) {
                this.f117667a = uuid;
                this.f117668b = uuid2;
            }

            public final void a(boolean z14) {
                a aVar = a.this;
                try {
                    aVar.f117663c.onBleCharacteristicWritten(aVar.f117661a.getMacAddress(), this.f117667a, this.f117668b, z14);
                } catch (Exception e4) {
                    aVar.f117662b.error("Unexpected exception notifying legacy callback.", (Throwable) e4);
                }
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onFailure(Throwable th3) {
                a.this.f117662b.error("Write BLE characteristic failed", th3);
                a(false);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onSuccess(Void r14) {
                a(true);
            }
        }

        public a(pj2.k kVar) {
            String strB = oa2.d.b("GDI#", "LegacySubscriberAdapter", kVar.getMacAddress(), -1L, this);
            int i14 = gt2.c.f79010a;
            this.f117662b = gt2.b.f79005a.i(strB);
            this.f117661a = kVar;
        }

        @Override // pj2.l
        public final void a(pj2.k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
            try {
                this.f117663c.onBlePacketReceived(kVar.getMacAddress(), uuid, uuid2, bArr);
            } catch (Exception e4) {
                this.f117662b.error("Unexpected exception notifying legacy callback.", (Throwable) e4);
            }
        }

        @Override // ma2.d
        public final void b(UUID uuid, UUID uuid2, boolean z14) {
            pj2.k kVar = this.f117661a;
            if (z14) {
                kVar.a(this, uuid, uuid2);
            } else {
                kVar.e(this, uuid, uuid2);
            }
            Futures.addCallback(kVar.s(uuid, uuid2, z14), new C2230a(uuid, uuid2), MoreExecutors.directExecutor());
        }

        @Override // ma2.d
        public final void c(UUID uuid, UUID uuid2, byte[] bArr) {
            Futures.addCallback(this.f117661a.j(uuid, uuid2, bArr), new C2231b(uuid, uuid2), MoreExecutors.directExecutor());
        }

        @Override // ma2.f
        public final boolean initialize(UUID uuid, UUID[] uuidArr) {
            pj2.k kVar = this.f117661a;
            this.f117663c.onBleServicesDiscovered(new da2.k(kVar.getMacAddress(), kVar.getName()), uuid, uuidArr);
            return true;
        }

        @Override // ma2.f
        public final void onDeviceDisconnect() {
            try {
                this.f117663c.onRemoteDeviceDisconnected(this.f117661a.getMacAddress());
            } catch (Exception e4) {
                this.f117662b.error("Unexpected exception notifying legacy callback.", (Throwable) e4);
            }
        }
    }

    /* JADX INFO: renamed from: ma2.b$b, reason: collision with other inner class name */
    public static class C2232b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f117670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f117671b;

        public C2232b(e eVar, UUID uuid) {
            this.f117670a = eVar;
            this.f117671b = uuid;
        }

        @Override // ma2.f.a
        public final f create(Context context, da2.e eVar, pj2.k kVar) {
            e eVar2 = this.f117670a;
            c cVarCreate = eVar2.create(context);
            if (cVarCreate == null) {
                return null;
            }
            a aVar = new a(kVar);
            aVar.f117663c = cVarCreate;
            if (cVarCreate instanceof e) {
                ((e) cVarCreate).init(this.f117671b, aVar, eVar2);
            }
            return aVar;
        }
    }

    private b() {
    }

    public static b a() {
        if (f117660a == null) {
            f117660a = new b();
        }
        return f117660a;
    }
}
