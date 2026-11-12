package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;

/* JADX INFO: loaded from: classes12.dex */
public class nb extends com.huawei.openalliance.ad.ipc.b<com.huawei.android.hms.ppskit.a> {
    private static nb d;
    private static final byte[] e = new byte[0];

    public interface a {
        void a(String str, String str2);
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public boolean e() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public boolean f() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String h() {
        return "com.huawei.android.hms.ppskit.PpsChannelInfoService";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String g() {
        return "42";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String d() {
        return com.huawei.openalliance.ad.utils.k.e(this.f19250a);
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String c() {
        return "com.huawei.android.hms.CHANNEL_SERVICE";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public final String b() {
        return "ChannelInfoService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.ipc.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.huawei.android.hms.ppskit.a a(IBinder iBinder) {
        return com.huawei.android.hms.ppskit.a.AbstractBinderC0056a.a(iBinder);
    }

    public void a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a(new c(str, str2, i), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public void a(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            hw.b("ChannelInfoService", " pkgName is empty");
        } else {
            a(new b(str, aVar), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    static class b extends com.huawei.openalliance.ad.ipc.b.a<com.huawei.android.hms.ppskit.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f19666b;

        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(com.huawei.android.hms.ppskit.a aVar) {
            try {
                String strA = aVar.a(this.f19665a);
                a aVar2 = this.f19666b;
                if (aVar2 != null) {
                    aVar2.a(this.f19665a, strA);
                }
            } catch (RemoteException unused) {
                hw.c("ChannelInfoService", "QueryChannelInfo RemoteException");
            }
        }

        public b(String str, a aVar) {
            this.f19665a = str;
            this.f19666b = aVar;
        }
    }

    static class c extends com.huawei.openalliance.ad.ipc.b.a<com.huawei.android.hms.ppskit.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f19668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19669c;

        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(com.huawei.android.hms.ppskit.a aVar) {
            try {
                aVar.a(this.f19667a, this.f19668b, this.f19669c);
            } catch (RemoteException unused) {
                hw.c("ChannelInfoService", "setInstallSource RemoteException");
            }
        }

        public c(String str, String str2, int i) {
            this.f19667a = str;
            this.f19668b = str2;
            this.f19669c = i;
        }
    }

    public static nb a(Context context) {
        nb nbVar;
        synchronized (e) {
            if (d == null) {
                d = new nb(context);
            }
            nbVar = d;
        }
        return nbVar;
    }

    private nb(Context context) {
        super(context);
        this.f19252c = new com.huawei.openalliance.ad.ipc.a(context, b(), this);
    }
}
