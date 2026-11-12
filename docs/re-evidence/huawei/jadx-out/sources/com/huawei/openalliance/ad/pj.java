package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.magazine.inter.MagLockAd;
import com.huawei.openalliance.ad.magazine.inter.MagLockAdContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public abstract class pj {
    private static void a(ContentRecord contentRecord, Content content) {
        contentRecord.e(content.j());
        contentRecord.b(content.d());
        contentRecord.l(content.m());
        contentRecord.i(content.l());
    }

    private static List<MagLockAdContent> a(List<Content> list, boolean z, Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<Content> it = list.iterator();
        while (it.hasNext()) {
            MagLockAdContent magLockAdContentA = a(it.next(), z, context);
            if (magLockAdContentA != null) {
                arrayList.add(magLockAdContentA);
            }
        }
        return arrayList;
    }

    private static MagLockAdContent a(Content content, boolean z, Context context) {
        if (content == null) {
            return null;
        }
        hw.c("MagLockConverter", "content in response :" + content.g());
        ContentRecord contentRecordA = ew.a(context).a(content.g());
        if (contentRecordA != null && !TextUtils.isEmpty(contentRecordA.A())) {
            hw.a("MagLockConverter", "content is in db: %s,and path: %s.", content.g(), contentRecordA.A());
            if (!z) {
                a(contentRecordA, content);
            }
            return a(context, contentRecordA);
        }
        if (contentRecordA == null) {
            hw.c("MagLockConverter", "content is null!" + content.g());
        }
        return null;
    }

    private static MagLockAd a(Ad30 ad30, boolean z, Context context) {
        if (ad30 == null) {
            return null;
        }
        Cif cif = new Cif();
        cif.setRetCode(ad30.b());
        cif.setSlotId(ad30.a());
        List<Content> listC = ad30.c();
        if (200 == ad30.b() && !com.huawei.openalliance.ad.utils.bm.a(listC)) {
            cif.setAdList(a(listC, z, context));
        }
        return cif;
    }

    public static ig a(AdContentRsp adContentRsp, Context context, boolean z) {
        if (adContentRsp == null || com.huawei.openalliance.ad.utils.bm.a(adContentRsp.c())) {
            return null;
        }
        ig igVar = new ig();
        igVar.setRetCode(adContentRsp.a());
        ArrayList arrayList = new ArrayList();
        Iterator<Ad30> it = adContentRsp.c().iterator();
        while (it.hasNext()) {
            MagLockAd magLockAdA = a(it.next(), z, context);
            if (magLockAdA != null) {
                arrayList.add(magLockAdA);
            }
        }
        igVar.setMultiAds(arrayList);
        return igVar;
    }

    private static ie a(Context context, ContentRecord contentRecord) {
        ie ieVar = new ie();
        ieVar.setContentId(contentRecord.o());
        ieVar.b(contentRecord.D());
        String strH = contentRecord.h();
        MetaData metaData = (MetaData) com.huawei.openalliance.ad.utils.bk.b(strH, MetaData.class, new Class[0]);
        if (metaData != null) {
            List<ImageInfo> listP = metaData.p();
            if (listP != null && !listP.isEmpty()) {
                ImageInfo imageInfo = listP.get(0);
                ieVar.setUrl(imageInfo.c());
                ieVar.setSha256(imageInfo.a());
                ieVar.setFileSize(imageInfo.f());
                ieVar.a(contentRecord.A());
                ieVar.setTitle(metaData.e());
                ieVar.setDescription(metaData.f());
            }
            ImageInfo imageInfoQ = metaData.q();
            if (imageInfoQ != null) {
                ieVar.setPreviewUrl(imageInfoQ.c());
                ieVar.setPreviewSha256(imageInfoQ.a());
            }
            ieVar.d(metaData.o());
            ieVar.c(metaData.h());
            ieVar.b(metaData.l());
            ieVar.g(metaData.u());
            if ("2".equals(metaData.u())) {
                ieVar.h(context.getResources().getString(R.string.hiad_ad_label_new));
            }
            if (metaData.s() != null) {
                ieVar.f(metaData.s().j());
                ieVar.e(metaData.s().a());
            }
            if (metaData.t() != null && metaData.t().getName() != null) {
                ieVar.f(metaData.t().getName());
                ieVar.a(metaData.t().getType());
            }
            ieVar.setMetaData(strH);
        }
        ieVar.setEndTime(contentRecord.s());
        return ieVar;
    }
}
