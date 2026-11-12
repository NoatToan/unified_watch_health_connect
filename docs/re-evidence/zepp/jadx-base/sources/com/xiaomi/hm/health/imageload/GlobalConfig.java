package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes21.dex */
public enum GlobalConfig {
    INSTANCE;

    private int mCacheMaxSize;
    private Context mContext;
    private ILoader mLoader;
    private int mWinHeight;
    private int mWinWidth;

    public ILoader getLoader() {
        if (this.mLoader == null) {
            this.mLoader = new GlideLoader();
        }
        return this.mLoader;
    }

    public void init(Context context, int i, HMImageLoader.MemoryCategory memoryCategory, boolean z) {
        this.mContext = context;
        this.mCacheMaxSize = i;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.mWinWidth = windowManager.getDefaultDisplay().getWidth();
        this.mWinHeight = windowManager.getDefaultDisplay().getHeight();
        getLoader().init(context, i, memoryCategory, z);
    }
}
