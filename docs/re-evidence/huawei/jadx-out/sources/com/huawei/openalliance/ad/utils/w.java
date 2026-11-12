package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ey;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class w {
    public static void a(Map<String, List<IPlacementAd>> map, int i, boolean z, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<IPlacementAd>> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(entry.getValue());
            String key = entry.getKey();
            if (!bm.a(arrayList)) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    IPlacementAd iPlacementAd = (IPlacementAd) arrayList.get(i3);
                    if (iPlacementAd != null) {
                        String contentId = iPlacementAd.getContentId();
                        if (z && (iPlacementAd instanceof com.huawei.openalliance.ad.inter.data.h)) {
                            com.huawei.openalliance.ad.inter.data.h hVar = (com.huawei.openalliance.ad.inter.data.h) iPlacementAd;
                            List<PlacementMediaFile> listI = hVar.I();
                            if (!bm.a(listI)) {
                                int i4 = 0;
                                for (int size2 = listI.size(); i4 < size2; size2 = size2) {
                                    a(listI.get(i4), i, z, contentId, key, hVar.h(), i2);
                                    i4++;
                                }
                            }
                        } else {
                            a(iPlacementAd.getMediaFile(), i, z, contentId, key, iPlacementAd instanceof com.huawei.openalliance.ad.inter.data.h ? ((com.huawei.openalliance.ad.inter.data.h) iPlacementAd).h() : null, i2);
                        }
                    }
                }
            }
        }
    }

    private static void a(final PlacementMediaFile placementMediaFile, final int i, final boolean z, final String str, final String str2, final Integer num, final int i2) {
        if (placementMediaFile == null || TextUtils.isEmpty(placementMediaFile.getUrl()) || placementMediaFile.getFileSize() <= 0) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.w.2
            @Override // java.lang.Runnable
            public void run() {
                if (hw.a()) {
                    hw.a("ContentUtils", "download media:%s", ds.a(placementMediaFile.getUrl()));
                }
                com.huawei.openalliance.ad.du duVar = new com.huawei.openalliance.ad.du(placementMediaFile.getUrl(), (int) placementMediaFile.getFileSize(), placementMediaFile.getCheckSha256() == 0, placementMediaFile.getSha256(), Integer.valueOf(i), !z || 1 == placementMediaFile.getDownloadNetwork(), placementMediaFile.c(), str, str2, 60, z, i2);
                duVar.a(num);
                com.huawei.openalliance.ad.dw.h().a(duVar);
            }
        });
    }

    public static void a(final Context context, final String str, String str2, final String str3) {
        final Integer numJ;
        if (dg.b(str) || dg.b(str2) || (numJ = dg.j(str2)) == null) {
            return;
        }
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.w.1
            @Override // java.lang.Runnable
            public void run() {
                ey.a(context).a(str, numJ.intValue(), str3);
            }
        });
    }
}
