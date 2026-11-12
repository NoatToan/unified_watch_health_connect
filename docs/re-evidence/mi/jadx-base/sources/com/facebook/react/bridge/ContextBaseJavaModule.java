package com.facebook.react.bridge;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContextBaseJavaModule extends BaseJavaModule {
    private final Context mContext;

    public ContextBaseJavaModule(Context context) {
        this.mContext = context;
    }

    public final Context getContext() {
        return this.mContext;
    }
}
