package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.magazine.inter.listener.IAdInvalidHandler;
import com.huawei.openalliance.ad.magazine.inter.listener.IPPSDownloadService;
import com.huawei.openalliance.ad.magazine.inter.listener.PPSDownloadResult;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class pi implements rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20023a = "oz";
    private static int j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ContentRecord> f20024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f20025c;
    private int d = 2;
    private fz e;
    private Context f;
    private IAdInvalidHandler g;
    private IPPSDownloadService h;
    private com.huawei.openalliance.ad.analysis.c i;

    @Override // com.huawei.openalliance.ad.rd
    public void a(List<String> list) {
        this.f20025c = list;
    }

    public void a(final String str) {
        this.e.c(str);
        if (this.g != null) {
            com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.pi.1
                @Override // java.lang.Runnable
                public void run() {
                    hw.b(pi.f20023a, "onInvalid: %s", str);
                    pi.this.g.onInvalid(str);
                }
            });
        } else {
            hw.c(f20023a, "invalid handler is null");
        }
    }

    @Override // com.huawei.openalliance.ad.rd
    public void a(int i) {
        this.d = i;
    }

    @Override // com.huawei.openalliance.ad.rd
    public void a() {
        if (com.huawei.openalliance.ad.utils.bm.a(this.f20025c)) {
            hw.b(f20023a, "invalidContentIds is empty");
            return;
        }
        Iterator<String> it = this.f20025c.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.huawei.openalliance.ad.rd
    public String a(boolean z) {
        hw.b(f20023a, "download contents start");
        String strA = null;
        if (com.huawei.openalliance.ad.utils.bm.a(this.f20024b)) {
            return null;
        }
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f);
        for (ContentRecord contentRecord : this.f20024b) {
            if (c()) {
                contentRecord.a(bArrB);
                hw.b(f20023a, "start to downloadContent , contentId : %s", contentRecord.o());
                strA = a(contentRecord, z || contentRecord.bj());
            } else {
                hw.b(f20023a, "downloadContents - content creativeType %d not supported", Integer.valueOf(contentRecord.F()));
            }
        }
        hw.b(f20023a, "download contents ends");
        return strA;
    }

    private boolean c() {
        return 2 == this.d;
    }

    private boolean b(String str) {
        ContentRecord contentRecordA = this.e.a(str);
        return (contentRecordA == null || TextUtils.isEmpty(contentRecordA.A()) || com.huawei.openalliance.ad.utils.dg.l(contentRecordA.A())) ? false : true;
    }

    private String a(ContentRecord contentRecord, boolean z) {
        String strO = contentRecord.o();
        if (!b(strO)) {
            return a(contentRecord, strO, z);
        }
        hw.b(f20023a, "contentId %s exist,no download.update DB!", contentRecord.o());
        ArrayList arrayList = new ArrayList();
        arrayList.add("_id");
        arrayList.add(ContentRecord.DISPLAY_COUNT);
        arrayList.add(ContentRecord.DISPLAY_DATE);
        if (TextUtils.isEmpty(contentRecord.A()) || com.huawei.openalliance.ad.utils.dg.l(contentRecord.A())) {
            arrayList.add(ContentRecord.SPLASH_MEDIA_PATH);
        }
        arrayList.add(ContentRecord.LAST_SHOW_TIME);
        arrayList.add(ContentRecord.FC_CTRL_DATE);
        this.e.b(contentRecord, arrayList, strO);
        return strO;
    }

    private String a(ContentRecord contentRecord, String str, boolean z) {
        if (this.h == null) {
            hw.c(f20023a, "there is no download service");
            return null;
        }
        ImageInfo imageInfoS = contentRecord.S();
        if (imageInfoS == null) {
            hw.c(f20023a, "image info is null");
            return null;
        }
        PPSDownloadResult pPSDownloadResultDownload = this.h.download(str, imageInfoS.c(), imageInfoS.a(), imageInfoS.f(), z);
        if (pPSDownloadResultDownload == null || !pPSDownloadResultDownload.isResult() || com.huawei.openalliance.ad.utils.dg.b(pPSDownloadResultDownload.getPath())) {
            hw.c(f20023a, RecommendConstants.DOWNLOAD_FAIL);
            this.i.a(contentRecord.n(), str, false);
            return null;
        }
        contentRecord.i(pPSDownloadResultDownload.getPath());
        String str2 = f20023a;
        hw.b(str2, "insert to db start:" + contentRecord.o());
        this.e.b(contentRecord);
        hw.b(str2, "insert to db end:" + contentRecord.o());
        this.i.a(contentRecord.n(), str, true);
        return str;
    }

    public pi(Context context, List<ContentRecord> list) {
        this.f = context.getApplicationContext();
        this.f20024b = list;
        this.e = ew.a(context);
        this.g = HiAd.getInstance(context).getAdInvalidHandler();
        this.h = HiAd.getInstance(context).getPPSDownloadService();
        this.i = new com.huawei.openalliance.ad.analysis.c(context);
    }
}
