package com.xmlywind.sdk.a;

import android.content.Context;
import com.xmlywind.sdk.base.common.f;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.utils.m;
import com.xmlywind.sdk.common.utils.q;

/* JADX INFO: loaded from: classes22.dex */
public class c extends f {
    public static c c(BaseAdUnit baseAdUnit) {
        c cVar = new c();
        cVar.b(baseAdUnit);
        return cVar;
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void a(Context context, q qVar, q qVar2, com.xmlywind.sdk.base.a aVar, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
        t.a(PointCategory.DRIFT, "click", baseAdUnit);
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_CLICK);
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void b(Context context, int i, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
        t.a("close", (String) null, baseAdUnit);
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void b(BaseAdUnit baseAdUnit) {
        super.b(baseAdUnit);
    }
}
