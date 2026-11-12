package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class pr extends ox {
    private AdContentRsp d;
    private dn e;

    @Override // com.huawei.openalliance.ad.ox
    public void b(AdContentRsp adContentRsp) {
        this.d = adContentRsp;
        a();
    }

    private boolean c(com.huawei.openalliance.ad.inter.data.h hVar) {
        PlacementMediaFile mediaFile = hVar.getMediaFile();
        if (mediaFile == null) {
            return false;
        }
        if (2 == mediaFile.getPlayMode()) {
            return true;
        }
        return !TextUtils.isEmpty(this.e.e(mediaFile.getUrl()));
    }

    private boolean b(com.huawei.openalliance.ad.inter.data.h hVar) {
        PlacementMediaFile mediaFile = hVar.getMediaFile();
        if (mediaFile != null) {
            return !TextUtils.isEmpty(this.e.e(mediaFile.getUrl()));
        }
        return false;
    }

    private boolean a(Content content) {
        MetaData metaDataC;
        String strM;
        ParamFromServer paramFromServer;
        if (content != null && !TextUtils.isEmpty(content.g()) && content.k() > 0 && (metaDataC = content.c()) != null && (strM = content.m()) != null && (paramFromServer = (ParamFromServer) com.huawei.openalliance.ad.utils.bk.b(strM, ParamFromServer.class, new Class[0])) != null && (!TextUtils.isEmpty(paramFromServer.a()) || !TextUtils.isEmpty(paramFromServer.b()))) {
            MediaFile mediaFileV = metaDataC.v();
            String strK = metaDataC.K();
            if (mediaFileV == null && !TextUtils.isEmpty(strK)) {
                hw.b("PlacementAdProcessor", "use vastInfo");
                return true;
            }
            if (mediaFileV != null && (mediaFileV.k() || mediaFileV.j())) {
                if (mediaFileV.d() < (mediaFileV.k() ? 209715200L : fp.b(this.f19929b).f(mediaFileV.l()) * 1024)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(com.huawei.openalliance.ad.inter.data.h hVar) {
        final ContentRecord contentRecordA = pq.a(hVar);
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.pr.1
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(pr.this.f19929b).a(contentRecordA, "media's play mode is offline but was not cached before");
            }
        });
    }

    private void a() {
        String str;
        hw.b("PlacementAdProcessor", "parser");
        AdContentRsp adContentRsp = this.d;
        if (adContentRsp == null) {
            this.f19930c.a(ErrorCode.ERROR_CODE_OTHER);
            str = "response is null";
        } else {
            Map<String, List<IPlacementAd>> mapB = b(adContentRsp.f());
            List<Ad30> listC = this.d.c();
            if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
                HashMap map = new HashMap(4);
                byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f19929b);
                for (Ad30 ad30 : listC) {
                    String strA = ad30.a();
                    int iB = ad30.b();
                    if (200 != iB) {
                        hw.b("PlacementAdProcessor", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), strA);
                    }
                    List<IPlacementAd> listA = a(ad30, bArrB, mapB);
                    if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
                        List list = (List) map.get(strA);
                        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
                            map.put(strA, listA);
                        } else {
                            list.addAll(listA);
                        }
                    }
                }
                if (this.f19930c != null) {
                    this.f19930c.a(map, mapB);
                    return;
                }
                return;
            }
            this.f19930c.a(null, mapB);
            str = "multi ad is null";
        }
        hw.c("PlacementAdProcessor", str);
    }

    private List<IPlacementAd> a(Ad30 ad30, byte[] bArr, Map<String, List<IPlacementAd>> map) {
        if (ad30 == null || TextUtils.isEmpty(ad30.a())) {
            return null;
        }
        List<Content> listC = ad30.c();
        if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
            hw.c("PlacementAdProcessor", "content is null" + ad30.a());
            return null;
        }
        ArrayList<Content> arrayList = new ArrayList(listC);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList(4);
        String strA = ad30.a();
        for (Content content : arrayList) {
            if (content != null) {
                AdContentRsp adContentRsp = this.d;
                if (adContentRsp != null) {
                    content.a(adContentRsp.h(), 60);
                }
                MetaData metaDataC = content.c();
                if (metaDataC == null || metaDataC.y() <= 0 || !a(content)) {
                    hw.d("PlacementAdProcessor", "content is invalid:" + content.g());
                } else {
                    com.huawei.openalliance.ad.inter.data.h hVarA = a(strA, content, bArr);
                    hVarA.i(this.d.k());
                    hVarA.c(this.d.o());
                    hVarA.n(this.d.q());
                    hVarA.o(this.d.r());
                    hVarA.u(this.d.v());
                    if (c(hVarA)) {
                        arrayList2.add(hVarA);
                    } else {
                        a(hVarA);
                    }
                    if (!b(hVarA) && map != null) {
                        List<IPlacementAd> arrayList3 = map.get(strA);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                            map.put(strA, arrayList3);
                        }
                        PlacementMediaFile mediaFile = hVarA.getMediaFile();
                        if (mediaFile != null) {
                            mediaFile.a(1);
                            hVarA.I().add(mediaFile);
                        }
                        arrayList3.add(hVarA);
                    }
                }
            }
        }
        return arrayList2;
    }

    public pr(Context context, rj rjVar) {
        super(context, rjVar);
        this.e = dk.a(context, "normal");
    }
}
