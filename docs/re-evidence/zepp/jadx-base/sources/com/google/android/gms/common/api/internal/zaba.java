package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zaba {
    private static final ExecutorService a = zao.zaa().zaa(2, new NumberedThreadFactory("GAC_Executor"), com.google.android.gms.internal.base.zap.zab);

    public static ExecutorService zaa() {
        return a;
    }
}
