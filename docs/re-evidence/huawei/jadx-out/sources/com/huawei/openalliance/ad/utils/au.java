package com.huawei.openalliance.ad.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.gp;
import com.huawei.openalliance.ad.gq;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class au {
    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final IBinder iBinder, final boolean z, final cn cnVar) {
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.utils.au.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    gq gqVarA = gq.a.a(iBinder);
                    if (gqVarA == null) {
                        return;
                    }
                    gqVarA.a(new gp.a() { // from class: com.huawei.openalliance.ad.utils.au.2.1
                        @Override // com.huawei.openalliance.ad.gp
                        public void a(int i, long j, boolean z2, float f, double d, String str) {
                        }

                        @Override // com.huawei.openalliance.ad.gp
                        public void a(int i, Bundle bundle) {
                            if (bundle == null) {
                                hw.d("HonorIdentifierManager", "param err");
                                return;
                            }
                            String string = bundle.getString("oa_id_flag");
                            boolean z2 = TextUtils.isEmpty(string) || Constants.NIL_UUID.equals(string);
                            cnVar.a(string, Boolean.valueOf(z2), z);
                            hw.a("HonorIdentifierManager", "OAIDCallBack handleResult success oaid: %s, oaidLimitState: %s", string, Boolean.valueOf(z2));
                        }
                    });
                } catch (Throwable th) {
                    hw.d("HonorIdentifierManager", "HnOaIdService get oaid error: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public static Pair<String, Boolean> a(final Context context, final boolean z) {
        try {
            hw.a("HonorIdentifierManager", "requestHonorOaid start");
            PackageManager packageManager = context.getPackageManager();
            final cn cnVarA = cn.a(context);
            Intent intent = new Intent("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            if (!packageManager.queryIntentServices(intent, 0).isEmpty()) {
                context.bindService(intent, new ServiceConnection() { // from class: com.huawei.openalliance.ad.utils.au.1
                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                        hw.a("HonorIdentifierManager", "HnOaIdService IdentifyService disconnected");
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        hw.a("HonorIdentifierManager", "HnOaIdService IdentifyService connected");
                        try {
                            try {
                                try {
                                    au.b(iBinder, z, cnVarA);
                                    context.unbindService(this);
                                } catch (Throwable unused) {
                                    hw.d("HonorIdentifierManager", "HnOaIdService IdentifyService, unbind service error");
                                }
                            } catch (Throwable th) {
                                try {
                                    context.unbindService(this);
                                } catch (Throwable unused2) {
                                    hw.d("HonorIdentifierManager", "HnOaIdService IdentifyService, unbind service error");
                                }
                                throw th;
                            }
                        } catch (Throwable unused3) {
                            hw.d("HonorIdentifierManager", "HnOaIdService IdentifyService, bind service error");
                            context.unbindService(this);
                        }
                    }
                }, 1);
            }
            return cnVarA.ah();
        } catch (Exception unused) {
            hw.d("HonorIdentifierManager", "HnOaIdService IdentifyService getPackageInfo exception.");
            return null;
        }
    }

    public static Pair<String, Boolean> a(Context context) {
        gk gkVarB = fp.b(context);
        long jCG = gkVarB.cG();
        long jR = ((long) gkVarB.R()) * 60000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jCG >= jR) {
            hw.a("HonorIdentifierManager", "HnOaIdService getOaidAndTrackLimit cache lastReqHonorOaidTime: %s, reqOaidTimeInterval: %s", Long.valueOf(jCG), Long.valueOf(jR));
            gkVarB.o(jCurrentTimeMillis);
            return a(context, false);
        }
        Pair<String, Boolean> pairAh = cn.a(context).ah();
        if (hw.a() && pairAh != null) {
            hw.a("HonorIdentifierManager", "HnOaIdService getOaidAndTrackLimit cache oaid: %s, oaidLimitState: %s", pairAh.first, pairAh.second);
        }
        return pairAh;
    }
}
