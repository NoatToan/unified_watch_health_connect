package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import q6.f;
import ug.b;

/* JADX INFO: loaded from: classes7.dex */
public class APayEntranceActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f28399d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lh.a f28402c;

    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public final void finish() {
        String str = this.f28401b;
        lh.a aVar = this.f28402c;
        StringBuilder sbI = sn.a.i(str, "|");
        sbI.append(TextUtils.isEmpty(this.f28400a));
        wg.a.c(aVar, "biz", "BSAFinish", sbI.toString());
        if (TextUtils.isEmpty(this.f28400a)) {
            this.f28400a = b.a();
            lh.a aVar2 = this.f28402c;
            if (aVar2 != null) {
                aVar2.f112382g = true;
            }
        }
        if (str != null) {
            a aVarRemove = f28399d.remove(str);
            if (aVarRemove != null) {
                aVarRemove.a(this.f28400a);
            } else {
                wg.a.g(this.f28402c, "wr", "refNull", "session=".concat(str));
            }
        }
        try {
            super.finish();
        } catch (Throwable th3) {
            wg.a.d(this.f28402c, "wr", "APStartFinish", th3);
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        lh.a aVar = this.f28402c;
        StringBuilder sb3 = new StringBuilder();
        f.q(i14, this.f28401b, "|", ",", sb3);
        sb3.append(i15);
        wg.a.c(aVar, "biz", "BSAOnAR", sb3.toString());
        if (i14 == 1000) {
            if (intent != null) {
                try {
                    this.f28400a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.f28401b = extras.getString("ap_session");
            String string3 = extras.getString("ap_local_info", "{}");
            if (!TextUtils.isEmpty(this.f28401b)) {
                String str = this.f28401b;
                HashMap<UUID, lh.a> map = lh.a.C2158a.f112387a;
                lh.a aVarRemove = TextUtils.isEmpty(str) ? null : lh.a.C2158a.f112388b.remove(str);
                this.f28402c = aVarRemove;
                wg.a.c(aVarRemove, "biz", "BSAEntryCreate", this.f28401b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th3) {
                wg.a.d(this.f28402c, "wr", "APStartEx", th3);
                finish();
            }
            if (this.f28402c != null) {
                Context applicationContext = getApplicationContext();
                lh.a aVar = this.f28402c;
                wg.a.a(string, aVar.f112379d, applicationContext, aVar);
                this.f28402c.f112383h = true;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
