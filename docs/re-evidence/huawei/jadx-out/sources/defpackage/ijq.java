package defpackage;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class ijq {
    public static void c(qhv qhvVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (qhvVar == null || TextUtils.isEmpty(qhvVar.h())) {
            LogUtil.j("TtdServiceManager", "productQueryByType productTyp is empty");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        ijr ijrVar = new ijr();
        HashMap map = new HashMap();
        map.put("productType", qhvVar.h());
        if (!TextUtils.isEmpty(qhvVar.d())) {
            map.put("productCode", qhvVar.d());
        }
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(qhvVar.e())) {
            map2.put("x-devicemodel", qhvVar.e());
        }
        if (!TextUtils.isEmpty(qhvVar.a())) {
            map2.put("deviceid", qhvVar.a());
        }
        if (!TextUtils.isEmpty(qhvVar.c())) {
            map2.put("devicetype", qhvVar.c());
        }
        if (!TextUtils.isEmpty(qhvVar.b())) {
            map2.put("x-brandchannel", qhvVar.b());
        }
        LogUtil.a("TtdServiceManager", "productQueryByType header:", map2.values().toString());
        ijrVar.d(map2);
        ijo.a().a(ijrVar, map, new IBaseResponseCallback() { // from class: ijt
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ijq.a(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("TtdServiceManager", "productQueryByType resultCode:", Integer.valueOf(i));
        if (i == 0 && (obj instanceof ijz)) {
            iBaseResponseCallback.a(0, ((ijz) obj).c());
        } else {
            iBaseResponseCallback.a(i, null);
        }
    }
}
