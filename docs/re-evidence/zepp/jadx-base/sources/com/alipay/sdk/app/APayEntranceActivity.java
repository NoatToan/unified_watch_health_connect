package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.k.b;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes2.dex */
public class APayEntranceActivity extends Activity {
    public static final String d = "ap_order_info";
    public static final String e = "ap_target_packagename";
    public static final String f = "ap_session";
    public static final String g = "ap_local_info";
    public static final ConcurrentHashMap<String, a> h = new ConcurrentHashMap<>();
    public String a;
    public String b;
    public com.alipay.sdk.m.s.a c;

    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.b;
        com.alipay.sdk.m.k.a.a(this.c, b.l, "BSAFinish", str + AESEncryptionHelper.SEPARATOR + TextUtils.isEmpty(this.a));
        if (TextUtils.isEmpty(this.a)) {
            this.a = com.alipay.sdk.m.j.b.a();
        }
        if (str != null) {
            a aVarRemove = h.remove(str);
            if (aVarRemove != null) {
                aVarRemove.a(this.a);
            } else {
                com.alipay.sdk.m.k.a.b(this.c, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(this.c, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.alipay.sdk.m.k.a.a(this.c, b.l, "BSAOnAR", this.b + AESEncryptionHelper.SEPARATOR + i + "," + i2);
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(d);
            String string2 = extras.getString(e);
            this.b = extras.getString(f);
            String string3 = extras.getString(g, MessageFormatter.c);
            if (!TextUtils.isEmpty(this.b)) {
                com.alipay.sdk.m.s.a aVarA = com.alipay.sdk.m.s.a.C0094a.a(this.b);
                this.c = aVarA;
                com.alipay.sdk.m.k.a.a(aVarA, b.l, "BSAEntryCreate", this.b + AESEncryptionHelper.SEPARATOR + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                com.alipay.sdk.m.k.a.a(this.c, "wr", "APStartEx", th);
                finish();
            }
            Context applicationContext = getApplicationContext();
            com.alipay.sdk.m.s.a aVar = this.c;
            com.alipay.sdk.m.k.a.a(applicationContext, aVar, string, aVar.d);
        } catch (Throwable unused) {
            finish();
        }
    }
}
