package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class bt {
    /* JADX INFO: Access modifiers changed from: private */
    public static sn b(MotionData motionData) {
        if (motionData == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(motionData.g());
        snVar.c(motionData.h());
        snVar.b(true);
        snVar.c(true);
        snVar.e(Constants.TPLATE_CACHE);
        return snVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static sn b(Asset asset) {
        if (asset == null || asset.e() == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(asset.e().a());
        snVar.c(asset.e().f());
        snVar.b(asset.e().h() == 0);
        snVar.c(true);
        snVar.b(Constants.TEMPLATE_VIDEO_SUB_DIR);
        snVar.a(true);
        return snVar;
    }

    public static boolean a(final Context context, final ContentRecord contentRecord) {
        String str;
        hw.a("TDownloadUtil", "checkAndDownloadContent");
        if (contentRecord == null) {
            str = "content is null";
        } else {
            if (!com.huawei.openalliance.ad.utils.bm.a(contentRecord.aY())) {
                dn dnVarA = dk.a(context, Constants.TPLATE_CACHE);
                final gf gfVarA = fi.a(context);
                boolean z = true;
                for (final Asset asset : contentRecord.aY()) {
                    if (asset != null && asset.e() != null && !com.huawei.openalliance.ad.utils.ai.b(dnVarA.c(dnVarA.e(asset.e().a())))) {
                        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.bt.1
                            @Override // java.lang.Runnable
                            public void run() {
                                sn snVarB = bt.b(asset);
                                if (snVarB != null) {
                                    snVarB.c(true);
                                    snVarB.e(Constants.TPLATE_CACHE);
                                    so soVarA = gfVarA.a(snVarB);
                                    if (soVarA == null || TextUtils.isEmpty(soVarA.a())) {
                                        hw.b("TDownloadUtil", "down asset failed");
                                    }
                                }
                            }
                        });
                        z = false;
                    }
                }
                if (contentRecord.aV() != null && !com.huawei.openalliance.ad.utils.bm.a(contentRecord.aV().c())) {
                    for (final MotionData motionData : contentRecord.aV().c()) {
                        if (motionData != null && !com.huawei.openalliance.ad.utils.ai.b(dnVarA.c(dnVarA.e(motionData.g())))) {
                            com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.bt.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    so soVarA = gfVarA.a(bt.b(motionData));
                                    if (soVarA == null || TextUtils.isEmpty(soVarA.a())) {
                                        hw.b("TDownloadUtil", "down motion failed %s", soVarA);
                                        bt.a(context, contentRecord, motionData);
                                    }
                                }
                            });
                            z = false;
                        }
                    }
                }
                hw.b("TDownloadUtil", "result: %s", Boolean.valueOf(z));
                return z;
            }
            str = "assets is null";
        }
        hw.b("TDownloadUtil", str);
        return false;
    }

    public static void a(Context context, ContentRecord contentRecord, MotionData motionData) {
        try {
            new com.huawei.openalliance.ad.analysis.c(context).a(contentRecord, motionData, 16);
        } catch (Exception e) {
            hw.d("TDownloadUtil", "reportEggCannotDisplay err: %s", e.getClass().getSimpleName());
        }
    }
}
