package com.miui.tsmclient.model;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.common.mvp.IModel;
import com.miui.tsmclient.common.mvp.OnModelChangedListener;
import com.miui.tsmclient.util.EnvironmentConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class BaseModel implements IModel {
    public static final int DATA_ID_ERROR = Integer.MAX_VALUE;
    private WeakReference<Context> mContextRef;
    private ExecutorService mExecutor = Executors.newCachedThreadPool();
    private OnModelChangedListener mListener;

    public static <T extends BaseModel> T create(Context context, Class<T> cls) {
        try {
            T tNewInstance = cls.newInstance();
            tNewInstance.init(context, null);
            return tNewInstance;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference != null ? weakReference.get() : null;
        return context == null ? EnvironmentConfig.getContext() : context;
    }

    @Override // com.miui.tsmclient.common.mvp.IModel
    public void init(Context context, OnModelChangedListener onModelChangedListener) {
        this.mContextRef = new WeakReference<>(context);
        this.mListener = onModelChangedListener;
        onInit();
    }

    public final void notifyChanged(int i) {
        notifyChanged(i, null);
    }

    public void onInit() {
    }

    public void onRelease() {
    }

    @Override // com.miui.tsmclient.common.mvp.IModel
    public void release() {
        this.mListener = null;
        onRelease();
        this.mExecutor.shutdownNow();
    }

    public void runOnBackground(Runnable runnable) {
        this.mExecutor.submit(runnable);
    }

    public final void notifyChanged(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        OnModelChangedListener onModelChangedListener = this.mListener;
        if (onModelChangedListener != null) {
            onModelChangedListener.onModelChanged(i, bundle);
        }
    }
}
