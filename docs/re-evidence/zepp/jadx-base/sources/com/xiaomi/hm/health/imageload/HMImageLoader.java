package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes21.dex */
public class HMImageLoader {
    private static final int a = 250;

    public enum MemoryCategory {
        LOW,
        NORMAL,
        HIGH
    }

    private HMImageLoader() {
    }

    public static void clearMemory(Context context) {
        getActualLoader().clearMemory(context);
    }

    public static ILoader getActualLoader() {
        return GlobalConfig.INSTANCE.getLoader();
    }

    public static void init(Context context) {
        init(context, 250);
    }

    public static void onLowMemory(Context context) {
        getActualLoader().onLowMemory(context);
    }

    public static void onTrimMemory(Context context, int i) {
        getActualLoader().onTrimMemory(context, i);
    }

    @Deprecated
    public static DisplayConfig.ConfigBuilder with(Context context) {
        return new DisplayConfig.ConfigBuilder(context);
    }

    public static void init(Context context, int i) {
        init(context, i, MemoryCategory.NORMAL);
    }

    @Deprecated
    public static DisplayConfig.ConfigBuilder with(FragmentActivity fragmentActivity) {
        return new DisplayConfig.ConfigBuilder(fragmentActivity);
    }

    public static void init(Context context, int i, MemoryCategory memoryCategory) {
        init(context, i, memoryCategory, true);
    }

    @Deprecated
    public static DisplayConfig.ConfigBuilder with(Fragment fragment) {
        return new DisplayConfig.ConfigBuilder(fragment);
    }

    public static void init(Context context, int i, MemoryCategory memoryCategory, boolean z) {
        GlobalConfig.INSTANCE.init(context, i, memoryCategory, z);
    }

    @Deprecated
    public static DisplayConfig.ConfigBuilder with(View view) {
        return new DisplayConfig.ConfigBuilder(view);
    }
}
