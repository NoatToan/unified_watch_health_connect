package com.huawei.openalliance.ad.inter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.huawei.hms.ads.inner.IECCallback;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.k;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19140a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f19141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IECCallback f19142c;
    private String d;

    public String c() {
        return this.d;
    }

    public String b() {
        IECCallback iECCallback = this.f19142c;
        if (iECCallback != null) {
            return iECCallback.getAccessToken();
        }
        hw.b("ECATManager", "accessTokenProvider is null, return");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[PHI: r1
      0x0031: PHI (r1v2 android.net.Uri) = (r1v1 android.net.Uri), (r1v7 android.net.Uri) binds: [B:9:0x0019, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:16:0x003e, B:18:0x004c, B:19:0x0051), top: B:25:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean a(Context context, String str) {
        String strD;
        String str2;
        Intent intent;
        if (context == null) {
            str2 = "context is null.";
        } else if (TextUtils.isEmpty(str)) {
            str2 = "url is null.";
        } else {
            Uri uriB = b(str);
            if (a(uriB)) {
                strD = k.d(context);
                if (!TextUtils.isEmpty(strD)) {
                    intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uriB);
                    intent.setPackage(strD);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(Constants.OPEN_FROM_SDK, true);
                    bundle.putString("accessToken", this.d);
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                    return true;
                }
                str2 = "not install hms.";
            } else {
                hw.b("ECATManager", "url invalid.");
                uriB = b(c(str));
                if (a(uriB)) {
                    strD = k.d(context);
                    if (!TextUtils.isEmpty(strD)) {
                        str2 = "not install hms.";
                    } else {
                        try {
                            intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uriB);
                            intent.setPackage(strD);
                            if (!(context instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean(Constants.OPEN_FROM_SDK, true);
                            bundle2.putString("accessToken", this.d);
                            intent.putExtras(bundle2);
                            context.startActivity(intent);
                            return true;
                        } catch (Throwable th) {
                            str2 = "openLandingPage exception " + th.getClass().getSimpleName();
                        }
                    }
                } else {
                    str2 = "decode url invalid.";
                }
            }
        }
        hw.b("ECATManager", str2);
        return false;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(IECCallback iECCallback) {
        this.f19142c = iECCallback;
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.decode(str);
        } catch (Throwable th) {
            hw.b("ECATManager", "decodeUrl exception " + th.getClass().getSimpleName());
            return null;
        }
    }

    private Uri b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Throwable th) {
            hw.b("ECATManager", "getUri exception " + th.getClass().getSimpleName());
            return null;
        }
    }

    private boolean a(Uri uri) {
        String str;
        if (uri == null) {
            str = "uri is null.";
        } else if (URLUtil.isNetworkUrl(uri.toString())) {
            str = "uri is http or https url.";
        } else {
            try {
                return TextUtils.equals("hwpps", uri.getScheme()) && TextUtils.equals(Constants.SCHEME_HOST, uri.getHost());
            } catch (Throwable th) {
                str = "isUriValid exception " + th.getClass().getSimpleName();
            }
        }
        hw.b("ECATManager", str);
        return false;
    }

    public static a a() {
        a aVar;
        synchronized (f19140a) {
            if (f19141b == null) {
                f19141b = new a();
            }
            aVar = f19141b;
        }
        return aVar;
    }

    private a() {
    }
}
