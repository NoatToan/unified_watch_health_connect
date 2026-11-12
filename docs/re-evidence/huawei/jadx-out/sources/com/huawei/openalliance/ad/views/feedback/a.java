package com.huawei.openalliance.ad.views.feedback;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.beans.feedback.AdditionalContext;
import com.huawei.openalliance.ad.beans.feedback.ComplainAddInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Image;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Title;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Video;
import com.huawei.openalliance.ad.constant.AssetAlias;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jq;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.db;
import com.huawei.openalliance.ad.utils.dg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ComplainAddInfo f21201a = new ComplainAddInfo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<h> f21202b;

    @Override // com.huawei.openalliance.ad.views.feedback.f
    @JavascriptInterface
    public String complainAddInfo() {
        String strB = bk.b(this.f21201a);
        return dg.b(strB) ? "" : strB;
    }

    @Override // com.huawei.openalliance.ad.views.feedback.f
    public void b() {
        h hVar;
        hw.b("ComplainJS", "no submit");
        WeakReference<h> weakReference = this.f21202b;
        if (weakReference == null || (hVar = weakReference.get()) == null) {
            return;
        }
        hVar.b();
    }

    @Override // com.huawei.openalliance.ad.views.feedback.f
    @JavascriptInterface
    public void afterSubmit(String str) {
        hw.b("ComplainJS", "submit success");
        WeakReference<h> weakReference = this.f21202b;
        if (weakReference == null) {
            hw.a("ComplainJS", "submitResultListenerRef is null, return");
            return;
        }
        h hVar = weakReference.get();
        if (hVar != null) {
            hVar.a();
            jq.a().a(NotifyMessageNames.AD_COMPLAIN_MESSAGE_NAME, new Intent(NotifyMessageNames.AD_COMPLAIN_ACTION));
        }
    }

    @Override // com.huawei.openalliance.ad.views.feedback.f
    public ComplainAddInfo a() {
        return this.f21201a;
    }

    private static void b(MetaData metaData, AdditionalContext additionalContext) {
        if (dg.d(metaData.h())) {
            additionalContext.d(metaData.h());
        }
        if (dg.d(metaData.o())) {
            additionalContext.e(metaData.o());
        }
    }

    private void a(h hVar) {
        if (hVar != null) {
            this.f21202b = new WeakReference<>(hVar);
        }
    }

    private static void a(ContentRecord contentRecord, AdditionalContext additionalContext, int i) {
        String str;
        if (contentRecord == null) {
            str = "contentRecord is null";
        } else {
            additionalContext.c(contentRecord.n());
            additionalContext.b(contentRecord.o());
            MetaData metaDataJ = contentRecord.j();
            if (metaDataJ != null) {
                if (i == 2) {
                    a(metaDataJ, additionalContext);
                    return;
                } else {
                    if (i == 3) {
                        a(metaDataJ, contentRecord, additionalContext);
                        return;
                    }
                    return;
                }
            }
            str = "metaData is null";
        }
        hw.c("ComplainJS", str);
    }

    private static void a(MetaData metaData, ContentRecord contentRecord, AdditionalContext additionalContext) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<Asset> listAY = contentRecord.aY();
        if (listAY != null) {
            for (Asset asset : listAY) {
                String strB = asset.b();
                if (AssetAlias.AD_TITLE.equals(strB)) {
                    Title titleF = asset.f();
                    if (titleF != null && dg.d(titleF.a())) {
                        additionalContext.a(titleF.a());
                    }
                } else if (strB.startsWith(AssetAlias.IMAGE)) {
                    Image imageD = asset.d();
                    if (imageD != null && dg.d(imageD.a())) {
                        arrayList2.add(imageD.a());
                    }
                } else if (strB.startsWith(AssetAlias.VIDEO)) {
                    Image imageD2 = asset.d();
                    if (imageD2 != null && dg.d(imageD2.a())) {
                        arrayList2.add(imageD2.a());
                    }
                    Video videoE = asset.e();
                    if (videoE != null && dg.d(videoE.a())) {
                        arrayList.add(videoE.a());
                    }
                }
            }
        }
        if (!bm.a(arrayList2)) {
            additionalContext.a(arrayList2);
        }
        if (!bm.a(arrayList)) {
            additionalContext.b(arrayList);
        }
        b(metaData, additionalContext);
    }

    private static void a(MetaData metaData, AdditionalContext additionalContext) {
        if (dg.d(metaData.e())) {
            additionalContext.a(dg.e(metaData.e()));
        }
        if (!bm.a(metaData.N())) {
            additionalContext.a(metaData.N());
        }
        if (!bm.a(metaData.M())) {
            additionalContext.b(metaData.M());
        }
        b(metaData, additionalContext);
    }

    private void a(Context context, ContentRecord contentRecord) {
        try {
            hw.b("ComplainJS", "config add info");
            AdditionalContext additionalContext = new AdditionalContext();
            Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(context, true);
            if (pairB != null) {
                this.f21201a.a((String) pairB.first);
            } else {
                this.f21201a.a(as.a());
            }
            a(contentRecord, additionalContext, a(contentRecord));
            additionalContext.f(db.a(bk.b(additionalContext)));
            hw.a("ComplainJS", "additionalContext info: %s", additionalContext.toString());
            this.f21201a.a(additionalContext);
        } catch (Throwable th) {
            hw.b("ComplainJS", "config add info err: %s", th.getClass().getSimpleName());
        }
    }

    private int a(ContentRecord contentRecord) {
        int iAQ = contentRecord.aQ();
        if (iAQ != 3) {
            iAQ = 2;
        }
        hw.a("ComplainJS", "apiVer: %d", Integer.valueOf(iAQ));
        return iAQ;
    }

    public a(Context context, ContentRecord contentRecord, h hVar) {
        a(hVar);
        a(context, contentRecord);
    }
}
