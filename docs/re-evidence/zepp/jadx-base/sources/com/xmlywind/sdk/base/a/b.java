package com.xmlywind.sdk.base.a;

import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.d;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.e.f;
import com.xmlywind.sdk.common.e.m;
import com.xmlywind.sdk.common.models.SigmobError;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class b {

    public interface a {
        void a(int i, String str, String str2, LoadAdRequest loadAdRequest);

        void a(List<BaseAdUnit> list, LoadAdRequest loadAdRequest);
    }

    public static void a(String str, LoadAdRequest loadAdRequest, a aVar) {
        if (f.a() == null) {
            if (aVar != null) {
                aVar.a(SigmobError.ERROR_SIGMOB_NETWORK.getErrorCode(), "request queue is null", null, loadAdRequest);
                return;
            }
            return;
        }
        try {
            if (m.b(new URL(str).getHost())) {
                f.a().a(new com.xmlywind.sdk.base.a.a(str, d.f().l(), loadAdRequest, aVar));
            } else if (aVar != null) {
                aVar.a(SigmobError.ERROR_SIGMOB_NETWORK.getErrorCode(), "network is disconnection", null, loadAdRequest);
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            if (aVar != null) {
                aVar.a(SigmobError.ERROR_SIGMOB_NETWORK.getErrorCode(), th.getMessage(), null, loadAdRequest);
            }
        }
    }
}
