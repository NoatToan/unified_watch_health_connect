package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.CheckResult;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pv implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<ContentRecord> f20084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f20085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected fz f20086c;
    protected fz d;
    protected Context e;
    private List<String> f;
    private List<String> g;
    private rb h;
    private rb i;

    @Override // com.huawei.openalliance.ad.rf
    public void d() {
        hw.b("ResponseProcessor", "trimAllContents");
        this.h.b();
        this.i.b();
    }

    @Override // com.huawei.openalliance.ad.rf
    public void c() {
        if (com.huawei.openalliance.ad.utils.bm.a(this.g)) {
            hw.b("ResponseProcessor", "todayNoShowContentIds is empty");
            return;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.g(com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentRecord.FC_CTRL_DATE);
        for (String str : this.g) {
            this.f20086c.a(contentRecord, arrayList, str);
            this.d.a(contentRecord, arrayList, str);
        }
    }

    @Override // com.huawei.openalliance.ad.rf
    public void b(List<String> list) {
        this.g = list;
    }

    @Override // com.huawei.openalliance.ad.rf
    public void b() {
        this.h.a();
        this.i.a();
    }

    @Override // com.huawei.openalliance.ad.rf
    public void a(List<String> list) {
        this.f = list;
    }

    protected void a(String str, String str2, String str3) {
        com.huawei.openalliance.ad.utils.w.a(this.e, str, str2, str3);
    }

    @Override // com.huawei.openalliance.ad.rf
    public void a(Integer num) {
        this.h.a(num);
    }

    @Override // com.huawei.openalliance.ad.rf
    public void a(ContentRecord contentRecord, String str) {
        b(contentRecord, str);
    }

    @Override // com.huawei.openalliance.ad.rf
    public void a(ImageInfo imageInfo, ContentRecord contentRecord, long j) {
        this.h.a(imageInfo, contentRecord, j);
    }

    @Override // com.huawei.openalliance.ad.rf
    public void a() {
        if (com.huawei.openalliance.ad.utils.bm.a(this.f)) {
            hw.b("ResponseProcessor", "invalidContentIds is empty");
            return;
        }
        for (String str : this.f) {
            this.h.a(str);
            this.i.a(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    @Override // com.huawei.openalliance.ad.rf
    public ContentRecord a(ContentRecord contentRecord, int i, long j, byte[] bArr, int i2) {
        rb rbVar;
        rb rbVar2;
        if (contentRecord == null) {
            return null;
        }
        if (contentRecord.aQ() != -1 && 2 != contentRecord.aQ()) {
            if (3 == contentRecord.aQ()) {
                rbVar = this.i;
            } else {
                rbVar2 = null;
            }
            if (rbVar2 == null) {
                return null;
            }
            ContentRecord contentRecordA = rbVar2.a(contentRecord, i, j, bArr, i2);
            hw.b("ResponseProcessor", "downloadOneContent, showContentId:%s", contentRecordA != null ? contentRecordA.o() : null);
            return contentRecordA;
        }
        rbVar = this.h;
        rbVar2 = rbVar;
        if (rbVar2 == null) {
            return null;
        }
        ContentRecord contentRecordA2 = rbVar2.a(contentRecord, i, j, bArr, i2);
        hw.b("ResponseProcessor", "downloadOneContent, showContentId:%s", contentRecordA2 != null ? contentRecordA2.o() : null);
        return contentRecordA2;
    }

    @Override // com.huawei.openalliance.ad.rf
    public ContentRecord a(ContentRecord contentRecord, int i, long j) {
        return (contentRecord.aQ() == -1 || 2 == contentRecord.aQ()) ? ew.a(this.e).a(contentRecord, i, j) : this.i.a(contentRecord, i, j);
    }

    @Override // com.huawei.openalliance.ad.rf
    public ContentRecord a(long j, int i, int i2) {
        hw.b("ResponseProcessor", "download contents start");
        if (com.huawei.openalliance.ad.utils.bm.a(this.f20084a)) {
            hw.c("ResponseProcessor", "download contents, content records is empty");
            return null;
        }
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.e);
        ContentRecord contentRecordA = null;
        for (ContentRecord contentRecord : this.f20084a) {
            if (contentRecord != null) {
                rb rbVar = (contentRecord.aQ() == -1 || 2 == contentRecord.aQ()) ? this.h : 3 == contentRecord.aQ() ? this.i : null;
                if (rbVar != null) {
                    contentRecordA = rbVar.a(contentRecord, i, j, bArrB, i2);
                }
            }
        }
        StringBuilder sb = new StringBuilder("download contents end, showContentId:");
        sb.append(contentRecordA != null ? contentRecordA.o() : null);
        hw.b("ResponseProcessor", sb.toString());
        return contentRecordA;
    }

    @Override // com.huawei.openalliance.ad.rf
    public CheckResult a(ContentRecord contentRecord) {
        return ((contentRecord.aQ() == -1 || contentRecord.aQ() != 3) ? this.h : this.i).b(contentRecord);
    }

    private void b(ContentRecord contentRecord, String str) {
        String strAp;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add("_id");
        arrayList.add(ContentRecord.DISPLAY_COUNT);
        arrayList.add(ContentRecord.DISPLAY_DATE);
        arrayList.add(ContentRecord.SPLASH_MEDIA_PATH);
        arrayList.add(ContentRecord.LAST_SHOW_TIME);
        arrayList.add(ContentRecord.FC_CTRL_DATE);
        hw.b("ResponseProcessor", "updateContentByIdInner, uniqueId: %s", contentRecord.ac());
        if (contentRecord.aQ() != -1 && 2 != contentRecord.aQ()) {
            if (3 == contentRecord.aQ()) {
                this.d.d(contentRecord, arrayList);
                strAp = contentRecord.ap();
                str2 = Constants.TPLATE_CACHE;
            }
            a(str, contentRecord.ap(), "ar");
        }
        this.f20086c.d(contentRecord, arrayList);
        strAp = contentRecord.ap();
        str2 = "normal";
        a(str, strAp, str2);
        a(str, contentRecord.ap(), "ar");
    }

    public pv(Context context, boolean z, int i) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.h = new oz(applicationContext, z, i);
        this.i = new qa(this.e, z);
    }

    public pv(Context context, List<ContentRecord> list, boolean z, int i) {
        hw.b("ResponseProcessor", "ResponseProcessor - content records size: %d isPreContent: %s", Integer.valueOf(list != null ? list.size() : 0), Boolean.valueOf(z));
        this.e = context.getApplicationContext();
        this.f20084a = list;
        this.f20086c = ew.a(context);
        this.d = ex.b(context);
        this.f20085b = i;
        this.h = new oz(context, z, i);
        this.i = new qa(context, z);
    }

    public pv() {
    }
}
