package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gk f20167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gf f20168c;
    private String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int j;
    private int h = 1;
    private int i = 0;
    private volatile int k = 0;
    private volatile List<INativeAd> l = new ArrayList(1);

    public boolean a(final long j, String str, List<INativeAd> list, final com.huawei.openalliance.ad.inter.data.e eVar, pm.a aVar) {
        eVar.a(99);
        if (this.e) {
            eVar.i(true);
        }
        if (!this.e) {
            a(str, eVar, j, aVar);
            return true;
        }
        hw.b("NativeAdParser3", "parser, add nativeAd");
        list.add(eVar);
        if (com.huawei.openalliance.ad.utils.bj.a(Integer.valueOf(eVar.g())) && !this.f) {
            hw.b("NativeAdParser3", "no cache");
            return false;
        }
        if (com.huawei.openalliance.ad.utils.c.b()) {
            hw.b("NativeAdParser3", "use engine down");
            return false;
        }
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.rl.1
            @Override // java.lang.Runnable
            public void run() {
                rl.this.a(eVar);
                rl.this.a(eVar, j);
            }
        });
        return false;
    }

    public void a(String str, ContentRecord contentRecord, MotionData motionData, int i) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            hw.b("NativeAdParser3", "down motion failed");
            try {
                new com.huawei.openalliance.ad.analysis.c(this.f20166a).a(contentRecord, motionData, i);
            } catch (Exception e) {
                hw.d("NativeAdParser3", "reportEggCannotDisplay err: %s", e.getClass().getSimpleName());
            }
        }
    }

    public void a() {
        if (this.l != null) {
            this.l.clear();
        }
    }

    private boolean b() {
        int i;
        if (this.g || this.f || (i = this.i) == 1) {
            return true;
        }
        return i == 0 && com.huawei.openalliance.ad.utils.cb.c(this.f20166a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(ContentRecord contentRecord, sn snVar) {
        if (snVar == null) {
            return null;
        }
        snVar.a(contentRecord);
        snVar.c(true);
        snVar.e(Constants.TPLATE_CACHE);
        so soVarA = this.f20168c.a(snVar);
        if (soVarA != null) {
            return soVarA.a();
        }
        return null;
    }

    private sn b(Asset asset, long j) {
        if (asset == null || asset.e() == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(asset.e().a());
        snVar.c(asset.e().f());
        snVar.b(asset.e().h() == 0);
        snVar.c(true);
        snVar.a(Long.valueOf(j));
        snVar.b(Constants.TEMPLATE_VIDEO_SUB_DIR);
        snVar.a(true);
        return snVar;
    }

    static /* synthetic */ int b(rl rlVar) {
        int i = rlVar.k;
        rlVar.k = i + 1;
        return i;
    }

    private boolean a(String str) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optInt("optional", 0) == 1;
        } catch (Throwable th) {
            hw.b("NativeAdParser3", "isOptional err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.huawei.openalliance.ad.inter.data.e eVar, long j) {
        if (this.f20167b.aU() + 86400000 < com.huawei.openalliance.ad.utils.as.c()) {
            this.f20167b.b(com.huawei.openalliance.ad.utils.as.c());
            com.huawei.openalliance.ad.utils.ai.a(this.d, 604800000L);
        }
        ContentRecord contentRecordA = pl.a(eVar);
        if (contentRecordA == null || com.huawei.openalliance.ad.utils.bm.a(contentRecordA.aY())) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (Asset asset : contentRecordA.aY()) {
            if (asset != null) {
                if (asset.d() != null) {
                    String strA = a(contentRecordA, a(asset, j));
                    if (TextUtils.isEmpty(strA)) {
                        hw.c("NativeAdParser3", "download img: %s failed", asset.b());
                        if (!a(asset.h())) {
                            z = false;
                        }
                    } else {
                        asset.d().b(strA);
                        a(asset, strA);
                    }
                }
                if (asset.e() != null) {
                    if (!a(contentRecordA)) {
                        z = false;
                    } else if (1 == this.h || this.f) {
                        hw.b("NativeAdParser3", "cacheVideo");
                        String strA2 = a(contentRecordA, b(asset, j));
                        if (TextUtils.isEmpty(strA2)) {
                            hw.c("NativeAdParser3", "dealVideo, download video failed!");
                            if (!a(asset.h())) {
                                z = false;
                            }
                        } else {
                            asset.e().d(strA2);
                        }
                    }
                }
                arrayList.add(asset);
            }
        }
        if (z) {
            eVar.j(arrayList);
        }
        a(contentRecordA, j);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final ContentRecord contentRecord) {
        if (1 != this.h || b()) {
            return true;
        }
        hw.c("NativeAdParser3", "cache mode video is not allowed to download in network %d", Integer.valueOf(this.i));
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.rl.3
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(rl.this.f20166a).b(contentRecord);
            }
        });
        return false;
    }

    private void a(final String str, final com.huawei.openalliance.ad.inter.data.e eVar, final long j, final pm.a aVar) {
        hw.b("NativeAdParser3", "dealVideo, adId: %s, directCacheVideo: %s.", str, Boolean.valueOf(this.f));
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.rl.2
            @Override // java.lang.Runnable
            public void run() {
                rl.this.a(eVar);
                if (rl.this.a(eVar, j)) {
                    eVar.b(true);
                    rl.this.l.add(eVar);
                }
                rl.b(rl.this);
                if (rl.this.k != rl.this.j || com.huawei.openalliance.ad.utils.bm.a(rl.this.l)) {
                    return;
                }
                HashMap map = new HashMap();
                com.huawei.openalliance.ad.utils.c.a(map, str, (List<INativeAd>) rl.this.l);
                aVar.a(map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.huawei.openalliance.ad.inter.data.e eVar) {
        try {
            JSONArray jSONArray = new JSONArray(eVar.ag().a());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!jSONObject.isNull("videoDwnNetwork")) {
                    this.i = jSONObject.optInt("videoDwnNetwork");
                } else if (!jSONObject.isNull("videoPlayMode")) {
                    this.h = jSONObject.optInt("videoPlayMode");
                }
            }
        } catch (Throwable th) {
            hw.b("NativeAdParser3", "getTemplateContext err: %s", th.getClass().getSimpleName());
        }
    }

    private void a(final ContentRecord contentRecord, final long j) {
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.rl.4
            @Override // java.lang.Runnable
            public void run() {
                ContentRecord contentRecord2 = contentRecord;
                if (contentRecord2 == null || contentRecord2.aV() == null) {
                    return;
                }
                if (!rl.this.a(contentRecord) || (1 != rl.this.h && !rl.this.f)) {
                    if (com.huawei.openalliance.ad.utils.bm.a(contentRecord.aV().c())) {
                        return;
                    }
                    Iterator<MotionData> it = contentRecord.aV().c().iterator();
                    while (it.hasNext()) {
                        rl.this.a((String) null, contentRecord, it.next(), 17);
                    }
                    return;
                }
                if (com.huawei.openalliance.ad.utils.bm.a(contentRecord.aV().c())) {
                    return;
                }
                for (MotionData motionData : contentRecord.aV().c()) {
                    sn snVarA = rl.this.a(motionData, j);
                    snVarA.a(contentRecord);
                    rl.this.a(rl.this.b(contentRecord, snVarA), contentRecord, motionData, 16);
                }
            }
        });
    }

    private void a(Asset asset, String str) {
        if (asset.d().b() <= 0 || asset.d().c() <= 0) {
            Rect rectA = com.huawei.openalliance.ad.utils.bd.a(str);
            int iWidth = rectA.width();
            int iHeight = rectA.height();
            if (iWidth <= 0 || iHeight <= 0) {
                return;
            }
            asset.d().a(iWidth);
            asset.d().b(iHeight);
        }
    }

    private String a(ContentRecord contentRecord, sn snVar) {
        String strB = b(contentRecord, snVar);
        dn dnVarA = dk.a(this.f20166a, Constants.TPLATE_CACHE);
        if (!dnVarA.g(strB)) {
            dnVarA = dk.a(this.f20166a, "normal");
        }
        String strC = dnVarA.c(strB);
        if (com.huawei.openalliance.ad.utils.dg.b(strC)) {
            return null;
        }
        return strC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sn a(MotionData motionData, long j) {
        if (motionData == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(motionData.g());
        snVar.c(motionData.h());
        snVar.b(true);
        snVar.c(true);
        snVar.e(Constants.TPLATE_CACHE);
        snVar.a(Long.valueOf(j));
        return snVar;
    }

    private sn a(Asset asset, long j) {
        if (asset == null || asset.d() == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(asset.d().a());
        snVar.c(asset.d().d() != null ? asset.d().d().b() : null);
        snVar.b(asset.d().d() == null || asset.d().d().d() == 0);
        snVar.c(true);
        snVar.a(Long.valueOf(j));
        snVar.b(Constants.TEMPLATE_VIDEO_SUB_DIR);
        return snVar;
    }

    public rl(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.j = 0;
        this.f20166a = context;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.f20167b = fp.b(context);
        this.f20168c = fi.a(context);
        this.d = com.huawei.openalliance.ad.utils.dd.c(context) + File.separator + Constants.PPS_ROOT_PATH + File.separator + Constants.TEMPLATE_VIDEO_SUB_DIR + File.separator;
        this.j = i;
    }
}
