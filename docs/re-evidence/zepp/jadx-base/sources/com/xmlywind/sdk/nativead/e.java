package com.xmlywind.sdk.nativead;

import android.content.Context;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public class e implements com.xmlywind.sdk.base.common.v {
    private final HashSet<d> a;
    private int b = 0;
    private BaseAdUnit c = null;
    private String d = "";
    private int e = 0;

    public e(Context context) {
        HashSet<d> hashSet = new HashSet<>();
        this.a = hashSet;
        hashSet.add(new d());
    }

    @Override // com.xmlywind.sdk.base.common.v
    public void a() {
        Iterator<d> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.c);
            this.c.setSessionManager(null);
            this.c = null;
        }
    }

    @Override // com.xmlywind.sdk.base.common.v
    public void a(Context context, BaseAdUnit baseAdUnit) {
        Iterator<d> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(context, baseAdUnit);
            this.c = baseAdUnit;
            baseAdUnit.setSessionManager(this);
        }
    }

    @Override // com.xmlywind.sdk.base.common.v
    public void a(com.xmlywind.sdk.base.common.a aVar, int i) {
        Iterator<d> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.c, aVar, i);
        }
    }
}
