package com.miui.tsmclient.common.mvp;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public interface IModel {
    void init(Context context, OnModelChangedListener onModelChangedListener);

    void release();
}
