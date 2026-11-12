package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media3.common.C;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class na extends com.huawei.openalliance.ad.ipc.b<com.huawei.android.hms.ppskit.e> {
    private static na d;
    private static final byte[] e = new byte[0];

    @Override // com.huawei.openalliance.ad.ipc.b
    public boolean f() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String g() {
        return null;
    }

    public void i() {
        hw.b(b(), "onRequestingAd");
        a(new a(), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String h() {
        return "com.huawei.android.hms.ppskit.PpsCoreService";
    }

    static class b<T> extends com.huawei.openalliance.ad.ipc.b.a<com.huawei.android.hms.ppskit.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f19662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RemoteCallResultCallback<T> f19663c;
        private Class<T> d;
        private Context e;

        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(String str) {
            b("serviceCallFailed: " + str);
        }

        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(com.huawei.android.hms.ppskit.e eVar) {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "3.4.84.300");
                jSONObject.put("content", this.f19662b);
                eVar.a(this.f19661a, jSONObject.toString(), new com.huawei.android.hms.ppskit.d.a() { // from class: com.huawei.openalliance.ad.na.b.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.huawei.android.hms.ppskit.d
                    public void a(String str2, int i, String str3) {
                        String message;
                        if (hw.a()) {
                            hw.a("PPSApiServiceManager", "call: %s code: %s result: %s", str2, Integer.valueOf(i), com.huawei.openalliance.ad.utils.ds.a(str3));
                        }
                        CallResult callResult = new CallResult();
                        callResult.setCode(i);
                        try {
                            if (i == 200) {
                                callResult.setData(nd.a(str3, b.this.d));
                            } else {
                                callResult.setMsg(str3);
                            }
                        } catch (IllegalArgumentException e) {
                            hw.c("PPSApiServiceManager", "onCallResult IllegalArgumentException");
                            callResult.setCode(-1);
                            message = e.getMessage();
                            callResult.setMsg(message);
                        } catch (Throwable th) {
                            hw.c("PPSApiServiceManager", "onCallResult " + th.getClass().getSimpleName());
                            callResult.setCode(-1);
                            message = th.getMessage();
                            callResult.setMsg(message);
                        }
                        b bVar = b.this;
                        bVar.a(bVar.f19663c, str2, callResult);
                    }
                });
            } catch (RemoteException unused) {
                str = "remote call RemoteException";
                b(str);
            } catch (Throwable th) {
                str = "remote call " + th.getClass().getSimpleName();
                b(str);
            }
        }

        private void b(String str) {
            hw.c("PPSApiServiceManager", str);
            CallResult callResult = new CallResult();
            callResult.setCode(-1);
            callResult.setMsg(str);
            a(this.f19663c, this.f19661a, callResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(RemoteCallResultCallback remoteCallResultCallback, String str, CallResult callResult) {
            boolean zBf;
            if (callResult != null) {
                hw.b("PPSApiServiceManager", "call %s code: %s msg: %s", str, Integer.valueOf(callResult.getCode()), callResult.getMsg());
                if (callResult.getCode() == -100 && (zBf = fp.b(this.e).bf())) {
                    HiAd.a(this.e).a(zBf);
                }
            }
            if (remoteCallResultCallback != null) {
                remoteCallResultCallback.onRemoteCallResult(str, callResult);
            }
        }

        b(Context context, String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
            this.e = context;
            this.f19661a = str;
            this.f19662b = str2;
            this.f19663c = remoteCallResultCallback;
            this.d = cls;
        }
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String d() {
        return com.huawei.openalliance.ad.utils.k.e(this.f19250a);
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public String c() {
        return "com.huawei.android.hms.ppskit.PPS_API_SERVICE";
    }

    @Override // com.huawei.openalliance.ad.ipc.b
    public final String b() {
        return "PPSApiServiceManager";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.ipc.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.huawei.android.hms.ppskit.e a(IBinder iBinder) {
        return com.huawei.android.hms.ppskit.e.a.a(iBinder);
    }

    static class a extends com.huawei.openalliance.ad.ipc.b.a<com.huawei.android.hms.ppskit.e> {
        @Override // com.huawei.openalliance.ad.ipc.b.a
        public void a(com.huawei.android.hms.ppskit.e eVar) {
            try {
                eVar.a();
            } catch (RemoteException unused) {
                hw.c("PPSApiServiceManager", "setInstallSource RemoteException");
            }
        }

        private a() {
        }
    }

    public <T> void a(String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        hw.b(b(), "call remote method: " + str);
        a(new b(this.f19250a, str, str2, remoteCallResultCallback, cls), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public static na a(Context context) {
        na naVar;
        synchronized (e) {
            if (d == null) {
                d = new na(context);
            }
            naVar = d;
        }
        return naVar;
    }

    private na(Context context) {
        super(context);
        this.f19252c = new com.huawei.openalliance.ad.ipc.a(context, b(), this);
    }
}
