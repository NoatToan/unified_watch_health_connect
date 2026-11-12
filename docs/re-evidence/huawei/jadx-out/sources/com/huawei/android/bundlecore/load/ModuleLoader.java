package com.huawei.android.bundlecore.load;

import android.content.Context;
import com.huawei.haf.dynamic.DynamicLoaderException;
import com.huawei.haf.dynamic.DynamicResourcesLoader;
import defpackage.bbq;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ModuleLoader {
    protected static final String TAG = "Bundle_ModuleLoader";

    public abstract ClassLoader loadCode(String str, List<String> list, File file, File file2, List<String> list2) throws bbq;

    public abstract void unloadCode(String str, ClassLoader classLoader) throws bbq;

    public void loadResources(Context context, String str) throws bbq {
        try {
            DynamicResourcesLoader.c(context, context.getResources(), Collections.singletonList(str));
        } catch (DynamicLoaderException e) {
            throw new bbq(-21, e);
        }
    }
}
