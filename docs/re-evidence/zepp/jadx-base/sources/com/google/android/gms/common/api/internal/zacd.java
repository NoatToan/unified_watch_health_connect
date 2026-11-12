package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zacd {
    private static final ExecutorService a = zao.zaa().zaa(new NumberedThreadFactory("GAC_Transform"), com.google.android.gms.internal.base.zap.zaa);

    public static ExecutorService zaa() {
        return a;
    }
}
