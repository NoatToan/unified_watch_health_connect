package com.xmlywind.sdk.videoAd;

import android.os.Handler;
import com.xmlywind.sdk.common.utils.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
class c extends com.xmlywind.sdk.common.b.b {
    private final h a;
    private final a c;

    public c(h hVar, a aVar, Handler handler) {
        super(handler);
        m.a.a(hVar);
        m.a.a(aVar);
        this.a = hVar;
        this.c = aVar;
        ArrayList arrayList = new ArrayList();
        com.xmlywind.sdk.base.common.e.a aVar2 = com.xmlywind.sdk.base.common.e.a.QUARTILE_EVENT;
        arrayList.add(new e(aVar2, com.xmlywind.sdk.base.common.a.AD_START, 0.0f));
        arrayList.add(new e(aVar2, com.xmlywind.sdk.base.common.a.AD_PLAY_QUARTER, 0.25f));
        arrayList.add(new e(aVar2, com.xmlywind.sdk.base.common.a.AD_PLAY_TWO_QUARTERS, 0.5f));
        arrayList.add(new e(aVar2, com.xmlywind.sdk.base.common.a.AD_PLAY_THREE_QUARTERS, 0.75f));
        aVar.a(arrayList);
    }

    @Override // com.xmlywind.sdk.common.b.b
    public void a() {
        int iQ = this.a.q();
        int iR = this.a.r();
        if (iQ > 0) {
            if (this.a.u()) {
                this.a.b(false);
            }
            this.a.v();
            if (iR + 1000 < iQ && this.a.n()) {
                this.a.t();
            }
            if (this.a.o()) {
                this.a.p();
            }
            for (com.xmlywind.sdk.base.common.e eVar : this.c.a(iR, iQ)) {
                this.a.a(eVar.o());
                eVar.k();
            }
            if (iR > iQ) {
                this.a.a(true);
            }
        }
    }
}
