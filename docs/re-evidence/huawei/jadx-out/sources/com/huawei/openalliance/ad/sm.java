package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentResource;

/* JADX INFO: loaded from: classes12.dex */
public class sm {
    public static void a(final Context context, String str, dn dnVar, final sn snVar, final String str2) {
        if (dnVar == null || snVar == null) {
            return;
        }
        dnVar.h(str);
        ContentRecord contentRecordL = snVar.l();
        if (contentRecordL == null) {
            hw.b("SourceFetcherUtil", "updateOnCacheUri, contentRecord is null");
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.sm.1
            @Override // java.lang.Runnable
            public void run() {
                ey.a(context).a(sm.a(snVar), str2);
            }
        }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
        Integer numJ = com.huawei.openalliance.ad.utils.dg.j(contentRecordL.ap());
        if (numJ == null) {
            numJ = Integer.valueOf(dm.a(contentRecordL.f()));
        }
        dnVar.a(str, numJ.intValue());
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String strA = com.huawei.openalliance.ad.utils.db.a(str);
        return TextUtils.isEmpty(strA) ? String.valueOf(str.hashCode()) : strA;
    }

    public static ContentResource a(sn snVar) {
        String strA;
        Integer numJ;
        if (hw.a()) {
            hw.a("SourceFetcherUtil", "generateContentResource: %s", snVar.i());
        }
        try {
            ContentRecord contentRecordL = snVar.l();
            if (contentRecordL == null || TextUtils.isEmpty(contentRecordL.o())) {
                return null;
            }
            ContentResource contentResource = new ContentResource(contentRecordL);
            if (snVar.s()) {
                strA = a(snVar.i()) + com.huawei.openalliance.ad.utils.ai.e(snVar.i());
            } else {
                strA = a(snVar.i());
            }
            contentResource.a(strA);
            Integer numJ2 = com.huawei.openalliance.ad.utils.dg.j(contentRecordL.ap());
            if (numJ2 == null) {
                numJ2 = Integer.valueOf(dm.a(contentRecordL.f()));
            }
            contentResource.b(numJ2.intValue());
            contentResource.c(contentRecordL.k());
            String strV = contentRecordL.V();
            if (snVar.u() == null) {
                if (!com.huawei.openalliance.ad.utils.dg.b(strV) && (numJ = com.huawei.openalliance.ad.utils.dg.j(strV)) != null) {
                }
                contentResource.d(snVar.q());
                contentResource.f(0);
                contentResource.e(snVar.r());
                contentResource.a(System.currentTimeMillis());
                return contentResource;
            }
            numJ = snVar.u();
            contentResource.d(numJ.intValue());
            contentResource.d(snVar.q());
            contentResource.f(0);
            contentResource.e(snVar.r());
            contentResource.a(System.currentTimeMillis());
            return contentResource;
        } catch (Throwable th) {
            hw.c("SourceFetcherUtil", "generateContentResource " + th.getClass().getSimpleName());
            return null;
        }
    }
}
