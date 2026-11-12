package com.huawei.watchface;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.HwLog;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f30083b = "b2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f30084c = new Object();
    public static b2 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30085a = "0";

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f30086a = {1};
    }

    public static b2 a() {
        b2 b2Var;
        synchronized (f30084c) {
            if (d == null) {
                d = new b2();
            }
            b2Var = d;
        }
        return b2Var;
    }

    public byte[] a(byte[] bArr) {
        try {
            l5.c cVar = new l5.c(FlavorConfig.SERVICE_WATCH_FACE);
            l5.a(bArr, cVar);
            return (byte[]) cVar.c().get(FlavorConfig.SERVICE_WATCH_FACE);
        } catch (Exception e) {
            FlavorConfig.safeHwLog(f30083b, e.getMessage());
            return null;
        }
    }

    public boolean a(String str) {
        return s0.a().a(str, "is_sync") != null;
    }

    public final void a(Map map) {
        HwLog.e(f30083b, "unzipSyncModel, 39.3 need sync flag, .sync: true");
        map.put("is_sync", a.f30086a);
    }

    public Map a(byte[] bArr, String str, String str2) {
        HashMap map = new HashMap();
        try {
            if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSportGTModel()) {
                HwLog.i(f30083b, "unzipSyncModel, AP mode");
                l5.c cVar = new l5.c("watchface.bin");
                l5.a(bArr, cVar);
                if (cVar.c().size() > 0) {
                    a(map);
                }
                map.put(FlavorConfig.SERVICE_WATCH_FACE, bArr);
                return map;
            }
            String str3 = f30083b;
            HwLog.e(str3, "unzipSyncModel, GT mode");
            l5.c cVar2 = new l5.c("watchface.bin");
            l5.a aVar = new l5.a("watchface.bin");
            boolean zA = l5.a(bArr, cVar2, aVar);
            if (zA && cVar2.c().size() > 0) {
                byte[] bArr2 = (byte[]) cVar2.c().get("watchface.bin");
                this.f30085a = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_DELETE_BIN_FILE_SWITCH, "0");
                HwLog.i(str3, "unzipSyncModel deleteBinFileSwitch:" + this.f30085a);
                if (!TextUtils.equals(this.f30085a, "0")) {
                    bArr = aVar.c();
                }
                boolean vipFreeFromCache = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVipFreeFromCache(str);
                HwLog.i(str3, "unzipSyncModel, vip free: " + vipFreeFromCache);
                if (vipFreeFromCache) {
                    str = WatchResourcesInfo.markUpHiTopId(str);
                }
                byte[] bArrA = u0.a(str, str2, new r0("watchface.bin", bArr2), new r0(FlavorConfig.SERVICE_WATCH_FACE, bArr));
                StringBuilder sb = new StringBuilder("unzipSyncModel, merge file: ");
                sb.append(bArrA != null ? bArrA.length : 0);
                HwLog.e(str3, sb.toString());
                map.put(FlavorConfig.SERVICE_WATCH_FACE, bArrA);
                a(map);
                return map;
            }
            HwLog.e(str3, "unzipSyncModel, isZip: " + zA + ", size: " + cVar2.c().size());
            map.put(FlavorConfig.SERVICE_WATCH_FACE, bArr);
            return map;
        } catch (IOException unused) {
            HwLog.e(f30083b, "unzip catch IOException");
            return map;
        } catch (Exception unused2) {
            HwLog.e(f30083b, "unzip catch Exception");
            return map;
        }
    }

    public Map a(Context context, byte[] bArr, boolean z, boolean z2) {
        boolean zIsSupportDialUnite = HwWatchFaceBtManager.getInstance(context).isSupportDialUnite();
        String str = f30083b;
        HwLog.e(str, String.format("unzipWatchFace, isSupportDialUnite: %s, isZip: %s", Boolean.valueOf(zIsSupportDialUnite), Boolean.valueOf(z)));
        HashMap map = new HashMap();
        try {
            l5.c cVar = new l5.c("watchface.bin");
            l5.a(bArr, cVar);
            if (!zIsSupportDialUnite && !z) {
                HwLog.i(str, "unzipWatchFace, isSupportDialUnite && !isZip");
                if (a(context, z2, cVar)) {
                    HwLog.i(str, "unzipWatchFace contains watchface.bin is need sync flag");
                    a(map);
                }
                map.put(FlavorConfig.SERVICE_WATCH_FACE, bArr);
                return map;
            }
            if (cVar.c().size() >= 1) {
                bArr = (byte[]) cVar.c().get("watchface.bin");
            }
            map.put(FlavorConfig.SERVICE_WATCH_FACE, bArr);
            return map;
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static boolean a(Context context, boolean z, l5.c cVar) {
        if (context == null || cVar == null) {
            return false;
        }
        HwWatchFaceBtManager hwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(context);
        return (cVar.c().isEmpty() || z || !hwWatchFaceBtManager.isSupportSync() || hwWatchFaceBtManager.isSportGTModel()) ? false : true;
    }
}
