package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Template;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.AdParseConfig;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.inter.listeners.ContentIdListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class pm implements re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20034a = "pm";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdContentRsp f20035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f20036c;
    private gf d;
    private gk e;
    private String f;
    private Context g;
    private boolean h;
    private int i;
    private ContentIdListener j;
    private boolean k;
    private boolean l;
    private boolean m;
    private rl n;

    public interface a {
        void a(int i);

        void a(Map<String, List<INativeAd>> map);
    }

    @Override // com.huawei.openalliance.ad.re
    public void c(boolean z) {
        this.m = z;
    }

    @Override // com.huawei.openalliance.ad.re
    public void c() {
        rl rlVar = this.n;
        if (rlVar != null) {
            rlVar.a();
        }
    }

    @Override // com.huawei.openalliance.ad.re
    public boolean b() {
        return this.m;
    }

    @Override // com.huawei.openalliance.ad.re
    public void b(boolean z) {
        this.h = z;
    }

    @Override // com.huawei.openalliance.ad.re
    public boolean a() {
        return this.h;
    }

    @Override // com.huawei.openalliance.ad.re
    public void a(boolean z) {
        this.l = z;
    }

    @Override // com.huawei.openalliance.ad.re
    public void a(ContentIdListener contentIdListener) {
        this.j = contentIdListener;
    }

    @Override // com.huawei.openalliance.ad.re
    public void a(AdContentRsp adContentRsp, long j, AdParseConfig adParseConfig) {
        try {
            this.f20035b = adContentRsp;
            a(j, adParseConfig);
        } catch (Throwable th) {
            hw.c(f20034a, "parse ad err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.re
    public void a(int i) {
        this.i = i;
    }

    private boolean b(List<Ad30> list) {
        Iterator<Ad30> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            List<Content> listC = it.next().c();
            if (!com.huawei.openalliance.ad.utils.bm.a(listC) && (size = size + listC.size()) > 1) {
                return true;
            }
        }
        return false;
    }

    private boolean b(com.huawei.openalliance.ad.inter.data.e eVar) {
        return eVar.getVideoInfo() != null;
    }

    private boolean b(int i) {
        if (99 != i) {
            return false;
        }
        String strA = e.a();
        return !TextUtils.isEmpty(strA) && 30461200 <= Integer.parseInt(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final com.huawei.openalliance.ad.inter.data.e eVar, VideoInfo videoInfo, ImageInfo imageInfo) {
        if (videoInfo == null || imageInfo == null || eVar == null) {
            return false;
        }
        if (1 != videoInfo.getVideoPlayMode() || a(videoInfo)) {
            return true;
        }
        hw.c(f20034a, "cache mode video is only allowed to download in network %d", Integer.valueOf(videoInfo.getDownloadNetwork()));
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.pm.4
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(pm.this.g).b(pl.a(eVar));
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.huawei.openalliance.ad.inter.data.e eVar, long j, VideoInfo videoInfo, ImageInfo imageInfo) {
        if (this.e.aU() + 86400000 < com.huawei.openalliance.ad.utils.as.c()) {
            this.e.b(com.huawei.openalliance.ad.utils.as.c());
            com.huawei.openalliance.ad.utils.ai.a(this.f, 604800000L);
        }
        ContentRecord contentRecordA = pl.a(eVar);
        sn snVar = new sn();
        snVar.a(contentRecordA);
        snVar.d(imageInfo.getUrl());
        snVar.a(imageInfo.a());
        snVar.c(imageInfo.getSha256());
        snVar.b(imageInfo.isCheckSha256());
        snVar.b("video");
        snVar.a(Long.valueOf(j));
        snVar.c(true);
        so soVarA = this.d.a(snVar);
        if (soVarA == null || com.huawei.openalliance.ad.utils.dg.b(soVarA.a())) {
            hw.c(f20034a, "dealVideo, download cover failed!");
            return false;
        }
        imageInfo.c(soVarA.a());
        a(imageInfo, soVarA.a());
        if (1 == videoInfo.getVideoPlayMode() || this.m) {
            String str = f20034a;
            hw.b(str, "cacheVideo");
            sn snVar2 = new sn();
            snVar2.a(contentRecordA);
            snVar2.d(videoInfo.getVideoDownloadUrl());
            snVar2.a(videoInfo.a());
            snVar2.c(videoInfo.getSha256());
            snVar2.b(videoInfo.isCheckSha256());
            snVar2.b("video");
            snVar2.a(true);
            snVar2.a(Long.valueOf(j));
            snVar2.c(true);
            so soVarA2 = this.d.a(snVar2);
            if (soVarA2 == null || com.huawei.openalliance.ad.utils.dg.b(soVarA2.a())) {
                hw.c(str, "dealVideo, download video failed!");
                return false;
            }
            String strA = soVarA2.a();
            videoInfo.a(strA);
            contentRecordA.i(strA);
            eVar.B(strA);
        }
        return true;
    }

    private boolean a(VideoInfo videoInfo) {
        if (this.h || this.m || videoInfo.getDownloadNetwork() == 1) {
            return true;
        }
        return videoInfo.getDownloadNetwork() == 0 && com.huawei.openalliance.ad.utils.cb.c(this.g);
    }

    private boolean a(final long j, String str, List<INativeAd> list, final com.huawei.openalliance.ad.inter.data.e eVar) {
        if (this.l && b(eVar)) {
            eVar.i(true);
        }
        if (!this.l && b(eVar)) {
            a(str, eVar, j);
            return true;
        }
        String str2 = f20034a;
        hw.b(str2, "parser, add nativeAd");
        if (com.huawei.openalliance.ad.utils.c.a(this.g, eVar.aj(), eVar.getSlotId(), eVar.e())) {
            eVar.a(99);
        }
        list.add(eVar);
        if (b(eVar.getCreativeType())) {
            hw.b(str2, "use engine down");
            return false;
        }
        if (this.m && b(eVar)) {
            com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.pm.2
                @Override // java.lang.Runnable
                public void run() {
                    VideoInfo videoInfo = eVar.getVideoInfo();
                    ImageInfo imageInfoA = pm.this.a(eVar);
                    if (pm.this.a(eVar, videoInfo, imageInfoA)) {
                        pm.this.a(eVar, j, videoInfo, imageInfoA);
                    }
                }
            });
        }
        return false;
    }

    private static void a(Map<String, List<INativeAd>> map, List<INativeAd> list) {
        if (map == null || list == null || list.isEmpty()) {
            return;
        }
        for (INativeAd iNativeAd : list) {
            String slotId = ((com.huawei.openalliance.ad.inter.data.e) iNativeAd).getSlotId();
            List<INativeAd> arrayList = map.get(slotId);
            if (com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(iNativeAd);
            map.put(slotId, arrayList);
        }
    }

    private void a(List<Template> list) {
        new qb(this.g).a(list);
    }

    private void a(final String str, final com.huawei.openalliance.ad.inter.data.e eVar, final long j) {
        hw.b(f20034a, "dealVideo, adId: %s, directCacheVideo: %s.", str, Boolean.valueOf(this.m));
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.pm.3
            @Override // java.lang.Runnable
            public void run() {
                VideoInfo videoInfo = eVar.getVideoInfo();
                ImageInfo imageInfoA = pm.this.a(eVar);
                if (pm.this.a(eVar, videoInfo, imageInfoA) && pm.this.a(eVar, j, videoInfo, imageInfoA)) {
                    if (com.huawei.openalliance.ad.utils.c.a(pm.this.g, eVar.aj(), eVar.getSlotId(), eVar.e())) {
                        eVar.a(99);
                        eVar.b(true);
                    }
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(eVar);
                    com.huawei.openalliance.ad.utils.c.a(map, str, arrayList);
                    pm.this.f20036c.a(map);
                }
            }
        });
    }

    private void a(ImageInfo imageInfo, String str) {
        if (imageInfo.getWidth() <= 0 || imageInfo.getHeight() <= 0) {
            Rect rectA = com.huawei.openalliance.ad.utils.bd.a(str);
            int iWidth = rectA.width();
            int iHeight = rectA.height();
            if (iWidth <= 0 || iHeight <= 0) {
                return;
            }
            imageInfo.b(iWidth);
            imageInfo.a(iHeight);
        }
    }

    private void a(MetaData metaData) {
        if (metaData == null || metaData.L() == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.e.a(this.g, metaData.L());
    }

    private void a(long j, AdParseConfig adParseConfig) {
        hw.b(f20034a, "parser");
        this.k = adParseConfig.c();
        AdContentRsp adContentRsp = this.f20035b;
        if (adContentRsp == null) {
            this.f20036c.a(ErrorCode.ERROR_CODE_OTHER);
            return;
        }
        ContentIdListener contentIdListener = this.j;
        if (contentIdListener != null) {
            contentIdListener.a(adContentRsp.d());
        }
        List<Ad30> listC = this.f20035b.c();
        if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
            this.f20036c.a(700);
            return;
        }
        boolean zA = adParseConfig.a();
        if (zA) {
            zA = b(listC);
        }
        boolean z = zA;
        a(this.f20035b.i());
        int i = 0;
        HashMap map = new HashMap(0);
        boolean[] zArr = {false};
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.g);
        Vector vector = new Vector();
        ArrayList arrayList = new ArrayList();
        for (Ad30 ad30 : listC) {
            String strA = ad30.a();
            int iB = ad30.b();
            if (200 != iB) {
                hw.b(f20034a, "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), strA);
            }
            List<Content> listC2 = ad30.c();
            String strE = ad30.e();
            String strG = ad30.g();
            if (com.huawei.openalliance.ad.utils.bm.a(listC2)) {
                hw.b(f20034a, "parser, contents is empty");
            } else {
                this.n = new rl(this.g, this.l, this.m, this.h, a(listC2, i));
                for (Content content : listC2) {
                    if (z) {
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new b(j, zArr, bArrB, strA, strE, vector, content, strG));
                        arrayList = arrayList2;
                        strA = strA;
                        vector = vector;
                        zArr = zArr;
                    } else {
                        String str = strA;
                        Vector vector2 = vector;
                        a(j, zArr, bArrB, str, strE, vector2, content, strG);
                        arrayList = arrayList;
                        strA = str;
                        vector = vector2;
                    }
                }
                i = 0;
            }
        }
        ArrayList arrayList3 = arrayList;
        Vector vector3 = vector;
        boolean[] zArr2 = zArr;
        if (z && !arrayList3.isEmpty()) {
            com.huawei.openalliance.ad.utils.o.a(arrayList3, 2000L);
        }
        if (!vector3.isEmpty()) {
            a(map, vector3);
        }
        if (!map.isEmpty()) {
            this.f20036c.a(map);
            return;
        }
        hw.b(f20034a, "parser, nativeAdsMap is empty");
        if (zArr2[0]) {
            return;
        }
        this.f20036c.a(700);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void a(long j, boolean[] zArr, byte[] bArr, String str, String str2, List<INativeAd> list, Content content, String str3) {
        String str4;
        String str5;
        if (content == null) {
            str4 = f20034a;
            str5 = "parser, content is null";
        } else {
            content.a(this.f20035b.h(), this.i);
            MetaData metaDataC = content.c();
            if (metaDataC != null) {
                com.huawei.openalliance.ad.inter.data.e eVarA = a(str, content, bArr, metaDataC);
                eVarA.i(this.f20035b.k());
                eVarA.v(this.f20035b.l());
                eVarA.c(this.f20035b.o());
                eVarA.k(this.f20035b.d());
                eVarA.n(this.f20035b.q());
                eVarA.o(this.f20035b.r());
                eVarA.V(str2);
                eVarA.u(this.f20035b.v());
                eVarA.y(str3);
                if ((eVarA.ai() == null || eVarA.ai().intValue() != 3) ? a(j, str, list, eVarA) : this.n.a(j, str, list, eVarA, this.f20036c)) {
                    zArr[0] = true;
                }
                a(metaDataC);
                return null;
            }
            str4 = f20034a;
            str5 = "parser, metaData is null";
        }
        hw.b(str4, str5);
        return null;
    }

    private com.huawei.openalliance.ad.inter.data.e a(String str, Content content, byte[] bArr, MetaData metaData) {
        return pl.a(str, content, bArr, this.i, this.k, metaData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImageInfo a(com.huawei.openalliance.ad.inter.data.e eVar) {
        List<ImageInfo> imageInfos = eVar.getImageInfos();
        if (com.huawei.openalliance.ad.utils.bm.a(imageInfos)) {
            return null;
        }
        return imageInfos.get(0);
    }

    private int a(List<Content> list, int i) {
        for (Content content : list) {
            if (content != null && content.U() != null && content.U().equals(3)) {
                i++;
            }
        }
        return i;
    }

    class b implements Callable<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f20048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean[] f20049c;
        private byte[] d;
        private String e;
        private String f;
        private List<INativeAd> g;
        private Content h;
        private String i;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            return pm.this.a(this.f20048b, this.f20049c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public b(long j, boolean[] zArr, byte[] bArr, String str, String str2, List<INativeAd> list, Content content, String str3) {
            this.f20048b = j;
            this.f20049c = zArr;
            this.d = bArr;
            this.e = str;
            this.f = str2;
            this.g = list;
            this.h = content;
            this.i = str3;
        }
    }

    public pm(final Context context, a aVar, boolean z) {
        this.h = false;
        this.i = 3;
        this.k = false;
        this.l = false;
        this.m = false;
        this.g = context.getApplicationContext();
        this.f20036c = aVar;
        this.d = fi.a(context);
        this.e = fp.b(context);
        if (z) {
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pm.1
                @Override // java.lang.Runnable
                public void run() {
                    pm.this.f = com.huawei.openalliance.ad.utils.dd.c(context) + File.separator + Constants.PPS_ROOT_PATH + File.separator + "video" + File.separator;
                }
            });
            return;
        }
        this.f = com.huawei.openalliance.ad.utils.dd.c(context) + File.separator + Constants.PPS_ROOT_PATH + File.separator + "video" + File.separator;
    }

    public pm(Context context, a aVar, int i, boolean z) {
        this(context, aVar, z);
        this.i = i;
    }
}
