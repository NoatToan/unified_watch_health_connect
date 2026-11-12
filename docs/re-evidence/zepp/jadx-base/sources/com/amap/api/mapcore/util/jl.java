package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class jl extends jo {
    private String a;
    private Context b;
    private boolean d;
    private int e;
    private int f;
    private int g;

    public jl(Context context, boolean z, int i, int i2, String str, int i3) {
        this.a = "iKey";
        this.g = 0;
        this.b = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.a = str;
        this.g = i3;
    }

    @Override // com.amap.api.mapcore.util.jo
    public final int a() {
        int i;
        int i2 = Integer.MAX_VALUE;
        if ((gn.p(this.b) != 1 && (i = this.e) > 0) || ((i = this.g) > 0 && i < Integer.MAX_VALUE)) {
            i2 = i;
        }
        jo joVar = this.c;
        return joVar != null ? Math.max(i2, joVar.a()) : i2;
    }

    @Override // com.amap.api.mapcore.util.jo
    public final void a_(int i) {
        if (gn.p(this.b) == 1) {
            return;
        }
        String strA = gu.a(System.currentTimeMillis(), "yyyyMMdd");
        String strA2 = hl.a(this.b, this.a);
        if (!TextUtils.isEmpty(strA2)) {
            String[] strArrSplit = strA2.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2) {
                hl.b(this.b, this.a);
            } else if (strA.equals(strArrSplit[0])) {
                i += Integer.parseInt(strArrSplit[1]);
            }
        }
        hl.a(this.b, this.a, strA + AESEncryptionHelper.SEPARATOR + i);
    }

    @Override // com.amap.api.mapcore.util.jo
    public final boolean c() {
        if (gn.p(this.b) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String strA = hl.a(this.b, this.a);
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return !gu.a(System.currentTimeMillis(), "yyyyMMdd").equals(strArrSplit[0]) || Integer.parseInt(strArrSplit[1]) < this.f;
        }
        hl.b(this.b, this.a);
        return true;
    }
}
