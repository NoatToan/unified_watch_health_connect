package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes34.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f15887c = {"url", "app", "cosa", "rp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f15888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f15889b;

    public u(Context context, o oVar) {
        this.f15888a = context;
        this.f15889b = oVar;
    }

    public static boolean a(String str) {
        for (String str2 : f15887c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c4 A[PHI: r2 r3
      0x00c4: PHI (r2v22 android.content.Intent) = (r2v16 android.content.Intent), (r2v25 android.content.Intent) binds: [B:10:0x0085, B:17:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r3v5 boolean) = (r3v3 boolean), (r3v1 boolean) binds: [B:10:0x0085, B:17:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    private void b() {
        Intent uri;
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.f15889b.c() + ",and msg.intentUri is " + this.f15889b.m());
            Intent intentB = e.b(this.f15888a, this.f15889b.c());
            boolean zBooleanValue = false;
            if (this.f15889b.m() != null) {
                try {
                    uri = Intent.parseUri(this.f15889b.m(), 0);
                    uri.setSelector(null);
                    if (uri.getClipData() == null) {
                        uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = e.a(this.f15888a, this.f15889b.c(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentB = uri;
                    }
                } catch (Exception e) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (this.f15889b.a() != null) {
                uri = new Intent(this.f15889b.a());
                if (e.a(this.f15888a, this.f15889b.c(), uri).booleanValue()) {
                    intentB = uri;
                }
            }
            if (intentB == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentB.setPackage(this.f15889b.c());
            if (zBooleanValue) {
                intentB.addFlags(268435456);
            } else {
                intentB.setFlags(805437440);
            }
            this.f15888a.startActivity(intentB);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public void c() {
        o oVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f15888a == null || (oVar = this.f15889b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(oVar.h())) {
            a();
            return;
        }
        if ("cosa".equals(this.f15889b.h())) {
            b();
            return;
        }
        if ("rp".equals(this.f15889b.h())) {
            HMSLog.w("PushSelfShowLog", this.f15889b.h() + " not support rich message.");
            return;
        }
        if ("url".equals(this.f15889b.h())) {
            HMSLog.w("PushSelfShowLog", this.f15889b.h() + " not support URL.");
            return;
        }
        HMSLog.d("PushSelfShowLog", this.f15889b.h() + " is not exist in hShowType");
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.f15889b.c());
            if (e.c(this.f15888a, this.f15889b.c())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }
}
