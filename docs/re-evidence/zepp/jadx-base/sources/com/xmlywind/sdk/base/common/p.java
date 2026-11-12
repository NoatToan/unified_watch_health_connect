package com.xmlywind.sdk.base.common;

import android.content.Context;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public class p implements v {
    private final Set<o> a;
    private BaseAdUnit b;

    public p(Context context) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(new u());
    }

    @Override // com.xmlywind.sdk.base.common.v
    public void a() {
        SigmobLog.d("endDisplaySession() called");
        Iterator<o> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.b);
        }
    }

    public void a(int i, int i2) {
        SigmobLog.d("onVideoPrepared() called  mDuration = [" + i + "]");
        Iterator<o> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.b, i, i2);
        }
    }

    @Override // com.xmlywind.sdk.base.common.v
    public void a(Context context, BaseAdUnit baseAdUnit) {
        this.b = baseAdUnit;
        Iterator<o> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(context, baseAdUnit, (String) null);
            baseAdUnit.setSessionManager(this);
        }
    }

    public void a(Context context, BaseAdUnit baseAdUnit, String str) {
        this.b = baseAdUnit;
        Iterator<o> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(context, baseAdUnit, str);
            baseAdUnit.setSessionManager(this);
        }
    }

    @Override // com.xmlywind.sdk.base.common.v
    public void a(a aVar, int i) {
        SigmobLog.d("startDeferredDisplaySession() called");
        Iterator<o> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.b, aVar, i);
        }
    }

    public void a(boolean z, int i) {
        Iterator<o> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.b, z, i);
        }
    }
}
