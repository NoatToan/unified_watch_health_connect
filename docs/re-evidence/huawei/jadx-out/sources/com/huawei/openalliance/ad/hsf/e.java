package com.huawei.openalliance.ad.hsf;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e implements g {

    public interface a {
        void a();

        void a(int i);

        void b(int i);
    }

    public abstract void a();

    public abstract boolean b();

    public static e a(Context context, a aVar) {
        return new f(context.getApplicationContext(), aVar);
    }
}
