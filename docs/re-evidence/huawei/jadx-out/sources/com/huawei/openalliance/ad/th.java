package com.huawei.openalliance.ad;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class th extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private rc e;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        String str;
        boolean z;
        hw.b("AppAction", "handle app action");
        try {
            d();
            AppInfo appInfoAg = this.f20324b.ag();
            String packageName = appInfoAg == null ? null : appInfoAg.getPackageName();
            String strI = this.f20324b.I();
            com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
            aVar.a(appInfoAg).a(this.f20324b, this.f20323a);
            com.huawei.openalliance.ad.utils.dcservice.c cVarA = aVar.a();
            if (TextUtils.isEmpty(strI) || !strI.startsWith("hwpps")) {
                z = true;
            } else {
                strI = strI + "&PPSFromIntent=hwpps";
                z = false;
            }
            Intent intentA = com.huawei.openalliance.ad.utils.k.a(this.f20323a, strI, packageName, cVarA, true);
            if (intentA == null) {
                hw.c("AppAction", "cannot find target activity");
                e();
                return b();
            }
            intentA.addFlags(268435456);
            a(intentA, strI);
            a(intentA);
            if (appInfoAg != null) {
                aVar.a(appInfoAg);
            }
            aVar.a(intentA);
            com.huawei.openalliance.ad.utils.k.a(this.f20323a, intentA, aVar.a());
            c(com.huawei.openalliance.ad.utils.l.a(packageName, appInfoAg));
            com.huawei.openalliance.ad.download.app.l.a(this.f20323a, this.f20324b.ag());
            if (z) {
                this.e.a(EventType.INTENTSUCCESS, Integer.valueOf(com.huawei.openalliance.ad.utils.l.b(packageName, appInfoAg)), (Integer) null);
            }
            return true;
        } catch (ActivityNotFoundException unused) {
            str = "activity not exist";
            hw.c("AppAction", str);
        } catch (Exception unused2) {
            str = "handle intent url fail";
            hw.c("AppAction", str);
        }
    }

    private void e() {
        String str;
        ApkInfo apkInfoS;
        try {
            MetaData metaData = (MetaData) com.huawei.openalliance.ad.utils.bk.b(this.f20324b.h(), MetaData.class, new Class[0]);
            this.e.a(EventType.INTENTFAIL, (Integer) 1, Integer.valueOf((metaData == null || (apkInfoS = metaData.s()) == null || com.huawei.openalliance.ad.utils.k.b(this.f20323a, apkInfoS.a()) == null) ? 1 : 2));
        } catch (IllegalStateException unused) {
            str = "recordOpenFailEvent IllegalStateException";
            hw.c("AppAction", str);
        } catch (Exception e) {
            str = "recordOpenFailEvent " + e.getClass().getSimpleName();
            hw.c("AppAction", str);
        }
    }

    private void d() {
        PromoteInfo promoteInfoAh = this.f20324b.ah();
        if (promoteInfoAh == null || promoteInfoAh.getType() != 1) {
            return;
        }
        hw.a("AppAction", "promoteInfo Type is FastApp");
        new com.huawei.openalliance.ad.analysis.c(this.f20323a).b(promoteInfoAh.getName(), this.f20324b);
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            hw.b("AppAction", "uri is http or https url.");
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            return TextUtils.equals("hwpps", uri.getScheme()) && TextUtils.equals(Constants.SCHEME_HOST, uri.getHost());
        } catch (Throwable th) {
            hw.c("AppAction", "isHwPPSUri exception." + th.getClass().getSimpleName());
            return false;
        }
    }

    private void a(Intent intent, String str) {
        if (intent == null || TextUtils.isEmpty(str) || str.indexOf("hwpps") <= 0) {
            return;
        }
        intent.addFlags(268435456);
    }

    private void a(Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        String strC = com.huawei.openalliance.ad.inter.a.a().c();
        hw.b("AppAction", "at is null ? " + TextUtils.isEmpty(strC));
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        if (!a(safeIntent.getDataString())) {
            hw.b("AppAction", "isHwPPSUri false.");
        } else if (com.huawei.openalliance.ad.utils.k.c(this.f20323a)) {
            safeIntent.putExtra("accessToken", strC);
        } else {
            hw.b("AppAction", "isHMSInstalled false.");
        }
    }

    public th(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.e = pcVar;
        pcVar.a(contentRecord);
    }
}
