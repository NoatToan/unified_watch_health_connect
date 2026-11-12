package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ez extends es implements gb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18739c = new byte[0];

    @Override // com.huawei.openalliance.ad.gb
    public void a(String str, String str2, String str3) {
        hw.b("ContentTemplateRecordDao", "deleteContentByIds ids: %s %s, reason: %s", str, str2, str3);
        a(ContentTemplateRecord.class, fq.CONTENT_TEMPLATE_RECORD_BY_IDS, new String[]{str, str2});
    }

    @Override // com.huawei.openalliance.ad.gb
    public void a(ContentTemplateRecord contentTemplateRecord) {
        if (contentTemplateRecord == null) {
            return;
        }
        synchronized (f18739c) {
            if (a(contentTemplateRecord.a(), contentTemplateRecord.b()) != null) {
                a(ContentTemplateRecord.class, contentTemplateRecord.d(this.f18718a), fq.CONTENT_TEMPLATE_RECORD_BY_IDS, new String[]{contentTemplateRecord.a(), contentTemplateRecord.b()});
            } else {
                b(contentTemplateRecord);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gb
    public ContentTemplateRecord a(String str, String str2) {
        List listA = a(ContentTemplateRecord.class, null, fq.CONTENT_TEMPLATE_RECORD_BY_IDS, new String[]{str, str2}, null, null);
        if (listA.isEmpty()) {
            return null;
        }
        return (ContentTemplateRecord) listA.get(0);
    }

    private void b(ContentTemplateRecord contentTemplateRecord) {
        a(ContentTemplateRecord.class, contentTemplateRecord.d(this.f18718a));
    }

    public static ez a(Context context) {
        return new ez(context);
    }

    protected ez(Context context) {
        super(context);
    }
}
