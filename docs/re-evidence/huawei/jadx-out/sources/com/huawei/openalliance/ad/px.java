package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class px implements rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdContentRsp f20089c;
    private dw d = dw.h();

    public interface a {
        void a(int i);

        void a(Map<String, List<IRewardAd>> map);
    }

    @Override // com.huawei.openalliance.ad.rg
    public void a(AdContentRsp adContentRsp) {
        hw.b("RewardAdProcessor", "parser");
        if (adContentRsp == null) {
            this.f20088b.a(ErrorCode.ERROR_CODE_OTHER);
            hw.c("RewardAdProcessor", "response is null");
            return;
        }
        this.f20089c = adContentRsp;
        List<Ad30> listC = adContentRsp.c();
        HashMap map = new HashMap(4);
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f20087a);
        if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
            for (Ad30 ad30 : listC) {
                String strA = ad30.a();
                int iB = ad30.b();
                if (200 != iB) {
                    hw.b("RewardAdProcessor", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), strA);
                }
                List<IRewardAd> listA = a(ad30, bArrB);
                if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
                    map.put(strA, listA);
                }
            }
        }
        hw.b("RewardAdProcessor", "rewardAdMap empty: %s", Boolean.valueOf(map.isEmpty()));
        if (this.f20088b != null) {
            if (map.isEmpty()) {
                hw.b("RewardAdProcessor", "onAdFailed: %s", 204);
                this.f20088b.a(900);
            } else {
                hw.b("RewardAdProcessor", "onAdsLoaded");
                this.f20088b.a(map);
            }
        }
    }

    private boolean a(Integer num) {
        return num != null && 3 == num.intValue();
    }

    private boolean a(Content content) {
        MetaData metaDataC;
        String strM;
        ParamFromServer paramFromServer;
        if (content != null && !TextUtils.isEmpty(content.g()) && content.k() > 0 && (metaDataC = content.c()) != null && (strM = content.m()) != null && (paramFromServer = (ParamFromServer) com.huawei.openalliance.ad.utils.bk.b(strM, ParamFromServer.class, new Class[0])) != null && (!TextUtils.isEmpty(paramFromServer.a()) || !TextUtils.isEmpty(paramFromServer.b()))) {
            if (a(content.U())) {
                hw.b("RewardAdProcessor", "v3 data");
                return true;
            }
            VideoInfo videoInfoD = metaDataC.d();
            String strK = metaDataC.K();
            if (videoInfoD == null && !TextUtils.isEmpty(strK)) {
                hw.b("RewardAdProcessor", "use vastInfo");
                qc.a(metaDataC, qc.a(metaDataC, 7, content.f()), 7, false);
                content.b(com.huawei.openalliance.ad.utils.bk.b(metaDataC));
                videoInfoD = metaDataC.d();
            }
            if (videoInfoD != null && videoInfoD.b() > 0 && videoInfoD.c() < 209715200) {
                return true;
            }
        }
        return false;
    }

    private void a(final VideoInfo videoInfo, final String str, final String str2, final Integer num) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.px.1
            @Override // java.lang.Runnable
            public void run() {
                hw.a("RewardAdProcessor", "download reward video:%s", com.huawei.openalliance.ad.utils.ds.a(videoInfo.a()));
                du duVar = new du(videoInfo.a(), videoInfo.c(), videoInfo.i() == 0, videoInfo.g(), null, 1 == videoInfo.l(), 1, str, str2, 7, false, px.this.f20089c.o());
                duVar.a(num);
                px.this.d.a(duVar);
            }
        });
    }

    private void a(MetaData metaData) {
        if (metaData == null || metaData.L() == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.e.a(this.f20087a, metaData.L());
    }

    private List<IRewardAd> a(Ad30 ad30, byte[] bArr) {
        ArrayList arrayList = null;
        if (ad30 != null && !TextUtils.isEmpty(ad30.a())) {
            String strA = ad30.a();
            List<Content> listC = ad30.c();
            String strG = ad30.g();
            if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                hw.c("RewardAdProcessor", "content is null" + strA);
                return null;
            }
            arrayList = new ArrayList(4);
            for (Content content : listC) {
                if (content != null) {
                    AdContentRsp adContentRsp = this.f20089c;
                    if (adContentRsp != null) {
                        content.a(adContentRsp.h(), 7);
                    }
                    MetaData metaDataC = content.c();
                    if (metaDataC == null || !a(content)) {
                        hw.d("RewardAdProcessor", "content is invalid:%s", content.g());
                    } else {
                        com.huawei.openalliance.ad.inter.data.i iVarA = pw.a(strA, content, bArr, strG);
                        iVarA.i(this.f20089c.k());
                        iVarA.v(this.f20089c.l());
                        iVarA.c(this.f20089c.o());
                        iVarA.n(this.f20089c.q());
                        iVarA.o(this.f20089c.r());
                        iVarA.u(this.f20089c.v());
                        arrayList.add(iVarA);
                        if (!a(content.U())) {
                            a(metaDataC.d(), content.g(), strA, content.I());
                        }
                        a(metaDataC);
                    }
                }
            }
        }
        return arrayList;
    }

    public px(Context context, a aVar) {
        this.f20087a = context.getApplicationContext();
        this.f20088b = aVar;
    }
}
