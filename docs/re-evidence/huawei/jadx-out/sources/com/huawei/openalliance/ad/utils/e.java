package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.fi;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e {
    public static void a(final Context context, final List<AdSource> list) {
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.utils.e.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!bm.a(list) && context != null) {
                        for (AdSource adSource : list) {
                            if (adSource != null) {
                                sn snVar = new sn();
                                snVar.c(true);
                                snVar.b(false);
                                snVar.d(adSource.b());
                                so soVarA = fi.a(context.getApplicationContext()).a(snVar);
                                hw.b("AdSourceUtil", "downloadDspLogo result= %s", soVarA != null ? ds.a(soVarA.b()) : null);
                            }
                        }
                    }
                } catch (Throwable unused) {
                    hw.d("AdSourceUtil", "downloadDspLogo error");
                }
            }
        });
    }
}
