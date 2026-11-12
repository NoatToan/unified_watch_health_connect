package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdContentRsp f20019c;
    private dw d = dw.h();
    private gf e;

    public interface a {
        void a(int i);

        void a(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map);
    }

    public void a(AdContentRsp adContentRsp) {
        hw.b("InterstitialAdProcessor", "parser");
        if (adContentRsp == null) {
            a aVar = this.f20018b;
            if (aVar != null) {
                aVar.a(ErrorCode.ERROR_CODE_OTHER);
            }
            hw.c("InterstitialAdProcessor", "response is null");
            return;
        }
        this.f20019c = adContentRsp;
        List<Ad30> listC = adContentRsp.c();
        HashMap map = new HashMap(4);
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f20017a);
        if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
            hw.b("InterstitialAdProcessor", "response ads is isEmpty");
            a aVar2 = this.f20018b;
            if (aVar2 != null) {
                aVar2.a(204);
                return;
            }
            return;
        }
        for (Ad30 ad30 : listC) {
            String strA = ad30.a();
            int iB = ad30.b();
            if (200 != iB) {
                hw.b("InterstitialAdProcessor", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), strA);
            }
            List<com.huawei.openalliance.ad.inter.data.b> listA = a(ad30, bArrB);
            if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
                map.put(strA, listA);
            }
        }
        hw.b("InterstitialAdProcessor", "interstitialAdMap empty: %s", Boolean.valueOf(com.huawei.openalliance.ad.utils.br.a(map)));
        if (this.f20018b != null) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                this.f20018b.a(204);
            } else {
                this.f20018b.a(map);
            }
        }
    }

    private boolean a(Content content) {
        String strM;
        ParamFromServer paramFromServer;
        return (content == null || TextUtils.isEmpty(content.g()) || content.k() <= 0 || content.c() == null || (strM = content.m()) == null || (paramFromServer = (ParamFromServer) com.huawei.openalliance.ad.utils.bk.b(strM, ParamFromServer.class, new Class[0])) == null || (TextUtils.isEmpty(paramFromServer.a()) && TextUtils.isEmpty(paramFromServer.b()))) ? false : true;
    }

    private void a(ContentRecord contentRecord, ImageInfo imageInfo, com.huawei.openalliance.ad.inter.data.d dVar) {
        sn snVar = new sn();
        snVar.a(contentRecord);
        snVar.d(imageInfo.c());
        snVar.a(52428800L);
        snVar.c(imageInfo.a());
        snVar.b(imageInfo.g() == 0);
        snVar.b(Constants.AD_MATERIAL_SUB_DIR);
        snVar.c(true);
        snVar.a(Long.valueOf(System.currentTimeMillis()));
        so soVarA = this.e.a(snVar);
        if (soVarA == null || com.huawei.openalliance.ad.utils.dg.b(soVarA.a())) {
            hw.c("InterstitialAdProcessor", "download image failed");
        } else {
            dVar.R(soVarA.a());
            a(imageInfo, soVarA.a());
        }
    }

    private void a(ContentRecord contentRecord) {
        if (contentRecord == null || contentRecord.j() == null || contentRecord.j().L() == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.e.a(this.f20017a, contentRecord.j().L());
    }

    private void a(final VideoInfo videoInfo, final String str, final String str2, final Integer num) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.pg.1
            @Override // java.lang.Runnable
            public void run() {
                hw.a("InterstitialAdProcessor", "download interstitialad video:%s", com.huawei.openalliance.ad.utils.ds.a(videoInfo.a()));
                du duVar = new du(videoInfo.a(), videoInfo.c(), videoInfo.i() == 0, videoInfo.g(), null, videoInfo.l() == 1, 1, str, str2, 12, false, pg.this.f20019c.o());
                duVar.a(num);
                pg.this.d.a(duVar);
            }
        });
    }

    private void a(ImageInfo imageInfo, String str) {
        if (imageInfo.d() <= 0 || imageInfo.e() <= 0) {
            Rect rectA = com.huawei.openalliance.ad.utils.bd.a(str);
            int iWidth = rectA.width();
            int iHeight = rectA.height();
            if (iWidth <= 0 || iHeight <= 0) {
                return;
            }
            imageInfo.a(iWidth);
            imageInfo.b(iHeight);
        }
    }

    private List<com.huawei.openalliance.ad.inter.data.b> a(Ad30 ad30, byte[] bArr) {
        ImageInfo imageInfo;
        ArrayList arrayList = null;
        if (ad30 != null && !TextUtils.isEmpty(ad30.a())) {
            String strA = ad30.a();
            String strG = ad30.g();
            List<Content> listC = ad30.c();
            if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                hw.c("InterstitialAdProcessor", "content is null" + strA);
                return null;
            }
            arrayList = new ArrayList(4);
            for (Content content : listC) {
                if (content != null) {
                    AdContentRsp adContentRsp = this.f20019c;
                    if (adContentRsp != null) {
                        content.a(adContentRsp.h(), 12);
                    }
                    MetaData metaDataC = content.c();
                    if (metaDataC == null || !a(content)) {
                        hw.d("InterstitialAdProcessor", "content is invalid:" + content.g());
                    } else {
                        ContentRecord contentRecordA = pn.a(strA, content, 12, strG);
                        contentRecordA.a(bArr);
                        contentRecordA.y(this.f20019c.k());
                        contentRecordA.ad(this.f20019c.l());
                        contentRecordA.o(this.f20019c.o());
                        contentRecordA.U(this.f20019c.v());
                        com.huawei.openalliance.ad.inter.data.d dVarA = pf.a(strA, content, bArr);
                        dVarA.i(this.f20019c.k());
                        dVarA.v(this.f20019c.l());
                        dVarA.c(this.f20019c.o());
                        dVarA.n(this.f20019c.q());
                        dVarA.o(this.f20019c.r());
                        dVarA.u(this.f20019c.v());
                        dVarA.y(strG);
                        BiddingInfo.a lurl = new BiddingInfo.a().a(content.ai()).a(content.aj()).b(content.ak()).setLurl(content.al());
                        if (!lurl.a().a()) {
                            dVarA.a(lurl.a());
                        }
                        if (metaDataC.d() != null) {
                            a(metaDataC.d(), content.g(), strA, content.I());
                        }
                        List<ImageInfo> listP = metaDataC.p();
                        if (listP != null && listP.size() > 0 && (imageInfo = listP.get(0)) != null) {
                            a(contentRecordA, imageInfo, dVarA);
                        }
                        a(contentRecordA);
                        arrayList.add(dVarA);
                    }
                }
            }
        }
        return arrayList;
    }

    public pg(Context context, a aVar) {
        this.f20017a = context;
        this.f20018b = aVar;
        this.e = fi.a(context);
    }
}
