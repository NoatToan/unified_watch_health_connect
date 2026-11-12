package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
class d0 {
    public int a = 0;
    public String b = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return !TextUtils.isEmpty(d0Var.b) && d0Var.b.equals(this.b);
    }
}
