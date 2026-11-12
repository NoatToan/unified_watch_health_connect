package com.huawei.openalliance.ad;

import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media3.common.C;
import com.huawei.android.hms.ppskit.RemoteInstallReq;

/* JADX INFO: loaded from: classes12.dex */
public class nc extends com.huawei.openalliance.ad.ipc.b<com.huawei.android.hms.ppskit.b> {
    private static nc d;
    private static final byte[] e = new byte[0];

    public static abstract class a implements com.huawei.android.hms.ppskit.c {
        public abstract void a(String str);

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public boolean f() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String h() {
        return "com.huawei.android.hms.ppskit.PpsInstallationService";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String g() {
        return "44";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String d() {
        return com.huawei.openalliance.ad.utils.k.e(this.f19250a);
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String c() {
        return "com.huawei.openalliance.ad.INSTALL_SERVICE";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public final String b() {
        return "PPSInstallServiceManager";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.ipc.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.huawei.android.hms.ppskit.b a(IBinder iBinder) {
        return com.huawei.android.hms.ppskit.b.a.a(iBinder);
    }

    public void a(RemoteInstallReq remoteInstallReq, Uri uri, a aVar, long j) {
        if (aVar == null) {
            return;
        }
        a(new c(aVar, remoteInstallReq, uri), j);
    }

    static class c extends com.huawei.openalliance.ad.ipc.b.a<com.huawei.android.hms.ppskit.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f19671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RemoteInstallReq f19672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f19673c;

        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(String str) {
            a aVar = this.f19671a;
            if (aVar != null) {
                aVar.a(str);
            }
        }

        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(com.huawei.android.hms.ppskit.b bVar) {
            try {
                hw.b("PPSInstallServiceManager", "call install service");
                bVar.a(this.f19672b, this.f19673c, new b(this.f19671a));
            } catch (RemoteException e) {
                hw.c("PPSInstallServiceManager", "pkg install RemoteException");
                a aVar = this.f19671a;
                if (aVar != null) {
                    aVar.a("pkg install RemoteException: " + e.getClass().getSimpleName());
                }
            }
        }

        c(a aVar, RemoteInstallReq remoteInstallReq, Uri uri) {
            this.f19671a = aVar;
            this.f19672b = remoteInstallReq;
            this.f19673c = uri;
        }
    }

    public void a(RemoteInstallReq remoteInstallReq, Uri uri, a aVar) {
        a(remoteInstallReq, uri, aVar, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    static class b extends com.huawei.android.hms.ppskit.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f19670a;

        @Override // com.huawei.android.hms.ppskit.c
        public void a(boolean z, int i) {
            a aVar = this.f19670a;
            if (aVar != null) {
                aVar.a(z, i);
            }
        }

        b(a aVar) {
            this.f19670a = aVar;
        }
    }

    public static nc a(Context context) {
        nc ncVar;
        synchronized (e) {
            if (d == null) {
                d = new nc(context);
            }
            ncVar = d;
        }
        return ncVar;
    }

    private nc(Context context) {
        super(context);
        this.f19252c = new com.huawei.openalliance.ad.ipc.a(context, b(), this);
    }
}
