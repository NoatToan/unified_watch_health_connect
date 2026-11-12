package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.CheckResult;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.openalliance.ad.inter.HiAdSplash;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes12.dex */
public class oz implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f19940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f19941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected fz f19942c;
    protected Context d;
    private ga e;
    private gf f;
    private gk g;
    private cv h;
    private Integer i;

    @Override // com.huawei.openalliance.ad.rb
    public ContentRecord a(ContentRecord contentRecord, int i, long j) {
        return null;
    }

    @Override // com.huawei.openalliance.ad.rb
    public void b() {
        List<ContentRecord> listA = this.f19942c.a(this.f19940a);
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return;
        }
        for (ContentRecord contentRecord : listA) {
            if (contentRecord != null) {
                e(contentRecord);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.rb
    public CheckResult b(ContentRecord contentRecord) {
        return com.huawei.openalliance.ad.utils.d.c(this.d, contentRecord.n()) ? b(contentRecord, true) : h(contentRecord);
    }

    protected boolean a(int i) {
        Integer allowMobileTraffic = HiAdSplash.getInstance(this.d).getAllowMobileTraffic();
        if (allowMobileTraffic != null) {
            if (1 == allowMobileTraffic.intValue()) {
                return true;
            }
            if (allowMobileTraffic.intValue() == 0) {
                return com.huawei.openalliance.ad.utils.cb.c(this.d);
            }
        }
        if (i == 1) {
            return true;
        }
        return i == 0 && com.huawei.openalliance.ad.utils.cb.c(this.d);
    }

    protected void a(String str, String str2, String str3) {
        com.huawei.openalliance.ad.utils.w.a(this.d, str, str2, str3);
    }

    @Override // com.huawei.openalliance.ad.rb
    public void a(String str) {
        List<ContentRecord> listB = this.f19942c.b(str);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return;
        }
        Iterator<ContentRecord> it = listB.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.huawei.openalliance.ad.rb
    public void a(Integer num) {
        this.i = num;
    }

    protected void a(final ContentRecord contentRecord, final int i) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.oz.7
            @Override // java.lang.Runnable
            public void run() {
                oz.this.h.d(contentRecord, i);
            }
        });
    }

    protected void a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            hw.d("ContentProcessor", "fail to delete content, content is null");
            return;
        }
        hw.b("ContentProcessor", "deleteContent, uniqueId: %s", contentRecord.ac());
        this.f19942c.b(contentRecord.o(), contentRecord.n(), contentRecord.ac());
        if (this.f19942c.a(contentRecord.o(), contentRecord.n()) != null) {
            hw.b("ContentProcessor", "contentRecords remains");
            return;
        }
        String strA = contentRecord.A();
        int i = this.f19940a;
        if ((1 == i || 18 == i) && !com.huawei.openalliance.ad.utils.dg.b(strA)) {
            String strSubstring = strA.substring(strA.lastIndexOf("/") + 1);
            if (c(strSubstring).booleanValue()) {
                com.huawei.openalliance.ad.utils.ai.a(this.d, strA, b(strA));
            } else {
                this.e.b(contentRecord.o(), strSubstring);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.rb
    public void a(ImageInfo imageInfo, ContentRecord contentRecord, long j) {
        sn snVarB = b(imageInfo, contentRecord, j);
        if (snVarB != null) {
            snVarB.a(contentRecord);
            so soVarA = this.f.a(snVarB);
            hw.b("ContentProcessor", "downloadSplashIcon result= %s", soVarA != null ? com.huawei.openalliance.ad.utils.ds.a(soVarA.b()) : null);
        }
    }

    @Override // com.huawei.openalliance.ad.rb
    public void a() {
        Iterator<ContentRecord> it = this.f19942c.c().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.huawei.openalliance.ad.rb
    public ContentRecord a(ContentRecord contentRecord, int i, long j, byte[] bArr, int i2) {
        hw.b("ContentProcessor", "downloadOneContent start");
        if (contentRecord == null) {
            hw.c("ContentProcessor", "downloadOneContent, contentRecord in null");
            return null;
        }
        if (9 != contentRecord.F() && 12 != contentRecord.F() && this.f19941b && pa.a(contentRecord.X()) && !com.huawei.openalliance.ad.utils.cb.c(this.d)) {
            hw.b("ContentProcessor", "downloadOneContent, pre content only download in wifi");
            com.huawei.openalliance.ad.analysis.d.b(this.d, contentRecord);
            return null;
        }
        if (!b(contentRecord.F()) && contentRecord.k() == 1) {
            hw.b("ContentProcessor", "downloadOneContent - content creativeType %d not supported", Integer.valueOf(contentRecord.F()));
            return null;
        }
        contentRecord.a(bArr);
        ContentRecord contentRecordA = a(contentRecord, j, i2);
        hw.b("ContentProcessor", "downloadOneContent, showContentId:%s", contentRecordA != null ? contentRecordA.o() : null);
        return contentRecordA;
    }

    private CheckResult h(ContentRecord contentRecord) {
        return a(contentRecord, true);
    }

    private boolean g(ContentRecord contentRecord) {
        CheckResult checkResultA = a(contentRecord, false);
        return checkResultA != null && checkResultA.a();
    }

    private boolean f(ContentRecord contentRecord) {
        return b(contentRecord, false).a();
    }

    private boolean e(ContentRecord contentRecord) {
        return com.huawei.openalliance.ad.utils.d.c(this.d, contentRecord.n()) ? f(contentRecord) : g(contentRecord);
    }

    private void d(ContentRecord contentRecord) {
        if (2 == contentRecord.F()) {
            String strA = contentRecord.A();
            if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
                return;
            }
            com.huawei.openalliance.ad.utils.bd.a(this.d, strA, null, null);
        }
    }

    private void c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            this.f19942c.c(str);
        } else {
            this.f19942c.b(str, str2, str3);
        }
    }

    private void c(final ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.oz.1
            @Override // java.lang.Runnable
            public void run() {
                dn dnVarA = dk.a(oz.this.d, "normal");
                String strB = com.huawei.openalliance.ad.utils.bd.b(oz.this.d, com.huawei.openalliance.ad.utils.c.a(oz.this.d, contentRecord));
                String strE = dnVarA.e(strB);
                String strC = dnVarA.c(strE);
                if (!com.huawei.openalliance.ad.utils.ai.b(strC)) {
                    dn dnVarA2 = dk.a(oz.this.d, Constants.TPLATE_CACHE);
                    String strE2 = dnVarA2.e(strB);
                    strC = dnVarA2.c(strE2);
                    strE = strE2;
                }
                if (com.huawei.openalliance.ad.utils.ai.b(strC)) {
                    dnVarA.h(strE);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    private Boolean c(String str) {
        boolean z;
        List<ContentResource> listA = this.e.a(str);
        if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
            z = listA.size() == 1;
        }
        return Boolean.valueOf(z);
    }

    private boolean b(int i) {
        int i2 = this.f19940a;
        if (1 == i2 || 18 == i2) {
            return 2 == i || 4 == i || 9 == i || 12 == i;
        }
        return false;
    }

    private String b(String str) {
        String str2 = "normal";
        String strC = dk.a(this.d, "normal").c(str);
        if (!com.huawei.openalliance.ad.utils.dg.b(strC) && !com.huawei.openalliance.ad.utils.ai.d(new File(strC))) {
            String strC2 = dk.a(this.d, Constants.TPLATE_CACHE).c(str);
            if (!com.huawei.openalliance.ad.utils.dg.b(strC2) && com.huawei.openalliance.ad.utils.ai.d(new File(strC2))) {
                str2 = Constants.TPLATE_CACHE;
            }
        }
        hw.b("ContentProcessor", "realCacheType is %s", str2);
        return str2;
    }

    private sn b(ImageInfo imageInfo, ContentRecord contentRecord, long j) {
        if (imageInfo == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.a(contentRecord);
        snVar.d(imageInfo.c());
        snVar.c(imageInfo.a());
        snVar.b(imageInfo.g() == 0);
        snVar.c(true);
        snVar.a(true);
        snVar.a(Long.valueOf(j));
        snVar.c(MetaCreativeType.GIF.equals(imageInfo.b()) ? this.g.d() : this.g.e());
        return snVar;
    }

    private ContentRecord b(String str, String str2, String str3) {
        return TextUtils.isEmpty(str2) ? this.f19942c.a(str) : this.f19942c.a(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CheckResult b(ContentRecord contentRecord, boolean z) {
        String strC;
        String strO = contentRecord.o();
        String strN = contentRecord.n();
        String strAc = contentRecord.ac();
        hw.b("ContentProcessor", "checkLocalCache, uniqueId: %s", strAc);
        ContentRecord contentRecordB = b(strO, strN, strAc);
        if (contentRecordB == null) {
            return new CheckResult(false, "cachedContentRecord is null", "");
        }
        String strV = contentRecordB.V();
        CheckResult checkResultB = b(contentRecordB, strO);
        String strA = contentRecordB.A();
        if (checkResultB == null || checkResultB.a()) {
            if (checkResultB == null || !checkResultB.a()) {
                strC = null;
            } else {
                strA = checkResultB.b();
                strC = checkResultB.c();
            }
            if (!z) {
                if (this.i != null && !this.f19941b) {
                    int iV = contentRecordB.v();
                    int iU = contentRecordB.u();
                    boolean z2 = this.i.intValue() != 0 || (contentRecordB.F() != 12 && iU > iV);
                    if ((this.i.intValue() == 1 && contentRecordB.F() != 12 && iU > iV) || !z2) {
                        hw.b("ContentProcessor", "delete content %s because of media mismatch screen orientation.", strO);
                        com.huawei.openalliance.ad.utils.ai.a(this.d, strA);
                        this.f19942c.c(strO);
                        return new CheckResult(false, "media mismatch screen orientation", strC);
                    }
                }
                contentRecord.j(strC);
                contentRecord.q(strV);
                return new CheckResult(true, strA, strC, strV);
            }
            if (checkResultB == null) {
                return new CheckResult(true, strA, strC, strV);
            }
        }
        return checkResultB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CheckResult b(ContentRecord contentRecord, String str, String str2) {
        String strA = a(str2, "normal");
        String strV = contentRecord.V();
        if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
            hw.b("ContentProcessor", "checkFileExistInNormal filePath is blank %s.", str);
            return new CheckResult(false, "filePath is blank", strA);
        }
        if (com.huawei.openalliance.ad.utils.ai.c(this.d, strA, "normal")) {
            hw.b("ContentProcessor", "normal localFilePath is %s", com.huawei.openalliance.ad.utils.ds.a(strA));
            return new CheckResult(true, str2, strA, strV);
        }
        hw.b("ContentProcessor", "checkFileExistInNormal is FilePath is invalid : %s.", str);
        com.huawei.openalliance.ad.utils.ai.a(this.d, str2);
        return new CheckResult(false, str2, strA);
    }

    private CheckResult b(final ContentRecord contentRecord, final String str) {
        Object obj;
        String strN = contentRecord.n();
        final String strA = contentRecord.A();
        Future futureA = com.huawei.openalliance.ad.utils.dj.a(new Callable<CheckResult>() { // from class: com.huawei.openalliance.ad.oz.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CheckResult call() {
                return oz.this.b(contentRecord, str, strA);
            }
        });
        Future futureA2 = com.huawei.openalliance.ad.utils.dj.a(new Callable<CheckResult>() { // from class: com.huawei.openalliance.ad.oz.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CheckResult call() {
                return oz.this.a(contentRecord, str, strA);
            }
        });
        try {
            if (((CheckResult) futureA.get()).a() || ((CheckResult) futureA2.get()).a()) {
                if (((CheckResult) futureA.get()).a()) {
                    hw.c("ContentProcessor", "normalPathFuture is Valid");
                } else {
                    if (!((CheckResult) futureA2.get()).a()) {
                        return null;
                    }
                    hw.c("ContentProcessor", "tplatePathFuture is Valid");
                    obj = futureA2.get();
                }
                return (CheckResult) obj;
            }
            hw.c("ContentProcessor", "normalPathFuture and tplatePathFuture is invalid");
            c(str, strN, contentRecord.ac());
            obj = futureA.get();
            return (CheckResult) obj;
        } catch (Throwable th) {
            hw.c("ContentProcessor", "normalPathFuture or tplatePathFuture res err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    private boolean a(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return false;
        }
        return a(videoInfo.l());
    }

    private void a(ContentRecord contentRecord, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("_id");
        arrayList.add(ContentRecord.DISPLAY_COUNT);
        arrayList.add(ContentRecord.DISPLAY_DATE);
        arrayList.add(ContentRecord.SPLASH_MEDIA_PATH);
        arrayList.add(ContentRecord.LAST_SHOW_TIME);
        arrayList.add(ContentRecord.FC_CTRL_DATE);
        int i = this.f19940a;
        if (1 == i || 18 == i) {
            hw.a("ContentProcessor", "ad type is splash");
        }
        this.f19942c.d(contentRecord, arrayList);
        a(str, contentRecord.ap(), "normal");
        a(str, contentRecord.ap(), "ar");
        a(str, contentRecord.ap(), Constants.TPLATE_CACHE);
    }

    private String a(String str, String str2) {
        return dn.i(str) ? dk.a(this.d, str2).c(str) : str;
    }

    private sn a(VideoInfo videoInfo, ContentRecord contentRecord, long j) {
        if (videoInfo == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.a(contentRecord);
        snVar.d(videoInfo.a());
        snVar.c(videoInfo.g());
        snVar.b(videoInfo.i() == 0);
        snVar.c(true);
        snVar.a(true);
        snVar.a(Long.valueOf(j));
        snVar.a(209715200L);
        return snVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    private ContentRecord a(ContentRecord contentRecord, long j, String str) {
        sn snVarA;
        String strB;
        String strA;
        if (contentRecord.T() == null && contentRecord.S() == null) {
            hw.a("ContentProcessor", "no material");
            return null;
        }
        int iF = contentRecord.F();
        if (iF == 9 || iF == 12) {
            VideoInfo videoInfoT = contentRecord.T();
            if (a(videoInfoT)) {
                snVarA = a(videoInfoT, contentRecord, j);
            } else {
                com.huawei.openalliance.ad.analysis.d.a(this.d, contentRecord);
                hw.b("ContentProcessor", "video content can only download in wifi");
                snVarA = null;
            }
        } else {
            snVarA = b(contentRecord.S(), contentRecord, j);
        }
        if (snVarA != null) {
            snVarA.a(contentRecord);
            so soVarA = this.f.a(snVarA);
            if (soVarA != null) {
                strA = soVarA.a();
                strB = soVarA.b();
            } else {
                strB = null;
                strA = null;
            }
        } else {
            strB = null;
            strA = null;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
            contentRecord = null;
            str = null;
        } else {
            contentRecord.i(strA);
            contentRecord.j(strB);
            contentRecord.d(this.f19942c.d(contentRecord.p()));
            this.f19942c.a(contentRecord);
        }
        hw.a("ContentProcessor", "downloadAndSaveContent, contentId: %s. ", str);
        return contentRecord;
    }

    private ContentRecord a(ContentRecord contentRecord, long j, int i) {
        String strO = contentRecord.o();
        boolean zE = e(contentRecord);
        hw.b("ContentProcessor", "downContent: %s isExist: %s isPreContent: %s", strO, Boolean.valueOf(zE), Boolean.valueOf(this.f19941b));
        hw.a("ContentProcessor", "path: %s", contentRecord.A());
        if (zE && !this.f19941b) {
            a(contentRecord, strO);
            d(contentRecord);
            c(contentRecord);
            return contentRecord;
        }
        if (!zE) {
            int i2 = this.f19940a;
            if (1 == i2 || 18 == i2) {
                contentRecord.q(com.huawei.openalliance.ad.utils.d.a(i));
                return a(contentRecord, j, strO);
            }
            this.f19942c.a(contentRecord);
            return contentRecord;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("updateTime");
        if (TextUtils.isEmpty(contentRecord.n())) {
            this.f19942c.a(contentRecord, arrayList, strO);
        } else {
            this.f19942c.b(contentRecord, arrayList);
        }
        a(strO, contentRecord.ap(), "normal");
        a(strO, contentRecord.ap(), "ar");
        a(strO, contentRecord.ap(), Constants.TPLATE_CACHE);
        c(contentRecord);
        return contentRecord;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:23:0x006c, B:25:0x0072, B:28:0x0080, B:32:0x0089, B:26:0x007b), top: B:43:0x006c }] */
    private CheckResult a(final ContentRecord contentRecord, final boolean z) {
        Object th;
        CheckResult checkResult;
        boolean z2;
        Future futureA = com.huawei.openalliance.ad.utils.dj.a(new Callable<CheckResult>() { // from class: com.huawei.openalliance.ad.oz.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CheckResult call() {
                return oz.this.b(contentRecord, z);
            }
        });
        final Future futureA2 = com.huawei.openalliance.ad.utils.dj.a(new Callable<CheckResult>() { // from class: com.huawei.openalliance.ad.oz.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CheckResult call() {
                return new CheckResult(com.huawei.openalliance.ad.utils.c.a(oz.this.d, contentRecord, com.huawei.openalliance.ad.utils.c.a(oz.this.d, contentRecord)), contentRecord.A(), "", contentRecord.V());
            }
        });
        try {
            checkResult = (CheckResult) futureA.get();
            if (checkResult != null) {
                try {
                    if (checkResult.a()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hw.b("ContentProcessor", "exist in sdk: %s, is spare: %s", Boolean.valueOf(z2), Boolean.valueOf(z));
                } catch (Throwable th2) {
                    th = th2;
                    hw.c("ContentProcessor", "exist in sdk: %s", th.getClass().getSimpleName());
                }
            } else {
                z2 = false;
                hw.b("ContentProcessor", "exist in sdk: %s, is spare: %s", Boolean.valueOf(z2), Boolean.valueOf(z));
            }
        } catch (Throwable th3) {
            th = th3;
            checkResult = null;
        }
        if (checkResult != null && checkResult.a()) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.oz.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        CheckResult checkResult2 = (CheckResult) futureA2.get();
                        if (checkResult2 == null || !checkResult2.a()) {
                            oz.this.a(contentRecord, 1);
                        } else {
                            oz.this.a(contentRecord, 3);
                        }
                    } catch (Throwable th4) {
                        hw.c("ContentProcessor", "check exist in kit: %s", th4.getClass().getSimpleName());
                    }
                }
            });
            return checkResult;
        }
        try {
            CheckResult checkResult2 = (CheckResult) futureA2.get();
            if (checkResult2 != null) {
                try {
                    if (checkResult2.a()) {
                        this.f19942c.a(contentRecord);
                        a(contentRecord, 2);
                    } else {
                        a(contentRecord, 0);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    checkResult = checkResult2;
                    hw.c("ContentProcessor", "exist in kit: %s", th.getClass().getSimpleName());
                    return checkResult;
                }
            } else {
                a(contentRecord, 0);
            }
            hw.b("ContentProcessor", "exist in kit: %s, is spare: %s", Boolean.valueOf(checkResult2 != null && checkResult2.a()), Boolean.valueOf(z));
            return checkResult2;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CheckResult a(ContentRecord contentRecord, String str, String str2) {
        String strA = a(str2, Constants.TPLATE_CACHE);
        String strV = contentRecord.V();
        if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
            hw.b("ContentProcessor", "checkFileExistInTplate filePath is blank %s.", str);
            return new CheckResult(false, "filePath is blank", strA);
        }
        if (com.huawei.openalliance.ad.utils.ai.c(this.d, strA, Constants.TPLATE_CACHE)) {
            hw.b("ContentProcessor", "tplate localFilePath is %s", com.huawei.openalliance.ad.utils.ds.a(strA));
            return new CheckResult(true, str2, strA, strV);
        }
        hw.b("ContentProcessor", "checkFileExistInTplate is FilePath is invalid : %s.", str);
        com.huawei.openalliance.ad.utils.ai.a(this.d, str2, Constants.TPLATE_CACHE);
        return new CheckResult(false, str2, strA);
    }

    public oz(Context context, boolean z, int i) {
        hw.b("ContentProcessor", "ContentProcessor - isPreContent: %s", Boolean.valueOf(z));
        this.d = context.getApplicationContext();
        this.f19941b = z;
        this.f = fi.a(context);
        this.g = fp.b(context);
        this.f19942c = ew.a(context);
        this.h = new com.huawei.openalliance.ad.analysis.c(context);
        this.f19940a = i;
        this.e = ey.a(context);
    }
}
