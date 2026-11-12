package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;

/* JADX INFO: loaded from: classes18.dex */
public final class bm extends bp {
    private Context c;
    private boolean d;
    private int e;
    private int f;
    private String b = "iKey";
    private int g = 0;

    public bm(Context context, boolean z, int i, int i2, String str) {
        a(context, z, i, i2, str, 0);
    }

    public bm(Context context, boolean z, int i, int i2, String str, int i3) {
        a(context, z, i, i2, str, i3);
    }

    private void a(Context context, boolean z, int i, int i2, String str, int i3) {
        this.c = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.b = str;
        this.g = i3;
    }

    @Override // com.loc.bp
    public final void a(int i) {
        if (n.q(this.c) == 1) {
            return;
        }
        String strA = u.a(System.currentTimeMillis(), "yyyyMMdd");
        String strA2 = z.a(this.c, this.b);
        if (!TextUtils.isEmpty(strA2)) {
            String[] strArrSplit = strA2.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2) {
                z.b(this.c, this.b);
            } else if (strA.equals(strArrSplit[0])) {
                i += Integer.parseInt(strArrSplit[1]);
            }
        }
        z.a(this.c, this.b, strA + AESEncryptionHelper.SEPARATOR + i);
    }

    @Override // com.loc.bp
    public final boolean a() {
        if (n.q(this.c) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String strA = z.a(this.c, this.b);
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return !u.a(System.currentTimeMillis(), "yyyyMMdd").equals(strArrSplit[0]) || Integer.parseInt(strArrSplit[1]) < this.f;
        }
        z.b(this.c, this.b);
        return true;
    }

    @Override // com.loc.bp
    public final int b() {
        int i;
        int i2 = Integer.MAX_VALUE;
        if ((n.q(this.c) != 1 && (i = this.e) > 0) || ((i = this.g) > 0 && i < Integer.MAX_VALUE)) {
            i2 = i;
        }
        bp bpVar = this.a;
        return bpVar != null ? Math.max(i2, bpVar.b()) : i2;
    }
}
