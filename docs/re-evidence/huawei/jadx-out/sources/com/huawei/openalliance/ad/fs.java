package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.TemplateRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fs extends es implements gl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fs f18822c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = new byte[0];

    @Override // com.huawei.openalliance.ad.es
    public void e() {
        super.e();
        a(TemplateRecord.class, (fq) null, (String[]) null);
    }

    @Override // com.huawei.openalliance.ad.gl
    public void a(TemplateRecord templateRecord) {
        synchronized (e) {
            String strA = templateRecord.a();
            if (a(strA) == null) {
                a(TemplateRecord.class, templateRecord.d(this.f18718a));
            } else {
                a(TemplateRecord.class, templateRecord.d(this.f18718a), fq.TEMPLATE_BY_ID_WHERE, new String[]{strA});
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gl
    public List<String> a() {
        return a(a(TemplateRecord.class, new String[]{"templateId"}, null, null, null, null));
    }

    public TemplateRecord a(String str) {
        List listA = a(TemplateRecord.class, null, fq.TEMPLATE_BY_ID_WHERE, new String[]{str}, null, null);
        if (listA.isEmpty()) {
            return null;
        }
        return (TemplateRecord) listA.get(0);
    }

    private List<String> a(List<TemplateRecord> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TemplateRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public static fs a(Context context) {
        fs fsVar;
        synchronized (d) {
            if (f18822c == null) {
                f18822c = new fs(context);
            }
            fsVar = f18822c;
        }
        return fsVar;
    }

    protected fs(Context context) {
        super(context);
    }
}
