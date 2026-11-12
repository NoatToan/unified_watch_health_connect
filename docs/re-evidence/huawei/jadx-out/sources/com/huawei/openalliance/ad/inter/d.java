package com.huawei.openalliance.ad.inter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IGlobalUtil;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.bw;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.GlobalUtilKeys;
import com.huawei.openalliance.ad.constant.GlobalUtilMethods;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dj;
import com.huawei.openalliance.ad.utils.dk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes12.dex */
public class d extends IGlobalUtil.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19153a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f19154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<IPPSUiEngineCallback> f19155c = new ArrayList();
    private Context d;

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public void unregisterActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
        hw.b("GlobalUtil", "unregisterActivityStartCallBack");
        if (iPPSUiEngineCallback != null) {
            this.f19155c.remove(iPPSUiEngineCallback);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public void registerActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
        hw.b("GlobalUtil", "registerActivityStartCallBack");
        if (iPPSUiEngineCallback != null) {
            this.f19155c.add(iPPSUiEngineCallback);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public boolean isFreedomWindowMode(IObjectWrapper iObjectWrapper) {
        try {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            if (view == null) {
                hw.c("GlobalUtil", "remote view is null.");
                return false;
            }
            Activity activityD = dk.d((View) view.getParent());
            if (activityD != null) {
                return dk.b(activityD);
            }
            hw.c("GlobalUtil", "activity is null.");
            return false;
        } catch (Throwable th) {
            hw.c("GlobalUtil", "is freedom window ex: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public com.huawei.hms.ads.uiengine.b getMultiMediaPlayingManager() {
        bw.a(this.d).a(HiAd.a(this.d).c());
        return bw.a(this.d);
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public String getFilePathDirectByCacheType(String str, int i) {
        return a(str, 3 != i ? "normal" : Constants.TPLATE_CACHE);
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public String getFilePathDirect(String str) {
        return a(str, Constants.TPLATE_CACHE);
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public void getFilePath(String str, IPPSUiEngineCallback iPPSUiEngineCallback) {
        try {
            String strC = com.huawei.openalliance.ad.dk.a(this.d, Constants.TPLATE_CACHE).c(dn.d(str));
            if (ai.c(this.d, strC, Constants.TPLATE_CACHE)) {
                hw.b("GlobalUtil", "getFilePath from cache");
                a(iPPSUiEngineCallback, strC);
                return;
            }
            try {
                Pair<String, String> pairA = com.huawei.openalliance.ad.utils.c.a(this.d, str, Constants.TPLATE_CACHE);
                if (pairA != null && !TextUtils.isEmpty((CharSequence) pairA.first) && !TextUtils.isEmpty((CharSequence) pairA.second)) {
                    hw.b("GlobalUtil", "getFilePath from kit");
                    a(iPPSUiEngineCallback, (String) pairA.first);
                    return;
                }
            } catch (Throwable th) {
                hw.b("GlobalUtil", "get path err: %s", th.getClass().getSimpleName());
            }
        } catch (Throwable th2) {
            hw.b("GlobalUtil", "getFilePath err: %s", th2.getClass().getSimpleName());
        }
        iPPSUiEngineCallback.onCallResult(ParamConstants.Cmd.GET_FILE_PATH, null);
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public Bundle callMethod(String str, IObjectWrapper iObjectWrapper, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hw.b("GlobalUtil", "call method: %s", str);
        str.hashCode();
        if (str.equals(GlobalUtilMethods.QUERY_LOCAL_PATH)) {
            return a(bundle);
        }
        hw.b("GlobalUtil", "call method fall to default.");
        return null;
    }

    public void b() {
        for (IPPSUiEngineCallback iPPSUiEngineCallback : this.f19155c) {
            if (iPPSUiEngineCallback != null) {
                try {
                    iPPSUiEngineCallback.onCallResult("onActivityStartFinish", null);
                } catch (Throwable th) {
                    hw.b("GlobalUtil", "onCallResult err: %s", th.getClass().getSimpleName());
                }
            }
        }
    }

    private Future<String> b(final String str, final String str2) {
        return dj.a(new Callable<String>() { // from class: com.huawei.openalliance.ad.inter.d.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call() {
                return d.this.a(str, str2);
            }
        });
    }

    private static d b(Context context) {
        d dVar;
        synchronized (f19153a) {
            if (f19154b == null) {
                f19154b = new d(context);
            }
            dVar = f19154b;
        }
        return dVar;
    }

    private void a(IPPSUiEngineCallback iPPSUiEngineCallback, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("filePath", str);
        iPPSUiEngineCallback.onCallResult(ParamConstants.Cmd.GET_FILE_PATH, bundle);
    }

    private static String a(Future<String> future) {
        try {
            return future.get();
        } catch (Throwable th) {
            hw.c("GlobalUtil", "get localPath ex: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2) {
        try {
            String strC = com.huawei.openalliance.ad.dk.a(this.d, str2).c(dn.d(str));
            if (ai.c(this.d, strC, str2)) {
                return strC;
            }
            return null;
        } catch (Throwable th) {
            hw.b("GlobalUtil", "getFilePath err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static d a(Context context) {
        return b(context);
    }

    private Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String strD = new gr(bundle).d(GlobalUtilKeys.ORI_URL);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        hw.b("GlobalUtil", "get local path, oriUrl: %s", dg.i(strD));
        Future<String> futureB = b(strD, Constants.TPLATE_CACHE);
        Future<String> futureB2 = b(strD, "normal");
        Bundle bundle2 = new Bundle();
        String strA = a(futureB);
        if (!TextUtils.isEmpty(strA)) {
            hw.b("GlobalUtil", "got tplateLocalPath: %s", dg.i(strA));
            bundle2.putString(GlobalUtilKeys.LOCAL_PATH, strA);
            return bundle2;
        }
        String strA2 = a(futureB2);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        hw.b("GlobalUtil", "got normalLocalPath: %s", dg.i(strA2));
        bundle2.putString(GlobalUtilKeys.LOCAL_PATH, strA2);
        return bundle2;
    }

    private d(Context context) {
        this.d = context;
    }
}
