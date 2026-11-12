package com.loc;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public abstract class q extends au {
    @Override // com.loc.au
    public String d() {
        if (TextUtils.isEmpty(c())) {
            return c();
        }
        String strC = c();
        Uri uri = Uri.parse(strC);
        if (uri.getAuthority().startsWith("dualstack-")) {
            return strC;
        }
        return uri.buildUpon().authority("dualstack-" + uri.getAuthority()).build().toString();
    }

    @Override // com.loc.au
    public final boolean i() {
        return true;
    }
}
