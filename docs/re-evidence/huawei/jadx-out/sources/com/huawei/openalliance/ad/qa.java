package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.CheckResult;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class qa extends oz {
    private Context e;
    private fr f;
    private gf g;
    private boolean h;
    private String i;

    @Override // com.huawei.openalliance.ad.oz, com.huawei.openalliance.ad.rb
    public void b() {
        List<ContentRecord> listB = this.f.b();
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            hw.b("TemplateContentProcessor", "trimAllContents, cacheContents is empty.");
            return;
        }
        for (ContentRecord contentRecord : listB) {
            if (contentRecord != null && !com.huawei.openalliance.ad.utils.bm.a(contentRecord.aY())) {
                if (hw.a()) {
                    hw.a("TemplateContentProcessor", "begin check %s, %s", contentRecord.o(), contentRecord.aP());
                }
                for (Asset asset : contentRecord.aY()) {
                    if (asset != null && (asset.d() != null || asset.e() != null)) {
                        if (hw.a()) {
                            hw.a("TemplateContentProcessor", "check asset, %s %s", asset.b(), asset.h());
                        }
                        if (c(asset.h())) {
                            hw.b("TemplateContentProcessor", "is optional");
                        } else if (asset.d() != null) {
                            if (!a(contentRecord.n(), contentRecord, asset, com.huawei.openalliance.ad.utils.bd.b(this.e, asset.d().a()), (sn) null)) {
                                this.f.a(contentRecord, "media not valid");
                                if (hw.a()) {
                                    hw.a("TemplateContentProcessor", "img is valid: %s", asset.d().a());
                                }
                            }
                        } else if (asset.e() != null && !a(contentRecord.n(), contentRecord, asset, asset.e().a(), (sn) null)) {
                            this.f.a(contentRecord, "media not valid");
                            if (hw.a()) {
                                hw.a("TemplateContentProcessor", "video is valid: %s", asset.e().a());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.oz, com.huawei.openalliance.ad.rb
    public CheckResult b(ContentRecord contentRecord) {
        if (contentRecord == null || com.huawei.openalliance.ad.utils.dg.b(contentRecord.aP()) || com.huawei.openalliance.ad.utils.bm.a(contentRecord.aY())) {
            return new CheckResult(false, "spareRecord is null", "");
        }
        ArrayList arrayList = new ArrayList();
        for (Asset asset : contentRecord.aY()) {
            if (asset != null) {
                String strN = contentRecord.n();
                if (asset.d() != null) {
                    if (!a(strN, contentRecord, asset, com.huawei.openalliance.ad.utils.bd.b(this.e, asset.d().a()), (sn) null)) {
                        return new CheckResult(false, "asset img not exist", "");
                    }
                } else if (asset.e() != null && !a(strN, contentRecord, asset, asset.e().a(), (sn) null)) {
                    return new CheckResult(false, "asset video not exist", "");
                }
                arrayList.add(asset);
            }
        }
        contentRecord.l(arrayList);
        contentRecord.ac(com.huawei.openalliance.ad.utils.bk.b(arrayList));
        this.f.a(contentRecord, arrayList, contentRecord.aV());
        hw.b("TemplateContentProcessor", "spare exists");
        return new CheckResult(true, "assets exists", Constants.NULL, contentRecord.V());
    }

    @Override // com.huawei.openalliance.ad.oz, com.huawei.openalliance.ad.rb
    public void a(String str) {
        List<ContentRecord> listA = this.f.a(str);
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return;
        }
        Iterator<ContentRecord> it = listA.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void a(ContentRecord contentRecord, MotionData motionData, int i) {
        try {
            new com.huawei.openalliance.ad.analysis.c(this.e).a(contentRecord, motionData, i);
        } catch (Exception e) {
            hw.d("TemplateContentProcessor", "reportEggCannotShow error: %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.oz
    protected void a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            hw.d("TemplateContentProcessor", "fail to delete content, content is null");
        } else {
            this.f.a(contentRecord);
        }
    }

    @Override // com.huawei.openalliance.ad.oz, com.huawei.openalliance.ad.rb
    public void a() {
        List<ContentRecord> listA = this.f.a();
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return;
        }
        Iterator<ContentRecord> it = listA.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.huawei.openalliance.ad.oz, com.huawei.openalliance.ad.rb
    public ContentRecord a(ContentRecord contentRecord, int i, long j, byte[] bArr, int i2) {
        Asset asset;
        sn snVar;
        hw.b("TemplateContentProcessor", "downloadElements start");
        ContentRecord contentRecord2 = null;
        if (contentRecord == null || com.huawei.openalliance.ad.utils.dg.b(contentRecord.aP()) || com.huawei.openalliance.ad.utils.bm.a(contentRecord.aY())) {
            return null;
        }
        String strO = contentRecord.o();
        int iC = c(contentRecord);
        String strA = com.huawei.openalliance.ad.utils.d.a(i2);
        this.i = strA;
        contentRecord.q(strA);
        ArrayList arrayList = new ArrayList();
        String strA2 = strO;
        for (Asset asset2 : contentRecord.aY()) {
            if (asset2 != null) {
                if (asset2.d() != null) {
                    sn snVarA = a(asset2, j, contentRecord.X());
                    if (snVarA == null) {
                        return contentRecord2;
                    }
                    String strB = com.huawei.openalliance.ad.utils.bd.b(this.e, asset2.d().a());
                    snVarA.d(strB);
                    asset = asset2;
                    if (a(contentRecord.n(), contentRecord, asset2, strB, snVarA)) {
                        arrayList.add(asset);
                        if (hw.a()) {
                            hw.a("TemplateContentProcessor", "asset img path: %s", asset.g());
                        }
                    } else {
                        snVar = snVarA;
                        snVar.d(true);
                        snVar.b(Integer.valueOf(this.i));
                        strA2 = a(contentRecord, strA2, arrayList, asset, snVar);
                    }
                } else {
                    asset = asset2;
                    if (asset.e() != null) {
                        sn snVarA2 = a(asset, j);
                        if (a(contentRecord.n(), contentRecord, asset, asset.e().a(), snVarA2)) {
                            arrayList.add(asset);
                            if (hw.a()) {
                                hw.a("TemplateContentProcessor", "asset video path: %s", asset.g());
                            }
                        } else {
                            snVar = snVarA2;
                            snVar.d(true);
                            snVar.b(Integer.valueOf(this.i));
                            if (!a(iC)) {
                                com.huawei.openalliance.ad.analysis.d.a(this.e, contentRecord);
                                hw.b("TemplateContentProcessor", "video content can only download in wifi");
                                return null;
                            }
                            strA2 = a(contentRecord, strA2, arrayList, asset, snVar);
                        }
                    } else {
                        arrayList.add(asset);
                    }
                }
            }
            contentRecord2 = null;
        }
        contentRecord.l(arrayList);
        contentRecord.ac(com.huawei.openalliance.ad.utils.bk.b(arrayList));
        TemplateData templateDataAV = contentRecord.aV();
        ContentRecord contentRecordA = a(contentRecord, i, bArr, strA2, arrayList, templateDataAV, a(contentRecord, j, i2, iC, templateDataAV));
        hw.b("TemplateContentProcessor", "downloadElements end, showContentId = %s", strA2);
        return contentRecordA;
    }

    @Override // com.huawei.openalliance.ad.oz, com.huawei.openalliance.ad.rb
    public ContentRecord a(ContentRecord contentRecord, int i, long j) {
        return this.f.a(contentRecord, i, j);
    }

    private boolean c(String str) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optInt("optional", 0) == 1;
        } catch (Throwable th) {
            hw.b("TemplateContentProcessor", "isOptional err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    private int c(ContentRecord contentRecord) {
        if (contentRecord.aV() != null && contentRecord.aV().a() != null) {
            try {
                JSONArray jSONArray = new JSONArray(contentRecord.aV().a());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (!jSONObject.isNull("videoDwnNetwork")) {
                        return jSONObject.optInt("videoDwnNetwork");
                    }
                }
            } catch (Throwable th) {
                hw.b("TemplateContentProcessor", "getDownNetwork err: %s", th.getClass().getSimpleName());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ContentRecord contentRecord, TemplateData templateData, long j, int i, int i2) {
        int i3;
        if (templateData == null || com.huawei.openalliance.ad.utils.bm.a(templateData.c())) {
            return true;
        }
        boolean z = true;
        for (MotionData motionData : templateData.c()) {
            sn snVarA = a(motionData, j);
            snVarA.a(contentRecord);
            if (motionData == null || !a(contentRecord.n(), (ContentRecord) null, (Asset) null, motionData.g(), snVarA)) {
                if (a(i)) {
                    snVarA.d(true);
                    snVarA.b(Integer.valueOf(com.huawei.openalliance.ad.utils.d.a(i2)));
                    if (com.huawei.openalliance.ad.utils.dg.b(a(contentRecord, snVarA, false))) {
                        hw.b("TemplateContentProcessor", "motionDataId %s is Download failed, Because filePath is blank!", Long.valueOf(motionData.a()));
                        i3 = 16;
                    }
                } else {
                    hw.b("TemplateContentProcessor", "motionDataId %s is Download failed, Because network can not download!", Long.valueOf(motionData.a()));
                    i3 = 17;
                }
                a(contentRecord, motionData, i3);
                z = false;
            }
        }
        hw.b("TemplateContentProcessor", "downMotionSuccessFlag is %s", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ContentRecord contentRecord, Asset asset, String str, sn snVar) {
        String strA = a(this.e, contentRecord, str, com.huawei.openalliance.ad.constant.Constants.TPLATE_CACHE, snVar);
        if (!TextUtils.isEmpty(strA)) {
            if (asset != null) {
                asset.b(strA);
            }
            hw.b("TemplateContentProcessor", "tplate isExistLocal: %s", com.huawei.openalliance.ad.utils.ds.a(strA));
            return true;
        }
        String strA2 = a(this.e, contentRecord, str, "normal", snVar);
        if (TextUtils.isEmpty(strA2)) {
            return false;
        }
        if (asset != null) {
            asset.b(strA2);
        }
        hw.b("TemplateContentProcessor", "normal isExistLocal: %s", com.huawei.openalliance.ad.utils.ds.a(strA2));
        return true;
    }

    private String b(String str) {
        String str2 = this.i;
        List<ContentResource> listC = ey.a(this.e).c(com.huawei.openalliance.ad.utils.db.a(str), com.huawei.openalliance.ad.constant.Constants.TPLATE_CACHE);
        return (com.huawei.openalliance.ad.utils.bm.a(listC) || listC.get(0) == null) ? str2 : String.valueOf(listC.get(0).g());
    }

    private boolean a(String str, ContentRecord contentRecord, Asset asset, String str2, sn snVar) {
        return com.huawei.openalliance.ad.utils.d.c(this.e, str) ? b(contentRecord, asset, str2, snVar) : a(contentRecord, asset, str2, snVar);
    }

    private boolean a(final ContentRecord contentRecord, final Asset asset, final String str, final sn snVar) {
        boolean zBooleanValue;
        Future futureA = com.huawei.openalliance.ad.utils.dj.a(new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.qa.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                return Boolean.valueOf(qa.this.b(contentRecord, asset, str, snVar));
            }
        });
        final Future futureA2 = com.huawei.openalliance.ad.utils.dj.a(new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.qa.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                return Boolean.valueOf(com.huawei.openalliance.ad.utils.c.a(qa.this.e, contentRecord, str, asset));
            }
        });
        try {
            Boolean bool = (Boolean) futureA.get();
            zBooleanValue = bool.booleanValue();
            try {
                hw.a("TemplateContentProcessor", "sdk res: %s", bool);
            } catch (Throwable th) {
                th = th;
                hw.c("TemplateContentProcessor", "sdk res err: %s", th.getClass().getSimpleName());
            }
        } catch (Throwable th2) {
            th = th2;
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.qa.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (((Boolean) futureA2.get()).booleanValue()) {
                            qa.this.a(contentRecord, 3);
                        } else {
                            qa.this.a(contentRecord, 1);
                        }
                    } catch (Throwable th3) {
                        hw.c("TemplateContentProcessor", "check exist in kit: %s", th3.getClass().getSimpleName());
                    }
                }
            });
        } else {
            try {
                Boolean bool2 = (Boolean) futureA2.get();
                zBooleanValue = bool2.booleanValue();
                if (zBooleanValue) {
                    a(contentRecord, 2);
                } else {
                    a(contentRecord, 0);
                }
                hw.a("TemplateContentProcessor", "kit res: %s", bool2);
            } catch (Throwable th3) {
                hw.c("TemplateContentProcessor", "kit res err: %s", th3.getClass().getSimpleName());
            }
        }
        hw.b("TemplateContentProcessor", "isExistBoth: %s", Boolean.valueOf(zBooleanValue));
        return zBooleanValue;
    }

    private boolean a(ContentRecord contentRecord, long j, int i, int i2, TemplateData templateData) {
        boolean zB;
        boolean z = !this.h && pa.I(contentRecord.X());
        hw.b("TemplateContentProcessor", "isPreContent is  %s, isNeedAsyncDownMotion is %s", Boolean.valueOf(this.h), Boolean.valueOf(z));
        if (z) {
            a(contentRecord, templateData, j, i2, i);
            zB = false;
        } else {
            zB = b(contentRecord, templateData, j, i2, i);
        }
        return z || zB;
    }

    private void a(final ContentRecord contentRecord, final TemplateData templateData, final long j, final int i, final int i2) {
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.qa.4
            @Override // java.lang.Runnable
            public void run() {
                qa.this.b(contentRecord, templateData, j, i, i2);
            }
        });
    }

    private String a(ContentRecord contentRecord, String str, List<Asset> list, Asset asset, sn snVar) {
        String strC = dk.a(this.e, com.huawei.openalliance.ad.constant.Constants.TPLATE_CACHE).c(a(contentRecord, snVar, true));
        if (!com.huawei.openalliance.ad.utils.dg.b(strC)) {
            asset.b(strC);
        } else if (!c(asset.h())) {
            str = null;
        }
        list.add(asset);
        return str;
    }

    private String a(ContentRecord contentRecord, sn snVar, boolean z) {
        if (snVar == null) {
            return null;
        }
        snVar.a(contentRecord);
        snVar.c(true);
        snVar.e(com.huawei.openalliance.ad.constant.Constants.TPLATE_CACHE);
        so soVarA = this.g.a(snVar);
        if (soVarA != null) {
            return soVarA.a();
        }
        return null;
    }

    private String a(Context context, ContentRecord contentRecord, String str, String str2, sn snVar) {
        dn dnVarA = dk.a(context, str2);
        String strE = dnVarA.e(com.huawei.openalliance.ad.utils.bd.b(context, str));
        String strC = dnVarA.c(strE);
        if (!com.huawei.openalliance.ad.utils.ai.b(strC)) {
            return null;
        }
        if (contentRecord != null) {
            contentRecord.q(b(str));
            if (snVar != null) {
                snVar.a(contentRecord);
            }
        }
        sm.a(context, strE, dnVarA, snVar, str2);
        return strC;
    }

    private sn a(MotionData motionData, long j) {
        if (motionData == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(motionData.g());
        snVar.c(motionData.h());
        snVar.b(true);
        snVar.c(true);
        snVar.e(com.huawei.openalliance.ad.constant.Constants.TPLATE_CACHE);
        snVar.a(Long.valueOf(j));
        return snVar;
    }

    private sn a(Asset asset, long j, String str) {
        if (asset == null || asset.d() == null) {
            return null;
        }
        if (this.h && pa.a(str) && !com.huawei.openalliance.ad.utils.cb.c(this.e)) {
            hw.b("TemplateContentProcessor", "pre content only download in wifi");
            return null;
        }
        sn snVar = new sn();
        snVar.d(asset.d().a());
        snVar.c(asset.d().d() != null ? asset.d().d().b() : null);
        snVar.b(asset.d().d() == null || asset.d().d().d() == 0);
        snVar.c(true);
        snVar.a(Long.valueOf(j));
        return snVar;
    }

    private sn a(Asset asset, long j) {
        if (asset == null || asset.e() == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(asset.e().a());
        snVar.c(asset.e().f());
        snVar.b(asset.e().h() == 0);
        snVar.c(true);
        snVar.a(Long.valueOf(j));
        return snVar;
    }

    private ContentRecord a(ContentRecord contentRecord, int i, byte[] bArr, String str, List<Asset> list, TemplateData templateData, boolean z) {
        if (str == null || !z) {
            return null;
        }
        contentRecord.a(bArr);
        contentRecord.v(UUID.randomUUID().toString());
        if (1 == i) {
            contentRecord.f(720);
            contentRecord.g(1080);
        } else {
            contentRecord.f(1080);
            contentRecord.g(720);
        }
        contentRecord.k(199);
        this.f.a(contentRecord, list, templateData);
        return contentRecord;
    }

    public qa(Context context, boolean z) {
        super(context, z, -1);
        this.i = "3";
        this.e = context;
        this.g = fi.a(context);
        this.f = new fr(context);
        this.h = z;
    }
}
