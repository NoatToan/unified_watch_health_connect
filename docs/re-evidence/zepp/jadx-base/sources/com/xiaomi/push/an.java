package com.xiaomi.push;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class an {
    private int a;

    public an(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public abstract String a(Context context, String str, List<x> list);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3505a(Context context, String str, List<x> list) {
        return true;
    }
}
