package com.huawei.openalliance.ad;

import android.content.Context;
import android.util.Log;
import com.huawei.openalliance.ad.beans.metadata.Template;
import com.huawei.openalliance.ad.db.bean.TemplateRecord;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class qb implements rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20120a = "qb";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gl f20121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20122c;

    @Override // com.huawei.openalliance.ad.rh
    public void a(List<Template> list) {
        if (list == null || list.isEmpty()) {
            Log.i(f20120a, "templates is empty, don't need to save");
            return;
        }
        Iterator<Template> it = list.iterator();
        while (it.hasNext()) {
            TemplateRecord templateRecordA = pn.a(it.next());
            if (templateRecordA != null) {
                this.f20121b.a(templateRecordA);
            }
        }
    }

    public qb(Context context) {
        this.f20122c = context.getApplicationContext();
        this.f20121b = fs.a(context);
    }
}
