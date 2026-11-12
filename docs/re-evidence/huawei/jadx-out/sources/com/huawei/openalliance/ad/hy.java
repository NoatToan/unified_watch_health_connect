package com.huawei.openalliance.ad;

import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public final class hy extends hu {
    @Override // com.huawei.openalliance.ad.ib
    public void a(id idVar, int i, String str) {
        if (idVar == null) {
            return;
        }
        a(idVar.b(), i, str);
        if (this.f18928a != null) {
            this.f18928a.a(idVar, i, str);
        }
    }

    @Override // com.huawei.openalliance.ad.ib
    public ib a(String str, String str2) {
        if (this.f18928a != null) {
            this.f18928a.a(str, str2);
        }
        return this;
    }

    private void a(String str, int i, String str2) {
        if (str == null) {
            return;
        }
        if (i == 3) {
            Log.d(str2, str);
            return;
        }
        if (i == 4) {
            Log.i(str2, str);
            return;
        }
        if (i == 5) {
            Log.w(str2, str);
        } else if (i != 6) {
            Log.i(str2, str);
        } else {
            Log.e(str2, str);
        }
    }

    public static ib a() {
        return new hy();
    }

    private hy() {
    }
}
